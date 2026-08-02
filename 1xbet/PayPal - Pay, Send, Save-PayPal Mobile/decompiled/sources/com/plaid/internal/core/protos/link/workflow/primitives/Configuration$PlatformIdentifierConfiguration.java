package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$PlatformIdentifierConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ANDROID_PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration DEFAULT_INSTANCE;
    public static final int IOS_PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration> PARSER = null;
    public static final int WEB_PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 1;
    private int platformConfigurationCase_ = 0;
    private java.lang.Object platformConfiguration_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) this.instance).setAndroidPlatformIdentifierConfiguration(configuration$AndroidPlatformIdentifierConfiguration);
            return this;
        }
    }

    public enum b {
        WEB_PLATFORM_IDENTIFIER_CONFIGURATION(1),
        ANDROID_PLATFORM_IDENTIFIER_CONFIGURATION(2),
        IOS_PLATFORM_IDENTIFIER_CONFIGURATION(3),
        PLATFORMCONFIGURATION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6347a;

        b(int i) {
            this.f6347a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.b forNumber(int i) {
            if (i == 0) {
                return PLATFORMCONFIGURATION_NOT_SET;
            }
            if (i == 1) {
                return WEB_PLATFORM_IDENTIFIER_CONFIGURATION;
            }
            if (i == 2) {
                return ANDROID_PLATFORM_IDENTIFIER_CONFIGURATION;
            }
            if (i != 3) {
                return null;
            }
            return IOS_PLATFORM_IDENTIFIER_CONFIGURATION;
        }

        public final int getNumber() {
            return this.f6347a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration();
        DEFAULT_INSTANCE = configuration$PlatformIdentifierConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.class, configuration$PlatformIdentifierConfiguration);
    }

    private Configuration$PlatformIdentifierConfiguration() {
    }

    private void clearAndroidPlatformIdentifierConfiguration() {
        if (this.platformConfigurationCase_ == 2) {
            this.platformConfigurationCase_ = 0;
            this.platformConfiguration_ = null;
        }
    }

    private void clearIosPlatformIdentifierConfiguration() {
        if (this.platformConfigurationCase_ == 3) {
            this.platformConfigurationCase_ = 0;
            this.platformConfiguration_ = null;
        }
    }

    private void clearPlatformConfiguration() {
        this.platformConfigurationCase_ = 0;
        this.platformConfiguration_ = null;
    }

    private void clearWebPlatformIdentifierConfiguration() {
        if (this.platformConfigurationCase_ == 1) {
            this.platformConfigurationCase_ = 0;
            this.platformConfiguration_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"platformConfiguration_", "platformConfigurationCase_", com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration.class, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.class, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration getAndroidPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) this.platformConfiguration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration getIosPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration) this.platformConfiguration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.b getPlatformConfigurationCase() {
        return com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.b.forNumber(this.platformConfigurationCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration getWebPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration) this.platformConfiguration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration.getDefaultInstance();
    }

    public final boolean hasAndroidPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 2;
    }

    public final boolean hasIosPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 3;
    }

    public final boolean hasWebPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 1;
    }

    private void mergeAndroidPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration) {
        if (this.platformConfigurationCase_ != 2 || this.platformConfiguration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformConfiguration_ = configuration$AndroidPlatformIdentifierConfiguration;
        } else {
            this.platformConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) this.platformConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.a) configuration$AndroidPlatformIdentifierConfiguration).buildPartial();
        }
        this.platformConfigurationCase_ = 2;
    }

    private void mergeIosPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration configuration$IOSPlatformIdentifierConfiguration) {
        if (this.platformConfigurationCase_ != 3 || this.platformConfiguration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformConfiguration_ = configuration$IOSPlatformIdentifierConfiguration;
        } else {
            this.platformConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration) this.platformConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration.a) configuration$IOSPlatformIdentifierConfiguration).buildPartial();
        }
        this.platformConfigurationCase_ = 3;
    }

    private void mergeWebPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration configuration$WebPlatformIdentifierConfiguration) {
        if (this.platformConfigurationCase_ != 1 || this.platformConfiguration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformConfiguration_ = configuration$WebPlatformIdentifierConfiguration;
        } else {
            this.platformConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration) this.platformConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration.a) configuration$WebPlatformIdentifierConfiguration).buildPartial();
        }
        this.platformConfigurationCase_ = 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$PlatformIdentifierConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration) {
        this.platformConfiguration_ = configuration$AndroidPlatformIdentifierConfiguration;
        this.platformConfigurationCase_ = 2;
    }

    private void setIosPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration configuration$IOSPlatformIdentifierConfiguration) {
        this.platformConfiguration_ = configuration$IOSPlatformIdentifierConfiguration;
        this.platformConfigurationCase_ = 3;
    }

    private void setWebPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration configuration$WebPlatformIdentifierConfiguration) {
        this.platformConfiguration_ = configuration$WebPlatformIdentifierConfiguration;
        this.platformConfigurationCase_ = 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
