package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class ConsentPaneOuterClass$ConsentPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 1;
        public static final int BUTTON_TAP_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 4;
        public static final int OOPWV_CANCEL_FIELD_NUMBER = 6;
        public static final int OOPWV_FINISH_FIELD_NUMBER = 7;
        public static final int OOPWV_IOS_DECLINE_FIELD_NUMBER = 8;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 5;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ButtonDisclaimerTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction();
                DEFAULT_INSTANCE = buttonDisclaimerTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.class, buttonDisclaimerTapAction);
            }

            private ButtonDisclaimerTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonDisclaimerTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction buttonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction();
                DEFAULT_INSTANCE = buttonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.class, buttonTapAction);
            }

            private ButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction buttonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvCancelAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction oopwvCancelAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction();
                DEFAULT_INSTANCE = oopwvCancelAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.class, oopwvCancelAction);
            }

            private OopwvCancelAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction oopwvCancelAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvCancelAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvFinishAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction oopwvFinishAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction();
                DEFAULT_INSTANCE = oopwvFinishAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.class, oopwvFinishAction);
            }

            private OopwvFinishAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction oopwvFinishAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvFinishAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvIosDeclineAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction oopwvIosDeclineAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction();
                DEFAULT_INSTANCE = oopwvIosDeclineAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.class, oopwvIosDeclineAction);
            }

            private OopwvIosDeclineAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction oopwvIosDeclineAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvIosDeclineAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonDisclaimerTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction secondaryButtonDisclaimerTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction();
                DEFAULT_INSTANCE = secondaryButtonDisclaimerTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.class, secondaryButtonDisclaimerTapAction);
            }

            private SecondaryButtonDisclaimerTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction secondaryButtonDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonDisclaimerTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            BUTTON_DISCLAIMER_TAP(1),
            BUTTON_TAP(2),
            SECONDARY_BUTTON_TAP(3),
            SECONDARY_BUTTON_DISCLAIMER_TAP(5),
            EXIT(4),
            OOPWV_CANCEL(6),
            OOPWV_FINISH(7),
            OOPWV_IOS_DECLINE(8),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6179a;

            a(int i) {
                this.f6179a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.a forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return BUTTON_DISCLAIMER_TAP;
                    case 2:
                        return BUTTON_TAP;
                    case 3:
                        return SECONDARY_BUTTON_TAP;
                    case 4:
                        return EXIT;
                    case 5:
                        return SECONDARY_BUTTON_DISCLAIMER_TAP;
                    case 6:
                        return OOPWV_CANCEL;
                    case 7:
                        return OOPWV_FINISH;
                    case 8:
                        return OOPWV_IOS_DECLINE;
                    default:
                        return null;
                }
            }

            public final int getNumber() {
                return this.f6179a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearButtonDisclaimerTap() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonTap() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearExit() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvCancel() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvFinish() {
            if (this.actionCase_ == 7) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvIosDecline() {
            if (this.actionCase_ == 8) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryButtonDisclaimerTap() {
            if (this.actionCase_ == 5) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction getButtonTap() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction getOopwvCancel() {
            return this.actionCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction getOopwvFinish() {
            return this.actionCase_ == 7 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction getOopwvIosDecline() {
            return this.actionCase_ == 8 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction getSecondaryButtonDisclaimerTap() {
            return this.actionCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final boolean hasButtonDisclaimerTap() {
            return this.actionCase_ == 1;
        }

        public final boolean hasButtonTap() {
            return this.actionCase_ == 2;
        }

        public final boolean hasExit() {
            return this.actionCase_ == 4;
        }

        public final boolean hasOopwvCancel() {
            return this.actionCase_ == 6;
        }

        public final boolean hasOopwvFinish() {
            return this.actionCase_ == 7;
        }

        public final boolean hasOopwvIosDecline() {
            return this.actionCase_ == 8;
        }

        public final boolean hasSecondaryButtonDisclaimerTap() {
            return this.actionCase_ == 5;
        }

        public final boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 3;
        }

        private void mergeButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = buttonDisclaimerTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction.a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction buttonTapAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.getDefaultInstance()) {
                this.action_ = buttonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction.a) buttonTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeOopwvCancel(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction oopwvCancelAction) {
            if (this.actionCase_ != 6 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.getDefaultInstance()) {
                this.action_ = oopwvCancelAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction.a) oopwvCancelAction).buildPartial();
            }
            this.actionCase_ = 6;
        }

        private void mergeOopwvFinish(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction oopwvFinishAction) {
            if (this.actionCase_ != 7 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.getDefaultInstance()) {
                this.action_ = oopwvFinishAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction.a) oopwvFinishAction).buildPartial();
            }
            this.actionCase_ = 7;
        }

        private void mergeOopwvIosDecline(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction oopwvIosDeclineAction) {
            if (this.actionCase_ != 8 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.getDefaultInstance()) {
                this.action_ = oopwvIosDeclineAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction.a) oopwvIosDeclineAction).buildPartial();
            }
            this.actionCase_ = 8;
        }

        private void mergeSecondaryButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction secondaryButtonDisclaimerTapAction) {
            if (this.actionCase_ != 5 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonDisclaimerTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.a) secondaryButtonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            this.action_ = buttonDisclaimerTapAction;
            this.actionCase_ = 1;
        }

        private void setButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ButtonTapAction buttonTapAction) {
            this.action_ = buttonTapAction;
            this.actionCase_ = 2;
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 4;
        }

        private void setOopwvCancel(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvCancelAction oopwvCancelAction) {
            this.action_ = oopwvCancelAction;
            this.actionCase_ = 6;
        }

        private void setOopwvFinish(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvFinishAction oopwvFinishAction) {
            this.action_ = oopwvFinishAction;
            this.actionCase_ = 7;
        }

        private void setOopwvIosDecline(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.OopwvIosDeclineAction oopwvIosDeclineAction) {
            this.action_ = oopwvIosDeclineAction;
            this.actionCase_ = 8;
        }

        private void setSecondaryButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonDisclaimerTapAction secondaryButtonDisclaimerTapAction) {
            this.action_ = secondaryButtonDisclaimerTapAction;
            this.actionCase_ = 5;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DisclaimerText extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.DisclaimerText.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ADDITIONAL_ACTIONS_FIELD_NUMBER = 2;
        public static final int ATTRIBUTED_TEXT_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText> PARSER;
        private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> additionalActions_ = com.google.protobuf.MapFieldLite.emptyMapField();
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString attributedText_;
        private int bitField0_;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final com.google.protobuf.MapEntryLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> f6180a = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions.getDefaultInstance());
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.DisclaimerText.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText disclaimerText = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText();
            DEFAULT_INSTANCE = disclaimerText;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText.class, disclaimerText);
        }

        private DisclaimerText() {
        }

        private void clearAttributedText() {
            this.attributedText_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> getMutableAdditionalActionsMap() {
            return internalGetMutableAdditionalActions();
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> internalGetAdditionalActions() {
            return this.additionalActions_;
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> internalGetMutableAdditionalActions() {
            if (!this.additionalActions_.isMutable()) {
                this.additionalActions_ = this.additionalActions_.mutableCopy();
            }
            return this.additionalActions_;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.DisclaimerText.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.DisclaimerText.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new java.lang.Object[]{"bitField0_", "attributedText_", "additionalActions_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.DisclaimerText.a.f6180a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText.class) {
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

        @java.lang.Deprecated
        public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> getAdditionalActions() {
            return getAdditionalActionsMap();
        }

        public final int getAdditionalActionsCount() {
            return internalGetAdditionalActions().size();
        }

        public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> getAdditionalActionsMap() {
            return java.util.Collections.unmodifiableMap(internalGetAdditionalActions());
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedText_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final boolean hasAttributedText() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeAttributedText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.attributedText_ = common$AttributedLocalizedString;
            } else {
                this.attributedText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.attributedText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.DisclaimerText.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText disclaimerText) {
            return DEFAULT_INSTANCE.createBuilder(disclaimerText);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAttributedText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.attributedText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        public final boolean containsAdditionalActions(java.lang.String str) {
            return internalGetAdditionalActions().containsKey(str);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions getAdditionalActionsOrDefault(java.lang.String str, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions actions) {
            com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> internalGetAdditionalActions = internalGetAdditionalActions();
            return internalGetAdditionalActions.containsKey(str) ? internalGetAdditionalActions.get(str) : actions;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions getAdditionalActionsOrThrow(java.lang.String str) {
            com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions> internalGetAdditionalActions = internalGetAdditionalActions();
            if (internalGetAdditionalActions.containsKey(str)) {
                return internalGetAdditionalActions.get(str);
            }
            throw new java.lang.IllegalArgumentException();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ACCORDION_FIELD_NUMBER = 17;
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 8;
        public static final int BUTTON_FIELD_NUMBER = 5;
        public static final int CONTENT_FIELD_NUMBER = 15;
        public static final int CO_BRANDED_ASSET_FIELD_NUMBER = 12;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 7;
        public static final int HEADER_ASSET_FIELD_NUMBER = 1;
        public static final int HEADER_FIELD_NUMBER = 2;
        public static final int HEADER_STYLE_FIELD_NUMBER = 14;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering> PARSER = null;
        public static final int PLAID_BRANDED_ASSET_FIELD_NUMBER = 9;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
        public static final int SECONDARY_CONTENT_FIELD_NUMBER = 16;
        public static final int SECTIONS_FIELD_NUMBER = 3;
        public static final int SECTION_FIELD_NUMBER = 18;
        public static final int SHOW_ACTION_DIVIDER_LINE_FIELD_NUMBER = 11;
        public static final int SUPPRESS_CO_BRANDED_ASSET_ANIMATION_FIELD_NUMBER = 19;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText buttonDisclaimerText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString content_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events events_;
        private java.lang.Object headerAssetConfig_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance headerAsset_;
        private int headerStyle_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
        private java.lang.Object paneContent_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString secondaryContent_;
        private boolean showActionDividerLine_;
        private boolean suppressCoBrandedAssetAnimation_;
        private int headerAssetConfigCase_ = 0;
        private int paneContentCase_ = 0;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> sections_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class AccordionContent extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent DEFAULT_INSTANCE;
            public static final int ITEMS_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem> items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent accordionContent = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent();
                DEFAULT_INSTANCE = accordionContent;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.class, accordionContent);
            }

            private AccordionContent() {
            }

            private void addAllItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem> iterable) {
                ensureItemsIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
            }

            private void clearItems() {
                this.items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureItemsIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem> protobufList = this.items_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.items_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeItems(int i) {
                ensureItemsIsMutable();
                this.items_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"items_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem getItems(int i) {
                return this.items_.get(i);
            }

            public final int getItemsCount() {
                return this.items_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem> getItemsList() {
                return this.items_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0485k getItemsOrBuilder(int i) {
                return this.items_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0485k> getItemsOrBuilderList() {
                return this.items_;
            }

            private void addItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem common$AccordionItem) {
                ensureItemsIsMutable();
                this.items_.add(common$AccordionItem);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent accordionContent) {
                return DEFAULT_INSTANCE.createBuilder(accordionContent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem common$AccordionItem) {
                ensureItemsIsMutable();
                this.items_.set(i, common$AccordionItem);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem common$AccordionItem) {
                ensureItemsIsMutable();
                this.items_.add(i, common$AccordionItem);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 2;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 4;
            public static final int ON_SECONDARY_DISCLAIMER_BUTTON_TAP_FIELD_NUMBER = 5;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events> PARSER;
            private int bitField0_;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onButtonDisclaimerTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onButtonTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSecondaryButtonTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSecondaryDisclaimerButtonTap_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.class, events);
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

            private void clearOnButtonDisclaimerTap() {
                this.onButtonDisclaimerTap_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnButtonTap() {
                this.onButtonTap_ = null;
                this.bitField0_ &= -3;
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
                this.bitField0_ &= -5;
            }

            private void clearOnSecondaryDisclaimerButtonTap() {
                this.onSecondaryDisclaimerButtonTap_ = null;
                this.bitField0_ &= -9;
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new java.lang.Object[]{"bitField0_", "onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onButtonDisclaimerTap_", "onButtonTap_", "onSecondaryButtonTap_", "onSecondaryDisclaimerButtonTap_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnButtonDisclaimerTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onButtonDisclaimerTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnButtonTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onButtonTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSecondaryButtonTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSecondaryButtonTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSecondaryDisclaimerButtonTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSecondaryDisclaimerButtonTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final boolean hasOnButtonDisclaimerTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasOnButtonTap() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasOnSecondaryDisclaimerButtonTap() {
                return (this.bitField0_ & 8) != 0;
            }

            private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void mergeOnButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onButtonDisclaimerTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonDisclaimerTap_ = common$SDKEvent;
                } else {
                    this.onButtonDisclaimerTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onButtonDisclaimerTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeOnButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonTap_ = common$SDKEvent;
                } else {
                    this.onButtonTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onButtonTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeOnSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSecondaryButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onSecondaryButtonTap_ = common$SDKEvent;
                } else {
                    this.onSecondaryButtonTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSecondaryButtonTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeOnSecondaryDisclaimerButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSecondaryDisclaimerButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onSecondaryDisclaimerButtonTap_ = common$SDKEvent;
                } else {
                    this.onSecondaryDisclaimerButtonTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSecondaryDisclaimerButtonTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onButtonDisclaimerTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            private void setOnSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSecondaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            private void setOnSecondaryDisclaimerButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSecondaryDisclaimerButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 8;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Section extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.e {
            public static final int ATTRIBUTED_DESCRIPTION_FIELD_NUMBER = 4;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section DEFAULT_INSTANCE;
            public static final int DESCRIPTION_FIELD_NUMBER = 2;
            public static final int HEADER_FIELD_NUMBER = 1;
            public static final int ICON_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> PARSER;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString attributedDescription_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString description_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.e {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section section = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section();
                DEFAULT_INSTANCE = section;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.class, section);
            }

            private Section() {
            }

            private void clearAttributedDescription() {
                this.attributedDescription_ = null;
                this.bitField0_ &= -5;
            }

            private void clearDescription() {
                this.description_ = null;
                this.bitField0_ &= -3;
            }

            private void clearHeader() {
                this.header_ = null;
                this.bitField0_ &= -2;
            }

            private void clearIcon() {
                this.icon_ = null;
                this.bitField0_ &= -9;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0002", new java.lang.Object[]{"bitField0_", "header_", "description_", "icon_", "attributedDescription_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedDescription() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedDescription_;
                return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getDescription() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.description_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
                return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public final boolean hasAttributedDescription() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasDescription() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasIcon() {
                return (this.bitField0_ & 8) != 0;
            }

            private void mergeAttributedDescription(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedDescription_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.attributedDescription_ = common$AttributedLocalizedString;
                } else {
                    this.attributedDescription_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.attributedDescription_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeDescription(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.description_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.description_ = common$LocalizedString;
                } else {
                    this.description_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.description_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
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

            private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.icon_ = common$RenderedAssetAppearance;
                } else {
                    this.icon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section section) {
                return DEFAULT_INSTANCE.createBuilder(section);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setAttributedDescription(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.attributedDescription_ = common$AttributedLocalizedString;
                this.bitField0_ |= 4;
            }

            private void setDescription(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.description_ = common$LocalizedString;
                this.bitField0_ |= 2;
            }

            private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.header_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                this.icon_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 8;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SectionContent extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent DEFAULT_INSTANCE;
            public static final int ITEMS_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent sectionContent = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent();
                DEFAULT_INSTANCE = sectionContent;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.class, sectionContent);
            }

            private SectionContent() {
            }

            private void addAllItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> iterable) {
                ensureItemsIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
            }

            private void clearItems() {
                this.items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureItemsIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> protobufList = this.items_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.items_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeItems(int i) {
                ensureItemsIsMutable();
                this.items_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"items_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section getItems(int i) {
                return this.items_.get(i);
            }

            public final int getItemsCount() {
                return this.items_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> getItemsList() {
                return this.items_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.e getItemsOrBuilder(int i) {
                return this.items_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.e> getItemsOrBuilderList() {
                return this.items_;
            }

            private void addItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section section) {
                ensureItemsIsMutable();
                this.items_.add(section);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent sectionContent) {
                return DEFAULT_INSTANCE.createBuilder(sectionContent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section section) {
                ensureItemsIsMutable();
                this.items_.set(i, section);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section section) {
                ensureItemsIsMutable();
                this.items_.add(i, section);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            PLAID_BRANDED_ASSET(9),
            CO_BRANDED_ASSET(12),
            HEADERASSETCONFIG_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6181a;

            b(int i) {
                this.f6181a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.b forNumber(int i) {
                if (i == 0) {
                    return HEADERASSETCONFIG_NOT_SET;
                }
                if (i == 9) {
                    return PLAID_BRANDED_ASSET;
                }
                if (i != 12) {
                    return null;
                }
                return CO_BRANDED_ASSET;
            }

            public final int getNumber() {
                return this.f6181a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.b valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum c implements com.google.protobuf.Internal.EnumLite {
            HEADER_STYLE_UNKNOWN(0),
            HEADER_STYLE_CONSENT(1),
            HEADER_STYLE_THREADS(2),
            UNRECOGNIZED(-1);

            public static final int HEADER_STYLE_CONSENT_VALUE = 1;
            public static final int HEADER_STYLE_THREADS_VALUE = 2;
            public static final int HEADER_STYLE_UNKNOWN_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6182a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.b f6183a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f6182a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c forNumber(int i) {
                if (i == 0) {
                    return HEADER_STYLE_UNKNOWN;
                }
                if (i == 1) {
                    return HEADER_STYLE_CONSENT;
                }
                if (i != 2) {
                    return null;
                }
                return HEADER_STYLE_THREADS;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.b.f6183a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6182a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum d {
            ACCORDION(17),
            SECTION(18),
            PANECONTENT_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6184a;

            d(int i) {
                this.f6184a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.d forNumber(int i) {
                if (i == 0) {
                    return PANECONTENT_NOT_SET;
                }
                if (i == 17) {
                    return ACCORDION;
                }
                if (i != 18) {
                    return null;
                }
                return SECTION;
            }

            public final int getNumber() {
                return this.f6184a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.d valueOf(int i) {
                return forNumber(i);
            }
        }

        public interface e extends com.google.protobuf.MessageLiteOrBuilder {
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllSections(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> iterable) {
            ensureSectionsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.sections_);
        }

        private void clearAccordion() {
            if (this.paneContentCase_ == 17) {
                this.paneContentCase_ = 0;
                this.paneContent_ = null;
            }
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -9;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -5;
        }

        private void clearCoBrandedAsset() {
            if (this.headerAssetConfigCase_ == 12) {
                this.headerAssetConfigCase_ = 0;
                this.headerAssetConfig_ = null;
            }
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -65;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -33;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -3;
        }

        private void clearHeaderAsset() {
            this.headerAsset_ = null;
            this.bitField0_ &= -2;
        }

        private void clearHeaderAssetConfig() {
            this.headerAssetConfigCase_ = 0;
            this.headerAssetConfig_ = null;
        }

        private void clearHeaderStyle() {
            this.headerStyle_ = 0;
        }

        private void clearPaneContent() {
            this.paneContentCase_ = 0;
            this.paneContent_ = null;
        }

        private void clearPlaidBrandedAsset() {
            if (this.headerAssetConfigCase_ == 9) {
                this.headerAssetConfigCase_ = 0;
                this.headerAssetConfig_ = null;
            }
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -17;
        }

        private void clearSecondaryContent() {
            this.secondaryContent_ = null;
            this.bitField0_ &= -129;
        }

        private void clearSection() {
            if (this.paneContentCase_ == 18) {
                this.paneContentCase_ = 0;
                this.paneContent_ = null;
            }
        }

        private void clearSections() {
            this.sections_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearShowActionDividerLine() {
            this.showActionDividerLine_ = false;
        }

        private void clearSuppressCoBrandedAssetAnimation() {
            this.suppressCoBrandedAssetAnimation_ = false;
        }

        private void ensureSectionsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> protobufList = this.sections_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.sections_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeSections(int i) {
            ensureSectionsIsMutable();
            this.sections_.remove(i);
        }

        private void setHeaderStyle(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c cVar) {
            this.headerStyle_ = cVar.getNumber();
        }

        private void setHeaderStyleValue(int i) {
            this.headerStyle_ = i;
        }

        private void setShowActionDividerLine(boolean z) {
            this.showActionDividerLine_ = z;
        }

        private void setSuppressCoBrandedAssetAnimation(boolean z) {
            this.suppressCoBrandedAssetAnimation_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0002\u0001\u0001\u0013\u0010\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0002\t<\u0000\u000b\u0007\f<\u0000\u000e\f\u000fဉ\u0006\u0010ဉ\u0007\u0011<\u0001\u0012<\u0001\u0013\u0007", new java.lang.Object[]{"headerAssetConfig_", "headerAssetConfigCase_", "paneContent_", "paneContentCase_", "bitField0_", "headerAsset_", "header_", "sections_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section.class, "button_", "secondaryButton_", "events_", "buttonDisclaimerText_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class, "showActionDividerLine_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.class, "headerStyle_", "content_", "secondaryContent_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.class, "suppressCoBrandedAssetAnimation_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent getAccordion() {
            return this.paneContentCase_ == 17 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) this.paneContent_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText getButtonDisclaimerText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText disclaimerText = this.buttonDisclaimerText_;
            return disclaimerText == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText.getDefaultInstance() : disclaimerText;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset getCoBrandedAsset() {
            return this.headerAssetConfigCase_ == 12 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) this.headerAssetConfig_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getContent() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getHeaderAsset() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
            return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.b getHeaderAssetConfigCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.b.forNumber(this.headerAssetConfigCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c getHeaderStyle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.forNumber(this.headerStyle_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.c.UNRECOGNIZED : forNumber;
        }

        public final int getHeaderStyleValue() {
            return this.headerStyle_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.d getPaneContentCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.d.forNumber(this.paneContentCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getPlaidBrandedAsset() {
            return this.headerAssetConfigCase_ == 9 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.headerAssetConfig_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getSecondaryContent() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.secondaryContent_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent getSection() {
            return this.paneContentCase_ == 18 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) this.paneContent_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section getSections(int i) {
            return this.sections_.get(i);
        }

        public final int getSectionsCount() {
            return this.sections_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section> getSectionsList() {
            return this.sections_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.e getSectionsOrBuilder(int i) {
            return this.sections_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.e> getSectionsOrBuilderList() {
            return this.sections_;
        }

        public final boolean getShowActionDividerLine() {
            return this.showActionDividerLine_;
        }

        public final boolean getSuppressCoBrandedAssetAnimation() {
            return this.suppressCoBrandedAssetAnimation_;
        }

        public final boolean hasAccordion() {
            return this.paneContentCase_ == 17;
        }

        public final boolean hasButton() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasCoBrandedAsset() {
            return this.headerAssetConfigCase_ == 12;
        }

        public final boolean hasContent() {
            return (this.bitField0_ & 64) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasHeaderAsset() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasPlaidBrandedAsset() {
            return this.headerAssetConfigCase_ == 9;
        }

        public final boolean hasSecondaryButton() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasSecondaryContent() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean hasSection() {
            return this.paneContentCase_ == 18;
        }

        private void addSections(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section section) {
            ensureSectionsIsMutable();
            this.sections_.add(section);
        }

        private void mergeAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent accordionContent) {
            if (this.paneContentCase_ != 17 || this.paneContent_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.getDefaultInstance()) {
                this.paneContent_ = accordionContent;
            } else {
                this.paneContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent) this.paneContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent.a) accordionContent).buildPartial();
            }
            this.paneContentCase_ = 17;
        }

        private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.button_ = common$ButtonContent;
            } else {
                this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText disclaimerText) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText disclaimerText2 = this.buttonDisclaimerText_;
            if (disclaimerText2 == null || disclaimerText2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText.getDefaultInstance()) {
                this.buttonDisclaimerText_ = disclaimerText;
            } else {
                this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.DisclaimerText.b) disclaimerText).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeCoBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
            if (this.headerAssetConfigCase_ != 12 || this.headerAssetConfig_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance()) {
                this.headerAssetConfig_ = common$CobrandedHeaderAsset;
            } else {
                this.headerAssetConfig_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) this.headerAssetConfig_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a) common$CobrandedHeaderAsset).buildPartial();
            }
            this.headerAssetConfigCase_ = 12;
        }

        private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.content_ = common$AttributedLocalizedString;
            } else {
                this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.header_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.header_ = common$LocalizedString;
            } else {
                this.header_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.header_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.headerAsset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.headerAsset_ = common$RenderedAssetAppearance;
            } else {
                this.headerAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.headerAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePlaidBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            if (this.headerAssetConfigCase_ != 9 || this.headerAssetConfig_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.headerAssetConfig_ = common$RenderedAssetAppearance;
            } else {
                this.headerAssetConfig_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.headerAssetConfig_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.headerAssetConfigCase_ = 9;
        }

        private void mergeSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.secondaryButton_ = common$ButtonContent;
            } else {
                this.secondaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeSecondaryContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.secondaryContent_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.secondaryContent_ = common$AttributedLocalizedString;
            } else {
                this.secondaryContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.secondaryContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeSection(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent sectionContent) {
            if (this.paneContentCase_ != 18 || this.paneContent_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.getDefaultInstance()) {
                this.paneContent_ = sectionContent;
            } else {
                this.paneContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent) this.paneContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent.a) sectionContent).buildPartial();
            }
            this.paneContentCase_ = 18;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.AccordionContent accordionContent) {
            this.paneContent_ = accordionContent;
            this.paneContentCase_ = 17;
        }

        private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 8;
        }

        private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DisclaimerText disclaimerText) {
            this.buttonDisclaimerText_ = disclaimerText;
            this.bitField0_ |= 4;
        }

        private void setCoBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
            this.headerAssetConfig_ = common$CobrandedHeaderAsset;
            this.headerAssetConfigCase_ = 12;
        }

        private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 64;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 32;
        }

        private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        private void setHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.headerAsset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 1;
        }

        private void setPlaidBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.headerAssetConfig_ = common$RenderedAssetAppearance;
            this.headerAssetConfigCase_ = 9;
        }

        private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 16;
        }

        private void setSecondaryContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.secondaryContent_ = common$AttributedLocalizedString;
            this.bitField0_ |= 128;
        }

        private void setSection(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.SectionContent sectionContent) {
            this.paneContent_ = sectionContent;
            this.paneContentCase_ = 18;
        }

        private void setSections(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section section) {
            ensureSectionsIsMutable();
            this.sections_.set(i, section);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addSections(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.Section section) {
            ensureSectionsIsMutable();
            this.sections_.add(i, section);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane consentPaneOuterClass$ConsentPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane();
        DEFAULT_INSTANCE = consentPaneOuterClass$ConsentPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.class, consentPaneOuterClass$ConsentPane);
    }

    private ConsentPaneOuterClass$ConsentPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.c0.f6292a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane consentPaneOuterClass$ConsentPane) {
        return DEFAULT_INSTANCE.createBuilder(consentPaneOuterClass$ConsentPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
