package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class MethodSignatureBuildingUtilsKt {
    public static final java.lang.String signature(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signatureBuildingComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return signatureBuildingComponents.signature(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.getInternalName(classDescriptor), str);
    }
}
