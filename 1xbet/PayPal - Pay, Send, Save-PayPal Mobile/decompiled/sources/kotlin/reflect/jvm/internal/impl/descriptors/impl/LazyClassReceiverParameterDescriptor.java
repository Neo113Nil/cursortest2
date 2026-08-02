package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class LazyClassReceiverParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor {
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyClassReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(0);
        }
        this.getHighSpeedVideoFpsRangesFor = classDescriptor;
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver(classDescriptor, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue getValue() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver implicitClassReceiver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (implicitClassReceiver == null) {
            getHighSpeedVideoFpsRanges(1);
        }
        return implicitClassReceiver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = this.getHighSpeedVideoFpsRangesFor;
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(2);
        }
        return classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("class ");
        sb.append(this.getHighSpeedVideoFpsRangesFor.getName());
        sb.append("::this");
        return sb.toString();
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
