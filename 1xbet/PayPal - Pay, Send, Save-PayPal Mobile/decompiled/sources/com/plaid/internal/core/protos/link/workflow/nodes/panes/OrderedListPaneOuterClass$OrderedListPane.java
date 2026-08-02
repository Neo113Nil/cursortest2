package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class OrderedListPaneOuterClass$OrderedListPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_TAP_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction buttonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction();
                DEFAULT_INSTANCE = buttonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.class, buttonTapAction);
            }

            private ButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.l0.f6308a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction buttonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.l0.f6308a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.l0.f6308a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            BUTTON_TAP(1),
            SECONDARY_BUTTON_TAP(3),
            EXIT(2),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6224a;

            a(int i) {
                this.f6224a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return BUTTON_TAP;
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
                return this.f6224a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearButtonTap() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.l0.f6308a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction getButtonTap() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final boolean hasButtonTap() {
            return this.actionCase_ == 1;
        }

        public final boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public final boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 3;
        }

        private void mergeButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction buttonTapAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.getDefaultInstance()) {
                this.action_ = buttonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction.a) buttonTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ButtonTapAction buttonTapAction) {
            this.action_ = buttonTapAction;
            this.actionCase_ = 1;
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 11;
        public static final int BUTTON_FIELD_NUMBER = 7;
        public static final int CONTENT_FIELD_NUMBER = 8;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMER_FIELD_NUMBER = 6;
        public static final int EVENTS_FIELD_NUMBER = 4;
        public static final int HEADER_ALIGNMENT_FIELD_NUMBER = 12;
        public static final int HEADER_ASSET_FIELD_NUMBER = 2;
        public static final int HEADER_FIELD_NUMBER = 3;
        public static final int INSTITUTION_FIELD_NUMBER = 1;
        public static final int ITEMS_FIELD_NUMBER = 5;
        public static final int PANE_HEADER_FIELD_NUMBER = 9;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 10;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString buttonDisclaimerText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString content_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString disclaimer_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events events_;
        private int headerAlignment_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance headerAsset_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution institution_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem> items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events> PARSER;
            private int bitField0_;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onButtonTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSecondaryButtonTap_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.class, events);
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

            private void clearOnButtonTap() {
                this.onButtonTap_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
                this.bitField0_ &= -3;
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.l0.f6308a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"bitField0_", "onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onButtonTap_", "onSecondaryButtonTap_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnButtonTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onButtonTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSecondaryButtonTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSecondaryButtonTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final boolean hasOnButtonTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 2) != 0;
            }

            private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void mergeOnButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonTap_ = common$SDKEvent;
                } else {
                    this.onButtonTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onButtonTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSecondaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ListItem extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.b {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem DEFAULT_INSTANCE;
            public static final int DETAIL_FIELD_NUMBER = 2;
            public static final int LABEL_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString detail_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString label_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.b {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem listItem = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem();
                DEFAULT_INSTANCE = listItem;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.class, listItem);
            }

            private ListItem() {
            }

            private void clearDetail() {
                this.detail_ = null;
                this.bitField0_ &= -3;
            }

            private void clearLabel() {
                this.label_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.l0.f6308a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "label_", "detail_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getDetail() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.detail_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getLabel() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.label_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final boolean hasDetail() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasLabel() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.detail_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.detail_ = common$LocalizedString;
                } else {
                    this.detail_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.detail_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.label_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.label_ = common$LocalizedString;
                } else {
                    this.label_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.label_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem listItem) {
                return DEFAULT_INSTANCE.createBuilder(listItem);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.detail_ = common$LocalizedString;
                this.bitField0_ |= 2;
            }

            private void setLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.label_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public interface b extends com.google.protobuf.MessageLiteOrBuilder {
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem> iterable) {
            ensureItemsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -129;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -65;
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -17;
        }

        private void clearDisclaimer() {
            this.disclaimer_ = null;
            this.bitField0_ &= -33;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -513;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -9;
        }

        private void clearHeaderAlignment() {
            this.headerAlignment_ = 0;
        }

        private void clearHeaderAsset() {
            this.headerAsset_ = null;
            this.bitField0_ &= -5;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearItems() {
            this.items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -257;
        }

        private void ensureItemsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem> protobufList = this.items_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.items_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        private void setHeaderAlignment(com.plaid.internal.core.protos.link.workflow.nodes.panes.U u) {
            this.headerAlignment_ = u.getNumber();
        }

        private void setHeaderAlignmentValue(int i) {
            this.headerAlignment_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.l0.f6308a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\t\u0005\u001b\u0006ဉ\u0005\u0007ဉ\u0007\bဉ\u0004\tဉ\u0001\nဉ\b\u000bဉ\u0006\f\f", new java.lang.Object[]{"bitField0_", "institution_", "headerAsset_", "header_", "events_", "items_", com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem.class, "disclaimer_", "button_", "content_", "paneHeader_", "secondaryButton_", "buttonDisclaimerText_", "headerAlignment_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getContent() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getDisclaimer() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.disclaimer_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.U getHeaderAlignment() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.U forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.U.forNumber(this.headerAlignment_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.U.UNRECOGNIZED : forNumber;
        }

        public final int getHeaderAlignmentValue() {
            return this.headerAlignment_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getHeaderAsset() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
            return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution getInstitution() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem getItems(int i) {
            return this.items_.get(i);
        }

        public final int getItemsCount() {
            return this.items_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem> getItemsList() {
            return this.items_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.b getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.b> getItemsOrBuilderList() {
            return this.items_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final boolean hasButton() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 64) != 0;
        }

        public final boolean hasContent() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasDisclaimer() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 512) != 0;
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
            return (this.bitField0_ & 256) != 0;
        }

        private void addItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem listItem) {
            ensureItemsIsMutable();
            this.items_.add(listItem);
        }

        private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.button_ = common$ButtonContent;
            } else {
                this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            } else {
                this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.content_ = common$AttributedLocalizedString;
            } else {
                this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeDisclaimer(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.disclaimer_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.disclaimer_ = common$LocalizedString;
            } else {
                this.disclaimer_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.disclaimer_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 512;
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
            this.bitField0_ |= 256;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 128;
        }

        private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 64;
        }

        private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 16;
        }

        private void setDisclaimer(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.disclaimer_ = common$LocalizedString;
            this.bitField0_ |= 32;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 512;
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

        private void setItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem listItem) {
            ensureItemsIsMutable();
            this.items_.set(i, listItem);
        }

        private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.ListItem listItem) {
            ensureItemsIsMutable();
            this.items_.add(i, listItem);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane orderedListPaneOuterClass$OrderedListPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane();
        DEFAULT_INSTANCE = orderedListPaneOuterClass$OrderedListPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.class, orderedListPaneOuterClass$OrderedListPane);
    }

    private OrderedListPaneOuterClass$OrderedListPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.l0.f6308a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane orderedListPaneOuterClass$OrderedListPane) {
        return DEFAULT_INSTANCE.createBuilder(orderedListPaneOuterClass$OrderedListPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
