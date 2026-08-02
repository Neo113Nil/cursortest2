package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class HeadlessOAuthPaneOuterClass$HeadlessOAuthPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction DEFAULT_INSTANCE;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 2;
            public static final int OAUTH_SUBMISSION_METHOD_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction> PARSER = null;
            public static final int RESPONSE_REDIRECT_URI_FIELD_NUMBER = 1;
            private int oauthSubmissionMethod_;
            private java.lang.String responseRedirectUri_ = "";
            private java.lang.String oauthStateId_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a a(java.lang.String str) {
                    copyOnWrite();
                    ((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) this.instance).setOauthStateId(str);
                    return this;
                }

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a b(java.lang.String str) {
                    copyOnWrite();
                    ((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) this.instance).setResponseRedirectUri(str);
                    return this;
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.class, submitAction);
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction> parser() {
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
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.h0.f6302a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new java.lang.Object[]{"responseRedirectUri_", "oauthStateId_", "oauthSubmissionMethod_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthStateId(java.lang.String str) {
                this.oauthStateId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponseRedirectUri(java.lang.String str) {
                this.responseRedirectUri_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6207a;

            a(int i) {
                this.f6207a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return SUBMIT;
            }

            public final int getNumber() {
                return this.f6207a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.DEFAULT_INSTANCE);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b a(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a aVar) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) this.instance).setSubmit(aVar.build());
                return this;
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.h0.f6302a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.getDefaultInstance();
        }

        public final boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 2;
        public static final int EXPECTED_OAUTH_URL_MATCHER_FIELD_NUMBER = 4;
        public static final int LOGIN_URI_FIELD_NUMBER = 1;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering> PARSER = null;
        public static final int POLLING_FIELD_NUMBER = 5;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher expectedOauthUrlMatcher_;
        private java.lang.String loginUri_ = "";
        private java.lang.String oauthStateId_ = "";
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions polling_;

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_FAIL_REDIRECT_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onFailRedirect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.class, events);
            }

            private Events() {
            }

            private void addAllOnFailRedirect(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnFailRedirectIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onFailRedirect_);
            }

            private void clearOnFailRedirect() {
                this.onFailRedirect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnFailRedirectIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onFailRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onFailRedirect_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnFailRedirect(int i) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.h0.f6302a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new java.lang.Object[]{"onFailRedirect_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.class) {
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

            private void addOnFailRedirect(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnFailRedirect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnFailRedirect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearExpectedOauthUrlMatcher() {
            this.expectedOauthUrlMatcher_ = null;
            this.bitField0_ &= -3;
        }

        private void clearLoginUri() {
            this.loginUri_ = getDefaultInstance().getLoginUri();
        }

        private void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        private void clearPolling() {
            this.polling_ = null;
            this.bitField0_ &= -5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLoginUriBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUri_ = byteString.toStringUtf8();
        }

        private void setOauthStateIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.oauthStateId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.h0.f6302a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002", new java.lang.Object[]{"bitField0_", "loginUri_", "events_", "oauthStateId_", "expectedOauthUrlMatcher_", "polling_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher getExpectedOauthUrlMatcher() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher = this.expectedOauthUrlMatcher_;
            return matcher == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.getDefaultInstance() : matcher;
        }

        public final java.lang.String getLoginUri() {
            return this.loginUri_;
        }

        public final com.google.protobuf.ByteString getLoginUriBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.loginUri_);
        }

        public final java.lang.String getOauthStateId() {
            return this.oauthStateId_;
        }

        public final com.google.protobuf.ByteString getOauthStateIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions getPolling() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions = this.polling_;
            return common$PollingOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.getDefaultInstance() : common$PollingOptions;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasExpectedOauthUrlMatcher() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasPolling() {
            return (this.bitField0_ & 4) != 0;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeExpectedOauthUrlMatcher(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher2 = this.expectedOauthUrlMatcher_;
            if (matcher2 == null || matcher2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.getDefaultInstance()) {
                this.expectedOauthUrlMatcher_ = matcher;
            } else {
                this.expectedOauthUrlMatcher_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.newBuilder(this.expectedOauthUrlMatcher_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.URLBehaviorConfiguration.Matcher.a) matcher).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergePolling(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions2 = this.polling_;
            if (common$PollingOptions2 == null || common$PollingOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.getDefaultInstance()) {
                this.polling_ = common$PollingOptions;
            } else {
                this.polling_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.newBuilder(this.polling_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.a) common$PollingOptions).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        private void setExpectedOauthUrlMatcher(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher) {
            this.expectedOauthUrlMatcher_ = matcher;
            this.bitField0_ |= 2;
        }

        private void setPolling(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions) {
            this.polling_ = common$PollingOptions;
            this.bitField0_ |= 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setLoginUri(java.lang.String str) {
            this.loginUri_ = str;
        }

        private void setOauthStateId(java.lang.String str) {
            this.oauthStateId_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane headlessOAuthPaneOuterClass$HeadlessOAuthPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane();
        DEFAULT_INSTANCE = headlessOAuthPaneOuterClass$HeadlessOAuthPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.class, headlessOAuthPaneOuterClass$HeadlessOAuthPane);
    }

    private HeadlessOAuthPaneOuterClass$HeadlessOAuthPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.h0.f6302a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane headlessOAuthPaneOuterClass$HeadlessOAuthPane) {
        return DEFAULT_INSTANCE.createBuilder(headlessOAuthPaneOuterClass$HeadlessOAuthPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
