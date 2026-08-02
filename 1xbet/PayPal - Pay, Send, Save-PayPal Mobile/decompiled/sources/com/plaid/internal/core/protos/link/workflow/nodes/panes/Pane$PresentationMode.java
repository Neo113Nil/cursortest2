package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Pane$PresentationMode extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int DEFAULT_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode DEFAULT_INSTANCE;
    public static final int HALF_PANE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode> PARSER = null;
    public static final int VARIABLE_HEIGHT_FIELD_NUMBER = 4;
    private int typeCase_ = 0;
    private java.lang.Object type_;

    public static final class Default extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.Default.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.Default.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default r0 = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default();
            DEFAULT_INSTANCE = r0;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default.class, r0);
        }

        private Default() {
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.Default.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.Default.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.Default.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default r1) {
            return DEFAULT_INSTANCE.createBuilder(r1);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HalfPane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.HalfPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.HalfPane.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane halfPane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane();
            DEFAULT_INSTANCE = halfPane;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane.class, halfPane);
        }

        private HalfPane() {
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.HalfPane.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.HalfPane.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.HalfPane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane halfPane) {
            return DEFAULT_INSTANCE.createBuilder(halfPane);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VariableHeight extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.VariableHeight.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.VariableHeight.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight variableHeight = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight();
            DEFAULT_INSTANCE = variableHeight;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight.class, variableHeight);
        }

        private VariableHeight() {
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.VariableHeight.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.VariableHeight.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.VariableHeight.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight variableHeight) {
            return DEFAULT_INSTANCE.createBuilder(variableHeight);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        DEFAULT(1),
        HALF_PANE(2),
        VARIABLE_HEIGHT(4),
        TYPE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6234a;

        b(int i) {
            this.f6234a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.b forNumber(int i) {
            if (i == 0) {
                return TYPE_NOT_SET;
            }
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return HALF_PANE;
            }
            if (i != 4) {
                return null;
            }
            return VARIABLE_HEIGHT;
        }

        public final int getNumber() {
            return this.f6234a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode pane$PresentationMode = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode();
        DEFAULT_INSTANCE = pane$PresentationMode;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.class, pane$PresentationMode);
    }

    private Pane$PresentationMode() {
    }

    private void clearDefault() {
        if (this.typeCase_ == 1) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearHalfPane() {
        if (this.typeCase_ == 2) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    private void clearVariableHeight() {
        if (this.typeCase_ == 4) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000", new java.lang.Object[]{"type_", "typeCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default getDefault() {
        return this.typeCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane getHalfPane() {
        return this.typeCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.b getTypeCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.b.forNumber(this.typeCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight getVariableHeight() {
        return this.typeCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight.getDefaultInstance();
    }

    public final boolean hasDefault() {
        return this.typeCase_ == 1;
    }

    public final boolean hasHalfPane() {
        return this.typeCase_ == 2;
    }

    public final boolean hasVariableHeight() {
        return this.typeCase_ == 4;
    }

    private void mergeDefault(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default r4) {
        if (this.typeCase_ != 1 || this.type_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default.getDefaultInstance()) {
            this.type_ = r4;
        } else {
            this.type_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.Default.a) r4).buildPartial();
        }
        this.typeCase_ = 1;
    }

    private void mergeHalfPane(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane halfPane) {
        if (this.typeCase_ != 2 || this.type_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane.getDefaultInstance()) {
            this.type_ = halfPane;
        } else {
            this.type_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.HalfPane.a) halfPane).buildPartial();
        }
        this.typeCase_ = 2;
    }

    private void mergeVariableHeight(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight variableHeight) {
        if (this.typeCase_ != 4 || this.type_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight.getDefaultInstance()) {
            this.type_ = variableHeight;
        } else {
            this.type_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PresentationMode.VariableHeight.a) variableHeight).buildPartial();
        }
        this.typeCase_ = 4;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode pane$PresentationMode) {
        return DEFAULT_INSTANCE.createBuilder(pane$PresentationMode);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setDefault(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.Default r1) {
        this.type_ = r1;
        this.typeCase_ = 1;
    }

    private void setHalfPane(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.HalfPane halfPane) {
        this.type_ = halfPane;
        this.typeCase_ = 2;
    }

    private void setVariableHeight(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.VariableHeight variableHeight) {
        this.type_ = variableHeight;
        this.typeCase_ = 4;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
