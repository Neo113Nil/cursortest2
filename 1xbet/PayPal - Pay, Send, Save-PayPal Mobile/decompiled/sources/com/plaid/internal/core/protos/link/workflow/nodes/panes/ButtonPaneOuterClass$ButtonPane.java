package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class ButtonPaneOuterClass$ButtonPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 4;
        public static final int BUTTON_TAP_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 2;
        public static final int TERTIARY_BUTTON_TAP_FIELD_NUMBER = 5;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ButtonDisclaimerTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction();
                DEFAULT_INSTANCE = buttonDisclaimerTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.class, buttonDisclaimerTapAction);
            }

            private ButtonDisclaimerTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonDisclaimerTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction buttonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction();
                DEFAULT_INSTANCE = buttonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.class, buttonTapAction);
            }

            private ButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction buttonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TertiaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction tertiaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction();
                DEFAULT_INSTANCE = tertiaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.class, tertiaryButtonTapAction);
            }

            private TertiaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction tertiaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(tertiaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            BUTTON_DISCLAIMER_TAP(4),
            BUTTON_TAP(1),
            SECONDARY_BUTTON_TAP(2),
            TERTIARY_BUTTON_TAP(5),
            EXIT(3),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6099a;

            a(int i) {
                this.f6099a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.a forNumber(int i) {
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
                if (i == 4) {
                    return BUTTON_DISCLAIMER_TAP;
                }
                if (i != 5) {
                    return null;
                }
                return TERTIARY_BUTTON_TAP;
            }

            public final int getNumber() {
                return this.f6099a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions.DEFAULT_INSTANCE);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.b a(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction exitAction) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) this.instance).setExit(exitAction);
                return this;
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions.class, actions);
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

        private void clearTertiaryButtonTap() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction getButtonTap() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction getTertiaryButtonTap() {
            return this.actionCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.getDefaultInstance();
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

        public final boolean hasTertiaryButtonTap() {
            return this.actionCase_ == 5;
        }

        private void mergeButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = buttonDisclaimerTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction.a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction buttonTapAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.getDefaultInstance()) {
                this.action_ = buttonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction.a) buttonTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeTertiaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction tertiaryButtonTapAction) {
            if (this.actionCase_ != 5 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.getDefaultInstance()) {
                this.action_ = tertiaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction.a) tertiaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            this.action_ = buttonDisclaimerTapAction;
            this.actionCase_ = 4;
        }

        private void setButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ButtonTapAction buttonTapAction) {
            this.action_ = buttonTapAction;
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 3;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 2;
        }

        private void setTertiaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.TertiaryButtonTapAction tertiaryButtonTapAction) {
            this.action_ = tertiaryButtonTapAction;
            this.actionCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ATTRIBUTED_CONTENT_FIELD_NUMBER = 15;
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 13;
        public static final int BUTTON_FIELD_NUMBER = 9;
        public static final int CONTENT_FIELD_NUMBER = 7;
        public static final int CONTENT_JUSTIFY_FIELD_NUMBER = 18;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 11;
        public static final int HEADER_ASSET_CAPTION_FIELD_NUMBER = 5;
        public static final int HEADER_ASSET_FIELD_NUMBER = 4;
        public static final int HEADER_FIELD_NUMBER = 6;
        public static final int INCREMENTAL_RESULTS_FIELD_NUMBER = 16;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int PANE_AUTO_SUBMIT_OPTIONS_FIELD_NUMBER = 19;
        public static final int PANE_HEADER_FIELD_NUMBER = 14;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 10;
        public static final int TERTIARY_BUTTON_FIELD_NUMBER = 12;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString attributedContent_;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString buttonDisclaimerText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
        private int contentJustify_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString content_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString headerAssetCaption_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance headerAsset_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> incrementalResults_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution institution_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions paneAutoSubmitOptions_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent tertiaryButton_;

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_TERTIARY_BUTTON_TAP_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events> PARSER;
            private int bitField0_;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onButtonTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSecondaryButtonTap_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onTertiaryButtonTap_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.class, events);
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

            private void clearOnTertiaryButtonTap() {
                this.onTertiaryButtonTap_ = null;
                this.bitField0_ &= -5;
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new java.lang.Object[]{"bitField0_", "onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onButtonTap_", "onSecondaryButtonTap_", "onTertiaryButtonTap_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnTertiaryButtonTap() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onTertiaryButtonTap_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final boolean hasOnButtonTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasOnTertiaryButtonTap() {
                return (this.bitField0_ & 4) != 0;
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

            private void mergeOnTertiaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onTertiaryButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onTertiaryButtonTap_ = common$SDKEvent;
                } else {
                    this.onTertiaryButtonTap_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onTertiaryButtonTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
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

            private void setOnTertiaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onTertiaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllIncrementalResults(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> iterable) {
            ensureIncrementalResultsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.incrementalResults_);
        }

        private void clearAttributedContent() {
            this.attributedContent_ = null;
            this.bitField0_ &= -65;
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -257;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -129;
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -33;
        }

        private void clearContentJustify() {
            this.contentJustify_ = 0;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2049;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -17;
        }

        private void clearHeaderAsset() {
            this.headerAsset_ = null;
            this.bitField0_ &= -5;
        }

        private void clearHeaderAssetCaption() {
            this.headerAssetCaption_ = null;
            this.bitField0_ &= -9;
        }

        private void clearIncrementalResults() {
            this.incrementalResults_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPaneAutoSubmitOptions() {
            this.paneAutoSubmitOptions_ = null;
            this.bitField0_ &= -4097;
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -513;
        }

        private void clearTertiaryButton() {
            this.tertiaryButton_ = null;
            this.bitField0_ &= -1025;
        }

        private void ensureIncrementalResultsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> protobufList = this.incrementalResults_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.incrementalResults_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeIncrementalResults(int i) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.remove(i);
        }

        private void setContentJustify(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s enumC0492s) {
            this.contentJustify_ = enumC0492s.getNumber();
        }

        private void setContentJustifyValue(int i) {
            this.contentJustify_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0002\u0013\u000f\u0000\u0001\u0000\u0002ဉ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\tဉ\b\nဉ\t\u000bဉ\u000b\fဉ\n\rဉ\u0007\u000eဉ\u0001\u000fဉ\u0006\u0010\u001b\u0012\f\u0013ဉ\f", new java.lang.Object[]{"bitField0_", "institution_", "headerAsset_", "headerAssetCaption_", "header_", "content_", "button_", "secondaryButton_", "events_", "tertiaryButton_", "buttonDisclaimerText_", "paneHeader_", "attributedContent_", "incrementalResults_", com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.class, "contentJustify_", "paneAutoSubmitOptions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedContent() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedContent_;
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getContent() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.content_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s getContentJustify() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.forNumber(this.contentJustify_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.UNRECOGNIZED : forNumber;
        }

        public final int getContentJustifyValue() {
            return this.contentJustify_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getHeaderAsset() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
            return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeaderAssetCaption() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.headerAssetCaption_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult getIncrementalResults(int i) {
            return this.incrementalResults_.get(i);
        }

        public final int getIncrementalResultsCount() {
            return this.incrementalResults_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> getIncrementalResultsList() {
            return this.incrementalResults_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.r getIncrementalResultsOrBuilder(int i) {
            return this.incrementalResults_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.primitives.r> getIncrementalResultsOrBuilderList() {
            return this.incrementalResults_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution getInstitution() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions getPaneAutoSubmitOptions() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = this.paneAutoSubmitOptions_;
            return common$PaneAutoSubmitOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.getDefaultInstance() : common$PaneAutoSubmitOptions;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getTertiaryButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.tertiaryButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final boolean hasAttributedContent() {
            return (this.bitField0_ & 64) != 0;
        }

        public final boolean hasButton() {
            return (this.bitField0_ & 256) != 0;
        }

        public final boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean hasContent() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 2048) != 0;
        }

        public final boolean hasHeader() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasHeaderAsset() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasHeaderAssetCaption() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasPaneAutoSubmitOptions() {
            return (this.bitField0_ & 4096) != 0;
        }

        public final boolean hasPaneHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasSecondaryButton() {
            return (this.bitField0_ & 512) != 0;
        }

        public final boolean hasTertiaryButton() {
            return (this.bitField0_ & 1024) != 0;
        }

        private void addIncrementalResults(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.add(sdkIncrementalResult$SDKIncrementalResult);
        }

        private void mergeAttributedContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedContent_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.attributedContent_ = common$AttributedLocalizedString;
            } else {
                this.attributedContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.attributedContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.button_ = common$ButtonContent;
            } else {
                this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            } else {
                this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 128;
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

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 2048;
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
            this.bitField0_ |= 4;
        }

        private void mergeHeaderAssetCaption(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.headerAssetCaption_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.headerAssetCaption_ = common$LocalizedString;
            } else {
                this.headerAssetCaption_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.headerAssetCaption_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 8;
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

        private void mergePaneAutoSubmitOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions2 = this.paneAutoSubmitOptions_;
            if (common$PaneAutoSubmitOptions2 == null || common$PaneAutoSubmitOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.getDefaultInstance()) {
                this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
            } else {
                this.paneAutoSubmitOptions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.newBuilder(this.paneAutoSubmitOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b) common$PaneAutoSubmitOptions).buildPartial();
            }
            this.bitField0_ |= 4096;
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
            this.bitField0_ |= 512;
        }

        private void mergeTertiaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.tertiaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.tertiaryButton_ = common$ButtonContent;
            } else {
                this.tertiaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.tertiaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAttributedContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.attributedContent_ = common$AttributedLocalizedString;
            this.bitField0_ |= 64;
        }

        private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 128;
        }

        private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.content_ = common$LocalizedString;
            this.bitField0_ |= 32;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 2048;
        }

        private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 16;
        }

        private void setHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.headerAsset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 4;
        }

        private void setHeaderAssetCaption(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.headerAssetCaption_ = common$LocalizedString;
            this.bitField0_ |= 8;
        }

        private void setIncrementalResults(int i, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.set(i, sdkIncrementalResult$SDKIncrementalResult);
        }

        private void setInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 1;
        }

        private void setPaneAutoSubmitOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
            this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
            this.bitField0_ |= 4096;
        }

        private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 512;
        }

        private void setTertiaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.tertiaryButton_ = common$ButtonContent;
            this.bitField0_ |= 1024;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addIncrementalResults(int i, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.add(i, sdkIncrementalResult$SDKIncrementalResult);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane buttonPaneOuterClass$ButtonPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane();
        DEFAULT_INSTANCE = buttonPaneOuterClass$ButtonPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.class, buttonPaneOuterClass$ButtonPane);
    }

    private ButtonPaneOuterClass$ButtonPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0477c.f6291a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane buttonPaneOuterClass$ButtonPane) {
        return DEFAULT_INSTANCE.createBuilder(buttonPaneOuterClass$ButtonPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
