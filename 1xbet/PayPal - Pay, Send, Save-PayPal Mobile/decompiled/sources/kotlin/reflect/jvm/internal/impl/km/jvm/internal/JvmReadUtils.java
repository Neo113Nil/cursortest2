package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes5.dex */
public final class JvmReadUtils {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmReadUtils INSTANCE = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmReadUtils();

    private JvmReadUtils() {
    }

    private static boolean getHighSpeedVideoSizes(kotlin.Metadata metadata) {
        return new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(metadata.mv()).compareTo(new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(1, 4, 0)) < 0;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmClass readKmClass$kotlin_metadata_jvm(kotlin.Metadata metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> readClassDataFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExceptionUtilsKt.requireNotEmpty(metadata), metadata.d2());
        return kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.toKmClass$default(readClassDataFrom.component2(), readClassDataFrom.component1(), getHighSpeedVideoSizes(metadata), null, 4, null);
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmPackage readKmPackage$kotlin_metadata_jvm(kotlin.Metadata metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> readPackageDataFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExceptionUtilsKt.requireNotEmpty(metadata), metadata.d2());
        return kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.toKmPackage$default(readPackageDataFrom.component2(), readPackageDataFrom.component1(), getHighSpeedVideoSizes(metadata), null, 4, null);
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmLambda readKmLambda$kotlin_metadata_jvm(kotlin.Metadata metadata) {
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> readFunctionDataFrom;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        java.lang.String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 == null || (readFunctionDataFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(d1, metadata.d2())) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.toKmLambda(readFunctionDataFrom.component2(), readFunctionDataFrom.component1(), getHighSpeedVideoSizes(metadata));
    }

    public final void throwIfNotCompatible$kotlin_metadata_jvm(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion, boolean z) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        boolean isAtLeast = metadataVersion.isAtLeast(1, 1, 0);
        if (z ? isAtLeast : metadataVersion.isCompatibleWithCurrentCompilerVersion()) {
            return;
        }
        if (!isAtLeast) {
            str = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("while maximum supported version is ");
            sb.append(metadataVersion.isStrictSemantics() ? kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE : kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE_NEXT);
            sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
            str = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Provided Metadata instance has version ");
        sb2.append(metadataVersion);
        sb2.append(", ");
        sb2.append(str);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public final kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata readMetadataImpl$kotlin_metadata_jvm(kotlin.Metadata metadata, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        if (metadata.mv().length == 0) {
            throw new java.lang.IllegalArgumentException("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
        }
        throwIfNotCompatible$kotlin_metadata_jvm(new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0), z);
        try {
            int k = metadata.k();
            if (k == 1) {
                return new kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.Class(metadata, z);
            }
            if (k == 2) {
                return new kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.FileFacade(metadata, z);
            }
            if (k == 3) {
                return new kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.SyntheticClass(metadata, z);
            }
            if (k == 4) {
                return new kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.MultiFileClassFacade(metadata, z);
            }
            if (k == 5) {
                return new kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.MultiFileClassPart(metadata, z);
            }
            return new kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.Unknown(metadata, z);
        } finally {
        }
    }
}
