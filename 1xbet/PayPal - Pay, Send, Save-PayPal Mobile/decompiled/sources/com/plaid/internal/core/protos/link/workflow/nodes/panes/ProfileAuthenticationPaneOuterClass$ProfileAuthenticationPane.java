package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.b> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 13;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions DEFAULT_INSTANCE;
        public static final int EDIT_PROFILE_IDENTIFIER_TAP_FIELD_NUMBER = 18;
        public static final int EXIT_FIELD_NUMBER = 2;
        public static final int MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP_FIELD_NUMBER = 16;
        public static final int PANE_BODY_ADORNMENT_BUTTON_TAP_FIELD_NUMBER = 10;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions> PARSER = null;
        public static final int PROFILE_CHIP_OPTION_SELECT_FIELD_NUMBER = 17;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 12;
        public static final int SUBMIT_FIELD_NUMBER = 9;
        public static final int SUCCESS_FIELD_NUMBER = 11;
        public static final int TRANSITION_COMPLETION_FIELD_NUMBER = 14;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ButtonDisclaimerTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction();
                DEFAULT_INSTANCE = buttonDisclaimerTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.class, buttonDisclaimerTapAction);
            }

            private ButtonDisclaimerTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonDisclaimerTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EditProfileIdentifierAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction editProfileIdentifierAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction();
                DEFAULT_INSTANCE = editProfileIdentifierAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.class, editProfileIdentifierAction);
            }

            private EditProfileIdentifierAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction editProfileIdentifierAction) {
                return DEFAULT_INSTANCE.createBuilder(editProfileIdentifierAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ModalFlexibleComponentsButtonOneTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response response_;

            public static final class Response extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public static final int COMPONENT_ID_FIELD_NUMBER = 1;
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response> PARSER;
                private java.lang.String componentId_ = "";

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response response = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response();
                    DEFAULT_INSTANCE = response;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.class, response);
                }

                private Response() {
                }

                private void clearComponentId() {
                    this.componentId_ = getDefaultInstance().getComponentId();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setComponentIdBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.componentId_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"componentId_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.class) {
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

                public final java.lang.String getComponentId() {
                    return this.componentId_;
                }

                public final com.google.protobuf.ByteString getComponentIdBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.componentId_);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response response) {
                    return DEFAULT_INSTANCE.createBuilder(response);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setComponentId(java.lang.String str) {
                    this.componentId_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction();
                DEFAULT_INSTANCE = modalFlexibleComponentsButtonOneTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.class, modalFlexibleComponentsButtonOneTapAction);
            }

            private ModalFlexibleComponentsButtonOneTapAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response getResponse() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response response = this.response_;
                return response == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.getDefaultInstance() : response;
            }

            public final boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response response) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response response2 = this.response_;
                if (response2 == null || response2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.newBuilder(this.response_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response.a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
                return DEFAULT_INSTANCE.createBuilder(modalFlexibleComponentsButtonOneTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.Response response) {
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PaneBodyAdornmentButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction();
                DEFAULT_INSTANCE = paneBodyAdornmentButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.class, paneBodyAdornmentButtonTapAction);
            }

            private PaneBodyAdornmentButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(paneBodyAdornmentButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ProfileChipOptionSelectAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response response_;

            public static final class Response extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response> PARSER = null;
                public static final int SELECTED_OPTION_FIELD_NUMBER = 1;
                private java.lang.String selectedOption_ = "";

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response response = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response();
                    DEFAULT_INSTANCE = response;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.class, response);
                }

                private Response() {
                }

                private void clearSelectedOption() {
                    this.selectedOption_ = getDefaultInstance().getSelectedOption();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setSelectedOptionBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.selectedOption_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"selectedOption_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.class) {
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

                public final java.lang.String getSelectedOption() {
                    return this.selectedOption_;
                }

                public final com.google.protobuf.ByteString getSelectedOptionBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.selectedOption_);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response response) {
                    return DEFAULT_INSTANCE.createBuilder(response);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setSelectedOption(java.lang.String str) {
                    this.selectedOption_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction profileChipOptionSelectAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction();
                DEFAULT_INSTANCE = profileChipOptionSelectAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.class, profileChipOptionSelectAction);
            }

            private ProfileChipOptionSelectAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response getResponse() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response response = this.response_;
                return response == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.getDefaultInstance() : response;
            }

            public final boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response response) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response response2 = this.response_;
                if (response2 == null || response2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.newBuilder(this.response_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response.a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction profileChipOptionSelectAction) {
                return DEFAULT_INSTANCE.createBuilder(profileChipOptionSelectAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.Response response) {
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SkipAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction skipAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction();
                DEFAULT_INSTANCE = skipAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction.class, skipAction);
            }

            private SkipAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction skipAction) {
                return DEFAULT_INSTANCE.createBuilder(skipAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SkipAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction> PARSER = null;
            public static final int PROMPT_RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse promptResponse_;

            public static final class PromptResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public static final int AUTO_SUBMIT_BEHAVIOR_FIELD_NUMBER = 4;
                public static final int COUNTRY_CODE_FIELD_NUMBER = 3;
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse DEFAULT_INSTANCE;
                public static final int INPUT_ID_FIELD_NUMBER = 1;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse> PARSER = null;
                public static final int VALUE_FIELD_NUMBER = 2;
                private int autoSubmitBehavior_;
                private java.lang.String inputId_ = "";
                private java.lang.String value_ = "";
                private java.lang.String countryCode_ = "";

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse promptResponse = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse();
                    DEFAULT_INSTANCE = promptResponse;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.class, promptResponse);
                }

                private PromptResponse() {
                }

                private void clearAutoSubmitBehavior() {
                    this.autoSubmitBehavior_ = 0;
                }

                private void clearCountryCode() {
                    this.countryCode_ = getDefaultInstance().getCountryCode();
                }

                private void clearInputId() {
                    this.inputId_ = getDefaultInstance().getInputId();
                }

                private void clearValue() {
                    this.value_ = getDefaultInstance().getValue();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setAutoSubmitBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b bVar) {
                    this.autoSubmitBehavior_ = bVar.getNumber();
                }

                private void setAutoSubmitBehaviorValue(int i) {
                    this.autoSubmitBehavior_ = i;
                }

                private void setCountryCodeBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.countryCode_ = byteString.toStringUtf8();
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
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new java.lang.Object[]{"inputId_", "value_", "countryCode_", "autoSubmitBehavior_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.class) {
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

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b getAutoSubmitBehavior() {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.forNumber(this.autoSubmitBehavior_);
                    return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.UNRECOGNIZED : forNumber;
                }

                public final int getAutoSubmitBehaviorValue() {
                    return this.autoSubmitBehavior_;
                }

                public final java.lang.String getCountryCode() {
                    return this.countryCode_;
                }

                public final com.google.protobuf.ByteString getCountryCodeBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.countryCode_);
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

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse promptResponse) {
                    return DEFAULT_INSTANCE.createBuilder(promptResponse);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setCountryCode(java.lang.String str) {
                    this.countryCode_ = str;
                }

                private void setInputId(java.lang.String str) {
                    this.inputId_ = str;
                }

                private void setValue(java.lang.String str) {
                    this.value_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void clearPromptResponse() {
                this.promptResponse_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "promptResponse_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse getPromptResponse() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse promptResponse = this.promptResponse_;
                return promptResponse == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.getDefaultInstance() : promptResponse;
            }

            public final boolean hasPromptResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergePromptResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse promptResponse) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse promptResponse2 = this.promptResponse_;
                if (promptResponse2 == null || promptResponse2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.getDefaultInstance()) {
                    this.promptResponse_ = promptResponse;
                } else {
                    this.promptResponse_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.newBuilder(this.promptResponse_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse.a) promptResponse).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setPromptResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.PromptResponse promptResponse) {
                this.promptResponse_ = promptResponse;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SuccessAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction successAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction();
                DEFAULT_INSTANCE = successAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.class, successAction);
            }

            private SuccessAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction successAction) {
                return DEFAULT_INSTANCE.createBuilder(successAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TransitionCompletionAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction transitionCompletionAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction();
                DEFAULT_INSTANCE = transitionCompletionAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.class, transitionCompletionAction);
            }

            private TransitionCompletionAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction transitionCompletionAction) {
                return DEFAULT_INSTANCE.createBuilder(transitionCompletionAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(9),
            EXIT(2),
            PANE_BODY_ADORNMENT_BUTTON_TAP(10),
            SUCCESS(11),
            SECONDARY_BUTTON_TAP(12),
            BUTTON_DISCLAIMER_TAP(13),
            TRANSITION_COMPLETION(14),
            MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP(16),
            PROFILE_CHIP_OPTION_SELECT(17),
            EDIT_PROFILE_IDENTIFIER_TAP(18),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6235a;

            a(int i) {
                this.f6235a = i;
            }

            public final int getNumber() {
                return this.f6235a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 2) {
                    return EXIT;
                }
                switch (i) {
                    case 9:
                        return SUBMIT;
                    case 10:
                        return PANE_BODY_ADORNMENT_BUTTON_TAP;
                    case 11:
                        return SUCCESS;
                    case 12:
                        return SECONDARY_BUTTON_TAP;
                    case 13:
                        return BUTTON_DISCLAIMER_TAP;
                    case 14:
                        return TRANSITION_COMPLETION;
                    default:
                        switch (i) {
                            case 16:
                                return MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP;
                            case 17:
                                return PROFILE_CHIP_OPTION_SELECT;
                            case 18:
                                return EDIT_PROFILE_IDENTIFIER_TAP;
                            default:
                                return null;
                        }
                }
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearButtonDisclaimerTap() {
            if (this.actionCase_ == 13) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearEditProfileIdentifierTap() {
            if (this.actionCase_ == 18) {
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

        private void clearModalFlexibleComponentsButtonOneTap() {
            if (this.actionCase_ == 16) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearPaneBodyAdornmentButtonTap() {
            if (this.actionCase_ == 10) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearProfileChipOptionSelect() {
            if (this.actionCase_ == 17) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryButtonTap() {
            if (this.actionCase_ == 12) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSubmit() {
            if (this.actionCase_ == 9) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSuccess() {
            if (this.actionCase_ == 11) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTransitionCompletion() {
            if (this.actionCase_ == 14) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0002\u0012\n\u0000\u0000\u0000\u0002<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            return this.actionCase_ == 13 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction getEditProfileIdentifierTap() {
            return this.actionCase_ == 18 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction getModalFlexibleComponentsButtonOneTap() {
            return this.actionCase_ == 16 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction getPaneBodyAdornmentButtonTap() {
            return this.actionCase_ == 10 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction getProfileChipOptionSelect() {
            return this.actionCase_ == 17 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 12 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 9 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction getSuccess() {
            return this.actionCase_ == 11 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction getTransitionCompletion() {
            return this.actionCase_ == 14 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.getDefaultInstance();
        }

        public final boolean hasButtonDisclaimerTap() {
            return this.actionCase_ == 13;
        }

        public final boolean hasEditProfileIdentifierTap() {
            return this.actionCase_ == 18;
        }

        public final boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public final boolean hasModalFlexibleComponentsButtonOneTap() {
            return this.actionCase_ == 16;
        }

        public final boolean hasPaneBodyAdornmentButtonTap() {
            return this.actionCase_ == 10;
        }

        public final boolean hasProfileChipOptionSelect() {
            return this.actionCase_ == 17;
        }

        public final boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 12;
        }

        public final boolean hasSubmit() {
            return this.actionCase_ == 9;
        }

        public final boolean hasSuccess() {
            return this.actionCase_ == 11;
        }

        public final boolean hasTransitionCompletion() {
            return this.actionCase_ == 14;
        }

        private void mergeButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            if (this.actionCase_ != 13 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = buttonDisclaimerTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction.a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 13;
        }

        private void mergeEditProfileIdentifierTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction editProfileIdentifierAction) {
            if (this.actionCase_ != 18 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.getDefaultInstance()) {
                this.action_ = editProfileIdentifierAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction.a) editProfileIdentifierAction).buildPartial();
            }
            this.actionCase_ = 18;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeModalFlexibleComponentsButtonOneTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
            if (this.actionCase_ != 16 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.getDefaultInstance()) {
                this.action_ = modalFlexibleComponentsButtonOneTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction.a) modalFlexibleComponentsButtonOneTapAction).buildPartial();
            }
            this.actionCase_ = 16;
        }

        private void mergePaneBodyAdornmentButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
            if (this.actionCase_ != 10 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.getDefaultInstance()) {
                this.action_ = paneBodyAdornmentButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction.a) paneBodyAdornmentButtonTapAction).buildPartial();
            }
            this.actionCase_ = 10;
        }

        private void mergeProfileChipOptionSelect(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction profileChipOptionSelectAction) {
            if (this.actionCase_ != 17 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.getDefaultInstance()) {
                this.action_ = profileChipOptionSelectAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction.a) profileChipOptionSelectAction).buildPartial();
            }
            this.actionCase_ = 17;
        }

        private void mergeSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            if (this.actionCase_ != 12 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 12;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 9 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 9;
        }

        private void mergeSuccess(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction successAction) {
            if (this.actionCase_ != 11 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.getDefaultInstance()) {
                this.action_ = successAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction.a) successAction).buildPartial();
            }
            this.actionCase_ = 11;
        }

        private void mergeTransitionCompletion(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction transitionCompletionAction) {
            if (this.actionCase_ != 14 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.getDefaultInstance()) {
                this.action_ = transitionCompletionAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction.a) transitionCompletionAction).buildPartial();
            }
            this.actionCase_ = 14;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButtonDisclaimerTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            this.action_ = buttonDisclaimerTapAction;
            this.actionCase_ = 13;
        }

        private void setEditProfileIdentifierTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.EditProfileIdentifierAction editProfileIdentifierAction) {
            this.action_ = editProfileIdentifierAction;
            this.actionCase_ = 18;
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setModalFlexibleComponentsButtonOneTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
            this.action_ = modalFlexibleComponentsButtonOneTapAction;
            this.actionCase_ = 16;
        }

        private void setPaneBodyAdornmentButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
            this.action_ = paneBodyAdornmentButtonTapAction;
            this.actionCase_ = 10;
        }

        private void setProfileChipOptionSelect(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.ProfileChipOptionSelectAction profileChipOptionSelectAction) {
            this.action_ = profileChipOptionSelectAction;
            this.actionCase_ = 17;
        }

        private void setSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SecondaryButtonTapAction secondaryButtonTapAction) {
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 12;
        }

        private void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 9;
        }

        private void setSuccess(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.SuccessAction successAction) {
            this.action_ = successAction;
            this.actionCase_ = 11;
        }

        private void setTransitionCompletion(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.TransitionCompletionAction transitionCompletionAction) {
            this.action_ = transitionCompletionAction;
            this.actionCase_ = 14;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 17;
        public static final int OTP_ENTRY_RENDERING_FIELD_NUMBER = 2;
        public static final int PANE_BRANDING_FIELD_NUMBER = 19;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering> PARSER = null;
        public static final int PASSKEY_AUTHENTICATION_RENDERING_FIELD_NUMBER = 4;
        public static final int PASSKEY_CREATION_RENDERING_FIELD_NUMBER = 3;
        public static final int PROFILE_IDENTIFIER_ENTRY_RENDERING_FIELD_NUMBER = 1;
        public static final int TRANSIENT_RENDERING_FIELD_NUMBER = 5;
        public static final int USE_PANE_CONTROLLED_LOGIC_FIELD_NUMBER = 18;
        private int authenticationStepCase_ = 0;
        private java.lang.Object authenticationStep_;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events events_;
        private int paneBranding_;
        private boolean usePaneControlledLogic_;

        public static final class BypassPhoneNumberWarningRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int ANIMATION_FIELD_NUMBER = 5;
            public static final int AUTO_TRANSITION_DELAY_MS_FIELD_NUMBER = 4;
            public static final int CLIENT_LOGO_FIELD_NUMBER = 2;
            public static final int CONTENT_FIELD_NUMBER = 3;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering> PARSER = null;
            public static final int PRIMARY_TEXT_FIELD_NUMBER = 1;
            private int animation_;
            private int autoTransitionDelayMs_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance clientLogo_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent content_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent primaryText_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering bypassPhoneNumberWarningRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering();
                DEFAULT_INSTANCE = bypassPhoneNumberWarningRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.class, bypassPhoneNumberWarningRendering);
            }

            private BypassPhoneNumberWarningRendering() {
            }

            private void clearAnimation() {
                this.animation_ = 0;
            }

            private void clearAutoTransitionDelayMs() {
                this.autoTransitionDelayMs_ = 0;
            }

            private void clearClientLogo() {
                this.clientLogo_ = null;
                this.bitField0_ &= -3;
            }

            private void clearContent() {
                this.content_ = null;
                this.bitField0_ &= -5;
            }

            private void clearPrimaryText() {
                this.primaryText_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAnimation(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a aVar) {
                this.animation_ = aVar.getNumber();
            }

            private void setAnimationValue(int i) {
                this.animation_ = i;
            }

            private void setAutoTransitionDelayMs(int i) {
                this.autoTransitionDelayMs_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005\f", new java.lang.Object[]{"bitField0_", "primaryText_", "clientLogo_", "content_", "autoTransitionDelayMs_", "animation_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a getAnimation() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a.forNumber(this.animation_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a.UNRECOGNIZED : forNumber;
            }

            public final int getAnimationValue() {
                return this.animation_;
            }

            public final int getAutoTransitionDelayMs() {
                return this.autoTransitionDelayMs_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getClientLogo() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.clientLogo_;
                return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getContent() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.content_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getPrimaryText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.primaryText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final boolean hasClientLogo() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasPrimaryText() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeClientLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.clientLogo_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.clientLogo_ = common$RenderedAssetAppearance;
                } else {
                    this.clientLogo_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.clientLogo_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.content_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.content_ = common$TextContent;
                } else {
                    this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergePrimaryText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.primaryText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.primaryText_ = common$TextContent;
                } else {
                    this.primaryText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.primaryText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering bypassPhoneNumberWarningRendering) {
                return DEFAULT_INSTANCE.createBuilder(bypassPhoneNumberWarningRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setClientLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                this.clientLogo_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 2;
            }

            private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.content_ = common$TextContent;
                this.bitField0_ |= 4;
            }

            private void setPrimaryText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.primaryText_ = common$TextContent;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CoBrandedLoadingPaneRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int AUTO_TRANSITION_DELAY_MS_FIELD_NUMBER = 2;
            public static final int CO_BRANDED_HEADER_ASSET_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering DEFAULT_INSTANCE;
            public static final int NEXT_CALL_LEAD_MS_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering> PARSER;
            private int autoTransitionDelayMs_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset coBrandedHeaderAsset_;
            private int nextCallLeadMs_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering coBrandedLoadingPaneRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering();
                DEFAULT_INSTANCE = coBrandedLoadingPaneRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.class, coBrandedLoadingPaneRendering);
            }

            private CoBrandedLoadingPaneRendering() {
            }

            private void clearAutoTransitionDelayMs() {
                this.autoTransitionDelayMs_ = 0;
            }

            private void clearCoBrandedHeaderAsset() {
                this.coBrandedHeaderAsset_ = null;
                this.bitField0_ &= -2;
            }

            private void clearNextCallLeadMs() {
                this.nextCallLeadMs_ = 0;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAutoTransitionDelayMs(int i) {
                this.autoTransitionDelayMs_ = i;
            }

            private void setNextCallLeadMs(int i) {
                this.nextCallLeadMs_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new java.lang.Object[]{"bitField0_", "coBrandedHeaderAsset_", "autoTransitionDelayMs_", "nextCallLeadMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.class) {
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

            public final int getAutoTransitionDelayMs() {
                return this.autoTransitionDelayMs_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset getCoBrandedHeaderAsset() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset = this.coBrandedHeaderAsset_;
                return common$CobrandedHeaderAsset == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance() : common$CobrandedHeaderAsset;
            }

            public final int getNextCallLeadMs() {
                return this.nextCallLeadMs_;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering coBrandedLoadingPaneRendering) {
                return DEFAULT_INSTANCE.createBuilder(coBrandedLoadingPaneRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setCoBrandedHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                this.coBrandedHeaderAsset_ = common$CobrandedHeaderAsset;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CoBrandedOTPEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int ANIMATED_CO_BRANDED_HEADER_FIELD_NUMBER = 1;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 5;
            public static final int BUTTON_FIELD_NUMBER = 2;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 4;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering DEFAULT_INSTANCE;
            public static final int PANE_BODY_ADORNMENT_FIELD_NUMBER = 6;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 7;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 3;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader animatedCoBrandedHeader_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment paneBodyAdornment_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt prompt_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering coBrandedOTPEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering();
                DEFAULT_INSTANCE = coBrandedOTPEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.class, coBrandedOTPEntryRendering);
            }

            private CoBrandedOTPEntryRendering() {
            }

            private void clearAnimatedCoBrandedHeader() {
                this.animatedCoBrandedHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -3;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -9;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearPaneBodyAdornment() {
                this.paneBodyAdornment_ = null;
                this.bitField0_ &= -17;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -33;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -5;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButtonPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p enumC0490p) {
                this.buttonPlacement_ = enumC0490p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\f\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new java.lang.Object[]{"bitField0_", "animatedCoBrandedHeader_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "paneBodyAdornment_", "prompt_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader getAnimatedCoBrandedHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader = this.animatedCoBrandedHeader_;
                return common$AnimatedCoBrandedHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.getDefaultInstance() : common$AnimatedCoBrandedHeader;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getButtonDisclaimerText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p getButtonPlacement() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(this.buttonPlacement_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.UNRECOGNIZED : forNumber;
            }

            public final int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment getPaneBodyAdornment() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment = this.paneBodyAdornment_;
                return common$PaneBodyAdornment == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.getDefaultInstance() : common$PaneBodyAdornment;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final boolean hasAnimatedCoBrandedHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasPaneBodyAdornment() {
                return (this.bitField0_ & 16) != 0;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 32) != 0;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 4) != 0;
            }

            private void mergeAnimatedCoBrandedHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader2 = this.animatedCoBrandedHeader_;
                if (common$AnimatedCoBrandedHeader2 == null || common$AnimatedCoBrandedHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.getDefaultInstance()) {
                    this.animatedCoBrandedHeader_ = common$AnimatedCoBrandedHeader;
                } else {
                    this.animatedCoBrandedHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.newBuilder(this.animatedCoBrandedHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.a) common$AnimatedCoBrandedHeader).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergePaneBodyAdornment(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment2 = this.paneBodyAdornment_;
                if (common$PaneBodyAdornment2 == null || common$PaneBodyAdornment2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.getDefaultInstance()) {
                    this.paneBodyAdornment_ = common$PaneBodyAdornment;
                } else {
                    this.paneBodyAdornment_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.newBuilder(this.paneBodyAdornment_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.a) common$PaneBodyAdornment).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergePrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.newBuilder(this.prompt_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a) common$Prompt).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering coBrandedOTPEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(coBrandedOTPEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setAnimatedCoBrandedHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
                this.animatedCoBrandedHeader_ = common$AnimatedCoBrandedHeader;
                this.bitField0_ |= 1;
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 2;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 8;
            }

            private void setPaneBodyAdornment(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment) {
                this.paneBodyAdornment_ = common$PaneBodyAdornment;
                this.bitField0_ |= 16;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 32;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CoBrandedPhoneEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int ANIMATED_CO_BRANDED_HEADER_FIELD_NUMBER = 1;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 6;
            public static final int BUTTON_FIELD_NUMBER = 3;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 5;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 2;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 4;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader animatedCoBrandedHeader_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt prompt_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering coBrandedPhoneEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering();
                DEFAULT_INSTANCE = coBrandedPhoneEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.class, coBrandedPhoneEntryRendering);
            }

            private CoBrandedPhoneEntryRendering() {
            }

            private void clearAnimatedCoBrandedHeader() {
                this.animatedCoBrandedHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -5;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -17;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -9;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButtonPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p enumC0490p) {
                this.buttonPlacement_ = enumC0490p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\f\u0006ဉ\u0004", new java.lang.Object[]{"bitField0_", "animatedCoBrandedHeader_", "prompt_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader getAnimatedCoBrandedHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader = this.animatedCoBrandedHeader_;
                return common$AnimatedCoBrandedHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.getDefaultInstance() : common$AnimatedCoBrandedHeader;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getButtonDisclaimerText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p getButtonPlacement() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(this.buttonPlacement_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.UNRECOGNIZED : forNumber;
            }

            public final int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final boolean hasAnimatedCoBrandedHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 16) != 0;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 8) != 0;
            }

            private void mergeAnimatedCoBrandedHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader2 = this.animatedCoBrandedHeader_;
                if (common$AnimatedCoBrandedHeader2 == null || common$AnimatedCoBrandedHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.getDefaultInstance()) {
                    this.animatedCoBrandedHeader_ = common$AnimatedCoBrandedHeader;
                } else {
                    this.animatedCoBrandedHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.newBuilder(this.animatedCoBrandedHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader.a) common$AnimatedCoBrandedHeader).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 16;
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

            private void mergeSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering coBrandedPhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(coBrandedPhoneEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setAnimatedCoBrandedHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
                this.animatedCoBrandedHeader_ = common$AnimatedCoBrandedHeader;
                this.bitField0_ |= 1;
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 16;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 2;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CombinedConsentAndPhoneEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 8;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 7;
            public static final int BUTTON_FIELD_NUMBER = 4;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 6;
            public static final int CHECK_LIST_FIELD_NUMBER = 10;
            public static final int CO_BRANDED_ASSET_FIELD_NUMBER = 13;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering> PARSER = null;
            public static final int PLAID_BRANDED_ASSET_FIELD_NUMBER = 12;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
            public static final int SHOW_ACTION_DIVIDER_LINE_FIELD_NUMBER = 11;
            public static final int TEXT_ALIGNMENT_FIELD_NUMBER = 9;
            private int backgroundDisplayMode_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList checkList_;
            private int headerAssetConfigCase_ = 0;
            private java.lang.Object headerAssetConfig_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent headerText_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt prompt_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
            private boolean showActionDividerLine_;
            private int textAlignment_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            public enum b {
                PLAID_BRANDED_ASSET(12),
                CO_BRANDED_ASSET(13),
                HEADERASSETCONFIG_NOT_SET(0);


                /* renamed from: a, reason: collision with root package name */
                public final int f6236a;

                b(int i) {
                    this.f6236a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.b forNumber(int i) {
                    if (i == 0) {
                        return HEADERASSETCONFIG_NOT_SET;
                    }
                    if (i == 12) {
                        return PLAID_BRANDED_ASSET;
                    }
                    if (i != 13) {
                        return null;
                    }
                    return CO_BRANDED_ASSET;
                }

                public final int getNumber() {
                    return this.f6236a;
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering combinedConsentAndPhoneEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering();
                DEFAULT_INSTANCE = combinedConsentAndPhoneEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.class, combinedConsentAndPhoneEntryRendering);
            }

            private CombinedConsentAndPhoneEntryRendering() {
            }

            private void clearBackgroundDisplayMode() {
                this.backgroundDisplayMode_ = 0;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -17;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -65;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearCheckList() {
                this.checkList_ = null;
                this.bitField0_ &= -9;
            }

            private void clearCoBrandedAsset() {
                if (this.headerAssetConfigCase_ == 13) {
                    this.headerAssetConfigCase_ = 0;
                    this.headerAssetConfig_ = null;
                }
            }

            private void clearHeaderAssetConfig() {
                this.headerAssetConfigCase_ = 0;
                this.headerAssetConfig_ = null;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPlaidBrandedAsset() {
                if (this.headerAssetConfigCase_ == 12) {
                    this.headerAssetConfigCase_ = 0;
                    this.headerAssetConfig_ = null;
                }
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -33;
            }

            private void clearShowActionDividerLine() {
                this.showActionDividerLine_ = false;
            }

            private void clearTextAlignment() {
                this.textAlignment_ = 0;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBackgroundDisplayMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m enumC0487m) {
                this.backgroundDisplayMode_ = enumC0487m.getNumber();
            }

            private void setBackgroundDisplayModeValue(int i) {
                this.backgroundDisplayMode_ = i;
            }

            private void setButtonPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p enumC0490p) {
                this.buttonPlacement_ = enumC0490p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setShowActionDividerLine(boolean z) {
                this.showActionDividerLine_ = z;
            }

            private void setTextAlignment(com.plaid.internal.core.protos.link.workflow.nodes.panes.U u) {
                this.textAlignment_ = u.getNumber();
            }

            private void setTextAlignmentValue(int i) {
                this.textAlignment_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0004\u0005ဉ\u0005\u0006\f\u0007ဉ\u0006\b\f\t\f\nဉ\u0003\u000b\u0007\f<\u0000\r<\u0000", new java.lang.Object[]{"headerAssetConfig_", "headerAssetConfigCase_", "bitField0_", "paneHeader_", "headerText_", "prompt_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "backgroundDisplayMode_", "textAlignment_", "checkList_", "showActionDividerLine_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getButtonDisclaimerText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p getButtonPlacement() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(this.buttonPlacement_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.UNRECOGNIZED : forNumber;
            }

            public final int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList getCheckList() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList common$CheckList = this.checkList_;
                return common$CheckList == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.getDefaultInstance() : common$CheckList;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset getCoBrandedAsset() {
                return this.headerAssetConfigCase_ == 13 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) this.headerAssetConfig_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.b getHeaderAssetConfigCase() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.b.forNumber(this.headerAssetConfigCase_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getHeaderText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getPlaidBrandedAsset() {
                return this.headerAssetConfigCase_ == 12 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.headerAssetConfig_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final boolean getShowActionDividerLine() {
                return this.showActionDividerLine_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.U getTextAlignment() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.U forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.U.forNumber(this.textAlignment_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.U.UNRECOGNIZED : forNumber;
            }

            public final int getTextAlignmentValue() {
                return this.textAlignment_;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 64) != 0;
            }

            public final boolean hasCheckList() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasCoBrandedAsset() {
                return this.headerAssetConfigCase_ == 13;
            }

            public final boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasPlaidBrandedAsset() {
                return this.headerAssetConfigCase_ == 12;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 32) != 0;
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

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            private void mergeCheckList(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList common$CheckList) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList common$CheckList2 = this.checkList_;
                if (common$CheckList2 == null || common$CheckList2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.getDefaultInstance()) {
                    this.checkList_ = common$CheckList;
                } else {
                    this.checkList_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.newBuilder(this.checkList_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.a) common$CheckList).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeCoBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                if (this.headerAssetConfigCase_ != 13 || this.headerAssetConfig_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance()) {
                    this.headerAssetConfig_ = common$CobrandedHeaderAsset;
                } else {
                    this.headerAssetConfig_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) this.headerAssetConfig_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a) common$CobrandedHeaderAsset).buildPartial();
                }
                this.headerAssetConfigCase_ = 13;
            }

            private void mergeHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.headerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
                if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                    this.paneHeader_ = common$PaneHeader;
                } else {
                    this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergePlaidBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                if (this.headerAssetConfigCase_ != 12 || this.headerAssetConfig_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.headerAssetConfig_ = common$RenderedAssetAppearance;
                } else {
                    this.headerAssetConfig_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.headerAssetConfig_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                }
                this.headerAssetConfigCase_ = 12;
            }

            private void mergePrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.newBuilder(this.prompt_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a) common$Prompt).buildPartial();
                }
                this.bitField0_ |= 4;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering combinedConsentAndPhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(combinedConsentAndPhoneEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 64;
            }

            private void setCheckList(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList common$CheckList) {
                this.checkList_ = common$CheckList;
                this.bitField0_ |= 8;
            }

            private void setCoBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                this.headerAssetConfig_ = common$CobrandedHeaderAsset;
                this.headerAssetConfigCase_ = 13;
            }

            private void setHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setPlaidBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                this.headerAssetConfig_ = common$RenderedAssetAppearance;
                this.headerAssetConfigCase_ = 12;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 32;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DefaultOTPEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 7;
            public static final int BUTTON_DISCLAIMER_TEXT_PLACEMENT_FIELD_NUMBER = 8;
            public static final int BUTTON_FIELD_NUMBER = 4;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 6;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int PANE_AUTO_SUBMIT_OPTIONS_FIELD_NUMBER = 9;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
            public static final int USE_SEGMENTED_OTP_INPUT_FIELD_NUMBER = 10;
            private int bitField0_;
            private int buttonDisclaimerTextPlacement_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent headerText_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions paneAutoSubmitOptions_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt prompt_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
            private boolean useSegmentedOtpInput_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering defaultOTPEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering();
                DEFAULT_INSTANCE = defaultOTPEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.class, defaultOTPEntryRendering);
            }

            private DefaultOTPEntryRendering() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -33;
            }

            private void clearButtonDisclaimerTextPlacement() {
                this.buttonDisclaimerTextPlacement_ = 0;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPaneAutoSubmitOptions() {
                this.paneAutoSubmitOptions_ = null;
                this.bitField0_ &= -65;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            private void clearUseSegmentedOtpInput() {
                this.useSegmentedOtpInput_ = false;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButtonDisclaimerTextPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t enumC0493t) {
                this.buttonDisclaimerTextPlacement_ = enumC0493t.getNumber();
            }

            private void setButtonDisclaimerTextPlacementValue(int i) {
                this.buttonDisclaimerTextPlacement_ = i;
            }

            private void setButtonPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p enumC0490p) {
                this.buttonPlacement_ = enumC0490p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setUseSegmentedOtpInput(boolean z) {
                this.useSegmentedOtpInput_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\f\u0007ဉ\u0005\b\f\tဉ\u0006\n\u0007", new java.lang.Object[]{"bitField0_", "paneHeader_", "headerText_", "prompt_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "buttonDisclaimerTextPlacement_", "paneAutoSubmitOptions_", "useSegmentedOtpInput_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getButtonDisclaimerText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t getButtonDisclaimerTextPlacement() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.forNumber(this.buttonDisclaimerTextPlacement_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.UNRECOGNIZED : forNumber;
            }

            public final int getButtonDisclaimerTextPlacementValue() {
                return this.buttonDisclaimerTextPlacement_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p getButtonPlacement() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(this.buttonPlacement_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.UNRECOGNIZED : forNumber;
            }

            public final int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getHeaderText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions getPaneAutoSubmitOptions() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = this.paneAutoSubmitOptions_;
                return common$PaneAutoSubmitOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.getDefaultInstance() : common$PaneAutoSubmitOptions;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final boolean getUseSegmentedOtpInput() {
                return this.useSegmentedOtpInput_;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 32) != 0;
            }

            public final boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasPaneAutoSubmitOptions() {
                return (this.bitField0_ & 64) != 0;
            }

            public final boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
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

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.headerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergePaneAutoSubmitOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions2 = this.paneAutoSubmitOptions_;
                if (common$PaneAutoSubmitOptions2 == null || common$PaneAutoSubmitOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.getDefaultInstance()) {
                    this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                } else {
                    this.paneAutoSubmitOptions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.newBuilder(this.paneAutoSubmitOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b) common$PaneAutoSubmitOptions).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
                if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                    this.paneHeader_ = common$PaneHeader;
                } else {
                    this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
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
                this.bitField0_ |= 4;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering defaultOTPEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(defaultOTPEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 32;
            }

            private void setHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setPaneAutoSubmitOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                this.bitField0_ |= 64;
            }

            private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DefaultPhoneEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 8;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 7;
            public static final int BUTTON_FIELD_NUMBER = 4;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 6;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
            public static final int TEXT_ALIGNMENT_FIELD_NUMBER = 9;
            private int backgroundDisplayMode_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent headerText_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt prompt_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
            private int textAlignment_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering defaultPhoneEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering();
                DEFAULT_INSTANCE = defaultPhoneEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.class, defaultPhoneEntryRendering);
            }

            private DefaultPhoneEntryRendering() {
            }

            private void clearBackgroundDisplayMode() {
                this.backgroundDisplayMode_ = 0;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -33;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            private void clearTextAlignment() {
                this.textAlignment_ = 0;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBackgroundDisplayMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m enumC0487m) {
                this.backgroundDisplayMode_ = enumC0487m.getNumber();
            }

            private void setBackgroundDisplayModeValue(int i) {
                this.backgroundDisplayMode_ = i;
            }

            private void setButtonPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p enumC0490p) {
                this.buttonPlacement_ = enumC0490p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setTextAlignment(com.plaid.internal.core.protos.link.workflow.nodes.panes.U u) {
                this.textAlignment_ = u.getNumber();
            }

            private void setTextAlignmentValue(int i) {
                this.textAlignment_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\f\u0007ဉ\u0005\b\f\t\f", new java.lang.Object[]{"bitField0_", "paneHeader_", "headerText_", "prompt_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "backgroundDisplayMode_", "textAlignment_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getButtonDisclaimerText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p getButtonPlacement() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(this.buttonPlacement_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.UNRECOGNIZED : forNumber;
            }

            public final int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getHeaderText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.U getTextAlignment() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.U forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.U.forNumber(this.textAlignment_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.U.UNRECOGNIZED : forNumber;
            }

            public final int getTextAlignmentValue() {
                return this.textAlignment_;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 32) != 0;
            }

            public final boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
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

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.headerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
                if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                    this.paneHeader_ = common$PaneHeader;
                } else {
                    this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
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
                this.bitField0_ |= 4;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering defaultPhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(defaultPhoneEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 32;
            }

            private void setHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EndOfFlowEmailEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BUTTON_FIELD_NUMBER = 6;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering DEFAULT_INSTANCE;
            public static final int DESCRIPTION_FIELD_NUMBER = 9;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int INFORMATION_CARD_FIELD_NUMBER = 10;
            public static final int PANE_AUTO_SUBMIT_OPTIONS_FIELD_NUMBER = 8;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering> PARSER = null;
            public static final int PROFILE_CHIP_FIELD_NUMBER = 4;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 7;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private int contentCase_ = 0;
            private java.lang.Object content_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString description_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent headerText_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box informationCard_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions paneAutoSubmitOptions_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.DEFAULT_INSTANCE);
                }
            }

            public enum b {
                PROMPT(3),
                PROFILE_CHIP(4),
                CONTENT_NOT_SET(0);


                /* renamed from: a, reason: collision with root package name */
                public final int f6237a;

                b(int i) {
                    this.f6237a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.b forNumber(int i) {
                    if (i == 0) {
                        return CONTENT_NOT_SET;
                    }
                    if (i == 3) {
                        return PROMPT;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return PROFILE_CHIP;
                }

                public final int getNumber() {
                    return this.f6237a;
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering endOfFlowEmailEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering();
                DEFAULT_INSTANCE = endOfFlowEmailEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.class, endOfFlowEmailEntryRendering);
            }

            private EndOfFlowEmailEntryRendering() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
            }

            private void clearDescription() {
                this.description_ = null;
                this.bitField0_ &= -5;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearInformationCard() {
                this.informationCard_ = null;
                this.bitField0_ &= -33;
            }

            private void clearPaneAutoSubmitOptions() {
                this.paneAutoSubmitOptions_ = null;
                this.bitField0_ &= -65;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearProfileChip() {
                if (this.contentCase_ == 4) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearPrompt() {
                if (this.contentCase_ == 3) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0006\tဉ\u0002\nဉ\u0005", new java.lang.Object[]{"content_", "contentCase_", "bitField0_", "paneHeader_", "headerText_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.class, "button_", "secondaryButton_", "paneAutoSubmitOptions_", "description_", "informationCard_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.b getContentCase() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.b.forNumber(this.contentCase_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getDescription() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.description_;
                return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getHeaderText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box getInformationCard() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box common$Box = this.informationCard_;
                return common$Box == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.getDefaultInstance() : common$Box;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions getPaneAutoSubmitOptions() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = this.paneAutoSubmitOptions_;
                return common$PaneAutoSubmitOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.getDefaultInstance() : common$PaneAutoSubmitOptions;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip getProfileChip() {
                return this.contentCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) this.content_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                return this.contentCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) this.content_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasDescription() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasInformationCard() {
                return (this.bitField0_ & 32) != 0;
            }

            public final boolean hasPaneAutoSubmitOptions() {
                return (this.bitField0_ & 64) != 0;
            }

            public final boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasProfileChip() {
                return this.contentCase_ == 4;
            }

            public final boolean hasPrompt() {
                return this.contentCase_ == 3;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
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

            private void mergeDescription(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.description_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.description_ = common$AttributedLocalizedString;
                } else {
                    this.description_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.description_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.headerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeInformationCard(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box common$Box) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box common$Box2 = this.informationCard_;
                if (common$Box2 == null || common$Box2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.getDefaultInstance()) {
                    this.informationCard_ = common$Box;
                } else {
                    this.informationCard_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.newBuilder(this.informationCard_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.d) common$Box).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergePaneAutoSubmitOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions2 = this.paneAutoSubmitOptions_;
                if (common$PaneAutoSubmitOptions2 == null || common$PaneAutoSubmitOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.getDefaultInstance()) {
                    this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                } else {
                    this.paneAutoSubmitOptions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.newBuilder(this.paneAutoSubmitOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b) common$PaneAutoSubmitOptions).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
                if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                    this.paneHeader_ = common$PaneHeader;
                } else {
                    this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeProfileChip(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip) {
                if (this.contentCase_ != 4 || this.content_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.getDefaultInstance()) {
                    this.content_ = common$ProfileChip;
                } else {
                    this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.a) common$ProfileChip).buildPartial();
                }
                this.contentCase_ = 4;
            }

            private void mergePrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                if (this.contentCase_ != 3 || this.content_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance()) {
                    this.content_ = common$Prompt;
                } else {
                    this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a) common$Prompt).buildPartial();
                }
                this.contentCase_ = 3;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering endOfFlowEmailEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(endOfFlowEmailEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setDescription(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.description_ = common$AttributedLocalizedString;
                this.bitField0_ |= 4;
            }

            private void setHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setInformationCard(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box common$Box) {
                this.informationCard_ = common$Box;
                this.bitField0_ |= 32;
            }

            private void setPaneAutoSubmitOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                this.bitField0_ |= 64;
            }

            private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setProfileChip(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip) {
                this.content_ = common$ProfileChip;
                this.contentCase_ = 4;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.content_ = common$Prompt;
                this.contentCase_ = 3;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EndOfFlowPhoneEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 8;
            public static final int BUTTON_FIELD_NUMBER = 5;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 7;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int PANE_AUTO_SUBMIT_OPTIONS_FIELD_NUMBER = 9;
            public static final int PANE_BODY_ADORNMENT_FIELD_NUMBER = 4;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent headerText_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions paneAutoSubmitOptions_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment paneBodyAdornment_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt prompt_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering endOfFlowPhoneEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering();
                DEFAULT_INSTANCE = endOfFlowPhoneEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.class, endOfFlowPhoneEntryRendering);
            }

            private EndOfFlowPhoneEntryRendering() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -17;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -65;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPaneAutoSubmitOptions() {
                this.paneAutoSubmitOptions_ = null;
                this.bitField0_ &= -129;
            }

            private void clearPaneBodyAdornment() {
                this.paneBodyAdornment_ = null;
                this.bitField0_ &= -9;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -33;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButtonPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p enumC0490p) {
                this.buttonPlacement_ = enumC0490p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\f\bဉ\u0006\tဉ\u0007", new java.lang.Object[]{"bitField0_", "paneHeader_", "headerText_", "prompt_", "paneBodyAdornment_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "paneAutoSubmitOptions_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getButtonDisclaimerText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p getButtonPlacement() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(this.buttonPlacement_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.UNRECOGNIZED : forNumber;
            }

            public final int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getHeaderText() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions getPaneAutoSubmitOptions() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = this.paneAutoSubmitOptions_;
                return common$PaneAutoSubmitOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.getDefaultInstance() : common$PaneAutoSubmitOptions;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment getPaneBodyAdornment() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment = this.paneBodyAdornment_;
                return common$PaneBodyAdornment == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.getDefaultInstance() : common$PaneBodyAdornment;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 64) != 0;
            }

            public final boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasPaneAutoSubmitOptions() {
                return (this.bitField0_ & 128) != 0;
            }

            public final boolean hasPaneBodyAdornment() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 32) != 0;
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

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            private void mergeHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.headerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergePaneAutoSubmitOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions2 = this.paneAutoSubmitOptions_;
                if (common$PaneAutoSubmitOptions2 == null || common$PaneAutoSubmitOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.getDefaultInstance()) {
                    this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                } else {
                    this.paneAutoSubmitOptions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.newBuilder(this.paneAutoSubmitOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b) common$PaneAutoSubmitOptions).buildPartial();
                }
                this.bitField0_ |= 128;
            }

            private void mergePaneBodyAdornment(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment2 = this.paneBodyAdornment_;
                if (common$PaneBodyAdornment2 == null || common$PaneBodyAdornment2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.getDefaultInstance()) {
                    this.paneBodyAdornment_ = common$PaneBodyAdornment;
                } else {
                    this.paneBodyAdornment_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.newBuilder(this.paneBodyAdornment_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.a) common$PaneBodyAdornment).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
                if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                    this.paneHeader_ = common$PaneHeader;
                } else {
                    this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
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
                this.bitField0_ |= 4;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering endOfFlowPhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(endOfFlowPhoneEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 64;
            }

            private void setHeaderText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setPaneAutoSubmitOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                this.bitField0_ |= 128;
            }

            private void setPaneBodyAdornment(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment) {
                this.paneBodyAdornment_ = common$PaneBodyAdornment;
                this.bitField0_ |= 8;
            }

            private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 32;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EndOfFlowSuccessPaneRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int AUTO_TRANSITION_DELAY_MS_FIELD_NUMBER = 4;
            public static final int CONTENT_FIELD_NUMBER = 3;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering DEFAULT_INSTANCE;
            public static final int HEADER_ASSET_FIELD_NUMBER = 1;
            public static final int HEADER_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering> PARSER;
            private int autoTransitionDelayMs_;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent content_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance headerAsset_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent header_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering endOfFlowSuccessPaneRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering();
                DEFAULT_INSTANCE = endOfFlowSuccessPaneRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.class, endOfFlowSuccessPaneRendering);
            }

            private EndOfFlowSuccessPaneRendering() {
            }

            private void clearAutoTransitionDelayMs() {
                this.autoTransitionDelayMs_ = 0;
            }

            private void clearContent() {
                this.content_ = null;
                this.bitField0_ &= -5;
            }

            private void clearHeader() {
                this.header_ = null;
                this.bitField0_ &= -3;
            }

            private void clearHeaderAsset() {
                this.headerAsset_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAutoTransitionDelayMs(int i) {
                this.autoTransitionDelayMs_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b", new java.lang.Object[]{"bitField0_", "headerAsset_", "header_", "content_", "autoTransitionDelayMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.class) {
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

            public final int getAutoTransitionDelayMs() {
                return this.autoTransitionDelayMs_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getContent() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.content_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getHeader() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.header_;
                return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getHeaderAsset() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
                return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public final boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasHeader() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasHeaderAsset() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.content_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.content_ = common$TextContent;
                } else {
                    this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.header_;
                if (common$TextContent2 == null || common$TextContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
                    this.header_ = common$TextContent;
                } else {
                    this.header_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.header_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering endOfFlowSuccessPaneRendering) {
                return DEFAULT_INSTANCE.createBuilder(endOfFlowSuccessPaneRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.content_ = common$TextContent;
                this.bitField0_ |= 4;
            }

            private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
                this.header_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                this.headerAsset_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_EDIT_PROFILE_IDENTIFIER_FIELD_NUMBER = 7;
            public static final int ON_MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP_FIELD_NUMBER = 6;
            public static final int ON_PANE_BODY_ADORNMENT_BUTTON_TAP_FIELD_NUMBER = 4;
            public static final int ON_PROFILE_CHIP_OPTION_SELECT_FIELD_NUMBER = 9;
            public static final int ON_RECEIVE_FIELD_NUMBER = 8;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_TAP_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onSubmitTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onSecondaryButtonTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onPaneBodyAdornmentButtonTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onModalFlexibleComponentsButtonOneTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onEditProfileIdentifier_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onReceive_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onProfileChipOptionSelect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.class, events);
            }

            private Events() {
            }

            private void addAllOnAppear(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnAppearIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onAppear_);
            }

            private void addAllOnEditProfileIdentifier(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnEditProfileIdentifierIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onEditProfileIdentifier_);
            }

            private void addAllOnModalFlexibleComponentsButtonOneTap(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onModalFlexibleComponentsButtonOneTap_);
            }

            private void addAllOnPaneBodyAdornmentButtonTap(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onPaneBodyAdornmentButtonTap_);
            }

            private void addAllOnProfileChipOptionSelect(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnProfileChipOptionSelectIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onProfileChipOptionSelect_);
            }

            private void addAllOnReceive(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnReceiveIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onReceive_);
            }

            private void addAllOnSecondaryButtonTap(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnSecondaryButtonTapIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onSecondaryButtonTap_);
            }

            private void addAllOnSubmitTap(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnSubmitTapIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onSubmitTap_);
            }

            private void clearOnAppear() {
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnEditProfileIdentifier() {
                this.onEditProfileIdentifier_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnModalFlexibleComponentsButtonOneTap() {
                this.onModalFlexibleComponentsButtonOneTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnPaneBodyAdornmentButtonTap() {
                this.onPaneBodyAdornmentButtonTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnProfileChipOptionSelect() {
                this.onProfileChipOptionSelect_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnReceive() {
                this.onReceive_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
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

            private void ensureOnEditProfileIdentifierIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onEditProfileIdentifier_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onEditProfileIdentifier_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnModalFlexibleComponentsButtonOneTapIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onModalFlexibleComponentsButtonOneTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onModalFlexibleComponentsButtonOneTap_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnPaneBodyAdornmentButtonTapIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onPaneBodyAdornmentButtonTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onPaneBodyAdornmentButtonTap_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnProfileChipOptionSelectIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onProfileChipOptionSelect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onProfileChipOptionSelect_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnReceiveIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onReceive_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onReceive_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSecondaryButtonTapIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onSecondaryButtonTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSecondaryButtonTap_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSubmitTapIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onSubmitTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSubmitTap_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            private void removeOnEditProfileIdentifier(int i) {
                ensureOnEditProfileIdentifierIsMutable();
                this.onEditProfileIdentifier_.remove(i);
            }

            private void removeOnModalFlexibleComponentsButtonOneTap(int i) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.remove(i);
            }

            private void removeOnPaneBodyAdornmentButtonTap(int i) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.remove(i);
            }

            private void removeOnProfileChipOptionSelect(int i) {
                ensureOnProfileChipOptionSelectIsMutable();
                this.onProfileChipOptionSelect_.remove(i);
            }

            private void removeOnReceive(int i) {
                ensureOnReceiveIsMutable();
                this.onReceive_.remove(i);
            }

            private void removeOnSecondaryButtonTap(int i) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.remove(i);
            }

            private void removeOnSubmitTap(int i) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\t\b\u0000\b\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onSubmitTap_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onSecondaryButtonTap_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onPaneBodyAdornmentButtonTap_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onModalFlexibleComponentsButtonOneTap_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onEditProfileIdentifier_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onReceive_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onProfileChipOptionSelect_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnEditProfileIdentifier(int i) {
                return this.onEditProfileIdentifier_.get(i);
            }

            public final int getOnEditProfileIdentifierCount() {
                return this.onEditProfileIdentifier_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnEditProfileIdentifierList() {
                return this.onEditProfileIdentifier_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnEditProfileIdentifierOrBuilder(int i) {
                return this.onEditProfileIdentifier_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnEditProfileIdentifierOrBuilderList() {
                return this.onEditProfileIdentifier_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnModalFlexibleComponentsButtonOneTap(int i) {
                return this.onModalFlexibleComponentsButtonOneTap_.get(i);
            }

            public final int getOnModalFlexibleComponentsButtonOneTapCount() {
                return this.onModalFlexibleComponentsButtonOneTap_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnModalFlexibleComponentsButtonOneTapList() {
                return this.onModalFlexibleComponentsButtonOneTap_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnModalFlexibleComponentsButtonOneTapOrBuilder(int i) {
                return this.onModalFlexibleComponentsButtonOneTap_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnModalFlexibleComponentsButtonOneTapOrBuilderList() {
                return this.onModalFlexibleComponentsButtonOneTap_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnPaneBodyAdornmentButtonTap(int i) {
                return this.onPaneBodyAdornmentButtonTap_.get(i);
            }

            public final int getOnPaneBodyAdornmentButtonTapCount() {
                return this.onPaneBodyAdornmentButtonTap_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnPaneBodyAdornmentButtonTapList() {
                return this.onPaneBodyAdornmentButtonTap_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnPaneBodyAdornmentButtonTapOrBuilder(int i) {
                return this.onPaneBodyAdornmentButtonTap_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnPaneBodyAdornmentButtonTapOrBuilderList() {
                return this.onPaneBodyAdornmentButtonTap_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnProfileChipOptionSelect(int i) {
                return this.onProfileChipOptionSelect_.get(i);
            }

            public final int getOnProfileChipOptionSelectCount() {
                return this.onProfileChipOptionSelect_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnProfileChipOptionSelectList() {
                return this.onProfileChipOptionSelect_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnProfileChipOptionSelectOrBuilder(int i) {
                return this.onProfileChipOptionSelect_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnProfileChipOptionSelectOrBuilderList() {
                return this.onProfileChipOptionSelect_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnReceive(int i) {
                return this.onReceive_.get(i);
            }

            public final int getOnReceiveCount() {
                return this.onReceive_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnReceiveList() {
                return this.onReceive_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnReceiveOrBuilder(int i) {
                return this.onReceive_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnReceiveOrBuilderList() {
                return this.onReceive_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSecondaryButtonTap(int i) {
                return this.onSecondaryButtonTap_.get(i);
            }

            public final int getOnSecondaryButtonTapCount() {
                return this.onSecondaryButtonTap_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnSecondaryButtonTapList() {
                return this.onSecondaryButtonTap_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnSecondaryButtonTapOrBuilder(int i) {
                return this.onSecondaryButtonTap_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnSecondaryButtonTapOrBuilderList() {
                return this.onSecondaryButtonTap_;
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

            private void addOnEditProfileIdentifier(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnEditProfileIdentifierIsMutable();
                this.onEditProfileIdentifier_.add(common$SDKEvent);
            }

            private void addOnModalFlexibleComponentsButtonOneTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.add(common$SDKEvent);
            }

            private void addOnPaneBodyAdornmentButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.add(common$SDKEvent);
            }

            private void addOnProfileChipOptionSelect(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnProfileChipOptionSelectIsMutable();
                this.onProfileChipOptionSelect_.add(common$SDKEvent);
            }

            private void addOnReceive(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnReceiveIsMutable();
                this.onReceive_.add(common$SDKEvent);
            }

            private void addOnSecondaryButtonTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.add(common$SDKEvent);
            }

            private void addOnSubmitTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnEditProfileIdentifier(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnEditProfileIdentifierIsMutable();
                this.onEditProfileIdentifier_.set(i, common$SDKEvent);
            }

            private void setOnModalFlexibleComponentsButtonOneTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.set(i, common$SDKEvent);
            }

            private void setOnPaneBodyAdornmentButtonTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.set(i, common$SDKEvent);
            }

            private void setOnProfileChipOptionSelect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnProfileChipOptionSelectIsMutable();
                this.onProfileChipOptionSelect_.set(i, common$SDKEvent);
            }

            private void setOnReceive(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnReceiveIsMutable();
                this.onReceive_.set(i, common$SDKEvent);
            }

            private void setOnSecondaryButtonTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.set(i, common$SDKEvent);
            }

            private void setOnSubmitTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            private void addOnEditProfileIdentifier(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnEditProfileIdentifierIsMutable();
                this.onEditProfileIdentifier_.add(i, common$SDKEvent);
            }

            private void addOnModalFlexibleComponentsButtonOneTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.add(i, common$SDKEvent);
            }

            private void addOnPaneBodyAdornmentButtonTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.add(i, common$SDKEvent);
            }

            private void addOnProfileChipOptionSelect(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnProfileChipOptionSelectIsMutable();
                this.onProfileChipOptionSelect_.add(i, common$SDKEvent);
            }

            private void addOnReceive(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnReceiveIsMutable();
                this.onReceive_.add(i, common$SDKEvent);
            }

            private void addOnSecondaryButtonTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.add(i, common$SDKEvent);
            }

            private void addOnSubmitTap(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Link2025EmptyLoadingPaneRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int AUTO_TRANSITION_DELAY_MS_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering> PARSER;
            private int autoTransitionDelayMs_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering link2025EmptyLoadingPaneRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering();
                DEFAULT_INSTANCE = link2025EmptyLoadingPaneRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.class, link2025EmptyLoadingPaneRendering);
            }

            private Link2025EmptyLoadingPaneRendering() {
            }

            private void clearAutoTransitionDelayMs() {
                this.autoTransitionDelayMs_ = 0;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAutoTransitionDelayMs(int i) {
                this.autoTransitionDelayMs_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"autoTransitionDelayMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.class) {
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

            public final int getAutoTransitionDelayMs() {
                return this.autoTransitionDelayMs_;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering link2025EmptyLoadingPaneRendering) {
                return DEFAULT_INSTANCE.createBuilder(link2025EmptyLoadingPaneRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Link2025OTPEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BUTTON_FIELD_NUMBER = 5;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering DEFAULT_INSTANCE;
            public static final int PANE_BRANDING_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering> PARSER = null;
            public static final int PROFILE_CHIP_FIELD_NUMBER = 2;
            public static final int PROMPT_FIELD_NUMBER = 4;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private int paneBranding_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip profileChip_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt prompt_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText title_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering link2025OTPEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering();
                DEFAULT_INSTANCE = link2025OTPEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.class, link2025OTPEntryRendering);
            }

            private Link2025OTPEntryRendering() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearPaneBranding() {
                this.paneBranding_ = 0;
            }

            private void clearProfileChip() {
                this.profileChip_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearTitle() {
                this.title_ = null;
                this.bitField0_ &= -3;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPaneBranding(com.plaid.internal.core.protos.link.workflow.nodes.panes.I i) {
                this.paneBranding_ = i.getNumber();
            }

            private void setPaneBrandingValue(int i) {
                this.paneBranding_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new java.lang.Object[]{"bitField0_", "paneBranding_", "profileChip_", "title_", "prompt_", "button_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.I getPaneBranding() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.I forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.I.forNumber(this.paneBranding_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.I.UNRECOGNIZED : forNumber;
            }

            public final int getPaneBrandingValue() {
                return this.paneBranding_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip getProfileChip() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip = this.profileChip_;
                return common$ProfileChip == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.getDefaultInstance() : common$ProfileChip;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText getTitle() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText = this.title_;
                return common$TwoToneText == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.getDefaultInstance() : common$TwoToneText;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasProfileChip() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasTitle() {
                return (this.bitField0_ & 2) != 0;
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

            private void mergeProfileChip(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip2 = this.profileChip_;
                if (common$ProfileChip2 == null || common$ProfileChip2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.getDefaultInstance()) {
                    this.profileChip_ = common$ProfileChip;
                } else {
                    this.profileChip_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.newBuilder(this.profileChip_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.a) common$ProfileChip).buildPartial();
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
                this.bitField0_ |= 4;
            }

            private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText2 = this.title_;
                if (common$TwoToneText2 == null || common$TwoToneText2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.getDefaultInstance()) {
                    this.title_ = common$TwoToneText;
                } else {
                    this.title_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.b) common$TwoToneText).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering link2025OTPEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(link2025OTPEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setProfileChip(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip) {
                this.profileChip_ = common$ProfileChip;
                this.bitField0_ |= 1;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText) {
                this.title_ = common$TwoToneText;
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Link2025PhoneEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BODY_FIELD_NUMBER = 4;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 6;
            public static final int BUTTON_FIELD_NUMBER = 5;
            public static final int CO_BRANDED_ASSET_FIELD_NUMBER = 2;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering DEFAULT_INSTANCE;
            public static final int PANE_BRANDING_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering> PARSER = null;
            public static final int PROFILE_CHIP_FIELD_NUMBER = 8;
            public static final int PROMPT_FIELD_NUMBER = 7;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 9;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString body_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString buttonDisclaimerText_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance coBrandedAsset_;
            private int contentCase_ = 0;
            private java.lang.Object content_;
            private int paneBranding_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText title_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            public enum b {
                PROMPT(7),
                PROFILE_CHIP(8),
                CONTENT_NOT_SET(0);


                /* renamed from: a, reason: collision with root package name */
                public final int f6238a;

                b(int i) {
                    this.f6238a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.b forNumber(int i) {
                    if (i == 0) {
                        return CONTENT_NOT_SET;
                    }
                    if (i == 7) {
                        return PROMPT;
                    }
                    if (i != 8) {
                        return null;
                    }
                    return PROFILE_CHIP;
                }

                public final int getNumber() {
                    return this.f6238a;
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering link2025PhoneEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering();
                DEFAULT_INSTANCE = link2025PhoneEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.class, link2025PhoneEntryRendering);
            }

            private Link2025PhoneEntryRendering() {
            }

            private void clearBody() {
                this.body_ = null;
                this.bitField0_ &= -5;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -33;
            }

            private void clearCoBrandedAsset() {
                this.coBrandedAsset_ = null;
                this.bitField0_ &= -2;
            }

            private void clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
            }

            private void clearPaneBranding() {
                this.paneBranding_ = 0;
            }

            private void clearProfileChip() {
                if (this.contentCase_ == 8) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearPrompt() {
                if (this.contentCase_ == 7) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            private void clearTitle() {
                this.title_ = null;
                this.bitField0_ &= -3;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPaneBranding(com.plaid.internal.core.protos.link.workflow.nodes.panes.I i) {
                this.paneBranding_ = i.getNumber();
            }

            private void setPaneBrandingValue(int i) {
                this.paneBranding_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0005\u0007<\u0000\b<\u0000\tဉ\u0004", new java.lang.Object[]{"content_", "contentCase_", "bitField0_", "paneBranding_", "coBrandedAsset_", "title_", "body_", "button_", "buttonDisclaimerText_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.class, "secondaryButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getBody() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.body_;
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getCoBrandedAsset() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.coBrandedAsset_;
                return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.b getContentCase() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.b.forNumber(this.contentCase_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.I getPaneBranding() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.I forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.I.forNumber(this.paneBranding_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.I.UNRECOGNIZED : forNumber;
            }

            public final int getPaneBrandingValue() {
                return this.paneBranding_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip getProfileChip() {
                return this.contentCase_ == 8 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) this.content_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompt() {
                return this.contentCase_ == 7 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) this.content_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText getTitle() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText = this.title_;
                return common$TwoToneText == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.getDefaultInstance() : common$TwoToneText;
            }

            public final boolean hasBody() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 32) != 0;
            }

            public final boolean hasCoBrandedAsset() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasProfileChip() {
                return this.contentCase_ == 8;
            }

            public final boolean hasPrompt() {
                return this.contentCase_ == 7;
            }

            public final boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public final boolean hasTitle() {
                return (this.bitField0_ & 2) != 0;
            }

            private void mergeBody(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.body_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.body_ = common$AttributedLocalizedString;
                } else {
                    this.body_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.body_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 4;
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

            private void mergeButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                } else {
                    this.buttonDisclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeCoBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.coBrandedAsset_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.coBrandedAsset_ = common$RenderedAssetAppearance;
                } else {
                    this.coBrandedAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.coBrandedAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeProfileChip(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip) {
                if (this.contentCase_ != 8 || this.content_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.getDefaultInstance()) {
                    this.content_ = common$ProfileChip;
                } else {
                    this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.a) common$ProfileChip).buildPartial();
                }
                this.contentCase_ = 8;
            }

            private void mergePrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                if (this.contentCase_ != 7 || this.content_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.getDefaultInstance()) {
                    this.content_ = common$Prompt;
                } else {
                    this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a) common$Prompt).buildPartial();
                }
                this.contentCase_ = 7;
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

            private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText2 = this.title_;
                if (common$TwoToneText2 == null || common$TwoToneText2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.getDefaultInstance()) {
                    this.title_ = common$TwoToneText;
                } else {
                    this.title_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.b) common$TwoToneText).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering link2025PhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(link2025PhoneEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setBody(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.body_ = common$AttributedLocalizedString;
                this.bitField0_ |= 4;
            }

            private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setButtonDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 32;
            }

            private void setCoBrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                this.coBrandedAsset_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 1;
            }

            private void setProfileChip(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip) {
                this.content_ = common$ProfileChip;
                this.contentCase_ = 8;
            }

            private void setPrompt(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
                this.content_ = common$Prompt;
                this.contentCase_ = 7;
            }

            private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText) {
                this.title_ = common$TwoToneText;
                this.bitField0_ |= 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OTPEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int CO_BRANDED_OTP_RENDERING_FIELD_NUMBER = 2;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering DEFAULT_INSTANCE;
            public static final int DEFAULT_OTP_RENDERING_FIELD_NUMBER = 1;
            public static final int LINK_2025_OTP_RENDERING_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering> PARSER;
            private int formatCase_ = 0;
            private java.lang.Object format_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.DEFAULT_INSTANCE);
                }
            }

            public enum b {
                DEFAULT_OTP_RENDERING(1),
                CO_BRANDED_OTP_RENDERING(2),
                LINK_2025_OTP_RENDERING(3),
                FORMAT_NOT_SET(0);


                /* renamed from: a, reason: collision with root package name */
                public final int f6239a;

                b(int i) {
                    this.f6239a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.b forNumber(int i) {
                    if (i == 0) {
                        return FORMAT_NOT_SET;
                    }
                    if (i == 1) {
                        return DEFAULT_OTP_RENDERING;
                    }
                    if (i == 2) {
                        return CO_BRANDED_OTP_RENDERING;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return LINK_2025_OTP_RENDERING;
                }

                public final int getNumber() {
                    return this.f6239a;
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering oTPEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering();
                DEFAULT_INSTANCE = oTPEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.class, oTPEntryRendering);
            }

            private OTPEntryRendering() {
            }

            private void clearCoBrandedOtpRendering() {
                if (this.formatCase_ == 2) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearDefaultOtpRendering() {
                if (this.formatCase_ == 1) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearFormat() {
                this.formatCase_ = 0;
                this.format_ = null;
            }

            private void clearLink2025OtpRendering() {
                if (this.formatCase_ == 3) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"format_", "formatCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering getCoBrandedOtpRendering() {
                return this.formatCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering getDefaultOtpRendering() {
                return this.formatCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.b getFormatCase() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.b.forNumber(this.formatCase_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering getLink2025OtpRendering() {
                return this.formatCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.getDefaultInstance();
            }

            public final boolean hasCoBrandedOtpRendering() {
                return this.formatCase_ == 2;
            }

            public final boolean hasDefaultOtpRendering() {
                return this.formatCase_ == 1;
            }

            public final boolean hasLink2025OtpRendering() {
                return this.formatCase_ == 3;
            }

            private void mergeCoBrandedOtpRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering coBrandedOTPEntryRendering) {
                if (this.formatCase_ != 2 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.getDefaultInstance()) {
                    this.format_ = coBrandedOTPEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering.a) coBrandedOTPEntryRendering).buildPartial();
                }
                this.formatCase_ = 2;
            }

            private void mergeDefaultOtpRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering defaultOTPEntryRendering) {
                if (this.formatCase_ != 1 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.getDefaultInstance()) {
                    this.format_ = defaultOTPEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering.a) defaultOTPEntryRendering).buildPartial();
                }
                this.formatCase_ = 1;
            }

            private void mergeLink2025OtpRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering link2025OTPEntryRendering) {
                if (this.formatCase_ != 3 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.getDefaultInstance()) {
                    this.format_ = link2025OTPEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering.a) link2025OTPEntryRendering).buildPartial();
                }
                this.formatCase_ = 3;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering oTPEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(oTPEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setCoBrandedOtpRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedOTPEntryRendering coBrandedOTPEntryRendering) {
                this.format_ = coBrandedOTPEntryRendering;
                this.formatCase_ = 2;
            }

            private void setDefaultOtpRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultOTPEntryRendering defaultOTPEntryRendering) {
                this.format_ = defaultOTPEntryRendering;
                this.formatCase_ = 1;
            }

            private void setLink2025OtpRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025OTPEntryRendering link2025OTPEntryRendering) {
                this.format_ = link2025OTPEntryRendering;
                this.formatCase_ = 3;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PasskeyAuthenticationRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering passkeyAuthenticationRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering();
                DEFAULT_INSTANCE = passkeyAuthenticationRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.class, passkeyAuthenticationRendering);
            }

            private PasskeyAuthenticationRendering() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering passkeyAuthenticationRendering) {
                return DEFAULT_INSTANCE.createBuilder(passkeyAuthenticationRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PasskeyCreationRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering passkeyCreationRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering();
                DEFAULT_INSTANCE = passkeyCreationRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.class, passkeyCreationRendering);
            }

            private PasskeyCreationRendering() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering passkeyCreationRendering) {
                return DEFAULT_INSTANCE.createBuilder(passkeyCreationRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ProfileIdentifierEntryRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int COMBINED_CONSENT_AND_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 6;
            public static final int CO_BRANDED_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 4;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering DEFAULT_INSTANCE;
            public static final int DEFAULT_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 1;
            public static final int END_OF_FLOW_EMAIL_ENTRY_RENDERING_FIELD_NUMBER = 5;
            public static final int END_OF_FLOW_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 2;
            public static final int LINK_2025_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering> PARSER;
            private int formatCase_ = 0;
            private java.lang.Object format_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.DEFAULT_INSTANCE);
                }
            }

            public enum b {
                DEFAULT_PHONE_ENTRY_RENDERING(1),
                END_OF_FLOW_PHONE_ENTRY_RENDERING(2),
                LINK_2025_PHONE_ENTRY_RENDERING(3),
                CO_BRANDED_PHONE_ENTRY_RENDERING(4),
                END_OF_FLOW_EMAIL_ENTRY_RENDERING(5),
                COMBINED_CONSENT_AND_PHONE_ENTRY_RENDERING(6),
                FORMAT_NOT_SET(0);


                /* renamed from: a, reason: collision with root package name */
                public final int f6240a;

                b(int i) {
                    this.f6240a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.b forNumber(int i) {
                    switch (i) {
                        case 0:
                            return FORMAT_NOT_SET;
                        case 1:
                            return DEFAULT_PHONE_ENTRY_RENDERING;
                        case 2:
                            return END_OF_FLOW_PHONE_ENTRY_RENDERING;
                        case 3:
                            return LINK_2025_PHONE_ENTRY_RENDERING;
                        case 4:
                            return CO_BRANDED_PHONE_ENTRY_RENDERING;
                        case 5:
                            return END_OF_FLOW_EMAIL_ENTRY_RENDERING;
                        case 6:
                            return COMBINED_CONSENT_AND_PHONE_ENTRY_RENDERING;
                        default:
                            return null;
                    }
                }

                public final int getNumber() {
                    return this.f6240a;
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering profileIdentifierEntryRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering();
                DEFAULT_INSTANCE = profileIdentifierEntryRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.class, profileIdentifierEntryRendering);
            }

            private ProfileIdentifierEntryRendering() {
            }

            private void clearCoBrandedPhoneEntryRendering() {
                if (this.formatCase_ == 4) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearCombinedConsentAndPhoneEntryRendering() {
                if (this.formatCase_ == 6) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearDefaultPhoneEntryRendering() {
                if (this.formatCase_ == 1) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearEndOfFlowEmailEntryRendering() {
                if (this.formatCase_ == 5) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearEndOfFlowPhoneEntryRendering() {
                if (this.formatCase_ == 2) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearFormat() {
                this.formatCase_ = 0;
                this.format_ = null;
            }

            private void clearLink2025PhoneEntryRendering() {
                if (this.formatCase_ == 3) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new java.lang.Object[]{"format_", "formatCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering getCoBrandedPhoneEntryRendering() {
                return this.formatCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering getCombinedConsentAndPhoneEntryRendering() {
                return this.formatCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering getDefaultPhoneEntryRendering() {
                return this.formatCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering getEndOfFlowEmailEntryRendering() {
                return this.formatCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering getEndOfFlowPhoneEntryRendering() {
                return this.formatCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.b getFormatCase() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.b.forNumber(this.formatCase_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering getLink2025PhoneEntryRendering() {
                return this.formatCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.getDefaultInstance();
            }

            public final boolean hasCoBrandedPhoneEntryRendering() {
                return this.formatCase_ == 4;
            }

            public final boolean hasCombinedConsentAndPhoneEntryRendering() {
                return this.formatCase_ == 6;
            }

            public final boolean hasDefaultPhoneEntryRendering() {
                return this.formatCase_ == 1;
            }

            public final boolean hasEndOfFlowEmailEntryRendering() {
                return this.formatCase_ == 5;
            }

            public final boolean hasEndOfFlowPhoneEntryRendering() {
                return this.formatCase_ == 2;
            }

            public final boolean hasLink2025PhoneEntryRendering() {
                return this.formatCase_ == 3;
            }

            private void mergeCoBrandedPhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering coBrandedPhoneEntryRendering) {
                if (this.formatCase_ != 4 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = coBrandedPhoneEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering.a) coBrandedPhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 4;
            }

            private void mergeCombinedConsentAndPhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering combinedConsentAndPhoneEntryRendering) {
                if (this.formatCase_ != 6 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = combinedConsentAndPhoneEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering.a) combinedConsentAndPhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 6;
            }

            private void mergeDefaultPhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering defaultPhoneEntryRendering) {
                if (this.formatCase_ != 1 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = defaultPhoneEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering.a) defaultPhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 1;
            }

            private void mergeEndOfFlowEmailEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering endOfFlowEmailEntryRendering) {
                if (this.formatCase_ != 5 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.getDefaultInstance()) {
                    this.format_ = endOfFlowEmailEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering.a) endOfFlowEmailEntryRendering).buildPartial();
                }
                this.formatCase_ = 5;
            }

            private void mergeEndOfFlowPhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering endOfFlowPhoneEntryRendering) {
                if (this.formatCase_ != 2 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = endOfFlowPhoneEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering.a) endOfFlowPhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 2;
            }

            private void mergeLink2025PhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering link2025PhoneEntryRendering) {
                if (this.formatCase_ != 3 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = link2025PhoneEntryRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering.a) link2025PhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 3;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering profileIdentifierEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(profileIdentifierEntryRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setCoBrandedPhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedPhoneEntryRendering coBrandedPhoneEntryRendering) {
                this.format_ = coBrandedPhoneEntryRendering;
                this.formatCase_ = 4;
            }

            private void setCombinedConsentAndPhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CombinedConsentAndPhoneEntryRendering combinedConsentAndPhoneEntryRendering) {
                this.format_ = combinedConsentAndPhoneEntryRendering;
                this.formatCase_ = 6;
            }

            private void setDefaultPhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.DefaultPhoneEntryRendering defaultPhoneEntryRendering) {
                this.format_ = defaultPhoneEntryRendering;
                this.formatCase_ = 1;
            }

            private void setEndOfFlowEmailEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowEmailEntryRendering endOfFlowEmailEntryRendering) {
                this.format_ = endOfFlowEmailEntryRendering;
                this.formatCase_ = 5;
            }

            private void setEndOfFlowPhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowPhoneEntryRendering endOfFlowPhoneEntryRendering) {
                this.format_ = endOfFlowPhoneEntryRendering;
                this.formatCase_ = 2;
            }

            private void setLink2025PhoneEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025PhoneEntryRendering link2025PhoneEntryRendering) {
                this.format_ = link2025PhoneEntryRendering;
                this.formatCase_ = 3;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SilentNetworkAuthenticationRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering silentNetworkAuthenticationRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering();
                DEFAULT_INSTANCE = silentNetworkAuthenticationRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.class, silentNetworkAuthenticationRendering);
            }

            private SilentNetworkAuthenticationRendering() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering silentNetworkAuthenticationRendering) {
                return DEFAULT_INSTANCE.createBuilder(silentNetworkAuthenticationRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TransientRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BYPASS_PHONE_NUMBER_WARNING_RENDERING_FIELD_NUMBER = 1;
            public static final int CO_BRANDED_LOADING_PANE_RENDERING_FIELD_NUMBER = 3;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering DEFAULT_INSTANCE;
            public static final int END_OF_FLOW_SUCCESS_PANE_RENDERING_FIELD_NUMBER = 4;
            public static final int LINK_2025_EMPTY_LOADING_PANE_RENDERING_FIELD_NUMBER = 5;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering> PARSER = null;
            public static final int SILENT_NETWORK_AUTHENTICATION_RENDERING_FIELD_NUMBER = 2;
            private int formatCase_ = 0;
            private java.lang.Object format_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.DEFAULT_INSTANCE);
                }
            }

            public enum b {
                BYPASS_PHONE_NUMBER_WARNING_RENDERING(1),
                SILENT_NETWORK_AUTHENTICATION_RENDERING(2),
                CO_BRANDED_LOADING_PANE_RENDERING(3),
                END_OF_FLOW_SUCCESS_PANE_RENDERING(4),
                LINK_2025_EMPTY_LOADING_PANE_RENDERING(5),
                FORMAT_NOT_SET(0);


                /* renamed from: a, reason: collision with root package name */
                public final int f6241a;

                b(int i) {
                    this.f6241a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.b forNumber(int i) {
                    if (i == 0) {
                        return FORMAT_NOT_SET;
                    }
                    if (i == 1) {
                        return BYPASS_PHONE_NUMBER_WARNING_RENDERING;
                    }
                    if (i == 2) {
                        return SILENT_NETWORK_AUTHENTICATION_RENDERING;
                    }
                    if (i == 3) {
                        return CO_BRANDED_LOADING_PANE_RENDERING;
                    }
                    if (i == 4) {
                        return END_OF_FLOW_SUCCESS_PANE_RENDERING;
                    }
                    if (i != 5) {
                        return null;
                    }
                    return LINK_2025_EMPTY_LOADING_PANE_RENDERING;
                }

                public final int getNumber() {
                    return this.f6241a;
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering transientRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering();
                DEFAULT_INSTANCE = transientRendering;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.class, transientRendering);
            }

            private TransientRendering() {
            }

            private void clearBypassPhoneNumberWarningRendering() {
                if (this.formatCase_ == 1) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearCoBrandedLoadingPaneRendering() {
                if (this.formatCase_ == 3) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearEndOfFlowSuccessPaneRendering() {
                if (this.formatCase_ == 4) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearFormat() {
                this.formatCase_ = 0;
                this.format_ = null;
            }

            private void clearLink2025EmptyLoadingPaneRendering() {
                if (this.formatCase_ == 5) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearSilentNetworkAuthenticationRendering() {
                if (this.formatCase_ == 2) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new java.lang.Object[]{"format_", "formatCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering getBypassPhoneNumberWarningRendering() {
                return this.formatCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering getCoBrandedLoadingPaneRendering() {
                return this.formatCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering getEndOfFlowSuccessPaneRendering() {
                return this.formatCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.b getFormatCase() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.b.forNumber(this.formatCase_);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering getLink2025EmptyLoadingPaneRendering() {
                return this.formatCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.getDefaultInstance();
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering getSilentNetworkAuthenticationRendering() {
                return this.formatCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) this.format_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.getDefaultInstance();
            }

            public final boolean hasBypassPhoneNumberWarningRendering() {
                return this.formatCase_ == 1;
            }

            public final boolean hasCoBrandedLoadingPaneRendering() {
                return this.formatCase_ == 3;
            }

            public final boolean hasEndOfFlowSuccessPaneRendering() {
                return this.formatCase_ == 4;
            }

            public final boolean hasLink2025EmptyLoadingPaneRendering() {
                return this.formatCase_ == 5;
            }

            public final boolean hasSilentNetworkAuthenticationRendering() {
                return this.formatCase_ == 2;
            }

            private void mergeBypassPhoneNumberWarningRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering bypassPhoneNumberWarningRendering) {
                if (this.formatCase_ != 1 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.getDefaultInstance()) {
                    this.format_ = bypassPhoneNumberWarningRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering.a) bypassPhoneNumberWarningRendering).buildPartial();
                }
                this.formatCase_ = 1;
            }

            private void mergeCoBrandedLoadingPaneRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering coBrandedLoadingPaneRendering) {
                if (this.formatCase_ != 3 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.getDefaultInstance()) {
                    this.format_ = coBrandedLoadingPaneRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering.a) coBrandedLoadingPaneRendering).buildPartial();
                }
                this.formatCase_ = 3;
            }

            private void mergeEndOfFlowSuccessPaneRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering endOfFlowSuccessPaneRendering) {
                if (this.formatCase_ != 4 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.getDefaultInstance()) {
                    this.format_ = endOfFlowSuccessPaneRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering.a) endOfFlowSuccessPaneRendering).buildPartial();
                }
                this.formatCase_ = 4;
            }

            private void mergeLink2025EmptyLoadingPaneRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering link2025EmptyLoadingPaneRendering) {
                if (this.formatCase_ != 5 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.getDefaultInstance()) {
                    this.format_ = link2025EmptyLoadingPaneRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering.a) link2025EmptyLoadingPaneRendering).buildPartial();
                }
                this.formatCase_ = 5;
            }

            private void mergeSilentNetworkAuthenticationRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering silentNetworkAuthenticationRendering) {
                if (this.formatCase_ != 2 || this.format_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.getDefaultInstance()) {
                    this.format_ = silentNetworkAuthenticationRendering;
                } else {
                    this.format_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering) this.format_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering.a) silentNetworkAuthenticationRendering).buildPartial();
                }
                this.formatCase_ = 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering transientRendering) {
                return DEFAULT_INSTANCE.createBuilder(transientRendering);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setBypassPhoneNumberWarningRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.BypassPhoneNumberWarningRendering bypassPhoneNumberWarningRendering) {
                this.format_ = bypassPhoneNumberWarningRendering;
                this.formatCase_ = 1;
            }

            private void setCoBrandedLoadingPaneRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.CoBrandedLoadingPaneRendering coBrandedLoadingPaneRendering) {
                this.format_ = coBrandedLoadingPaneRendering;
                this.formatCase_ = 3;
            }

            private void setEndOfFlowSuccessPaneRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.EndOfFlowSuccessPaneRendering endOfFlowSuccessPaneRendering) {
                this.format_ = endOfFlowSuccessPaneRendering;
                this.formatCase_ = 4;
            }

            private void setLink2025EmptyLoadingPaneRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Link2025EmptyLoadingPaneRendering link2025EmptyLoadingPaneRendering) {
                this.format_ = link2025EmptyLoadingPaneRendering;
                this.formatCase_ = 5;
            }

            private void setSilentNetworkAuthenticationRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.SilentNetworkAuthenticationRendering silentNetworkAuthenticationRendering) {
                this.format_ = silentNetworkAuthenticationRendering;
                this.formatCase_ = 2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            PROFILE_IDENTIFIER_ENTRY_RENDERING(1),
            OTP_ENTRY_RENDERING(2),
            PASSKEY_CREATION_RENDERING(3),
            PASSKEY_AUTHENTICATION_RENDERING(4),
            TRANSIENT_RENDERING(5),
            AUTHENTICATIONSTEP_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6242a;

            a(int i) {
                this.f6242a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.a forNumber(int i) {
                if (i == 0) {
                    return AUTHENTICATIONSTEP_NOT_SET;
                }
                if (i == 1) {
                    return PROFILE_IDENTIFIER_ENTRY_RENDERING;
                }
                if (i == 2) {
                    return OTP_ENTRY_RENDERING;
                }
                if (i == 3) {
                    return PASSKEY_CREATION_RENDERING;
                }
                if (i == 4) {
                    return PASSKEY_AUTHENTICATION_RENDERING;
                }
                if (i != 5) {
                    return null;
                }
                return TRANSIENT_RENDERING;
            }

            public final int getNumber() {
                return this.f6242a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearAuthenticationStep() {
            this.authenticationStepCase_ = 0;
            this.authenticationStep_ = null;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearOtpEntryRendering() {
            if (this.authenticationStepCase_ == 2) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearPaneBranding() {
            this.paneBranding_ = 0;
        }

        private void clearPasskeyAuthenticationRendering() {
            if (this.authenticationStepCase_ == 4) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearPasskeyCreationRendering() {
            if (this.authenticationStepCase_ == 3) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearProfileIdentifierEntryRendering() {
            if (this.authenticationStepCase_ == 1) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearTransientRendering() {
            if (this.authenticationStepCase_ == 5) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearUsePaneControlledLogic() {
            this.usePaneControlledLogic_ = false;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneBranding(com.plaid.internal.core.protos.link.workflow.nodes.panes.I i) {
            this.paneBranding_ = i.getNumber();
        }

        private void setPaneBrandingValue(int i) {
            this.paneBranding_ = i;
        }

        private void setUsePaneControlledLogic(boolean z) {
            this.usePaneControlledLogic_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\u0013\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0011ဉ\u0000\u0012\u0007\u0013\f", new java.lang.Object[]{"authenticationStep_", "authenticationStepCase_", "bitField0_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.class, "events_", "usePaneControlledLogic_", "paneBranding_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.a getAuthenticationStepCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.a.forNumber(this.authenticationStepCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering getOtpEntryRendering() {
            return this.authenticationStepCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) this.authenticationStep_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.I getPaneBranding() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.I forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.I.forNumber(this.paneBranding_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.I.UNRECOGNIZED : forNumber;
        }

        public final int getPaneBrandingValue() {
            return this.paneBranding_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering getPasskeyAuthenticationRendering() {
            return this.authenticationStepCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) this.authenticationStep_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering getPasskeyCreationRendering() {
            return this.authenticationStepCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) this.authenticationStep_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering getProfileIdentifierEntryRendering() {
            return this.authenticationStepCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) this.authenticationStep_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering getTransientRendering() {
            return this.authenticationStepCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) this.authenticationStep_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.getDefaultInstance();
        }

        public final boolean getUsePaneControlledLogic() {
            return this.usePaneControlledLogic_;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasOtpEntryRendering() {
            return this.authenticationStepCase_ == 2;
        }

        public final boolean hasPasskeyAuthenticationRendering() {
            return this.authenticationStepCase_ == 4;
        }

        public final boolean hasPasskeyCreationRendering() {
            return this.authenticationStepCase_ == 3;
        }

        public final boolean hasProfileIdentifierEntryRendering() {
            return this.authenticationStepCase_ == 1;
        }

        public final boolean hasTransientRendering() {
            return this.authenticationStepCase_ == 5;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeOtpEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering oTPEntryRendering) {
            if (this.authenticationStepCase_ != 2 || this.authenticationStep_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.getDefaultInstance()) {
                this.authenticationStep_ = oTPEntryRendering;
            } else {
                this.authenticationStep_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering) this.authenticationStep_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering.a) oTPEntryRendering).buildPartial();
            }
            this.authenticationStepCase_ = 2;
        }

        private void mergePasskeyAuthenticationRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering passkeyAuthenticationRendering) {
            if (this.authenticationStepCase_ != 4 || this.authenticationStep_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.getDefaultInstance()) {
                this.authenticationStep_ = passkeyAuthenticationRendering;
            } else {
                this.authenticationStep_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering) this.authenticationStep_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering.a) passkeyAuthenticationRendering).buildPartial();
            }
            this.authenticationStepCase_ = 4;
        }

        private void mergePasskeyCreationRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering passkeyCreationRendering) {
            if (this.authenticationStepCase_ != 3 || this.authenticationStep_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.getDefaultInstance()) {
                this.authenticationStep_ = passkeyCreationRendering;
            } else {
                this.authenticationStep_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering) this.authenticationStep_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering.a) passkeyCreationRendering).buildPartial();
            }
            this.authenticationStepCase_ = 3;
        }

        private void mergeProfileIdentifierEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering profileIdentifierEntryRendering) {
            if (this.authenticationStepCase_ != 1 || this.authenticationStep_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.getDefaultInstance()) {
                this.authenticationStep_ = profileIdentifierEntryRendering;
            } else {
                this.authenticationStep_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering) this.authenticationStep_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering.a) profileIdentifierEntryRendering).buildPartial();
            }
            this.authenticationStepCase_ = 1;
        }

        private void mergeTransientRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering transientRendering) {
            if (this.authenticationStepCase_ != 5 || this.authenticationStep_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.getDefaultInstance()) {
                this.authenticationStep_ = transientRendering;
            } else {
                this.authenticationStep_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering) this.authenticationStep_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering.a) transientRendering).buildPartial();
            }
            this.authenticationStepCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        private void setOtpEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.OTPEntryRendering oTPEntryRendering) {
            this.authenticationStep_ = oTPEntryRendering;
            this.authenticationStepCase_ = 2;
        }

        private void setPasskeyAuthenticationRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyAuthenticationRendering passkeyAuthenticationRendering) {
            this.authenticationStep_ = passkeyAuthenticationRendering;
            this.authenticationStepCase_ = 4;
        }

        private void setPasskeyCreationRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.PasskeyCreationRendering passkeyCreationRendering) {
            this.authenticationStep_ = passkeyCreationRendering;
            this.authenticationStepCase_ = 3;
        }

        private void setProfileIdentifierEntryRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.ProfileIdentifierEntryRendering profileIdentifierEntryRendering) {
            this.authenticationStep_ = profileIdentifierEntryRendering;
            this.authenticationStepCase_ = 1;
        }

        private void setTransientRendering(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.TransientRendering transientRendering) {
            this.authenticationStep_ = transientRendering;
            this.authenticationStepCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum a implements com.google.protobuf.Internal.EnumLite {
        ANIMATION_UNKNOWN(0),
        ANIMATION_LOGO_INTRODUCTION(1),
        ANIMATION_MESSAGE_TRANSITION(2),
        UNRECOGNIZED(-1);

        public static final int ANIMATION_LOGO_INTRODUCTION_VALUE = 1;
        public static final int ANIMATION_MESSAGE_TRANSITION_VALUE = 2;
        public static final int ANIMATION_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a.C0190a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a.C0190a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6243a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$a$a, reason: collision with other inner class name */
        public final class C0190a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.a.b f6244a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.a.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a.forNumber(i) != null;
            }
        }

        a(int i) {
            this.f6243a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a forNumber(int i) {
            if (i == 0) {
                return ANIMATION_UNKNOWN;
            }
            if (i == 1) {
                return ANIMATION_LOGO_INTRODUCTION;
            }
            if (i != 2) {
                return null;
            }
            return ANIMATION_MESSAGE_TRANSITION;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.a.b.f6244a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6243a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.a valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public b() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane profileAuthenticationPaneOuterClass$ProfileAuthenticationPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane();
        DEFAULT_INSTANCE = profileAuthenticationPaneOuterClass$ProfileAuthenticationPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.class, profileAuthenticationPaneOuterClass$ProfileAuthenticationPane);
    }

    private ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.q0.f6322a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.b();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane profileAuthenticationPaneOuterClass$ProfileAuthenticationPane) {
        return DEFAULT_INSTANCE.createBuilder(profileAuthenticationPaneOuterClass$ProfileAuthenticationPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
