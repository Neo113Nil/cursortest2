package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class PreviewOuterClass$PreviewWrapper extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper> PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 1;
    public static final int PREVIEW_RENDERING_OPTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions previewRenderingOptions_;
    private com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview preview_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper, com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper previewOuterClass$PreviewWrapper = new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper();
        DEFAULT_INSTANCE = previewOuterClass$PreviewWrapper;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper.class, previewOuterClass$PreviewWrapper);
    }

    private PreviewOuterClass$PreviewWrapper() {
    }

    private void clearPreview() {
        this.preview_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPreviewRenderingOptions() {
        this.previewRenderingOptions_ = null;
        this.bitField0_ &= -3;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.p.f6380a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "preview_", "previewRenderingOptions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview getPreview() {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview previewOuterClass$Preview = this.preview_;
        return previewOuterClass$Preview == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.getDefaultInstance() : previewOuterClass$Preview;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions getPreviewRenderingOptions() {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions = this.previewRenderingOptions_;
        return renderingOptions == null ? com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance() : renderingOptions;
    }

    public final boolean hasPreview() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasPreviewRenderingOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    private void mergePreview(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview previewOuterClass$Preview) {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview previewOuterClass$Preview2 = this.preview_;
        if (previewOuterClass$Preview2 == null || previewOuterClass$Preview2 == com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.getDefaultInstance()) {
            this.preview_ = previewOuterClass$Preview;
        } else {
            this.preview_ = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.newBuilder(this.preview_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.a) previewOuterClass$Preview).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergePreviewRenderingOptions(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
        com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions2 = this.previewRenderingOptions_;
        if (renderingOptions2 == null || renderingOptions2 == com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance()) {
            this.previewRenderingOptions_ = renderingOptions;
        } else {
            this.previewRenderingOptions_ = com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions.newBuilder(this.previewRenderingOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass.Preview.RenderingOptions.a) renderingOptions).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper previewOuterClass$PreviewWrapper) {
        return DEFAULT_INSTANCE.createBuilder(previewOuterClass$PreviewWrapper);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setPreview(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview previewOuterClass$Preview) {
        this.preview_ = previewOuterClass$Preview;
        this.bitField0_ |= 1;
    }

    private void setPreviewRenderingOptions(com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
        this.previewRenderingOptions_ = renderingOptions;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
