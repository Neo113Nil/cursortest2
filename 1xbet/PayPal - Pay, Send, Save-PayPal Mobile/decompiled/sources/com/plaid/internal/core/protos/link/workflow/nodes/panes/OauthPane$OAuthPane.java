package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class OauthPane$OAuthPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction DEFAULT_INSTANCE;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 2;
            public static final int OAUTH_SUBMISSION_METHOD_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction> PARSER = null;
            public static final int RESPONSE_REDIRECT_URI_FIELD_NUMBER = 1;
            private int oauthSubmissionMethod_;
            private java.lang.String responseRedirectUri_ = "";
            private java.lang.String oauthStateId_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            private void clearOauthSubmissionMethod() {
                this.oauthSubmissionMethod_ = 0;
            }

            private void clearResponseRedirectUri() {
                this.responseRedirectUri_ = getDefaultInstance().getResponseRedirectUri();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setOauthStateIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            private void setOauthSubmissionMethod(com.plaid.internal.core.protos.link.workflow.nodes.panes.F f) {
                this.oauthSubmissionMethod_ = f.getNumber();
            }

            private void setOauthSubmissionMethodValue(int i) {
                this.oauthSubmissionMethod_ = i;
            }

            private void setResponseRedirectUriBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.responseRedirectUri_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new java.lang.Object[]{"responseRedirectUri_", "oauthStateId_", "oauthSubmissionMethod_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.F getOauthSubmissionMethod() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.F forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.F.forNumber(this.oauthSubmissionMethod_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.F.UNRECOGNIZED : forNumber;
            }

            public final int getOauthSubmissionMethodValue() {
                return this.oauthSubmissionMethod_;
            }

            public final java.lang.String getResponseRedirectUri() {
                return this.responseRedirectUri_;
            }

            public final com.google.protobuf.ByteString getResponseRedirectUriBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.responseRedirectUri_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setOauthStateId(java.lang.String str) {
                this.oauthStateId_ = str;
            }

            private void setResponseRedirectUri(java.lang.String str) {
                this.responseRedirectUri_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            EXIT(2),
            SECONDARY_BUTTON_TAP(3),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6220a;

            a(int i) {
                this.f6220a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return SUBMIT;
                }
                if (i == 2) {
                    return EXIT;
                }
                if (i != 3) {
                    return null;
                }
                return SECONDARY_BUTTON_TAP;
            }

            public final int getNumber() {
                return this.f6220a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearExit() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryButtonTap() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.getDefaultInstance();
        }

        public final boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public final boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 3;
        }

        public final boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        private void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int AFTER_FIELD_NUMBER = 5;
        public static final int AFTER_FLEXIBLE_FIELD_NUMBER = 20;
        public static final int AUTO_LOGIN_OPEN_FIELD_NUMBER = 17;
        public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 24;
        public static final int BEFORE_FIELD_NUMBER = 3;
        public static final int BEFORE_FLEXIBLE_FIELD_NUMBER = 18;
        public static final int CONFIGURED_WITH_REDIRECT_URI_FIELD_NUMBER = 8;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering DEFAULT_INSTANCE;
        public static final int DURING_FIELD_NUMBER = 4;
        public static final int DURING_FLEXIBLE_FIELD_NUMBER = 19;
        public static final int EVENTS_FIELD_NUMBER = 6;
        public static final int HIDE_FAIRY_BITS_FIELD_NUMBER = 22;
        public static final int INSTITUTION_FIELD_NUMBER = 7;
        public static final int LOGIN_URI_FIELD_NUMBER = 1;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 2;
        public static final int OAUTH_UI_EXPERIENCE_FIELD_NUMBER = 14;
        public static final int OUT_OF_PROCESS_IOS_POPUP_FIELD_NUMBER = 16;
        public static final int PANE_HEADER_FIELD_NUMBER = 9;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering> PARSER = null;
        public static final int POLLING_FIELD_NUMBER = 12;
        public static final int POLL_FOR_LOGIN_URI_FIELD_NUMBER = 23;
        public static final int POPUP_FIELD_NUMBER = 10;
        public static final int REDIRECT_FIELD_NUMBER = 11;
        public static final int SHOULD_AWAIT_OAUTH_LOGGING_FIELD_NUMBER = 13;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible afterFlexible_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content after_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions autoLoginOpen_;
        private int backgroundDisplayMode_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible beforeFlexible_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content before_;
        private int bitField0_;
        private boolean configuredWithRedirectUri_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible duringFlexible_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content during_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events events_;
        private boolean hideFairyBits_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution institution_;
        private java.lang.Object loginUriOptions_;
        private int oauthUiExperience_;
        private java.lang.Object openMethod_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions polling_;
        private boolean shouldAwaitOauthLogging_;
        private int loginUriOptionsCase_ = 0;
        private int openMethodCase_ = 0;
        private java.lang.String oauthStateId_ = "";

        public static final class Content extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 10;
            public static final int BUTTON_FIELD_NUMBER = 4;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content DEFAULT_INSTANCE;
            public static final int DETAIL_ORDERED_LIST_FIELD_NUMBER = 6;
            public static final int DETAIL_TEXT_FIELD_NUMBER = 5;
            public static final int HEADER_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content> PARSER = null;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 7;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString buttonDisclaimerText_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private int detailCase_ = 0;
            private java.lang.Object detail_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;

            public static final class OrderedList extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList DEFAULT_INSTANCE;
                public static final int ITEMS_FIELD_NUMBER = 1;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList> PARSER;
                private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList orderedList = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList();
                    DEFAULT_INSTANCE = orderedList;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.class, orderedList);
                }

                private OrderedList() {
                }

                private void addAllItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> iterable) {
                    ensureItemsIsMutable();
                    com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
                }

                private void clearItems() {
                    this.items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureItemsIsMutable() {
                    com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> protobufList = this.items_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.items_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void removeItems(int i) {
                    ensureItemsIsMutable();
                    this.items_.remove(i);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"items_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.class});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.class) {
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

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getItems(int i) {
                    return this.items_.get(i);
                }

                public final int getItemsCount() {
                    return this.items_.size();
                }

                public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> getItemsList() {
                    return this.items_;
                }

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.C getItemsOrBuilder(int i) {
                    return this.items_.get(i);
                }

                public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.C> getItemsOrBuilderList() {
                    return this.items_;
                }

                private void addItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                    ensureItemsIsMutable();
                    this.items_.add(common$LocalizedString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList orderedList) {
                    return DEFAULT_INSTANCE.createBuilder(orderedList);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                private void setItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                    ensureItemsIsMutable();
                    this.items_.set(i, common$LocalizedString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                private void addItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                    ensureItemsIsMutable();
                    this.items_.add(i, common$LocalizedString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.DEFAULT_INSTANCE);
                }
            }

            public enum b {
                DETAIL_TEXT(5),
                DETAIL_ORDERED_LIST(6),
                DETAIL_NOT_SET(0);


                /* renamed from: a, reason: collision with root package name */
                public final int f6221a;

                b(int i) {
                    this.f6221a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.b forNumber(int i) {
                    if (i == 0) {
                        return DETAIL_NOT_SET;
                    }
                    if (i == 5) {
                        return DETAIL_TEXT;
                    }
                    if (i != 6) {
                        return null;
                    }
                    return DETAIL_ORDERED_LIST;
                }

                public final int getNumber() {
                    return this.f6221a;
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content();
                DEFAULT_INSTANCE = content;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.class, content);
            }

            private Content() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -3;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -9;
            }

            private void clearDetail() {
                this.detailCase_ = 0;
                this.detail_ = null;
            }

            private void clearDetailOrderedList() {
                if (this.detailCase_ == 6) {
                    this.detailCase_ = 0;
                    this.detail_ = null;
                }
            }

            private void clearDetailText() {
                if (this.detailCase_ == 5) {
                    this.detailCase_ = 0;
                    this.detail_ = null;
                }
            }

            private void clearHeader() {
                this.header_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -5;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0002\n\u0006\u0000\u0000\u0000\u0002ဉ\u0000\u0004ဉ\u0001\u0005<\u0000\u0006<\u0000\u0007ဉ\u0002\nဉ\u0003", new java.lang.Object[]{"detail_", "detailCase_", "bitField0_", "header_", "button_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.class, "secondaryButton_", "buttonDisclaimerText_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getButtonDisclaimerText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.buttonDisclaimerText_;
                return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.b getDetailCase() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.b.forNumber(this.detailCase_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList getDetailOrderedList() {
                return this.detailCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) this.detail_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getDetailText() {
                return this.detailCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) this.detail_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasDetailOrderedList() {
                return this.detailCase_ == 6;
            }

            public final boolean hasDetailText() {
                return this.detailCase_ == 5;
            }

            public final boolean hasHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 4) != 0;
            }

            private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeDetailOrderedList(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList orderedList) {
                if (this.detailCase_ != 6 || this.detail_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.getDefaultInstance()) {
                    this.detail_ = orderedList;
                } else {
                    this.detail_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList) this.detail_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList.a) orderedList).buildPartial();
                }
                this.detailCase_ = 6;
            }

            private void mergeDetailText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                if (this.detailCase_ != 5 || this.detail_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.detail_ = common$LocalizedString;
                } else {
                    this.detail_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) this.detail_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.detailCase_ = 5;
            }

            private void mergeHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.header_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.header_ = common$LocalizedString;
                } else {
                    this.header_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.header_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content) {
                return DEFAULT_INSTANCE.createBuilder(content);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 2;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 8;
            }

            private void setDetailOrderedList(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.OrderedList orderedList) {
                this.detail_ = orderedList;
                this.detailCase_ = 6;
            }

            private void setDetailText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.detail_ = common$LocalizedString;
                this.detailCase_ = 5;
            }

            private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.header_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ContentFlexible extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 3;
            public static final int BUTTON_FIELD_NUMBER = 2;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible DEFAULT_INSTANCE;
            public static final int PANE_BODY_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible> PARSER = null;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 4;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString buttonDisclaimerText_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody paneBody_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;

            public static final class PaneBody extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public static final int COMPONENTS_FIELD_NUMBER = 1;
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody> PARSER;
                private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody paneBody = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody();
                    DEFAULT_INSTANCE = paneBody;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.class, paneBody);
                }

                private PaneBody() {
                }

                private void addAllComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
                    ensureComponentsIsMutable();
                    com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.components_);
                }

                private void clearComponents() {
                    this.components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureComponentsIsMutable() {
                    com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.components_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.components_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void removeComponents(int i) {
                    ensureComponentsIsMutable();
                    this.components_.remove(i);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"components_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.class) {
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

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getComponents(int i) {
                    return this.components_.get(i);
                }

                public final int getComponentsCount() {
                    return this.components_.size();
                }

                public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getComponentsList() {
                    return this.components_;
                }

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getComponentsOrBuilder(int i) {
                    return this.components_.get(i);
                }

                public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getComponentsOrBuilderList() {
                    return this.components_;
                }

                private void addComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                    ensureComponentsIsMutable();
                    this.components_.add(common$FlexibleComponent);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody paneBody) {
                    return DEFAULT_INSTANCE.createBuilder(paneBody);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                private void setComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                    ensureComponentsIsMutable();
                    this.components_.set(i, common$FlexibleComponent);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                private void addComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                    ensureComponentsIsMutable();
                    this.components_.add(i, common$FlexibleComponent);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible();
                DEFAULT_INSTANCE = contentFlexible;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.class, contentFlexible);
            }

            private ContentFlexible() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -3;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -9;
            }

            private void clearPaneBody() {
                this.paneBody_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -5;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0002", new java.lang.Object[]{"bitField0_", "paneBody_", "button_", "buttonDisclaimerText_", "secondaryButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getButtonDisclaimerText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.buttonDisclaimerText_;
                return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody getPaneBody() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody paneBody = this.paneBody_;
                return paneBody == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.getDefaultInstance() : paneBody;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasPaneBody() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 4) != 0;
            }

            private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergePaneBody(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody paneBody) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody paneBody2 = this.paneBody_;
                if (paneBody2 == null || paneBody2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.getDefaultInstance()) {
                    this.paneBody_ = paneBody;
                } else {
                    this.paneBody_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.newBuilder(this.paneBody_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody.a) paneBody).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible) {
                return DEFAULT_INSTANCE.createBuilder(contentFlexible);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 2;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 8;
            }

            private void setPaneBody(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.PaneBody paneBody) {
                this.paneBody_ = paneBody;
                this.bitField0_ |= 1;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_CLOSE_REDIRECT_FIELD_NUMBER = 3;
            public static final int ON_FAIL_REDIRECT_FIELD_NUMBER = 4;
            public static final int ON_REDIRECT_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 5;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onRedirect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onSecondaryButtonTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onCloseRedirect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onFailRedirect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.class, events);
            }

            private Events() {
            }

            private void addAllOnAppear(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnAppearIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onAppear_);
            }

            private void addAllOnCloseRedirect(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnCloseRedirectIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onCloseRedirect_);
            }

            private void addAllOnFailRedirect(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnFailRedirectIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onFailRedirect_);
            }

            private void addAllOnRedirect(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnRedirectIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onRedirect_);
            }

            private void addAllOnSecondaryButtonTap(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnSecondaryButtonTapIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onSecondaryButtonTap_);
            }

            private void clearOnAppear() {
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnCloseRedirect() {
                this.onCloseRedirect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnFailRedirect() {
                this.onFailRedirect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnRedirect() {
                this.onRedirect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnCloseRedirectIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onCloseRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onCloseRedirect_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnFailRedirectIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onFailRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onFailRedirect_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnRedirectIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onRedirect_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSecondaryButtonTapIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onSecondaryButtonTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSecondaryButtonTap_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            private void removeOnCloseRedirect(int i) {
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.remove(i);
            }

            private void removeOnFailRedirect(int i) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.remove(i);
            }

            private void removeOnRedirect(int i) {
                ensureOnRedirectIsMutable();
                this.onRedirect_.remove(i);
            }

            private void removeOnSecondaryButtonTap(int i) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onRedirect_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onCloseRedirect_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onFailRedirect_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onSecondaryButtonTap_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnAppear(int i) {
                return this.onAppear_.get(i);
            }

            public final int getOnAppearCount() {
                return this.onAppear_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnAppearList() {
                return this.onAppear_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnAppearOrBuilder(int i) {
                return this.onAppear_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnAppearOrBuilderList() {
                return this.onAppear_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnCloseRedirect(int i) {
                return this.onCloseRedirect_.get(i);
            }

            public final int getOnCloseRedirectCount() {
                return this.onCloseRedirect_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnCloseRedirectList() {
                return this.onCloseRedirect_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnCloseRedirectOrBuilder(int i) {
                return this.onCloseRedirect_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnCloseRedirectOrBuilderList() {
                return this.onCloseRedirect_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnFailRedirect(int i) {
                return this.onFailRedirect_.get(i);
            }

            public final int getOnFailRedirectCount() {
                return this.onFailRedirect_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnFailRedirectList() {
                return this.onFailRedirect_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnFailRedirectOrBuilder(int i) {
                return this.onFailRedirect_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnFailRedirectOrBuilderList() {
                return this.onFailRedirect_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnRedirect(int i) {
                return this.onRedirect_.get(i);
            }

            public final int getOnRedirectCount() {
                return this.onRedirect_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnRedirectList() {
                return this.onRedirect_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnRedirectOrBuilder(int i) {
                return this.onRedirect_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnRedirectOrBuilderList() {
                return this.onRedirect_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSecondaryButtonTap(int i) {
                return this.onSecondaryButtonTap_.get(i);
            }

            public final int getOnSecondaryButtonTapCount() {
                return this.onSecondaryButtonTap_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnSecondaryButtonTapList() {
                return this.onSecondaryButtonTap_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnSecondaryButtonTapOrBuilder(int i) {
                return this.onSecondaryButtonTap_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnSecondaryButtonTapOrBuilderList() {
                return this.onSecondaryButtonTap_;
            }

            private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void addOnCloseRedirect(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.add(common$SDKEvent);
            }

            private void addOnFailRedirect(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(common$SDKEvent);
            }

            private void addOnRedirect(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnRedirectIsMutable();
                this.onRedirect_.add(common$SDKEvent);
            }

            private void addOnSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.add(common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnCloseRedirect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.set(i, common$SDKEvent);
            }

            private void setOnFailRedirect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.set(i, common$SDKEvent);
            }

            private void setOnRedirect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnRedirectIsMutable();
                this.onRedirect_.set(i, common$SDKEvent);
            }

            private void setOnSecondaryButtonTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            private void addOnCloseRedirect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.add(i, common$SDKEvent);
            }

            private void addOnFailRedirect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(i, common$SDKEvent);
            }

            private void addOnRedirect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnRedirectIsMutable();
                this.onRedirect_.add(i, common$SDKEvent);
            }

            private void addOnSecondaryButtonTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PollForLoginURI extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI> PARSER = null;
            public static final int POLLING_KEY_FIELD_NUMBER = 1;
            private java.lang.String pollingKey_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI pollForLoginURI = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI();
                DEFAULT_INSTANCE = pollForLoginURI;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.class, pollForLoginURI);
            }

            private PollForLoginURI() {
            }

            private void clearPollingKey() {
                this.pollingKey_ = getDefaultInstance().getPollingKey();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPollingKeyBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.pollingKey_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"pollingKey_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.class) {
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

            public final java.lang.String getPollingKey() {
                return this.pollingKey_;
            }

            public final com.google.protobuf.ByteString getPollingKeyBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.pollingKey_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI pollForLoginURI) {
                return DEFAULT_INSTANCE.createBuilder(pollForLoginURI);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setPollingKey(java.lang.String str) {
                this.pollingKey_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            LOGIN_URI(1),
            POLL_FOR_LOGIN_URI(23),
            LOGINURIOPTIONS_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6222a;

            b(int i) {
                this.f6222a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.b forNumber(int i) {
                if (i == 0) {
                    return LOGINURIOPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LOGIN_URI;
                }
                if (i != 23) {
                    return null;
                }
                return POLL_FOR_LOGIN_URI;
            }

            public final int getNumber() {
                return this.f6222a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.b valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum c {
            POPUP(10),
            REDIRECT(11),
            OUT_OF_PROCESS_IOS_POPUP(16),
            OPENMETHOD_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6223a;

            c(int i) {
                this.f6223a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.c forNumber(int i) {
                if (i == 0) {
                    return OPENMETHOD_NOT_SET;
                }
                if (i == 16) {
                    return OUT_OF_PROCESS_IOS_POPUP;
                }
                if (i == 10) {
                    return POPUP;
                }
                if (i != 11) {
                    return null;
                }
                return REDIRECT;
            }

            public final int getNumber() {
                return this.f6223a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearAfter() {
            this.after_ = null;
            this.bitField0_ &= -257;
        }

        private void clearAfterFlexible() {
            this.afterFlexible_ = null;
            this.bitField0_ &= -513;
        }

        private void clearAutoLoginOpen() {
            this.autoLoginOpen_ = null;
            this.bitField0_ &= -3;
        }

        private void clearBackgroundDisplayMode() {
            this.backgroundDisplayMode_ = 0;
        }

        private void clearBefore() {
            this.before_ = null;
            this.bitField0_ &= -17;
        }

        private void clearBeforeFlexible() {
            this.beforeFlexible_ = null;
            this.bitField0_ &= -33;
        }

        private void clearConfiguredWithRedirectUri() {
            this.configuredWithRedirectUri_ = false;
        }

        private void clearDuring() {
            this.during_ = null;
            this.bitField0_ &= -65;
        }

        private void clearDuringFlexible() {
            this.duringFlexible_ = null;
            this.bitField0_ &= -129;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearHideFairyBits() {
            this.hideFairyBits_ = false;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -5;
        }

        private void clearLoginUri() {
            if (this.loginUriOptionsCase_ == 1) {
                this.loginUriOptionsCase_ = 0;
                this.loginUriOptions_ = null;
            }
        }

        private void clearLoginUriOptions() {
            this.loginUriOptionsCase_ = 0;
            this.loginUriOptions_ = null;
        }

        private void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        private void clearOauthUiExperience() {
            this.oauthUiExperience_ = 0;
        }

        private void clearOpenMethod() {
            this.openMethodCase_ = 0;
            this.openMethod_ = null;
        }

        private void clearOutOfProcessIosPopup() {
            if (this.openMethodCase_ == 16) {
                this.openMethodCase_ = 0;
                this.openMethod_ = null;
            }
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -9;
        }

        private void clearPollForLoginUri() {
            if (this.loginUriOptionsCase_ == 23) {
                this.loginUriOptionsCase_ = 0;
                this.loginUriOptions_ = null;
            }
        }

        private void clearPolling() {
            this.polling_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPopup() {
            if (this.openMethodCase_ == 10) {
                this.openMethodCase_ = 0;
                this.openMethod_ = null;
            }
        }

        private void clearRedirect() {
            if (this.openMethodCase_ == 11) {
                this.openMethodCase_ = 0;
                this.openMethod_ = null;
            }
        }

        private void clearShouldAwaitOauthLogging() {
            this.shouldAwaitOauthLogging_ = false;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBackgroundDisplayMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m enumC0487m) {
            this.backgroundDisplayMode_ = enumC0487m.getNumber();
        }

        private void setBackgroundDisplayModeValue(int i) {
            this.backgroundDisplayMode_ = i;
        }

        private void setConfiguredWithRedirectUri(boolean z) {
            this.configuredWithRedirectUri_ = z;
        }

        private void setHideFairyBits(boolean z) {
            this.hideFairyBits_ = z;
        }

        private void setLoginUriBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUriOptions_ = byteString.toStringUtf8();
            this.loginUriOptionsCase_ = 1;
        }

        private void setOauthStateIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.oauthStateId_ = byteString.toStringUtf8();
        }

        private void setOauthUiExperience(com.plaid.internal.core.protos.link.workflow.nodes.panes.G g) {
            this.oauthUiExperience_ = g.getNumber();
        }

        private void setOauthUiExperienceValue(int i) {
            this.oauthUiExperience_ = i;
        }

        private void setShouldAwaitOauthLogging(boolean z) {
            this.shouldAwaitOauthLogging_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0002\u0001\u0001\u0018\u0016\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȉ\u0003ဉ\u0004\u0004ဉ\u0006\u0005ဉ\b\u0006ဉ\n\u0007ဉ\u0002\b\u0007\tဉ\u0003\n<\u0001\u000b<\u0001\fဉ\u0000\r\u0007\u000e\f\u0010<\u0001\u0011ဉ\u0001\u0012ဉ\u0005\u0013ဉ\u0007\u0014ဉ\t\u0016\u0007\u0017<\u0000\u0018\f", new java.lang.Object[]{"loginUriOptions_", "loginUriOptionsCase_", "openMethod_", "openMethodCase_", "bitField0_", "oauthStateId_", "before_", "during_", "after_", "events_", "institution_", "configuredWithRedirectUri_", "paneHeader_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions.class, "polling_", "shouldAwaitOauthLogging_", "oauthUiExperience_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.class, "autoLoginOpen_", "beforeFlexible_", "duringFlexible_", "afterFlexible_", "hideFairyBits_", com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.class, "backgroundDisplayMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content getAfter() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content = this.after_;
            return content == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.getDefaultInstance() : content;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible getAfterFlexible() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible = this.afterFlexible_;
            return contentFlexible == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.getDefaultInstance() : contentFlexible;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions getAutoLoginOpen() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions common$AutoLoginOpenOptions = this.autoLoginOpen_;
            return common$AutoLoginOpenOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions.getDefaultInstance() : common$AutoLoginOpenOptions;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m getBackgroundDisplayMode() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.forNumber(this.backgroundDisplayMode_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.UNRECOGNIZED : forNumber;
        }

        public final int getBackgroundDisplayModeValue() {
            return this.backgroundDisplayMode_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content getBefore() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content = this.before_;
            return content == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.getDefaultInstance() : content;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible getBeforeFlexible() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible = this.beforeFlexible_;
            return contentFlexible == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.getDefaultInstance() : contentFlexible;
        }

        public final boolean getConfiguredWithRedirectUri() {
            return this.configuredWithRedirectUri_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content getDuring() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content = this.during_;
            return content == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.getDefaultInstance() : content;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible getDuringFlexible() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible = this.duringFlexible_;
            return contentFlexible == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.getDefaultInstance() : contentFlexible;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final boolean getHideFairyBits() {
            return this.hideFairyBits_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution getInstitution() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.b getLoginUriOptionsCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.b.forNumber(this.loginUriOptionsCase_);
        }

        public final java.lang.String getOauthStateId() {
            return this.oauthStateId_;
        }

        public final com.google.protobuf.ByteString getOauthStateIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.G getOauthUiExperience() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.G forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.G.forNumber(this.oauthUiExperience_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.G.UNRECOGNIZED : forNumber;
        }

        public final int getOauthUiExperienceValue() {
            return this.oauthUiExperience_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.c getOpenMethodCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.c.forNumber(this.openMethodCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions getOutOfProcessIosPopup() {
            return this.openMethodCase_ == 16 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) this.openMethod_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI getPollForLoginUri() {
            return this.loginUriOptionsCase_ == 23 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) this.loginUriOptions_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions getPolling() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions = this.polling_;
            return common$PollingOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.getDefaultInstance() : common$PollingOptions;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions getPopup() {
            return this.openMethodCase_ == 10 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) this.openMethod_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions getRedirect() {
            return this.openMethodCase_ == 11 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions) this.openMethod_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions.getDefaultInstance();
        }

        public final boolean getShouldAwaitOauthLogging() {
            return this.shouldAwaitOauthLogging_;
        }

        public final boolean hasAfter() {
            return (this.bitField0_ & 256) != 0;
        }

        public final boolean hasAfterFlexible() {
            return (this.bitField0_ & 512) != 0;
        }

        public final boolean hasAutoLoginOpen() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasBefore() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasBeforeFlexible() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasDuring() {
            return (this.bitField0_ & 64) != 0;
        }

        public final boolean hasDuringFlexible() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 1024) != 0;
        }

        public final boolean hasInstitution() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasLoginUri() {
            return this.loginUriOptionsCase_ == 1;
        }

        public final boolean hasOutOfProcessIosPopup() {
            return this.openMethodCase_ == 16;
        }

        public final boolean hasPaneHeader() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasPollForLoginUri() {
            return this.loginUriOptionsCase_ == 23;
        }

        public final boolean hasPolling() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasPopup() {
            return this.openMethodCase_ == 10;
        }

        public final boolean hasRedirect() {
            return this.openMethodCase_ == 11;
        }

        private void mergeAfter(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content2 = this.after_;
            if (content2 == null || content2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.getDefaultInstance()) {
                this.after_ = content;
            } else {
                this.after_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.newBuilder(this.after_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.a) content).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeAfterFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible2 = this.afterFlexible_;
            if (contentFlexible2 == null || contentFlexible2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.getDefaultInstance()) {
                this.afterFlexible_ = contentFlexible;
            } else {
                this.afterFlexible_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.newBuilder(this.afterFlexible_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.a) contentFlexible).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeAutoLoginOpen(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions common$AutoLoginOpenOptions) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions common$AutoLoginOpenOptions2 = this.autoLoginOpen_;
            if (common$AutoLoginOpenOptions2 == null || common$AutoLoginOpenOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions.getDefaultInstance()) {
                this.autoLoginOpen_ = common$AutoLoginOpenOptions;
            } else {
                this.autoLoginOpen_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions.newBuilder(this.autoLoginOpen_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions.a) common$AutoLoginOpenOptions).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeBefore(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content2 = this.before_;
            if (content2 == null || content2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.getDefaultInstance()) {
                this.before_ = content;
            } else {
                this.before_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.newBuilder(this.before_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.a) content).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeBeforeFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible2 = this.beforeFlexible_;
            if (contentFlexible2 == null || contentFlexible2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.getDefaultInstance()) {
                this.beforeFlexible_ = contentFlexible;
            } else {
                this.beforeFlexible_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.newBuilder(this.beforeFlexible_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.a) contentFlexible).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeDuring(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content2 = this.during_;
            if (content2 == null || content2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.getDefaultInstance()) {
                this.during_ = content;
            } else {
                this.during_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.newBuilder(this.during_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content.a) content).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeDuringFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible2 = this.duringFlexible_;
            if (contentFlexible2 == null || contentFlexible2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.getDefaultInstance()) {
                this.duringFlexible_ = contentFlexible;
            } else {
                this.duringFlexible_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.newBuilder(this.duringFlexible_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible.a) contentFlexible).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution2 = this.institution_;
            if (common$RenderedInstitution2 == null || common$RenderedInstitution2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance()) {
                this.institution_ = common$RenderedInstitution;
            } else {
                this.institution_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.newBuilder(this.institution_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.a) common$RenderedInstitution).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeOutOfProcessIosPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions) {
            if (this.openMethodCase_ != 16 || this.openMethod_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.getDefaultInstance()) {
                this.openMethod_ = common$OutOfProcessIOSPopupOptions;
            } else {
                this.openMethod_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) this.openMethod_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.a) common$OutOfProcessIOSPopupOptions).buildPartial();
            }
            this.openMethodCase_ = 16;
        }

        private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
            if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                this.paneHeader_ = common$PaneHeader;
            } else {
                this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergePollForLoginUri(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI pollForLoginURI) {
            if (this.loginUriOptionsCase_ != 23 || this.loginUriOptions_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.getDefaultInstance()) {
                this.loginUriOptions_ = pollForLoginURI;
            } else {
                this.loginUriOptions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI) this.loginUriOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI.a) pollForLoginURI).buildPartial();
            }
            this.loginUriOptionsCase_ = 23;
        }

        private void mergePolling(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions2 = this.polling_;
            if (common$PollingOptions2 == null || common$PollingOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.getDefaultInstance()) {
                this.polling_ = common$PollingOptions;
            } else {
                this.polling_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.newBuilder(this.polling_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.a) common$PollingOptions).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions common$PopupOptions) {
            if (this.openMethodCase_ != 10 || this.openMethod_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.getDefaultInstance()) {
                this.openMethod_ = common$PopupOptions;
            } else {
                this.openMethod_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) this.openMethod_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.a) common$PopupOptions).buildPartial();
            }
            this.openMethodCase_ = 10;
        }

        private void mergeRedirect(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions common$RedirectOptions) {
            if (this.openMethodCase_ != 11 || this.openMethod_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions.getDefaultInstance()) {
                this.openMethod_ = common$RedirectOptions;
            } else {
                this.openMethod_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions) this.openMethod_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions.a) common$RedirectOptions).buildPartial();
            }
            this.openMethodCase_ = 11;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAfter(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content) {
            this.after_ = content;
            this.bitField0_ |= 256;
        }

        private void setAfterFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible) {
            this.afterFlexible_ = contentFlexible;
            this.bitField0_ |= 512;
        }

        private void setAutoLoginOpen(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions common$AutoLoginOpenOptions) {
            this.autoLoginOpen_ = common$AutoLoginOpenOptions;
            this.bitField0_ |= 2;
        }

        private void setBefore(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content) {
            this.before_ = content;
            this.bitField0_ |= 16;
        }

        private void setBeforeFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible) {
            this.beforeFlexible_ = contentFlexible;
            this.bitField0_ |= 32;
        }

        private void setDuring(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Content content) {
            this.during_ = content;
            this.bitField0_ |= 64;
        }

        private void setDuringFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.ContentFlexible contentFlexible) {
            this.duringFlexible_ = contentFlexible;
            this.bitField0_ |= 128;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 1024;
        }

        private void setInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 4;
        }

        private void setLoginUri(java.lang.String str) {
            this.loginUriOptionsCase_ = 1;
            this.loginUriOptions_ = str;
        }

        private void setOutOfProcessIosPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions) {
            this.openMethod_ = common$OutOfProcessIOSPopupOptions;
            this.openMethodCase_ = 16;
        }

        private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 8;
        }

        private void setPollForLoginUri(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.PollForLoginURI pollForLoginURI) {
            this.loginUriOptions_ = pollForLoginURI;
            this.loginUriOptionsCase_ = 23;
        }

        private void setPolling(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions) {
            this.polling_ = common$PollingOptions;
            this.bitField0_ |= 1;
        }

        private void setPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions common$PopupOptions) {
            this.openMethod_ = common$PopupOptions;
            this.openMethodCase_ = 10;
        }

        private void setRedirect(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions common$RedirectOptions) {
            this.openMethod_ = common$RedirectOptions;
            this.openMethodCase_ = 11;
        }

        public final java.lang.String getLoginUri() {
            return this.loginUriOptionsCase_ == 1 ? (java.lang.String) this.loginUriOptions_ : "";
        }

        public final com.google.protobuf.ByteString getLoginUriBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.loginUriOptionsCase_ == 1 ? (java.lang.String) this.loginUriOptions_ : "");
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setOauthStateId(java.lang.String str) {
            this.oauthStateId_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane oauthPane$OAuthPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane();
        DEFAULT_INSTANCE = oauthPane$OAuthPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.class, oauthPane$OAuthPane);
    }

    private OauthPane$OAuthPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.k0.f6307a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane oauthPane$OAuthPane) {
        return DEFAULT_INSTANCE.createBuilder(oauthPane$OAuthPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
