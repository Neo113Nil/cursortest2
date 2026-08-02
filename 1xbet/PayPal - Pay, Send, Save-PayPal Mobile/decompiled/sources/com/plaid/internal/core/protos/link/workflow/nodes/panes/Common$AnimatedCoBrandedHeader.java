package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$AnimatedCoBrandedHeader extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ANIMATION_OPTIONS_FIELD_NUMBER = 6;
    public static final int CLIENT_LOGO_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader DEFAULT_INSTANCE;
    public static final int GLOW_ARC_CONFIGURATION_FIELD_NUMBER = 5;
    public static final int HEADER_TEXT_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader> PARSER = null;
    public static final int PLAID_LOGO_FIELD_NUMBER = 2;
    public static final int SUBHEADER_FIELD_NUMBER = 3;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions animationOptions_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance clientLogo_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration glowArcConfiguration_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent headerText_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance plaidLogo_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent subheader_;

    public static final class AnimationOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.AnimationOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions> PARSER = null;
        public static final int START_DELAY_MS_FIELD_NUMBER = 1;
        private int startDelayMs_;

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.AnimationOptions.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.AnimationOptions.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions animationOptions) {
            return DEFAULT_INSTANCE.createBuilder(animationOptions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final int getStartDelayMs() {
            return this.startDelayMs_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.AnimationOptions.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"startDelayMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions.class) {
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

        private void setStartDelayMs(int i) {
            this.startDelayMs_ = i;
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void clearStartDelayMs() {
            this.startDelayMs_ = 0;
        }

        private AnimationOptions() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.AnimationOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions animationOptions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions();
            DEFAULT_INSTANCE = animationOptions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions.class, animationOptions);
        }
    }

    public static final class GlowArcConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.GlowArcConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration DEFAULT_INSTANCE;
        public static final int IS_VISIBLE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration> PARSER;
        private java.lang.String color_ = "";
        private boolean isVisible_;

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.GlowArcConfiguration.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.GlowArcConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration glowArcConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(glowArcConfiguration);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final boolean getIsVisible() {
            return this.isVisible_;
        }

        public final com.google.protobuf.ByteString getColorBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.color_);
        }

        public final java.lang.String getColor() {
            return this.color_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.GlowArcConfiguration.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new java.lang.Object[]{"isVisible_", "color_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration.class) {
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

        private void setIsVisible(boolean z) {
            this.isVisible_ = z;
        }

        private void setColorBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        private void setColor(java.lang.String str) {
            this.color_ = str;
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void clearIsVisible() {
            this.isVisible_ = false;
        }

        private void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        private GlowArcConfiguration() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.GlowArcConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration glowArcConfiguration = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration();
            DEFAULT_INSTANCE = glowArcConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration.class, glowArcConfiguration);
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
        return DEFAULT_INSTANCE.createBuilder(common$AnimatedCoBrandedHeader);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasSubheader() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasPlaidLogo() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasHeaderText() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasGlowArcConfiguration() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasClientLogo() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasAnimationOptions() {
        return (this.bitField0_ & 32) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getSubheader() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.subheader_;
        return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getPlaidLogo() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.plaidLogo_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getHeaderText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.headerText_;
        return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration getGlowArcConfiguration() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration glowArcConfiguration = this.glowArcConfiguration_;
        return glowArcConfiguration == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration.getDefaultInstance() : glowArcConfiguration;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getClientLogo() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.clientLogo_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions getAnimationOptions() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions animationOptions = this.animationOptions_;
        return animationOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions.getDefaultInstance() : animationOptions;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new java.lang.Object[]{"bitField0_", "clientLogo_", "plaidLogo_", "subheader_", "headerText_", "glowArcConfiguration_", "animationOptions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.class) {
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

    private void setSubheader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        this.subheader_ = common$TextContent;
        this.bitField0_ |= 4;
    }

    private void setPlaidLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.plaidLogo_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 2;
    }

    private void setHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        this.headerText_ = common$TextContent;
        this.bitField0_ |= 8;
    }

    private void setGlowArcConfiguration(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration glowArcConfiguration) {
        this.glowArcConfiguration_ = glowArcConfiguration;
        this.bitField0_ |= 16;
    }

    private void setClientLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.clientLogo_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setAnimationOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions animationOptions) {
        this.animationOptions_ = animationOptions;
        this.bitField0_ |= 32;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeSubheader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.subheader_;
        if (common$TextContent2 != null && common$TextContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
            common$TextContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.subheader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
        }
        this.subheader_ = common$TextContent;
        this.bitField0_ |= 4;
    }

    private void mergePlaidLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.plaidLogo_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.plaidLogo_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.plaidLogo_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 2;
    }

    private void mergeHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.headerText_;
        if (common$TextContent2 != null && common$TextContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
            common$TextContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.headerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
        }
        this.headerText_ = common$TextContent;
        this.bitField0_ |= 8;
    }

    private void mergeGlowArcConfiguration(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration glowArcConfiguration) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration glowArcConfiguration2 = this.glowArcConfiguration_;
        if (glowArcConfiguration2 != null && glowArcConfiguration2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration.getDefaultInstance()) {
            glowArcConfiguration = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.GlowArcConfiguration.newBuilder(this.glowArcConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.GlowArcConfiguration.a) glowArcConfiguration).buildPartial();
        }
        this.glowArcConfiguration_ = glowArcConfiguration;
        this.bitField0_ |= 16;
    }

    private void mergeClientLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.clientLogo_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.clientLogo_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.clientLogo_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void mergeAnimationOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions animationOptions) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions animationOptions2 = this.animationOptions_;
        if (animationOptions2 != null && animationOptions2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions.getDefaultInstance()) {
            animationOptions = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.AnimationOptions.newBuilder(this.animationOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AnimatedCoBrandedHeader.AnimationOptions.a) animationOptions).buildPartial();
        }
        this.animationOptions_ = animationOptions;
        this.bitField0_ |= 32;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearSubheader() {
        this.subheader_ = null;
        this.bitField0_ &= -5;
    }

    private void clearPlaidLogo() {
        this.plaidLogo_ = null;
        this.bitField0_ &= -3;
    }

    private void clearHeaderText() {
        this.headerText_ = null;
        this.bitField0_ &= -9;
    }

    private void clearGlowArcConfiguration() {
        this.glowArcConfiguration_ = null;
        this.bitField0_ &= -17;
    }

    private void clearClientLogo() {
        this.clientLogo_ = null;
        this.bitField0_ &= -2;
    }

    private void clearAnimationOptions() {
        this.animationOptions_ = null;
        this.bitField0_ &= -33;
    }

    private Common$AnimatedCoBrandedHeader() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader();
        DEFAULT_INSTANCE = common$AnimatedCoBrandedHeader;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.class, common$AnimatedCoBrandedHeader);
    }
}
