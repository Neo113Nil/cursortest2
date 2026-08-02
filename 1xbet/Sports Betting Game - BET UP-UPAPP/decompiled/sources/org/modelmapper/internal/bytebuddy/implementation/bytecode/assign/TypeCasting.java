package org.modelmapper.internal.bytebuddy.implementation.bytecode.assign;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class TypeCasting implements StackManipulation {
    private final TypeDescription typeDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((TypeCasting) obj).typeDescription);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    protected TypeCasting(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }

    public static StackManipulation to(TypeDefinition typeDefinition) {
        if (typeDefinition.isPrimitive()) {
            throw new IllegalArgumentException("Cannot cast to primitive type: " + typeDefinition);
        }
        return new TypeCasting(typeDefinition.asErasure());
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitTypeInsn(192, this.typeDescription.getInternalName());
        return StackSize.ZERO.toIncreasingSize();
    }
}
