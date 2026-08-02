package com.google.crypto.tink.proto;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class KeyTypeEntry extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.KeyTypeEntry, com.google.crypto.tink.proto.KeyTypeEntry.Builder> implements com.google.crypto.tink.proto.KeyTypeEntryOrBuilder {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final com.google.crypto.tink.proto.KeyTypeEntry DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeyTypeEntry> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private java.lang.String primitiveName_ = "";
    private java.lang.String typeUrl_ = "";
    private java.lang.String catalogueName_ = "";

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    private KeyTypeEntry() {
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public final java.lang.String getPrimitiveName() {
        return this.primitiveName_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getPrimitiveNameBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.primitiveName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimitiveName(java.lang.String str) {
        this.primitiveName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimitiveName() {
        this.primitiveName_ = getDefaultInstance().getPrimitiveName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimitiveNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.primitiveName_ = byteString.toStringUtf8();
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public final java.lang.String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.typeUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(java.lang.String str) {
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.typeUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public final int getKeyManagerVersion() {
        return this.keyManagerVersion_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyManagerVersion(int i) {
        this.keyManagerVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyManagerVersion() {
        this.keyManagerVersion_ = 0;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public final boolean getNewKeyAllowed() {
        return this.newKeyAllowed_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewKeyAllowed(boolean z) {
        this.newKeyAllowed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewKeyAllowed() {
        this.newKeyAllowed_ = false;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public final java.lang.String getCatalogueName() {
        return this.catalogueName_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getCatalogueNameBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.catalogueName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCatalogueName(java.lang.String str) {
        this.catalogueName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCatalogueName() {
        this.catalogueName_ = getDefaultInstance().getCatalogueName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCatalogueNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.catalogueName_ = byteString.toStringUtf8();
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.proto.KeyTypeEntry) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry.Builder newBuilder(com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry) {
        return DEFAULT_INSTANCE.createBuilder(keyTypeEntry);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.KeyTypeEntry, com.google.crypto.tink.proto.KeyTypeEntry.Builder> implements com.google.crypto.tink.proto.KeyTypeEntryOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.proto.KeyTypeEntry.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clear() {
            return super.clear();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* renamed from: clone */
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mo10407clone() {
            return super.mo10407clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* renamed from: clone */
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mo10407clone() {
            return super.mo10407clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public final /* bridge */ /* synthetic */ java.lang.Object mo10407clone() throws java.lang.CloneNotSupportedException {
            return super.mo10407clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((com.google.crypto.tink.proto.KeyTypeEntry.Builder) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i, i2, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return super.mergeFrom(codedInputStream);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) {
            return super.mergeFrom(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return super.mergeFrom(inputStream);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return super.mergeFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i, i2, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return super.mergeFrom(bArr, extensionRegistryLite);
        }

        private Builder() {
            super(com.google.crypto.tink.proto.KeyTypeEntry.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public final java.lang.String getPrimitiveName() {
            return ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).getPrimitiveName();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getPrimitiveNameBytes() {
            return ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).getPrimitiveNameBytes();
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder setPrimitiveName(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).setPrimitiveName(str);
            return this;
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder clearPrimitiveName() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).clearPrimitiveName();
            return this;
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder setPrimitiveNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).setPrimitiveNameBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public final java.lang.String getTypeUrl() {
            return ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).getTypeUrl();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
            return ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).getTypeUrlBytes();
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder setTypeUrl(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).setTypeUrl(str);
            return this;
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder clearTypeUrl() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).clearTypeUrl();
            return this;
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).setTypeUrlBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public final int getKeyManagerVersion() {
            return ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).getKeyManagerVersion();
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder setKeyManagerVersion(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).setKeyManagerVersion(i);
            return this;
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder clearKeyManagerVersion() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).clearKeyManagerVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public final boolean getNewKeyAllowed() {
            return ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).getNewKeyAllowed();
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder setNewKeyAllowed(boolean z) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).setNewKeyAllowed(z);
            return this;
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder clearNewKeyAllowed() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).clearNewKeyAllowed();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public final java.lang.String getCatalogueName() {
            return ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).getCatalogueName();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getCatalogueNameBytes() {
            return ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).getCatalogueNameBytes();
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder setCatalogueName(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).setCatalogueName(str);
            return this;
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder clearCatalogueName() {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).clearCatalogueName();
            return this;
        }

        public final com.google.crypto.tink.proto.KeyTypeEntry.Builder setCatalogueNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.proto.KeyTypeEntry) this.instance).setCatalogueNameBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KeyTypeEntry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.proto.KeyTypeEntry.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.proto.KeyTypeEntry.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.proto.KeyTypeEntry();
            case 2:
                return new com.google.crypto.tink.proto.KeyTypeEntry.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new java.lang.Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeyTypeEntry> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.proto.KeyTypeEntry.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    static {
        com.google.crypto.tink.proto.KeyTypeEntry keyTypeEntry = new com.google.crypto.tink.proto.KeyTypeEntry();
        DEFAULT_INSTANCE = keyTypeEntry;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.proto.KeyTypeEntry.class, keyTypeEntry);
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeyTypeEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
