package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 4;
        public static final int BUTTON_TAP_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 2;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ButtonDisclaimerTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction();
                DEFAULT_INSTANCE = buttonDisclaimerTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.class, buttonDisclaimerTapAction);
            }

            private ButtonDisclaimerTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonDisclaimerTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction buttonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction();
                DEFAULT_INSTANCE = buttonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.class, buttonTapAction);
            }

            private ButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction buttonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            BUTTON_DISCLAIMER_TAP(4),
            BUTTON_TAP(1),
            SECONDARY_BUTTON_TAP(2),
            EXIT(3),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6100a;

            a(int i) {
                this.f6100a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return BUTTON_TAP;
                }
                if (i == 2) {
                    return SECONDARY_BUTTON_TAP;
                }
                if (i == 3) {
                    return EXIT;
                }
                if (i != 4) {
                    return null;
                }
                return BUTTON_DISCLAIMER_TAP;
            }

            public final int getNumber() {
                return this.f6100a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearButtonDisclaimerTap() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction getButtonTap() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final boolean hasButtonDisclaimerTap() {
            return this.actionCase_ == 4;
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

        private void mergeButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = buttonDisclaimerTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction.a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction buttonTapAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.getDefaultInstance()) {
                this.action_ = buttonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction.a) buttonTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            this.action_ = buttonDisclaimerTapAction;
            this.actionCase_ = 4;
        }

        private void setButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ButtonTapAction buttonTapAction) {
            this.action_ = buttonTapAction;
            this.actionCase_ = 1;
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 3;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ACCORDION_TITLE_FIELD_NUMBER = 13;
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 11;
        public static final int BUTTON_FIELD_NUMBER = 6;
        public static final int CONTENT_FIELD_NUMBER = 14;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 8;
        public static final int FOOTER_TEXT_FIELD_NUMBER = 15;
        public static final int HEADER_ASSET_FIELD_NUMBER = 3;
        public static final int HEADER_FIELD_NUMBER = 4;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int ITEMS_FIELD_NUMBER = 5;
        public static final int PANE_HEADER_FIELD_NUMBER = 12;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 10;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString accordionTitle_;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString buttonDisclaimerText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString content_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString footerText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance headerAsset_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution institution_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem> items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;

        public static final class AccordionItem extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.a {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem DEFAULT_INSTANCE;
            public static final int DETAIL_FIELD_NUMBER = 3;
            public static final int ICON_FIELD_NUMBER = 1;
            public static final int LABEL_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString detail_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString label_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.a {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem accordionItem = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem();
                DEFAULT_INSTANCE = accordionItem;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.class, accordionItem);
            }

            private AccordionItem() {
            }

            private void clearDetail() {
                this.detail_ = null;
                this.bitField0_ &= -5;
            }

            private void clearIcon() {
                this.icon_ = null;
                this.bitField0_ &= -2;
            }

            private void clearLabel() {
                this.label_ = null;
                this.bitField0_ &= -3;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"bitField0_", "icon_", "label_", "detail_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
                return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getLabel() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.label_;
                return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public final boolean hasDetail() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasIcon() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasLabel() {
                return (this.bitField0_ & 2) != 0;
            }

            private void mergeDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.detail_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.detail_ = common$LocalizedString;
                } else {
                    this.detail_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.detail_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.icon_ = common$RenderedAssetAppearance;
                } else {
                    this.icon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.label_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                    this.label_ = common$LocalizedString;
                } else {
                    this.label_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.label_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem accordionItem) {
                return DEFAULT_INSTANCE.createBuilder(accordionItem);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.detail_ = common$LocalizedString;
                this.bitField0_ |= 4;
            }

            private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                this.icon_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 1;
            }

            private void setLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
                this.label_ = common$LocalizedString;
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 4;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events> PARSER;
            private int bitField0_;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onButtonDisclaimerTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onButtonTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSecondaryButtonTap_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.class, events);
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
                this.bitField0_ &= -5;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new java.lang.Object[]{"bitField0_", "onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onButtonTap_", "onSecondaryButtonTap_", "onButtonDisclaimerTap_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.class) {
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

            public final boolean hasOnButtonDisclaimerTap() {
                return (this.bitField0_ & 4) != 0;
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

            private void mergeOnButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onButtonDisclaimerTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonDisclaimerTap_ = common$SDKEvent;
                } else {
                    this.onButtonDisclaimerTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onButtonDisclaimerTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onButtonDisclaimerTap_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            private void setOnButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSecondaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public interface a extends com.google.protobuf.MessageLiteOrBuilder {
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem> iterable) {
            ensureItemsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
        }

        private void clearAccordionTitle() {
            this.accordionTitle_ = null;
            this.bitField0_ &= -33;
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

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearFooterText() {
            this.footerText_ = null;
            this.bitField0_ &= -513;
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
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem> protobufList = this.items_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.items_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0002\u000f\f\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006ဉ\u0007\bဉ\n\nဉ\b\u000bဉ\u0006\fဉ\u0001\rဉ\u0005\u000eဉ\u0004\u000fဉ\t", new java.lang.Object[]{"bitField0_", "institution_", "headerAsset_", "header_", "items_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem.class, "button_", "events_", "secondaryButton_", "buttonDisclaimerText_", "paneHeader_", "accordionTitle_", "content_", "footerText_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAccordionTitle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.accordionTitle_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getFooterText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.footerText_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem getItems(int i) {
            return this.items_.get(i);
        }

        public final int getItemsCount() {
            return this.items_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem> getItemsList() {
            return this.items_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.a getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.a> getItemsOrBuilderList() {
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

        public final boolean hasAccordionTitle() {
            return (this.bitField0_ & 32) != 0;
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

        public final boolean hasEvents() {
            return (this.bitField0_ & 1024) != 0;
        }

        public final boolean hasFooterText() {
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

        private void addItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem accordionItem) {
            ensureItemsIsMutable();
            this.items_.add(accordionItem);
        }

        private void mergeAccordionTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.accordionTitle_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.accordionTitle_ = common$AttributedLocalizedString;
            } else {
                this.accordionTitle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.accordionTitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 32;
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

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeFooterText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.footerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.footerText_ = common$AttributedLocalizedString;
            } else {
                this.footerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.footerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAccordionTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.accordionTitle_ = common$AttributedLocalizedString;
            this.bitField0_ |= 32;
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

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 1024;
        }

        private void setFooterText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.footerText_ = common$AttributedLocalizedString;
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

        private void setItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem accordionItem) {
            ensureItemsIsMutable();
            this.items_.set(i, accordionItem);
        }

        private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.AccordionItem accordionItem) {
            ensureItemsIsMutable();
            this.items_.add(i, accordionItem);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane();
        DEFAULT_INSTANCE = buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.class, buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane);
    }

    private ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0478d.f6293a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane) {
        return DEFAULT_INSTANCE.createBuilder(buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
