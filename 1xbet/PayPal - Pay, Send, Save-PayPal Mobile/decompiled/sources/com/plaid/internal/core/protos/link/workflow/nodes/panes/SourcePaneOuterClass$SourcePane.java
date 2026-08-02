package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class SourcePaneOuterClass$SourcePane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane, com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions> PARSER = null;
        public static final int START_FIELD_NUMBER = 4;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class StartAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction startAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction();
                DEFAULT_INSTANCE = startAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.class, startAction);
            }

            private StartAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.v0.f6335a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction startAction) {
                return DEFAULT_INSTANCE.createBuilder(startAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            START(4),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6256a;

            a(int i) {
                this.f6256a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i != 4) {
                    return null;
                }
                return START;
            }

            public final int getNumber() {
                return this.f6256a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearStart() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.v0.f6335a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction getStart() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.getDefaultInstance();
        }

        public final boolean hasStart() {
            return this.actionCase_ == 4;
        }

        private void mergeStart(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction startAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.getDefaultInstance()) {
                this.action_ = startAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction.a) startAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setStart(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.StartAction startAction) {
            this.action_ = startAction;
            this.actionCase_ = 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.v0.f6335a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane, com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane sourcePaneOuterClass$SourcePane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane();
        DEFAULT_INSTANCE = sourcePaneOuterClass$SourcePane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.class, sourcePaneOuterClass$SourcePane);
    }

    private SourcePaneOuterClass$SourcePane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.v0.f6335a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane sourcePaneOuterClass$SourcePane) {
        return DEFAULT_INSTANCE.createBuilder(sourcePaneOuterClass$SourcePane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
