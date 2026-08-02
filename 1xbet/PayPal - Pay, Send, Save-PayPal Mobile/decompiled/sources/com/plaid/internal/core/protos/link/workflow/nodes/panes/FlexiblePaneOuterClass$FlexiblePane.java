package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class FlexiblePaneOuterClass$FlexiblePane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_ONE_TAP_FIELD_NUMBER = 1;
        public static final int BUTTON_THREE_TAP_FIELD_NUMBER = 3;
        public static final int BUTTON_TWO_TAP_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions> PARSER;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ButtonOneTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction buttonOneTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction();
                DEFAULT_INSTANCE = buttonOneTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.class, buttonOneTapAction);
            }

            private ButtonOneTapAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response getResponse() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response = this.response_;
                return response == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.getDefaultInstance() : response;
            }

            public final boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response2 = this.response_;
                if (response2 == null || response2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.newBuilder(this.response_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction buttonOneTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonOneTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response) {
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonThreeTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction buttonThreeTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction();
                DEFAULT_INSTANCE = buttonThreeTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.class, buttonThreeTapAction);
            }

            private ButtonThreeTapAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response getResponse() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response = this.response_;
                return response == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.getDefaultInstance() : response;
            }

            public final boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response2 = this.response_;
                if (response2 == null || response2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.newBuilder(this.response_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction buttonThreeTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonThreeTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response) {
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonTwoTapAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction buttonTwoTapAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction();
                DEFAULT_INSTANCE = buttonTwoTapAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.class, buttonTwoTapAction);
            }

            private ButtonTwoTapAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response getResponse() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response = this.response_;
                return response == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.getDefaultInstance() : response;
            }

            public final boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response2 = this.response_;
                if (response2 == null || response2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.newBuilder(this.response_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction buttonTwoTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTwoTapAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setResponse(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response) {
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Response extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int COMPONENT_ID_FIELD_NUMBER = 3;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response> PARSER = null;
            public static final int RAW_USER_INPUTS_FIELD_NUMBER = 1;
            private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> rawUserInputs_ = com.google.protobuf.MapFieldLite.emptyMapField();
            private java.lang.String componentId_ = "";

            public static final class RawInput extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> PARSER = null;
                public static final int TEXT_FIELD_NUMBER = 2;
                private int valueCase_ = 0;
                private java.lang.Object value_;

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.DEFAULT_INSTANCE);
                    }
                }

                public enum b {
                    TEXT(2),
                    VALUE_NOT_SET(0);


                    /* renamed from: a, reason: collision with root package name */
                    public final int f6196a;

                    b(int i) {
                        this.f6196a = i;
                    }

                    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.b forNumber(int i) {
                        if (i == 0) {
                            return VALUE_NOT_SET;
                        }
                        if (i != 2) {
                            return null;
                        }
                        return TEXT;
                    }

                    public final int getNumber() {
                        return this.f6196a;
                    }

                    @java.lang.Deprecated
                    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.b valueOf(int i) {
                        return forNumber(i);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput rawInput = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput();
                    DEFAULT_INSTANCE = rawInput;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.class, rawInput);
                }

                private RawInput() {
                }

                private void clearText() {
                    if (this.valueCase_ == 2) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearValue() {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setTextBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString.toStringUtf8();
                    this.valueCase_ = 2;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȼ\u0000", new java.lang.Object[]{"value_", "valueCase_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.class) {
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

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.b getValueCase() {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.b.forNumber(this.valueCase_);
                }

                public final boolean hasText() {
                    return this.valueCase_ == 2;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput rawInput) {
                    return DEFAULT_INSTANCE.createBuilder(rawInput);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                private void setText(java.lang.String str) {
                    this.valueCase_ = 2;
                    this.value_ = str;
                }

                public final java.lang.String getText() {
                    return this.valueCase_ == 2 ? (java.lang.String) this.value_ : "";
                }

                public final com.google.protobuf.ByteString getTextBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.valueCase_ == 2 ? (java.lang.String) this.value_ : "");
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.DEFAULT_INSTANCE);
                }
            }

            public static final class b {

                /* renamed from: a, reason: collision with root package name */
                public static final com.google.protobuf.MapEntryLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> f6197a = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput.getDefaultInstance());
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response();
                DEFAULT_INSTANCE = response;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.class, response);
            }

            private Response() {
            }

            private void clearComponentId() {
                this.componentId_ = getDefaultInstance().getComponentId();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> getMutableRawUserInputsMap() {
                return internalGetMutableRawUserInputs();
            }

            private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> internalGetMutableRawUserInputs() {
                if (!this.rawUserInputs_.isMutable()) {
                    this.rawUserInputs_ = this.rawUserInputs_.mutableCopy();
                }
                return this.rawUserInputs_;
            }

            private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> internalGetRawUserInputs() {
                return this.rawUserInputs_;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setComponentIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.componentId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0001\u0000\u0000\u00012\u0003Ȉ", new java.lang.Object[]{"rawUserInputs_", com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.b.f6197a, "componentId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.class) {
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

            @java.lang.Deprecated
            public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> getRawUserInputs() {
                return getRawUserInputsMap();
            }

            public final int getRawUserInputsCount() {
                return internalGetRawUserInputs().size();
            }

            public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> getRawUserInputsMap() {
                return java.util.Collections.unmodifiableMap(internalGetRawUserInputs());
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response response) {
                return DEFAULT_INSTANCE.createBuilder(response);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public final boolean containsRawUserInputs(java.lang.String str) {
                return internalGetRawUserInputs().containsKey(str);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setComponentId(java.lang.String str) {
                this.componentId_ = str;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput getRawUserInputsOrDefault(java.lang.String str, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput rawInput) {
                com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> internalGetRawUserInputs = internalGetRawUserInputs();
                return internalGetRawUserInputs.containsKey(str) ? internalGetRawUserInputs.get(str) : rawInput;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput getRawUserInputsOrThrow(java.lang.String str) {
                com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response.RawInput> internalGetRawUserInputs = internalGetRawUserInputs();
                if (internalGetRawUserInputs.containsKey(str)) {
                    return internalGetRawUserInputs.get(str);
                }
                throw new java.lang.IllegalArgumentException();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.Response) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            BUTTON_ONE_TAP(1),
            BUTTON_TWO_TAP(2),
            BUTTON_THREE_TAP(3),
            EXIT(4),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6198a;

            a(int i) {
                this.f6198a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return BUTTON_ONE_TAP;
                }
                if (i == 2) {
                    return BUTTON_TWO_TAP;
                }
                if (i == 3) {
                    return BUTTON_THREE_TAP;
                }
                if (i != 4) {
                    return null;
                }
                return EXIT;
            }

            public final int getNumber() {
                return this.f6198a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearButtonOneTap() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonThreeTap() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonTwoTap() {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction getButtonOneTap() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction getButtonThreeTap() {
            return this.actionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction getButtonTwoTap() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction getExit() {
            return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.getDefaultInstance();
        }

        public final boolean hasButtonOneTap() {
            return this.actionCase_ == 1;
        }

        public final boolean hasButtonThreeTap() {
            return this.actionCase_ == 3;
        }

        public final boolean hasButtonTwoTap() {
            return this.actionCase_ == 2;
        }

        public final boolean hasExit() {
            return this.actionCase_ == 4;
        }

        private void mergeButtonOneTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction buttonOneTapAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.getDefaultInstance()) {
                this.action_ = buttonOneTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction.a) buttonOneTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeButtonThreeTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction buttonThreeTapAction) {
            if (this.actionCase_ != 3 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.getDefaultInstance()) {
                this.action_ = buttonThreeTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction.a) buttonThreeTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeButtonTwoTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction buttonTwoTapAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.getDefaultInstance()) {
                this.action_ = buttonTwoTapAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction.a) buttonTwoTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButtonOneTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonOneTapAction buttonOneTapAction) {
            this.action_ = buttonOneTapAction;
            this.actionCase_ = 1;
        }

        private void setButtonThreeTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonThreeTapAction buttonThreeTapAction) {
            this.action_ = buttonThreeTapAction;
            this.actionCase_ = 3;
        }

        private void setButtonTwoTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ButtonTwoTapAction buttonTwoTapAction) {
            this.action_ = buttonTwoTapAction;
            this.actionCase_ = 2;
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 3;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering DEFAULT_INSTANCE;
        public static final int DEFAULT_LAYOUT_FIELD_NUMBER = 1;
        public static final int EVENTS_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering> PARSER;
        private int backgroundDisplayMode_;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events events_;
        private int layoutCase_ = 0;
        private java.lang.Object layout_;

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.class, events);
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Layout extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout> PARSER;

            public static final class Default extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default DEFAULT_INSTANCE;
                public static final int PANE_BODY_FIELD_NUMBER = 5;
                public static final int PANE_FOOTER_FIELD_NUMBER = 6;
                public static final int PANE_HEADER_FIELD_NUMBER = 4;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default> PARSER;
                private int bitField0_;
                private com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody paneBody_;
                private com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter paneFooter_;
                private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default r0 = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default();
                    DEFAULT_INSTANCE = r0;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.class, r0);
                }

                private Default() {
                }

                private void clearPaneBody() {
                    this.paneBody_ = null;
                    this.bitField0_ &= -3;
                }

                private void clearPaneFooter() {
                    this.paneFooter_ = null;
                    this.bitField0_ &= -5;
                }

                private void clearPaneHeader() {
                    this.paneHeader_ = null;
                    this.bitField0_ &= -2;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new java.lang.Object[]{"bitField0_", "paneHeader_", "paneBody_", "paneFooter_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.class) {
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

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody getPaneBody() {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody paneBody = this.paneBody_;
                    return paneBody == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.getDefaultInstance() : paneBody;
                }

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter getPaneFooter() {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter paneFooter = this.paneFooter_;
                    return paneFooter == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.getDefaultInstance() : paneFooter;
                }

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
                    return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
                }

                public final boolean hasPaneBody() {
                    return (this.bitField0_ & 2) != 0;
                }

                public final boolean hasPaneFooter() {
                    return (this.bitField0_ & 4) != 0;
                }

                public final boolean hasPaneHeader() {
                    return (this.bitField0_ & 1) != 0;
                }

                private void mergePaneBody(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody paneBody) {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody paneBody2 = this.paneBody_;
                    if (paneBody2 == null || paneBody2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.getDefaultInstance()) {
                        this.paneBody_ = paneBody;
                    } else {
                        this.paneBody_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.newBuilder(this.paneBody_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.a) paneBody).buildPartial();
                    }
                    this.bitField0_ |= 2;
                }

                private void mergePaneFooter(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter paneFooter) {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter paneFooter2 = this.paneFooter_;
                    if (paneFooter2 == null || paneFooter2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.getDefaultInstance()) {
                        this.paneFooter_ = paneFooter;
                    } else {
                        this.paneFooter_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.newBuilder(this.paneFooter_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.a) paneFooter).buildPartial();
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
                    this.bitField0_ |= 1;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default r1) {
                    return DEFAULT_INSTANCE.createBuilder(r1);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                private void setPaneBody(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody paneBody) {
                    this.paneBody_ = paneBody;
                    this.bitField0_ |= 2;
                }

                private void setPaneFooter(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter paneFooter) {
                    this.paneFooter_ = paneFooter;
                    this.bitField0_ |= 4;
                }

                private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
                    this.paneHeader_ = common$PaneHeader;
                    this.bitField0_ |= 1;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout layout = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout();
                DEFAULT_INSTANCE = layout;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.class, layout);
            }

            private Layout() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout layout) {
                return DEFAULT_INSTANCE.createBuilder(layout);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PaneBody extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int COMPONENTS_FIELD_NUMBER = 2;
            public static final int CONTAINER_TYPE_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private int containerType_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody paneBody = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody();
                DEFAULT_INSTANCE = paneBody;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.class, paneBody);
            }

            private PaneBody() {
            }

            private void addAllComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
                ensureComponentsIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.components_);
            }

            private void clearComponents() {
                this.components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearContainerType() {
                this.containerType_ = 0;
            }

            private void ensureComponentsIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.components_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.components_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeComponents(int i) {
                ensureComponentsIsMutable();
                this.components_.remove(i);
            }

            private void setContainerType(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b bVar) {
                this.containerType_ = bVar.getNumber();
            }

            private void setContainerTypeValue(int i) {
                this.containerType_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new java.lang.Object[]{"containerType_", "components_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getComponents(int i) {
                return this.components_.get(i);
            }

            public final int getComponentsCount() {
                return this.components_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getComponentsList() {
                return this.components_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getComponentsOrBuilder(int i) {
                return this.components_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getComponentsOrBuilderList() {
                return this.components_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b getContainerType() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.forNumber(this.containerType_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.UNRECOGNIZED : forNumber;
            }

            public final int getContainerTypeValue() {
                return this.containerType_;
            }

            private void addComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                ensureComponentsIsMutable();
                this.components_.add(common$FlexibleComponent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody paneBody) {
                return DEFAULT_INSTANCE.createBuilder(paneBody);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                ensureComponentsIsMutable();
                this.components_.set(i, common$FlexibleComponent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                ensureComponentsIsMutable();
                this.components_.add(i, common$FlexibleComponent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneBody) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PaneFooter extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int COMPONENTS_FIELD_NUMBER = 3;
            public static final int CONTAINER_TYPE_FIELD_NUMBER = 2;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter DEFAULT_INSTANCE;
            public static final int FADE_TYPE_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter> PARSER = null;
            public static final int SHRINK_PADDING_BOTTOM_FIELD_NUMBER = 4;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private int containerType_;
            private int fadeType_;
            private boolean shrinkPaddingBottom_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.DEFAULT_INSTANCE);
                }
            }

            public enum b implements com.google.protobuf.Internal.EnumLite {
                NONE(0),
                DEFAULT(1),
                DIVIDER(2),
                UNRECOGNIZED(-1);

                public static final int DEFAULT_VALUE = 1;
                public static final int DIVIDER_VALUE = 2;
                public static final int NONE_VALUE = 0;
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.a();

                /* renamed from: a, reason: collision with root package name */
                public final int f6199a;

                public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b findValueByNumber(int i) {
                        return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.forNumber(i);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$PaneFooter$b$b, reason: collision with other inner class name */
                public static final class C0187b implements com.google.protobuf.Internal.EnumVerifier {

                    /* renamed from: a, reason: collision with root package name */
                    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.C0187b f6200a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.C0187b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public final boolean isInRange(int i) {
                        return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.forNumber(i) != null;
                    }
                }

                b(int i) {
                    this.f6199a = i;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b forNumber(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return DEFAULT;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DIVIDER;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b> internalGetValueMap() {
                    return b;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.C0187b.f6200a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f6199a;
                    }
                    throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @java.lang.Deprecated
                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter paneFooter = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter();
                DEFAULT_INSTANCE = paneFooter;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.class, paneFooter);
            }

            private PaneFooter() {
            }

            private void addAllComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
                ensureComponentsIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.components_);
            }

            private void clearComponents() {
                this.components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void clearContainerType() {
                this.containerType_ = 0;
            }

            private void clearFadeType() {
                this.fadeType_ = 0;
            }

            private void clearShrinkPaddingBottom() {
                this.shrinkPaddingBottom_ = false;
            }

            private void ensureComponentsIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.components_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.components_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeComponents(int i) {
                ensureComponentsIsMutable();
                this.components_.remove(i);
            }

            private void setContainerType(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b bVar) {
                this.containerType_ = bVar.getNumber();
            }

            private void setContainerTypeValue(int i) {
                this.containerType_ = i;
            }

            private void setFadeType(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b bVar) {
                this.fadeType_ = bVar.getNumber();
            }

            private void setFadeTypeValue(int i) {
                this.fadeType_ = i;
            }

            private void setShrinkPaddingBottom(boolean z) {
                this.shrinkPaddingBottom_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u001b\u0004\u0007", new java.lang.Object[]{"fadeType_", "containerType_", "components_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class, "shrinkPaddingBottom_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getComponents(int i) {
                return this.components_.get(i);
            }

            public final int getComponentsCount() {
                return this.components_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getComponentsList() {
                return this.components_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getComponentsOrBuilder(int i) {
                return this.components_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getComponentsOrBuilderList() {
                return this.components_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b getContainerType() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.forNumber(this.containerType_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.UNRECOGNIZED : forNumber;
            }

            public final int getContainerTypeValue() {
                return this.containerType_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b getFadeType() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.forNumber(this.fadeType_);
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.b.UNRECOGNIZED : forNumber;
            }

            public final int getFadeTypeValue() {
                return this.fadeType_;
            }

            public final boolean getShrinkPaddingBottom() {
                return this.shrinkPaddingBottom_;
            }

            private void addComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                ensureComponentsIsMutable();
                this.components_.add(common$FlexibleComponent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter paneFooter) {
                return DEFAULT_INSTANCE.createBuilder(paneFooter);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                ensureComponentsIsMutable();
                this.components_.set(i, common$FlexibleComponent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
                ensureComponentsIsMutable();
                this.components_.add(i, common$FlexibleComponent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.PaneFooter) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public enum b implements com.google.protobuf.Internal.EnumLite {
            DEFAULT(0),
            FULL_WIDTH(1),
            UNRECOGNIZED(-1);

            public static final int DEFAULT_VALUE = 0;
            public static final int FULL_WIDTH_VALUE = 1;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6201a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$b$b, reason: collision with other inner class name */
            public static final class C0188b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.C0188b f6202a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.C0188b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f6201a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b forNumber(int i) {
                if (i == 0) {
                    return DEFAULT;
                }
                if (i != 1) {
                    return null;
                }
                return FULL_WIDTH;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b.C0188b.f6202a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6201a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.b valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum c {
            DEFAULT_LAYOUT(1),
            LAYOUT_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6203a;

            c(int i) {
                this.f6203a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.c forNumber(int i) {
                if (i == 0) {
                    return LAYOUT_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return DEFAULT_LAYOUT;
            }

            public final int getNumber() {
                return this.f6203a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearBackgroundDisplayMode() {
            this.backgroundDisplayMode_ = 0;
        }

        private void clearDefaultLayout() {
            if (this.layoutCase_ == 1) {
                this.layoutCase_ = 0;
                this.layout_ = null;
            }
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLayout() {
            this.layoutCase_ = 0;
            this.layout_ = null;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBackgroundDisplayMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m enumC0487m) {
            this.backgroundDisplayMode_ = enumC0487m.getNumber();
        }

        private void setBackgroundDisplayModeValue(int i) {
            this.backgroundDisplayMode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000\u0003\f", new java.lang.Object[]{"layout_", "layoutCase_", "bitField0_", com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.class, "events_", "backgroundDisplayMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default getDefaultLayout() {
            return this.layoutCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) this.layout_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.c getLayoutCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.c.forNumber(this.layoutCase_);
        }

        public final boolean hasDefaultLayout() {
            return this.layoutCase_ == 1;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeDefaultLayout(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default r4) {
            if (this.layoutCase_ != 1 || this.layout_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.getDefaultInstance()) {
                this.layout_ = r4;
            } else {
                this.layout_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default) this.layout_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default.a) r4).buildPartial();
            }
            this.layoutCase_ = 1;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setDefaultLayout(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Layout.Default r1) {
            this.layout_ = r1;
            this.layoutCase_ = 1;
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane flexiblePaneOuterClass$FlexiblePane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane();
        DEFAULT_INSTANCE = flexiblePaneOuterClass$FlexiblePane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.class, flexiblePaneOuterClass$FlexiblePane);
    }

    private FlexiblePaneOuterClass$FlexiblePane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.f0.f6298a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane flexiblePaneOuterClass$FlexiblePane) {
        return DEFAULT_INSTANCE.createBuilder(flexiblePaneOuterClass$FlexiblePane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
