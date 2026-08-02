package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public final class VisibilityUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor findMemberWithMaxVisibility(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        java.lang.Integer compare;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        collection.isEmpty();
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor = null;
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            if (callableMemberDescriptor == null || ((compare = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.compare(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && compare.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
