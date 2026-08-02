package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$Transition extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int DEFAULT_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition DEFAULT_INSTANCE;
    public static final int DYNAMIC_INPUTS_FIELD_NUMBER = 6;
    public static final int FADE_OUT_WITH_SPINNER_FIELD_NUMBER = 5;
    public static final int NONE_FIELD_NUMBER = 4;
    public static final int PANE_CONTROLLED_FIELD_NUMBER = 7;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition> PARSER = null;
    public static final int SPINNER_FIELD_NUMBER = 3;
    private int styleCase_ = 0;
    private java.lang.Object style_;

    public static final class Default extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Default.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Default.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default r0 = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default();
            DEFAULT_INSTANCE = r0;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default.class, r0);
        }

        private Default() {
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Default.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Default.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Default.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default r1) {
            return DEFAULT_INSTANCE.createBuilder(r1);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DynamicInputs extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BUTTON_CUSTOMIZATIONS_FIELD_NUMBER = 5;
        public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 3;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs DEFAULT_INSTANCE;
        public static final int DISPLAY_CHECK_MARKS_FIELD_NUMBER = 2;
        public static final int PANE_TRANSITION_TIMEOUT_MS_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs> PARSER = null;
        public static final int STEPPED_TRANSITION_TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations buttonCustomizations_;
        private int buttonPlacement_;
        private boolean displayCheckMarks_;
        private long paneTransitionTimeoutMs_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText steppedTransitionText_;

        public static final class ButtonCustomizations extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BORDER_RADIUS_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius borderRadius_;

            public static final class BorderRadius extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius DEFAULT_INSTANCE;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius> PARSER = null;
                public static final int SIZE_FIELD_NUMBER = 1;
                private int size_;

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius borderRadius = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius();
                    DEFAULT_INSTANCE = borderRadius;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.class, borderRadius);
                }

                private BorderRadius() {
                }

                private void clearSize() {
                    this.size_ = 0;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setSize(int i) {
                    this.size_ = i;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"size_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.class) {
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

                public final int getSize() {
                    return this.size_;
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius borderRadius) {
                    return DEFAULT_INSTANCE.createBuilder(borderRadius);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations buttonCustomizations = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations();
                DEFAULT_INSTANCE = buttonCustomizations;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.class, buttonCustomizations);
            }

            private ButtonCustomizations() {
            }

            private void clearBorderRadius() {
                this.borderRadius_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "borderRadius_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius getBorderRadius() {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius borderRadius = this.borderRadius_;
                return borderRadius == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.getDefaultInstance() : borderRadius;
            }

            public final boolean hasBorderRadius() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeBorderRadius(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius borderRadius) {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius borderRadius2 = this.borderRadius_;
                if (borderRadius2 == null || borderRadius2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.getDefaultInstance()) {
                    this.borderRadius_ = borderRadius;
                } else {
                    this.borderRadius_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.newBuilder(this.borderRadius_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius.a) borderRadius).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations buttonCustomizations) {
                return DEFAULT_INSTANCE.createBuilder(buttonCustomizations);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setBorderRadius(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.BorderRadius borderRadius) {
                this.borderRadius_ = borderRadius;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs dynamicInputs = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs();
            DEFAULT_INSTANCE = dynamicInputs;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs.class, dynamicInputs);
        }

        private DynamicInputs() {
        }

        private void clearButtonCustomizations() {
            this.buttonCustomizations_ = null;
            this.bitField0_ &= -3;
        }

        private void clearButtonPlacement() {
            this.buttonPlacement_ = 0;
        }

        private void clearDisplayCheckMarks() {
            this.displayCheckMarks_ = false;
        }

        private void clearPaneTransitionTimeoutMs() {
            this.paneTransitionTimeoutMs_ = 0L;
        }

        private void clearSteppedTransitionText() {
            this.steppedTransitionText_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setButtonPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p enumC0490p) {
            this.buttonPlacement_ = enumC0490p.getNumber();
        }

        private void setButtonPlacementValue(int i) {
            this.buttonPlacement_ = i;
        }

        private void setDisplayCheckMarks(boolean z) {
            this.displayCheckMarks_ = z;
        }

        private void setPaneTransitionTimeoutMs(long j) {
            this.paneTransitionTimeoutMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\f\u0004\u0003\u0005ဉ\u0001", new java.lang.Object[]{"bitField0_", "steppedTransitionText_", "displayCheckMarks_", "buttonPlacement_", "paneTransitionTimeoutMs_", "buttonCustomizations_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations getButtonCustomizations() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations buttonCustomizations = this.buttonCustomizations_;
            return buttonCustomizations == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.getDefaultInstance() : buttonCustomizations;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p getButtonPlacement() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(this.buttonPlacement_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.UNRECOGNIZED : forNumber;
        }

        public final int getButtonPlacementValue() {
            return this.buttonPlacement_;
        }

        public final boolean getDisplayCheckMarks() {
            return this.displayCheckMarks_;
        }

        public final long getPaneTransitionTimeoutMs() {
            return this.paneTransitionTimeoutMs_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText getSteppedTransitionText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText common$SteppedTransitionText = this.steppedTransitionText_;
            return common$SteppedTransitionText == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.getDefaultInstance() : common$SteppedTransitionText;
        }

        public final boolean hasButtonCustomizations() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasSteppedTransitionText() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeButtonCustomizations(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations buttonCustomizations) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations buttonCustomizations2 = this.buttonCustomizations_;
            if (buttonCustomizations2 == null || buttonCustomizations2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.getDefaultInstance()) {
                this.buttonCustomizations_ = buttonCustomizations;
            } else {
                this.buttonCustomizations_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.newBuilder(this.buttonCustomizations_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations.a) buttonCustomizations).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeSteppedTransitionText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText common$SteppedTransitionText) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText common$SteppedTransitionText2 = this.steppedTransitionText_;
            if (common$SteppedTransitionText2 == null || common$SteppedTransitionText2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.getDefaultInstance()) {
                this.steppedTransitionText_ = common$SteppedTransitionText;
            } else {
                this.steppedTransitionText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.newBuilder(this.steppedTransitionText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.a) common$SteppedTransitionText).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs dynamicInputs) {
            return DEFAULT_INSTANCE.createBuilder(dynamicInputs);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setButtonCustomizations(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.ButtonCustomizations buttonCustomizations) {
            this.buttonCustomizations_ = buttonCustomizations;
            this.bitField0_ |= 2;
        }

        private void setSteppedTransitionText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText common$SteppedTransitionText) {
            this.steppedTransitionText_ = common$SteppedTransitionText;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FadeOutWithSpinner extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.FadeOutWithSpinner.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner DEFAULT_INSTANCE;
        public static final int MESSAGES_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner> PARSER;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> messages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.FadeOutWithSpinner.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner fadeOutWithSpinner = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner();
            DEFAULT_INSTANCE = fadeOutWithSpinner;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner.class, fadeOutWithSpinner);
        }

        private FadeOutWithSpinner() {
        }

        private void addAllMessages(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> iterable) {
            ensureMessagesIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.messages_);
        }

        private void clearMessages() {
            this.messages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureMessagesIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> protobufList = this.messages_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.messages_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.FadeOutWithSpinner.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeMessages(int i) {
            ensureMessagesIsMutable();
            this.messages_.remove(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.FadeOutWithSpinner.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"messages_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getMessages(int i) {
            return this.messages_.get(i);
        }

        public final int getMessagesCount() {
            return this.messages_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> getMessagesList() {
            return this.messages_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.C getMessagesOrBuilder(int i) {
            return this.messages_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.C> getMessagesOrBuilderList() {
            return this.messages_;
        }

        private void addMessages(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            ensureMessagesIsMutable();
            this.messages_.add(common$LocalizedString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.FadeOutWithSpinner.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner fadeOutWithSpinner) {
            return DEFAULT_INSTANCE.createBuilder(fadeOutWithSpinner);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setMessages(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            ensureMessagesIsMutable();
            this.messages_.set(i, common$LocalizedString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addMessages(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            ensureMessagesIsMutable();
            this.messages_.add(i, common$LocalizedString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class None extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.None.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None DEFAULT_INSTANCE;
        public static final int PANE_TRANSITION_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None> PARSER;
        private long paneTransitionTimeoutMs_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.None.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None none = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None();
            DEFAULT_INSTANCE = none;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None.class, none);
        }

        private None() {
        }

        private void clearPaneTransitionTimeoutMs() {
            this.paneTransitionTimeoutMs_ = 0L;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.None.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneTransitionTimeoutMs(long j) {
            this.paneTransitionTimeoutMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.None.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new java.lang.Object[]{"paneTransitionTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None.class) {
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

        public final long getPaneTransitionTimeoutMs() {
            return this.paneTransitionTimeoutMs_;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.None.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None none) {
            return DEFAULT_INSTANCE.createBuilder(none);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PaneControlled extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.PaneControlled.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.PaneControlled.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled paneControlled = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled();
            DEFAULT_INSTANCE = paneControlled;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled.class, paneControlled);
        }

        private PaneControlled() {
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.PaneControlled.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.PaneControlled.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.PaneControlled.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled paneControlled) {
            return DEFAULT_INSTANCE.createBuilder(paneControlled);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Spinner extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Spinner.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner DEFAULT_INSTANCE;
        public static final int HIDE_FAIRY_BITS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner> PARSER;
        private boolean hideFairyBits_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Spinner.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner spinner = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner();
            DEFAULT_INSTANCE = spinner;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner.class, spinner);
        }

        private Spinner() {
        }

        private void clearHideFairyBits() {
            this.hideFairyBits_ = false;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Spinner.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setHideFairyBits(boolean z) {
            this.hideFairyBits_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Spinner.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new java.lang.Object[]{"hideFairyBits_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner.class) {
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

        public final boolean getHideFairyBits() {
            return this.hideFairyBits_;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Spinner.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner spinner) {
            return DEFAULT_INSTANCE.createBuilder(spinner);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        DEFAULT(1),
        SPINNER(3),
        NONE(4),
        FADE_OUT_WITH_SPINNER(5),
        DYNAMIC_INPUTS(6),
        PANE_CONTROLLED(7),
        STYLE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6177a;

        b(int i) {
            this.f6177a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.b forNumber(int i) {
            if (i == 0) {
                return STYLE_NOT_SET;
            }
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 3) {
                return SPINNER;
            }
            if (i == 4) {
                return NONE;
            }
            if (i == 5) {
                return FADE_OUT_WITH_SPINNER;
            }
            if (i == 6) {
                return DYNAMIC_INPUTS;
            }
            if (i != 7) {
                return null;
            }
            return PANE_CONTROLLED;
        }

        public final int getNumber() {
            return this.f6177a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition();
        DEFAULT_INSTANCE = common$Transition;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.class, common$Transition);
    }

    private Common$Transition() {
    }

    private void clearDefault() {
        if (this.styleCase_ == 1) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearDynamicInputs() {
        if (this.styleCase_ == 6) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearFadeOutWithSpinner() {
        if (this.styleCase_ == 5) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearNone() {
        if (this.styleCase_ == 4) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearPaneControlled() {
        if (this.styleCase_ == 7) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearSpinner() {
        if (this.styleCase_ == 3) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearStyle() {
        this.styleCase_ = 0;
        this.style_ = null;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new java.lang.Object[]{"style_", "styleCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default getDefault() {
        return this.styleCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs getDynamicInputs() {
        return this.styleCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner getFadeOutWithSpinner() {
        return this.styleCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None getNone() {
        return this.styleCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled getPaneControlled() {
        return this.styleCase_ == 7 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner getSpinner() {
        return this.styleCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.b getStyleCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.b.forNumber(this.styleCase_);
    }

    public final boolean hasDefault() {
        return this.styleCase_ == 1;
    }

    public final boolean hasDynamicInputs() {
        return this.styleCase_ == 6;
    }

    public final boolean hasFadeOutWithSpinner() {
        return this.styleCase_ == 5;
    }

    public final boolean hasNone() {
        return this.styleCase_ == 4;
    }

    public final boolean hasPaneControlled() {
        return this.styleCase_ == 7;
    }

    public final boolean hasSpinner() {
        return this.styleCase_ == 3;
    }

    private void mergeDefault(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default r4) {
        if (this.styleCase_ != 1 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default.getDefaultInstance()) {
            this.style_ = r4;
        } else {
            this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Default.a) r4).buildPartial();
        }
        this.styleCase_ = 1;
    }

    private void mergeDynamicInputs(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs dynamicInputs) {
        if (this.styleCase_ != 6 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs.getDefaultInstance()) {
            this.style_ = dynamicInputs;
        } else {
            this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.DynamicInputs.a) dynamicInputs).buildPartial();
        }
        this.styleCase_ = 6;
    }

    private void mergeFadeOutWithSpinner(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner fadeOutWithSpinner) {
        if (this.styleCase_ != 5 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner.getDefaultInstance()) {
            this.style_ = fadeOutWithSpinner;
        } else {
            this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.FadeOutWithSpinner.a) fadeOutWithSpinner).buildPartial();
        }
        this.styleCase_ = 5;
    }

    private void mergeNone(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None none) {
        if (this.styleCase_ != 4 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None.getDefaultInstance()) {
            this.style_ = none;
        } else {
            this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.None.a) none).buildPartial();
        }
        this.styleCase_ = 4;
    }

    private void mergePaneControlled(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled paneControlled) {
        if (this.styleCase_ != 7 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled.getDefaultInstance()) {
            this.style_ = paneControlled;
        } else {
            this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.PaneControlled.a) paneControlled).buildPartial();
        }
        this.styleCase_ = 7;
    }

    private void mergeSpinner(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner spinner) {
        if (this.styleCase_ != 3 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner.getDefaultInstance()) {
            this.style_ = spinner;
        } else {
            this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Transition.Spinner.a) spinner).buildPartial();
        }
        this.styleCase_ = 3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition) {
        return DEFAULT_INSTANCE.createBuilder(common$Transition);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setDefault(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Default r1) {
        this.style_ = r1;
        this.styleCase_ = 1;
    }

    private void setDynamicInputs(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.DynamicInputs dynamicInputs) {
        this.style_ = dynamicInputs;
        this.styleCase_ = 6;
    }

    private void setFadeOutWithSpinner(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.FadeOutWithSpinner fadeOutWithSpinner) {
        this.style_ = fadeOutWithSpinner;
        this.styleCase_ = 5;
    }

    private void setNone(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.None none) {
        this.style_ = none;
        this.styleCase_ = 4;
    }

    private void setPaneControlled(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.PaneControlled paneControlled) {
        this.style_ = paneControlled;
        this.styleCase_ = 7;
    }

    private void setSpinner(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.Spinner spinner) {
        this.style_ = spinner;
        this.styleCase_ = 3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
