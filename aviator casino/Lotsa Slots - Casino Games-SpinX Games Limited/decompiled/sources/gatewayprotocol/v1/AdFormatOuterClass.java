package gatewayprotocol.v1;

/* loaded from: classes6.dex */
public final class AdFormatOuterClass {
    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private AdFormatOuterClass() {
    }

    public enum AdFormat implements com.google.protobuf.Internal.EnumLite {
        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        UNRECOGNIZED(-1);

        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.AdFormatOuterClass.AdFormat>() { // from class: gatewayprotocol.v1.AdFormatOuterClass.AdFormat.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.AdFormatOuterClass.AdFormat findValueByNumber(int i) {
                return gatewayprotocol.v1.AdFormatOuterClass.AdFormat.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static gatewayprotocol.v1.AdFormatOuterClass.AdFormat valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.AdFormatOuterClass.AdFormat forNumber(int i) {
            if (i == 0) {
                return AD_FORMAT_UNSPECIFIED;
            }
            if (i == 1) {
                return AD_FORMAT_INTERSTITIAL;
            }
            if (i == 2) {
                return AD_FORMAT_REWARDED;
            }
            if (i != 3) {
                return null;
            }
            return AD_FORMAT_BANNER;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AdFormatVerifier.INSTANCE;
        }

        private static final class AdFormatVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AdFormatVerifier();

            private AdFormatVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.AdFormatOuterClass.AdFormat.forNumber(i) != null;
            }
        }

        AdFormat(int i) {
            this.value = i;
        }
    }
}
