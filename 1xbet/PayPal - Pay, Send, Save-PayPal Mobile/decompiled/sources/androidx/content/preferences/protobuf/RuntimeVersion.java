package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class RuntimeVersion {
    private static final java.util.logging.Logger Camera2StreamConfigurationMap;
    public static final androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    public static final int MINOR = 28;
    public static final androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 28;
    public static final int OSS_PATCH = 2;
    public static final java.lang.String OSS_SUFFIX = "";
    public static final int PATCH = 2;
    public static final java.lang.String SUFFIX = "";
    private static final java.lang.String getHighSpeedVideoFpsRanges;

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain = androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap(4, 28, 2, "");
        Camera2StreamConfigurationMap = java.util.logging.Logger.getLogger(androidx.content.preferences.protobuf.RuntimeVersion.class.getName());
    }

    public static final class ProtobufRuntimeVersionException extends java.lang.RuntimeException {
        public ProtobufRuntimeVersionException(java.lang.String str) {
            super(str);
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap(int i, int i2, int i3, java.lang.String str) {
        return java.lang.String.format("%d.%d.%d%s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), str);
    }

    private RuntimeVersion() {
    }

    public static void validateProtobufGencodeVersion(androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain, int i, int i2, int i3, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = java.lang.System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if (str3 == null || !str3.equals("true")) {
            java.lang.String str4 = java.lang.System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
            if (str4 == null || !str4.equals("true")) {
                java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i, i2, i3, str);
                if (i < 0 || i2 < 0 || i3 < 0) {
                    throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException("Invalid gencode version: ".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap2)));
                }
                androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain2 = DOMAIN;
                if (runtimeDomain != runtimeDomain2) {
                    throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", str2, runtimeDomain, runtimeDomain2));
                }
                if (i != 4) {
                    if (i == 3) {
                        Camera2StreamConfigurationMap.warning(java.lang.String.format(" Protobuf gencode version %s is exactly one major version older than the runtime version %s at %s. Please update the gencode to avoid compatibility violations in the next runtime release.", Camera2StreamConfigurationMap2, getHighSpeedVideoFpsRanges, str2));
                    } else {
                        throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime major versions when loading %s: gencode %s, runtime %s. Same major version is required.", str2, Camera2StreamConfigurationMap2, getHighSpeedVideoFpsRanges));
                    }
                }
                if (28 < i2 || (i2 == 28 && 2 < i3)) {
                    throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected incompatible Protobuf Gencode/Runtime versions when loading %s: gencode %s, runtime %s. Runtime version cannot be older than the linked gencode version.", str2, Camera2StreamConfigurationMap2, getHighSpeedVideoFpsRanges));
                }
                if (28 > i2 || 2 > i3) {
                    Camera2StreamConfigurationMap.warning(java.lang.String.format(" Protobuf gencode version %s is older than the runtime version %s at %s. Please avoid checked-in Protobuf gencode that can be obsolete.", Camera2StreamConfigurationMap2, getHighSpeedVideoFpsRanges, str2));
                }
                if (!str.equals("")) {
                    throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading %s: gencode %s, runtime %s. Version suffixes must be the same.", str2, Camera2StreamConfigurationMap2, getHighSpeedVideoFpsRanges));
                }
            }
        }
    }
}
