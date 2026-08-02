package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class UserSelectionPaneOuterClass$UserSelectionPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        public static final int TAP_END_OF_SELECTION_LIST_FIELD_NUMBER = 4;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction> PARSER = null;
            public static final int RESPONSES_FIELD_NUMBER = 1;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response> responses_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class Response extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.b {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response> PARSER = null;
                public static final int RESPONSE_IDS_FIELD_NUMBER = 1;
                public static final int SELECTION_ID_FIELD_NUMBER = 2;
                private java.lang.String selectionId_ = "";
                private com.google.protobuf.Internal.ProtobufList<java.lang.String> responseIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.b {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response response = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response();
                    DEFAULT_INSTANCE = response;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.class, response);
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

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setSelectionIdBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.selectionId_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new java.lang.Object[]{"responseIds_", "selectionId_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.class) {
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

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response response) {
                    return DEFAULT_INSTANCE.createBuilder(response);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                private void setResponseIds(int i, java.lang.String str) {
                    ensureResponseIdsIsMutable();
                    this.responseIds_.set(i, str);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setSelectionId(java.lang.String str) {
                    this.selectionId_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }
            }

            public interface b extends com.google.protobuf.MessageLiteOrBuilder {
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void addAllResponses(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response> iterable) {
                ensureResponsesIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.responses_);
            }

            private void clearResponses() {
                this.responses_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureResponsesIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response> protobufList = this.responses_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.responses_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeResponses(int i) {
                ensureResponsesIsMutable();
                this.responses_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"responses_", com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response getResponses(int i) {
                return this.responses_.get(i);
            }

            public final int getResponsesCount() {
                return this.responses_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response> getResponsesList() {
                return this.responses_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.b getResponsesOrBuilder(int i) {
                return this.responses_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.b> getResponsesOrBuilderList() {
                return this.responses_;
            }

            private void addResponses(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response response) {
                ensureResponsesIsMutable();
                this.responses_.add(response);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponses(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response response) {
                ensureResponsesIsMutable();
                this.responses_.set(i, response);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addResponses(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.Response response) {
                ensureResponsesIsMutable();
                this.responses_.add(i, response);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TapEndOfSelectionListAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction tapEndOfSelectionListAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction();
                DEFAULT_INSTANCE = tapEndOfSelectionListAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.class, tapEndOfSelectionListAction);
            }

            private TapEndOfSelectionListAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction tapEndOfSelectionListAction) {
                return DEFAULT_INSTANCE.createBuilder(tapEndOfSelectionListAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            SECONDARY_BUTTON_TAP(3),
            EXIT(2),
            TAP_END_OF_SELECTION_LIST(4),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6263a;

            a(int i) {
                this.f6263a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return SUBMIT;
                }
                if (i == 2) {
                    return EXIT;
                }
                if (i == 3) {
                    return SECONDARY_BUTTON_TAP;
                }
                if (i != 4) {
                    return null;
                }
                return TAP_END_OF_SELECTION_LIST;
            }

            public final int getNumber() {
                return this.f6263a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions.class, actions);
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

        private void clearTapEndOfSelectionList() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction getTapEndOfSelectionList() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.getDefaultInstance();
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

        public final boolean hasTapEndOfSelectionList() {
            return this.actionCase_ == 4;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeTapEndOfSelectionList(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction tapEndOfSelectionListAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.getDefaultInstance()) {
                this.action_ = tapEndOfSelectionListAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction.a) tapEndOfSelectionListAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        private void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        private void setTapEndOfSelectionList(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.TapEndOfSelectionListAction tapEndOfSelectionListAction) {
            this.action_ = tapEndOfSelectionListAction;
            this.actionCase_ = 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 12;
        public static final int BUTTON_FIELD_NUMBER = 7;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMER_FIELD_NUMBER = 16;
        public static final int END_OF_SELECTION_FLEXIBLE_COMPONENTS_FIELD_NUMBER = 18;
        public static final int END_OF_SELECTION_LIST_BUTTON_FIELD_NUMBER = 15;
        public static final int EVENTS_FIELD_NUMBER = 9;
        public static final int HEADER_ASSET_FIELD_NUMBER = 4;
        public static final int HEADER_FIELD_NUMBER = 5;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int PANE_HEADER_FIELD_NUMBER = 13;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 8;
        public static final int SELECTIONS_FIELD_NUMBER = 6;
        public static final int SELECTION_TILE_STYLE_OVERRIDE_FIELD_NUMBER = 19;
        public static final int SELECT_ALL_TOGGLE_FIELD_NUMBER = 14;
        public static final int UNSELECT_CONFIRMATION_MODAL_FIELD_NUMBER = 11;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString buttonDisclaimerText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer disclaimer_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent endOfSelectionListButton_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance headerAsset_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution institution_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle selectAllToggle_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride selectionTileStyleOverride_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal unselectConfirmationModal_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection> selections_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> endOfSelectionFlexibleComponents_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_TAP_FIELD_NUMBER = 2;
            public static final int ON_TAP_END_OF_SELECTION_LIST_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events> PARSER;
            private int bitField0_;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSecondaryButtonTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSubmitTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onTapEndOfSelectionList_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.class, events);
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

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
                this.bitField0_ &= -3;
            }

            private void clearOnSubmitTap() {
                this.onSubmitTap_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnTapEndOfSelectionList() {
                this.onTapEndOfSelectionList_ = null;
                this.bitField0_ &= -5;
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new java.lang.Object[]{"bitField0_", "onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onSubmitTap_", "onSecondaryButtonTap_", "onTapEndOfSelectionList_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSecondaryButtonTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSecondaryButtonTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSubmitTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSubmitTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnTapEndOfSelectionList() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onTapEndOfSelectionList_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasOnSubmitTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasOnTapEndOfSelectionList() {
                return (this.bitField0_ & 4) != 0;
            }

            private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void mergeOnSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSecondaryButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onSecondaryButtonTap_ = common$SDKEvent;
                } else {
                    this.onSecondaryButtonTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSecondaryButtonTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeOnSubmitTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSubmitTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmitTap_ = common$SDKEvent;
                } else {
                    this.onSubmitTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSubmitTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeOnTapEndOfSelectionList(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onTapEndOfSelectionList_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onTapEndOfSelectionList_ = common$SDKEvent;
                } else {
                    this.onTapEndOfSelectionList_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onTapEndOfSelectionList_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSecondaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            private void setOnSubmitTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSubmitTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnTapEndOfSelectionList(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onTapEndOfSelectionList_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Selection extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.b {
            public static final int ATTRIBUTED_PROMPT_FIELD_NUMBER = 5;
            public static final int BEHAVIOR_FIELD_NUMBER = 3;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 1;
            public static final int RESPONSES_FIELD_NUMBER = 2;
            public static final int RESPONSE_RENDERING_MODE_FIELD_NUMBER = 17;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString attributedPrompt_;
            private int behavior_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString prompt_;
            private int responseRenderingMode_;
            private java.lang.String id_ = "";
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> responses_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.b {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.DEFAULT_INSTANCE);
                }
            }

            public enum b implements com.google.protobuf.Internal.EnumLite {
                RESPONSE_RENDERING_MODE_UNKNOWN(0),
                RESPONSE_RENDERING_MODE_THREADS_5_LIST_ITEM(1),
                RESPONSE_RENDERING_MODE_THREADS_5_LIST(2),
                UNRECOGNIZED(-1);

                public static final int RESPONSE_RENDERING_MODE_THREADS_5_LIST_ITEM_VALUE = 1;
                public static final int RESPONSE_RENDERING_MODE_THREADS_5_LIST_VALUE = 2;
                public static final int RESPONSE_RENDERING_MODE_UNKNOWN_VALUE = 0;
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.a();

                /* renamed from: a, reason: collision with root package name */
                public final int f6264a;

                public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b findValueByNumber(int i) {
                        return com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.forNumber(i);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$Selection$b$b, reason: collision with other inner class name */
                public static final class C0192b implements com.google.protobuf.Internal.EnumVerifier {

                    /* renamed from: a, reason: collision with root package name */
                    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.C0192b f6265a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.C0192b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public final boolean isInRange(int i) {
                        return com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.forNumber(i) != null;
                    }
                }

                b(int i) {
                    this.f6264a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b forNumber(int i) {
                    if (i == 0) {
                        return RESPONSE_RENDERING_MODE_UNKNOWN;
                    }
                    if (i == 1) {
                        return RESPONSE_RENDERING_MODE_THREADS_5_LIST_ITEM;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return RESPONSE_RENDERING_MODE_THREADS_5_LIST;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b> internalGetValueMap() {
                    return b;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.C0192b.f6265a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f6264a;
                    }
                    throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection selection = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection();
                DEFAULT_INSTANCE = selection;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.class, selection);
            }

            private Selection() {
            }

            private void addAllResponses(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> iterable) {
                ensureResponsesIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.responses_);
            }

            private void clearAttributedPrompt() {
                this.attributedPrompt_ = null;
                this.bitField0_ &= -3;
            }

            private void clearBehavior() {
                this.behavior_ = 0;
            }

            private void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -2;
            }

            private void clearResponseRenderingMode() {
                this.responseRenderingMode_ = 0;
            }

            private void clearResponses() {
                this.responses_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureResponsesIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> protobufList = this.responses_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.responses_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeResponses(int i) {
                ensureResponsesIsMutable();
                this.responses_.remove(i);
            }

            private void setBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.O o2) {
                this.behavior_ = o2.getNumber();
            }

            private void setBehaviorValue(int i) {
                this.behavior_ = i;
            }

            private void setIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.id_ = byteString.toStringUtf8();
            }

            private void setResponseRenderingMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b bVar) {
                this.responseRenderingMode_ = bVar.getNumber();
            }

            private void setResponseRenderingModeValue(int i) {
                this.responseRenderingMode_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\f\u0004Ȉ\u0005ဉ\u0001\u0011\f", new java.lang.Object[]{"bitField0_", "prompt_", "responses_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.class, "behavior_", "id_", "attributedPrompt_", "responseRenderingMode_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedPrompt_;
                return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.O getBehavior() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.O forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.O.forNumber(this.behavior_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.O.UNRECOGNIZED : forNumber;
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.prompt_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b getResponseRenderingMode() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.forNumber(this.responseRenderingMode_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.b.UNRECOGNIZED : forNumber;
            }

            public final int getResponseRenderingModeValue() {
                return this.responseRenderingMode_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem getResponses(int i) {
                return this.responses_.get(i);
            }

            public final int getResponsesCount() {
                return this.responses_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> getResponsesList() {
                return this.responses_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.P getResponsesOrBuilder(int i) {
                return this.responses_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.P> getResponsesOrBuilderList() {
                return this.responses_;
            }

            public final boolean hasAttributedPrompt() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 1) != 0;
            }

            private void addResponses(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem common$SelectionListItem) {
                ensureResponsesIsMutable();
                this.responses_.add(common$SelectionListItem);
            }

            private void mergeAttributedPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedPrompt_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.attributedPrompt_ = common$AttributedLocalizedString;
                } else {
                    this.attributedPrompt_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.attributedPrompt_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection selection) {
                return DEFAULT_INSTANCE.createBuilder(selection);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setAttributedPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.attributedPrompt_ = common$AttributedLocalizedString;
                this.bitField0_ |= 2;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.prompt_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            private void setResponses(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem common$SelectionListItem) {
                ensureResponsesIsMutable();
                this.responses_.set(i, common$SelectionListItem);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setId(java.lang.String str) {
                this.id_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addResponses(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem common$SelectionListItem) {
                ensureResponsesIsMutable();
                this.responses_.add(i, common$SelectionListItem);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SelectionTileStyleOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride> PARSER = null;
            public static final int TILE_STYLE_OVERRIDE_FIELD_NUMBER = 1;
            private int tileStyleOverride_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride selectionTileStyleOverride = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride();
                DEFAULT_INSTANCE = selectionTileStyleOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.class, selectionTileStyleOverride);
            }

            private SelectionTileStyleOverride() {
            }

            private void clearTileStyleOverride() {
                this.tileStyleOverride_ = 0;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setTileStyleOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c cVar) {
                this.tileStyleOverride_ = cVar.getNumber();
            }

            private void setTileStyleOverrideValue(int i) {
                this.tileStyleOverride_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"tileStyleOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c getTileStyleOverride() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.forNumber(this.tileStyleOverride_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.UNRECOGNIZED : forNumber;
            }

            public final int getTileStyleOverrideValue() {
                return this.tileStyleOverride_;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride selectionTileStyleOverride) {
                return DEFAULT_INSTANCE.createBuilder(selectionTileStyleOverride);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public interface b extends com.google.protobuf.MessageLiteOrBuilder {
        }

        public enum c implements com.google.protobuf.Internal.EnumLite {
            TILE_STYLE_UNKNOWN(0),
            TILE_STYLE_VARIATION_1(1),
            UNRECOGNIZED(-1);

            public static final int TILE_STYLE_UNKNOWN_VALUE = 0;
            public static final int TILE_STYLE_VARIATION_1_VALUE = 1;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6266a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.b f6267a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f6266a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c forNumber(int i) {
                if (i == 0) {
                    return TILE_STYLE_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return TILE_STYLE_VARIATION_1;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c.b.f6267a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6266a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllEndOfSelectionFlexibleComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.endOfSelectionFlexibleComponents_);
        }

        private void addAllSelections(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection> iterable) {
            ensureSelectionsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.selections_);
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -65;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -33;
        }

        private void clearDisclaimer() {
            this.disclaimer_ = null;
            this.bitField0_ &= -4097;
        }

        private void clearEndOfSelectionFlexibleComponents() {
            this.endOfSelectionFlexibleComponents_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearEndOfSelectionListButton() {
            this.endOfSelectionListButton_ = null;
            this.bitField0_ &= -257;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -1025;
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
            this.bitField0_ &= -129;
        }

        private void clearSelectAllToggle() {
            this.selectAllToggle_ = null;
            this.bitField0_ &= -17;
        }

        private void clearSelectionTileStyleOverride() {
            this.selectionTileStyleOverride_ = null;
            this.bitField0_ &= -513;
        }

        private void clearSelections() {
            this.selections_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearUnselectConfirmationModal() {
            this.unselectConfirmationModal_ = null;
            this.bitField0_ &= -2049;
        }

        private void ensureEndOfSelectionFlexibleComponentsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.endOfSelectionFlexibleComponents_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.endOfSelectionFlexibleComponents_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureSelectionsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection> protobufList = this.selections_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.selections_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeEndOfSelectionFlexibleComponents(int i) {
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            this.endOfSelectionFlexibleComponents_.remove(i);
        }

        private void removeSelections(int i) {
            ensureSelectionsIsMutable();
            this.selections_.remove(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0002\u0013\u000f\u0000\u0002\u0000\u0002ဉ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001b\u0007ဉ\u0006\bဉ\u0007\tဉ\n\u000bဉ\u000b\fဉ\u0005\rဉ\u0001\u000eဉ\u0004\u000fဉ\b\u0010ဉ\f\u0012\u001b\u0013ဉ\t", new java.lang.Object[]{"bitField0_", "institution_", "headerAsset_", "header_", "selections_", com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection.class, "button_", "secondaryButton_", "events_", "unselectConfirmationModal_", "buttonDisclaimerText_", "paneHeader_", "selectAllToggle_", "endOfSelectionListButton_", "disclaimer_", "endOfSelectionFlexibleComponents_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class, "selectionTileStyleOverride_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer getDisclaimer() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer common$Disclaimer = this.disclaimer_;
            return common$Disclaimer == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.getDefaultInstance() : common$Disclaimer;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getEndOfSelectionFlexibleComponents(int i) {
            return this.endOfSelectionFlexibleComponents_.get(i);
        }

        public final int getEndOfSelectionFlexibleComponentsCount() {
            return this.endOfSelectionFlexibleComponents_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getEndOfSelectionFlexibleComponentsList() {
            return this.endOfSelectionFlexibleComponents_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getEndOfSelectionFlexibleComponentsOrBuilder(int i) {
            return this.endOfSelectionFlexibleComponents_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getEndOfSelectionFlexibleComponentsOrBuilderList() {
            return this.endOfSelectionFlexibleComponents_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getEndOfSelectionListButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.endOfSelectionListButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.getDefaultInstance() : events;
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle getSelectAllToggle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle selectAllToggle = this.selectAllToggle_;
            return selectAllToggle == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle.getDefaultInstance() : selectAllToggle;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride getSelectionTileStyleOverride() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride selectionTileStyleOverride = this.selectionTileStyleOverride_;
            return selectionTileStyleOverride == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.getDefaultInstance() : selectionTileStyleOverride;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection getSelections(int i) {
            return this.selections_.get(i);
        }

        public final int getSelectionsCount() {
            return this.selections_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection> getSelectionsList() {
            return this.selections_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.b getSelectionsOrBuilder(int i) {
            return this.selections_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.b> getSelectionsOrBuilderList() {
            return this.selections_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal getUnselectConfirmationModal() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal = this.unselectConfirmationModal_;
            return common$Modal == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.getDefaultInstance() : common$Modal;
        }

        public final boolean hasButton() {
            return (this.bitField0_ & 64) != 0;
        }

        public final boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasDisclaimer() {
            return (this.bitField0_ & 4096) != 0;
        }

        public final boolean hasEndOfSelectionListButton() {
            return (this.bitField0_ & 256) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 1024) != 0;
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
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean hasSelectAllToggle() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasSelectionTileStyleOverride() {
            return (this.bitField0_ & 512) != 0;
        }

        public final boolean hasUnselectConfirmationModal() {
            return (this.bitField0_ & 2048) != 0;
        }

        private void addEndOfSelectionFlexibleComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            this.endOfSelectionFlexibleComponents_.add(common$FlexibleComponent);
        }

        private void addSelections(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection selection) {
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
            this.bitField0_ |= 64;
        }

        private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            } else {
                this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeDisclaimer(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer common$Disclaimer) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer common$Disclaimer2 = this.disclaimer_;
            if (common$Disclaimer2 == null || common$Disclaimer2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.getDefaultInstance()) {
                this.disclaimer_ = common$Disclaimer;
            } else {
                this.disclaimer_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.newBuilder(this.disclaimer_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.a) common$Disclaimer).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        private void mergeEndOfSelectionListButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.endOfSelectionListButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.endOfSelectionListButton_ = common$ButtonContent;
            } else {
                this.endOfSelectionListButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.endOfSelectionListButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 1024;
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
            this.bitField0_ |= 128;
        }

        private void mergeSelectAllToggle(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle selectAllToggle) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle selectAllToggle2 = this.selectAllToggle_;
            if (selectAllToggle2 == null || selectAllToggle2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle.getDefaultInstance()) {
                this.selectAllToggle_ = selectAllToggle;
            } else {
                this.selectAllToggle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle.newBuilder(this.selectAllToggle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggle.a) selectAllToggle).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeSelectionTileStyleOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride selectionTileStyleOverride) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride selectionTileStyleOverride2 = this.selectionTileStyleOverride_;
            if (selectionTileStyleOverride2 == null || selectionTileStyleOverride2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.getDefaultInstance()) {
                this.selectionTileStyleOverride_ = selectionTileStyleOverride;
            } else {
                this.selectionTileStyleOverride_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.newBuilder(this.selectionTileStyleOverride_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride.a) selectionTileStyleOverride).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeUnselectConfirmationModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal2 = this.unselectConfirmationModal_;
            if (common$Modal2 == null || common$Modal2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.getDefaultInstance()) {
                this.unselectConfirmationModal_ = common$Modal;
            } else {
                this.unselectConfirmationModal_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.newBuilder(this.unselectConfirmationModal_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.a) common$Modal).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 64;
        }

        private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 32;
        }

        private void setDisclaimer(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer common$Disclaimer) {
            this.disclaimer_ = common$Disclaimer;
            this.bitField0_ |= 4096;
        }

        private void setEndOfSelectionFlexibleComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            this.endOfSelectionFlexibleComponents_.set(i, common$FlexibleComponent);
        }

        private void setEndOfSelectionListButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.endOfSelectionListButton_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 1024;
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
            this.bitField0_ |= 128;
        }

        private void setSelectAllToggle(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle selectAllToggle) {
            this.selectAllToggle_ = selectAllToggle;
            this.bitField0_ |= 16;
        }

        private void setSelectionTileStyleOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.SelectionTileStyleOverride selectionTileStyleOverride) {
            this.selectionTileStyleOverride_ = selectionTileStyleOverride;
            this.bitField0_ |= 512;
        }

        private void setSelections(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection selection) {
            ensureSelectionsIsMutable();
            this.selections_.set(i, selection);
        }

        private void setUnselectConfirmationModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal) {
            this.unselectConfirmationModal_ = common$Modal;
            this.bitField0_ |= 2048;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addEndOfSelectionFlexibleComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            this.endOfSelectionFlexibleComponents_.add(i, common$FlexibleComponent);
        }

        private void addSelections(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.Selection selection) {
            ensureSelectionsIsMutable();
            this.selections_.add(i, selection);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SelectAllToggle extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggle.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle DEFAULT_INSTANCE;
        public static final int IS_VISIBLE_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle> PARSER = null;
        public static final int PRESELECTED_FIELD_NUMBER = 4;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean isVisible_;
        private boolean preselected_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle subtitle_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString title_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggle.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle selectAllToggle = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle();
            DEFAULT_INSTANCE = selectAllToggle;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle.class, selectAllToggle);
        }

        private SelectAllToggle() {
        }

        private void clearIsVisible() {
            this.isVisible_ = false;
        }

        private void clearPreselected() {
            this.preselected_ = false;
        }

        private void clearSubtitle() {
            this.subtitle_ = null;
            this.bitField0_ &= -3;
        }

        private void clearTitle() {
            this.title_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggle.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsVisible(boolean z) {
            this.isVisible_ = z;
        }

        private void setPreselected(boolean z) {
            this.preselected_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggle.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004\u0007", new java.lang.Object[]{"bitField0_", "title_", "subtitle_", "isVisible_", "preselected_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle.class) {
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

        public final boolean getIsVisible() {
            return this.isVisible_;
        }

        public final boolean getPreselected() {
            return this.preselected_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle getSubtitle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle selectAllToggleSubtitle = this.subtitle_;
            return selectAllToggleSubtitle == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle.getDefaultInstance() : selectAllToggleSubtitle;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getTitle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.title_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final boolean hasSubtitle() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle selectAllToggleSubtitle) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle selectAllToggleSubtitle2 = this.subtitle_;
            if (selectAllToggleSubtitle2 == null || selectAllToggleSubtitle2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle.getDefaultInstance()) {
                this.subtitle_ = selectAllToggleSubtitle;
            } else {
                this.subtitle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle.newBuilder(this.subtitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggleSubtitle.a) selectAllToggleSubtitle).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.title_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.title_ = common$AttributedLocalizedString;
            } else {
                this.title_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggle.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle selectAllToggle) {
            return DEFAULT_INSTANCE.createBuilder(selectAllToggle);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle selectAllToggleSubtitle) {
            this.subtitle_ = selectAllToggleSubtitle;
            this.bitField0_ |= 2;
        }

        private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.title_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SelectAllToggleSubtitle extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggleSubtitle.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CONTENT_MULTIPLE_SELECTED_FIELD_NUMBER = 3;
        public static final int CONTENT_ONE_SELECTED_FIELD_NUMBER = 2;
        public static final int CONTENT_ZERO_SELECTED_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle> PARSER;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString contentMultipleSelected_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString contentOneSelected_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString contentZeroSelected_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggleSubtitle.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle selectAllToggleSubtitle = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle();
            DEFAULT_INSTANCE = selectAllToggleSubtitle;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle.class, selectAllToggleSubtitle);
        }

        private SelectAllToggleSubtitle() {
        }

        private void clearContentMultipleSelected() {
            this.contentMultipleSelected_ = null;
            this.bitField0_ &= -5;
        }

        private void clearContentOneSelected() {
            this.contentOneSelected_ = null;
            this.bitField0_ &= -3;
        }

        private void clearContentZeroSelected() {
            this.contentZeroSelected_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggleSubtitle.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggleSubtitle.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"bitField0_", "contentZeroSelected_", "contentOneSelected_", "contentMultipleSelected_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getContentMultipleSelected() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.contentMultipleSelected_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getContentOneSelected() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.contentOneSelected_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getContentZeroSelected() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.contentZeroSelected_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final boolean hasContentMultipleSelected() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasContentOneSelected() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasContentZeroSelected() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeContentMultipleSelected(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.contentMultipleSelected_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.contentMultipleSelected_ = common$AttributedLocalizedString;
            } else {
                this.contentMultipleSelected_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.contentMultipleSelected_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeContentOneSelected(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.contentOneSelected_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.contentOneSelected_ = common$AttributedLocalizedString;
            } else {
                this.contentOneSelected_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.contentOneSelected_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeContentZeroSelected(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.contentZeroSelected_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.contentZeroSelected_ = common$AttributedLocalizedString;
            } else {
                this.contentZeroSelected_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.contentZeroSelected_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.SelectAllToggleSubtitle.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle selectAllToggleSubtitle) {
            return DEFAULT_INSTANCE.createBuilder(selectAllToggleSubtitle);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setContentMultipleSelected(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.contentMultipleSelected_ = common$AttributedLocalizedString;
            this.bitField0_ |= 4;
        }

        private void setContentOneSelected(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.contentOneSelected_ = common$AttributedLocalizedString;
            this.bitField0_ |= 2;
        }

        private void setContentZeroSelected(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.contentZeroSelected_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.SelectAllToggleSubtitle) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane userSelectionPaneOuterClass$UserSelectionPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane();
        DEFAULT_INSTANCE = userSelectionPaneOuterClass$UserSelectionPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.class, userSelectionPaneOuterClass$UserSelectionPane);
    }

    private UserSelectionPaneOuterClass$UserSelectionPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.x0.f6339a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane userSelectionPaneOuterClass$UserSelectionPane) {
        return DEFAULT_INSTANCE.createBuilder(userSelectionPaneOuterClass$UserSelectionPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
