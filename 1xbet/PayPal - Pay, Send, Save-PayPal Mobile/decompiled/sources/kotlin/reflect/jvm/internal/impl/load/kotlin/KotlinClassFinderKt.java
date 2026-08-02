package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class KotlinClassFinderKt {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findKotlinClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(classId, metadataVersion);
        if (findKotlinClassOrContent != null) {
            return findKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findKotlinClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(javaClass, metadataVersion);
        if (findKotlinClassOrContent != null) {
            return findKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }
}
