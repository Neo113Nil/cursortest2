package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public abstract class OverridingStrategy {
    public abstract void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor);

    public abstract void inheritanceConflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void overrideConflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2);

    public void setOverriddenDescriptors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        callableMemberDescriptor.setOverriddenDescriptors(collection);
    }
}
