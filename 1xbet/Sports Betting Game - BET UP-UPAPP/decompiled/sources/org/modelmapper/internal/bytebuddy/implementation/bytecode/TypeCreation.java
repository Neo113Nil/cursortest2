package org.modelmapper.internal.bytebuddy.implementation.bytecode;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class TypeCreation implements StackManipulation {
    private final TypeDescription typeDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((TypeCreation) obj).typeDescription);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    protected TypeCreation(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }

    public static StackManipulation of(TypeDescription typeDescription) {
        if (typeDescription.isArray() || typeDescription.isPrimitive() || typeDescription.isAbstract()) {
            throw new IllegalArgumentException(typeDescription + " is not instantiable");
        }
        return new TypeCreation(typeDescription);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitTypeInsn(Opcodes.NEW, this.typeDescription.getInternalName());
        return new StackManipulation.Size(1, 1);
    }
}
