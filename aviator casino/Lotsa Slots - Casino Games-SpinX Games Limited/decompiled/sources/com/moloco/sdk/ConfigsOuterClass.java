package com.moloco.sdk;

/* loaded from: classes5.dex */
public final class ConfigsOuterClass {

    public interface ConfigsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs getAndroidConfig();

        com.moloco.sdk.ConfigsOuterClass.Configs.ClientConfigsCase getClientConfigsCase();

        com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs getCommonConfigs();

        com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs getIosConfig();

        boolean hasAndroidConfig();

        boolean hasCommonConfigs();

        boolean hasIosConfig();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private ConfigsOuterClass() {
    }

    public static final class Configs extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.ConfigsOuterClass.Configs, com.moloco.sdk.ConfigsOuterClass.Configs.Builder> implements com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder {
        public static final int ANDROID_CONFIG_FIELD_NUMBER = 1;
        public static final int COMMON_CONFIGS_FIELD_NUMBER = 3;
        private static final com.moloco.sdk.ConfigsOuterClass.Configs DEFAULT_INSTANCE;
        public static final int IOS_CONFIG_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs> PARSER;
        private int clientConfigsCase_ = 0;
        private java.lang.Object clientConfigs_;
        private com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs_;

        public interface AndroidConfigsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        }

        public interface CommonConfigsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig getMediaConfig();

            boolean hasMediaConfig();
        }

        public interface IOSConfigsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        }

        private Configs() {
        }

        public static final class AndroidConfigs extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs, com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.Builder> implements com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigsOrBuilder {
            private static final com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs> PARSER;

            private AndroidConfigs() {
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.Builder newBuilder(com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs androidConfigs) {
                return DEFAULT_INSTANCE.createBuilder(androidConfigs);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs, com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.Builder> implements com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigsOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.DEFAULT_INSTANCE);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.ConfigsOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs();
                    case 2:
                        return new com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs androidConfigs = new com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs();
                DEFAULT_INSTANCE = androidConfigs;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.class, androidConfigs);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class IOSConfigs extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs, com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.Builder> implements com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigsOrBuilder {
            private static final com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs> PARSER;

            private IOSConfigs() {
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.Builder newBuilder(com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs iOSConfigs) {
                return DEFAULT_INSTANCE.createBuilder(iOSConfigs);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs, com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.Builder> implements com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigsOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.DEFAULT_INSTANCE);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.ConfigsOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs();
                    case 2:
                        return new com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs iOSConfigs = new com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs();
                DEFAULT_INSTANCE = iOSConfigs;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.class, iOSConfigs);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class CommonConfigs extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs, com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder> implements com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigsOrBuilder {
            private static final com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs DEFAULT_INSTANCE;
            public static final int MEDIA_CONFIG_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs> PARSER;
            private com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig_;

            public interface MediaConfigOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
                double getMinStreamingPlayableDurationOnTimeoutSecs();

                long getStreamingChunkSizeKilobytes();

                boolean hasMinStreamingPlayableDurationOnTimeoutSecs();

                boolean hasStreamingChunkSizeKilobytes();
            }

            private CommonConfigs() {
            }

            public static final class MediaConfig extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig, com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder> implements com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder {
                private static final com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig DEFAULT_INSTANCE;
                public static final int MIN_STREAMING_PLAYABLE_DURATION_ON_TIMEOUT_SECS_FIELD_NUMBER = 2;
                private static volatile com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig> PARSER = null;
                public static final int STREAMING_CHUNK_SIZE_KILOBYTES_FIELD_NUMBER = 1;
                private int bitField0_;
                private double minStreamingPlayableDurationOnTimeoutSecs_;
                private long streamingChunkSizeKilobytes_;

                private MediaConfig() {
                }

                @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder
                public boolean hasStreamingChunkSizeKilobytes() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder
                public long getStreamingChunkSizeKilobytes() {
                    return this.streamingChunkSizeKilobytes_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setStreamingChunkSizeKilobytes(long j) {
                    this.bitField0_ |= 1;
                    this.streamingChunkSizeKilobytes_ = j;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearStreamingChunkSizeKilobytes() {
                    this.bitField0_ &= -2;
                    this.streamingChunkSizeKilobytes_ = 0L;
                }

                @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder
                public boolean hasMinStreamingPlayableDurationOnTimeoutSecs() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder
                public double getMinStreamingPlayableDurationOnTimeoutSecs() {
                    return this.minStreamingPlayableDurationOnTimeoutSecs_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMinStreamingPlayableDurationOnTimeoutSecs(double d) {
                    this.bitField0_ |= 2;
                    this.minStreamingPlayableDurationOnTimeoutSecs_ = d;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearMinStreamingPlayableDurationOnTimeoutSecs() {
                    this.bitField0_ &= -3;
                    this.minStreamingPlayableDurationOnTimeoutSecs_ = 0.0d;
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder newBuilder(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig) {
                    return DEFAULT_INSTANCE.createBuilder(mediaConfig);
                }

                public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig, com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder> implements com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder {
                    private Builder() {
                        super(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.DEFAULT_INSTANCE);
                    }

                    @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder
                    public boolean hasStreamingChunkSizeKilobytes() {
                        return ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) this.instance).hasStreamingChunkSizeKilobytes();
                    }

                    @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder
                    public long getStreamingChunkSizeKilobytes() {
                        return ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) this.instance).getStreamingChunkSizeKilobytes();
                    }

                    public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder setStreamingChunkSizeKilobytes(long j) {
                        copyOnWrite();
                        ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) this.instance).setStreamingChunkSizeKilobytes(j);
                        return this;
                    }

                    public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder clearStreamingChunkSizeKilobytes() {
                        copyOnWrite();
                        ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) this.instance).clearStreamingChunkSizeKilobytes();
                        return this;
                    }

                    @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder
                    public boolean hasMinStreamingPlayableDurationOnTimeoutSecs() {
                        return ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) this.instance).hasMinStreamingPlayableDurationOnTimeoutSecs();
                    }

                    @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfigOrBuilder
                    public double getMinStreamingPlayableDurationOnTimeoutSecs() {
                        return ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) this.instance).getMinStreamingPlayableDurationOnTimeoutSecs();
                    }

                    public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder setMinStreamingPlayableDurationOnTimeoutSecs(double d) {
                        copyOnWrite();
                        ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) this.instance).setMinStreamingPlayableDurationOnTimeoutSecs(d);
                        return this;
                    }

                    public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder clearMinStreamingPlayableDurationOnTimeoutSecs() {
                        copyOnWrite();
                        ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig) this.instance).clearMinStreamingPlayableDurationOnTimeoutSecs();
                        return this;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    switch (com.moloco.sdk.ConfigsOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig();
                        case 2:
                            return new com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder();
                        case 3:
                            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001", new java.lang.Object[]{"bitField0_", "streamingChunkSizeKilobytes_", "minStreamingPlayableDurationOnTimeoutSecs_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig> parser = PARSER;
                            if (parser == null) {
                                synchronized (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.class) {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
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
                    com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig = new com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig();
                    DEFAULT_INSTANCE = mediaConfig;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.class, mediaConfig);
                }

                public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigsOrBuilder
            public boolean hasMediaConfig() {
                return this.mediaConfig_ != null;
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigsOrBuilder
            public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig getMediaConfig() {
                com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig = this.mediaConfig_;
                return mediaConfig == null ? com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.getDefaultInstance() : mediaConfig;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMediaConfig(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig) {
                mediaConfig.getClass();
                this.mediaConfig_ = mediaConfig;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeMediaConfig(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig) {
                mediaConfig.getClass();
                com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig2 = this.mediaConfig_;
                if (mediaConfig2 != null && mediaConfig2 != com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.getDefaultInstance()) {
                    this.mediaConfig_ = com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.newBuilder(this.mediaConfig_).mergeFrom((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder) mediaConfig).buildPartial();
                } else {
                    this.mediaConfig_ = mediaConfig;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMediaConfig() {
                this.mediaConfig_ = null;
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder newBuilder(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs) {
                return DEFAULT_INSTANCE.createBuilder(commonConfigs);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs, com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder> implements com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigsOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigsOrBuilder
                public boolean hasMediaConfig() {
                    return ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) this.instance).hasMediaConfig();
                }

                @Override // com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigsOrBuilder
                public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig getMediaConfig() {
                    return ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) this.instance).getMediaConfig();
                }

                public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder setMediaConfig(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig) {
                    copyOnWrite();
                    ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) this.instance).setMediaConfig(mediaConfig);
                    return this;
                }

                public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder setMediaConfig(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) this.instance).setMediaConfig(builder.build());
                    return this;
                }

                public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder mergeMediaConfig(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig) {
                    copyOnWrite();
                    ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) this.instance).mergeMediaConfig(mediaConfig);
                    return this;
                }

                public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder clearMediaConfig() {
                    copyOnWrite();
                    ((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs) this.instance).clearMediaConfig();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.ConfigsOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs();
                    case 2:
                        return new com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new java.lang.Object[]{"mediaConfig_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs = new com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs();
                DEFAULT_INSTANCE = commonConfigs;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.class, commonConfigs);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public enum ClientConfigsCase {
            ANDROID_CONFIG(1),
            IOS_CONFIG(2),
            CLIENTCONFIGS_NOT_SET(0);

            private final int value;

            ClientConfigsCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static com.moloco.sdk.ConfigsOuterClass.Configs.ClientConfigsCase valueOf(int i) {
                return forNumber(i);
            }

            public static com.moloco.sdk.ConfigsOuterClass.Configs.ClientConfigsCase forNumber(int i) {
                if (i == 0) {
                    return CLIENTCONFIGS_NOT_SET;
                }
                if (i == 1) {
                    return ANDROID_CONFIG;
                }
                if (i != 2) {
                    return null;
                }
                return IOS_CONFIG;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
        public com.moloco.sdk.ConfigsOuterClass.Configs.ClientConfigsCase getClientConfigsCase() {
            return com.moloco.sdk.ConfigsOuterClass.Configs.ClientConfigsCase.forNumber(this.clientConfigsCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientConfigs() {
            this.clientConfigsCase_ = 0;
            this.clientConfigs_ = null;
        }

        @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
        public boolean hasAndroidConfig() {
            return this.clientConfigsCase_ == 1;
        }

        @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
        public com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs getAndroidConfig() {
            if (this.clientConfigsCase_ == 1) {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) this.clientConfigs_;
            }
            return com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAndroidConfig(com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs androidConfigs) {
            androidConfigs.getClass();
            this.clientConfigs_ = androidConfigs;
            this.clientConfigsCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAndroidConfig(com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs androidConfigs) {
            androidConfigs.getClass();
            if (this.clientConfigsCase_ == 1 && this.clientConfigs_ != com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.getDefaultInstance()) {
                this.clientConfigs_ = com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.newBuilder((com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs) this.clientConfigs_).mergeFrom((com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.Builder) androidConfigs).buildPartial();
            } else {
                this.clientConfigs_ = androidConfigs;
            }
            this.clientConfigsCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAndroidConfig() {
            if (this.clientConfigsCase_ == 1) {
                this.clientConfigsCase_ = 0;
                this.clientConfigs_ = null;
            }
        }

        @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
        public boolean hasIosConfig() {
            return this.clientConfigsCase_ == 2;
        }

        @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
        public com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs getIosConfig() {
            if (this.clientConfigsCase_ == 2) {
                return (com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) this.clientConfigs_;
            }
            return com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIosConfig(com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs iOSConfigs) {
            iOSConfigs.getClass();
            this.clientConfigs_ = iOSConfigs;
            this.clientConfigsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIosConfig(com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs iOSConfigs) {
            iOSConfigs.getClass();
            if (this.clientConfigsCase_ == 2 && this.clientConfigs_ != com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.getDefaultInstance()) {
                this.clientConfigs_ = com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.newBuilder((com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs) this.clientConfigs_).mergeFrom((com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.Builder) iOSConfigs).buildPartial();
            } else {
                this.clientConfigs_ = iOSConfigs;
            }
            this.clientConfigsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIosConfig() {
            if (this.clientConfigsCase_ == 2) {
                this.clientConfigsCase_ = 0;
                this.clientConfigs_ = null;
            }
        }

        @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
        public boolean hasCommonConfigs() {
            return this.commonConfigs_ != null;
        }

        @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
        public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs getCommonConfigs() {
            com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs = this.commonConfigs_;
            return commonConfigs == null ? com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.getDefaultInstance() : commonConfigs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommonConfigs(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs) {
            commonConfigs.getClass();
            this.commonConfigs_ = commonConfigs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCommonConfigs(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs) {
            commonConfigs.getClass();
            com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs2 = this.commonConfigs_;
            if (commonConfigs2 != null && commonConfigs2 != com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.getDefaultInstance()) {
                this.commonConfigs_ = com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.newBuilder(this.commonConfigs_).mergeFrom((com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder) commonConfigs).buildPartial();
            } else {
                this.commonConfigs_ = commonConfigs;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommonConfigs() {
            this.commonConfigs_ = null;
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.ConfigsOuterClass.Configs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs.Builder newBuilder(com.moloco.sdk.ConfigsOuterClass.Configs configs) {
            return DEFAULT_INSTANCE.createBuilder(configs);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.ConfigsOuterClass.Configs, com.moloco.sdk.ConfigsOuterClass.Configs.Builder> implements com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder {
            private Builder() {
                super(com.moloco.sdk.ConfigsOuterClass.Configs.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
            public com.moloco.sdk.ConfigsOuterClass.Configs.ClientConfigsCase getClientConfigsCase() {
                return ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).getClientConfigsCase();
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder clearClientConfigs() {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).clearClientConfigs();
                return this;
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
            public boolean hasAndroidConfig() {
                return ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).hasAndroidConfig();
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
            public com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs getAndroidConfig() {
                return ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).getAndroidConfig();
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder setAndroidConfig(com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs androidConfigs) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).setAndroidConfig(androidConfigs);
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder setAndroidConfig(com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).setAndroidConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder mergeAndroidConfig(com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs androidConfigs) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).mergeAndroidConfig(androidConfigs);
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder clearAndroidConfig() {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).clearAndroidConfig();
                return this;
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
            public boolean hasIosConfig() {
                return ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).hasIosConfig();
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
            public com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs getIosConfig() {
                return ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).getIosConfig();
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder setIosConfig(com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs iOSConfigs) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).setIosConfig(iOSConfigs);
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder setIosConfig(com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).setIosConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder mergeIosConfig(com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs iOSConfigs) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).mergeIosConfig(iOSConfigs);
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder clearIosConfig() {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).clearIosConfig();
                return this;
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
            public boolean hasCommonConfigs() {
                return ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).hasCommonConfigs();
            }

            @Override // com.moloco.sdk.ConfigsOuterClass.ConfigsOrBuilder
            public com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs getCommonConfigs() {
                return ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).getCommonConfigs();
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder setCommonConfigs(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).setCommonConfigs(commonConfigs);
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder setCommonConfigs(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).setCommonConfigs(builder.build());
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder mergeCommonConfigs(com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs commonConfigs) {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).mergeCommonConfigs(commonConfigs);
                return this;
            }

            public com.moloco.sdk.ConfigsOuterClass.Configs.Builder clearCommonConfigs() {
                copyOnWrite();
                ((com.moloco.sdk.ConfigsOuterClass.Configs) this.instance).clearCommonConfigs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.ConfigsOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.ConfigsOuterClass.Configs();
                case 2:
                    return new com.moloco.sdk.ConfigsOuterClass.Configs.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\t", new java.lang.Object[]{"clientConfigs_", "clientConfigsCase_", com.moloco.sdk.ConfigsOuterClass.Configs.AndroidConfigs.class, com.moloco.sdk.ConfigsOuterClass.Configs.IOSConfigs.class, "commonConfigs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.ConfigsOuterClass.Configs.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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
            com.moloco.sdk.ConfigsOuterClass.Configs configs = new com.moloco.sdk.ConfigsOuterClass.Configs();
            DEFAULT_INSTANCE = configs;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.ConfigsOuterClass.Configs.class, configs);
        }

        public static com.moloco.sdk.ConfigsOuterClass.Configs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.ConfigsOuterClass.Configs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.moloco.sdk.ConfigsOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
