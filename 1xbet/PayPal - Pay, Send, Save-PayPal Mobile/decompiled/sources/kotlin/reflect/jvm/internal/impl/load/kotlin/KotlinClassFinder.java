package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public interface KotlinClassFinder extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder {
    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion);

    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion);

    public static abstract class Result {
        private Result() {
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass kotlinClass = this instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass ? (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass) this : null;
            if (kotlinClass != null) {
                return kotlinClass.getKotlinJvmBinaryClass();
            }
            return null;
        }

        public static final class KotlinClass extends kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result {
            private final byte[] Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getHighSpeedVideoFpsRangesFor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
                this.getHighSpeedVideoFpsRangesFor = kotlinJvmBinaryClass;
                this.Camera2StreamConfigurationMap = bArr;
            }

            public /* synthetic */ KotlinClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass, (i & 2) != 0 ? null : bArr);
            }

            public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.getHighSpeedVideoFpsRangesFor;
            }
        }

        public static final class ClassFileContent extends kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result {
            private final byte[] getHighResolutionOutputSizeshNQ4ISI;

            public final byte[] getContent() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
