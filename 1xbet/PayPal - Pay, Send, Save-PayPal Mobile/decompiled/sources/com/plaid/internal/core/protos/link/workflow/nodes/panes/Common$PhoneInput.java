package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$PhoneInput extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CALLING_CODE_LABEL_FIELD_NUMBER = 3;
    public static final int COUNTRY_CODES_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput> PARSER = null;
    public static final int PHONE_NUMBER_LABEL_FIELD_NUMBER = 5;
    public static final int PREFILLED_COUNTRY_FIELD_NUMBER = 8;
    public static final int PREFILLED_TEXT_FIELD_NUMBER = 6;
    public static final int PREFILL_OPTIONS_FIELD_NUMBER = 7;
    public static final int SHOULD_HIDE_CALLING_CODE_FLAG_FIELD_NUMBER = 9;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString callingCodeLabel_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString phoneNumberLabel_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country prefilledCountry_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString prefilledText_;
    private boolean shouldHideCallingCodeFlag_;
    private java.lang.String id_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country> countryCodes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class Country extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PhoneInput.Country.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.b {
        public static final int CALLING_CODE_FIELD_NUMBER = 4;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 5;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country> PARSER;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString callingCode_;
        private int id_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString name_;
        private java.lang.String icon_ = "";
        private java.lang.String countryCode_ = "";

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PhoneInput.Country.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PhoneInput.Country.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country) {
            return DEFAULT_INSTANCE.createBuilder(country);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasCallingCode() {
            return (this.bitField0_ & 2) != 0;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getName() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.name_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final int getId() {
            return this.id_;
        }

        public final com.google.protobuf.ByteString getIconBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.icon_);
        }

        public final java.lang.String getIcon() {
            return this.icon_;
        }

        public final com.google.protobuf.ByteString getCountryCodeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.countryCode_);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getCallingCode() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.callingCode_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PhoneInput.Country.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005Ȉ", new java.lang.Object[]{"bitField0_", "id_", "name_", "icon_", "callingCode_", "countryCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country.class) {
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

        private void setName(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.name_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        private void setId(int i) {
            this.id_ = i;
        }

        private void setIconBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        private void setIcon(java.lang.String str) {
            this.icon_ = str;
        }

        private void setCountryCodeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.countryCode_ = byteString.toStringUtf8();
        }

        private void setCountryCode(java.lang.String str) {
            this.countryCode_ = str;
        }

        private void setCallingCode(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.callingCode_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void mergeName(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.name_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.name_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.name_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        private void mergeCallingCode(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.callingCode_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.callingCode_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.callingCode_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void clearName() {
            this.name_ = null;
            this.bitField0_ &= -2;
        }

        private void clearId() {
            this.id_ = 0;
        }

        private void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        private void clearCountryCode() {
            this.countryCode_ = getDefaultInstance().getCountryCode();
        }

        private void clearCallingCode() {
            this.callingCode_ = null;
            this.bitField0_ &= -3;
        }

        private Country() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PhoneInput.Country.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.b {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country();
            DEFAULT_INSTANCE = country;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country.class, country);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    private void addCountryCodes(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(i, country);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addCountryCodes(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(country);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput common$PhoneInput) {
        return DEFAULT_INSTANCE.createBuilder(common$PhoneInput);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasPrefilledText() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasPrefilledCountry() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasPrefillOptions() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasPhoneNumberLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasCallingCodeLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean getShouldHideCallingCodeFlag() {
        return this.shouldHideCallingCodeFlag_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPrefilledText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.prefilledText_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country getPrefilledCountry() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country = this.prefilledCountry_;
        return country == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country.getDefaultInstance() : country;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions getPrefillOptions() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions = this.prefillOptions_;
        return prefillOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.getDefaultInstance() : prefillOptions;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPhoneNumberLabel() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.phoneNumberLabel_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.b> getCountryCodesOrBuilderList() {
        return this.countryCodes_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.b getCountryCodesOrBuilder(int i) {
        return this.countryCodes_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country> getCountryCodesList() {
        return this.countryCodes_;
    }

    public final int getCountryCodesCount() {
        return this.countryCodes_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country getCountryCodes(int i) {
        return this.countryCodes_.get(i);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getCallingCodeLabel() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.callingCodeLabel_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\t\u0007", new java.lang.Object[]{"bitField0_", "id_", "countryCodes_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country.class, "callingCodeLabel_", "phoneNumberLabel_", "prefilledText_", "prefillOptions_", "prefilledCountry_", "shouldHideCallingCodeFlag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.class) {
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

    private void setShouldHideCallingCodeFlag(boolean z) {
        this.shouldHideCallingCodeFlag_ = z;
    }

    private void setPrefilledText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.prefilledText_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setPrefilledCountry(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country) {
        this.prefilledCountry_ = country;
        this.bitField0_ |= 16;
    }

    private void setPrefillOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions) {
        this.prefillOptions_ = prefillOptions;
        this.bitField0_ |= 8;
    }

    private void setPhoneNumberLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.phoneNumberLabel_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void setCountryCodes(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.set(i, country);
    }

    private void setCallingCodeLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.callingCodeLabel_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void removeCountryCodes(int i) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergePrefilledText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.prefilledText_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.prefilledText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.prefilledText_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void mergePrefilledCountry(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country country2 = this.prefilledCountry_;
        if (country2 != null && country2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country.getDefaultInstance()) {
            country = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country.newBuilder(this.prefilledCountry_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PhoneInput.Country.a) country).buildPartial();
        }
        this.prefilledCountry_ = country;
        this.bitField0_ |= 16;
    }

    private void mergePrefillOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions2 = this.prefillOptions_;
        if (prefillOptions2 != null && prefillOptions2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.getDefaultInstance()) {
            prefillOptions = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.newBuilder(this.prefillOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.PrefillOptions.a) prefillOptions).buildPartial();
        }
        this.prefillOptions_ = prefillOptions;
        this.bitField0_ |= 8;
    }

    private void mergePhoneNumberLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.phoneNumberLabel_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.phoneNumberLabel_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.phoneNumberLabel_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void mergeCallingCodeLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.callingCodeLabel_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.callingCodeLabel_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.callingCodeLabel_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureCountryCodesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country> protobufList = this.countryCodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.countryCodes_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearShouldHideCallingCodeFlag() {
        this.shouldHideCallingCodeFlag_ = false;
    }

    private void clearPrefilledText() {
        this.prefilledText_ = null;
        this.bitField0_ &= -5;
    }

    private void clearPrefilledCountry() {
        this.prefilledCountry_ = null;
        this.bitField0_ &= -17;
    }

    private void clearPrefillOptions() {
        this.prefillOptions_ = null;
        this.bitField0_ &= -9;
    }

    private void clearPhoneNumberLabel() {
        this.phoneNumberLabel_ = null;
        this.bitField0_ &= -3;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearCountryCodes() {
        this.countryCodes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearCallingCodeLabel() {
        this.callingCodeLabel_ = null;
        this.bitField0_ &= -2;
    }

    private void addAllCountryCodes(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.Country> iterable) {
        ensureCountryCodesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.countryCodes_);
    }

    private Common$PhoneInput() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput common$PhoneInput = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput();
        DEFAULT_INSTANCE = common$PhoneInput;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.class, common$PhoneInput);
    }
}
