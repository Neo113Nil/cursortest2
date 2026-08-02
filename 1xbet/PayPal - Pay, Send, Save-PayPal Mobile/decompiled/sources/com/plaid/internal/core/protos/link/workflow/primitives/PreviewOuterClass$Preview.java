package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class PreviewOuterClass$Preview extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int COBRANDING_CONFIG_FIELD_NUMBER = 6;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 7;
    public static final int LINK_CUSTOMIZATION_FIELD_NUMBER = 5;
    public static final int LOCALE_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview> PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 1;
    public static final int PRODUCTS_FIELD_NUMBER = 3;
    public static final int SCENARIO_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig_;
    private com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error_;
    private com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomization_;
    private com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale locale_;
    private int preset_;
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> products_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private int scenario_;

    public static final class CobrandingConfig extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.CobrandingConfig.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BRAND_COLOR_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig DEFAULT_INSTANCE;
        public static final int LOGO_URL_1024_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig> PARSER;
        private java.lang.String logoUrl1024_ = "";
        private java.lang.String brandColor_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.CobrandingConfig.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig();
            DEFAULT_INSTANCE = cobrandingConfig;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig.class, cobrandingConfig);
        }

        private CobrandingConfig() {
        }

        private void clearBrandColor() {
            this.brandColor_ = getDefaultInstance().getBrandColor();
        }

        private void clearLogoUrl1024() {
            this.logoUrl1024_ = getDefaultInstance().getLogoUrl1024();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.CobrandingConfig.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBrandColorBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.brandColor_ = byteString.toStringUtf8();
        }

        private void setLogoUrl1024Bytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.logoUrl1024_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.p.f6380a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.CobrandingConfig.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"logoUrl1024_", "brandColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig.class) {
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

        public final java.lang.String getBrandColor() {
            return this.brandColor_;
        }

        public final com.google.protobuf.ByteString getBrandColorBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.brandColor_);
        }

        public final java.lang.String getLogoUrl1024() {
            return this.logoUrl1024_;
        }

        public final com.google.protobuf.ByteString getLogoUrl1024Bytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.logoUrl1024_);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.CobrandingConfig.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig) {
            return DEFAULT_INSTANCE.createBuilder(cobrandingConfig);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setBrandColor(java.lang.String str) {
            this.brandColor_ = str;
        }

        private void setLogoUrl1024(java.lang.String str) {
            this.logoUrl1024_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Error extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.Error.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int MFA_TYPE_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error> PARSER;
        private java.lang.String errorCode_ = "";
        private java.lang.String mfaType_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.Error.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error();
            DEFAULT_INSTANCE = error;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error.class, error);
        }

        private Error() {
        }

        private void clearErrorCode() {
            this.errorCode_ = getDefaultInstance().getErrorCode();
        }

        private void clearMfaType() {
            this.mfaType_ = getDefaultInstance().getMfaType();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.Error.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorCodeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorCode_ = byteString.toStringUtf8();
        }

        private void setMfaTypeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.mfaType_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.p.f6380a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.Error.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"errorCode_", "mfaType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error.class) {
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

        public final java.lang.String getErrorCode() {
            return this.errorCode_;
        }

        public final com.google.protobuf.ByteString getErrorCodeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorCode_);
        }

        public final java.lang.String getMfaType() {
            return this.mfaType_;
        }

        public final com.google.protobuf.ByteString getMfaTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.mfaType_);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.Error.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setErrorCode(java.lang.String str) {
            this.errorCode_ = str;
        }

        private void setMfaType(java.lang.String str) {
            this.mfaType_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RenderingOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.RenderingOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions DEFAULT_INSTANCE;
        public static final int EXECUTE_ACTION_IDS_FIELD_NUMBER = 3;
        public static final int PANE_DISABLED_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions> PARSER = null;
        public static final int SHOW_TRANSITION_FIELD_NUMBER = 2;
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> executeActionIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private boolean paneDisabled_;
        private boolean showTransition_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.RenderingOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions();
            DEFAULT_INSTANCE = renderingOptions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.class, renderingOptions);
        }

        private RenderingOptions() {
        }

        private void addAllExecuteActionIds(java.lang.Iterable<java.lang.String> iterable) {
            ensureExecuteActionIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.executeActionIds_);
        }

        private void addExecuteActionIdsBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            ensureExecuteActionIdsIsMutable();
            this.executeActionIds_.add(byteString.toStringUtf8());
        }

        private void clearExecuteActionIds() {
            this.executeActionIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearPaneDisabled() {
            this.paneDisabled_ = false;
        }

        private void clearShowTransition() {
            this.showTransition_ = false;
        }

        private void ensureExecuteActionIdsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.executeActionIds_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.executeActionIds_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.RenderingOptions.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneDisabled(boolean z) {
            this.paneDisabled_ = z;
        }

        private void setShowTransition(boolean z) {
            this.showTransition_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.p.f6380a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.RenderingOptions.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003Ț", new java.lang.Object[]{"paneDisabled_", "showTransition_", "executeActionIds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.class) {
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

        public final java.lang.String getExecuteActionIds(int i) {
            return this.executeActionIds_.get(i);
        }

        public final com.google.protobuf.ByteString getExecuteActionIdsBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.executeActionIds_.get(i));
        }

        public final int getExecuteActionIdsCount() {
            return this.executeActionIds_.size();
        }

        public final java.util.List<java.lang.String> getExecuteActionIdsList() {
            return this.executeActionIds_;
        }

        public final boolean getPaneDisabled() {
            return this.paneDisabled_;
        }

        public final boolean getShowTransition() {
            return this.showTransition_;
        }

        private void addExecuteActionIds(java.lang.String str) {
            ensureExecuteActionIdsIsMutable();
            this.executeActionIds_.add(str);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.RenderingOptions.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
            return DEFAULT_INSTANCE.createBuilder(renderingOptions);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExecuteActionIds(int i, java.lang.String str) {
            ensureExecuteActionIdsIsMutable();
            this.executeActionIds_.set(i, str);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.DEFAULT_INSTANCE);
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        PREVIEW_PRESET_UNKNOWN(0),
        PREVIEW_PRESET_ACCOUNT_NUMBER_PANE(1),
        PREVIEW_PRESET_ACCOUNT_SELECT_PANE(2),
        PREVIEW_PRESET_CONNECTED_PANE(3),
        PREVIEW_PRESET_CREDENTIAL_PANE(4),
        PREVIEW_PRESET_ERROR_PANE(5),
        PREVIEW_PRESET_EUCONSENT_PANE(6),
        PREVIEW_PRESET_EXIT_PANE(7),
        PREVIEW_PRESET_INSTITUTION_SEARCH_PANE(8),
        PREVIEW_PRESET_INSTITUTION_SELECT_PANE(9),
        PREVIEW_PRESET_LOADING_PANE(10),
        PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_START_PANE(11),
        PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_REVIEW_PANE(13),
        PREVIEW_PRESET_MFA_DEVICE_PANE(14),
        PREVIEW_PRESET_MFA_QUESTION_PANE(15),
        PREVIEW_PRESET_MFA_SELECTION_PANE(16),
        PREVIEW_PRESET_OAUTH_LOADING_PANE(17),
        PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE(18),
        PREVIEW_PRESET_RECAPTCHA_PANE(19),
        PREVIEW_PRESET_RECONNECTED_PANE(20),
        PREVIEW_PRESET_ROUTING_NUMBER_PANE(21),
        PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_PANE(22),
        PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_UPDATE_PANE(23),
        PREVIEW_PRESET_EU_EDUCATION_PANE(24),
        PREVIEW_PRESET_WEB3_PINNED_WALLETS_PANE(25),
        PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE(26),
        PREVIEW_PRESET_DTM_PANE(27),
        PREVIEW_PRESET_LAYER_CONSENT_PANE(28),
        UNRECOGNIZED(-1);

        public static final int PREVIEW_PRESET_ACCOUNT_NUMBER_PANE_VALUE = 1;
        public static final int PREVIEW_PRESET_ACCOUNT_SELECT_PANE_VALUE = 2;
        public static final int PREVIEW_PRESET_CONNECTED_PANE_VALUE = 3;
        public static final int PREVIEW_PRESET_CREDENTIAL_PANE_VALUE = 4;
        public static final int PREVIEW_PRESET_DTM_PANE_VALUE = 27;
        public static final int PREVIEW_PRESET_ERROR_PANE_VALUE = 5;
        public static final int PREVIEW_PRESET_EUCONSENT_PANE_VALUE = 6;
        public static final int PREVIEW_PRESET_EU_EDUCATION_PANE_VALUE = 24;
        public static final int PREVIEW_PRESET_EXIT_PANE_VALUE = 7;
        public static final int PREVIEW_PRESET_INSTITUTION_SEARCH_PANE_VALUE = 8;
        public static final int PREVIEW_PRESET_INSTITUTION_SELECT_PANE_VALUE = 9;
        public static final int PREVIEW_PRESET_LAYER_CONSENT_PANE_VALUE = 28;
        public static final int PREVIEW_PRESET_LOADING_PANE_VALUE = 10;
        public static final int PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_REVIEW_PANE_VALUE = 13;
        public static final int PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_START_PANE_VALUE = 11;
        public static final int PREVIEW_PRESET_MFA_DEVICE_PANE_VALUE = 14;
        public static final int PREVIEW_PRESET_MFA_QUESTION_PANE_VALUE = 15;
        public static final int PREVIEW_PRESET_MFA_SELECTION_PANE_VALUE = 16;
        public static final int PREVIEW_PRESET_OAUTH_LOADING_PANE_VALUE = 17;
        public static final int PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE_VALUE = 18;
        public static final int PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_PANE_VALUE = 22;
        public static final int PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_UPDATE_PANE_VALUE = 23;
        public static final int PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE_VALUE = 26;
        public static final int PREVIEW_PRESET_RECAPTCHA_PANE_VALUE = 19;
        public static final int PREVIEW_PRESET_RECONNECTED_PANE_VALUE = 20;
        public static final int PREVIEW_PRESET_ROUTING_NUMBER_PANE_VALUE = 21;
        public static final int PREVIEW_PRESET_UNKNOWN_VALUE = 0;
        public static final int PREVIEW_PRESET_WEB3_PINNED_WALLETS_PANE_VALUE = 25;
        public static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.b.a b = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6348a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$b$b, reason: collision with other inner class name */
        public static final class C0193b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.C0193b f6349a = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.C0193b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.f6348a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b forNumber(int i) {
            switch (i) {
                case 0:
                    return PREVIEW_PRESET_UNKNOWN;
                case 1:
                    return PREVIEW_PRESET_ACCOUNT_NUMBER_PANE;
                case 2:
                    return PREVIEW_PRESET_ACCOUNT_SELECT_PANE;
                case 3:
                    return PREVIEW_PRESET_CONNECTED_PANE;
                case 4:
                    return PREVIEW_PRESET_CREDENTIAL_PANE;
                case 5:
                    return PREVIEW_PRESET_ERROR_PANE;
                case 6:
                    return PREVIEW_PRESET_EUCONSENT_PANE;
                case 7:
                    return PREVIEW_PRESET_EXIT_PANE;
                case 8:
                    return PREVIEW_PRESET_INSTITUTION_SEARCH_PANE;
                case 9:
                    return PREVIEW_PRESET_INSTITUTION_SELECT_PANE;
                case 10:
                    return PREVIEW_PRESET_LOADING_PANE;
                case 11:
                    return PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_START_PANE;
                case 12:
                default:
                    return null;
                case 13:
                    return PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_REVIEW_PANE;
                case 14:
                    return PREVIEW_PRESET_MFA_DEVICE_PANE;
                case 15:
                    return PREVIEW_PRESET_MFA_QUESTION_PANE;
                case 16:
                    return PREVIEW_PRESET_MFA_SELECTION_PANE;
                case 17:
                    return PREVIEW_PRESET_OAUTH_LOADING_PANE;
                case 18:
                    return PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE;
                case 19:
                    return PREVIEW_PRESET_RECAPTCHA_PANE;
                case 20:
                    return PREVIEW_PRESET_RECONNECTED_PANE;
                case 21:
                    return PREVIEW_PRESET_ROUTING_NUMBER_PANE;
                case 22:
                    return PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_PANE;
                case 23:
                    return PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_UPDATE_PANE;
                case 24:
                    return PREVIEW_PRESET_EU_EDUCATION_PANE;
                case 25:
                    return PREVIEW_PRESET_WEB3_PINNED_WALLETS_PANE;
                case 26:
                    return PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE;
                case 27:
                    return PREVIEW_PRESET_DTM_PANE;
                case 28:
                    return PREVIEW_PRESET_LAYER_CONSENT_PANE;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.C0193b.f6349a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6348a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum c implements com.google.protobuf.Internal.EnumLite {
        PREVIEW_SCENARIO_UNKNOWN(0),
        PREVIEW_SCENARIO_ACCOUNT_SELECT_V2(1),
        PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM(2),
        PREVIEW_SCENARIO_ENTERING_CODE(3),
        PREVIEW_SCENARIO_NO_RESULTS(4),
        PREVIEW_SCENARIO_UPDATE_MODE(5),
        PREVIEW_SCENARIO_PST_CONSENT(6),
        PREVIEW_SCENARIO_PST_CONSENT_MODAL_OPEN(7),
        PREVIEW_SCENARIO_DTM_MODAL_OPEN(8),
        UNRECOGNIZED(-1);

        public static final int PREVIEW_SCENARIO_ACCOUNT_SELECT_V2_VALUE = 1;
        public static final int PREVIEW_SCENARIO_DTM_MODAL_OPEN_VALUE = 8;
        public static final int PREVIEW_SCENARIO_ENTERING_CODE_VALUE = 3;
        public static final int PREVIEW_SCENARIO_NO_RESULTS_VALUE = 4;
        public static final int PREVIEW_SCENARIO_PST_CONSENT_MODAL_OPEN_VALUE = 7;
        public static final int PREVIEW_SCENARIO_PST_CONSENT_VALUE = 6;
        public static final int PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM_VALUE = 2;
        public static final int PREVIEW_SCENARIO_UNKNOWN_VALUE = 0;
        public static final int PREVIEW_SCENARIO_UPDATE_MODE_VALUE = 5;
        public static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.c.a b = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.c.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6350a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.c.b f6351a = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.c.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c.forNumber(i) != null;
            }
        }

        c(int i) {
            this.f6350a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c forNumber(int i) {
            switch (i) {
                case 0:
                    return PREVIEW_SCENARIO_UNKNOWN;
                case 1:
                    return PREVIEW_SCENARIO_ACCOUNT_SELECT_V2;
                case 2:
                    return PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM;
                case 3:
                    return PREVIEW_SCENARIO_ENTERING_CODE;
                case 4:
                    return PREVIEW_SCENARIO_NO_RESULTS;
                case 5:
                    return PREVIEW_SCENARIO_UPDATE_MODE;
                case 6:
                    return PREVIEW_SCENARIO_PST_CONSENT;
                case 7:
                    return PREVIEW_SCENARIO_PST_CONSENT_MODAL_OPEN;
                case 8:
                    return PREVIEW_SCENARIO_DTM_MODAL_OPEN;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.c.b.f6351a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6350a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview previewOuterClass$Preview = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview();
        DEFAULT_INSTANCE = previewOuterClass$Preview;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.class, previewOuterClass$Preview);
    }

    private PreviewOuterClass$Preview() {
    }

    private void addAllProducts(java.lang.Iterable<java.lang.String> iterable) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.products_);
    }

    private void addProductsBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureProductsIsMutable();
        this.products_.add(byteString.toStringUtf8());
    }

    private void clearCobrandingConfig() {
        this.cobrandingConfig_ = null;
        this.bitField0_ &= -9;
    }

    private void clearError() {
        this.error_ = null;
        this.bitField0_ &= -5;
    }

    private void clearLinkCustomization() {
        this.linkCustomization_ = null;
        this.bitField0_ &= -3;
    }

    private void clearLocale() {
        this.locale_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPreset() {
        this.preset_ = 0;
    }

    private void clearProducts() {
        this.products_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearScenario() {
        this.scenario_ = 0;
    }

    private void ensureProductsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.products_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.products_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPreset(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b bVar) {
        this.preset_ = bVar.getNumber();
    }

    private void setPresetValue(int i) {
        this.preset_ = i;
    }

    private void setScenario(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c cVar) {
        this.scenario_ = cVar.getNumber();
    }

    private void setScenarioValue(int i) {
        this.scenario_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.p.f6380a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\f\u0002\f\u0003Ț\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0003\u0007ဉ\u0002", new java.lang.Object[]{"bitField0_", "preset_", "scenario_", "products_", "locale_", "linkCustomization_", "cobrandingConfig_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig getCobrandingConfig() {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig = this.cobrandingConfig_;
        return cobrandingConfig == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig.getDefaultInstance() : cobrandingConfig;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error getError() {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error = this.error_;
        return error == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error.getDefaultInstance() : error;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization getLinkCustomization() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization = this.linkCustomization_;
        return linkCustomizations$LinkCustomization == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.getDefaultInstance() : linkCustomizations$LinkCustomization;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale getLocale() {
        com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale = this.locale_;
        return localeOuterClass$Locale == null ? com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.getDefaultInstance() : localeOuterClass$Locale;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b getPreset() {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b forNumber = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.forNumber(this.preset_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.UNRECOGNIZED : forNumber;
    }

    public final int getPresetValue() {
        return this.preset_;
    }

    public final java.lang.String getProducts(int i) {
        return this.products_.get(i);
    }

    public final com.google.protobuf.ByteString getProductsBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.products_.get(i));
    }

    public final int getProductsCount() {
        return this.products_.size();
    }

    public final java.util.List<java.lang.String> getProductsList() {
        return this.products_;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c getScenario() {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c forNumber = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c.forNumber(this.scenario_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c.UNRECOGNIZED : forNumber;
    }

    public final int getScenarioValue() {
        return this.scenario_;
    }

    public final boolean hasCobrandingConfig() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasError() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasLinkCustomization() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasLocale() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addProducts(java.lang.String str) {
        ensureProductsIsMutable();
        this.products_.add(str);
    }

    private void mergeCobrandingConfig(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig) {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig2 = this.cobrandingConfig_;
        if (cobrandingConfig2 == null || cobrandingConfig2 == com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig.getDefaultInstance()) {
            this.cobrandingConfig_ = cobrandingConfig;
        } else {
            this.cobrandingConfig_ = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig.newBuilder(this.cobrandingConfig_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.CobrandingConfig.a) cobrandingConfig).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeError(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error) {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error2 = this.error_;
        if (error2 == null || error2 == com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error.getDefaultInstance()) {
            this.error_ = error;
        } else {
            this.error_ = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error.newBuilder(this.error_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.Error.a) error).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeLinkCustomization(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization2 = this.linkCustomization_;
        if (linkCustomizations$LinkCustomization2 == null || linkCustomizations$LinkCustomization2 == com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.getDefaultInstance()) {
            this.linkCustomization_ = linkCustomizations$LinkCustomization;
        } else {
            this.linkCustomization_ = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.newBuilder(this.linkCustomization_).mergeFrom((com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.d) linkCustomizations$LinkCustomization).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeLocale(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale) {
        com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale2 = this.locale_;
        if (localeOuterClass$Locale2 == null || localeOuterClass$Locale2 == com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.getDefaultInstance()) {
            this.locale_ = localeOuterClass$Locale;
        } else {
            this.locale_ = com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.newBuilder(this.locale_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.a) localeOuterClass$Locale).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview previewOuterClass$Preview) {
        return DEFAULT_INSTANCE.createBuilder(previewOuterClass$Preview);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setCobrandingConfig(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig) {
        this.cobrandingConfig_ = cobrandingConfig;
        this.bitField0_ |= 8;
    }

    private void setError(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error) {
        this.error_ = error;
        this.bitField0_ |= 4;
    }

    private void setLinkCustomization(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        this.linkCustomization_ = linkCustomizations$LinkCustomization;
        this.bitField0_ |= 2;
    }

    private void setLocale(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale) {
        this.locale_ = localeOuterClass$Locale;
        this.bitField0_ |= 1;
    }

    private void setProducts(int i, java.lang.String str) {
        ensureProductsIsMutable();
        this.products_.set(i, str);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
