package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class ClientSubmissionPaneOuterClass$ClientSubmissionPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0483i.f6303a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int DATA_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data> data_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class Data extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.b {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data DEFAULT_INSTANCE;
                public static final int FINGERPRINT_CALCULATED_FIELD_NUMBER = 2;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data> PARSER = null;
                public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
                private int valueCase_ = 0;
                private java.lang.Object value_;

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.b {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.DEFAULT_INSTANCE);
                    }
                }

                public enum b {
                    PHONE_NUMBER(1),
                    FINGERPRINT_CALCULATED(2),
                    VALUE_NOT_SET(0);


                    /* renamed from: a, reason: collision with root package name */
                    public final int f6107a;

                    b(int i) {
                        this.f6107a = i;
                    }

                    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.b forNumber(int i) {
                        if (i == 0) {
                            return VALUE_NOT_SET;
                        }
                        if (i == 1) {
                            return PHONE_NUMBER;
                        }
                        if (i != 2) {
                            return null;
                        }
                        return FINGERPRINT_CALCULATED;
                    }

                    public final int getNumber() {
                        return this.f6107a;
                    }

                    @java.lang.Deprecated
                    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.b valueOf(int i) {
                        return forNumber(i);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data data = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data();
                    DEFAULT_INSTANCE = data;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.class, data);
                }

                private Data() {
                }

                private void clearFingerprintCalculated() {
                    if (this.valueCase_ == 2) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearPhoneNumber() {
                    if (this.valueCase_ == 1) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearValue() {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setFingerprintCalculated(boolean z) {
                    this.valueCase_ = 2;
                    this.value_ = java.lang.Boolean.valueOf(z);
                }

                private void setPhoneNumberBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString.toStringUtf8();
                    this.valueCase_ = 1;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0483i.f6303a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000", new java.lang.Object[]{"value_", "valueCase_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.class) {
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

                public final boolean getFingerprintCalculated() {
                    if (this.valueCase_ == 2) {
                        return ((java.lang.Boolean) this.value_).booleanValue();
                    }
                    return false;
                }

                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.b getValueCase() {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.b.forNumber(this.valueCase_);
                }

                public final boolean hasFingerprintCalculated() {
                    return this.valueCase_ == 2;
                }

                public final boolean hasPhoneNumber() {
                    return this.valueCase_ == 1;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data data) {
                    return DEFAULT_INSTANCE.createBuilder(data);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                private void setPhoneNumber(java.lang.String str) {
                    this.valueCase_ = 1;
                    this.value_ = str;
                }

                public final java.lang.String getPhoneNumber() {
                    return this.valueCase_ == 1 ? (java.lang.String) this.value_ : "";
                }

                public final com.google.protobuf.ByteString getPhoneNumberBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.valueCase_ == 1 ? (java.lang.String) this.value_ : "");
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }
            }

            public interface b extends com.google.protobuf.MessageLiteOrBuilder {
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void addAllData(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data> iterable) {
                ensureDataIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.data_);
            }

            private void clearData() {
                this.data_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureDataIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data> protobufList = this.data_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.data_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeData(int i) {
                ensureDataIsMutable();
                this.data_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0483i.f6303a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"data_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data getData(int i) {
                return this.data_.get(i);
            }

            public final int getDataCount() {
                return this.data_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data> getDataList() {
                return this.data_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.b getDataOrBuilder(int i) {
                return this.data_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.b> getDataOrBuilderList() {
                return this.data_;
            }

            private void addData(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data data) {
                ensureDataIsMutable();
                this.data_.add(data);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setData(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data data) {
                ensureDataIsMutable();
                this.data_.set(i, data);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addData(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.Data data) {
                ensureDataIsMutable();
                this.data_.add(i, data);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            EXIT(2),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6108a;

            a(int i) {
                this.f6108a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return SUBMIT;
                }
                if (i != 2) {
                    return null;
                }
                return EXIT;
            }

            public final int getNumber() {
                return this.f6108a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.class, actions);
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

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0483i.f6303a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.getDefaultInstance();
        }

        public final boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public final boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering> PARSER = null;
        public static final int REQUIRED_SUBMISSION_DATA_FIELD_NUMBER = 3;
        public static final int WAIT_FOR_TD_DATA_COLLECTION_FIELD_NUMBER = 2;
        private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c> requiredSubmissionData_converter_ = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.a();
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events events_;
        private int requiredSubmissionDataMemoizedSerializedSize;
        private com.google.protobuf.Internal.IntList requiredSubmissionData_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
        private boolean waitForTdDataCollection_;

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.class, events);
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0483i.f6303a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public final class a implements com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c> {
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c convert(java.lang.Integer num) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.forNumber(num.intValue());
                return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.UNRECOGNIZED : forNumber;
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public enum c implements com.google.protobuf.Internal.EnumLite {
            SUBMITTED_DATA_UNKNOWN(0),
            SUBMITTED_DATA_TRUSTED_DATA(1),
            SUBMITTED_DATA_PHONE_NUMBER(2),
            UNRECOGNIZED(-1);

            public static final int SUBMITTED_DATA_PHONE_NUMBER_VALUE = 2;
            public static final int SUBMITTED_DATA_TRUSTED_DATA_VALUE = 1;
            public static final int SUBMITTED_DATA_UNKNOWN_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6109a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.b f6110a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f6109a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c forNumber(int i) {
                if (i == 0) {
                    return SUBMITTED_DATA_UNKNOWN;
                }
                if (i == 1) {
                    return SUBMITTED_DATA_TRUSTED_DATA;
                }
                if (i != 2) {
                    return null;
                }
                return SUBMITTED_DATA_PHONE_NUMBER;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.b.f6110a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6109a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllRequiredSubmissionData(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c> iterable) {
            ensureRequiredSubmissionDataIsMutable();
            java.util.Iterator<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredSubmissionData_.addInt(it.next().getNumber());
            }
        }

        private void addAllRequiredSubmissionDataValue(java.lang.Iterable<java.lang.Integer> iterable) {
            ensureRequiredSubmissionDataIsMutable();
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredSubmissionData_.addInt(it.next().intValue());
            }
        }

        private void addRequiredSubmissionDataValue(int i) {
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.addInt(i);
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearRequiredSubmissionData() {
            this.requiredSubmissionData_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
        }

        private void clearWaitForTdDataCollection() {
            this.waitForTdDataCollection_ = false;
        }

        private void ensureRequiredSubmissionDataIsMutable() {
            com.google.protobuf.Internal.IntList intList = this.requiredSubmissionData_;
            if (intList.isModifiable()) {
                return;
            }
            this.requiredSubmissionData_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRequiredSubmissionDataValue(int i, int i2) {
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.setInt(i, i2);
        }

        private void setWaitForTdDataCollection(boolean z) {
            this.waitForTdDataCollection_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0483i.f6303a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0007\u0003,", new java.lang.Object[]{"bitField0_", "events_", "waitForTdDataCollection_", "requiredSubmissionData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c getRequiredSubmissionData(int i) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.forNumber(this.requiredSubmissionData_.getInt(i));
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c.UNRECOGNIZED : forNumber;
        }

        public final int getRequiredSubmissionDataCount() {
            return this.requiredSubmissionData_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c> getRequiredSubmissionDataList() {
            return new com.google.protobuf.Internal.ListAdapter(this.requiredSubmissionData_, requiredSubmissionData_converter_);
        }

        public final int getRequiredSubmissionDataValue(int i) {
            return this.requiredSubmissionData_.getInt(i);
        }

        public final java.util.List<java.lang.Integer> getRequiredSubmissionDataValueList() {
            return this.requiredSubmissionData_;
        }

        public final boolean getWaitForTdDataCollection() {
            return this.waitForTdDataCollection_;
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        private void addRequiredSubmissionData(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c cVar) {
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.addInt(cVar.getNumber());
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        private void setRequiredSubmissionData(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.c cVar) {
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.setInt(i, cVar.getNumber());
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane clientSubmissionPaneOuterClass$ClientSubmissionPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane();
        DEFAULT_INSTANCE = clientSubmissionPaneOuterClass$ClientSubmissionPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.class, clientSubmissionPaneOuterClass$ClientSubmissionPane);
    }

    private ClientSubmissionPaneOuterClass$ClientSubmissionPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0483i.f6303a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane clientSubmissionPaneOuterClass$ClientSubmissionPane) {
        return DEFAULT_INSTANCE.createBuilder(clientSubmissionPaneOuterClass$ClientSubmissionPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
