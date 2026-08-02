package org.modelmapper.internal.bytebuddy.implementation.bytecode.collection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;

/* loaded from: classes4.dex */
public enum ArrayAccess {
    BYTE(51, 84, StackSize.SINGLE),
    SHORT(53, 86, StackSize.SINGLE),
    CHARACTER(52, 85, StackSize.SINGLE),
    INTEGER(46, 79, StackSize.SINGLE),
    LONG(47, 80, StackSize.DOUBLE),
    FLOAT(48, 81, StackSize.SINGLE),
    DOUBLE(49, 82, StackSize.DOUBLE),
    REFERENCE(50, 83, StackSize.SINGLE);

    private final int loadOpcode;
    private final StackSize stackSize;
    private final int storeOpcode;

    ArrayAccess(int i, int i2, StackSize stackSize) {
        this.loadOpcode = i;
        this.storeOpcode = i2;
        this.stackSize = stackSize;
    }

    public static ArrayAccess of(TypeDefinition typeDefinition) {
        if (!typeDefinition.isPrimitive()) {
            return REFERENCE;
        }
        if (typeDefinition.represents(Boolean.TYPE) || typeDefinition.represents(Byte.TYPE)) {
            return BYTE;
        }
        if (typeDefinition.represents(Short.TYPE)) {
            return SHORT;
        }
        if (typeDefinition.represents(Character.TYPE)) {
            return CHARACTER;
        }
        if (typeDefinition.represents(Integer.TYPE)) {
            return INTEGER;
        }
        if (typeDefinition.represents(Long.TYPE)) {
            return LONG;
        }
        if (typeDefinition.represents(Float.TYPE)) {
            return FLOAT;
        }
        if (typeDefinition.represents(Double.TYPE)) {
            return DOUBLE;
        }
        throw new IllegalArgumentException("Not a legal array type: " + typeDefinition);
    }

    public StackManipulation load() {
        return new Loader();
    }

    public StackManipulation store() {
        return new Putter();
    }

    public StackManipulation forEach(List<? extends StackManipulation> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<? extends StackManipulation> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(new StackManipulation.Compound(Duplication.SINGLE, IntegerConstant.forValue(i), new Loader(), it.next()));
            i++;
        }
        return new StackManipulation.Compound(arrayList);
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class Loader implements StackManipulation {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && ArrayAccess.this.equals(ArrayAccess.this);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ArrayAccess.this.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected Loader() {
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitInsn(ArrayAccess.this.loadOpcode);
            return ArrayAccess.this.stackSize.toIncreasingSize().aggregate(new StackManipulation.Size(-2, 0));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class Putter implements StackManipulation {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && ArrayAccess.this.equals(ArrayAccess.this);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ArrayAccess.this.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected Putter() {
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitInsn(ArrayAccess.this.storeOpcode);
            return ArrayAccess.this.stackSize.toDecreasingSize().aggregate(new StackManipulation.Size(-2, 0));
        }
    }
}
