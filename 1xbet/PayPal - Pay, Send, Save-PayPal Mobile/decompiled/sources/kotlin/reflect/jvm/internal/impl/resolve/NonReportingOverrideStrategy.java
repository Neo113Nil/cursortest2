package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public abstract class NonReportingOverrideStrategy extends kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy {
    protected abstract void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void overrideConflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
        conflict(callableMemberDescriptor, callableMemberDescriptor2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void inheritanceConflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
        conflict(callableMemberDescriptor, callableMemberDescriptor2);
    }
}
