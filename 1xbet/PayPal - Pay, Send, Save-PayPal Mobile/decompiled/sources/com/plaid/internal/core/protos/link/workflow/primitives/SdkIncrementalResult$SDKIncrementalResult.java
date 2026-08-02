package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class SdkIncrementalResult$SDKIncrementalResult extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.a> implements com.plaid.internal.core.protos.link.workflow.primitives.r {
    public static final int BANK_INCOME_COMPLETED_FIELD_NUMBER = 102;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult DEFAULT_INSTANCE;
    public static final int ITEM_ADD_RESULT_FIELD_NUMBER = 101;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> PARSER = null;
    public static final int RESULT_TYPE_FIELD_NUMBER = 100;
    private int resultCase_ = 0;
    private java.lang.String resultType_ = "";
    private java.lang.Object result_;

    public static final class BankIncomeCompleted extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted DEFAULT_INSTANCE;
        public static final int METADATA_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted> PARSER = null;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata metadata_;
        private java.lang.String userId_ = "";

        public static final class Metadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata DEFAULT_INSTANCE;
            public static final int INSTITUTION_FIELD_NUMBER = 2;
            public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution institution_;
            private java.lang.String linkSessionId_ = "";

            public static final class Institution extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution DEFAULT_INSTANCE;
                public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution> PARSER;
                private java.lang.String name_ = "";
                private java.lang.String institutionId_ = "";

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution institution = new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution();
                    DEFAULT_INSTANCE = institution;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.class, institution);
                }

                private Institution() {
                }

                private void clearInstitutionId() {
                    this.institutionId_ = getDefaultInstance().getInstitutionId();
                }

                private void clearName() {
                    this.name_ = getDefaultInstance().getName();
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.institutionId_ = byteString.toStringUtf8();
                }

                private void setNameBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.primitives.q.f6381a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"name_", "institutionId_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.class) {
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

                public final java.lang.String getName() {
                    return this.name_;
                }

                public final com.google.protobuf.ByteString getNameBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution institution) {
                    return DEFAULT_INSTANCE.createBuilder(institution);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setInstitutionId(java.lang.String str) {
                    this.institutionId_ = str;
                }

                private void setName(java.lang.String str) {
                    this.name_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata metadata = new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata();
                DEFAULT_INSTANCE = metadata;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.class, metadata);
            }

            private Metadata() {
            }

            private void clearInstitution() {
                this.institution_ = null;
                this.bitField0_ &= -2;
            }

            private void clearLinkSessionId() {
                this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setLinkSessionIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.linkSessionId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.primitives.q.f6381a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "linkSessionId_", "institution_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution getInstitution() {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution institution = this.institution_;
                return institution == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.getDefaultInstance() : institution;
            }

            public final java.lang.String getLinkSessionId() {
                return this.linkSessionId_;
            }

            public final com.google.protobuf.ByteString getLinkSessionIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.linkSessionId_);
            }

            public final boolean hasInstitution() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeInstitution(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution institution) {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution institution2 = this.institution_;
                if (institution2 == null || institution2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.getDefaultInstance()) {
                    this.institution_ = institution;
                } else {
                    this.institution_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.newBuilder(this.institution_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution.a) institution).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata metadata) {
                return DEFAULT_INSTANCE.createBuilder(metadata);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setInstitution(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.Institution institution) {
                this.institution_ = institution;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setLinkSessionId(java.lang.String str) {
                this.linkSessionId_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted bankIncomeCompleted = new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted();
            DEFAULT_INSTANCE = bankIncomeCompleted;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted.class, bankIncomeCompleted);
        }

        private BankIncomeCompleted() {
        }

        private void clearMetadata() {
            this.metadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setUserIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.q.f6381a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "userId_", "metadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata getMetadata() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata metadata = this.metadata_;
            return metadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.getDefaultInstance() : metadata;
        }

        public final java.lang.String getUserId() {
            return this.userId_;
        }

        public final com.google.protobuf.ByteString getUserIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.userId_);
        }

        public final boolean hasMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeMetadata(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata metadata) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.newBuilder(this.metadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata.a) metadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted bankIncomeCompleted) {
            return DEFAULT_INSTANCE.createBuilder(bankIncomeCompleted);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setMetadata(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.Metadata metadata) {
            this.metadata_ = metadata;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setUserId(java.lang.String str) {
            this.userId_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ItemAddResult extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult DEFAULT_INSTANCE;
        public static final int METADATA_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult> PARSER = null;
        public static final int PUBLIC_TOKEN_FIELD_NUMBER = 1;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata metadata_;
        private java.lang.String publicToken_ = "";

        public static final class Metadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata DEFAULT_INSTANCE;
            public static final int INSTITUTION_FIELD_NUMBER = 2;
            public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution institution_;
            private java.lang.String linkSessionId_ = "";

            public static final class Institution extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.a> implements com.google.protobuf.MessageLiteOrBuilder {
                private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution DEFAULT_INSTANCE;
                public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution> PARSER;
                private java.lang.String name_ = "";
                private java.lang.String institutionId_ = "";

                public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.a> implements com.google.protobuf.MessageLiteOrBuilder {
                    public a() {
                        super(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.DEFAULT_INSTANCE);
                    }
                }

                static {
                    com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution institution = new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution();
                    DEFAULT_INSTANCE = institution;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.class, institution);
                }

                private Institution() {
                }

                private void clearInstitutionId() {
                    this.institutionId_ = getDefaultInstance().getInstitutionId();
                }

                private void clearName() {
                    this.name_ = getDefaultInstance().getName();
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseDelimitedFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(java.nio.ByteBuffer byteBuffer) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.institutionId_ = byteString.toStringUtf8();
                }

                private void setNameBytes(com.google.protobuf.ByteString byteString) {
                    com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    com.google.protobuf.Parser parser;
                    switch (com.plaid.internal.core.protos.link.workflow.primitives.q.f6381a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution();
                        case 2:
                            return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.a();
                        case 3:
                            return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"name_", "institutionId_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution> parser2 = PARSER;
                            if (parser2 != null) {
                                return parser2;
                            }
                            synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.class) {
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

                public final java.lang.String getName() {
                    return this.name_;
                }

                public final com.google.protobuf.ByteString getNameBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution institution) {
                    return DEFAULT_INSTANCE.createBuilder(institution);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(com.google.protobuf.ByteString byteString) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void setInstitutionId(java.lang.String str) {
                    this.institutionId_ = str;
                }

                private void setName(java.lang.String str) {
                    this.name_ = str;
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(byte[] bArr) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(java.io.InputStream inputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                    return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata metadata = new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata();
                DEFAULT_INSTANCE = metadata;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.class, metadata);
            }

            private Metadata() {
            }

            private void clearInstitution() {
                this.institution_ = null;
                this.bitField0_ &= -2;
            }

            private void clearLinkSessionId() {
                this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setLinkSessionIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.linkSessionId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.primitives.q.f6381a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "linkSessionId_", "institution_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.class) {
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

            public final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution getInstitution() {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution institution = this.institution_;
                return institution == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.getDefaultInstance() : institution;
            }

            public final java.lang.String getLinkSessionId() {
                return this.linkSessionId_;
            }

            public final com.google.protobuf.ByteString getLinkSessionIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.linkSessionId_);
            }

            public final boolean hasInstitution() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeInstitution(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution institution) {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution institution2 = this.institution_;
                if (institution2 == null || institution2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.getDefaultInstance()) {
                    this.institution_ = institution;
                } else {
                    this.institution_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.newBuilder(this.institution_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution.a) institution).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata metadata) {
                return DEFAULT_INSTANCE.createBuilder(metadata);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setInstitution(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.Institution institution) {
                this.institution_ = institution;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setLinkSessionId(java.lang.String str) {
                this.linkSessionId_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult itemAddResult = new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult();
            DEFAULT_INSTANCE = itemAddResult;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult.class, itemAddResult);
        }

        private ItemAddResult() {
        }

        private void clearMetadata() {
            this.metadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPublicToken() {
            this.publicToken_ = getDefaultInstance().getPublicToken();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPublicTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.publicToken_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.q.f6381a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "publicToken_", "metadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata getMetadata() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata metadata = this.metadata_;
            return metadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.getDefaultInstance() : metadata;
        }

        public final java.lang.String getPublicToken() {
            return this.publicToken_;
        }

        public final com.google.protobuf.ByteString getPublicTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.publicToken_);
        }

        public final boolean hasMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeMetadata(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata metadata) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.newBuilder(this.metadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata.a) metadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult itemAddResult) {
            return DEFAULT_INSTANCE.createBuilder(itemAddResult);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setMetadata(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.Metadata metadata) {
            this.metadata_ = metadata;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setPublicToken(java.lang.String str) {
            this.publicToken_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.a> implements com.plaid.internal.core.protos.link.workflow.primitives.r {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        ITEM_ADD_RESULT(101),
        BANK_INCOME_COMPLETED(102),
        RESULT_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6352a;

        b(int i) {
            this.f6352a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.b forNumber(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 101) {
                return ITEM_ADD_RESULT;
            }
            if (i != 102) {
                return null;
            }
            return BANK_INCOME_COMPLETED;
        }

        public final int getNumber() {
            return this.f6352a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult = new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult();
        DEFAULT_INSTANCE = sdkIncrementalResult$SDKIncrementalResult;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.class, sdkIncrementalResult$SDKIncrementalResult);
    }

    private SdkIncrementalResult$SDKIncrementalResult() {
    }

    private void clearBankIncomeCompleted() {
        if (this.resultCase_ == 102) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearItemAddResult() {
        if (this.resultCase_ == 101) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    private void clearResultType() {
        this.resultType_ = getDefaultInstance().getResultType();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setResultTypeBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.resultType_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.q.f6381a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000df\u0003\u0000\u0000\u0000dȈe<\u0000f<\u0000", new java.lang.Object[]{"result_", "resultCase_", "resultType_", com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult.class, com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted getBankIncomeCompleted() {
        return this.resultCase_ == 102 ? (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) this.result_ : com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult getItemAddResult() {
        return this.resultCase_ == 101 ? (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) this.result_ : com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.b getResultCase() {
        return com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.b.forNumber(this.resultCase_);
    }

    public final java.lang.String getResultType() {
        return this.resultType_;
    }

    public final com.google.protobuf.ByteString getResultTypeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.resultType_);
    }

    public final boolean hasBankIncomeCompleted() {
        return this.resultCase_ == 102;
    }

    public final boolean hasItemAddResult() {
        return this.resultCase_ == 101;
    }

    private void mergeBankIncomeCompleted(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted bankIncomeCompleted) {
        if (this.resultCase_ != 102 || this.result_ == com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted.getDefaultInstance()) {
            this.result_ = bankIncomeCompleted;
        } else {
            this.result_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted) this.result_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.BankIncomeCompleted.a) bankIncomeCompleted).buildPartial();
        }
        this.resultCase_ = 102;
    }

    private void mergeItemAddResult(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult itemAddResult) {
        if (this.resultCase_ != 101 || this.result_ == com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult.getDefaultInstance()) {
            this.result_ = itemAddResult;
        } else {
            this.result_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult.newBuilder((com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult) this.result_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult.SDKIncrementalResult.ItemAddResult.a) itemAddResult).buildPartial();
        }
        this.resultCase_ = 101;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
        return DEFAULT_INSTANCE.createBuilder(sdkIncrementalResult$SDKIncrementalResult);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setBankIncomeCompleted(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.BankIncomeCompleted bankIncomeCompleted) {
        this.result_ = bankIncomeCompleted;
        this.resultCase_ = 102;
    }

    private void setItemAddResult(com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult.ItemAddResult itemAddResult) {
        this.result_ = itemAddResult;
        this.resultCase_ = 101;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setResultType(java.lang.String str) {
        this.resultType_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
