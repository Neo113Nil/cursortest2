package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$AutoSubmitConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.c> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int AUTO_SUBMIT_BEHAVIOR_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration> PARSER = null;
    public static final int TEXT_VALIDATION_FIELD_NUMBER = 2;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b> autoSubmitBehavior_converter_ = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.a();
    private int autoSubmitBehaviorMemoizedSerializedSize;
    private com.google.protobuf.Internal.IntList autoSubmitBehavior_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation textValidation_;

    public final class a implements com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b convert(java.lang.Integer num) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.forNumber(num.intValue());
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.UNRECOGNIZED : forNumber;
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        FORM_AUTO_SUBMIT_BEHAVIOR_UNKNOWN(0),
        FORM_AUTO_SUBMIT_BEHAVIOR_ON_PASTE(1),
        FORM_AUTO_SUBMIT_BEHAVIOR_ON_TYPE(2),
        UNRECOGNIZED(-1);

        public static final int FORM_AUTO_SUBMIT_BEHAVIOR_ON_PASTE_VALUE = 1;
        public static final int FORM_AUTO_SUBMIT_BEHAVIOR_ON_TYPE_VALUE = 2;
        public static final int FORM_AUTO_SUBMIT_BEHAVIOR_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AutoSubmitConfiguration.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.AutoSubmitConfiguration.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6115a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration$b$b, reason: collision with other inner class name */
        public static final class C0172b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.C0172b f6116a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.C0172b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.f6115a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b forNumber(int i) {
            if (i == 0) {
                return FORM_AUTO_SUBMIT_BEHAVIOR_UNKNOWN;
            }
            if (i == 1) {
                return FORM_AUTO_SUBMIT_BEHAVIOR_ON_PASTE;
            }
            if (i != 2) {
                return null;
            }
            return FORM_AUTO_SUBMIT_BEHAVIOR_ON_TYPE;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.C0172b.f6116a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6115a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class c extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.c> implements com.google.protobuf.MessageLiteOrBuilder {
        public c() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration common$AutoSubmitConfiguration = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration();
        DEFAULT_INSTANCE = common$AutoSubmitConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.class, common$AutoSubmitConfiguration);
    }

    private Common$AutoSubmitConfiguration() {
    }

    private void addAllAutoSubmitBehavior(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b> iterable) {
        ensureAutoSubmitBehaviorIsMutable();
        java.util.Iterator<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b> it = iterable.iterator();
        while (it.hasNext()) {
            this.autoSubmitBehavior_.addInt(it.next().getNumber());
        }
    }

    private void addAllAutoSubmitBehaviorValue(java.lang.Iterable<java.lang.Integer> iterable) {
        ensureAutoSubmitBehaviorIsMutable();
        java.util.Iterator<java.lang.Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.autoSubmitBehavior_.addInt(it.next().intValue());
        }
    }

    private void addAutoSubmitBehaviorValue(int i) {
        ensureAutoSubmitBehaviorIsMutable();
        this.autoSubmitBehavior_.addInt(i);
    }

    private void clearAutoSubmitBehavior() {
        this.autoSubmitBehavior_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
    }

    private void clearTextValidation() {
        this.textValidation_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureAutoSubmitBehaviorIsMutable() {
        com.google.protobuf.Internal.IntList intList = this.autoSubmitBehavior_;
        if (intList.isModifiable()) {
            return;
        }
        this.autoSubmitBehavior_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutoSubmitBehaviorValue(int i, int i2) {
        ensureAutoSubmitBehaviorIsMutable();
        this.autoSubmitBehavior_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.c();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "autoSubmitBehavior_", "textValidation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b getAutoSubmitBehavior(int i) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.forNumber(this.autoSubmitBehavior_.getInt(i));
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b.UNRECOGNIZED : forNumber;
    }

    public final int getAutoSubmitBehaviorCount() {
        return this.autoSubmitBehavior_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b> getAutoSubmitBehaviorList() {
        return new com.google.protobuf.Internal.ListAdapter(this.autoSubmitBehavior_, autoSubmitBehavior_converter_);
    }

    public final int getAutoSubmitBehaviorValue(int i) {
        return this.autoSubmitBehavior_.getInt(i);
    }

    public final java.util.List<java.lang.Integer> getAutoSubmitBehaviorValueList() {
        return this.autoSubmitBehavior_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation getTextValidation() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation = this.textValidation_;
        return common$TextInputValidation == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public final boolean hasTextValidation() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addAutoSubmitBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b bVar) {
        ensureAutoSubmitBehaviorIsMutable();
        this.autoSubmitBehavior_.addInt(bVar.getNumber());
    }

    private void mergeTextValidation(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation2 = this.textValidation_;
        if (common$TextInputValidation2 == null || common$TextInputValidation2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.getDefaultInstance()) {
            this.textValidation_ = common$TextInputValidation;
        } else {
            this.textValidation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.newBuilder(this.textValidation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.a) common$TextInputValidation).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.c newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration common$AutoSubmitConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(common$AutoSubmitConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAutoSubmitBehavior(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.b bVar) {
        ensureAutoSubmitBehaviorIsMutable();
        this.autoSubmitBehavior_.setInt(i, bVar.getNumber());
    }

    private void setTextValidation(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation) {
        this.textValidation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
