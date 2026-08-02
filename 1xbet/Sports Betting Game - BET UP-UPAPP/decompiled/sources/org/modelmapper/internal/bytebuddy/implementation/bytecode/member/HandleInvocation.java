package org.modelmapper.internal.bytebuddy.implementation.bytecode.member;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.utility.JavaConstant;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class HandleInvocation implements StackManipulation {
    private static final String INVOKE_EXACT = "invokeExact";
    private static final String METHOD_HANDLE_NAME = "java/lang/invoke/MethodHandle";
    private final JavaConstant.MethodType methodType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.methodType.equals(((HandleInvocation) obj).methodType);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodType.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    public HandleInvocation(JavaConstant.MethodType methodType) {
        this.methodType = methodType;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, METHOD_HANDLE_NAME, INVOKE_EXACT, this.methodType.getDescriptor(), false);
        int size = this.methodType.getReturnType().getStackSize().getSize() - this.methodType.getParameterTypes().getStackSize();
        return new StackManipulation.Size(size, Math.max(size, 0));
    }
}
