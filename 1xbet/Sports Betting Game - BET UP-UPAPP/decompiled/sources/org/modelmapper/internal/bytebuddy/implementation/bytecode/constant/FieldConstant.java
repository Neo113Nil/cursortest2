package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import java.lang.reflect.Field;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;

/* loaded from: classes4.dex */
public class FieldConstant implements StackManipulation {
    private final FieldDescription.InDefinedShape fieldDescription;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    public FieldConstant(FieldDescription.InDefinedShape inDefinedShape) {
        this.fieldDescription = inDefinedShape;
    }

    public StackManipulation cached() {
        return new Cached(this);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        try {
            return new StackManipulation.Compound(ClassConstant.of(this.fieldDescription.getDeclaringType()), new TextConstant(this.fieldDescription.getInternalName()), MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(Class.class.getMethod("getDeclaredField", String.class)))).apply(methodVisitor, context);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Cannot locate Class::getDeclaredField", e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.fieldDescription.equals(((FieldConstant) obj).fieldDescription);
    }

    public int hashCode() {
        return this.fieldDescription.hashCode();
    }

    protected static class Cached implements StackManipulation {
        private final StackManipulation fieldConstant;

        public Cached(StackManipulation stackManipulation) {
            this.fieldConstant = stackManipulation;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return this.fieldConstant.isValid();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return FieldAccess.forField(context.cache(this.fieldConstant, TypeDescription.ForLoadedType.of(Field.class))).read().apply(methodVisitor, context);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.fieldConstant.equals(((Cached) obj).fieldConstant);
        }

        public int hashCode() {
            return this.fieldConstant.hashCode();
        }
    }
}
