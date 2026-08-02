package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

/* loaded from: classes5.dex */
public final class KotlinClassHeader {
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind Camera2StreamConfigurationMap;
    private final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String[] getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.lang.String getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final java.lang.String[] getOutputMinFrameDuration;

    public KotlinClassHeader(kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3, java.lang.String str, int i, java.lang.String str2, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        this.Camera2StreamConfigurationMap = kind;
        this.getInputSizeshNQ4ISI = metadataVersion;
        this.getHighSpeedVideoFpsRanges = strArr;
        this.getHighResolutionOutputSizeshNQ4ISI = strArr2;
        this.getOutputMinFrameDuration = strArr3;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputFormats = str2;
        this.getOutputFormats = bArr;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind getKind() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getMetadataVersion() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.lang.String[] getData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String[] getIncompatibleData() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String[] getStrings() {
        return this.getOutputMinFrameDuration;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind CLASS;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.Companion Companion;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind FILE_FACADE;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind MULTIFILE_CLASS;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind MULTIFILE_CLASS_PART;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind SYNTHETIC_CLASS;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind UNKNOWN;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[] getHighSpeedVideoSizes;
        private final int Camera2StreamConfigurationMap;

        private Kind(java.lang.String str, int i, int i2) {
            this.Camera2StreamConfigurationMap = i2;
        }

        static {
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind("UNKNOWN", 0, 0);
            UNKNOWN = kind;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind("CLASS", 1, 1);
            CLASS = kind2;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind("FILE_FACADE", 2, 2);
            FILE_FACADE = kind3;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind4 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind("SYNTHETIC_CLASS", 3, 3);
            SYNTHETIC_CLASS = kind4;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind5 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind("MULTIFILE_CLASS", 4, 4);
            MULTIFILE_CLASS = kind5;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind6 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind("MULTIFILE_CLASS_PART", 5, 5);
            MULTIFILE_CLASS_PART = kind6;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[] kindArr = {kind, kind2, kind3, kind4, kind5, kind6};
            getHighSpeedVideoSizes = kindArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(kindArr);
            Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.Companion(null);
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[] values = values();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(values.length), 16));
            for (kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind7 : values) {
                linkedHashMap.put(java.lang.Integer.valueOf(kind7.Camera2StreamConfigurationMap), kind7);
            }
            getHighSpeedVideoFpsRangesFor = linkedHashMap;
        }

        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind getById(int i) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind = (kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind) kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(i));
                return kind == null ? kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.UNKNOWN : kind;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[] values() {
            return (kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[]) getHighSpeedVideoSizes.clone();
        }

        public static kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.class, str);
        }

        @kotlin.jvm.JvmStatic
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind getById(int i) {
            return Companion.getById(i);
        }
    }

    public final java.lang.String getMultifileClassName() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (this.Camera2StreamConfigurationMap == kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final java.util.List<java.lang.String> getMultifilePartNames() {
        java.lang.String[] strArr = this.getHighSpeedVideoFpsRanges;
        if (this.Camera2StreamConfigurationMap != kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        java.util.List<java.lang.String> asList = strArr != null ? kotlin.collections.ArraysKt.asList(strArr) : null;
        return asList == null ? kotlin.collections.CollectionsKt.emptyList() : asList;
    }

    public final boolean isUnstableJvmIrBinary() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        return (i & 16) != 0 && (i & 32) == 0;
    }

    public final boolean isPreRelease() {
        return (this.getHighSpeedVideoFpsRangesFor & 2) != 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" version=");
        sb.append(this.getInputSizeshNQ4ISI);
        return sb.toString();
    }
}
