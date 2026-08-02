package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> PARSER = null;
        public static final int PRIMARY_DISCLAIMER_TAP_FIELD_NUMBER = 4;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        public static final int SECONDARY_DISCLAIMER_TAP_FIELD_NUMBER = 5;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PrimaryDisclaimerTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction primaryDisclaimerTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction();
                DEFAULT_INSTANCE = primaryDisclaimerTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.class, primaryDisclaimerTapAction);
            }

            private PrimaryDisclaimerTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(primaryDisclaimerTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryDisclaimerTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction secondaryDisclaimerTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction();
                DEFAULT_INSTANCE = secondaryDisclaimerTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.class, secondaryDisclaimerTapAction);
            }

            private SecondaryDisclaimerTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryDisclaimerTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response response_;

            public static final class Response extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response DEFAULT_INSTANCE;
                public static final int INPUT_ID_FIELD_NUMBER = 1;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response> PARSER = null;
                public static final int VALUE_FIELD_NUMBER = 2;
                private java.lang.String inputId_ = "";
                private java.lang.String value_ = "";

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response response = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response();
                    DEFAULT_INSTANCE = response;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.class, response);
                }

                private Response() {
                }

                private void clearInputId() {
                    this.inputId_ = getDefaultInstance().getInputId();
                }

                private void clearValue() {
                    this.value_ = getDefaultInstance().getValue();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setInputIdBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.inputId_ = byteString.toStringUtf8();
                }

                private void setValueBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"inputId_", "value_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.class) {
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

                public final java.lang.String getInputId() {
                    return this.inputId_;
                }

                public final com.google.protobuf.ByteString getInputIdBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.inputId_);
                }

                public final java.lang.String getValue() {
                    return this.value_;
                }

                public final com.google.protobuf.ByteString getValueBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.value_);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response response) {
                    return DEFAULT_INSTANCE.createBuilder(response);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setInputId(java.lang.String str) {
                    this.inputId_ = str;
                }

                private void setValue(java.lang.String str) {
                    this.value_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response getResponse() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response response = this.response_;
                return response == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.getDefaultInstance() : response;
            }

            public final boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response response) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response response2 = this.response_;
                if (response2 == null || response2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.newBuilder(this.response_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response.a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.Response response) {
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            SECONDARY_BUTTON_TAP(3),
            EXIT(2),
            PRIMARY_DISCLAIMER_TAP(4),
            SECONDARY_DISCLAIMER_TAP(5),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6277a;

            a(int i) {
                this.f6277a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.a forNumber(int i) {
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
                if (i == 4) {
                    return PRIMARY_DISCLAIMER_TAP;
                }
                if (i != 5) {
                    return null;
                }
                return SECONDARY_DISCLAIMER_TAP;
            }

            public final int getNumber() {
                return this.f6277a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions.class, actions);
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

        private void clearPrimaryDisclaimerTap() {
            if (this.actionCase_ == 4) {
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

        private void clearSecondaryDisclaimerTap() {
            if (this.actionCase_ == 5) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction getPrimaryDisclaimerTap() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction getSecondaryDisclaimerTap() {
            return this.actionCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.getDefaultInstance();
        }

        public final boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public final boolean hasPrimaryDisclaimerTap() {
            return this.actionCase_ == 4;
        }

        public final boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 3;
        }

        public final boolean hasSecondaryDisclaimerTap() {
            return this.actionCase_ == 5;
        }

        public final boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergePrimaryDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = primaryDisclaimerTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction.a) primaryDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSecondaryDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
            if (this.actionCase_ != 5 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = secondaryDisclaimerTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction.a) secondaryDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setPrimaryDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
            this.action_ = primaryDisclaimerTapAction;
            this.actionCase_ = 4;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        private void setSecondaryDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
            this.action_ = secondaryDisclaimerTapAction;
            this.actionCase_ = 5;
        }

        private void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 10;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMERS_FIELD_NUMBER = 7;
        public static final int DISCLAIMER_TEXT_FIELD_NUMBER = 9;
        public static final int EVENTS_FIELD_NUMBER = 2;
        public static final int INPUT_ERROR_FIELD_NUMBER = 6;
        public static final int INPUT_LENGTH_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering> PARSER = null;
        public static final int PRIMARY_TEXT_FIELD_NUMBER = 1;
        public static final int PROMPT_FIELD_NUMBER = 3;
        public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
        public static final int USE_HIGH_CONTRAST_FIELD_NUMBER = 8;
        private int backgroundDisplayMode_;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText disclaimerText_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> disclaimers_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError inputError_;
        private int inputLength_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString primaryText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt prompt_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString secondaryText_;
        private boolean useHighContrast_;

        public static final class DisclaimerText extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int ADDITIONAL_ACTIONS_FIELD_NUMBER = 2;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText> PARSER = null;
            public static final int TEXT_FIELD_NUMBER = 1;
            private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> additionalActions_ = com.google.protobuf.MapFieldLite.emptyMapField();
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString text_;

            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                public static final com.google.protobuf.MapEntryLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> f6278a = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions.getDefaultInstance());
            }

            public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.b> implements com.google.protobuf.MessageLiteOrBuilder {
                public b() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText disclaimerText = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText();
                DEFAULT_INSTANCE = disclaimerText;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.class, disclaimerText);
            }

            private DisclaimerText() {
            }

            private void clearText() {
                this.text_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> getMutableAdditionalActionsMap() {
                return internalGetMutableAdditionalActions();
            }

            private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> internalGetAdditionalActions() {
                return this.additionalActions_;
            }

            private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> internalGetMutableAdditionalActions() {
                if (!this.additionalActions_.isMutable()) {
                    this.additionalActions_ = this.additionalActions_.mutableCopy();
                }
                return this.additionalActions_;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.b newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.b();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new java.lang.Object[]{"bitField0_", "text_", "additionalActions_", com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.a.f6278a});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.class) {
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
            public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> getAdditionalActions() {
                return getAdditionalActionsMap();
            }

            public final int getAdditionalActionsCount() {
                return internalGetAdditionalActions().size();
            }

            public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> getAdditionalActionsMap() {
                return java.util.Collections.unmodifiableMap(internalGetAdditionalActions());
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.text_;
                return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public final boolean hasText() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.text_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.text_ = common$AttributedLocalizedString;
                } else {
                    this.text_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.text_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText disclaimerText) {
                return DEFAULT_INSTANCE.createBuilder(disclaimerText);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.text_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            public final boolean containsAdditionalActions(java.lang.String str) {
                return internalGetAdditionalActions().containsKey(str);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions getAdditionalActionsOrDefault(java.lang.String str, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions actions) {
                com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> internalGetAdditionalActions = internalGetAdditionalActions();
                return internalGetAdditionalActions.containsKey(str) ? internalGetAdditionalActions.get(str) : actions;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions getAdditionalActionsOrThrow(java.lang.String str) {
                com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions> internalGetAdditionalActions = internalGetAdditionalActions();
                if (internalGetAdditionalActions.containsKey(str)) {
                    return internalGetAdditionalActions.get(str);
                }
                throw new java.lang.IllegalArgumentException();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SUBMIT_TAP_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onSubmitTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.class, events);
            }

            private Events() {
            }

            private void addAllOnAppear(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnAppearIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onAppear_);
            }

            private void addAllOnSubmitTap(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnSubmitTapIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onSubmitTap_);
            }

            private void clearOnAppear() {
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSubmitTap() {
                this.onSubmitTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSubmitTapIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onSubmitTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSubmitTap_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            private void removeOnSubmitTap(int i) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onSubmitTap_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSubmitTap(int i) {
                return this.onSubmitTap_.get(i);
            }

            public final int getOnSubmitTapCount() {
                return this.onSubmitTap_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnSubmitTapList() {
                return this.onSubmitTap_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnSubmitTapOrBuilder(int i) {
                return this.onSubmitTap_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnSubmitTapOrBuilderList() {
                return this.onSubmitTap_;
            }

            private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void addOnSubmitTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnSubmitTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            private void addOnSubmitTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class InputError extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError DEFAULT_INSTANCE;
            public static final int INPUT_FIELD_NUMBER = 2;
            public static final int MESSAGE_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError> PARSER;
            private int bitField0_;
            private java.lang.String input_ = "";
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString message_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError inputError = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError();
                DEFAULT_INSTANCE = inputError;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.class, inputError);
            }

            private InputError() {
            }

            private void clearInput() {
                this.input_ = getDefaultInstance().getInput();
            }

            private void clearMessage() {
                this.message_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setInputBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.input_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new java.lang.Object[]{"bitField0_", "message_", "input_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.class) {
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

            public final java.lang.String getInput() {
                return this.input_;
            }

            public final com.google.protobuf.ByteString getInputBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.input_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getMessage() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.message_;
                return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public final boolean hasMessage() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeMessage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.message_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.message_ = common$AttributedLocalizedString;
                } else {
                    this.message_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.message_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError inputError) {
                return DEFAULT_INSTANCE.createBuilder(inputError);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setMessage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.message_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setInput(java.lang.String str) {
                this.input_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllDisclaimers(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> iterable) {
            ensureDisclaimersIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.disclaimers_);
        }

        private void clearBackgroundDisplayMode() {
            this.backgroundDisplayMode_ = 0;
        }

        private void clearDisclaimerText() {
            this.disclaimerText_ = null;
            this.bitField0_ &= -9;
        }

        private void clearDisclaimers() {
            this.disclaimers_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -33;
        }

        private void clearInputError() {
            this.inputError_ = null;
            this.bitField0_ &= -17;
        }

        private void clearInputLength() {
            this.inputLength_ = 0;
        }

        private void clearPrimaryText() {
            this.primaryText_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPrompt() {
            this.prompt_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSecondaryText() {
            this.secondaryText_ = null;
            this.bitField0_ &= -5;
        }

        private void clearUseHighContrast() {
            this.useHighContrast_ = false;
        }

        private void ensureDisclaimersIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> protobufList = this.disclaimers_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.disclaimers_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeDisclaimers(int i) {
            ensureDisclaimersIsMutable();
            this.disclaimers_.remove(i);
        }

        private void setBackgroundDisplayMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m enumC0487m) {
            this.backgroundDisplayMode_ = enumC0487m.getNumber();
        }

        private void setBackgroundDisplayModeValue(int i) {
            this.backgroundDisplayMode_ = i;
        }

        private void setInputLength(int i) {
            this.inputLength_ = i;
        }

        private void setUseHighContrast(boolean z) {
            this.useHighContrast_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0005\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0004\u0006ဉ\u0004\u0007\u001b\b\u0007\tဉ\u0003\n\f", new java.lang.Object[]{"bitField0_", "primaryText_", "events_", "prompt_", "secondaryText_", "inputLength_", "inputError_", "disclaimers_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.class, "useHighContrast_", "disclaimerText_", "backgroundDisplayMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m getBackgroundDisplayMode() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.forNumber(this.backgroundDisplayMode_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.UNRECOGNIZED : forNumber;
        }

        public final int getBackgroundDisplayModeValue() {
            return this.backgroundDisplayMode_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText getDisclaimerText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText disclaimerText = this.disclaimerText_;
            return disclaimerText == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.getDefaultInstance() : disclaimerText;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getDisclaimers(int i) {
            return this.disclaimers_.get(i);
        }

        public final int getDisclaimersCount() {
            return this.disclaimers_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> getDisclaimersList() {
            return this.disclaimers_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0486l getDisclaimersOrBuilder(int i) {
            return this.disclaimers_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0486l> getDisclaimersOrBuilderList() {
            return this.disclaimers_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError getInputError() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError inputError = this.inputError_;
            return inputError == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.getDefaultInstance() : inputError;
        }

        public final int getInputLength() {
            return this.inputLength_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getPrimaryText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.primaryText_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = this.prompt_;
            return common$Prompt == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance() : common$Prompt;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getSecondaryText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.secondaryText_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final boolean getUseHighContrast() {
            return this.useHighContrast_;
        }

        public final boolean hasDisclaimerText() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasInputError() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasPrimaryText() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasPrompt() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasSecondaryText() {
            return (this.bitField0_ & 4) != 0;
        }

        private void addDisclaimers(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            ensureDisclaimersIsMutable();
            this.disclaimers_.add(common$AttributedLocalizedString);
        }

        private void mergeDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText disclaimerText) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText disclaimerText2 = this.disclaimerText_;
            if (disclaimerText2 == null || disclaimerText2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.getDefaultInstance()) {
                this.disclaimerText_ = disclaimerText;
            } else {
                this.disclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.newBuilder(this.disclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText.b) disclaimerText).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeInputError(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError inputError) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError inputError2 = this.inputError_;
            if (inputError2 == null || inputError2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.getDefaultInstance()) {
                this.inputError_ = inputError;
            } else {
                this.inputError_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.newBuilder(this.inputError_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError.a) inputError).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergePrimaryText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.primaryText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.primaryText_ = common$AttributedLocalizedString;
            } else {
                this.primaryText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.primaryText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt2 = this.prompt_;
            if (common$Prompt2 == null || common$Prompt2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance()) {
                this.prompt_ = common$Prompt;
            } else {
                this.prompt_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.newBuilder(this.prompt_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a) common$Prompt).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeSecondaryText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.secondaryText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.secondaryText_ = common$AttributedLocalizedString;
            } else {
                this.secondaryText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.secondaryText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.DisclaimerText disclaimerText) {
            this.disclaimerText_ = disclaimerText;
            this.bitField0_ |= 8;
        }

        private void setDisclaimers(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            ensureDisclaimersIsMutable();
            this.disclaimers_.set(i, common$AttributedLocalizedString);
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 32;
        }

        private void setInputError(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.InputError inputError) {
            this.inputError_ = inputError;
            this.bitField0_ |= 16;
        }

        private void setPrimaryText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.primaryText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
            this.prompt_ = common$Prompt;
            this.bitField0_ |= 2;
        }

        private void setSecondaryText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.secondaryText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addDisclaimers(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            ensureDisclaimersIsMutable();
            this.disclaimers_.add(i, common$AttributedLocalizedString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane variableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane();
        DEFAULT_INSTANCE = variableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.class, variableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane);
    }

    private VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.z0.f6343a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane variableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) {
        return DEFAULT_INSTANCE.createBuilder(variableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
