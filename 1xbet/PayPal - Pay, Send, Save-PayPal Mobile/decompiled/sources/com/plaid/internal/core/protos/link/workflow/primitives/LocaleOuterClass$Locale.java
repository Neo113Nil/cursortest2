package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class LocaleOuterClass$Locale extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale, com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int COUNTRY_CODES_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale DEFAULT_INSTANCE;
    public static final int DISPLAY_LANGUAGE_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale> PARSER;
    private java.lang.String displayLanguage_ = "";
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> countryCodes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale, com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale = new com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale();
        DEFAULT_INSTANCE = localeOuterClass$Locale;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.class, localeOuterClass$Locale);
    }

    private LocaleOuterClass$Locale() {
    }

    private void addAllCountryCodes(java.lang.Iterable<java.lang.String> iterable) {
        ensureCountryCodesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.countryCodes_);
    }

    private void addCountryCodesBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(byteString.toStringUtf8());
    }

    private void clearCountryCodes() {
        this.countryCodes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDisplayLanguage() {
        this.displayLanguage_ = getDefaultInstance().getDisplayLanguage();
    }

    private void ensureCountryCodesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.countryCodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.countryCodes_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDisplayLanguageBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.displayLanguage_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.k.f6372a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new java.lang.Object[]{"displayLanguage_", "countryCodes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.class) {
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

    public final java.lang.String getCountryCodes(int i) {
        return this.countryCodes_.get(i);
    }

    public final com.google.protobuf.ByteString getCountryCodesBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.countryCodes_.get(i));
    }

    public final int getCountryCodesCount() {
        return this.countryCodes_.size();
    }

    public final java.util.List<java.lang.String> getCountryCodesList() {
        return this.countryCodes_;
    }

    public final java.lang.String getDisplayLanguage() {
        return this.displayLanguage_;
    }

    public final com.google.protobuf.ByteString getDisplayLanguageBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.displayLanguage_);
    }

    private void addCountryCodes(java.lang.String str) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(str);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale localeOuterClass$Locale) {
        return DEFAULT_INSTANCE.createBuilder(localeOuterClass$Locale);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setCountryCodes(int i, java.lang.String str) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.set(i, str);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setDisplayLanguage(java.lang.String str) {
        this.displayLanguage_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
