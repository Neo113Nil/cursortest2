package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* loaded from: classes5.dex */
public class ExtensionReceiver extends kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.AbstractReceiverValue implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitReceiver {
    private final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionReceiver(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        if (callableDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        this.getHighSpeedVideoFpsRanges = callableDescriptor;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getType());
        sb.append(": Ext {");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i == 2) {
            throw new java.lang.IllegalStateException(format);
        }
    }
}
