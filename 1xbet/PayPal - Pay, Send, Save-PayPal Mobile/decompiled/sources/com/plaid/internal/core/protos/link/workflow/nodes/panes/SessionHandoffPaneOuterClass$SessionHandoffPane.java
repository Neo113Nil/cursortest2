package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class SessionHandoffPaneOuterClass$SessionHandoffPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CONTINUE_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions> PARSER;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ContinueAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction continueAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction();
                DEFAULT_INSTANCE = continueAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.class, continueAction);
            }

            private ContinueAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.t0.f6329a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction continueAction) {
                return DEFAULT_INSTANCE.createBuilder(continueAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            CONTINUE(1),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6255a;

            a(int i) {
                this.f6255a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return CONTINUE;
            }

            public final int getNumber() {
                return this.f6255a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearContinue() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.t0.f6329a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction getContinue() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.getDefaultInstance();
        }

        public final boolean hasContinue() {
            return this.actionCase_ == 1;
        }

        private void mergeContinue(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction continueAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.getDefaultInstance()) {
                this.action_ = continueAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction.a) continueAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setContinue(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.ContinueAction continueAction) {
            this.action_ = continueAction;
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 4;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int MODE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering> PARSER = null;
        public static final int WEBVIEW_FALLBACK_FIELD_NUMBER = 2;
        public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 3;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events events_;
        private int mode_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback webviewFallback_;
        private java.lang.String webviewRedirectUri_ = "";
        private java.lang.String continuationToken_ = "";

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.class, events);
            }

            private Events() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.t0.f6329a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearContinuationToken() {
            this.continuationToken_ = getDefaultInstance().getContinuationToken();
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -3;
        }

        private void clearMode() {
            this.mode_ = 0;
        }

        private void clearWebviewFallback() {
            this.webviewFallback_ = null;
            this.bitField0_ &= -2;
        }

        private void clearWebviewRedirectUri() {
            this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContinuationTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.continuationToken_ = byteString.toStringUtf8();
        }

        private void setMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 b0Var) {
            this.mode_ = b0Var.getNumber();
        }

        private void setModeValue(int i) {
            this.mode_ = i;
        }

        private void setWebviewRedirectUriBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.webviewRedirectUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.t0.f6329a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001", new java.lang.Object[]{"bitField0_", "mode_", "webviewFallback_", "webviewRedirectUri_", "continuationToken_", "events_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 getMode() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.forNumber(this.mode_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.UNRECOGNIZED : forNumber;
        }

        public final int getModeValue() {
            return this.mode_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback getWebviewFallback() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback = this.webviewFallback_;
            return common$WebviewFallback == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.getDefaultInstance() : common$WebviewFallback;
        }

        public final java.lang.String getWebviewRedirectUri() {
            return this.webviewRedirectUri_;
        }

        public final com.google.protobuf.ByteString getWebviewRedirectUriBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.webviewRedirectUri_);
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasWebviewFallback() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeWebviewFallback(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback2 = this.webviewFallback_;
            if (common$WebviewFallback2 == null || common$WebviewFallback2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.getDefaultInstance()) {
                this.webviewFallback_ = common$WebviewFallback;
            } else {
                this.webviewFallback_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.newBuilder(this.webviewFallback_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.a) common$WebviewFallback).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 2;
        }

        private void setWebviewFallback(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback) {
            this.webviewFallback_ = common$WebviewFallback;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setContinuationToken(java.lang.String str) {
            this.continuationToken_ = str;
        }

        private void setWebviewRedirectUri(java.lang.String str) {
            this.webviewRedirectUri_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane sessionHandoffPaneOuterClass$SessionHandoffPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane();
        DEFAULT_INSTANCE = sessionHandoffPaneOuterClass$SessionHandoffPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.class, sessionHandoffPaneOuterClass$SessionHandoffPane);
    }

    private SessionHandoffPaneOuterClass$SessionHandoffPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.t0.f6329a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane sessionHandoffPaneOuterClass$SessionHandoffPane) {
        return DEFAULT_INSTANCE.createBuilder(sessionHandoffPaneOuterClass$SessionHandoffPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
