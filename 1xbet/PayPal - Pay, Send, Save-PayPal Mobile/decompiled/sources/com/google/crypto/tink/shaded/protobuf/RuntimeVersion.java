package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class RuntimeVersion {
    public static final com.google.crypto.tink.shaded.protobuf.RuntimeVersion.RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    public static final int MINOR = 28;
    public static final com.google.crypto.tink.shaded.protobuf.RuntimeVersion.RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 28;
    public static final int OSS_PATCH = 2;
    public static final java.lang.String OSS_SUFFIX = "";
    public static final int PATCH = 2;
    public static final java.lang.String SUFFIX = "";
    private static final java.lang.String VERSION_STRING;
    private static final java.util.logging.Logger logger;

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        com.google.crypto.tink.shaded.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain = com.google.crypto.tink.shaded.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        VERSION_STRING = versionString(4, 28, 2, "");
        logger = java.util.logging.Logger.getLogger(com.google.crypto.tink.shaded.protobuf.RuntimeVersion.class.getName());
    }

    public static void validateProtobufGencodeVersion(com.google.crypto.tink.shaded.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain, int i, int i2, int i3, java.lang.String str, java.lang.String str2) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(runtimeDomain, i, i2, i3, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(com.google.crypto.tink.shaded.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain, int i, int i2, int i3, java.lang.String str, java.lang.String str2) {
        if (checkDisabled()) {
            return;
        }
        java.lang.String versionString = versionString(i, i2, i3, str);
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw new com.google.crypto.tink.shaded.protobuf.RuntimeVersion.ProtobufRuntimeVersionException("Invalid gencode version: ".concat(java.lang.String.valueOf(versionString)));
        }
        com.google.crypto.tink.shaded.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain2 = DOMAIN;
        if (runtimeDomain != runtimeDomain2) {
            throw new com.google.crypto.tink.shaded.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", str2, runtimeDomain, runtimeDomain2));
        }
        if (i != 4) {
            if (i == 3) {
                logger.warning(java.lang.String.format(" Protobuf gencode version %s is exactly one major version older than the runtime version %s at %s. Please update the gencode to avoid compatibility violations in the next runtime release.", versionString, VERSION_STRING, str2));
            } else {
                throw new com.google.crypto.tink.shaded.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime major versions when loading %s: gencode %s, runtime %s. Same major version is required.", str2, versionString, VERSION_STRING));
            }
        }
        if (28 < i2 || (i2 == 28 && 2 < i3)) {
            throw new com.google.crypto.tink.shaded.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected incompatible Protobuf Gencode/Runtime versions when loading %s: gencode %s, runtime %s. Runtime version cannot be older than the linked gencode version.", str2, versionString, VERSION_STRING));
        }
        if (28 > i2 || 2 > i3) {
            logger.warning(java.lang.String.format(" Protobuf gencode version %s is older than the runtime version %s at %s. Please avoid checked-in Protobuf gencode that can be obsolete.", versionString, VERSION_STRING, str2));
        }
        if (!str.equals("")) {
            throw new com.google.crypto.tink.shaded.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading %s: gencode %s, runtime %s. Version suffixes must be the same.", str2, versionString, VERSION_STRING));
        }
    }

    public static final class ProtobufRuntimeVersionException extends java.lang.RuntimeException {
        public ProtobufRuntimeVersionException(java.lang.String str) {
            super(str);
        }
    }

    private static java.lang.String versionString(int i, int i2, int i3, java.lang.String str) {
        return java.lang.String.format("%d.%d.%d%s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), str);
    }

    private static boolean checkDisabled() {
        java.lang.String str = java.lang.System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    private RuntimeVersion() {
    }
}
