package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowStartRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CLIENT_CAPABILITIES_FIELD_NUMBER = 10;
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 2;
    public static final int EMBEDDED_LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 14;
    public static final int FORCED_VARIANTS_FIELD_NUMBER = 8;
    public static final int IS_EAGER_START_FIELD_NUMBER = 11;
    public static final int LINK_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 6;
    public static final int OAUTH_CONTINUATION_FIELD_NUMBER = 7;
    public static final int OPEN_STARTED_AT_FIELD_NUMBER = 13;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest> PARSER = null;
    public static final int SDK_METADATA_FIELD_NUMBER = 1;
    public static final int SESSION_HANDOFF_CONTINUATION_FIELD_NUMBER = 12;
    public static final int WORKFLOW_OVERRIDE_FIELD_NUMBER = 15;
    public static final int WORKFLOW_VERSION_OVERRIDE_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities clientCapabilities_;
    private java.lang.Object configuration_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata deviceMetadata_;
    private boolean isEagerStart_;
    private com.google.protobuf.Timestamp openStartedAt_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata sdkMetadata_;
    private int configurationCase_ = 0;
    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> forcedVariants_ = com.google.protobuf.MapFieldLite.emptyMapField();
    private java.lang.String workflowVersionOverride_ = "";
    private java.lang.String workflowOverride_ = "";

    public static final class OAuthContinuation extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation DEFAULT_INSTANCE;
        public static final int LEGACY_FIELD_NUMBER = 3;
        public static final int LEGACY_ITEM_ADD_TOKEN_FIELD_NUMBER = 4;
        public static final int LINK_TOKEN_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation> PARSER = null;
        public static final int RESPONSE_REDIRECT_URI_FIELD_NUMBER = 1;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation legacyItemAddToken_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation legacy_;
        private java.lang.String responseRedirectUri_ = "";
        private java.lang.String linkToken_ = "";

        public static final class LegacyContinuation extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation DEFAULT_INSTANCE;
            public static final int OAUTH_NONCE_FIELD_NUMBER = 2;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation> PARSER;
            private java.lang.String oauthStateId_ = "";
            private java.lang.String oauthNonce_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.DEFAULT_INSTANCE);
                }

                public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a a(java.lang.String str) {
                    copyOnWrite();
                    ((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) this.instance).setOauthNonce(str);
                    return this;
                }

                public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a b(java.lang.String str) {
                    copyOnWrite();
                    ((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) this.instance).setOauthStateId(str);
                    return this;
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation legacyContinuation = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation();
                DEFAULT_INSTANCE = legacyContinuation;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.class, legacyContinuation);
            }

            private LegacyContinuation() {
            }

            private void clearOauthNonce() {
                this.oauthNonce_ = getDefaultInstance().getOauthNonce();
            }

            private void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setOauthNonceBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthNonce_ = byteString.toStringUtf8();
            }

            private void setOauthStateIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"oauthStateId_", "oauthNonce_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.class) {
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

            public final java.lang.String getOauthNonce() {
                return this.oauthNonce_;
            }

            public final com.google.protobuf.ByteString getOauthNonceBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.oauthNonce_);
            }

            public final java.lang.String getOauthStateId() {
                return this.oauthStateId_;
            }

            public final com.google.protobuf.ByteString getOauthStateIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.oauthStateId_);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation legacyContinuation) {
                return DEFAULT_INSTANCE.createBuilder(legacyContinuation);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthNonce(java.lang.String str) {
                this.oauthNonce_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthStateId(java.lang.String str) {
                this.oauthStateId_ = str;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LegacyItemAddContinuation extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation DEFAULT_INSTANCE;
            public static final int ITEM_ADD_TOKEN_FIELD_NUMBER = 2;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation> PARSER;
            private java.lang.String oauthStateId_ = "";
            private java.lang.String itemAddToken_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation legacyItemAddContinuation = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation();
                DEFAULT_INSTANCE = legacyItemAddContinuation;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.class, legacyItemAddContinuation);
            }

            private LegacyItemAddContinuation() {
            }

            private void clearItemAddToken() {
                this.itemAddToken_ = getDefaultInstance().getItemAddToken();
            }

            private void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setItemAddTokenBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.itemAddToken_ = byteString.toStringUtf8();
            }

            private void setOauthStateIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"oauthStateId_", "itemAddToken_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.class) {
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

            public final java.lang.String getItemAddToken() {
                return this.itemAddToken_;
            }

            public final com.google.protobuf.ByteString getItemAddTokenBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.itemAddToken_);
            }

            public final java.lang.String getOauthStateId() {
                return this.oauthStateId_;
            }

            public final com.google.protobuf.ByteString getOauthStateIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.oauthStateId_);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation legacyItemAddContinuation) {
                return DEFAULT_INSTANCE.createBuilder(legacyItemAddContinuation);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setItemAddToken(java.lang.String str) {
                this.itemAddToken_ = str;
            }

            private void setOauthStateId(java.lang.String str) {
                this.oauthStateId_ = str;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation oAuthContinuation = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation();
            DEFAULT_INSTANCE = oAuthContinuation;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation.class, oAuthContinuation);
        }

        private OAuthContinuation() {
        }

        private void clearLegacy() {
            this.legacy_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLegacyItemAddToken() {
            this.legacyItemAddToken_ = null;
            this.bitField0_ &= -3;
        }

        private void clearLinkToken() {
            this.linkToken_ = getDefaultInstance().getLinkToken();
        }

        private void clearResponseRedirectUri() {
            this.responseRedirectUri_ = getDefaultInstance().getResponseRedirectUri();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLinkTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.linkToken_ = byteString.toStringUtf8();
        }

        private void setResponseRedirectUriBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.responseRedirectUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new java.lang.Object[]{"bitField0_", "responseRedirectUri_", "linkToken_", "legacy_", "legacyItemAddToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation.class) {
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

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation getLegacy() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation legacyContinuation = this.legacy_;
            return legacyContinuation == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.getDefaultInstance() : legacyContinuation;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation getLegacyItemAddToken() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation legacyItemAddContinuation = this.legacyItemAddToken_;
            return legacyItemAddContinuation == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.getDefaultInstance() : legacyItemAddContinuation;
        }

        public final java.lang.String getLinkToken() {
            return this.linkToken_;
        }

        public final com.google.protobuf.ByteString getLinkTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.linkToken_);
        }

        public final java.lang.String getResponseRedirectUri() {
            return this.responseRedirectUri_;
        }

        public final com.google.protobuf.ByteString getResponseRedirectUriBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.responseRedirectUri_);
        }

        public final boolean hasLegacy() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasLegacyItemAddToken() {
            return (this.bitField0_ & 2) != 0;
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation.DEFAULT_INSTANCE);
            }

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a a(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) this.instance).setLinkToken(str);
                return this;
            }

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a b(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) this.instance).setResponseRedirectUri(str);
                return this;
            }

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a a(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a aVar) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) this.instance).setLegacy(aVar.build());
                return this;
            }
        }

        private void mergeLegacy(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation legacyContinuation) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation legacyContinuation2 = this.legacy_;
            if (legacyContinuation2 == null || legacyContinuation2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.getDefaultInstance()) {
                this.legacy_ = legacyContinuation;
            } else {
                this.legacy_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.newBuilder(this.legacy_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a) legacyContinuation).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeLegacyItemAddToken(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation legacyItemAddContinuation) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation legacyItemAddContinuation2 = this.legacyItemAddToken_;
            if (legacyItemAddContinuation2 == null || legacyItemAddContinuation2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.getDefaultInstance()) {
                this.legacyItemAddToken_ = legacyItemAddContinuation;
            } else {
                this.legacyItemAddToken_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.newBuilder(this.legacyItemAddToken_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation.a) legacyItemAddContinuation).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation oAuthContinuation) {
            return DEFAULT_INSTANCE.createBuilder(oAuthContinuation);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacy(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation legacyContinuation) {
            this.legacy_ = legacyContinuation;
            this.bitField0_ |= 1;
        }

        private void setLegacyItemAddToken(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.LegacyItemAddContinuation legacyItemAddContinuation) {
            this.legacyItemAddToken_ = legacyItemAddContinuation;
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkToken(java.lang.String str) {
            this.linkToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponseRedirectUri(java.lang.String str) {
            this.responseRedirectUri_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SessionHandoffContinuation extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.SessionHandoffContinuation.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation> PARSER = null;
        public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
        private java.lang.String workflowSessionId_ = "";
        private java.lang.String continuationToken_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.SessionHandoffContinuation.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation sessionHandoffContinuation = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation();
            DEFAULT_INSTANCE = sessionHandoffContinuation;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation.class, sessionHandoffContinuation);
        }

        private SessionHandoffContinuation() {
        }

        private void clearContinuationToken() {
            this.continuationToken_ = getDefaultInstance().getContinuationToken();
        }

        private void clearWorkflowSessionId() {
            this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.SessionHandoffContinuation.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContinuationTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.continuationToken_ = byteString.toStringUtf8();
        }

        private void setWorkflowSessionIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.workflowSessionId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.SessionHandoffContinuation.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"workflowSessionId_", "continuationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation.class) {
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

        public final java.lang.String getContinuationToken() {
            return this.continuationToken_;
        }

        public final com.google.protobuf.ByteString getContinuationTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.continuationToken_);
        }

        public final java.lang.String getWorkflowSessionId() {
            return this.workflowSessionId_;
        }

        public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.SessionHandoffContinuation.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation sessionHandoffContinuation) {
            return DEFAULT_INSTANCE.createBuilder(sessionHandoffContinuation);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setContinuationToken(java.lang.String str) {
            this.continuationToken_ = str;
        }

        private void setWorkflowSessionId(java.lang.String str) {
            this.workflowSessionId_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum b {
        LINK_CONFIGURATION(4),
        LINK_TOKEN_CONFIGURATION(6),
        OAUTH_CONTINUATION(7),
        SESSION_HANDOFF_CONTINUATION(12),
        EMBEDDED_LINK_TOKEN_CONFIGURATION(14),
        CONFIGURATION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6064a;

        b(int i) {
            this.f6064a = i;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.b forNumber(int i) {
            if (i == 0) {
                return CONFIGURATION_NOT_SET;
            }
            if (i == 4) {
                return LINK_CONFIGURATION;
            }
            if (i == 12) {
                return SESSION_HANDOFF_CONTINUATION;
            }
            if (i == 14) {
                return EMBEDDED_LINK_TOKEN_CONFIGURATION;
            }
            if (i == 6) {
                return LINK_TOKEN_CONFIGURATION;
            }
            if (i != 7) {
                return null;
            }
            return OAUTH_CONTINUATION;
        }

        public final int getNumber() {
            return this.f6064a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.b valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final com.google.protobuf.MapEntryLite<java.lang.String, java.lang.String> f6065a;

        static {
            com.google.protobuf.WireFormat.FieldType fieldType = com.google.protobuf.WireFormat.FieldType.STRING;
            f6065a = com.google.protobuf.MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowStartRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.class, workflow$LinkWorkflowStartRequest);
    }

    private Workflow$LinkWorkflowStartRequest() {
    }

    private void clearClientCapabilities() {
        this.clientCapabilities_ = null;
        this.bitField0_ &= -5;
    }

    private void clearConfiguration() {
        this.configurationCase_ = 0;
        this.configuration_ = null;
    }

    private void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearEmbeddedLinkTokenConfiguration() {
        if (this.configurationCase_ == 14) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearIsEagerStart() {
        this.isEagerStart_ = false;
    }

    private void clearLinkConfiguration() {
        if (this.configurationCase_ == 4) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearLinkTokenConfiguration() {
        if (this.configurationCase_ == 6) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearOauthContinuation() {
        if (this.configurationCase_ == 7) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearOpenStartedAt() {
        this.openStartedAt_ = null;
        this.bitField0_ &= -9;
    }

    private void clearSdkMetadata() {
        this.sdkMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSessionHandoffContinuation() {
        if (this.configurationCase_ == 12) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearWorkflowOverride() {
        this.workflowOverride_ = getDefaultInstance().getWorkflowOverride();
    }

    private void clearWorkflowVersionOverride() {
        this.workflowVersionOverride_ = getDefaultInstance().getWorkflowVersionOverride();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private java.util.Map<java.lang.String, java.lang.String> getMutableForcedVariantsMap() {
        return internalGetMutableForcedVariants();
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetForcedVariants() {
        return this.forcedVariants_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetMutableForcedVariants() {
        if (!this.forcedVariants_.isMutable()) {
            this.forcedVariants_ = this.forcedVariants_.mutableCopy();
        }
        return this.forcedVariants_;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIsEagerStart(boolean z) {
        this.isEagerStart_ = z;
    }

    private void setWorkflowOverrideBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowOverride_ = byteString.toStringUtf8();
    }

    private void setWorkflowVersionOverrideBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowVersionOverride_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0001\u0001\u000f\r\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004<\u0000\u0005Ȉ\u0006<\u0000\u0007<\u0000\b2\nဉ\u0002\u000b\u0007\f<\u0000\rဉ\u0003\u000e<\u0000\u000fȈ", new java.lang.Object[]{"configuration_", "configurationCase_", "bitField0_", "sdkMetadata_", "deviceMetadata_", com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.class, "workflowVersionOverride_", com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.class, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation.class, "forcedVariants_", com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.c.f6065a, "clientCapabilities_", "isEagerStart_", com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation.class, "openStartedAt_", com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.class, "workflowOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities getClientCapabilities() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities configuration$ClientCapabilities = this.clientCapabilities_;
        return configuration$ClientCapabilities == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.getDefaultInstance() : configuration$ClientCapabilities;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.b getConfigurationCase() {
        return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.b.forNumber(this.configurationCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata getDeviceMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata = this.deviceMetadata_;
        return configuration$DeviceMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.getDefaultInstance() : configuration$DeviceMetadata;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration getEmbeddedLinkTokenConfiguration() {
        return this.configurationCase_ == 14 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) this.configuration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance();
    }

    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, java.lang.String> getForcedVariants() {
        return getForcedVariantsMap();
    }

    public final int getForcedVariantsCount() {
        return internalGetForcedVariants().size();
    }

    public final java.util.Map<java.lang.String, java.lang.String> getForcedVariantsMap() {
        return java.util.Collections.unmodifiableMap(internalGetForcedVariants());
    }

    public final boolean getIsEagerStart() {
        return this.isEagerStart_;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration getLinkConfiguration() {
        return this.configurationCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) this.configuration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration getLinkTokenConfiguration() {
        return this.configurationCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.configuration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation getOauthContinuation() {
        return this.configurationCase_ == 7 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) this.configuration_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation.getDefaultInstance();
    }

    public final com.google.protobuf.Timestamp getOpenStartedAt() {
        com.google.protobuf.Timestamp timestamp = this.openStartedAt_;
        return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata getSdkMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
        return configuration$SDKMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation getSessionHandoffContinuation() {
        return this.configurationCase_ == 12 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) this.configuration_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation.getDefaultInstance();
    }

    public final java.lang.String getWorkflowOverride() {
        return this.workflowOverride_;
    }

    public final com.google.protobuf.ByteString getWorkflowOverrideBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowOverride_);
    }

    public final java.lang.String getWorkflowVersionOverride() {
        return this.workflowVersionOverride_;
    }

    public final com.google.protobuf.ByteString getWorkflowVersionOverrideBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowVersionOverride_);
    }

    public final boolean hasClientCapabilities() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasDeviceMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasEmbeddedLinkTokenConfiguration() {
        return this.configurationCase_ == 14;
    }

    public final boolean hasLinkConfiguration() {
        return this.configurationCase_ == 4;
    }

    public final boolean hasLinkTokenConfiguration() {
        return this.configurationCase_ == 6;
    }

    public final boolean hasOauthContinuation() {
        return this.configurationCase_ == 7;
    }

    public final boolean hasOpenStartedAt() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasSdkMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasSessionHandoffContinuation() {
        return this.configurationCase_ == 12;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setSdkMetadata(configuration$SDKMetadata);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setDeviceMetadata(configuration$DeviceMetadata);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities configuration$ClientCapabilities) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setClientCapabilities(configuration$ClientCapabilities);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setLinkTokenConfiguration(configuration$LinkTokenConfiguration);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a aVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setLinkTokenConfiguration(aVar.build());
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a aVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setOauthContinuation(aVar.build());
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a aVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setEmbeddedLinkTokenConfiguration(aVar.build());
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setWorkflowVersionOverride(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a a(com.google.protobuf.Timestamp timestamp) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) this.instance).setOpenStartedAt(timestamp);
            return this;
        }
    }

    private void mergeClientCapabilities(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities configuration$ClientCapabilities) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities configuration$ClientCapabilities2 = this.clientCapabilities_;
        if (configuration$ClientCapabilities2 == null || configuration$ClientCapabilities2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.getDefaultInstance()) {
            this.clientCapabilities_ = configuration$ClientCapabilities;
        } else {
            this.clientCapabilities_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.newBuilder(this.clientCapabilities_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.a) configuration$ClientCapabilities).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeDeviceMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata2 = this.deviceMetadata_;
        if (configuration$DeviceMetadata2 == null || configuration$DeviceMetadata2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.getDefaultInstance()) {
            this.deviceMetadata_ = configuration$DeviceMetadata;
        } else {
            this.deviceMetadata_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.newBuilder(this.deviceMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.a) configuration$DeviceMetadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeEmbeddedLinkTokenConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        if (this.configurationCase_ != 14 || this.configuration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance()) {
            this.configuration_ = configuration$EmbeddedLinkTokenConfiguration;
        } else {
            this.configuration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) this.configuration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a) configuration$EmbeddedLinkTokenConfiguration).buildPartial();
        }
        this.configurationCase_ = 14;
    }

    private void mergeLinkConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration configuration$LinkConfiguration) {
        if (this.configurationCase_ != 4 || this.configuration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.getDefaultInstance()) {
            this.configuration_ = configuration$LinkConfiguration;
        } else {
            this.configuration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) this.configuration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.b) configuration$LinkConfiguration).buildPartial();
        }
        this.configurationCase_ = 4;
    }

    private void mergeLinkTokenConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        if (this.configurationCase_ != 6 || this.configuration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.getDefaultInstance()) {
            this.configuration_ = configuration$LinkTokenConfiguration;
        } else {
            this.configuration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.configuration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a) configuration$LinkTokenConfiguration).buildPartial();
        }
        this.configurationCase_ = 6;
    }

    private void mergeOauthContinuation(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation oAuthContinuation) {
        if (this.configurationCase_ != 7 || this.configuration_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation.getDefaultInstance()) {
            this.configuration_ = oAuthContinuation;
        } else {
            this.configuration_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation) this.configuration_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.OAuthContinuation.a) oAuthContinuation).buildPartial();
        }
        this.configurationCase_ = 7;
    }

    private void mergeOpenStartedAt(com.google.protobuf.Timestamp timestamp) {
        com.google.protobuf.Timestamp timestamp2 = this.openStartedAt_;
        if (timestamp2 == null || timestamp2 == com.google.protobuf.Timestamp.getDefaultInstance()) {
            this.openStartedAt_ = timestamp;
        } else {
            this.openStartedAt_ = com.google.protobuf.Timestamp.newBuilder(this.openStartedAt_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeSdkMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
        if (configuration$SDKMetadata2 == null || configuration$SDKMetadata2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.getDefaultInstance()) {
            this.sdkMetadata_ = configuration$SDKMetadata;
        } else {
            this.sdkMetadata_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a) configuration$SDKMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeSessionHandoffContinuation(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation sessionHandoffContinuation) {
        if (this.configurationCase_ != 12 || this.configuration_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation.getDefaultInstance()) {
            this.configuration_ = sessionHandoffContinuation;
        } else {
            this.configuration_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation) this.configuration_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartRequest.SessionHandoffContinuation.a) sessionHandoffContinuation).buildPartial();
        }
        this.configurationCase_ = 12;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowStartRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientCapabilities(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities configuration$ClientCapabilities) {
        this.clientCapabilities_ = configuration$ClientCapabilities;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata) {
        this.deviceMetadata_ = configuration$DeviceMetadata;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedLinkTokenConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        this.configuration_ = configuration$EmbeddedLinkTokenConfiguration;
        this.configurationCase_ = 14;
    }

    private void setLinkConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration configuration$LinkConfiguration) {
        this.configuration_ = configuration$LinkConfiguration;
        this.configurationCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkTokenConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        this.configuration_ = configuration$LinkTokenConfiguration;
        this.configurationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthContinuation(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.OAuthContinuation oAuthContinuation) {
        this.configuration_ = oAuthContinuation;
        this.configurationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenStartedAt(com.google.protobuf.Timestamp timestamp) {
        this.openStartedAt_ = timestamp;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata) {
        this.sdkMetadata_ = configuration$SDKMetadata;
        this.bitField0_ |= 1;
    }

    private void setSessionHandoffContinuation(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest.SessionHandoffContinuation sessionHandoffContinuation) {
        this.configuration_ = sessionHandoffContinuation;
        this.configurationCase_ = 12;
    }

    public final boolean containsForcedVariants(java.lang.String str) {
        return internalGetForcedVariants().containsKey(str);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setWorkflowOverride(java.lang.String str) {
        this.workflowOverride_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowVersionOverride(java.lang.String str) {
        this.workflowVersionOverride_ = str;
    }

    public final java.lang.String getForcedVariantsOrDefault(java.lang.String str, java.lang.String str2) {
        com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetForcedVariants = internalGetForcedVariants();
        return internalGetForcedVariants.containsKey(str) ? internalGetForcedVariants.get(str) : str2;
    }

    public final java.lang.String getForcedVariantsOrThrow(java.lang.String str) {
        com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetForcedVariants = internalGetForcedVariants();
        if (internalGetForcedVariants.containsKey(str)) {
            return internalGetForcedVariants.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
