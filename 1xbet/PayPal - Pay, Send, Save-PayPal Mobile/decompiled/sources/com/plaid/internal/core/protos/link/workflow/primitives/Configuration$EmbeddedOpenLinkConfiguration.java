package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$EmbeddedOpenLinkConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration DEFAULT_INSTANCE;
    public static final int EMBEDDED_WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    public static final int IS_POLLING_FIELD_NUMBER = 5;
    public static final int OPEN_LINK_ACTION_DEFAULT_FIELD_NUMBER = 2;
    public static final int OPEN_LINK_ACTION_LINK_WITH_ACCOUNT_NUMBERS_FIELD_NUMBER = 4;
    public static final int OPEN_LINK_ACTION_WITH_INSTITUTION_ID_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration> PARSER;
    private java.lang.Object embeddedOpenLinkAction_;
    private boolean isPolling_;
    private int embeddedOpenLinkActionCase_ = 0;
    private java.lang.String embeddedWorkflowSessionId_ = "";

    public static final class EmbeddedOpenLinkActionDefault extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault();
            DEFAULT_INSTANCE = embeddedOpenLinkActionDefault;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.class, embeddedOpenLinkActionDefault);
        }

        private EmbeddedOpenLinkActionDefault() {
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault) {
            return DEFAULT_INSTANCE.createBuilder(embeddedOpenLinkActionDefault);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EmbeddedOpenLinkActionLinkWithAccountNumbers extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers();
            DEFAULT_INSTANCE = embeddedOpenLinkActionLinkWithAccountNumbers;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.class, embeddedOpenLinkActionLinkWithAccountNumbers);
        }

        private EmbeddedOpenLinkActionLinkWithAccountNumbers() {
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers) {
            return DEFAULT_INSTANCE.createBuilder(embeddedOpenLinkActionLinkWithAccountNumbers);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EmbeddedOpenLinkActionWithInstitutionId extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId DEFAULT_INSTANCE;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId> PARSER;
        private java.lang.String institutionId_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.DEFAULT_INSTANCE);
            }

            public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.a a(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) this.instance).setInstitutionId(str);
                return this;
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId();
            DEFAULT_INSTANCE = embeddedOpenLinkActionWithInstitutionId;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.class, embeddedOpenLinkActionWithInstitutionId);
        }

        private EmbeddedOpenLinkActionWithInstitutionId() {
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"institutionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.class) {
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

        public final java.lang.String getInstitutionId() {
            return this.institutionId_;
        }

        public final com.google.protobuf.ByteString getInstitutionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.institutionId_);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId) {
            return DEFAULT_INSTANCE.createBuilder(embeddedOpenLinkActionWithInstitutionId);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitutionId(java.lang.String str) {
            this.institutionId_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum b {
        OPEN_LINK_ACTION_DEFAULT(2),
        OPEN_LINK_ACTION_WITH_INSTITUTION_ID(3),
        OPEN_LINK_ACTION_LINK_WITH_ACCOUNT_NUMBERS(4),
        EMBEDDEDOPENLINKACTION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6345a;

        b(int i) {
            this.f6345a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.b forNumber(int i) {
            if (i == 0) {
                return EMBEDDEDOPENLINKACTION_NOT_SET;
            }
            if (i == 2) {
                return OPEN_LINK_ACTION_DEFAULT;
            }
            if (i == 3) {
                return OPEN_LINK_ACTION_WITH_INSTITUTION_ID;
            }
            if (i != 4) {
                return null;
            }
            return OPEN_LINK_ACTION_LINK_WITH_ACCOUNT_NUMBERS;
        }

        public final int getNumber() {
            return this.f6345a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration();
        DEFAULT_INSTANCE = configuration$EmbeddedOpenLinkConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.class, configuration$EmbeddedOpenLinkConfiguration);
    }

    private Configuration$EmbeddedOpenLinkConfiguration() {
    }

    private void clearEmbeddedOpenLinkAction() {
        this.embeddedOpenLinkActionCase_ = 0;
        this.embeddedOpenLinkAction_ = null;
    }

    private void clearEmbeddedWorkflowSessionId() {
        this.embeddedWorkflowSessionId_ = getDefaultInstance().getEmbeddedWorkflowSessionId();
    }

    private void clearIsPolling() {
        this.isPolling_ = false;
    }

    private void clearOpenLinkActionDefault() {
        if (this.embeddedOpenLinkActionCase_ == 2) {
            this.embeddedOpenLinkActionCase_ = 0;
            this.embeddedOpenLinkAction_ = null;
        }
    }

    private void clearOpenLinkActionLinkWithAccountNumbers() {
        if (this.embeddedOpenLinkActionCase_ == 4) {
            this.embeddedOpenLinkActionCase_ = 0;
            this.embeddedOpenLinkAction_ = null;
        }
    }

    private void clearOpenLinkActionWithInstitutionId() {
        if (this.embeddedOpenLinkActionCase_ == 3) {
            this.embeddedOpenLinkActionCase_ = 0;
            this.embeddedOpenLinkAction_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEmbeddedWorkflowSessionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.embeddedWorkflowSessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPolling(boolean z) {
        this.isPolling_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u0007", new java.lang.Object[]{"embeddedOpenLinkAction_", "embeddedOpenLinkActionCase_", "embeddedWorkflowSessionId_", com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.class, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.class, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.class, "isPolling_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.b getEmbeddedOpenLinkActionCase() {
        return com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.b.forNumber(this.embeddedOpenLinkActionCase_);
    }

    public final java.lang.String getEmbeddedWorkflowSessionId() {
        return this.embeddedWorkflowSessionId_;
    }

    public final com.google.protobuf.ByteString getEmbeddedWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.embeddedWorkflowSessionId_);
    }

    public final boolean getIsPolling() {
        return this.isPolling_;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault getOpenLinkActionDefault() {
        return this.embeddedOpenLinkActionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) this.embeddedOpenLinkAction_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers getOpenLinkActionLinkWithAccountNumbers() {
        return this.embeddedOpenLinkActionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) this.embeddedOpenLinkAction_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId getOpenLinkActionWithInstitutionId() {
        return this.embeddedOpenLinkActionCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) this.embeddedOpenLinkAction_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.getDefaultInstance();
    }

    public final boolean hasOpenLinkActionDefault() {
        return this.embeddedOpenLinkActionCase_ == 2;
    }

    public final boolean hasOpenLinkActionLinkWithAccountNumbers() {
        return this.embeddedOpenLinkActionCase_ == 4;
    }

    public final boolean hasOpenLinkActionWithInstitutionId() {
        return this.embeddedOpenLinkActionCase_ == 3;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) this.instance).setEmbeddedWorkflowSessionId(str);
            return this;
        }

        public final void a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) this.instance).setOpenLinkActionDefault(embeddedOpenLinkActionDefault);
        }

        public final void a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) this.instance).setOpenLinkActionWithInstitutionId(embeddedOpenLinkActionWithInstitutionId);
        }

        public final void a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) this.instance).setOpenLinkActionLinkWithAccountNumbers(embeddedOpenLinkActionLinkWithAccountNumbers);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a a(boolean z) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) this.instance).setIsPolling(z);
            return this;
        }
    }

    private void mergeOpenLinkActionDefault(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault) {
        if (this.embeddedOpenLinkActionCase_ != 2 || this.embeddedOpenLinkAction_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.getDefaultInstance()) {
            this.embeddedOpenLinkAction_ = embeddedOpenLinkActionDefault;
        } else {
            this.embeddedOpenLinkAction_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault) this.embeddedOpenLinkAction_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.a) embeddedOpenLinkActionDefault).buildPartial();
        }
        this.embeddedOpenLinkActionCase_ = 2;
    }

    private void mergeOpenLinkActionLinkWithAccountNumbers(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers) {
        if (this.embeddedOpenLinkActionCase_ != 4 || this.embeddedOpenLinkAction_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.getDefaultInstance()) {
            this.embeddedOpenLinkAction_ = embeddedOpenLinkActionLinkWithAccountNumbers;
        } else {
            this.embeddedOpenLinkAction_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers) this.embeddedOpenLinkAction_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.a) embeddedOpenLinkActionLinkWithAccountNumbers).buildPartial();
        }
        this.embeddedOpenLinkActionCase_ = 4;
    }

    private void mergeOpenLinkActionWithInstitutionId(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId) {
        if (this.embeddedOpenLinkActionCase_ != 3 || this.embeddedOpenLinkAction_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.getDefaultInstance()) {
            this.embeddedOpenLinkAction_ = embeddedOpenLinkActionWithInstitutionId;
        } else {
            this.embeddedOpenLinkAction_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId) this.embeddedOpenLinkAction_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.a) embeddedOpenLinkActionWithInstitutionId).buildPartial();
        }
        this.embeddedOpenLinkActionCase_ = 3;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedOpenLinkConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenLinkActionDefault(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault) {
        this.embeddedOpenLinkAction_ = embeddedOpenLinkActionDefault;
        this.embeddedOpenLinkActionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenLinkActionLinkWithAccountNumbers(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers) {
        this.embeddedOpenLinkAction_ = embeddedOpenLinkActionLinkWithAccountNumbers;
        this.embeddedOpenLinkActionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenLinkActionWithInstitutionId(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId) {
        this.embeddedOpenLinkAction_ = embeddedOpenLinkActionWithInstitutionId;
        this.embeddedOpenLinkActionCase_ = 3;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedWorkflowSessionId(java.lang.String str) {
        this.embeddedWorkflowSessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
