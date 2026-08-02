package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class SearchAndSelectPaneOuterClass$SearchAndSelectPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        public static final int TAP_END_OF_RESULTS_FIELD_NUMBER = 4;
        public static final int TAP_FIXED_BUTTON_FIELD_NUMBER = 6;
        public static final int TAP_NO_RESULTS_FIELD_NUMBER = 2;
        public static final int TAP_SELECT_UNSUPPORTED_INSTITUTION_HANDOFF_BUTTON_FIELD_NUMBER = 5;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction> PARSER = null;
            public static final int SELECTED_ID_FIELD_NUMBER = 1;
            private java.lang.String selectedId_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void clearSelectedId() {
                this.selectedId_ = getDefaultInstance().getSelectedId();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setSelectedIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.selectedId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"selectedId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.class) {
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

            public final java.lang.String getSelectedId() {
                return this.selectedId_;
            }

            public final com.google.protobuf.ByteString getSelectedIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.selectedId_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setSelectedId(java.lang.String str) {
                this.selectedId_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TapEndOfResultsAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction tapEndOfResultsAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction();
                DEFAULT_INSTANCE = tapEndOfResultsAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.class, tapEndOfResultsAction);
            }

            private TapEndOfResultsAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction tapEndOfResultsAction) {
                return DEFAULT_INSTANCE.createBuilder(tapEndOfResultsAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TapFixedButtonAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction tapFixedButtonAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction();
                DEFAULT_INSTANCE = tapFixedButtonAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.class, tapFixedButtonAction);
            }

            private TapFixedButtonAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction tapFixedButtonAction) {
                return DEFAULT_INSTANCE.createBuilder(tapFixedButtonAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TapNoResultsAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction tapNoResultsAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction();
                DEFAULT_INSTANCE = tapNoResultsAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.class, tapNoResultsAction);
            }

            private TapNoResultsAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction tapNoResultsAction) {
                return DEFAULT_INSTANCE.createBuilder(tapNoResultsAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TapSelectUnsupportedInstitutionHandoffButtonAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response response_;

            public static final class Response extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response> PARSER = null;
                public static final int SELECTED_ID_FIELD_NUMBER = 1;
                private java.lang.String selectedId_ = "";

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response response = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response();
                    DEFAULT_INSTANCE = response;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.class, response);
                }

                private Response() {
                }

                private void clearSelectedId() {
                    this.selectedId_ = getDefaultInstance().getSelectedId();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setSelectedIdBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.selectedId_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"selectedId_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.class) {
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

                public final java.lang.String getSelectedId() {
                    return this.selectedId_;
                }

                public final com.google.protobuf.ByteString getSelectedIdBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.selectedId_);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response response) {
                    return DEFAULT_INSTANCE.createBuilder(response);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setSelectedId(java.lang.String str) {
                    this.selectedId_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction tapSelectUnsupportedInstitutionHandoffButtonAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction();
                DEFAULT_INSTANCE = tapSelectUnsupportedInstitutionHandoffButtonAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.class, tapSelectUnsupportedInstitutionHandoffButtonAction);
            }

            private TapSelectUnsupportedInstitutionHandoffButtonAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response getResponse() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response response = this.response_;
                return response == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.getDefaultInstance() : response;
            }

            public final boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response response) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response response2 = this.response_;
                if (response2 == null || response2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.newBuilder(this.response_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response.a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction tapSelectUnsupportedInstitutionHandoffButtonAction) {
                return DEFAULT_INSTANCE.createBuilder(tapSelectUnsupportedInstitutionHandoffButtonAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.Response response) {
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            TAP_NO_RESULTS(2),
            EXIT(3),
            TAP_END_OF_RESULTS(4),
            TAP_SELECT_UNSUPPORTED_INSTITUTION_HANDOFF_BUTTON(5),
            TAP_FIXED_BUTTON(6),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6248a;

            a(int i) {
                this.f6248a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.a forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return SUBMIT;
                    case 2:
                        return TAP_NO_RESULTS;
                    case 3:
                        return EXIT;
                    case 4:
                        return TAP_END_OF_RESULTS;
                    case 5:
                        return TAP_SELECT_UNSUPPORTED_INSTITUTION_HANDOFF_BUTTON;
                    case 6:
                        return TAP_FIXED_BUTTON;
                    default:
                        return null;
                }
            }

            public final int getNumber() {
                return this.f6248a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.DEFAULT_INSTANCE);
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.b a(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction exitAction) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) this.instance).setExit(exitAction);
                return this;
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearExit() {
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

        private void clearTapEndOfResults() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTapFixedButton() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTapNoResults() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTapSelectUnsupportedInstitutionHandoffButton() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction getTapEndOfResults() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction getTapFixedButton() {
            return this.actionCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction getTapNoResults() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction getTapSelectUnsupportedInstitutionHandoffButton() {
            return this.actionCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.getDefaultInstance();
        }

        public final boolean hasExit() {
            return this.actionCase_ == 3;
        }

        public final boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public final boolean hasTapEndOfResults() {
            return this.actionCase_ == 4;
        }

        public final boolean hasTapFixedButton() {
            return this.actionCase_ == 6;
        }

        public final boolean hasTapNoResults() {
            return this.actionCase_ == 2;
        }

        public final boolean hasTapSelectUnsupportedInstitutionHandoffButton() {
            return this.actionCase_ == 5;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeTapEndOfResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction tapEndOfResultsAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.getDefaultInstance()) {
                this.action_ = tapEndOfResultsAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction.a) tapEndOfResultsAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeTapFixedButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction tapFixedButtonAction) {
            if (this.actionCase_ != 6 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.getDefaultInstance()) {
                this.action_ = tapFixedButtonAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction.a) tapFixedButtonAction).buildPartial();
            }
            this.actionCase_ = 6;
        }

        private void mergeTapNoResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction tapNoResultsAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.getDefaultInstance()) {
                this.action_ = tapNoResultsAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction.a) tapNoResultsAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeTapSelectUnsupportedInstitutionHandoffButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction tapSelectUnsupportedInstitutionHandoffButtonAction) {
            if (this.actionCase_ != 5 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.getDefaultInstance()) {
                this.action_ = tapSelectUnsupportedInstitutionHandoffButtonAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction.a) tapSelectUnsupportedInstitutionHandoffButtonAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 3;
        }

        private void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        private void setTapEndOfResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapEndOfResultsAction tapEndOfResultsAction) {
            this.action_ = tapEndOfResultsAction;
            this.actionCase_ = 4;
        }

        private void setTapFixedButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapFixedButtonAction tapFixedButtonAction) {
            this.action_ = tapFixedButtonAction;
            this.actionCase_ = 6;
        }

        private void setTapNoResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapNoResultsAction tapNoResultsAction) {
            this.action_ = tapNoResultsAction;
            this.actionCase_ = 2;
        }

        private void setTapSelectUnsupportedInstitutionHandoffButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.TapSelectUnsupportedInstitutionHandoffButtonAction tapSelectUnsupportedInstitutionHandoffButtonAction) {
            this.action_ = tapSelectUnsupportedInstitutionHandoffButtonAction;
            this.actionCase_ = 5;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering DEFAULT_INSTANCE;
        public static final int END_OF_RESULTS_BUTTON_FIELD_NUMBER = 14;
        public static final int END_OF_RESULTS_BUTTON_TEXT_FIELD_NUMBER = 15;
        public static final int END_OF_RESULTS_TEXT_BUTTON_FIELD_NUMBER = 23;
        public static final int EVENTS_FIELD_NUMBER = 12;
        public static final int FIXED_BUTTON_FIELD_NUMBER = 24;
        public static final int INCREMENTAL_RESULTS_FIELD_NUMBER = 18;
        public static final int INITIAL_ITEMS_FIELD_NUMBER = 1;
        public static final int LIST_STYLE_FIELD_NUMBER = 22;
        public static final int ON_SUBMIT_OVERRIDE_ITEMS_FIELD_NUMBER = 13;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering> PARSER = null;
        public static final int PREVIEW_MODE_FIELD_NUMBER = 19;
        public static final int SEARCH_API_FIELD_NUMBER = 2;
        public static final int SEARCH_BEHAVIOR_FIELD_NUMBER = 16;
        public static final int SEARCH_INPUT_FIELD_NUMBER = 17;
        public static final int SEARCH_NO_RESULTS_BUTTON_FIELD_NUMBER = 5;
        public static final int SEARCH_NO_RESULTS_FIELD_NUMBER = 4;
        public static final int SHOULD_TRIM_INSTITUTION_NAME_FIELD_NUMBER = 26;
        public static final int SHOULD_USE_CONDENSED_SEARCH_UI_FIELD_NUMBER = 20;
        public static final int SHOULD_USE_SEARCH_LOADING_SPINNER_FIELD_NUMBER = 21;
        public static final int SHOW_BRAND_PANE_SEARCH_BAR_FIELD_NUMBER = 25;
        public static final int TITLE_FIELD_NUMBER = 3;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString endOfResultsButtonText_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent endOfResultsButton_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent endOfResultsTextButton_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent fixedButton_;
        private int listStyle_;
        private int previewMode_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI searchApi_;
        private int searchBehavior_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput searchInput_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent searchNoResultsButton_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString searchNoResults_;
        private boolean shouldTrimInstitutionName_;
        private boolean shouldUseCondensedSearchUi_;
        private boolean shouldUseSearchLoadingSpinner_;
        private boolean showBrandPaneSearchBar_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> initialItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> incrementalResults_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> onSubmitOverrideItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SEARCH_FIELD_NUMBER = 2;
            public static final int ON_SUBMIT_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_OVERRIDE_FIELD_NUMBER = 5;
            public static final int ON_TAP_END_OF_RESULTS_FIELD_NUMBER = 6;
            public static final int ON_TAP_FIXED_BUTTON_FIELD_NUMBER = 9;
            public static final int ON_TAP_NO_RESULTS_FIELD_NUMBER = 4;
            public static final int ON_TAP_RESULT_WITH_CHILDREN_FIELD_NUMBER = 7;
            public static final int ON_TAP_SELECT_UNSUPPORTED_INSTITUTION_HANDOFF_BUTTON_FIELD_NUMBER = 8;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events> PARSER;
            private int bitField0_;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSearch_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSubmitOverride_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSubmit_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onTapEndOfResults_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onTapFixedButton_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onTapNoResults_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onTapResultWithChildren_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onTapSelectUnsupportedInstitutionHandoffButton_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.class, events);
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

            private void clearOnSearch() {
                this.onSearch_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnSubmit() {
                this.onSubmit_ = null;
                this.bitField0_ &= -3;
            }

            private void clearOnSubmitOverride() {
                this.onSubmitOverride_ = null;
                this.bitField0_ &= -9;
            }

            private void clearOnTapEndOfResults() {
                this.onTapEndOfResults_ = null;
                this.bitField0_ &= -17;
            }

            private void clearOnTapFixedButton() {
                this.onTapFixedButton_ = null;
                this.bitField0_ &= -129;
            }

            private void clearOnTapNoResults() {
                this.onTapNoResults_ = null;
                this.bitField0_ &= -5;
            }

            private void clearOnTapResultWithChildren() {
                this.onTapResultWithChildren_ = null;
                this.bitField0_ &= -33;
            }

            private void clearOnTapSelectUnsupportedInstitutionHandoffButton() {
                this.onTapSelectUnsupportedInstitutionHandoffButton_ = null;
                this.bitField0_ &= -65;
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007", new java.lang.Object[]{"bitField0_", "onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class, "onSearch_", "onSubmit_", "onTapNoResults_", "onSubmitOverride_", "onTapEndOfResults_", "onTapResultWithChildren_", "onTapSelectUnsupportedInstitutionHandoffButton_", "onTapFixedButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSearch() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSearch_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSubmit() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSubmit_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSubmitOverride() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSubmitOverride_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnTapEndOfResults() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onTapEndOfResults_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnTapFixedButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onTapFixedButton_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnTapNoResults() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onTapNoResults_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnTapResultWithChildren() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onTapResultWithChildren_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnTapSelectUnsupportedInstitutionHandoffButton() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onTapSelectUnsupportedInstitutionHandoffButton_;
                return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public final boolean hasOnSearch() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasOnSubmit() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasOnSubmitOverride() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasOnTapEndOfResults() {
                return (this.bitField0_ & 16) != 0;
            }

            public final boolean hasOnTapFixedButton() {
                return (this.bitField0_ & 128) != 0;
            }

            public final boolean hasOnTapNoResults() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasOnTapResultWithChildren() {
                return (this.bitField0_ & 32) != 0;
            }

            public final boolean hasOnTapSelectUnsupportedInstitutionHandoffButton() {
                return (this.bitField0_ & 64) != 0;
            }

            private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void mergeOnSearch(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSearch_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onSearch_ = common$SDKEvent;
                } else {
                    this.onSearch_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSearch_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeOnSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSubmit_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmit_ = common$SDKEvent;
                } else {
                    this.onSubmit_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSubmit_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeOnSubmitOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSubmitOverride_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmitOverride_ = common$SDKEvent;
                } else {
                    this.onSubmitOverride_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSubmitOverride_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeOnTapEndOfResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onTapEndOfResults_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onTapEndOfResults_ = common$SDKEvent;
                } else {
                    this.onTapEndOfResults_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onTapEndOfResults_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeOnTapFixedButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onTapFixedButton_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onTapFixedButton_ = common$SDKEvent;
                } else {
                    this.onTapFixedButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onTapFixedButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 128;
            }

            private void mergeOnTapNoResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onTapNoResults_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onTapNoResults_ = common$SDKEvent;
                } else {
                    this.onTapNoResults_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onTapNoResults_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeOnTapResultWithChildren(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onTapResultWithChildren_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onTapResultWithChildren_ = common$SDKEvent;
                } else {
                    this.onTapResultWithChildren_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onTapResultWithChildren_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeOnTapSelectUnsupportedInstitutionHandoffButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onTapSelectUnsupportedInstitutionHandoffButton_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
                    this.onTapSelectUnsupportedInstitutionHandoffButton_ = common$SDKEvent;
                } else {
                    this.onTapSelectUnsupportedInstitutionHandoffButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onTapSelectUnsupportedInstitutionHandoffButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnSearch(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSearch_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSubmit_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            private void setOnSubmitOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onSubmitOverride_ = common$SDKEvent;
                this.bitField0_ |= 8;
            }

            private void setOnTapEndOfResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onTapEndOfResults_ = common$SDKEvent;
                this.bitField0_ |= 16;
            }

            private void setOnTapFixedButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onTapFixedButton_ = common$SDKEvent;
                this.bitField0_ |= 128;
            }

            private void setOnTapNoResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onTapNoResults_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            private void setOnTapResultWithChildren(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onTapResultWithChildren_ = common$SDKEvent;
                this.bitField0_ |= 32;
            }

            private void setOnTapSelectUnsupportedInstitutionHandoffButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                this.onTapSelectUnsupportedInstitutionHandoffButton_ = common$SDKEvent;
                this.bitField0_ |= 64;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SearchAPI extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI DEFAULT_INSTANCE;
            public static final int EXTRA_HEADERS_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI> PARSER = null;
            public static final int POST_BODY_FIELD_NUMBER = 2;
            public static final int POST_BODY_QUERY_REPLACEMENT_TOKEN_FIELD_NUMBER = 3;
            public static final int RESPONSE_RESULTS_JSON_KEY_FIELD_NUMBER = 5;
            public static final int RESPONSE_RESULT_ITEM_KEY_PATH_MAPPING_FIELD_NUMBER = 6;
            public static final int URL_PATH_FIELD_NUMBER = 1;
            private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> extraHeaders_ = com.google.protobuf.MapFieldLite.emptyMapField();
            private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> responseResultItemKeyPathMapping_ = com.google.protobuf.MapFieldLite.emptyMapField();
            private java.lang.String urlPath_ = "";
            private java.lang.String postBody_ = "";
            private java.lang.String postBodyQueryReplacementToken_ = "";
            private java.lang.String responseResultsJsonKey_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.DEFAULT_INSTANCE);
                }
            }

            public static final class b {

                /* renamed from: a, reason: collision with root package name */
                public static final com.google.protobuf.MapEntryLite<java.lang.String, java.lang.String> f6249a;

                static {
                    com.google.protobuf.WireFormat.FieldType fieldType = com.google.protobuf.WireFormat.FieldType.STRING;
                    f6249a = com.google.protobuf.MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
                }
            }

            public static final class c {

                /* renamed from: a, reason: collision with root package name */
                public static final com.google.protobuf.MapEntryLite<java.lang.String, java.lang.String> f6250a;

                static {
                    com.google.protobuf.WireFormat.FieldType fieldType = com.google.protobuf.WireFormat.FieldType.STRING;
                    f6250a = com.google.protobuf.MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI searchAPI = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI();
                DEFAULT_INSTANCE = searchAPI;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.class, searchAPI);
            }

            private SearchAPI() {
            }

            private void clearPostBody() {
                this.postBody_ = getDefaultInstance().getPostBody();
            }

            private void clearPostBodyQueryReplacementToken() {
                this.postBodyQueryReplacementToken_ = getDefaultInstance().getPostBodyQueryReplacementToken();
            }

            private void clearResponseResultsJsonKey() {
                this.responseResultsJsonKey_ = getDefaultInstance().getResponseResultsJsonKey();
            }

            private void clearUrlPath() {
                this.urlPath_ = getDefaultInstance().getUrlPath();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private java.util.Map<java.lang.String, java.lang.String> getMutableExtraHeadersMap() {
                return internalGetMutableExtraHeaders();
            }

            private java.util.Map<java.lang.String, java.lang.String> getMutableResponseResultItemKeyPathMappingMap() {
                return internalGetMutableResponseResultItemKeyPathMapping();
            }

            private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetExtraHeaders() {
                return this.extraHeaders_;
            }

            private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetMutableExtraHeaders() {
                if (!this.extraHeaders_.isMutable()) {
                    this.extraHeaders_ = this.extraHeaders_.mutableCopy();
                }
                return this.extraHeaders_;
            }

            private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetMutableResponseResultItemKeyPathMapping() {
                if (!this.responseResultItemKeyPathMapping_.isMutable()) {
                    this.responseResultItemKeyPathMapping_ = this.responseResultItemKeyPathMapping_.mutableCopy();
                }
                return this.responseResultItemKeyPathMapping_;
            }

            private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetResponseResultItemKeyPathMapping() {
                return this.responseResultItemKeyPathMapping_;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPostBodyBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.postBody_ = byteString.toStringUtf8();
            }

            private void setPostBodyQueryReplacementTokenBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.postBodyQueryReplacementToken_ = byteString.toStringUtf8();
            }

            private void setResponseResultsJsonKeyBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.responseResultsJsonKey_ = byteString.toStringUtf8();
            }

            private void setUrlPathBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.urlPath_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0002\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042\u0005Ȉ\u00062", new java.lang.Object[]{"urlPath_", "postBody_", "postBodyQueryReplacementToken_", "extraHeaders_", com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.b.f6249a, "responseResultsJsonKey_", "responseResultItemKeyPathMapping_", com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.c.f6250a});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.class) {
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
            public final java.util.Map<java.lang.String, java.lang.String> getExtraHeaders() {
                return getExtraHeadersMap();
            }

            public final int getExtraHeadersCount() {
                return internalGetExtraHeaders().size();
            }

            public final java.util.Map<java.lang.String, java.lang.String> getExtraHeadersMap() {
                return java.util.Collections.unmodifiableMap(internalGetExtraHeaders());
            }

            public final java.lang.String getPostBody() {
                return this.postBody_;
            }

            public final com.google.protobuf.ByteString getPostBodyBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.postBody_);
            }

            public final java.lang.String getPostBodyQueryReplacementToken() {
                return this.postBodyQueryReplacementToken_;
            }

            public final com.google.protobuf.ByteString getPostBodyQueryReplacementTokenBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.postBodyQueryReplacementToken_);
            }

            @java.lang.Deprecated
            public final java.util.Map<java.lang.String, java.lang.String> getResponseResultItemKeyPathMapping() {
                return getResponseResultItemKeyPathMappingMap();
            }

            public final int getResponseResultItemKeyPathMappingCount() {
                return internalGetResponseResultItemKeyPathMapping().size();
            }

            public final java.util.Map<java.lang.String, java.lang.String> getResponseResultItemKeyPathMappingMap() {
                return java.util.Collections.unmodifiableMap(internalGetResponseResultItemKeyPathMapping());
            }

            public final java.lang.String getResponseResultsJsonKey() {
                return this.responseResultsJsonKey_;
            }

            public final com.google.protobuf.ByteString getResponseResultsJsonKeyBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.responseResultsJsonKey_);
            }

            public final java.lang.String getUrlPath() {
                return this.urlPath_;
            }

            public final com.google.protobuf.ByteString getUrlPathBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.urlPath_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI searchAPI) {
                return DEFAULT_INSTANCE.createBuilder(searchAPI);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public final boolean containsExtraHeaders(java.lang.String str) {
                return internalGetExtraHeaders().containsKey(str);
            }

            public final boolean containsResponseResultItemKeyPathMapping(java.lang.String str) {
                return internalGetResponseResultItemKeyPathMapping().containsKey(str);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setPostBody(java.lang.String str) {
                this.postBody_ = str;
            }

            private void setPostBodyQueryReplacementToken(java.lang.String str) {
                this.postBodyQueryReplacementToken_ = str;
            }

            private void setResponseResultsJsonKey(java.lang.String str) {
                this.responseResultsJsonKey_ = str;
            }

            private void setUrlPath(java.lang.String str) {
                this.urlPath_ = str;
            }

            public final java.lang.String getExtraHeadersOrDefault(java.lang.String str, java.lang.String str2) {
                com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetExtraHeaders = internalGetExtraHeaders();
                return internalGetExtraHeaders.containsKey(str) ? internalGetExtraHeaders.get(str) : str2;
            }

            public final java.lang.String getExtraHeadersOrThrow(java.lang.String str) {
                com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetExtraHeaders = internalGetExtraHeaders();
                if (internalGetExtraHeaders.containsKey(str)) {
                    return internalGetExtraHeaders.get(str);
                }
                throw new java.lang.IllegalArgumentException();
            }

            public final java.lang.String getResponseResultItemKeyPathMappingOrDefault(java.lang.String str, java.lang.String str2) {
                com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetResponseResultItemKeyPathMapping = internalGetResponseResultItemKeyPathMapping();
                return internalGetResponseResultItemKeyPathMapping.containsKey(str) ? internalGetResponseResultItemKeyPathMapping.get(str) : str2;
            }

            public final java.lang.String getResponseResultItemKeyPathMappingOrThrow(java.lang.String str) {
                com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetResponseResultItemKeyPathMapping = internalGetResponseResultItemKeyPathMapping();
                if (internalGetResponseResultItemKeyPathMapping.containsKey(str)) {
                    return internalGetResponseResultItemKeyPathMapping.get(str);
                }
                throw new java.lang.IllegalArgumentException();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public enum b implements com.google.protobuf.Internal.EnumLite {
            LIST_STYLE_DEFAULT(0),
            LIST_STYLE_BETA_WALLET_ONBOARD_CONDENSED(1),
            UNRECOGNIZED(-1);

            public static final int LIST_STYLE_BETA_WALLET_ONBOARD_CONDENSED_VALUE = 1;
            public static final int LIST_STYLE_DEFAULT_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6251a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$b$b, reason: collision with other inner class name */
            public static final class C0191b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.C0191b f6252a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.C0191b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f6251a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b forNumber(int i) {
                if (i == 0) {
                    return LIST_STYLE_DEFAULT;
                }
                if (i != 1) {
                    return null;
                }
                return LIST_STYLE_BETA_WALLET_ONBOARD_CONDENSED;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.C0191b.f6252a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6251a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum c implements com.google.protobuf.Internal.EnumLite {
            PREVIEW_MODE_UNKNOWN(0),
            PREVIEW_MODE_NO_RESULTS(1),
            UNRECOGNIZED(-1);

            public static final int PREVIEW_MODE_NO_RESULTS_VALUE = 1;
            public static final int PREVIEW_MODE_UNKNOWN_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6253a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.b f6254a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f6253a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c forNumber(int i) {
                if (i == 0) {
                    return PREVIEW_MODE_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return PREVIEW_MODE_NO_RESULTS;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.b.f6254a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6253a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllIncrementalResults(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> iterable) {
            ensureIncrementalResultsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.incrementalResults_);
        }

        private void addAllInitialItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> iterable) {
            ensureInitialItemsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.initialItems_);
        }

        private void addAllOnSubmitOverrideItems(java.lang.Iterable<java.lang.String> iterable) {
            ensureOnSubmitOverrideItemsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onSubmitOverrideItems_);
        }

        private void addOnSubmitOverrideItemsBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.add(byteString.toStringUtf8());
        }

        private void clearEndOfResultsButton() {
            this.endOfResultsButton_ = null;
            this.bitField0_ &= -33;
        }

        private void clearEndOfResultsButtonText() {
            this.endOfResultsButtonText_ = null;
            this.bitField0_ &= -65;
        }

        private void clearEndOfResultsTextButton() {
            this.endOfResultsTextButton_ = null;
            this.bitField0_ &= -257;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -129;
        }

        private void clearFixedButton() {
            this.fixedButton_ = null;
            this.bitField0_ &= -513;
        }

        private void clearIncrementalResults() {
            this.incrementalResults_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearInitialItems() {
            this.initialItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearListStyle() {
            this.listStyle_ = 0;
        }

        private void clearOnSubmitOverrideItems() {
            this.onSubmitOverrideItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearPreviewMode() {
            this.previewMode_ = 0;
        }

        private void clearSearchApi() {
            this.searchApi_ = null;
            this.bitField0_ &= -2;
        }

        private void clearSearchBehavior() {
            this.searchBehavior_ = 0;
        }

        private void clearSearchInput() {
            this.searchInput_ = null;
            this.bitField0_ &= -5;
        }

        private void clearSearchNoResults() {
            this.searchNoResults_ = null;
            this.bitField0_ &= -9;
        }

        private void clearSearchNoResultsButton() {
            this.searchNoResultsButton_ = null;
            this.bitField0_ &= -17;
        }

        private void clearShouldTrimInstitutionName() {
            this.shouldTrimInstitutionName_ = false;
        }

        private void clearShouldUseCondensedSearchUi() {
            this.shouldUseCondensedSearchUi_ = false;
        }

        private void clearShouldUseSearchLoadingSpinner() {
            this.shouldUseSearchLoadingSpinner_ = false;
        }

        private void clearShowBrandPaneSearchBar() {
            this.showBrandPaneSearchBar_ = false;
        }

        private void clearTitle() {
            this.title_ = null;
            this.bitField0_ &= -3;
        }

        private void ensureIncrementalResultsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> protobufList = this.incrementalResults_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.incrementalResults_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureInitialItemsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> protobufList = this.initialItems_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.initialItems_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureOnSubmitOverrideItemsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.onSubmitOverrideItems_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.onSubmitOverrideItems_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeIncrementalResults(int i) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.remove(i);
        }

        private void removeInitialItems(int i) {
            ensureInitialItemsIsMutable();
            this.initialItems_.remove(i);
        }

        private void setListStyle(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b bVar) {
            this.listStyle_ = bVar.getNumber();
        }

        private void setListStyleValue(int i) {
            this.listStyle_ = i;
        }

        private void setPreviewMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c cVar) {
            this.previewMode_ = cVar.getNumber();
        }

        private void setPreviewModeValue(int i) {
            this.previewMode_ = i;
        }

        private void setSearchBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.N n) {
            this.searchBehavior_ = n.getNumber();
        }

        private void setSearchBehaviorValue(int i) {
            this.searchBehavior_ = i;
        }

        private void setShouldTrimInstitutionName(boolean z) {
            this.shouldTrimInstitutionName_ = z;
        }

        private void setShouldUseCondensedSearchUi(boolean z) {
            this.shouldUseCondensedSearchUi_ = z;
        }

        private void setShouldUseSearchLoadingSpinner(boolean z) {
            this.shouldUseSearchLoadingSpinner_ = z;
        }

        private void setShowBrandPaneSearchBar(boolean z) {
            this.showBrandPaneSearchBar_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u001a\u0014\u0000\u0003\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\fဉ\u0007\rȚ\u000eဉ\u0005\u000fဉ\u0006\u0010\f\u0011ဉ\u0002\u0012\u001b\u0013\f\u0014\u0007\u0015\u0007\u0016\f\u0017ဉ\b\u0018ဉ\t\u0019\u0007\u001a\u0007", new java.lang.Object[]{"bitField0_", "initialItems_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.class, "searchApi_", "title_", "searchNoResults_", "searchNoResultsButton_", "events_", "onSubmitOverrideItems_", "endOfResultsButton_", "endOfResultsButtonText_", "searchBehavior_", "searchInput_", "incrementalResults_", com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.class, "previewMode_", "shouldUseCondensedSearchUi_", "shouldUseSearchLoadingSpinner_", "listStyle_", "endOfResultsTextButton_", "fixedButton_", "showBrandPaneSearchBar_", "shouldTrimInstitutionName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getEndOfResultsButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.endOfResultsButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getEndOfResultsButtonText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.endOfResultsButtonText_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getEndOfResultsTextButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.endOfResultsTextButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getFixedButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.fixedButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem getInitialItems(int i) {
            return this.initialItems_.get(i);
        }

        public final int getInitialItemsCount() {
            return this.initialItems_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> getInitialItemsList() {
            return this.initialItems_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.A getInitialItemsOrBuilder(int i) {
            return this.initialItems_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.A> getInitialItemsOrBuilderList() {
            return this.initialItems_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b getListStyle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.forNumber(this.listStyle_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.b.UNRECOGNIZED : forNumber;
        }

        public final int getListStyleValue() {
            return this.listStyle_;
        }

        public final java.lang.String getOnSubmitOverrideItems(int i) {
            return this.onSubmitOverrideItems_.get(i);
        }

        public final com.google.protobuf.ByteString getOnSubmitOverrideItemsBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.onSubmitOverrideItems_.get(i));
        }

        public final int getOnSubmitOverrideItemsCount() {
            return this.onSubmitOverrideItems_.size();
        }

        public final java.util.List<java.lang.String> getOnSubmitOverrideItemsList() {
            return this.onSubmitOverrideItems_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c getPreviewMode() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.forNumber(this.previewMode_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.c.UNRECOGNIZED : forNumber;
        }

        public final int getPreviewModeValue() {
            return this.previewMode_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI getSearchApi() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI searchAPI = this.searchApi_;
            return searchAPI == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.getDefaultInstance() : searchAPI;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.N getSearchBehavior() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.N forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.N.forNumber(this.searchBehavior_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.N.UNRECOGNIZED : forNumber;
        }

        public final int getSearchBehaviorValue() {
            return this.searchBehavior_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput getSearchInput() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput common$SearchInput = this.searchInput_;
            return common$SearchInput == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.getDefaultInstance() : common$SearchInput;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getSearchNoResults() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.searchNoResults_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSearchNoResultsButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.searchNoResultsButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final boolean getShouldTrimInstitutionName() {
            return this.shouldTrimInstitutionName_;
        }

        public final boolean getShouldUseCondensedSearchUi() {
            return this.shouldUseCondensedSearchUi_;
        }

        public final boolean getShouldUseSearchLoadingSpinner() {
            return this.shouldUseSearchLoadingSpinner_;
        }

        public final boolean getShowBrandPaneSearchBar() {
            return this.showBrandPaneSearchBar_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final boolean hasEndOfResultsButton() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasEndOfResultsButtonText() {
            return (this.bitField0_ & 64) != 0;
        }

        public final boolean hasEndOfResultsTextButton() {
            return (this.bitField0_ & 256) != 0;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean hasFixedButton() {
            return (this.bitField0_ & 512) != 0;
        }

        public final boolean hasSearchApi() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasSearchInput() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasSearchNoResults() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasSearchNoResultsButton() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasTitle() {
            return (this.bitField0_ & 2) != 0;
        }

        private void addIncrementalResults(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.add(sdkIncrementalResult$SDKIncrementalResult);
        }

        private void addInitialItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
            ensureInitialItemsIsMutable();
            this.initialItems_.add(common$ListItem);
        }

        private void addOnSubmitOverrideItems(java.lang.String str) {
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.add(str);
        }

        private void mergeEndOfResultsButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.endOfResultsButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.endOfResultsButton_ = common$ButtonContent;
            } else {
                this.endOfResultsButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.endOfResultsButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeEndOfResultsButtonText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.endOfResultsButtonText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.endOfResultsButtonText_ = common$AttributedLocalizedString;
            } else {
                this.endOfResultsButtonText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.endOfResultsButtonText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeEndOfResultsTextButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.endOfResultsTextButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.endOfResultsTextButton_ = common$ButtonContent;
            } else {
                this.endOfResultsTextButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.endOfResultsTextButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeFixedButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.fixedButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.fixedButton_ = common$ButtonContent;
            } else {
                this.fixedButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.fixedButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeSearchApi(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI searchAPI) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI searchAPI2 = this.searchApi_;
            if (searchAPI2 == null || searchAPI2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.getDefaultInstance()) {
                this.searchApi_ = searchAPI;
            } else {
                this.searchApi_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.newBuilder(this.searchApi_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI.a) searchAPI).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeSearchInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput common$SearchInput) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput common$SearchInput2 = this.searchInput_;
            if (common$SearchInput2 == null || common$SearchInput2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.getDefaultInstance()) {
                this.searchInput_ = common$SearchInput;
            } else {
                this.searchInput_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.newBuilder(this.searchInput_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.a) common$SearchInput).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeSearchNoResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.searchNoResults_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.searchNoResults_ = common$LocalizedString;
            } else {
                this.searchNoResults_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.searchNoResults_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeSearchNoResultsButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.searchNoResultsButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.searchNoResultsButton_ = common$ButtonContent;
            } else {
                this.searchNoResultsButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.searchNoResultsButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.title_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.title_ = common$LocalizedString;
            } else {
                this.title_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEndOfResultsButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.endOfResultsButton_ = common$ButtonContent;
            this.bitField0_ |= 32;
        }

        private void setEndOfResultsButtonText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.endOfResultsButtonText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 64;
        }

        private void setEndOfResultsTextButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.endOfResultsTextButton_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 128;
        }

        private void setFixedButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.fixedButton_ = common$ButtonContent;
            this.bitField0_ |= 512;
        }

        private void setIncrementalResults(int i, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.set(i, sdkIncrementalResult$SDKIncrementalResult);
        }

        private void setInitialItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
            ensureInitialItemsIsMutable();
            this.initialItems_.set(i, common$ListItem);
        }

        private void setOnSubmitOverrideItems(int i, java.lang.String str) {
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.set(i, str);
        }

        private void setSearchApi(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.SearchAPI searchAPI) {
            this.searchApi_ = searchAPI;
            this.bitField0_ |= 1;
        }

        private void setSearchInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput common$SearchInput) {
            this.searchInput_ = common$SearchInput;
            this.bitField0_ |= 4;
        }

        private void setSearchNoResults(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.searchNoResults_ = common$LocalizedString;
            this.bitField0_ |= 8;
        }

        private void setSearchNoResultsButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.searchNoResultsButton_ = common$ButtonContent;
            this.bitField0_ |= 16;
        }

        private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.title_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addIncrementalResults(int i, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.add(i, sdkIncrementalResult$SDKIncrementalResult);
        }

        private void addInitialItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
            ensureInitialItemsIsMutable();
            this.initialItems_.add(i, common$ListItem);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane searchAndSelectPaneOuterClass$SearchAndSelectPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane();
        DEFAULT_INSTANCE = searchAndSelectPaneOuterClass$SearchAndSelectPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.class, searchAndSelectPaneOuterClass$SearchAndSelectPane);
    }

    private SearchAndSelectPaneOuterClass$SearchAndSelectPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.s0.f6326a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane searchAndSelectPaneOuterClass$SearchAndSelectPane) {
        return DEFAULT_INSTANCE.createBuilder(searchAndSelectPaneOuterClass$SearchAndSelectPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
