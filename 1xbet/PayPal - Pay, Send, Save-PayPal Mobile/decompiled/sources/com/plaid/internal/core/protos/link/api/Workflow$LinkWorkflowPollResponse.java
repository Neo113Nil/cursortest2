package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowPollResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse DEFAULT_INSTANCE;
    public static final int EMBEDDED_LINK_UPDATE_AVAILABLE_FIELD_NUMBER = 6;
    public static final int OAUTH_REDIRECT_COMPLETE_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse> PARSER = null;
    public static final int PASSKEY_CHALLENGE_GET_FIELD_NUMBER = 7;
    public static final int PASSKEY_REDIRECT_COMPLETE_FIELD_NUMBER = 5;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private java.lang.Object response_;
    private int responseCase_ = 0;
    private java.lang.String workflowSessionId_ = "";
    private java.lang.String requestId_ = "";

    public static final class EmbeddedLinkUpdateAvailable extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable> PARSER = null;
        public static final int UPDATE_AVAILABLE_FIELD_NUMBER = 1;
        private boolean updateAvailable_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable();
            DEFAULT_INSTANCE = embeddedLinkUpdateAvailable;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.class, embeddedLinkUpdateAvailable);
        }

        private EmbeddedLinkUpdateAvailable() {
        }

        private void clearUpdateAvailable() {
            this.updateAvailable_ = false;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setUpdateAvailable(boolean z) {
            this.updateAvailable_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new java.lang.Object[]{"updateAvailable_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.class) {
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

        public final boolean getUpdateAvailable() {
            return this.updateAvailable_;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
            return DEFAULT_INSTANCE.createBuilder(embeddedLinkUpdateAvailable);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuthRedirectComplete extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.OAuthRedirectComplete.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete DEFAULT_INSTANCE;
        public static final int IS_COMPLETE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete> PARSER;
        private boolean isComplete_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.OAuthRedirectComplete.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete oAuthRedirectComplete = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete();
            DEFAULT_INSTANCE = oAuthRedirectComplete;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete.class, oAuthRedirectComplete);
        }

        private OAuthRedirectComplete() {
        }

        private void clearIsComplete() {
            this.isComplete_ = false;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.OAuthRedirectComplete.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsComplete(boolean z) {
            this.isComplete_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.OAuthRedirectComplete.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new java.lang.Object[]{"isComplete_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete.class) {
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

        public final boolean getIsComplete() {
            return this.isComplete_;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.OAuthRedirectComplete.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete oAuthRedirectComplete) {
            return DEFAULT_INSTANCE.createBuilder(oAuthRedirectComplete);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PasskeyChallengeGet extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyChallengeGet.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CHALLENGE_FIELD_NUMBER = 1;
        public static final int CREDENTIAL_IDS_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet DEFAULT_INSTANCE;
        public static final int IS_IN_AUTH_CLAWBACK_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet> PARSER;
        private java.lang.String challenge_ = "";
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> credentialIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private boolean isInAuthClawback_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyChallengeGet.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet passkeyChallengeGet = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet();
            DEFAULT_INSTANCE = passkeyChallengeGet;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet.class, passkeyChallengeGet);
        }

        private PasskeyChallengeGet() {
        }

        private void addAllCredentialIds(java.lang.Iterable<java.lang.String> iterable) {
            ensureCredentialIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.credentialIds_);
        }

        private void addCredentialIdsBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            ensureCredentialIdsIsMutable();
            this.credentialIds_.add(byteString.toStringUtf8());
        }

        private void clearChallenge() {
            this.challenge_ = getDefaultInstance().getChallenge();
        }

        private void clearCredentialIds() {
            this.credentialIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearIsInAuthClawback() {
            this.isInAuthClawback_ = false;
        }

        private void ensureCredentialIdsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.credentialIds_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.credentialIds_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyChallengeGet.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setChallengeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.challenge_ = byteString.toStringUtf8();
        }

        private void setIsInAuthClawback(boolean z) {
            this.isInAuthClawback_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyChallengeGet.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new java.lang.Object[]{"challenge_", "credentialIds_", "isInAuthClawback_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet.class) {
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

        public final java.lang.String getChallenge() {
            return this.challenge_;
        }

        public final com.google.protobuf.ByteString getChallengeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.challenge_);
        }

        public final java.lang.String getCredentialIds(int i) {
            return this.credentialIds_.get(i);
        }

        public final com.google.protobuf.ByteString getCredentialIdsBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.credentialIds_.get(i));
        }

        public final int getCredentialIdsCount() {
            return this.credentialIds_.size();
        }

        public final java.util.List<java.lang.String> getCredentialIdsList() {
            return this.credentialIds_;
        }

        public final boolean getIsInAuthClawback() {
            return this.isInAuthClawback_;
        }

        private void addCredentialIds(java.lang.String str) {
            ensureCredentialIdsIsMutable();
            this.credentialIds_.add(str);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyChallengeGet.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet passkeyChallengeGet) {
            return DEFAULT_INSTANCE.createBuilder(passkeyChallengeGet);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setCredentialIds(int i, java.lang.String str) {
            ensureCredentialIdsIsMutable();
            this.credentialIds_.set(i, str);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setChallenge(java.lang.String str) {
            this.challenge_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PasskeyRedirectComplete extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyRedirectComplete.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete DEFAULT_INSTANCE;
        public static final int IS_COMPLETE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete> PARSER;
        private boolean isComplete_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyRedirectComplete.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete passkeyRedirectComplete = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete();
            DEFAULT_INSTANCE = passkeyRedirectComplete;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete.class, passkeyRedirectComplete);
        }

        private PasskeyRedirectComplete() {
        }

        private void clearIsComplete() {
            this.isComplete_ = false;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyRedirectComplete.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsComplete(boolean z) {
            this.isComplete_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyRedirectComplete.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new java.lang.Object[]{"isComplete_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete.class) {
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

        public final boolean getIsComplete() {
            return this.isComplete_;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyRedirectComplete.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete passkeyRedirectComplete) {
            return DEFAULT_INSTANCE.createBuilder(passkeyRedirectComplete);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        OAUTH_REDIRECT_COMPLETE(3),
        PASSKEY_REDIRECT_COMPLETE(5),
        EMBEDDED_LINK_UPDATE_AVAILABLE(6),
        PASSKEY_CHALLENGE_GET(7),
        RESPONSE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6063a;

        b(int i) {
            this.f6063a = i;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.b forNumber(int i) {
            if (i == 0) {
                return RESPONSE_NOT_SET;
            }
            if (i == 3) {
                return OAUTH_REDIRECT_COMPLETE;
            }
            if (i == 5) {
                return PASSKEY_REDIRECT_COMPLETE;
            }
            if (i == 6) {
                return EMBEDDED_LINK_UPDATE_AVAILABLE;
            }
            if (i != 7) {
                return null;
            }
            return PASSKEY_CHALLENGE_GET;
        }

        public final int getNumber() {
            return this.f6063a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPollResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.class, workflow$LinkWorkflowPollResponse);
    }

    private Workflow$LinkWorkflowPollResponse() {
    }

    private void clearEmbeddedLinkUpdateAvailable() {
        if (this.responseCase_ == 6) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearOauthRedirectComplete() {
        if (this.responseCase_ == 3) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearPasskeyChallengeGet() {
        if (this.responseCase_ == 7) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearPasskeyRedirectComplete() {
        if (this.responseCase_ == 5) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
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
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new java.lang.Object[]{"response_", "responseCase_", "workflowSessionId_", "requestId_", com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete.class, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete.class, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.class, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.class) {
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

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable getEmbeddedLinkUpdateAvailable() {
        return this.responseCase_ == 6 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) this.response_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete getOauthRedirectComplete() {
        return this.responseCase_ == 3 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) this.response_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet getPasskeyChallengeGet() {
        return this.responseCase_ == 7 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) this.response_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete getPasskeyRedirectComplete() {
        return this.responseCase_ == 5 ? (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) this.response_ : com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete.getDefaultInstance();
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.b getResponseCase() {
        return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.b.forNumber(this.responseCase_);
    }

    public final java.lang.String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public final boolean hasEmbeddedLinkUpdateAvailable() {
        return this.responseCase_ == 6;
    }

    public final boolean hasOauthRedirectComplete() {
        return this.responseCase_ == 3;
    }

    public final boolean hasPasskeyChallengeGet() {
        return this.responseCase_ == 7;
    }

    public final boolean hasPasskeyRedirectComplete() {
        return this.responseCase_ == 5;
    }

    private void mergeEmbeddedLinkUpdateAvailable(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
        if (this.responseCase_ != 6 || this.response_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.getDefaultInstance()) {
            this.response_ = embeddedLinkUpdateAvailable;
        } else {
            this.response_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable) this.response_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable.a) embeddedLinkUpdateAvailable).buildPartial();
        }
        this.responseCase_ = 6;
    }

    private void mergeOauthRedirectComplete(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete oAuthRedirectComplete) {
        if (this.responseCase_ != 3 || this.response_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete.getDefaultInstance()) {
            this.response_ = oAuthRedirectComplete;
        } else {
            this.response_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete) this.response_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.OAuthRedirectComplete.a) oAuthRedirectComplete).buildPartial();
        }
        this.responseCase_ = 3;
    }

    private void mergePasskeyChallengeGet(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet passkeyChallengeGet) {
        if (this.responseCase_ != 7 || this.response_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet.getDefaultInstance()) {
            this.response_ = passkeyChallengeGet;
        } else {
            this.response_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet) this.response_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyChallengeGet.a) passkeyChallengeGet).buildPartial();
        }
        this.responseCase_ = 7;
    }

    private void mergePasskeyRedirectComplete(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete passkeyRedirectComplete) {
        if (this.responseCase_ != 5 || this.response_ == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete.getDefaultInstance()) {
            this.response_ = passkeyRedirectComplete;
        } else {
            this.response_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete.newBuilder((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete) this.response_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowPollResponse.PasskeyRedirectComplete.a) passkeyRedirectComplete).buildPartial();
        }
        this.responseCase_ = 5;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPollResponse);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setEmbeddedLinkUpdateAvailable(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
        this.response_ = embeddedLinkUpdateAvailable;
        this.responseCase_ = 6;
    }

    private void setOauthRedirectComplete(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.OAuthRedirectComplete oAuthRedirectComplete) {
        this.response_ = oAuthRedirectComplete;
        this.responseCase_ = 3;
    }

    private void setPasskeyChallengeGet(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyChallengeGet passkeyChallengeGet) {
        this.response_ = passkeyChallengeGet;
        this.responseCase_ = 7;
    }

    private void setPasskeyRedirectComplete(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse.PasskeyRedirectComplete passkeyRedirectComplete) {
        this.response_ = passkeyRedirectComplete;
        this.responseCase_ = 5;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setRequestId(java.lang.String str) {
        this.requestId_ = str;
    }

    private void setWorkflowSessionId(java.lang.String str) {
        this.workflowSessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
