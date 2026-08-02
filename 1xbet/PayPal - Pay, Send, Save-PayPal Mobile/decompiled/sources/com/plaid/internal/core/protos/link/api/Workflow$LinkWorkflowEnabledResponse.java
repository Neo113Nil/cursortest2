package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowEnabledResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse DEFAULT_INSTANCE;
    public static final int IS_ENABLED_FIELD_NUMBER = 1;
    public static final int IS_TD_PARALLEL_FETCH_VARIATION_FIELD_NUMBER = 8;
    public static final int LAMBDA_VIEWER_REQUEST_DATA_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int VARIATION_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isEnabled_;
    private boolean isTdParallelFetchVariation_;
    private com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData lambdaViewerRequestData_;
    private java.lang.String requestId_ = "";
    private java.lang.String variation_ = "";

    public static final class LambdaViewerRequestData extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowEnabledResponse.LambdaViewerRequestData.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CONTENT_SECURITY_POLICY_FRAME_ANCESTORS_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData> PARSER;
        private java.lang.String contentSecurityPolicyFrameAncestors_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowEnabledResponse.LambdaViewerRequestData.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData lambdaViewerRequestData = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData();
            DEFAULT_INSTANCE = lambdaViewerRequestData;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData.class, lambdaViewerRequestData);
        }

        private LambdaViewerRequestData() {
        }

        private void clearContentSecurityPolicyFrameAncestors() {
            this.contentSecurityPolicyFrameAncestors_ = getDefaultInstance().getContentSecurityPolicyFrameAncestors();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowEnabledResponse.LambdaViewerRequestData.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContentSecurityPolicyFrameAncestorsBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.contentSecurityPolicyFrameAncestors_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowEnabledResponse.LambdaViewerRequestData.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"contentSecurityPolicyFrameAncestors_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData.class) {
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

        public final java.lang.String getContentSecurityPolicyFrameAncestors() {
            return this.contentSecurityPolicyFrameAncestors_;
        }

        public final com.google.protobuf.ByteString getContentSecurityPolicyFrameAncestorsBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.contentSecurityPolicyFrameAncestors_);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowEnabledResponse.LambdaViewerRequestData.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData lambdaViewerRequestData) {
            return DEFAULT_INSTANCE.createBuilder(lambdaViewerRequestData);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setContentSecurityPolicyFrameAncestors(java.lang.String str) {
            this.contentSecurityPolicyFrameAncestors_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse workflow$LinkWorkflowEnabledResponse = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEnabledResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.class, workflow$LinkWorkflowEnabledResponse);
    }

    private Workflow$LinkWorkflowEnabledResponse() {
    }

    private void clearIsEnabled() {
        this.isEnabled_ = false;
    }

    private void clearIsTdParallelFetchVariation() {
        this.isTdParallelFetchVariation_ = false;
    }

    private void clearLambdaViewerRequestData() {
        this.lambdaViewerRequestData_ = null;
        this.bitField0_ &= -2;
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearVariation() {
        this.variation_ = getDefaultInstance().getVariation();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIsEnabled(boolean z) {
        this.isEnabled_ = z;
    }

    private void setIsTdParallelFetchVariation(boolean z) {
        this.isTdParallelFetchVariation_ = z;
    }

    private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setVariationBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.variation_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0004Ȉ\u0005ဉ\u0000\b\u0007", new java.lang.Object[]{"bitField0_", "isEnabled_", "requestId_", "variation_", "lambdaViewerRequestData_", "isTdParallelFetchVariation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.class) {
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

    public final boolean getIsEnabled() {
        return this.isEnabled_;
    }

    public final boolean getIsTdParallelFetchVariation() {
        return this.isTdParallelFetchVariation_;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData getLambdaViewerRequestData() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData lambdaViewerRequestData = this.lambdaViewerRequestData_;
        return lambdaViewerRequestData == null ? com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData.getDefaultInstance() : lambdaViewerRequestData;
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    public final java.lang.String getVariation() {
        return this.variation_;
    }

    public final com.google.protobuf.ByteString getVariationBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.variation_);
    }

    public final boolean hasLambdaViewerRequestData() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeLambdaViewerRequestData(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData lambdaViewerRequestData) {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData lambdaViewerRequestData2 = this.lambdaViewerRequestData_;
        if (lambdaViewerRequestData2 == null || lambdaViewerRequestData2 == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData.getDefaultInstance()) {
            this.lambdaViewerRequestData_ = lambdaViewerRequestData;
        } else {
            this.lambdaViewerRequestData_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData.newBuilder(this.lambdaViewerRequestData_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowEnabledResponse.LambdaViewerRequestData.a) lambdaViewerRequestData).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse workflow$LinkWorkflowEnabledResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEnabledResponse);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setLambdaViewerRequestData(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse.LambdaViewerRequestData lambdaViewerRequestData) {
        this.lambdaViewerRequestData_ = lambdaViewerRequestData;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setRequestId(java.lang.String str) {
        this.requestId_ = str;
    }

    private void setVariation(java.lang.String str) {
        this.variation_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
