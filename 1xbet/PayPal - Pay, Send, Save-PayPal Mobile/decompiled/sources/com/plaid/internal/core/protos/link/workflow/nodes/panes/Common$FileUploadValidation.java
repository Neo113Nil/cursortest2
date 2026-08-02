package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$FileUploadValidation extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule> rules_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class Rule extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.b {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule DEFAULT_INSTANCE;
        public static final int ERROR_DETAIL_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int UNIQUE_NAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString errorDetail_;
        private int validationCase_ = 0;
        private java.lang.Object validation_;

        public static final class Size extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size DEFAULT_INSTANCE;
            public static final int MAX_KB_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size> PARSER;
            private int maxKb_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size size = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size();
                DEFAULT_INSTANCE = size;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.class, size);
            }

            private Size() {
            }

            private void clearMaxKb() {
                this.maxKb_ = 0;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setMaxKb(int i) {
                this.maxKb_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"maxKb_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.class) {
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

            public final int getMaxKb() {
                return this.maxKb_;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size size) {
                return DEFAULT_INSTANCE.createBuilder(size);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class UniqueName extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName uniqueName = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName();
                DEFAULT_INSTANCE = uniqueName;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.class, uniqueName);
            }

            private UniqueName() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName uniqueName) {
                return DEFAULT_INSTANCE.createBuilder(uniqueName);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.b {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            SIZE(2),
            UNIQUE_NAME(3),
            VALIDATION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6131a;

            b(int i) {
                this.f6131a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.b forNumber(int i) {
                if (i == 0) {
                    return VALIDATION_NOT_SET;
                }
                if (i == 2) {
                    return SIZE;
                }
                if (i != 3) {
                    return null;
                }
                return UNIQUE_NAME;
            }

            public final int getNumber() {
                return this.f6131a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule rule = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule();
            DEFAULT_INSTANCE = rule;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule.class, rule);
        }

        private Rule() {
        }

        private void clearErrorDetail() {
            this.errorDetail_ = null;
            this.bitField0_ &= -2;
        }

        private void clearSize() {
            if (this.validationCase_ == 2) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearUniqueName() {
            if (this.validationCase_ == 3) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearValidation() {
            this.validationCase_ = 0;
            this.validation_ = null;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"validation_", "validationCase_", "bitField0_", "errorDetail_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getErrorDetail() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.errorDetail_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size getSize() {
            return this.validationCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) this.validation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName getUniqueName() {
            return this.validationCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) this.validation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.b getValidationCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.b.forNumber(this.validationCase_);
        }

        public final boolean hasErrorDetail() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasSize() {
            return this.validationCase_ == 2;
        }

        public final boolean hasUniqueName() {
            return this.validationCase_ == 3;
        }

        private void mergeErrorDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.errorDetail_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.errorDetail_ = common$LocalizedString;
            } else {
                this.errorDetail_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.errorDetail_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeSize(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size size) {
            if (this.validationCase_ != 2 || this.validation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.getDefaultInstance()) {
                this.validation_ = size;
            } else {
                this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size) this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size.a) size).buildPartial();
            }
            this.validationCase_ = 2;
        }

        private void mergeUniqueName(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName uniqueName) {
            if (this.validationCase_ != 3 || this.validation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.getDefaultInstance()) {
                this.validation_ = uniqueName;
            } else {
                this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName) this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName.a) uniqueName).buildPartial();
            }
            this.validationCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule rule) {
            return DEFAULT_INSTANCE.createBuilder(rule);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setErrorDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.errorDetail_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        private void setSize(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.Size size) {
            this.validation_ = size;
            this.validationCase_ = 2;
        }

        private void setUniqueName(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FileUploadValidation.Rule.UniqueName uniqueName) {
            this.validation_ = uniqueName;
            this.validationCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.DEFAULT_INSTANCE);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation common$FileUploadValidation = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation();
        DEFAULT_INSTANCE = common$FileUploadValidation;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.class, common$FileUploadValidation);
    }

    private Common$FileUploadValidation() {
    }

    private void addAllRules(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule> iterable) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.rules_);
    }

    private void clearRules() {
        this.rules_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"rules_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule getRules(int i) {
        return this.rules_.get(i);
    }

    public final int getRulesCount() {
        return this.rules_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule> getRulesList() {
        return this.rules_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.b getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.b> getRulesOrBuilderList() {
        return this.rules_;
    }

    private void addRules(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule rule) {
        ensureRulesIsMutable();
        this.rules_.add(rule);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation common$FileUploadValidation) {
        return DEFAULT_INSTANCE.createBuilder(common$FileUploadValidation);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setRules(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule rule) {
        ensureRulesIsMutable();
        this.rules_.set(i, rule);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addRules(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation.Rule rule) {
        ensureRulesIsMutable();
        this.rules_.add(i, rule);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
