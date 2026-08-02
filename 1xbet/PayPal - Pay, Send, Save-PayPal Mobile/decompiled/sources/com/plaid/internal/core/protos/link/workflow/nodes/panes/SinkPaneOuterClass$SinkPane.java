package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class SinkPaneOuterClass$SinkPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Actions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Actions.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions.class, actions);
        }

        private Actions() {
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Actions.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.u0.f6332a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Actions.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Actions.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering DEFAULT_INSTANCE;
        public static final int ERROR_JSON_FIELD_NUMBER = 3;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int HOSTED_LINK_COMPLETION_REDIRECT_URI_FIELD_NUMBER = 14;
        public static final int METADATA_JSON_FIELD_NUMBER = 4;
        public static final int OMIT_KNOWN_NULL_FIELDS_FIELD_NUMBER = 8;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering> PARSER = null;
        public static final int PUBLIC_TOKEN_FIELD_NUMBER = 2;
        public static final int REDIRECT_URI_FIELD_NUMBER = 13;
        public static final int RESULT_FIELD_NUMBER = 1;
        public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 6;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events events_;
        private com.google.protobuf.StringValue hostedLinkCompletionRedirectUri_;
        private boolean omitKnownNullFields_;
        private com.google.protobuf.StringValue redirectUri_;
        private com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult result_;
        private java.lang.String publicToken_ = "";
        private java.lang.String errorJson_ = "";
        private java.lang.String metadataJson_ = "";
        private java.lang.String webviewRedirectUri_ = "";

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.class, events);
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.u0.f6332a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearErrorJson() {
            this.errorJson_ = getDefaultInstance().getErrorJson();
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -3;
        }

        private void clearHostedLinkCompletionRedirectUri() {
            this.hostedLinkCompletionRedirectUri_ = null;
            this.bitField0_ &= -9;
        }

        private void clearMetadataJson() {
            this.metadataJson_ = getDefaultInstance().getMetadataJson();
        }

        private void clearOmitKnownNullFields() {
            this.omitKnownNullFields_ = false;
        }

        private void clearPublicToken() {
            this.publicToken_ = getDefaultInstance().getPublicToken();
        }

        private void clearRedirectUri() {
            this.redirectUri_ = null;
            this.bitField0_ &= -5;
        }

        private void clearResult() {
            this.result_ = null;
            this.bitField0_ &= -2;
        }

        private void clearWebviewRedirectUri() {
            this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorJsonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorJson_ = byteString.toStringUtf8();
        }

        private void setMetadataJsonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.metadataJson_ = byteString.toStringUtf8();
        }

        private void setOmitKnownNullFields(boolean z) {
            this.omitKnownNullFields_ = z;
        }

        private void setPublicTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.publicToken_ = byteString.toStringUtf8();
        }

        private void setWebviewRedirectUriBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.webviewRedirectUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.u0.f6332a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ\b\u0007\rဉ\u0002\u000eဉ\u0003", new java.lang.Object[]{"bitField0_", "result_", "publicToken_", "errorJson_", "metadataJson_", "events_", "webviewRedirectUri_", "omitKnownNullFields_", "redirectUri_", "hostedLinkCompletionRedirectUri_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering.class) {
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

        public final java.lang.String getErrorJson() {
            return this.errorJson_;
        }

        public final com.google.protobuf.ByteString getErrorJsonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorJson_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.google.protobuf.StringValue getHostedLinkCompletionRedirectUri() {
            com.google.protobuf.StringValue stringValue = this.hostedLinkCompletionRedirectUri_;
            return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
        }

        public final java.lang.String getMetadataJson() {
            return this.metadataJson_;
        }

        public final com.google.protobuf.ByteString getMetadataJsonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.metadataJson_);
        }

        public final boolean getOmitKnownNullFields() {
            return this.omitKnownNullFields_;
        }

        public final java.lang.String getPublicToken() {
            return this.publicToken_;
        }

        public final com.google.protobuf.ByteString getPublicTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.publicToken_);
        }

        public final com.google.protobuf.StringValue getRedirectUri() {
            com.google.protobuf.StringValue stringValue = this.redirectUri_;
            return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult getResult() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult sdkResult$SDKResult = this.result_;
            return sdkResult$SDKResult == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.getDefaultInstance() : sdkResult$SDKResult;
        }

        public final java.lang.String getWebviewRedirectUri() {
            return this.webviewRedirectUri_;
        }

        public final com.google.protobuf.ByteString getWebviewRedirectUriBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.webviewRedirectUri_);
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasHostedLinkCompletionRedirectUri() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasRedirectUri() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeHostedLinkCompletionRedirectUri(com.google.protobuf.StringValue stringValue) {
            com.google.protobuf.StringValue stringValue2 = this.hostedLinkCompletionRedirectUri_;
            if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
                this.hostedLinkCompletionRedirectUri_ = stringValue;
            } else {
                this.hostedLinkCompletionRedirectUri_ = com.google.protobuf.StringValue.newBuilder(this.hostedLinkCompletionRedirectUri_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeRedirectUri(com.google.protobuf.StringValue stringValue) {
            com.google.protobuf.StringValue stringValue2 = this.redirectUri_;
            if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
                this.redirectUri_ = stringValue;
            } else {
                this.redirectUri_ = com.google.protobuf.StringValue.newBuilder(this.redirectUri_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeResult(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult sdkResult$SDKResult) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult sdkResult$SDKResult2 = this.result_;
            if (sdkResult$SDKResult2 == null || sdkResult$SDKResult2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.getDefaultInstance()) {
                this.result_ = sdkResult$SDKResult;
            } else {
                this.result_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.newBuilder(this.result_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.a) sdkResult$SDKResult).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 2;
        }

        private void setHostedLinkCompletionRedirectUri(com.google.protobuf.StringValue stringValue) {
            this.hostedLinkCompletionRedirectUri_ = stringValue;
            this.bitField0_ |= 8;
        }

        private void setRedirectUri(com.google.protobuf.StringValue stringValue) {
            this.redirectUri_ = stringValue;
            this.bitField0_ |= 4;
        }

        private void setResult(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult sdkResult$SDKResult) {
            this.result_ = sdkResult$SDKResult;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setErrorJson(java.lang.String str) {
            this.errorJson_ = str;
        }

        private void setMetadataJson(java.lang.String str) {
            this.metadataJson_ = str;
        }

        private void setPublicToken(java.lang.String str) {
            this.publicToken_ = str;
        }

        private void setWebviewRedirectUri(java.lang.String str) {
            this.webviewRedirectUri_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane sinkPaneOuterClass$SinkPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane();
        DEFAULT_INSTANCE = sinkPaneOuterClass$SinkPane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.class, sinkPaneOuterClass$SinkPane);
    }

    private SinkPaneOuterClass$SinkPane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.u0.f6332a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.class) {
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane sinkPaneOuterClass$SinkPane) {
        return DEFAULT_INSTANCE.createBuilder(sinkPaneOuterClass$SinkPane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
