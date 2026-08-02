package org.modelmapper.internal.bytebuddy.implementation.bytecode.collection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class ArrayFactory implements CollectionFactory {
    private final ArrayCreator arrayCreator;
    private final TypeDescription.Generic componentType;

    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
    private final StackManipulation.Size sizeDecrease;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArrayFactory arrayFactory = (ArrayFactory) obj;
        return this.componentType.equals(arrayFactory.componentType) && this.arrayCreator.equals(arrayFactory.arrayCreator);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.componentType.hashCode()) * 31) + this.arrayCreator.hashCode();
    }

    protected ArrayFactory(TypeDescription.Generic generic, ArrayCreator arrayCreator) {
        this.componentType = generic;
        this.arrayCreator = arrayCreator;
        this.sizeDecrease = StackSize.DOUBLE.toDecreasingSize().aggregate(generic.getStackSize().toDecreasingSize());
    }

    public static ArrayFactory forType(TypeDescription.Generic generic) {
        return new ArrayFactory(generic, makeArrayCreatorFor(generic));
    }

    private static ArrayCreator makeArrayCreatorFor(TypeDefinition typeDefinition) {
        if (!typeDefinition.isPrimitive()) {
            return new ArrayCreator.ForReferenceType(typeDefinition.asErasure());
        }
        if (typeDefinition.represents(Boolean.TYPE)) {
            return ArrayCreator.ForPrimitiveType.BOOLEAN;
        }
        if (typeDefinition.represents(Byte.TYPE)) {
            return ArrayCreator.ForPrimitiveType.BYTE;
        }
        if (typeDefinition.represents(Short.TYPE)) {
            return ArrayCreator.ForPrimitiveType.SHORT;
        }
        if (typeDefinition.represents(Character.TYPE)) {
            return ArrayCreator.ForPrimitiveType.CHARACTER;
        }
        if (typeDefinition.represents(Integer.TYPE)) {
            return ArrayCreator.ForPrimitiveType.INTEGER;
        }
        if (typeDefinition.represents(Long.TYPE)) {
            return ArrayCreator.ForPrimitiveType.LONG;
        }
        if (typeDefinition.represents(Float.TYPE)) {
            return ArrayCreator.ForPrimitiveType.FLOAT;
        }
        if (typeDefinition.represents(Double.TYPE)) {
            return ArrayCreator.ForPrimitiveType.DOUBLE;
        }
        throw new IllegalArgumentException("Cannot create array of type " + typeDefinition);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.CollectionFactory
    public StackManipulation withValues(List<? extends StackManipulation> list) {
        return new ArrayStackManipulation(list);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.CollectionFactory
    public TypeDescription.Generic getComponentType() {
        return this.componentType;
    }

    protected interface ArrayCreator extends StackManipulation {
        public static final StackManipulation.Size ARRAY_CREATION_SIZE_CHANGE = StackSize.ZERO.toDecreasingSize();

        int getStorageOpcode();

        public enum ForPrimitiveType implements ArrayCreator {
            BOOLEAN(4, 84),
            BYTE(8, 84),
            SHORT(9, 86),
            CHARACTER(5, 85),
            INTEGER(10, 79),
            LONG(11, 80),
            FLOAT(6, 81),
            DOUBLE(7, 82);

            private final int creationOpcode;
            private final int storageOpcode;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return true;
            }

            ForPrimitiveType(int i, int i2) {
                this.creationOpcode = i;
                this.storageOpcode = i2;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitIntInsn(188, this.creationOpcode);
                return ARRAY_CREATION_SIZE_CHANGE;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator
            public int getStorageOpcode() {
                return this.storageOpcode;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForReferenceType implements ArrayCreator {
            private final String internalTypeName;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.internalTypeName.equals(((ForReferenceType) obj).internalTypeName);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator
            public int getStorageOpcode() {
                return 83;
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.internalTypeName.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return true;
            }

            protected ForReferenceType(TypeDescription typeDescription) {
                this.internalTypeName = typeDescription.getInternalName();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitTypeInsn(189, this.internalTypeName);
                return ARRAY_CREATION_SIZE_CHANGE;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class ArrayStackManipulation implements StackManipulation {
        private final List<? extends StackManipulation> stackManipulations;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ArrayStackManipulation arrayStackManipulation = (ArrayStackManipulation) obj;
            return this.stackManipulations.equals(arrayStackManipulation.stackManipulations) && ArrayFactory.this.equals(ArrayFactory.this);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulations.hashCode()) * 31) + ArrayFactory.this.hashCode();
        }

        protected ArrayStackManipulation(List<? extends StackManipulation> list) {
            this.stackManipulations = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            Iterator<? extends StackManipulation> it = this.stackManipulations.iterator();
            while (it.hasNext()) {
                if (!it.next().isValid()) {
                    return false;
                }
            }
            return ArrayFactory.this.arrayCreator.isValid();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            StackManipulation.Size aggregate = IntegerConstant.forValue(this.stackManipulations.size()).apply(methodVisitor, context).aggregate(ArrayFactory.this.arrayCreator.apply(methodVisitor, context));
            int i = 0;
            for (StackManipulation stackManipulation : this.stackManipulations) {
                methodVisitor.visitInsn(89);
                StackManipulation.Size aggregate2 = aggregate.aggregate(StackSize.SINGLE.toIncreasingSize()).aggregate(IntegerConstant.forValue(i).apply(methodVisitor, context)).aggregate(stackManipulation.apply(methodVisitor, context));
                methodVisitor.visitInsn(ArrayFactory.this.arrayCreator.getStorageOpcode());
                aggregate = aggregate2.aggregate(ArrayFactory.this.sizeDecrease);
                i++;
            }
            return aggregate;
        }
    }
}
