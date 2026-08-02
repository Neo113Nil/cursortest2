package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class JavaFeaturesProto {
    public static final int JAVA_FIELD_NUMBER = 1001;
    public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<androidx.datastore.preferences.protobuf.DescriptorProtos.FeatureSet, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures> java_ = androidx.content.preferences.protobuf.GeneratedMessageLite.newSingularGeneratedExtension(androidx.datastore.preferences.protobuf.DescriptorProtos.FeatureSet.getDefaultInstance(), androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.getDefaultInstance(), androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.getDefaultInstance(), null, 1001, androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.class);

    public interface JavaFeaturesOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
        boolean getLegacyClosedEnum();

        androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation();

        boolean hasLegacyClosedEnum();

        boolean hasUtf8Validation();
    }

    private JavaFeaturesProto() {
    }

    public static void registerAllExtensions(androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add((androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>) java_);
    }

    public static final class JavaFeatures extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder> implements androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder {
        private static final androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures DEFAULT_INSTANCE;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        private static volatile androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures> PARSER = null;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean legacyClosedEnum_;
        private int utf8Validation_;

        private JavaFeatures() {
        }

        public enum Utf8Validation implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);

            public static final int DEFAULT_VALUE = 1;
            public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
            public static final int VERIFY_VALUE = 2;
            private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation> getHighSpeedVideoFpsRangesFor = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation>() { // from class: androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.1
                @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
                public /* synthetic */ androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation findValueByNumber(int i) {
                    return androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(i);
                }
            };
            private final int getHighSpeedVideoFpsRanges;

            @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.getHighSpeedVideoFpsRanges;
            }

            @java.lang.Deprecated
            public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation valueOf(int i) {
                return forNumber(i);
            }

            public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation forNumber(int i) {
                if (i == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (i == 1) {
                    return DEFAULT;
                }
                if (i != 2) {
                    return null;
                }
                return VERIFY;
            }

            public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation> internalGetValueMap() {
                return getHighSpeedVideoFpsRangesFor;
            }

            public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.Utf8ValidationVerifier.getHighSpeedVideoFpsRangesFor;
            }

            static final class Utf8ValidationVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
                static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier getHighSpeedVideoFpsRangesFor = new androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.Utf8ValidationVerifier();

                private Utf8ValidationVerifier() {
                }

                @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(i) != null;
                }
            }

            Utf8Validation(int i) {
                this.getHighSpeedVideoFpsRanges = i;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public final boolean hasLegacyClosedEnum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public final boolean getLegacyClosedEnum() {
            return this.legacyClosedEnum_;
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public final boolean hasUtf8Validation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public final androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation() {
            androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation forNumber = androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(this.utf8Validation_);
            return forNumber == null ? androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.UTF8_VALIDATION_UNKNOWN : forNumber;
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder newBuilder(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures) {
            return DEFAULT_INSTANCE.createBuilder(javaFeatures);
        }

        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder> implements androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder {
            /* synthetic */ Builder(byte b) {
                this();
            }

            private Builder() {
                super(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.DEFAULT_INSTANCE);
            }

            @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public final boolean hasLegacyClosedEnum() {
                return ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).hasLegacyClosedEnum();
            }

            @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public final boolean getLegacyClosedEnum() {
                return ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).getLegacyClosedEnum();
            }

            public final androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder setLegacyClosedEnum(boolean z) {
                copyOnWrite();
                androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.getHighSpeedVideoFpsRangesFor((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance, z);
                return this;
            }

            public final androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder clearLegacyClosedEnum() {
                copyOnWrite();
                androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.getHighResolutionOutputSizeshNQ4ISI((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public final boolean hasUtf8Validation() {
                return ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).hasUtf8Validation();
            }

            @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public final androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation() {
                return ((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).getUtf8Validation();
            }

            public final androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder setUtf8Validation(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation utf8Validation) {
                copyOnWrite();
                androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.getHighResolutionOutputSizeshNQ4ISI((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance, utf8Validation);
                return this;
            }

            public final androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder clearUtf8Validation() {
                copyOnWrite();
                androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Camera2StreamConfigurationMap((androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures) this.instance);
                return this;
            }
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            androidx.content.preferences.protobuf.Parser parser;
            switch (androidx.content.preferences.protobuf.JavaFeaturesProto.AnonymousClass1.Camera2StreamConfigurationMap[methodToInvoke.ordinal()]) {
                case 1:
                    return new androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures();
                case 2:
                    return new androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Builder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new java.lang.Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        static {
            androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures = new androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures();
            DEFAULT_INSTANCE = javaFeatures;
            androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.class, javaFeatures);
        }

        public static androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures, boolean z) {
            javaFeatures.bitField0_ |= 1;
            javaFeatures.legacyClosedEnum_ = z;
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures) {
            javaFeatures.bitField0_ &= -2;
            javaFeatures.legacyClosedEnum_ = false;
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures, androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation utf8Validation) {
            javaFeatures.utf8Validation_ = utf8Validation.getNumber();
            javaFeatures.bitField0_ |= 2;
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures) {
            javaFeatures.bitField0_ &= -3;
            javaFeatures.utf8Validation_ = 0;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.JavaFeaturesProto$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
