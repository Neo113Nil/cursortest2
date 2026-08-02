package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowPollRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 6;
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest DEFAULT_INSTANCE;
    public static final int EMBEDDED_LINK_UPDATE_AVAILABLE_FIELD_NUMBER = 5;
    public static final int OAUTH_REDIRECT_COMPLETE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest> PARSER = null;
    public static final int PASSKEY_CHALLENGE_GET_FIELD_NUMBER = 7;
    public static final int PASSKEY_REDIRECT_COMPLETE_FIELD_NUMBER = 4;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private java.lang.Object poll_;
    private int pollCase_ = 0;
    private java.lang.String workflowSessionId_ = "";
    private java.lang.String continuationToken_ = "";

    public static final class EmbeddedLinkUpdateAvailable extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable();
            DEFAULT_INSTANCE = embeddedLinkUpdateAvailable;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.class, embeddedLinkUpdateAvailable);
        }

        private EmbeddedLinkUpdateAvailable() {
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.class) {
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

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
            return DEFAULT_INSTANCE.createBuilder(embeddedLinkUpdateAvailable);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuthRedirectComplete extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.OAuthRedirectComplete.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete DEFAULT_INSTANCE;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete> PARSER;
        private java.lang.String oauthStateId_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.OAuthRedirectComplete.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.DEFAULT_INSTANCE);
            }

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.OAuthRedirectComplete.a a(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) this.instance).setOauthStateId(str);
                return this;
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete oAuthRedirectComplete = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete();
            DEFAULT_INSTANCE = oAuthRedirectComplete;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.class, oAuthRedirectComplete);
        }

        private OAuthRedirectComplete() {
        }

        private void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.OAuthRedirectComplete.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.OAuthRedirectComplete.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"oauthStateId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.class) {
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

        public final java.lang.String getOauthStateId() {
            return this.oauthStateId_;
        }

        public final com.google.protobuf.ByteString getOauthStateIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.OAuthRedirectComplete.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete oAuthRedirectComplete) {
            return DEFAULT_INSTANCE.createBuilder(oAuthRedirectComplete);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOauthStateId(java.lang.String str) {
            this.oauthStateId_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PasskeyChallengeGet extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyChallengeGet.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet> PARSER = null;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
        private java.lang.String phoneNumber_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyChallengeGet.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet passkeyChallengeGet = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet();
            DEFAULT_INSTANCE = passkeyChallengeGet;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet.class, passkeyChallengeGet);
        }

        private PasskeyChallengeGet() {
        }

        private void clearPhoneNumber() {
            this.phoneNumber_ = getDefaultInstance().getPhoneNumber();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyChallengeGet.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPhoneNumberBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.phoneNumber_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyChallengeGet.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"phoneNumber_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet.class) {
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

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber_;
        }

        public final com.google.protobuf.ByteString getPhoneNumberBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.phoneNumber_);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyChallengeGet.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet passkeyChallengeGet) {
            return DEFAULT_INSTANCE.createBuilder(passkeyChallengeGet);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setPhoneNumber(java.lang.String str) {
            this.phoneNumber_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PasskeyRedirectComplete extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyRedirectComplete.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyRedirectComplete.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete passkeyRedirectComplete = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete();
            DEFAULT_INSTANCE = passkeyRedirectComplete;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete.class, passkeyRedirectComplete);
        }

        private PasskeyRedirectComplete() {
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyRedirectComplete.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyRedirectComplete.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete.class) {
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

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyRedirectComplete.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete passkeyRedirectComplete) {
            return DEFAULT_INSTANCE.createBuilder(passkeyRedirectComplete);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum b {
        OAUTH_REDIRECT_COMPLETE(2),
        PASSKEY_REDIRECT_COMPLETE(4),
        EMBEDDED_LINK_UPDATE_AVAILABLE(5),
        PASSKEY_CHALLENGE_GET(7),
        POLL_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6062a;

        b(int i) {
            this.f6062a = i;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.b forNumber(int i) {
            if (i == 0) {
                return POLL_NOT_SET;
            }
            if (i == 2) {
                return OAUTH_REDIRECT_COMPLETE;
            }
            if (i == 7) {
                return PASSKEY_CHALLENGE_GET;
            }
            if (i == 4) {
                return PASSKEY_REDIRECT_COMPLETE;
            }
            if (i != 5) {
                return null;
            }
            return EMBEDDED_LINK_UPDATE_AVAILABLE;
        }

        public final int getNumber() {
            return this.f6062a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPollRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.class, workflow$LinkWorkflowPollRequest);
    }

    private Workflow$LinkWorkflowPollRequest() {
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearEmbeddedLinkUpdateAvailable() {
        if (this.pollCase_ == 5) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    private void clearOauthRedirectComplete() {
        if (this.pollCase_ == 2) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    private void clearPasskeyChallengeGet() {
        if (this.pollCase_ == 7) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    private void clearPasskeyRedirectComplete() {
        if (this.pollCase_ == 4) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    private void clearPoll() {
        this.pollCase_ = 0;
        this.poll_ = null;
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest> parser() {
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
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006Ȉ\u0007<\u0000", new java.lang.Object[]{"poll_", "pollCase_", "workflowSessionId_", com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.class, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete.class, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.class, "continuationToken_", com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.class) {
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

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable getEmbeddedLinkUpdateAvailable() {
        return this.pollCase_ == 5 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) this.poll_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete getOauthRedirectComplete() {
        return this.pollCase_ == 2 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) this.poll_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet getPasskeyChallengeGet() {
        return this.pollCase_ == 7 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) this.poll_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete getPasskeyRedirectComplete() {
        return this.pollCase_ == 4 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) this.poll_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.b getPollCase() {
        return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.b.forNumber(this.pollCase_);
    }

    public final java.lang.String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public final boolean hasEmbeddedLinkUpdateAvailable() {
        return this.pollCase_ == 5;
    }

    public final boolean hasOauthRedirectComplete() {
        return this.pollCase_ == 2;
    }

    public final boolean hasPasskeyChallengeGet() {
        return this.pollCase_ == 7;
    }

    public final boolean hasPasskeyRedirectComplete() {
        return this.pollCase_ == 4;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) this.instance).setWorkflowSessionId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.a a(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete oAuthRedirectComplete) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) this.instance).setOauthRedirectComplete(oAuthRedirectComplete);
            return this;
        }
    }

    private void mergeEmbeddedLinkUpdateAvailable(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
        if (this.pollCase_ != 5 || this.poll_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.getDefaultInstance()) {
            this.poll_ = embeddedLinkUpdateAvailable;
        } else {
            this.poll_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable) this.poll_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable.a) embeddedLinkUpdateAvailable).buildPartial();
        }
        this.pollCase_ = 5;
    }

    private void mergeOauthRedirectComplete(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete oAuthRedirectComplete) {
        if (this.pollCase_ != 2 || this.poll_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.getDefaultInstance()) {
            this.poll_ = oAuthRedirectComplete;
        } else {
            this.poll_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete) this.poll_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.OAuthRedirectComplete.a) oAuthRedirectComplete).buildPartial();
        }
        this.pollCase_ = 2;
    }

    private void mergePasskeyChallengeGet(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet passkeyChallengeGet) {
        if (this.pollCase_ != 7 || this.poll_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet.getDefaultInstance()) {
            this.poll_ = passkeyChallengeGet;
        } else {
            this.poll_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet) this.poll_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyChallengeGet.a) passkeyChallengeGet).buildPartial();
        }
        this.pollCase_ = 7;
    }

    private void mergePasskeyRedirectComplete(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete passkeyRedirectComplete) {
        if (this.pollCase_ != 4 || this.poll_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete.getDefaultInstance()) {
            this.poll_ = passkeyRedirectComplete;
        } else {
            this.poll_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete) this.poll_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollRequest.PasskeyRedirectComplete.a) passkeyRedirectComplete).buildPartial();
        }
        this.pollCase_ = 4;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPollRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setEmbeddedLinkUpdateAvailable(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
        this.poll_ = embeddedLinkUpdateAvailable;
        this.pollCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthRedirectComplete(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete oAuthRedirectComplete) {
        this.poll_ = oAuthRedirectComplete;
        this.pollCase_ = 2;
    }

    private void setPasskeyChallengeGet(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyChallengeGet passkeyChallengeGet) {
        this.poll_ = passkeyChallengeGet;
        this.pollCase_ = 7;
    }

    private void setPasskeyRedirectComplete(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.PasskeyRedirectComplete passkeyRedirectComplete) {
        this.poll_ = passkeyRedirectComplete;
        this.pollCase_ = 4;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setContinuationToken(java.lang.String str) {
        this.continuationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowSessionId(java.lang.String str) {
        this.workflowSessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
