package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class LoadingPaneOuterClass$LoadingPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        public static final int LOADING_FIELD_NUMBER = 1;
        public static final int OOPWV_CANCEL_FIELD_NUMBER = 3;
        public static final int OOPWV_FINISH_FIELD_NUMBER = 4;
        public static final int OOPWV_IOS_DECLINE_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions> PARSER;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LoadingAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction loadingAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction();
                DEFAULT_INSTANCE = loadingAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.class, loadingAction);
            }

            private LoadingAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction loadingAction) {
                return DEFAULT_INSTANCE.createBuilder(loadingAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvCancelAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction oopwvCancelAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction();
                DEFAULT_INSTANCE = oopwvCancelAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.class, oopwvCancelAction);
            }

            private OopwvCancelAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction oopwvCancelAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvCancelAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvFinishAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction oopwvFinishAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction();
                DEFAULT_INSTANCE = oopwvFinishAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.class, oopwvFinishAction);
            }

            private OopwvFinishAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction oopwvFinishAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvFinishAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvIosDeclineAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction oopwvIosDeclineAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction();
                DEFAULT_INSTANCE = oopwvIosDeclineAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.class, oopwvIosDeclineAction);
            }

            private OopwvIosDeclineAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction oopwvIosDeclineAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvIosDeclineAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            LOADING(1),
            EXIT(2),
            OOPWV_CANCEL(3),
            OOPWV_FINISH(4),
            OOPWV_IOS_DECLINE(5),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6214a;

            a(int i) {
                this.f6214a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return LOADING;
                }
                if (i == 2) {
                    return EXIT;
                }
                if (i == 3) {
                    return OOPWV_CANCEL;
                }
                if (i == 4) {
                    return OOPWV_FINISH;
                }
                if (i != 5) {
                    return null;
                }
                return OOPWV_IOS_DECLINE;
            }

            public final int getNumber() {
                return this.f6214a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions.class, actions);
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

        private void clearLoading() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvCancel() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvFinish() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvIosDecline() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction getLoading() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction getOopwvCancel() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction getOopwvFinish() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction getOopwvIosDecline() {
            return this.actionCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.getDefaultInstance();
        }

        public final boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public final boolean hasLoading() {
            return this.actionCase_ == 1;
        }

        public final boolean hasOopwvCancel() {
            return this.actionCase_ == 3;
        }

        public final boolean hasOopwvFinish() {
            return this.actionCase_ == 4;
        }

        public final boolean hasOopwvIosDecline() {
            return this.actionCase_ == 5;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeLoading(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction loadingAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.getDefaultInstance()) {
                this.action_ = loadingAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction.a) loadingAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeOopwvCancel(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction oopwvCancelAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.getDefaultInstance()) {
                this.action_ = oopwvCancelAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction.a) oopwvCancelAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeOopwvFinish(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction oopwvFinishAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.getDefaultInstance()) {
                this.action_ = oopwvFinishAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction.a) oopwvFinishAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeOopwvIosDecline(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction oopwvIosDeclineAction) {
            if (this.actionCase_ != 5 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.getDefaultInstance()) {
                this.action_ = oopwvIosDeclineAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction.a) oopwvIosDeclineAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setLoading(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.LoadingAction loadingAction) {
            this.action_ = loadingAction;
            this.actionCase_ = 1;
        }

        private void setOopwvCancel(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvCancelAction oopwvCancelAction) {
            this.action_ = oopwvCancelAction;
            this.actionCase_ = 3;
        }

        private void setOopwvFinish(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvFinishAction oopwvFinishAction) {
            this.action_ = oopwvFinishAction;
            this.actionCase_ = 4;
        }

        private void setOopwvIosDecline(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.OopwvIosDeclineAction oopwvIosDeclineAction) {
            this.action_ = oopwvIosDeclineAction;
            this.actionCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CO_BRANDED_ASSET_ANIMATION_FIELD_NUMBER = 7;
        public static final int DEFAULT_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 4;
        public static final int FADE_OUT_WITH_SPINNER_FIELD_NUMBER = 6;
        public static final int MESSAGES_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering> PARSER = null;
        public static final int SKIP_AUTO_SUBMIT_FIELD_NUMBER = 8;
        public static final int SPINNER_FIELD_NUMBER = 5;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events events_;
        private boolean skipAutoSubmit_;
        private java.lang.Object style_;
        private int styleCase_ = 0;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> messages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class CoBrandedAssetAnimation extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int CO_BRANDED_HEADER_ASSET_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation DEFAULT_INSTANCE;
            public static final int PANE_ANIMATION_DURATION_MS_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset coBrandedHeaderAsset_;
            private long paneAnimationDurationMs_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation coBrandedAssetAnimation = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation();
                DEFAULT_INSTANCE = coBrandedAssetAnimation;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.class, coBrandedAssetAnimation);
            }

            private CoBrandedAssetAnimation() {
            }

            private void clearCoBrandedHeaderAsset() {
                this.coBrandedHeaderAsset_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPaneAnimationDurationMs() {
                this.paneAnimationDurationMs_ = 0L;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPaneAnimationDurationMs(long j) {
                this.paneAnimationDurationMs_ = j;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003", new java.lang.Object[]{"bitField0_", "coBrandedHeaderAsset_", "paneAnimationDurationMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset getCoBrandedHeaderAsset() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset = this.coBrandedHeaderAsset_;
                return common$CobrandedHeaderAsset == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance() : common$CobrandedHeaderAsset;
            }

            public final long getPaneAnimationDurationMs() {
                return this.paneAnimationDurationMs_;
            }

            public final boolean hasCoBrandedHeaderAsset() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeCoBrandedHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset2 = this.coBrandedHeaderAsset_;
                if (common$CobrandedHeaderAsset2 == null || common$CobrandedHeaderAsset2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance()) {
                    this.coBrandedHeaderAsset_ = common$CobrandedHeaderAsset;
                } else {
                    this.coBrandedHeaderAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.newBuilder(this.coBrandedHeaderAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a) common$CobrandedHeaderAsset).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation coBrandedAssetAnimation) {
                return DEFAULT_INSTANCE.createBuilder(coBrandedAssetAnimation);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setCoBrandedHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                this.coBrandedHeaderAsset_ = common$CobrandedHeaderAsset;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Default extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default r0 = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default();
                DEFAULT_INSTANCE = r0;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.class, r0);
            }

            private Default() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default r1) {
                return DEFAULT_INSTANCE.createBuilder(r1);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.class, events);
            }

            private Events() {
            }

            private void addAllOnAppear(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnAppearIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onAppear_);
            }

            private void clearOnAppear() {
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.class) {
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

            private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class FadeOutWithSpinner extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner fadeOutWithSpinner = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner();
                DEFAULT_INSTANCE = fadeOutWithSpinner;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.class, fadeOutWithSpinner);
            }

            private FadeOutWithSpinner() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner fadeOutWithSpinner) {
                return DEFAULT_INSTANCE.createBuilder(fadeOutWithSpinner);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Spinner extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner spinner = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner();
                DEFAULT_INSTANCE = spinner;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.class, spinner);
            }

            private Spinner() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner spinner) {
                return DEFAULT_INSTANCE.createBuilder(spinner);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            DEFAULT(2),
            SPINNER(5),
            FADE_OUT_WITH_SPINNER(6),
            CO_BRANDED_ASSET_ANIMATION(7),
            STYLE_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6215a;

            b(int i) {
                this.f6215a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.b forNumber(int i) {
                if (i == 0) {
                    return STYLE_NOT_SET;
                }
                if (i == 2) {
                    return DEFAULT;
                }
                if (i == 5) {
                    return SPINNER;
                }
                if (i == 6) {
                    return FADE_OUT_WITH_SPINNER;
                }
                if (i != 7) {
                    return null;
                }
                return CO_BRANDED_ASSET_ANIMATION;
            }

            public final int getNumber() {
                return this.f6215a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllMessages(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> iterable) {
            ensureMessagesIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.messages_);
        }

        private void clearCoBrandedAssetAnimation() {
            if (this.styleCase_ == 7) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearDefault() {
            if (this.styleCase_ == 2) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearFadeOutWithSpinner() {
            if (this.styleCase_ == 6) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearMessages() {
            this.messages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearSkipAutoSubmit() {
            this.skipAutoSubmit_ = false;
        }

        private void clearSpinner() {
            if (this.styleCase_ == 5) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearStyle() {
            this.styleCase_ = 0;
            this.style_ = null;
        }

        private void ensureMessagesIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> protobufList = this.messages_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.messages_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeMessages(int i) {
            ensureMessagesIsMutable();
            this.messages_.remove(i);
        }

        private void setSkipAutoSubmit(boolean z) {
            this.skipAutoSubmit_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\u001b\u0002<\u0000\u0004ဉ\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007", new java.lang.Object[]{"style_", "styleCase_", "bitField0_", "messages_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.class, "events_", com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.class, "skipAutoSubmit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation getCoBrandedAssetAnimation() {
            return this.styleCase_ == 7 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default getDefault() {
            return this.styleCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner getFadeOutWithSpinner() {
            return this.styleCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getMessages(int i) {
            return this.messages_.get(i);
        }

        public final int getMessagesCount() {
            return this.messages_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> getMessagesList() {
            return this.messages_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.C getMessagesOrBuilder(int i) {
            return this.messages_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.C> getMessagesOrBuilderList() {
            return this.messages_;
        }

        public final boolean getSkipAutoSubmit() {
            return this.skipAutoSubmit_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner getSpinner() {
            return this.styleCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.b getStyleCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.b.forNumber(this.styleCase_);
        }

        public final boolean hasCoBrandedAssetAnimation() {
            return this.styleCase_ == 7;
        }

        public final boolean hasDefault() {
            return this.styleCase_ == 2;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasFadeOutWithSpinner() {
            return this.styleCase_ == 6;
        }

        public final boolean hasSpinner() {
            return this.styleCase_ == 5;
        }

        private void addMessages(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            ensureMessagesIsMutable();
            this.messages_.add(common$LocalizedString);
        }

        private void mergeCoBrandedAssetAnimation(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation coBrandedAssetAnimation) {
            if (this.styleCase_ != 7 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.getDefaultInstance()) {
                this.style_ = coBrandedAssetAnimation;
            } else {
                this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation.a) coBrandedAssetAnimation).buildPartial();
            }
            this.styleCase_ = 7;
        }

        private void mergeDefault(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default r4) {
            if (this.styleCase_ != 2 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.getDefaultInstance()) {
                this.style_ = r4;
            } else {
                this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default.a) r4).buildPartial();
            }
            this.styleCase_ = 2;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeFadeOutWithSpinner(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner fadeOutWithSpinner) {
            if (this.styleCase_ != 6 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.getDefaultInstance()) {
                this.style_ = fadeOutWithSpinner;
            } else {
                this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner.a) fadeOutWithSpinner).buildPartial();
            }
            this.styleCase_ = 6;
        }

        private void mergeSpinner(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner spinner) {
            if (this.styleCase_ != 5 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.getDefaultInstance()) {
                this.style_ = spinner;
            } else {
                this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner.a) spinner).buildPartial();
            }
            this.styleCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setCoBrandedAssetAnimation(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.CoBrandedAssetAnimation coBrandedAssetAnimation) {
            this.style_ = coBrandedAssetAnimation;
            this.styleCase_ = 7;
        }

        private void setDefault(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Default r1) {
            this.style_ = r1;
            this.styleCase_ = 2;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        private void setFadeOutWithSpinner(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.FadeOutWithSpinner fadeOutWithSpinner) {
            this.style_ = fadeOutWithSpinner;
            this.styleCase_ = 6;
        }

        private void setMessages(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            ensureMessagesIsMutable();
            this.messages_.set(i, common$LocalizedString);
        }

        private void setSpinner(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.Spinner spinner) {
            this.style_ = spinner;
            this.styleCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addMessages(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            ensureMessagesIsMutable();
            this.messages_.add(i, common$LocalizedString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane loadingPaneOuterClass$LoadingPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane();
        DEFAULT_INSTANCE = loadingPaneOuterClass$LoadingPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.class, loadingPaneOuterClass$LoadingPane);
    }

    private LoadingPaneOuterClass$LoadingPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.j0.f6306a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane loadingPaneOuterClass$LoadingPane) {
        return DEFAULT_INSTANCE.createBuilder(loadingPaneOuterClass$LoadingPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
