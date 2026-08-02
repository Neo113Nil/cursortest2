package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$EmbeddedComponentConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int BUTTON_COMPONENT_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int CHIP_COMPONENT_CONFIGURATION_FIELD_NUMBER = 3;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration DEFAULT_INSTANCE;
    public static final int INSTITUTION_SELECT_COMPONENT_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int MINI_CARD_COMPONENT_CONFIGURATION_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration> PARSER;
    private int componentConfigurationCase_ = 0;
    private java.lang.Object componentConfiguration_;

    public static final class ButtonComponentConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ButtonComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ButtonComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration buttonComponentConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration();
            DEFAULT_INSTANCE = buttonComponentConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration.class, buttonComponentConfiguration);
        }

        private ButtonComponentConfiguration() {
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ButtonComponentConfiguration.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ButtonComponentConfiguration.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ButtonComponentConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration buttonComponentConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(buttonComponentConfiguration);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ChipComponentConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ChipComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ChipComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration chipComponentConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration();
            DEFAULT_INSTANCE = chipComponentConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration.class, chipComponentConfiguration);
        }

        private ChipComponentConfiguration() {
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ChipComponentConfiguration.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ChipComponentConfiguration.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ChipComponentConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration chipComponentConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(chipComponentConfiguration);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InstitutionSelectComponentConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration institutionSelectComponentConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration();
            DEFAULT_INSTANCE = institutionSelectComponentConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.class, institutionSelectComponentConfiguration);
        }

        private InstitutionSelectComponentConfiguration() {
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration institutionSelectComponentConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(institutionSelectComponentConfiguration);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MiniCardComponentConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.MiniCardComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.MiniCardComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration miniCardComponentConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration();
            DEFAULT_INSTANCE = miniCardComponentConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration.class, miniCardComponentConfiguration);
        }

        private MiniCardComponentConfiguration() {
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.MiniCardComponentConfiguration.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.MiniCardComponentConfiguration.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.MiniCardComponentConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration miniCardComponentConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(miniCardComponentConfiguration);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        INSTITUTION_SELECT_COMPONENT_CONFIGURATION(1),
        BUTTON_COMPONENT_CONFIGURATION(2),
        CHIP_COMPONENT_CONFIGURATION(3),
        MINI_CARD_COMPONENT_CONFIGURATION(4),
        COMPONENTCONFIGURATION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6344a;

        b(int i) {
            this.f6344a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.b forNumber(int i) {
            if (i == 0) {
                return COMPONENTCONFIGURATION_NOT_SET;
            }
            if (i == 1) {
                return INSTITUTION_SELECT_COMPONENT_CONFIGURATION;
            }
            if (i == 2) {
                return BUTTON_COMPONENT_CONFIGURATION;
            }
            if (i == 3) {
                return CHIP_COMPONENT_CONFIGURATION;
            }
            if (i != 4) {
                return null;
            }
            return MINI_CARD_COMPONENT_CONFIGURATION;
        }

        public final int getNumber() {
            return this.f6344a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration();
        DEFAULT_INSTANCE = configuration$EmbeddedComponentConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.class, configuration$EmbeddedComponentConfiguration);
    }

    private Configuration$EmbeddedComponentConfiguration() {
    }

    private void clearButtonComponentConfiguration() {
        if (this.componentConfigurationCase_ == 2) {
            this.componentConfigurationCase_ = 0;
            this.componentConfiguration_ = null;
        }
    }

    private void clearChipComponentConfiguration() {
        if (this.componentConfigurationCase_ == 3) {
            this.componentConfigurationCase_ = 0;
            this.componentConfiguration_ = null;
        }
    }

    private void clearComponentConfiguration() {
        this.componentConfigurationCase_ = 0;
        this.componentConfiguration_ = null;
    }

    private void clearInstitutionSelectComponentConfiguration() {
        if (this.componentConfigurationCase_ == 1) {
            this.componentConfigurationCase_ = 0;
            this.componentConfiguration_ = null;
        }
    }

    private void clearMiniCardComponentConfiguration() {
        if (this.componentConfigurationCase_ == 4) {
            this.componentConfigurationCase_ = 0;
            this.componentConfiguration_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new java.lang.Object[]{"componentConfiguration_", "componentConfigurationCase_", com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.class, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration.class, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration.class, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration getButtonComponentConfiguration() {
        return this.componentConfigurationCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) this.componentConfiguration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration getChipComponentConfiguration() {
        return this.componentConfigurationCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) this.componentConfiguration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.b getComponentConfigurationCase() {
        return com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.b.forNumber(this.componentConfigurationCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration getInstitutionSelectComponentConfiguration() {
        return this.componentConfigurationCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) this.componentConfiguration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration getMiniCardComponentConfiguration() {
        return this.componentConfigurationCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) this.componentConfiguration_ : com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration.getDefaultInstance();
    }

    public final boolean hasButtonComponentConfiguration() {
        return this.componentConfigurationCase_ == 2;
    }

    public final boolean hasChipComponentConfiguration() {
        return this.componentConfigurationCase_ == 3;
    }

    public final boolean hasInstitutionSelectComponentConfiguration() {
        return this.componentConfigurationCase_ == 1;
    }

    public final boolean hasMiniCardComponentConfiguration() {
        return this.componentConfigurationCase_ == 4;
    }

    private void mergeButtonComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration buttonComponentConfiguration) {
        if (this.componentConfigurationCase_ != 2 || this.componentConfiguration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration.getDefaultInstance()) {
            this.componentConfiguration_ = buttonComponentConfiguration;
        } else {
            this.componentConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration) this.componentConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ButtonComponentConfiguration.a) buttonComponentConfiguration).buildPartial();
        }
        this.componentConfigurationCase_ = 2;
    }

    private void mergeChipComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration chipComponentConfiguration) {
        if (this.componentConfigurationCase_ != 3 || this.componentConfiguration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration.getDefaultInstance()) {
            this.componentConfiguration_ = chipComponentConfiguration;
        } else {
            this.componentConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration) this.componentConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.ChipComponentConfiguration.a) chipComponentConfiguration).buildPartial();
        }
        this.componentConfigurationCase_ = 3;
    }

    private void mergeInstitutionSelectComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration institutionSelectComponentConfiguration) {
        if (this.componentConfigurationCase_ != 1 || this.componentConfiguration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.getDefaultInstance()) {
            this.componentConfiguration_ = institutionSelectComponentConfiguration;
        } else {
            this.componentConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration) this.componentConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration.a) institutionSelectComponentConfiguration).buildPartial();
        }
        this.componentConfigurationCase_ = 1;
    }

    private void mergeMiniCardComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration miniCardComponentConfiguration) {
        if (this.componentConfigurationCase_ != 4 || this.componentConfiguration_ == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration.getDefaultInstance()) {
            this.componentConfiguration_ = miniCardComponentConfiguration;
        } else {
            this.componentConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration) this.componentConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.EmbeddedComponentConfiguration.MiniCardComponentConfiguration.a) miniCardComponentConfiguration).buildPartial();
        }
        this.componentConfigurationCase_ = 4;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedComponentConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setButtonComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ButtonComponentConfiguration buttonComponentConfiguration) {
        this.componentConfiguration_ = buttonComponentConfiguration;
        this.componentConfigurationCase_ = 2;
    }

    private void setChipComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.ChipComponentConfiguration chipComponentConfiguration) {
        this.componentConfiguration_ = chipComponentConfiguration;
        this.componentConfigurationCase_ = 3;
    }

    private void setInstitutionSelectComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.InstitutionSelectComponentConfiguration institutionSelectComponentConfiguration) {
        this.componentConfiguration_ = institutionSelectComponentConfiguration;
        this.componentConfigurationCase_ = 1;
    }

    private void setMiniCardComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.MiniCardComponentConfiguration miniCardComponentConfiguration) {
        this.componentConfiguration_ = miniCardComponentConfiguration;
        this.componentConfigurationCase_ = 4;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
