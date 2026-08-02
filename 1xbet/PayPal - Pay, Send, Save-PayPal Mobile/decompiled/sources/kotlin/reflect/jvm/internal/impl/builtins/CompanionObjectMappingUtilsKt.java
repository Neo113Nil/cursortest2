package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes5.dex */
public final class CompanionObjectMappingUtilsKt {
    public static final boolean isMappedIntrinsicCompanionObject(kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping companionObjectMapping, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionObjectMapping, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(classDescriptor)) {
            return false;
        }
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> classIds = companionObjectMapping.getClassIds();
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(classDescriptor);
        return kotlin.collections.CollectionsKt.contains(classIds, classId != null ? classId.getOuterClassId() : null);
    }
}
