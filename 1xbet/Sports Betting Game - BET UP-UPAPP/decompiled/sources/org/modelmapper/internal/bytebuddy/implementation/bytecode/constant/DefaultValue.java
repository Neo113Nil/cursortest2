package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;

/* loaded from: classes4.dex */
public enum DefaultValue implements StackManipulation {
    INTEGER(IntegerConstant.ZERO),
    LONG(LongConstant.ZERO),
    FLOAT(FloatConstant.ZERO),
    DOUBLE(DoubleConstant.ZERO),
    VOID(StackManipulation.Trivial.INSTANCE),
    REFERENCE(NullConstant.INSTANCE);

    private final StackManipulation stackManipulation;

    DefaultValue(StackManipulation stackManipulation) {
        this.stackManipulation = stackManipulation;
    }

    public static StackManipulation of(TypeDefinition typeDefinition) {
        if (typeDefinition.isPrimitive()) {
            if (typeDefinition.represents(Long.TYPE)) {
                return LONG;
            }
            if (typeDefinition.represents(Double.TYPE)) {
                return DOUBLE;
            }
            if (typeDefinition.represents(Float.TYPE)) {
                return FLOAT;
            }
            if (typeDefinition.represents(Void.TYPE)) {
                return VOID;
            }
            return INTEGER;
        }
        return REFERENCE;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return this.stackManipulation.isValid();
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        return this.stackManipulation.apply(methodVisitor, context);
    }
}
