package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$SegmentedInput extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALIDATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private java.lang.String id_ = "";
    private int length_;
    private int size_;
    private int type_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation validation_;

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput common$SegmentedInput) {
        return DEFAULT_INSTANCE.createBuilder(common$SegmentedInput);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasValidation() {
        return (this.bitField0_ & 1) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation getValidation() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation = this.validation_;
        return common$TextInputValidation == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public final int getTypeValue() {
        return this.type_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c getType() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c.forNumber(this.type_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c.UNRECOGNIZED : forNumber;
    }

    public final int getSizeValue() {
        return this.size_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b getSize() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b.forNumber(this.size_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b.UNRECOGNIZED : forNumber;
    }

    public final int getLength() {
        return this.length_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f\u0005ဉ\u0000", new java.lang.Object[]{"bitField0_", "id_", "type_", "length_", "size_", "validation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.class) {
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

    private void setValidation(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation) {
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    private void setType(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c cVar) {
        this.type_ = cVar.getNumber();
    }

    private void setSizeValue(int i) {
        this.size_ = i;
    }

    private void setSize(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b bVar) {
        this.size_ = bVar.getNumber();
    }

    private void setLength(int i) {
        this.length_ = i;
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeValidation(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation2 = this.validation_;
        if (common$TextInputValidation2 != null && common$TextInputValidation2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.getDefaultInstance()) {
            common$TextInputValidation = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.newBuilder(this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.a) common$TextInputValidation).buildPartial();
        }
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearValidation() {
        this.validation_ = null;
        this.bitField0_ &= -2;
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        INPUT_SIZE_UNKNOWN(0),
        INPUT_SIZE_40(1),
        INPUT_SIZE_48(2),
        INPUT_SIZE_56(3),
        UNRECOGNIZED(-1);

        public static final int INPUT_SIZE_40_VALUE = 1;
        public static final int INPUT_SIZE_48_VALUE = 2;
        public static final int INPUT_SIZE_56_VALUE = 3;
        public static final int INPUT_SIZE_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SegmentedInput.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SegmentedInput.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6155a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6155a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$b$b, reason: collision with other inner class name */
        public static final class C0183b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b.C0183b f6156a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b.C0183b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b.C0183b.f6156a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.b forNumber(int i) {
            if (i == 0) {
                return INPUT_SIZE_UNKNOWN;
            }
            if (i == 1) {
                return INPUT_SIZE_40;
            }
            if (i == 2) {
                return INPUT_SIZE_48;
            }
            if (i != 3) {
                return null;
            }
            return INPUT_SIZE_56;
        }

        b(int i) {
            this.f6155a = i;
        }
    }

    public enum c implements com.google.protobuf.Internal.EnumLite {
        INPUT_TYPE_UNKNOWN(0),
        INPUT_TYPE_TEXT(1),
        INPUT_TYPE_NUMBER(2),
        INPUT_TYPE_PASSWORD(3),
        INPUT_TYPE_TELEPHONE(4),
        UNRECOGNIZED(-1);

        public static final int INPUT_TYPE_NUMBER_VALUE = 2;
        public static final int INPUT_TYPE_PASSWORD_VALUE = 3;
        public static final int INPUT_TYPE_TELEPHONE_VALUE = 4;
        public static final int INPUT_TYPE_TEXT_VALUE = 1;
        public static final int INPUT_TYPE_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SegmentedInput.c.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SegmentedInput.c.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6157a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6157a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SegmentedInput.c.b f6158a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SegmentedInput.c.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SegmentedInput.c.b.f6158a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.c forNumber(int i) {
            if (i == 0) {
                return INPUT_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return INPUT_TYPE_TEXT;
            }
            if (i == 2) {
                return INPUT_TYPE_NUMBER;
            }
            if (i == 3) {
                return INPUT_TYPE_PASSWORD;
            }
            if (i != 4) {
                return null;
            }
            return INPUT_TYPE_TELEPHONE;
        }

        c(int i) {
            this.f6157a = i;
        }
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearLength() {
        this.length_ = 0;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private Common$SegmentedInput() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput common$SegmentedInput = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput();
        DEFAULT_INSTANCE = common$SegmentedInput;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.class, common$SegmentedInput);
    }
}
