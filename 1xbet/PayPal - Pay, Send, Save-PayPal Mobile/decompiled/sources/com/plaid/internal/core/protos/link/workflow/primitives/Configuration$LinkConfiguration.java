package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$LinkConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.b> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACCOUNT_FILTER_FIELD_NUMBER = 7;
    public static final int CLIENT_NAME_FIELD_NUMBER = 22;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration DEFAULT_INSTANCE;
    public static final int ENABLE_ACCOUNT_SELECT_FIELD_NUMBER = 18;
    public static final int INITIAL_PRODUCTS_FIELD_NUMBER = 6;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 23;
    public static final int LINK_CUSTOMIZATION_NAME_FIELD_NUMBER = 5;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 1;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 25;
    public static final int OAUTH_ANDROID_PACKAGE_NAME_FIELD_NUMBER = 27;
    public static final int OAUTH_NONCE_FIELD_NUMBER = 16;
    public static final int OAUTH_REDIRECT_URI_FIELD_NUMBER = 11;
    public static final int OAUTH_STATE_ID_FIELD_NUMBER = 15;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 4;
    public static final int TOKEN_FIELD_NUMBER = 24;
    public static final int USER_FIELD_NUMBER = 8;
    public static final int USER_ID_FIELD_NUMBER = 26;
    public static final int WEBHOOK_FIELD_NUMBER = 17;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 28;
    public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 12;
    private int bitField0_;
    private boolean enableAccountSelect_;
    private com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale locale_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User user_;
    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> accountFilter_ = com.google.protobuf.MapFieldLite.emptyMapField();
    private java.lang.String linkOpenId_ = "";
    private java.lang.String linkPersistentId_ = "";
    private java.lang.String publicKey_ = "";
    private java.lang.String linkCustomizationName_ = "";
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> initialProducts_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String oauthRedirectUri_ = "";
    private java.lang.String webviewRedirectUri_ = "";
    private java.lang.String oauthStateId_ = "";
    private java.lang.String oauthNonce_ = "";
    private java.lang.String webhook_ = "";
    private java.lang.String clientName_ = "";
    private java.lang.String institutionId_ = "";
    private java.lang.String token_ = "";
    private java.lang.String userId_ = "";
    private java.lang.String oauthAndroidPackageName_ = "";
    private java.lang.String webviewFallbackId_ = "";

    public static final class RepeatedAccountSubtype extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.RepeatedAccountSubtype.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> PARSER = null;
        public static final int SUBTYPES_FIELD_NUMBER = 1;
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> subtypes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.RepeatedAccountSubtype.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype repeatedAccountSubtype = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype();
            DEFAULT_INSTANCE = repeatedAccountSubtype;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype.class, repeatedAccountSubtype);
        }

        private RepeatedAccountSubtype() {
        }

        private void addAllSubtypes(java.lang.Iterable<java.lang.String> iterable) {
            ensureSubtypesIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.subtypes_);
        }

        private void addSubtypesBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            ensureSubtypesIsMutable();
            this.subtypes_.add(byteString.toStringUtf8());
        }

        private void clearSubtypes() {
            this.subtypes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSubtypesIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.subtypes_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.subtypes_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.RepeatedAccountSubtype.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.RepeatedAccountSubtype.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new java.lang.Object[]{"subtypes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype.class) {
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

        public final java.lang.String getSubtypes(int i) {
            return this.subtypes_.get(i);
        }

        public final com.google.protobuf.ByteString getSubtypesBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.subtypes_.get(i));
        }

        public final int getSubtypesCount() {
            return this.subtypes_.size();
        }

        public final java.util.List<java.lang.String> getSubtypesList() {
            return this.subtypes_;
        }

        private void addSubtypes(java.lang.String str) {
            ensureSubtypesIsMutable();
            this.subtypes_.add(str);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.RepeatedAccountSubtype.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype repeatedAccountSubtype) {
            return DEFAULT_INSTANCE.createBuilder(repeatedAccountSubtype);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setSubtypes(int i, java.lang.String str) {
            ensureSubtypesIsMutable();
            this.subtypes_.set(i, str);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class User extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.User.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User DEFAULT_INSTANCE;
        public static final int EMAIL_ADDRESS_FIELD_NUMBER = 2;
        public static final int EMAIL_ADDRESS_VERIFIED_TIME_FIELD_NUMBER = 4;
        public static final int LEGAL_NAME_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User> PARSER = null;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 3;
        public static final int PHONE_NUMBER_VERIFIED_TIME_FIELD_NUMBER = 5;
        private int bitField0_;
        private com.google.protobuf.Timestamp emailAddressVerifiedTime_;
        private com.google.protobuf.Timestamp phoneNumberVerifiedTime_;
        private java.lang.String legalName_ = "";
        private java.lang.String emailAddress_ = "";
        private java.lang.String phoneNumber_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.User.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User user = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User();
            DEFAULT_INSTANCE = user;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User.class, user);
        }

        private User() {
        }

        private void clearEmailAddress() {
            this.emailAddress_ = getDefaultInstance().getEmailAddress();
        }

        private void clearEmailAddressVerifiedTime() {
            this.emailAddressVerifiedTime_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLegalName() {
            this.legalName_ = getDefaultInstance().getLegalName();
        }

        private void clearPhoneNumber() {
            this.phoneNumber_ = getDefaultInstance().getPhoneNumber();
        }

        private void clearPhoneNumberVerifiedTime() {
            this.phoneNumberVerifiedTime_ = null;
            this.bitField0_ &= -3;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.User.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEmailAddressBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.emailAddress_ = byteString.toStringUtf8();
        }

        private void setLegalNameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.legalName_ = byteString.toStringUtf8();
        }

        private void setPhoneNumberBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.phoneNumber_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.User.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new java.lang.Object[]{"bitField0_", "legalName_", "emailAddress_", "phoneNumber_", "emailAddressVerifiedTime_", "phoneNumberVerifiedTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User.class) {
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

        public final java.lang.String getEmailAddress() {
            return this.emailAddress_;
        }

        public final com.google.protobuf.ByteString getEmailAddressBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.emailAddress_);
        }

        public final com.google.protobuf.Timestamp getEmailAddressVerifiedTime() {
            com.google.protobuf.Timestamp timestamp = this.emailAddressVerifiedTime_;
            return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
        }

        public final java.lang.String getLegalName() {
            return this.legalName_;
        }

        public final com.google.protobuf.ByteString getLegalNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.legalName_);
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber_;
        }

        public final com.google.protobuf.ByteString getPhoneNumberBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.phoneNumber_);
        }

        public final com.google.protobuf.Timestamp getPhoneNumberVerifiedTime() {
            com.google.protobuf.Timestamp timestamp = this.phoneNumberVerifiedTime_;
            return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
        }

        public final boolean hasEmailAddressVerifiedTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasPhoneNumberVerifiedTime() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeEmailAddressVerifiedTime(com.google.protobuf.Timestamp timestamp) {
            com.google.protobuf.Timestamp timestamp2 = this.emailAddressVerifiedTime_;
            if (timestamp2 == null || timestamp2 == com.google.protobuf.Timestamp.getDefaultInstance()) {
                this.emailAddressVerifiedTime_ = timestamp;
            } else {
                this.emailAddressVerifiedTime_ = com.google.protobuf.Timestamp.newBuilder(this.emailAddressVerifiedTime_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePhoneNumberVerifiedTime(com.google.protobuf.Timestamp timestamp) {
            com.google.protobuf.Timestamp timestamp2 = this.phoneNumberVerifiedTime_;
            if (timestamp2 == null || timestamp2 == com.google.protobuf.Timestamp.getDefaultInstance()) {
                this.phoneNumberVerifiedTime_ = timestamp;
            } else {
                this.phoneNumberVerifiedTime_ = com.google.protobuf.Timestamp.newBuilder(this.phoneNumberVerifiedTime_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.User.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User user) {
            return DEFAULT_INSTANCE.createBuilder(user);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEmailAddressVerifiedTime(com.google.protobuf.Timestamp timestamp) {
            this.emailAddressVerifiedTime_ = timestamp;
            this.bitField0_ |= 1;
        }

        private void setPhoneNumberVerifiedTime(com.google.protobuf.Timestamp timestamp) {
            this.phoneNumberVerifiedTime_ = timestamp;
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setEmailAddress(java.lang.String str) {
            this.emailAddress_ = str;
        }

        private void setLegalName(java.lang.String str) {
            this.legalName_ = str;
        }

        private void setPhoneNumber(java.lang.String str) {
            this.phoneNumber_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.google.protobuf.MapEntryLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> f6346a = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype.getDefaultInstance());
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public b() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration configuration$LinkConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration();
        DEFAULT_INSTANCE = configuration$LinkConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.class, configuration$LinkConfiguration);
    }

    private Configuration$LinkConfiguration() {
    }

    private void addAllInitialProducts(java.lang.Iterable<java.lang.String> iterable) {
        ensureInitialProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.initialProducts_);
    }

    private void addInitialProductsBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureInitialProductsIsMutable();
        this.initialProducts_.add(byteString.toStringUtf8());
    }

    private void clearClientName() {
        this.clientName_ = getDefaultInstance().getClientName();
    }

    private void clearEnableAccountSelect() {
        this.enableAccountSelect_ = false;
    }

    private void clearInitialProducts() {
        this.initialProducts_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    private void clearLinkCustomizationName() {
        this.linkCustomizationName_ = getDefaultInstance().getLinkCustomizationName();
    }

    private void clearLinkOpenId() {
        this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
    }

    private void clearLinkPersistentId() {
        this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
    }

    private void clearLocale() {
        this.locale_ = null;
        this.bitField0_ &= -2;
    }

    private void clearOauthAndroidPackageName() {
        this.oauthAndroidPackageName_ = getDefaultInstance().getOauthAndroidPackageName();
    }

    private void clearOauthNonce() {
        this.oauthNonce_ = getDefaultInstance().getOauthNonce();
    }

    private void clearOauthRedirectUri() {
        this.oauthRedirectUri_ = getDefaultInstance().getOauthRedirectUri();
    }

    private void clearOauthStateId() {
        this.oauthStateId_ = getDefaultInstance().getOauthStateId();
    }

    private void clearPublicKey() {
        this.publicKey_ = getDefaultInstance().getPublicKey();
    }

    private void clearToken() {
        this.token_ = getDefaultInstance().getToken();
    }

    private void clearUser() {
        this.user_ = null;
        this.bitField0_ &= -3;
    }

    private void clearUserId() {
        this.userId_ = getDefaultInstance().getUserId();
    }

    private void clearWebhook() {
        this.webhook_ = getDefaultInstance().getWebhook();
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    private void clearWebviewRedirectUri() {
        this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
    }

    private void ensureInitialProductsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.initialProducts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.initialProducts_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> getMutableAccountFilterMap() {
        return internalGetMutableAccountFilter();
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> internalGetAccountFilter() {
        return this.accountFilter_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> internalGetMutableAccountFilter() {
        if (!this.accountFilter_.isMutable()) {
            this.accountFilter_ = this.accountFilter_.mutableCopy();
        }
        return this.accountFilter_;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.clientName_ = byteString.toStringUtf8();
    }

    private void setEnableAccountSelect(boolean z) {
        this.enableAccountSelect_ = z;
    }

    private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
    }

    private void setLinkCustomizationNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.linkCustomizationName_ = byteString.toStringUtf8();
    }

    private void setLinkOpenIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.linkOpenId_ = byteString.toStringUtf8();
    }

    private void setLinkPersistentIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.linkPersistentId_ = byteString.toStringUtf8();
    }

    private void setOauthAndroidPackageNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthAndroidPackageName_ = byteString.toStringUtf8();
    }

    private void setOauthNonceBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthNonce_ = byteString.toStringUtf8();
    }

    private void setOauthRedirectUriBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthRedirectUri_ = byteString.toStringUtf8();
    }

    private void setOauthStateIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthStateId_ = byteString.toStringUtf8();
    }

    private void setPublicKeyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.publicKey_ = byteString.toStringUtf8();
    }

    private void setTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.token_ = byteString.toStringUtf8();
    }

    private void setUserIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.userId_ = byteString.toStringUtf8();
    }

    private void setWebhookBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webhook_ = byteString.toStringUtf8();
    }

    private void setWebviewFallbackIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    private void setWebviewRedirectUriBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewRedirectUri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.b();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u001c\u0014\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ\u0006Ț\u00072\bဉ\u0001\u000bȈ\fȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012\u0007\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019ဉ\u0000\u001aȈ\u001bȈ\u001cȈ", new java.lang.Object[]{"bitField0_", "linkOpenId_", "linkPersistentId_", "publicKey_", "linkCustomizationName_", "initialProducts_", "accountFilter_", com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.a.f6346a, "user_", "oauthRedirectUri_", "webviewRedirectUri_", "oauthStateId_", "oauthNonce_", "webhook_", "enableAccountSelect_", "clientName_", "institutionId_", "token_", "locale_", "userId_", "oauthAndroidPackageName_", "webviewFallbackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.class) {
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

    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> getAccountFilter() {
        return getAccountFilterMap();
    }

    public final int getAccountFilterCount() {
        return internalGetAccountFilter().size();
    }

    public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> getAccountFilterMap() {
        return java.util.Collections.unmodifiableMap(internalGetAccountFilter());
    }

    public final java.lang.String getClientName() {
        return this.clientName_;
    }

    public final com.google.protobuf.ByteString getClientNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.clientName_);
    }

    public final boolean getEnableAccountSelect() {
        return this.enableAccountSelect_;
    }

    public final java.lang.String getInitialProducts(int i) {
        return this.initialProducts_.get(i);
    }

    public final com.google.protobuf.ByteString getInitialProductsBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.initialProducts_.get(i));
    }

    public final int getInitialProductsCount() {
        return this.initialProducts_.size();
    }

    public final java.util.List<java.lang.String> getInitialProductsList() {
        return this.initialProducts_;
    }

    public final java.lang.String getInstitutionId() {
        return this.institutionId_;
    }

    public final com.google.protobuf.ByteString getInstitutionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.institutionId_);
    }

    public final java.lang.String getLinkCustomizationName() {
        return this.linkCustomizationName_;
    }

    public final com.google.protobuf.ByteString getLinkCustomizationNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.linkCustomizationName_);
    }

    public final java.lang.String getLinkOpenId() {
        return this.linkOpenId_;
    }

    public final com.google.protobuf.ByteString getLinkOpenIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.linkOpenId_);
    }

    public final java.lang.String getLinkPersistentId() {
        return this.linkPersistentId_;
    }

    public final com.google.protobuf.ByteString getLinkPersistentIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.linkPersistentId_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale getLocale() {
        com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale = this.locale_;
        return localeOuterClass$Locale == null ? com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.getDefaultInstance() : localeOuterClass$Locale;
    }

    public final java.lang.String getOauthAndroidPackageName() {
        return this.oauthAndroidPackageName_;
    }

    public final com.google.protobuf.ByteString getOauthAndroidPackageNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.oauthAndroidPackageName_);
    }

    public final java.lang.String getOauthNonce() {
        return this.oauthNonce_;
    }

    public final com.google.protobuf.ByteString getOauthNonceBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.oauthNonce_);
    }

    public final java.lang.String getOauthRedirectUri() {
        return this.oauthRedirectUri_;
    }

    public final com.google.protobuf.ByteString getOauthRedirectUriBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.oauthRedirectUri_);
    }

    public final java.lang.String getOauthStateId() {
        return this.oauthStateId_;
    }

    public final com.google.protobuf.ByteString getOauthStateIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.oauthStateId_);
    }

    public final java.lang.String getPublicKey() {
        return this.publicKey_;
    }

    public final com.google.protobuf.ByteString getPublicKeyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.publicKey_);
    }

    public final java.lang.String getToken() {
        return this.token_;
    }

    public final com.google.protobuf.ByteString getTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.token_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User getUser() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User user = this.user_;
        return user == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User.getDefaultInstance() : user;
    }

    public final java.lang.String getUserId() {
        return this.userId_;
    }

    public final com.google.protobuf.ByteString getUserIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.userId_);
    }

    public final java.lang.String getWebhook() {
        return this.webhook_;
    }

    public final com.google.protobuf.ByteString getWebhookBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webhook_);
    }

    public final java.lang.String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public final com.google.protobuf.ByteString getWebviewFallbackIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public final java.lang.String getWebviewRedirectUri() {
        return this.webviewRedirectUri_;
    }

    public final com.google.protobuf.ByteString getWebviewRedirectUriBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewRedirectUri_);
    }

    public final boolean hasLocale() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasUser() {
        return (this.bitField0_ & 2) != 0;
    }

    private void addInitialProducts(java.lang.String str) {
        ensureInitialProductsIsMutable();
        this.initialProducts_.add(str);
    }

    private void mergeLocale(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale) {
        com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale2 = this.locale_;
        if (localeOuterClass$Locale2 == null || localeOuterClass$Locale2 == com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.getDefaultInstance()) {
            this.locale_ = localeOuterClass$Locale;
        } else {
            this.locale_ = com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.newBuilder(this.locale_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.a) localeOuterClass$Locale).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeUser(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User user) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User user2 = this.user_;
        if (user2 == null || user2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User.getDefaultInstance()) {
            this.user_ = user;
        } else {
            this.user_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User.newBuilder(this.user_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.LinkConfiguration.User.a) user).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.b newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration configuration$LinkConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setInitialProducts(int i, java.lang.String str) {
        ensureInitialProductsIsMutable();
        this.initialProducts_.set(i, str);
    }

    private void setLocale(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale) {
        this.locale_ = localeOuterClass$Locale;
        this.bitField0_ |= 1;
    }

    private void setUser(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.User user) {
        this.user_ = user;
        this.bitField0_ |= 2;
    }

    public final boolean containsAccountFilter(java.lang.String str) {
        return internalGetAccountFilter().containsKey(str);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setClientName(java.lang.String str) {
        this.clientName_ = str;
    }

    private void setInstitutionId(java.lang.String str) {
        this.institutionId_ = str;
    }

    private void setLinkCustomizationName(java.lang.String str) {
        this.linkCustomizationName_ = str;
    }

    private void setLinkOpenId(java.lang.String str) {
        this.linkOpenId_ = str;
    }

    private void setLinkPersistentId(java.lang.String str) {
        this.linkPersistentId_ = str;
    }

    private void setOauthAndroidPackageName(java.lang.String str) {
        this.oauthAndroidPackageName_ = str;
    }

    private void setOauthNonce(java.lang.String str) {
        this.oauthNonce_ = str;
    }

    private void setOauthRedirectUri(java.lang.String str) {
        this.oauthRedirectUri_ = str;
    }

    private void setOauthStateId(java.lang.String str) {
        this.oauthStateId_ = str;
    }

    private void setPublicKey(java.lang.String str) {
        this.publicKey_ = str;
    }

    private void setToken(java.lang.String str) {
        this.token_ = str;
    }

    private void setUserId(java.lang.String str) {
        this.userId_ = str;
    }

    private void setWebhook(java.lang.String str) {
        this.webhook_ = str;
    }

    private void setWebviewFallbackId(java.lang.String str) {
        this.webviewFallbackId_ = str;
    }

    private void setWebviewRedirectUri(java.lang.String str) {
        this.webviewRedirectUri_ = str;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype getAccountFilterOrDefault(java.lang.String str, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype repeatedAccountSubtype) {
        com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> internalGetAccountFilter = internalGetAccountFilter();
        return internalGetAccountFilter.containsKey(str) ? internalGetAccountFilter.get(str) : repeatedAccountSubtype;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype getAccountFilterOrThrow(java.lang.String str) {
        com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.RepeatedAccountSubtype> internalGetAccountFilter = internalGetAccountFilter();
        if (internalGetAccountFilter.containsKey(str)) {
            return internalGetAccountFilter.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
