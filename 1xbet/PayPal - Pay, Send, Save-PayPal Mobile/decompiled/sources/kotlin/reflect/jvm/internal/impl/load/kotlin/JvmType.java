package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public abstract class JvmType {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN);
    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.CHAR);
    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE);
    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getInputFormats = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.SHORT);
    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getHighSpeedVideoSizesFor = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT);
    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.FLOAT);
    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getOutputFormats = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.LONG);
    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.DOUBLE);

    private JvmType() {
    }

    public static final class Primitive extends kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType {
        private final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType getHighSpeedVideoFpsRanges;

        public Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.getHighSpeedVideoFpsRanges = jvmPrimitiveType;
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType getJvmPrimitiveType() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public static final class Object extends kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType {
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public final java.lang.String getInternalName() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public static final class Array extends kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType {
        private final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType jvmType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmType, "");
            this.getHighResolutionOutputSizeshNQ4ISI = jvmType;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType getElementType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl.getHighSpeedVideoFpsRanges.toString(this);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getBOOLEAN$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.getHighSpeedVideoFpsRanges;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getCHAR$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.getHighSpeedVideoFpsRangesFor;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getBYTE$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Camera2StreamConfigurationMap;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getSHORT$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.getInputFormats;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getINT$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.getHighSpeedVideoSizesFor;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getFLOAT$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.getHighSpeedVideoSizes;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getLONG$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.getOutputFormats;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive getDOUBLE$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ JvmType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
