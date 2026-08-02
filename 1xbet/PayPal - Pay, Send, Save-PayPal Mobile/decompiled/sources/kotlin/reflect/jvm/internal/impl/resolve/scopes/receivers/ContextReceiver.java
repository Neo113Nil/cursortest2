package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* loaded from: classes5.dex */
public final class ContextReceiver extends kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.AbstractReceiverValue implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver {
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        this.getHighSpeedVideoFpsRangesFor = callableDescriptor;
        this.getHighResolutionOutputSizeshNQ4ISI = name2;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getDeclarationDescriptor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public final kotlin.reflect.jvm.internal.impl.name.Name getCustomLabelName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cxt { ");
        sb.append(getDeclarationDescriptor());
        sb.append(" }");
        return sb.toString();
    }
}
