package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class GridSelectionPaneOuterClass$GridSelectionPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction> PARSER = null;
            public static final int RESPONSES_FIELD_NUMBER = 1;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response> responses_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class Response extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.b {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response> PARSER = null;
                public static final int RESPONSE_IDS_FIELD_NUMBER = 1;
                public static final int SELECTION_ID_FIELD_NUMBER = 2;
                private java.lang.String selectionId_ = "";
                private com.google.protobuf.Internal.ProtobufList<java.lang.String> responseIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.b {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response response = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response();
                    DEFAULT_INSTANCE = response;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.class, response);
                }

                private Response() {
                }

                private void addAllResponseIds(java.lang.Iterable<java.lang.String> iterable) {
                    ensureResponseIdsIsMutable();
                    com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.responseIds_);
                }

                private void addResponseIdsBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    ensureResponseIdsIsMutable();
                    this.responseIds_.add(byteString.toStringUtf8());
                }

                private void clearResponseIds() {
                    this.responseIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
                }

                private void clearSelectionId() {
                    this.selectionId_ = getDefaultInstance().getSelectionId();
                }

                private void ensureResponseIdsIsMutable() {
                    com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.responseIds_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.responseIds_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setSelectionIdBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.selectionId_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new java.lang.Object[]{"responseIds_", "selectionId_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.class) {
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

                public final java.lang.String getResponseIds(int i) {
                    return this.responseIds_.get(i);
                }

                public final com.google.protobuf.ByteString getResponseIdsBytes(int i) {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.responseIds_.get(i));
                }

                public final int getResponseIdsCount() {
                    return this.responseIds_.size();
                }

                public final java.util.List<java.lang.String> getResponseIdsList() {
                    return this.responseIds_;
                }

                public final java.lang.String getSelectionId() {
                    return this.selectionId_;
                }

                public final com.google.protobuf.ByteString getSelectionIdBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.selectionId_);
                }

                private void addResponseIds(java.lang.String str) {
                    ensureResponseIdsIsMutable();
                    this.responseIds_.add(str);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response response) {
                    return DEFAULT_INSTANCE.createBuilder(response);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                private void setResponseIds(int i, java.lang.String str) {
                    ensureResponseIdsIsMutable();
                    this.responseIds_.set(i, str);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setSelectionId(java.lang.String str) {
                    this.selectionId_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }
            }

            public interface b extends com.google.protobuf.MessageLiteOrBuilder {
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void addAllResponses(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response> iterable) {
                ensureResponsesIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.responses_);
            }

            private void clearResponses() {
                this.responses_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureResponsesIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response> protobufList = this.responses_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.responses_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeResponses(int i) {
                ensureResponsesIsMutable();
                this.responses_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"responses_", com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response getResponses(int i) {
                return this.responses_.get(i);
            }

            public final int getResponsesCount() {
                return this.responses_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response> getResponsesList() {
                return this.responses_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.b getResponsesOrBuilder(int i) {
                return this.responses_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.b> getResponsesOrBuilderList() {
                return this.responses_;
            }

            private void addResponses(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response response) {
                ensureResponsesIsMutable();
                this.responses_.add(response);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponses(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response response) {
                ensureResponsesIsMutable();
                this.responses_.set(i, response);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addResponses(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.Response response) {
                ensureResponsesIsMutable();
                this.responses_.add(i, response);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            SECONDARY_BUTTON_TAP(3),
            EXIT(2),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6206a;

            a(int i) {
                this.f6206a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.a forNumber(int i) {
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
                return this.f6206a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions.class, actions);
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.getDefaultInstance();
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

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        private void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_FIELD_NUMBER = 7;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 8;
        public static final int HEADER_ASSET_FIELD_NUMBER = 4;
        public static final int HEADER_FIELD_NUMBER = 5;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int PANE_HEADER_FIELD_NUMBER = 9;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 10;
        public static final int SELECTIONS_FIELD_NUMBER = 6;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance headerAsset_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution institution_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection> selections_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.class, events);
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Selection extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.b {
            public static final int BEHAVIOR_FIELD_NUMBER = 3;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 4;
            public static final int ITEMS_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 1;
            private int behavior_;
            private int bitField0_;
            private java.lang.String id_ = "";
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem> items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString prompt_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.b {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection selection = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection();
                DEFAULT_INSTANCE = selection;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.class, selection);
            }

            private Selection() {
            }

            private void addAllItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem> iterable) {
                ensureItemsIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
            }

            private void clearBehavior() {
                this.behavior_ = 0;
            }

            private void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            private void clearItems() {
                this.items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -2;
            }

            private void ensureItemsIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem> protobufList = this.items_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.items_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeItems(int i) {
                ensureItemsIsMutable();
                this.items_.remove(i);
            }

            private void setBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x enumC0497x) {
                this.behavior_ = enumC0497x.getNumber();
            }

            private void setBehaviorValue(int i) {
                this.behavior_ = i;
            }

            private void setIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.id_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\f\u0004Ȉ", new java.lang.Object[]{"bitField0_", "prompt_", "items_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.class, "behavior_", "id_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x getBehavior() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.forNumber(this.behavior_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.UNRECOGNIZED : forNumber;
            }

            public final int getBehaviorValue() {
                return this.behavior_;
            }

            public final java.lang.String getId() {
                return this.id_;
            }

            public final com.google.protobuf.ByteString getIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem getItems(int i) {
                return this.items_.get(i);
            }

            public final int getItemsCount() {
                return this.items_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem> getItemsList() {
                return this.items_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0498y getItemsOrBuilder(int i) {
                return this.items_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0498y> getItemsOrBuilderList() {
                return this.items_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.prompt_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 1) != 0;
            }

            private void addItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem common$GridSelectionImageItem) {
                ensureItemsIsMutable();
                this.items_.add(common$GridSelectionImageItem);
            }

            private void mergePrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.prompt_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.prompt_ = common$LocalizedString;
                } else {
                    this.prompt_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.prompt_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection selection) {
                return DEFAULT_INSTANCE.createBuilder(selection);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem common$GridSelectionImageItem) {
                ensureItemsIsMutable();
                this.items_.set(i, common$GridSelectionImageItem);
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.prompt_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setId(java.lang.String str) {
                this.id_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem common$GridSelectionImageItem) {
                ensureItemsIsMutable();
                this.items_.add(i, common$GridSelectionImageItem);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public interface b extends com.google.protobuf.MessageLiteOrBuilder {
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllSelections(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection> iterable) {
            ensureSelectionsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.selections_);
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -17;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -65;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -9;
        }

        private void clearHeaderAsset() {
            this.headerAsset_ = null;
            this.bitField0_ &= -5;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -33;
        }

        private void clearSelections() {
            this.selections_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSelectionsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection> protobufList = this.selections_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.selections_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeSelections(int i) {
            ensureSelectionsIsMutable();
            this.selections_.remove(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0002\n\b\u0000\u0001\u0000\u0002ဉ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001b\u0007ဉ\u0004\bဉ\u0006\tဉ\u0001\nဉ\u0005", new java.lang.Object[]{"bitField0_", "institution_", "headerAsset_", "header_", "selections_", com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection.class, "button_", "events_", "paneHeader_", "secondaryButton_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getHeaderAsset() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
            return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution getInstitution() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection getSelections(int i) {
            return this.selections_.get(i);
        }

        public final int getSelectionsCount() {
            return this.selections_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection> getSelectionsList() {
            return this.selections_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.b getSelectionsOrBuilder(int i) {
            return this.selections_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.b> getSelectionsOrBuilderList() {
            return this.selections_;
        }

        public final boolean hasButton() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 64) != 0;
        }

        public final boolean hasHeader() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasHeaderAsset() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasPaneHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasSecondaryButton() {
            return (this.bitField0_ & 32) != 0;
        }

        private void addSelections(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection selection) {
            ensureSelectionsIsMutable();
            this.selections_.add(selection);
        }

        private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.button_ = common$ButtonContent;
            } else {
                this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.header_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.header_ = common$LocalizedString;
            } else {
                this.header_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.header_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.headerAsset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.headerAsset_ = common$RenderedAssetAppearance;
            } else {
                this.headerAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.headerAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution2 = this.institution_;
            if (common$RenderedInstitution2 == null || common$RenderedInstitution2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance()) {
                this.institution_ = common$RenderedInstitution;
            } else {
                this.institution_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.newBuilder(this.institution_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.a) common$RenderedInstitution).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
            if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                this.paneHeader_ = common$PaneHeader;
            } else {
                this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.secondaryButton_ = common$ButtonContent;
            } else {
                this.secondaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 16;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 64;
        }

        private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 8;
        }

        private void setHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.headerAsset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 4;
        }

        private void setInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 1;
        }

        private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 32;
        }

        private void setSelections(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection selection) {
            ensureSelectionsIsMutable();
            this.selections_.set(i, selection);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addSelections(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.Selection selection) {
            ensureSelectionsIsMutable();
            this.selections_.add(i, selection);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane gridSelectionPaneOuterClass$GridSelectionPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane();
        DEFAULT_INSTANCE = gridSelectionPaneOuterClass$GridSelectionPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.class, gridSelectionPaneOuterClass$GridSelectionPane);
    }

    private GridSelectionPaneOuterClass$GridSelectionPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.g0.f6300a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane gridSelectionPaneOuterClass$GridSelectionPane) {
        return DEFAULT_INSTANCE.createBuilder(gridSelectionPaneOuterClass$GridSelectionPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
