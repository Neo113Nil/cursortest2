package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowPreviewResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse> PARSER = null;
    public static final int RENDERED_PRESETS_FIELD_NUMBER = 1;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset> renderedPresets_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String requestId_ = "";

    public static final class RenderedPreset extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewResponse.RenderedPreset.a> implements com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.b {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset DEFAULT_INSTANCE;
        public static final int PANE_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset> PARSER = null;
        public static final int PRESET_FIELD_NUMBER = 1;
        public static final int RENDERING_OPTIONS_FIELD_NUMBER = 3;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane_;
        private int preset_;
        private com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewResponse.RenderedPreset.a> implements com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.b {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset renderedPreset = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset();
            DEFAULT_INSTANCE = renderedPreset;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset.class, renderedPreset);
        }

        private RenderedPreset() {
        }

        private void clearPane() {
            this.pane_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPreset() {
            this.preset_ = 0;
        }

        private void clearRenderingOptions() {
            this.renderingOptions_ = null;
            this.bitField0_ &= -3;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewResponse.RenderedPreset.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPreset(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b bVar) {
            this.preset_ = bVar.getNumber();
        }

        private void setPresetValue(int i) {
            this.preset_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewResponse.RenderedPreset.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"bitField0_", "preset_", "pane_", "renderingOptions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering getPane() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering = this.pane_;
            return pane$PaneRendering == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.getDefaultInstance() : pane$PaneRendering;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b getPreset() {
            com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b forNumber = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.forNumber(this.preset_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.b.UNRECOGNIZED : forNumber;
        }

        public final int getPresetValue() {
            return this.preset_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions getRenderingOptions() {
            com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions = this.renderingOptions_;
            return renderingOptions == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance() : renderingOptions;
        }

        public final boolean hasPane() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasRenderingOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergePane(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering2 = this.pane_;
            if (pane$PaneRendering2 == null || pane$PaneRendering2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.getDefaultInstance()) {
                this.pane_ = pane$PaneRendering;
            } else {
                this.pane_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.newBuilder(this.pane_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.a) pane$PaneRendering).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeRenderingOptions(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
            com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions2 = this.renderingOptions_;
            if (renderingOptions2 == null || renderingOptions2 == com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance()) {
                this.renderingOptions_ = renderingOptions;
            } else {
                this.renderingOptions_ = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.newBuilder(this.renderingOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.RenderingOptions.a) renderingOptions).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPreviewResponse.RenderedPreset.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset renderedPreset) {
            return DEFAULT_INSTANCE.createBuilder(renderedPreset);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setPane(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
            this.pane_ = pane$PaneRendering;
            this.bitField0_ |= 1;
        }

        private void setRenderingOptions(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
            this.renderingOptions_ = renderingOptions;
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.DEFAULT_INSTANCE);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse workflow$LinkWorkflowPreviewResponse = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPreviewResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.class, workflow$LinkWorkflowPreviewResponse);
    }

    private Workflow$LinkWorkflowPreviewResponse() {
    }

    private void addAllRenderedPresets(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset> iterable) {
        ensureRenderedPresetsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.renderedPresets_);
    }

    private void clearRenderedPresets() {
        this.renderedPresets_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void ensureRenderedPresetsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset> protobufList = this.renderedPresets_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.renderedPresets_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRenderedPresets(int i) {
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.remove(i);
    }

    private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new java.lang.Object[]{"renderedPresets_", com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset.class, "requestId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.class) {
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

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset getRenderedPresets(int i) {
        return this.renderedPresets_.get(i);
    }

    public final int getRenderedPresetsCount() {
        return this.renderedPresets_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset> getRenderedPresetsList() {
        return this.renderedPresets_;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.b getRenderedPresetsOrBuilder(int i) {
        return this.renderedPresets_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.b> getRenderedPresetsOrBuilderList() {
        return this.renderedPresets_;
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    private void addRenderedPresets(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset renderedPreset) {
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.add(renderedPreset);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse workflow$LinkWorkflowPreviewResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPreviewResponse);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setRenderedPresets(int i, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset renderedPreset) {
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.set(i, renderedPreset);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setRequestId(java.lang.String str) {
        this.requestId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addRenderedPresets(int i, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse.RenderedPreset renderedPreset) {
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.add(i, renderedPreset);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
