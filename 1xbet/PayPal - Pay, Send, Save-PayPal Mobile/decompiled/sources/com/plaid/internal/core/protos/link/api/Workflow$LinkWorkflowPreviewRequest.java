package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowPreviewRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int COBRANDING_CONFIG_FIELD_NUMBER = 5;
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 6;
    public static final int LINK_CUSTOMIZATION_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest> PARSER = null;
    public static final int PRESET_REQUESTS_FIELD_NUMBER = 1;
    public static final int PRODUCTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig_;
    private com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error_;
    private com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomization_;
    private com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale locale_;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest> presetRequests_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> products_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class PresetRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewRequest.PresetRequest.a> implements com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.b {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest> PARSER = null;
        public static final int PRESET_FIELD_NUMBER = 1;
        public static final int SCENARIO_FIELD_NUMBER = 2;
        private int preset_;
        private int scenario_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewRequest.PresetRequest.a> implements com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.b {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest presetRequest = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest();
            DEFAULT_INSTANCE = presetRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest.class, presetRequest);
        }

        private PresetRequest() {
        }

        private void clearPreset() {
            this.preset_ = 0;
        }

        private void clearScenario() {
            this.scenario_ = 0;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewRequest.PresetRequest.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest> parser() {
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
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewRequest.PresetRequest.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new java.lang.Object[]{"preset_", "scenario_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b getPreset() {
            com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b forNumber = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.forNumber(this.preset_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.UNRECOGNIZED : forNumber;
        }

        public final int getPresetValue() {
            return this.preset_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c getScenario() {
            com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c forNumber = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c.forNumber(this.scenario_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.c.UNRECOGNIZED : forNumber;
        }

        public final int getScenarioValue() {
            return this.scenario_;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewRequest.PresetRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest presetRequest) {
            return DEFAULT_INSTANCE.createBuilder(presetRequest);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.DEFAULT_INSTANCE);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest workflow$LinkWorkflowPreviewRequest = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPreviewRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.class, workflow$LinkWorkflowPreviewRequest);
    }

    private Workflow$LinkWorkflowPreviewRequest() {
    }

    private void addAllPresetRequests(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest> iterable) {
        ensurePresetRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.presetRequests_);
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
        this.bitField0_ &= -5;
    }

    private void clearError() {
        this.error_ = null;
        this.bitField0_ &= -9;
    }

    private void clearLinkCustomization() {
        this.linkCustomization_ = null;
        this.bitField0_ &= -2;
    }

    private void clearLocale() {
        this.locale_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPresetRequests() {
        this.presetRequests_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearProducts() {
        this.products_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePresetRequestsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest> protobufList = this.presetRequests_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.presetRequests_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureProductsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.products_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.products_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePresetRequests(int i) {
        ensurePresetRequestsIsMutable();
        this.presetRequests_.remove(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003Ț\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new java.lang.Object[]{"bitField0_", "presetRequests_", com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest.class, "linkCustomization_", "products_", "locale_", "cobrandingConfig_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.class) {
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

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest getPresetRequests(int i) {
        return this.presetRequests_.get(i);
    }

    public final int getPresetRequestsCount() {
        return this.presetRequests_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest> getPresetRequestsList() {
        return this.presetRequests_;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.b getPresetRequestsOrBuilder(int i) {
        return this.presetRequests_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.b> getPresetRequestsOrBuilderList() {
        return this.presetRequests_;
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

    public final boolean hasCobrandingConfig() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasError() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasLinkCustomization() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasLocale() {
        return (this.bitField0_ & 2) != 0;
    }

    private void addPresetRequests(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest presetRequest) {
        ensurePresetRequestsIsMutable();
        this.presetRequests_.add(presetRequest);
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
        this.bitField0_ |= 4;
    }

    private void mergeError(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error) {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error2 = this.error_;
        if (error2 == null || error2 == com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error.getDefaultInstance()) {
            this.error_ = error;
        } else {
            this.error_ = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error.newBuilder(this.error_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.Error.a) error).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeLinkCustomization(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization2 = this.linkCustomization_;
        if (linkCustomizations$LinkCustomization2 == null || linkCustomizations$LinkCustomization2 == com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.getDefaultInstance()) {
            this.linkCustomization_ = linkCustomizations$LinkCustomization;
        } else {
            this.linkCustomization_ = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.newBuilder(this.linkCustomization_).mergeFrom((com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.d) linkCustomizations$LinkCustomization).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeLocale(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale) {
        com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale2 = this.locale_;
        if (localeOuterClass$Locale2 == null || localeOuterClass$Locale2 == com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.getDefaultInstance()) {
            this.locale_ = localeOuterClass$Locale;
        } else {
            this.locale_ = com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.newBuilder(this.locale_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.a) localeOuterClass$Locale).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest workflow$LinkWorkflowPreviewRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPreviewRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setCobrandingConfig(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig) {
        this.cobrandingConfig_ = cobrandingConfig;
        this.bitField0_ |= 4;
    }

    private void setError(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.Error error) {
        this.error_ = error;
        this.bitField0_ |= 8;
    }

    private void setLinkCustomization(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        this.linkCustomization_ = linkCustomizations$LinkCustomization;
        this.bitField0_ |= 1;
    }

    private void setLocale(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale) {
        this.locale_ = localeOuterClass$Locale;
        this.bitField0_ |= 2;
    }

    private void setPresetRequests(int i, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest presetRequest) {
        ensurePresetRequestsIsMutable();
        this.presetRequests_.set(i, presetRequest);
    }

    private void setProducts(int i, java.lang.String str) {
        ensureProductsIsMutable();
        this.products_.set(i, str);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addPresetRequests(int i, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest.PresetRequest presetRequest) {
        ensurePresetRequestsIsMutable();
        this.presetRequests_.add(i, presetRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
