package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class ButtonWithTablePaneOuterClass$ButtonWithTablePane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_TAP_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 2;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction buttonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction();
                DEFAULT_INSTANCE = buttonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.class, buttonTapAction);
            }

            private ButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0480f.f6297a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction buttonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0480f.f6297a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0480f.f6297a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            BUTTON_TAP(1),
            SECONDARY_BUTTON_TAP(2),
            EXIT(3),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6102a;

            a(int i) {
                this.f6102a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return BUTTON_TAP;
                }
                if (i == 2) {
                    return SECONDARY_BUTTON_TAP;
                }
                if (i != 3) {
                    return null;
                }
                return EXIT;
            }

            public final int getNumber() {
                return this.f6102a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.DEFAULT_INSTANCE);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.b a(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction exitAction) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) this.instance).setExit(exitAction);
                return this;
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.class, actions);
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
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryButtonTap() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0480f.f6297a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction getButtonTap() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction getExit() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final boolean hasButtonTap() {
            return this.actionCase_ == 1;
        }

        public final boolean hasExit() {
            return this.actionCase_ == 3;
        }

        public final boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 2;
        }

        private void mergeButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction buttonTapAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.getDefaultInstance()) {
                this.action_ = buttonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction.a) buttonTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ButtonTapAction buttonTapAction) {
            this.action_ = buttonTapAction;
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 3;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 10;
        public static final int BUTTON_FIELD_NUMBER = 5;
        public static final int CONTENT_FIELD_NUMBER = 9;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 7;
        public static final int HEADER_ASSET_FIELD_NUMBER = 1;
        public static final int HEADER_FIELD_NUMBER = 2;
        public static final int INSTITUTION_FIELD_NUMBER = 8;
        public static final int PANE_HEADER_FIELD_NUMBER = 11;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
        public static final int TABLE_ROWS_FIELD_NUMBER = 4;
        public static final int TABLE_TITLE_FIELD_NUMBER = 3;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString buttonDisclaimerText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString content_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance headerAsset_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution institution_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow> tableRows_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString tableTitle_;

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events> PARSER;
            private int bitField0_;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onButtonTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSecondaryButtonTap_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.class, events);
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0480f.f6297a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"bitField0_", "onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onButtonTap_", "onSecondaryButtonTap_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TableRow extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.b {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow DEFAULT_INSTANCE;
            public static final int LABEL_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow> PARSER = null;
            public static final int STYLE_FIELD_NUMBER = 3;
            public static final int VALUE_FIELD_NUMBER = 2;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString label_;
            private int style_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString value_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.b {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow tableRow = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow();
                DEFAULT_INSTANCE = tableRow;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.class, tableRow);
            }

            private TableRow() {
            }

            private void clearLabel() {
                this.label_ = null;
                this.bitField0_ &= -2;
            }

            private void clearStyle() {
                this.style_ = 0;
            }

            private void clearValue() {
                this.value_ = null;
                this.bitField0_ &= -3;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setStyle(com.plaid.internal.core.protos.link.workflow.nodes.panes.S s) {
                this.style_ = s.getNumber();
            }

            private void setStyleValue(int i) {
                this.style_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0480f.f6297a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new java.lang.Object[]{"bitField0_", "label_", "value_", "style_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getLabel() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.label_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.S getStyle() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.S forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.S.forNumber(this.style_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.S.UNRECOGNIZED : forNumber;
            }

            public final int getStyleValue() {
                return this.style_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getValue() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.value_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final boolean hasLabel() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
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

            private void mergeValue(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.value_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.value_ = common$LocalizedString;
                } else {
                    this.value_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.value_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow tableRow) {
                return DEFAULT_INSTANCE.createBuilder(tableRow);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.label_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            private void setValue(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.value_ = common$LocalizedString;
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public interface b extends com.google.protobuf.MessageLiteOrBuilder {
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllTableRows(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow> iterable) {
            ensureTableRowsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.tableRows_);
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -129;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -2;
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -33;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -513;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -17;
        }

        private void clearHeaderAsset() {
            this.headerAsset_ = null;
            this.bitField0_ &= -3;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -5;
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -9;
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -257;
        }

        private void clearTableRows() {
            this.tableRows_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearTableTitle() {
            this.tableTitle_ = null;
            this.bitField0_ &= -65;
        }

        private void ensureTableRowsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow> protobufList = this.tableRows_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tableRows_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeTableRows(int i) {
            ensureTableRowsIsMutable();
            this.tableRows_.remove(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0480f.f6297a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဉ\u0001\u0002ဉ\u0004\u0003ဉ\u0006\u0004\u001b\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဉ\u0002\tဉ\u0005\nဉ\u0000\u000bဉ\u0003", new java.lang.Object[]{"bitField0_", "headerAsset_", "header_", "tableTitle_", "tableRows_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow.class, "button_", "secondaryButton_", "events_", "institution_", "content_", "buttonDisclaimerText_", "paneHeader_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getContent() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.content_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.getDefaultInstance() : events;
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow getTableRows(int i) {
            return this.tableRows_.get(i);
        }

        public final int getTableRowsCount() {
            return this.tableRows_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow> getTableRowsList() {
            return this.tableRows_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.b getTableRowsOrBuilder(int i) {
            return this.tableRows_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.b> getTableRowsOrBuilderList() {
            return this.tableRows_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTableTitle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.tableTitle_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final boolean hasButton() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasContent() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 512) != 0;
        }

        public final boolean hasHeader() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasHeaderAsset() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasInstitution() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasPaneHeader() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasSecondaryButton() {
            return (this.bitField0_ & 256) != 0;
        }

        public final boolean hasTableTitle() {
            return (this.bitField0_ & 64) != 0;
        }

        private void addTableRows(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow tableRow) {
            ensureTableRowsIsMutable();
            this.tableRows_.add(tableRow);
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
            this.bitField0_ |= 1;
        }

        private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.content_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.content_ = common$LocalizedString;
            } else {
                this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events.a) events).buildPartial();
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
            this.bitField0_ |= 16;
        }

        private void mergeHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.headerAsset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.headerAsset_ = common$RenderedAssetAppearance;
            } else {
                this.headerAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.headerAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 2;
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

        private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
            if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                this.paneHeader_ = common$PaneHeader;
            } else {
                this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
            }
            this.bitField0_ |= 8;
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

        private void mergeTableTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.tableTitle_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.tableTitle_ = common$LocalizedString;
            } else {
                this.tableTitle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.tableTitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 128;
        }

        private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.content_ = common$LocalizedString;
            this.bitField0_ |= 32;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 512;
        }

        private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 16;
        }

        private void setHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.headerAsset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 2;
        }

        private void setInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 4;
        }

        private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 8;
        }

        private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        private void setTableRows(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow tableRow) {
            ensureTableRowsIsMutable();
            this.tableRows_.set(i, tableRow);
        }

        private void setTableTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.tableTitle_ = common$LocalizedString;
            this.bitField0_ |= 64;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addTableRows(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.TableRow tableRow) {
            ensureTableRowsIsMutable();
            this.tableRows_.add(i, tableRow);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane buttonWithTablePaneOuterClass$ButtonWithTablePane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane();
        DEFAULT_INSTANCE = buttonWithTablePaneOuterClass$ButtonWithTablePane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.class, buttonWithTablePaneOuterClass$ButtonWithTablePane);
    }

    private ButtonWithTablePaneOuterClass$ButtonWithTablePane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0480f.f6297a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane buttonWithTablePaneOuterClass$ButtonWithTablePane) {
        return DEFAULT_INSTANCE.createBuilder(buttonWithTablePaneOuterClass$ButtonWithTablePane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
