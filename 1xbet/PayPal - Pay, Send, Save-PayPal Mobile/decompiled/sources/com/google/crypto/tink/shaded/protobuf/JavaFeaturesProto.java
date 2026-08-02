package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class JavaFeaturesProto {
    public static final int JAVA_FIELD_NUMBER = 1001;
    public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<com.google.crypto.tink.shaded.protobuf.DescriptorProtos.FeatureSet, com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures> java_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.newSingularGeneratedExtension(com.google.crypto.tink.shaded.protobuf.DescriptorProtos.FeatureSet.getDefaultInstance(), com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.getDefaultInstance(), com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.getDefaultInstance(), null, 1001, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE, com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.class);

    public interface JavaFeaturesOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        boolean getLegacyClosedEnum();

        com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation();

        boolean hasLegacyClosedEnum();

        boolean hasUtf8Validation();
    }

    private JavaFeaturesProto() {
    }

    public static void registerAllExtensions(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>) java_);
    }

    public static final class JavaFeatures extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures, com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder> implements com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder {
        private static final com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures DEFAULT_INSTANCE;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures> PARSER = null;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean legacyClosedEnum_;
        private int utf8Validation_;

        private JavaFeatures() {
        }

        public enum Utf8Validation implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);

            public static final int DEFAULT_VALUE = 1;
            public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
            public static final int VERIFY_VALUE = 2;
            private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation>() { // from class: com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.1
                @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
                public com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation findValueByNumber(int i) {
                    return com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @java.lang.Deprecated
            public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation valueOf(int i) {
                return forNumber(i);
            }

            public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation forNumber(int i) {
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

            public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation> internalGetValueMap() {
                return internalValueMap;
            }

            public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.Utf8ValidationVerifier.INSTANCE;
            }

            static final class Utf8ValidationVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
                static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.Utf8ValidationVerifier();

                private Utf8ValidationVerifier() {
                }

                @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(i) != null;
                }
            }

            Utf8Validation(int i) {
                this.value = i;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public final boolean hasLegacyClosedEnum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public final boolean getLegacyClosedEnum() {
            return this.legacyClosedEnum_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyClosedEnum(boolean z) {
            this.bitField0_ |= 1;
            this.legacyClosedEnum_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLegacyClosedEnum() {
            this.bitField0_ &= -2;
            this.legacyClosedEnum_ = false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public final boolean hasUtf8Validation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation() {
            com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation forNumber = com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.forNumber(this.utf8Validation_);
            return forNumber == null ? com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.UTF8_VALIDATION_UNKNOWN : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUtf8Validation(com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation utf8Validation) {
            this.utf8Validation_ = utf8Validation.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUtf8Validation() {
            this.bitField0_ &= -3;
            this.utf8Validation_ = 0;
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures) {
            return DEFAULT_INSTANCE.createBuilder(javaFeatures);
        }

        public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures, com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder> implements com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder {
            /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public final boolean hasLegacyClosedEnum() {
                return ((com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).hasLegacyClosedEnum();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public final boolean getLegacyClosedEnum() {
                return ((com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).getLegacyClosedEnum();
            }

            public final com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder setLegacyClosedEnum(boolean z) {
                copyOnWrite();
                ((com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).setLegacyClosedEnum(z);
                return this;
            }

            public final com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder clearLegacyClosedEnum() {
                copyOnWrite();
                ((com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).clearLegacyClosedEnum();
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public final boolean hasUtf8Validation() {
                return ((com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).hasUtf8Validation();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public final com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation getUtf8Validation() {
                return ((com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).getUtf8Validation();
            }

            public final com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder setUtf8Validation(com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation utf8Validation) {
                copyOnWrite();
                ((com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).setUtf8Validation(utf8Validation);
                return this;
            }

            public final com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder clearUtf8Validation() {
                copyOnWrite();
                ((com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures) this.instance).clearUtf8Validation();
                return this;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.crypto.tink.shaded.protobuf.Parser parser;
            com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.AnonymousClass1 anonymousClass1 = null;
            switch (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures();
                case 2:
                    return new com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new java.lang.Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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
            com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures javaFeatures = new com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures();
            DEFAULT_INSTANCE = javaFeatures;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures.class, javaFeatures);
        }

        public static com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto.JavaFeatures> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.JavaFeaturesProto$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
