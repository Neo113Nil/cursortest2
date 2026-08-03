package com.moloco.sdk;

/* loaded from: classes5.dex */
public final class BidToken {

    public interface BidTokenRequestV2OrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents getBidTokenComponents();

        boolean hasBidTokenComponents();
    }

    public interface BidTokenRequestV3OrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    }

    public interface BidTokenResponseV2OrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getBidToken();

        com.google.protobuf.ByteString getBidTokenBytes();
    }

    public interface BidTokenResponseV3OrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getBidToken();

        com.google.protobuf.ByteString getBidTokenBytes();

        com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs getClientTokenConfigs();

        java.lang.String getPk();

        com.google.protobuf.ByteString getPkBytes();

        boolean hasClientTokenConfigs();
    }

    public interface ClientBidTokenComponentsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo getAccessibilityInfo();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo getAdInfo();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo getAudioInfo();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo getBatteryInfo();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.Device getDevice();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo getDirInfo();

        java.lang.String getIdfv();

        com.google.protobuf.ByteString getIdfvBytes();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData getImpLvlRevData();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo getInfo();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo getMemoryInfo();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo getNetworkInfo();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy getPrivacy();

        com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig getTestConfig();

        boolean hasAccessibilityInfo();

        boolean hasAdInfo();

        boolean hasAudioInfo();

        boolean hasBatteryInfo();

        boolean hasDevice();

        boolean hasDirInfo();

        boolean hasIdfv();

        boolean hasImpLvlRevData();

        boolean hasInfo();

        boolean hasMemoryInfo();

        boolean hasNetworkInfo();

        boolean hasPrivacy();

        boolean hasTestConfig();
    }

    public interface ClientBidTokenOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getEs();

        com.google.protobuf.ByteString getPayload();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private BidToken() {
    }

    public static final class BidTokenRequestV2 extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.BidTokenRequestV2, com.moloco.sdk.BidToken.BidTokenRequestV2.Builder> implements com.moloco.sdk.BidToken.BidTokenRequestV2OrBuilder {
        public static final int BID_TOKEN_COMPONENTS_FIELD_NUMBER = 2;
        private static final com.moloco.sdk.BidToken.BidTokenRequestV2 DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2> PARSER;
        private com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents_;

        public interface BidTokenComponentsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getIdfv();

            com.google.protobuf.ByteString getIdfvBytes();

            com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy getPrivacy();

            boolean hasIdfv();

            boolean hasPrivacy();
        }

        private BidTokenRequestV2() {
        }

        public static final class BidTokenComponents extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents, com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder> implements com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder {
            private static final com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents DEFAULT_INSTANCE;
            public static final int IDFV_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents> PARSER = null;
            public static final int PRIVACY_FIELD_NUMBER = 2;
            private int bitField0_;
            private java.lang.String idfv_ = "";
            private com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy_;

            public interface PrivacyOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
                boolean getCcpa();

                boolean getCoppa();

                boolean getGdpr();

                java.lang.String getTcfConsentString();

                com.google.protobuf.ByteString getTcfConsentStringBytes();

                java.lang.String getUsPrivacy();

                com.google.protobuf.ByteString getUsPrivacyBytes();

                boolean hasCcpa();

                boolean hasCoppa();

                boolean hasGdpr();

                boolean hasTcfConsentString();

                boolean hasUsPrivacy();
            }

            private BidTokenComponents() {
            }

            public static final class Privacy extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy, com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder> implements com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder {
                public static final int CCPA_FIELD_NUMBER = 1;
                public static final int COPPA_FIELD_NUMBER = 3;
                private static final com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy DEFAULT_INSTANCE;
                public static final int GDPR_FIELD_NUMBER = 2;
                private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy> PARSER = null;
                public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
                public static final int US_PRIVACY_FIELD_NUMBER = 4;
                private int bitField0_;
                private boolean ccpa_;
                private boolean coppa_;
                private boolean gdpr_;
                private java.lang.String usPrivacy_ = "";
                private java.lang.String tcfConsentString_ = "";

                private Privacy() {
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public boolean hasCcpa() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public boolean getCcpa() {
                    return this.ccpa_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setCcpa(boolean z) {
                    this.bitField0_ |= 1;
                    this.ccpa_ = z;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearCcpa() {
                    this.bitField0_ &= -2;
                    this.ccpa_ = false;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public boolean hasGdpr() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public boolean getGdpr() {
                    return this.gdpr_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setGdpr(boolean z) {
                    this.bitField0_ |= 2;
                    this.gdpr_ = z;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearGdpr() {
                    this.bitField0_ &= -3;
                    this.gdpr_ = false;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public boolean hasCoppa() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public boolean getCoppa() {
                    return this.coppa_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setCoppa(boolean z) {
                    this.bitField0_ |= 4;
                    this.coppa_ = z;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearCoppa() {
                    this.bitField0_ &= -5;
                    this.coppa_ = false;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public boolean hasUsPrivacy() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public java.lang.String getUsPrivacy() {
                    return this.usPrivacy_;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public com.google.protobuf.ByteString getUsPrivacyBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.usPrivacy_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setUsPrivacy(java.lang.String str) {
                    str.getClass();
                    this.bitField0_ |= 8;
                    this.usPrivacy_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearUsPrivacy() {
                    this.bitField0_ &= -9;
                    this.usPrivacy_ = getDefaultInstance().getUsPrivacy();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setUsPrivacyBytes(com.google.protobuf.ByteString byteString) {
                    checkByteStringIsUtf8(byteString);
                    this.usPrivacy_ = byteString.toStringUtf8();
                    this.bitField0_ |= 8;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public boolean hasTcfConsentString() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public java.lang.String getTcfConsentString() {
                    return this.tcfConsentString_;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                public com.google.protobuf.ByteString getTcfConsentStringBytes() {
                    return com.google.protobuf.ByteString.copyFromUtf8(this.tcfConsentString_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setTcfConsentString(java.lang.String str) {
                    str.getClass();
                    this.bitField0_ |= 16;
                    this.tcfConsentString_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearTcfConsentString() {
                    this.bitField0_ &= -17;
                    this.tcfConsentString_ = getDefaultInstance().getTcfConsentString();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setTcfConsentStringBytes(com.google.protobuf.ByteString byteString) {
                    checkByteStringIsUtf8(byteString);
                    this.tcfConsentString_ = byteString.toStringUtf8();
                    this.bitField0_ |= 16;
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder newBuilder(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy) {
                    return DEFAULT_INSTANCE.createBuilder(privacy);
                }

                public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy, com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder> implements com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder {
                    private Builder() {
                        super(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.DEFAULT_INSTANCE);
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public boolean hasCcpa() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasCcpa();
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public boolean getCcpa() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getCcpa();
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder setCcpa(boolean z) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setCcpa(z);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder clearCcpa() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearCcpa();
                        return this;
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public boolean hasGdpr() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasGdpr();
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public boolean getGdpr() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getGdpr();
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder setGdpr(boolean z) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setGdpr(z);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder clearGdpr() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearGdpr();
                        return this;
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public boolean hasCoppa() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasCoppa();
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public boolean getCoppa() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getCoppa();
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder setCoppa(boolean z) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setCoppa(z);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder clearCoppa() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearCoppa();
                        return this;
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public boolean hasUsPrivacy() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasUsPrivacy();
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public java.lang.String getUsPrivacy() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getUsPrivacy();
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public com.google.protobuf.ByteString getUsPrivacyBytes() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getUsPrivacyBytes();
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder setUsPrivacy(java.lang.String str) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setUsPrivacy(str);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder clearUsPrivacy() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearUsPrivacy();
                        return this;
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder setUsPrivacyBytes(com.google.protobuf.ByteString byteString) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setUsPrivacyBytes(byteString);
                        return this;
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public boolean hasTcfConsentString() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasTcfConsentString();
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public java.lang.String getTcfConsentString() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getTcfConsentString();
                    }

                    @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.PrivacyOrBuilder
                    public com.google.protobuf.ByteString getTcfConsentStringBytes() {
                        return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getTcfConsentStringBytes();
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder setTcfConsentString(java.lang.String str) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setTcfConsentString(str);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder clearTcfConsentString() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearTcfConsentString();
                        return this;
                    }

                    public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder setTcfConsentStringBytes(com.google.protobuf.ByteString byteString) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setTcfConsentStringBytes(byteString);
                        return this;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy();
                        case 2:
                            return new com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder();
                        case 3:
                            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new java.lang.Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy> parser = PARSER;
                            if (parser == null) {
                                synchronized (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.class) {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
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
                    com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy = new com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy();
                    DEFAULT_INSTANCE = privacy;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.class, privacy);
                }

                public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }
            }

            @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
            public boolean hasIdfv() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
            public java.lang.String getIdfv() {
                return this.idfv_;
            }

            @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
            public com.google.protobuf.ByteString getIdfvBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.idfv_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIdfv(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.idfv_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIdfv() {
                this.bitField0_ &= -2;
                this.idfv_ = getDefaultInstance().getIdfv();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIdfvBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.idfv_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
            public boolean hasPrivacy() {
                return this.privacy_ != null;
            }

            @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy getPrivacy() {
                com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy = this.privacy_;
                return privacy == null ? com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.getDefaultInstance() : privacy;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPrivacy(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy) {
                privacy.getClass();
                this.privacy_ = privacy;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePrivacy(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy) {
                privacy.getClass();
                com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy2 = this.privacy_;
                if (privacy2 != null && privacy2 != com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.getDefaultInstance()) {
                    this.privacy_ = com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.newBuilder(this.privacy_).mergeFrom((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder) privacy).buildPartial();
                } else {
                    this.privacy_ = privacy;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPrivacy() {
                this.privacy_ = null;
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder newBuilder(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents) {
                return DEFAULT_INSTANCE.createBuilder(bidTokenComponents);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents, com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder> implements com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
                public boolean hasIdfv() {
                    return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).hasIdfv();
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
                public java.lang.String getIdfv() {
                    return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).getIdfv();
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
                public com.google.protobuf.ByteString getIdfvBytes() {
                    return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).getIdfvBytes();
                }

                public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder setIdfv(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).setIdfv(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder clearIdfv() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).clearIdfv();
                    return this;
                }

                public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder setIdfvBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).setIdfvBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
                public boolean hasPrivacy() {
                    return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).hasPrivacy();
                }

                @Override // com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponentsOrBuilder
                public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy getPrivacy() {
                    return ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).getPrivacy();
                }

                public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder setPrivacy(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).setPrivacy(privacy);
                    return this;
                }

                public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder setPrivacy(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).setPrivacy(builder.build());
                    return this;
                }

                public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder mergePrivacy(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Privacy privacy) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).mergePrivacy(privacy);
                    return this;
                }

                public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder clearPrivacy() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents) this.instance).clearPrivacy();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents();
                    case 2:
                        return new com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002\t", new java.lang.Object[]{"bitField0_", "idfv_", "privacy_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents = new com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents();
                DEFAULT_INSTANCE = bidTokenComponents;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.class, bidTokenComponents);
            }

            public static com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.moloco.sdk.BidToken.BidTokenRequestV2OrBuilder
        public boolean hasBidTokenComponents() {
            return this.bidTokenComponents_ != null;
        }

        @Override // com.moloco.sdk.BidToken.BidTokenRequestV2OrBuilder
        public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents getBidTokenComponents() {
            com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents = this.bidTokenComponents_;
            return bidTokenComponents == null ? com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.getDefaultInstance() : bidTokenComponents;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidTokenComponents(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents) {
            bidTokenComponents.getClass();
            this.bidTokenComponents_ = bidTokenComponents;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBidTokenComponents(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents) {
            bidTokenComponents.getClass();
            com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents2 = this.bidTokenComponents_;
            if (bidTokenComponents2 != null && bidTokenComponents2 != com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.getDefaultInstance()) {
                this.bidTokenComponents_ = com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.newBuilder(this.bidTokenComponents_).mergeFrom((com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder) bidTokenComponents).buildPartial();
            } else {
                this.bidTokenComponents_ = bidTokenComponents;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBidTokenComponents() {
            this.bidTokenComponents_ = null;
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2.Builder newBuilder(com.moloco.sdk.BidToken.BidTokenRequestV2 bidTokenRequestV2) {
            return DEFAULT_INSTANCE.createBuilder(bidTokenRequestV2);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.BidTokenRequestV2, com.moloco.sdk.BidToken.BidTokenRequestV2.Builder> implements com.moloco.sdk.BidToken.BidTokenRequestV2OrBuilder {
            private Builder() {
                super(com.moloco.sdk.BidToken.BidTokenRequestV2.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.BidToken.BidTokenRequestV2OrBuilder
            public boolean hasBidTokenComponents() {
                return ((com.moloco.sdk.BidToken.BidTokenRequestV2) this.instance).hasBidTokenComponents();
            }

            @Override // com.moloco.sdk.BidToken.BidTokenRequestV2OrBuilder
            public com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents getBidTokenComponents() {
                return ((com.moloco.sdk.BidToken.BidTokenRequestV2) this.instance).getBidTokenComponents();
            }

            public com.moloco.sdk.BidToken.BidTokenRequestV2.Builder setBidTokenComponents(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenRequestV2) this.instance).setBidTokenComponents(bidTokenComponents);
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenRequestV2.Builder setBidTokenComponents(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenRequestV2) this.instance).setBidTokenComponents(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenRequestV2.Builder mergeBidTokenComponents(com.moloco.sdk.BidToken.BidTokenRequestV2.BidTokenComponents bidTokenComponents) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenRequestV2) this.instance).mergeBidTokenComponents(bidTokenComponents);
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenRequestV2.Builder clearBidTokenComponents() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenRequestV2) this.instance).clearBidTokenComponents();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.BidToken.BidTokenRequestV2();
                case 2:
                    return new com.moloco.sdk.BidToken.BidTokenRequestV2.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new java.lang.Object[]{"bidTokenComponents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.BidToken.BidTokenRequestV2.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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
            com.moloco.sdk.BidToken.BidTokenRequestV2 bidTokenRequestV2 = new com.moloco.sdk.BidToken.BidTokenRequestV2();
            DEFAULT_INSTANCE = bidTokenRequestV2;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.BidTokenRequestV2.class, bidTokenRequestV2);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV2> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.moloco.sdk.BidToken$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static final class BidTokenResponseV2 extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.BidTokenResponseV2, com.moloco.sdk.BidToken.BidTokenResponseV2.Builder> implements com.moloco.sdk.BidToken.BidTokenResponseV2OrBuilder {
        public static final int BID_TOKEN_FIELD_NUMBER = 1;
        private static final com.moloco.sdk.BidToken.BidTokenResponseV2 DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV2> PARSER;
        private java.lang.String bidToken_ = "";

        private BidTokenResponseV2() {
        }

        @Override // com.moloco.sdk.BidToken.BidTokenResponseV2OrBuilder
        public java.lang.String getBidToken() {
            return this.bidToken_;
        }

        @Override // com.moloco.sdk.BidToken.BidTokenResponseV2OrBuilder
        public com.google.protobuf.ByteString getBidTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.bidToken_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidToken(java.lang.String str) {
            str.getClass();
            this.bidToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBidToken() {
            this.bidToken_ = getDefaultInstance().getBidToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidTokenBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.bidToken_ = byteString.toStringUtf8();
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2.Builder newBuilder(com.moloco.sdk.BidToken.BidTokenResponseV2 bidTokenResponseV2) {
            return DEFAULT_INSTANCE.createBuilder(bidTokenResponseV2);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.BidTokenResponseV2, com.moloco.sdk.BidToken.BidTokenResponseV2.Builder> implements com.moloco.sdk.BidToken.BidTokenResponseV2OrBuilder {
            private Builder() {
                super(com.moloco.sdk.BidToken.BidTokenResponseV2.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV2OrBuilder
            public java.lang.String getBidToken() {
                return ((com.moloco.sdk.BidToken.BidTokenResponseV2) this.instance).getBidToken();
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV2OrBuilder
            public com.google.protobuf.ByteString getBidTokenBytes() {
                return ((com.moloco.sdk.BidToken.BidTokenResponseV2) this.instance).getBidTokenBytes();
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV2.Builder setBidToken(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV2) this.instance).setBidToken(str);
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV2.Builder clearBidToken() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV2) this.instance).clearBidToken();
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV2.Builder setBidTokenBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV2) this.instance).setBidTokenBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.BidToken.BidTokenResponseV2();
                case 2:
                    return new com.moloco.sdk.BidToken.BidTokenResponseV2.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"bidToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV2> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.BidToken.BidTokenResponseV2.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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
            com.moloco.sdk.BidToken.BidTokenResponseV2 bidTokenResponseV2 = new com.moloco.sdk.BidToken.BidTokenResponseV2();
            DEFAULT_INSTANCE = bidTokenResponseV2;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.BidTokenResponseV2.class, bidTokenResponseV2);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV2> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class BidTokenRequestV3 extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.BidTokenRequestV3, com.moloco.sdk.BidToken.BidTokenRequestV3.Builder> implements com.moloco.sdk.BidToken.BidTokenRequestV3OrBuilder {
        private static final com.moloco.sdk.BidToken.BidTokenRequestV3 DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV3> PARSER;

        private BidTokenRequestV3() {
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenRequestV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3.Builder newBuilder(com.moloco.sdk.BidToken.BidTokenRequestV3 bidTokenRequestV3) {
            return DEFAULT_INSTANCE.createBuilder(bidTokenRequestV3);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.BidTokenRequestV3, com.moloco.sdk.BidToken.BidTokenRequestV3.Builder> implements com.moloco.sdk.BidToken.BidTokenRequestV3OrBuilder {
            private Builder() {
                super(com.moloco.sdk.BidToken.BidTokenRequestV3.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.BidToken.BidTokenRequestV3();
                case 2:
                    return new com.moloco.sdk.BidToken.BidTokenRequestV3.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV3> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.BidToken.BidTokenRequestV3.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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
            com.moloco.sdk.BidToken.BidTokenRequestV3 bidTokenRequestV3 = new com.moloco.sdk.BidToken.BidTokenRequestV3();
            DEFAULT_INSTANCE = bidTokenRequestV3;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.BidTokenRequestV3.class, bidTokenRequestV3);
        }

        public static com.moloco.sdk.BidToken.BidTokenRequestV3 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenRequestV3> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class BidTokenResponseV3 extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.BidTokenResponseV3, com.moloco.sdk.BidToken.BidTokenResponseV3.Builder> implements com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder {
        public static final int BID_TOKEN_FIELD_NUMBER = 1;
        public static final int CLIENT_TOKEN_CONFIGS_FIELD_NUMBER = 3;
        private static final com.moloco.sdk.BidToken.BidTokenResponseV3 DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV3> PARSER = null;
        public static final int PK_FIELD_NUMBER = 2;
        private com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs_;
        private java.lang.String bidToken_ = "";
        private java.lang.String pk_ = "";

        public interface ClientTokenConfigsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getEnableDbt();
        }

        private BidTokenResponseV3() {
        }

        public static final class ClientTokenConfigs extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs, com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder> implements com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigsOrBuilder {
            private static final com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs DEFAULT_INSTANCE;
            public static final int ENABLE_DBT_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs> PARSER;
            private boolean enableDbt_;

            private ClientTokenConfigs() {
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigsOrBuilder
            public boolean getEnableDbt() {
                return this.enableDbt_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnableDbt(boolean z) {
                this.enableDbt_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnableDbt() {
                this.enableDbt_ = false;
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder newBuilder(com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs) {
                return DEFAULT_INSTANCE.createBuilder(clientTokenConfigs);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs, com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder> implements com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigsOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigsOrBuilder
                public boolean getEnableDbt() {
                    return ((com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) this.instance).getEnableDbt();
                }

                public com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder setEnableDbt(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) this.instance).setEnableDbt(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder clearEnableDbt() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs) this.instance).clearEnableDbt();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs();
                    case 2:
                        return new com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new java.lang.Object[]{"enableDbt_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs = new com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs();
                DEFAULT_INSTANCE = clientTokenConfigs;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.class, clientTokenConfigs);
            }

            public static com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
        public java.lang.String getBidToken() {
            return this.bidToken_;
        }

        @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
        public com.google.protobuf.ByteString getBidTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.bidToken_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidToken(java.lang.String str) {
            str.getClass();
            this.bidToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBidToken() {
            this.bidToken_ = getDefaultInstance().getBidToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidTokenBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.bidToken_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
        public java.lang.String getPk() {
            return this.pk_;
        }

        @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
        public com.google.protobuf.ByteString getPkBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.pk_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPk(java.lang.String str) {
            str.getClass();
            this.pk_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPk() {
            this.pk_ = getDefaultInstance().getPk();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPkBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.pk_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
        public boolean hasClientTokenConfigs() {
            return this.clientTokenConfigs_ != null;
        }

        @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
        public com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs getClientTokenConfigs() {
            com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs = this.clientTokenConfigs_;
            return clientTokenConfigs == null ? com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.getDefaultInstance() : clientTokenConfigs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientTokenConfigs(com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs) {
            clientTokenConfigs.getClass();
            this.clientTokenConfigs_ = clientTokenConfigs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClientTokenConfigs(com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs) {
            clientTokenConfigs.getClass();
            com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs2 = this.clientTokenConfigs_;
            if (clientTokenConfigs2 != null && clientTokenConfigs2 != com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.getDefaultInstance()) {
                this.clientTokenConfigs_ = com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.newBuilder(this.clientTokenConfigs_).mergeFrom((com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder) clientTokenConfigs).buildPartial();
            } else {
                this.clientTokenConfigs_ = clientTokenConfigs;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientTokenConfigs() {
            this.clientTokenConfigs_ = null;
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.BidTokenResponseV3) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3.Builder newBuilder(com.moloco.sdk.BidToken.BidTokenResponseV3 bidTokenResponseV3) {
            return DEFAULT_INSTANCE.createBuilder(bidTokenResponseV3);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.BidTokenResponseV3, com.moloco.sdk.BidToken.BidTokenResponseV3.Builder> implements com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder {
            private Builder() {
                super(com.moloco.sdk.BidToken.BidTokenResponseV3.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
            public java.lang.String getBidToken() {
                return ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).getBidToken();
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
            public com.google.protobuf.ByteString getBidTokenBytes() {
                return ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).getBidTokenBytes();
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder setBidToken(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).setBidToken(str);
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder clearBidToken() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).clearBidToken();
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder setBidTokenBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).setBidTokenBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
            public java.lang.String getPk() {
                return ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).getPk();
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
            public com.google.protobuf.ByteString getPkBytes() {
                return ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).getPkBytes();
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder setPk(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).setPk(str);
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder clearPk() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).clearPk();
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder setPkBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).setPkBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
            public boolean hasClientTokenConfigs() {
                return ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).hasClientTokenConfigs();
            }

            @Override // com.moloco.sdk.BidToken.BidTokenResponseV3OrBuilder
            public com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs getClientTokenConfigs() {
                return ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).getClientTokenConfigs();
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder setClientTokenConfigs(com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).setClientTokenConfigs(clientTokenConfigs);
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder setClientTokenConfigs(com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).setClientTokenConfigs(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder mergeClientTokenConfigs(com.moloco.sdk.BidToken.BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).mergeClientTokenConfigs(clientTokenConfigs);
                return this;
            }

            public com.moloco.sdk.BidToken.BidTokenResponseV3.Builder clearClientTokenConfigs() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.BidTokenResponseV3) this.instance).clearClientTokenConfigs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.BidToken.BidTokenResponseV3();
                case 2:
                    return new com.moloco.sdk.BidToken.BidTokenResponseV3.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new java.lang.Object[]{"bidToken_", "pk_", "clientTokenConfigs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV3> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.BidToken.BidTokenResponseV3.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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
            com.moloco.sdk.BidToken.BidTokenResponseV3 bidTokenResponseV3 = new com.moloco.sdk.BidToken.BidTokenResponseV3();
            DEFAULT_INSTANCE = bidTokenResponseV3;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.BidTokenResponseV3.class, bidTokenResponseV3);
        }

        public static com.moloco.sdk.BidToken.BidTokenResponseV3 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.BidTokenResponseV3> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ClientBidTokenComponents extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents, com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder {
        public static final int ACCESSIBILITY_INFO_FIELD_NUMBER = 11;
        public static final int AD_INFO_FIELD_NUMBER = 8;
        public static final int AUDIO_INFO_FIELD_NUMBER = 10;
        public static final int BATTERY_INFO_FIELD_NUMBER = 9;
        private static final com.moloco.sdk.BidToken.ClientBidTokenComponents DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 3;
        public static final int DIR_INFO_FIELD_NUMBER = 6;
        public static final int IDFV_FIELD_NUMBER = 1;
        public static final int IMP_LVL_REV_DATA_FIELD_NUMBER = 12;
        public static final int INFO_FIELD_NUMBER = 4;
        public static final int MEMORY_INFO_FIELD_NUMBER = 5;
        public static final int NETWORK_INFO_FIELD_NUMBER = 7;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents> PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 2;
        public static final int TEST_CONFIG_FIELD_NUMBER = 13;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo adInfo_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo_;
        private int bitField0_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo_;
        private java.lang.String idfv_ = "";
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo info_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy_;
        private com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig_;

        public interface AccessibilityInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getAccessibilityCaptioningEnabled();

            boolean getAccessibilityLargePointerIcon();

            float getFontScale();

            boolean getReduceBrightColorsActivated();

            boolean hasAccessibilityCaptioningEnabled();

            boolean hasAccessibilityLargePointerIcon();

            boolean hasFontScale();

            boolean hasReduceBrightColorsActivated();
        }

        public interface AdvertisingInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getDnt();

            java.lang.String getId();

            com.google.protobuf.ByteString getIdBytes();

            boolean hasDnt();

            boolean hasId();
        }

        public interface AudioInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState getMuteSwitch();

            int getMuteSwitchValue();

            int getVol();

            boolean hasMuteSwitch();

            boolean hasVol();
        }

        public interface BatteryInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus getBatteryStatus();

            int getBatteryStatusValue();

            boolean getLowPowMode();

            int getMaxBatteryLevel();

            boolean hasBatteryStatus();

            boolean hasLowPowMode();

            boolean hasMaxBatteryLevel();
        }

        public interface DeviceOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getBrand();

            com.google.protobuf.ByteString getBrandBytes();

            java.lang.String getCarrier();

            com.google.protobuf.ByteString getCarrierBytes();

            long getDbt();

            int getDevicetype();

            com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo getGeo();

            int getH();

            java.lang.String getHardware();

            com.google.protobuf.ByteString getHardwareBytes();

            boolean getHasGy();

            java.lang.String getHwv();

            com.google.protobuf.ByteString getHwvBytes();

            int getJs();

            java.lang.String getKbLoc();

            com.google.protobuf.ByteString getKbLocBytes();

            java.lang.String getLanguage();

            com.google.protobuf.ByteString getLanguageBytes();

            java.lang.String getLocale();

            com.google.protobuf.ByteString getLocaleBytes();

            java.lang.String getMake();

            com.google.protobuf.ByteString getMakeBytes();

            java.lang.String getModel();

            com.google.protobuf.ByteString getModelBytes();

            com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation getOrtn();

            int getOrtnValue();

            java.lang.String getOs();

            com.google.protobuf.ByteString getOsBytes();

            java.lang.String getOsv();

            com.google.protobuf.ByteString getOsvBytes();

            int getPpi();

            double getPxratio();

            int getW();

            float getXdpi();

            float getYdpi();

            boolean hasBrand();

            boolean hasCarrier();

            boolean hasDbt();

            boolean hasDevicetype();

            boolean hasGeo();

            boolean hasH();

            boolean hasHardware();

            boolean hasHasGy();

            boolean hasHwv();

            boolean hasJs();

            boolean hasKbLoc();

            boolean hasLanguage();

            boolean hasLocale();

            boolean hasMake();

            boolean hasModel();

            boolean hasOrtn();

            boolean hasOs();

            boolean hasOsv();

            boolean hasPpi();

            boolean hasPxratio();

            boolean hasW();

            boolean hasXdpi();

            boolean hasYdpi();
        }

        public interface DirInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            long getDsizeBytes();

            boolean hasDsizeBytes();
        }

        public interface GeoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            int getUtcoffset();

            boolean hasUtcoffset();
        }

        public interface ImpLvlRevDataOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts getImpCounts();

            long getLastImpTs();

            java.lang.String getSessionId();

            com.google.protobuf.ByteString getSessionIdBytes();

            long getSessionStartTs();

            boolean hasImpCounts();
        }

        public interface MemoryInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getLowMem();

            long getLowMemThresholdBytes();

            long getTotalMemBytes();

            boolean hasLowMem();

            boolean hasLowMemThresholdBytes();

            boolean hasTotalMemBytes();
        }

        public interface NetworkInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            int getMcc();

            int getMnc();

            boolean getRestricted();

            com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType getType();

            int getTypeValue();

            boolean hasMcc();

            boolean hasMnc();

            boolean hasRestricted();

            boolean hasType();
        }

        public interface PrivacyOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getCcpa();

            boolean getCoppa();

            boolean getGdpr();

            java.lang.String getTcfConsentString();

            com.google.protobuf.ByteString getTcfConsentStringBytes();

            java.lang.String getUsPrivacy();

            com.google.protobuf.ByteString getUsPrivacyBytes();

            boolean hasCcpa();

            boolean hasCoppa();

            boolean hasGdpr();

            boolean hasTcfConsentString();

            boolean hasUsPrivacy();
        }

        public interface SdkInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getInitialized();

            boolean hasInitialized();
        }

        public interface TestConfigOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getJsonConfig();

            com.google.protobuf.ByteString getJsonConfigBytes();

            boolean hasJsonConfig();
        }

        private ClientBidTokenComponents() {
        }

        public static final class Privacy extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy, com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder {
            public static final int CCPA_FIELD_NUMBER = 1;
            public static final int COPPA_FIELD_NUMBER = 3;
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy DEFAULT_INSTANCE;
            public static final int GDPR_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy> PARSER = null;
            public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
            public static final int US_PRIVACY_FIELD_NUMBER = 4;
            private int bitField0_;
            private boolean ccpa_;
            private boolean coppa_;
            private boolean gdpr_;
            private java.lang.String usPrivacy_ = "";
            private java.lang.String tcfConsentString_ = "";

            private Privacy() {
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public boolean hasCcpa() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public boolean getCcpa() {
                return this.ccpa_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCcpa(boolean z) {
                this.bitField0_ |= 1;
                this.ccpa_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCcpa() {
                this.bitField0_ &= -2;
                this.ccpa_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public boolean hasGdpr() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public boolean getGdpr() {
                return this.gdpr_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGdpr(boolean z) {
                this.bitField0_ |= 2;
                this.gdpr_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGdpr() {
                this.bitField0_ &= -3;
                this.gdpr_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public boolean hasCoppa() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public boolean getCoppa() {
                return this.coppa_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCoppa(boolean z) {
                this.bitField0_ |= 4;
                this.coppa_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCoppa() {
                this.bitField0_ &= -5;
                this.coppa_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public boolean hasUsPrivacy() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public java.lang.String getUsPrivacy() {
                return this.usPrivacy_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public com.google.protobuf.ByteString getUsPrivacyBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.usPrivacy_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsPrivacy(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.usPrivacy_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUsPrivacy() {
                this.bitField0_ &= -9;
                this.usPrivacy_ = getDefaultInstance().getUsPrivacy();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsPrivacyBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.usPrivacy_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public boolean hasTcfConsentString() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public java.lang.String getTcfConsentString() {
                return this.tcfConsentString_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
            public com.google.protobuf.ByteString getTcfConsentStringBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.tcfConsentString_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTcfConsentString(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.tcfConsentString_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTcfConsentString() {
                this.bitField0_ &= -17;
                this.tcfConsentString_ = getDefaultInstance().getTcfConsentString();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTcfConsentStringBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.tcfConsentString_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy) {
                return DEFAULT_INSTANCE.createBuilder(privacy);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy, com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public boolean hasCcpa() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).hasCcpa();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public boolean getCcpa() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).getCcpa();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder setCcpa(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).setCcpa(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder clearCcpa() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).clearCcpa();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public boolean hasGdpr() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).hasGdpr();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public boolean getGdpr() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).getGdpr();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder setGdpr(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).setGdpr(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder clearGdpr() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).clearGdpr();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public boolean hasCoppa() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).hasCoppa();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public boolean getCoppa() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).getCoppa();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder setCoppa(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).setCoppa(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder clearCoppa() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).clearCoppa();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public boolean hasUsPrivacy() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).hasUsPrivacy();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public java.lang.String getUsPrivacy() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).getUsPrivacy();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public com.google.protobuf.ByteString getUsPrivacyBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).getUsPrivacyBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder setUsPrivacy(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).setUsPrivacy(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder clearUsPrivacy() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).clearUsPrivacy();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder setUsPrivacyBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).setUsPrivacyBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public boolean hasTcfConsentString() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).hasTcfConsentString();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public java.lang.String getTcfConsentString() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).getTcfConsentString();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.PrivacyOrBuilder
                public com.google.protobuf.ByteString getTcfConsentStringBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).getTcfConsentStringBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder setTcfConsentString(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).setTcfConsentString(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder clearTcfConsentString() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).clearTcfConsentString();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder setTcfConsentStringBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy) this.instance).setTcfConsentStringBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new java.lang.Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy = new com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy();
                DEFAULT_INSTANCE = privacy;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.class, privacy);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Device extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.Device, com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder {
            public static final int BRAND_FIELD_NUMBER = 23;
            public static final int CARRIER_FIELD_NUMBER = 6;
            public static final int DBT_FIELD_NUMBER = 15;
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.Device DEFAULT_INSTANCE;
            public static final int DEVICETYPE_FIELD_NUMBER = 7;
            public static final int GEO_FIELD_NUMBER = 9;
            public static final int HARDWARE_FIELD_NUMBER = 22;
            public static final int HAS_GY_FIELD_NUMBER = 17;
            public static final int HWV_FIELD_NUMBER = 5;
            public static final int H_FIELD_NUMBER = 11;
            public static final int JS_FIELD_NUMBER = 8;
            public static final int KB_LOC_FIELD_NUMBER = 18;
            public static final int LANGUAGE_FIELD_NUMBER = 1;
            public static final int LOCALE_FIELD_NUMBER = 19;
            public static final int MAKE_FIELD_NUMBER = 3;
            public static final int MODEL_FIELD_NUMBER = 4;
            public static final int ORTN_FIELD_NUMBER = 16;
            public static final int OSV_FIELD_NUMBER = 2;
            public static final int OS_FIELD_NUMBER = 14;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Device> PARSER = null;
            public static final int PPI_FIELD_NUMBER = 12;
            public static final int PXRATIO_FIELD_NUMBER = 13;
            public static final int W_FIELD_NUMBER = 10;
            public static final int XDPI_FIELD_NUMBER = 20;
            public static final int YDPI_FIELD_NUMBER = 21;
            private int bitField0_;
            private long dbt_;
            private int devicetype_;
            private com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo_;
            private int h_;
            private boolean hasGy_;
            private int js_;
            private int ortn_;
            private int ppi_;
            private double pxratio_;
            private int w_;
            private float xdpi_;
            private float ydpi_;
            private java.lang.String language_ = "";
            private java.lang.String osv_ = "";
            private java.lang.String make_ = "";
            private java.lang.String model_ = "";
            private java.lang.String hwv_ = "";
            private java.lang.String carrier_ = "";
            private java.lang.String os_ = "";
            private java.lang.String kbLoc_ = "";
            private java.lang.String locale_ = "";
            private java.lang.String hardware_ = "";
            private java.lang.String brand_ = "";

            private Device() {
            }

            public enum Orientation implements com.google.protobuf.Internal.EnumLite {
                UNKNOWN(0),
                PORTRAIT(1),
                LANDSCAPE(2),
                UNRECOGNIZED(-1);

                public static final int LANDSCAPE_VALUE = 2;
                public static final int PORTRAIT_VALUE = 1;
                public static final int UNKNOWN_VALUE = 0;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation>() { // from class: com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation findValueByNumber(int i) {
                        return com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.forNumber(i);
                    }
                };
                private final int value;

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this == UNRECOGNIZED) {
                        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    return this.value;
                }

                @java.lang.Deprecated
                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation forNumber(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return PORTRAIT;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LANDSCAPE;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.OrientationVerifier.INSTANCE;
                }

                private static final class OrientationVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.OrientationVerifier();

                    private OrientationVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.forNumber(i) != null;
                    }
                }

                Orientation(int i) {
                    this.value = i;
                }
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasLanguage() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getLanguage() {
                return this.language_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getLanguageBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.language_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLanguage(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.language_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLanguage() {
                this.bitField0_ &= -2;
                this.language_ = getDefaultInstance().getLanguage();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLanguageBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.language_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasOsv() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getOsv() {
                return this.osv_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getOsvBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.osv_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOsv(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.osv_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOsv() {
                this.bitField0_ &= -3;
                this.osv_ = getDefaultInstance().getOsv();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOsvBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.osv_ = byteString.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasMake() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getMake() {
                return this.make_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getMakeBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.make_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMake(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.make_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMake() {
                this.bitField0_ &= -5;
                this.make_ = getDefaultInstance().getMake();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMakeBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.make_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasModel() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getModel() {
                return this.model_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getModelBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.model_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setModel(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.model_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearModel() {
                this.bitField0_ &= -9;
                this.model_ = getDefaultInstance().getModel();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setModelBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.model_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasHwv() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getHwv() {
                return this.hwv_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getHwvBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.hwv_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHwv(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.hwv_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHwv() {
                this.bitField0_ &= -17;
                this.hwv_ = getDefaultInstance().getHwv();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHwvBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.hwv_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasCarrier() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getCarrier() {
                return this.carrier_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getCarrierBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.carrier_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCarrier(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.carrier_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCarrier() {
                this.bitField0_ &= -33;
                this.carrier_ = getDefaultInstance().getCarrier();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCarrierBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.carrier_ = byteString.toStringUtf8();
                this.bitField0_ |= 32;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasDevicetype() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public int getDevicetype() {
                return this.devicetype_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDevicetype(int i) {
                this.bitField0_ |= 64;
                this.devicetype_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDevicetype() {
                this.bitField0_ &= -65;
                this.devicetype_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasJs() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public int getJs() {
                return this.js_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setJs(int i) {
                this.bitField0_ |= 128;
                this.js_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearJs() {
                this.bitField0_ &= -129;
                this.js_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasGeo() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo getGeo() {
                com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo = this.geo_;
                return geo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.getDefaultInstance() : geo;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGeo(com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo) {
                geo.getClass();
                this.geo_ = geo;
                this.bitField0_ |= 256;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeGeo(com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo) {
                geo.getClass();
                com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo2 = this.geo_;
                if (geo2 != null && geo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.getDefaultInstance()) {
                    this.geo_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.newBuilder(this.geo_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder) geo).buildPartial();
                } else {
                    this.geo_ = geo;
                }
                this.bitField0_ |= 256;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGeo() {
                this.geo_ = null;
                this.bitField0_ &= -257;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasW() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public int getW() {
                return this.w_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setW(int i) {
                this.bitField0_ |= 512;
                this.w_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearW() {
                this.bitField0_ &= -513;
                this.w_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasH() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public int getH() {
                return this.h_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setH(int i) {
                this.bitField0_ |= 1024;
                this.h_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearH() {
                this.bitField0_ &= -1025;
                this.h_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasPpi() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public int getPpi() {
                return this.ppi_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPpi(int i) {
                this.bitField0_ |= 2048;
                this.ppi_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPpi() {
                this.bitField0_ &= -2049;
                this.ppi_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasPxratio() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public double getPxratio() {
                return this.pxratio_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPxratio(double d) {
                this.bitField0_ |= 4096;
                this.pxratio_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPxratio() {
                this.bitField0_ &= -4097;
                this.pxratio_ = 0.0d;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasOs() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getOs() {
                return this.os_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getOsBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.os_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOs(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 8192;
                this.os_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOs() {
                this.bitField0_ &= -8193;
                this.os_ = getDefaultInstance().getOs();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOsBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.os_ = byteString.toStringUtf8();
                this.bitField0_ |= 8192;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasDbt() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public long getDbt() {
                return this.dbt_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDbt(long j) {
                this.bitField0_ |= 16384;
                this.dbt_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDbt() {
                this.bitField0_ &= -16385;
                this.dbt_ = 0L;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasOrtn() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public int getOrtnValue() {
                return this.ortn_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation getOrtn() {
                com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation forNumber = com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.forNumber(this.ortn_);
                return forNumber == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOrtnValue(int i) {
                this.bitField0_ |= 32768;
                this.ortn_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOrtn(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation orientation) {
                this.ortn_ = orientation.getNumber();
                this.bitField0_ |= 32768;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOrtn() {
                this.bitField0_ &= -32769;
                this.ortn_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasHasGy() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean getHasGy() {
                return this.hasGy_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHasGy(boolean z) {
                this.bitField0_ |= 65536;
                this.hasGy_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHasGy() {
                this.bitField0_ &= -65537;
                this.hasGy_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasKbLoc() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getKbLoc() {
                return this.kbLoc_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getKbLocBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.kbLoc_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setKbLoc(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 131072;
                this.kbLoc_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearKbLoc() {
                this.bitField0_ &= -131073;
                this.kbLoc_ = getDefaultInstance().getKbLoc();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setKbLocBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.kbLoc_ = byteString.toStringUtf8();
                this.bitField0_ |= 131072;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasLocale() {
                return (this.bitField0_ & 262144) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getLocale() {
                return this.locale_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getLocaleBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.locale_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLocale(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 262144;
                this.locale_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLocale() {
                this.bitField0_ &= -262145;
                this.locale_ = getDefaultInstance().getLocale();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLocaleBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.locale_ = byteString.toStringUtf8();
                this.bitField0_ |= 262144;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasXdpi() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public float getXdpi() {
                return this.xdpi_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setXdpi(float f) {
                this.bitField0_ |= 524288;
                this.xdpi_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearXdpi() {
                this.bitField0_ &= -524289;
                this.xdpi_ = 0.0f;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasYdpi() {
                return (this.bitField0_ & 1048576) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public float getYdpi() {
                return this.ydpi_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setYdpi(float f) {
                this.bitField0_ |= 1048576;
                this.ydpi_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearYdpi() {
                this.bitField0_ &= -1048577;
                this.ydpi_ = 0.0f;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasHardware() {
                return (this.bitField0_ & 2097152) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getHardware() {
                return this.hardware_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getHardwareBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.hardware_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHardware(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 2097152;
                this.hardware_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHardware() {
                this.bitField0_ &= -2097153;
                this.hardware_ = getDefaultInstance().getHardware();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHardwareBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.hardware_ = byteString.toStringUtf8();
                this.bitField0_ |= 2097152;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public boolean hasBrand() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public java.lang.String getBrand() {
                return this.brand_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
            public com.google.protobuf.ByteString getBrandBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.brand_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBrand(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 4194304;
                this.brand_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBrand() {
                this.bitField0_ &= -4194305;
                this.brand_ = getDefaultInstance().getBrand();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBrandBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.brand_ = byteString.toStringUtf8();
                this.bitField0_ |= 4194304;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device) {
                return DEFAULT_INSTANCE.createBuilder(device);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.Device, com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasLanguage() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasLanguage();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getLanguage() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getLanguage();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getLanguageBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getLanguageBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setLanguage(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setLanguage(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearLanguage() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearLanguage();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setLanguageBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setLanguageBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasOsv() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasOsv();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getOsv() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getOsv();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getOsvBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getOsvBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setOsv(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setOsv(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearOsv() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearOsv();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setOsvBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setOsvBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasMake() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasMake();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getMake() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getMake();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getMakeBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getMakeBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setMake(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setMake(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearMake() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearMake();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setMakeBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setMakeBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasModel() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasModel();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getModel() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getModel();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getModelBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getModelBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setModel(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setModel(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearModel() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearModel();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setModelBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setModelBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasHwv() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasHwv();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getHwv() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getHwv();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getHwvBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getHwvBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setHwv(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setHwv(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearHwv() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearHwv();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setHwvBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setHwvBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasCarrier() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasCarrier();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getCarrier() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getCarrier();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getCarrierBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getCarrierBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setCarrier(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setCarrier(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearCarrier() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearCarrier();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setCarrierBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setCarrierBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasDevicetype() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasDevicetype();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public int getDevicetype() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getDevicetype();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setDevicetype(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setDevicetype(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearDevicetype() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearDevicetype();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasJs() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasJs();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public int getJs() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getJs();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setJs(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setJs(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearJs() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearJs();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasGeo() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasGeo();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo getGeo() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getGeo();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setGeo(com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setGeo(geo);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setGeo(com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setGeo(builder.build());
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder mergeGeo(com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).mergeGeo(geo);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearGeo() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearGeo();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasW() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasW();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public int getW() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getW();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setW(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setW(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearW() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearW();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasH() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasH();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public int getH() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getH();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setH(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setH(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearH() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearH();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasPpi() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasPpi();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public int getPpi() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getPpi();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setPpi(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setPpi(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearPpi() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearPpi();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasPxratio() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasPxratio();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public double getPxratio() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getPxratio();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setPxratio(double d) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setPxratio(d);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearPxratio() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearPxratio();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasOs() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasOs();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getOs() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getOs();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getOsBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getOsBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setOs(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setOs(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearOs() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearOs();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setOsBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setOsBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasDbt() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasDbt();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public long getDbt() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getDbt();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setDbt(long j) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setDbt(j);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearDbt() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearDbt();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasOrtn() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasOrtn();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public int getOrtnValue() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getOrtnValue();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setOrtnValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setOrtnValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation getOrtn() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getOrtn();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setOrtn(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation orientation) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setOrtn(orientation);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearOrtn() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearOrtn();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasHasGy() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasHasGy();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean getHasGy() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getHasGy();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setHasGy(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setHasGy(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearHasGy() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearHasGy();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasKbLoc() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasKbLoc();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getKbLoc() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getKbLoc();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getKbLocBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getKbLocBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setKbLoc(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setKbLoc(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearKbLoc() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearKbLoc();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setKbLocBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setKbLocBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasLocale() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasLocale();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getLocale() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getLocale();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getLocaleBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getLocaleBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setLocale(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setLocale(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearLocale() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearLocale();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setLocaleBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setLocaleBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasXdpi() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasXdpi();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public float getXdpi() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getXdpi();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setXdpi(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setXdpi(f);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearXdpi() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearXdpi();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasYdpi() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasYdpi();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public float getYdpi() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getYdpi();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setYdpi(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setYdpi(f);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearYdpi() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearYdpi();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasHardware() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasHardware();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getHardware() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getHardware();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getHardwareBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getHardwareBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setHardware(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setHardware(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearHardware() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearHardware();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setHardwareBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setHardwareBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public boolean hasBrand() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).hasBrand();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public java.lang.String getBrand() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getBrand();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DeviceOrBuilder
                public com.google.protobuf.ByteString getBrandBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).getBrandBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setBrand(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setBrand(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder clearBrand() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).clearBrand();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder setBrandBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device) this.instance).setBrandBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.Device();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဋ\u0006\bဋ\u0007\tဉ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rက\f\u000eለ\r\u000fဃ\u000e\u0010ဌ\u000f\u0011ဇ\u0010\u0012ለ\u0011\u0013ለ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ለ\u0015\u0017ለ\u0016", new java.lang.Object[]{"bitField0_", "language_", "osv_", "make_", "model_", "hwv_", "carrier_", "devicetype_", "js_", "geo_", "w_", "h_", "ppi_", "pxratio_", "os_", "dbt_", "ortn_", "hasGy_", "kbLoc_", "locale_", "xdpi_", "ydpi_", "hardware_", "brand_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Device> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device = new com.moloco.sdk.BidToken.ClientBidTokenComponents.Device();
                DEFAULT_INSTANCE = device;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.class, device);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Device getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Device> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class TestConfig extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig, com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfigOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig DEFAULT_INSTANCE;
            public static final int JSON_CONFIG_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig> PARSER;
            private int bitField0_;
            private java.lang.String jsonConfig_ = "";

            private TestConfig() {
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfigOrBuilder
            public boolean hasJsonConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfigOrBuilder
            public java.lang.String getJsonConfig() {
                return this.jsonConfig_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfigOrBuilder
            public com.google.protobuf.ByteString getJsonConfigBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.jsonConfig_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setJsonConfig(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.jsonConfig_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearJsonConfig() {
                this.bitField0_ &= -2;
                this.jsonConfig_ = getDefaultInstance().getJsonConfig();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setJsonConfigBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.jsonConfig_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig) {
                return DEFAULT_INSTANCE.createBuilder(testConfig);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig, com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfigOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfigOrBuilder
                public boolean hasJsonConfig() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) this.instance).hasJsonConfig();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfigOrBuilder
                public java.lang.String getJsonConfig() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) this.instance).getJsonConfig();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfigOrBuilder
                public com.google.protobuf.ByteString getJsonConfigBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) this.instance).getJsonConfigBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder setJsonConfig(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) this.instance).setJsonConfig(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder clearJsonConfig() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) this.instance).clearJsonConfig();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder setJsonConfigBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig) this.instance).setJsonConfigBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new java.lang.Object[]{"bitField0_", "jsonConfig_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig = new com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig();
                DEFAULT_INSTANCE = testConfig;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.class, testConfig);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Geo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo, com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.GeoOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo> PARSER = null;
            public static final int UTCOFFSET_FIELD_NUMBER = 1;
            private int bitField0_;
            private int utcoffset_;

            private Geo() {
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.GeoOrBuilder
            public boolean hasUtcoffset() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.GeoOrBuilder
            public int getUtcoffset() {
                return this.utcoffset_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUtcoffset(int i) {
                this.bitField0_ |= 1;
                this.utcoffset_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUtcoffset() {
                this.bitField0_ &= -2;
                this.utcoffset_ = 0;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo) {
                return DEFAULT_INSTANCE.createBuilder(geo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo, com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.GeoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.GeoOrBuilder
                public boolean hasUtcoffset() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) this.instance).hasUtcoffset();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.GeoOrBuilder
                public int getUtcoffset() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) this.instance).getUtcoffset();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder setUtcoffset(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) this.instance).setUtcoffset(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder clearUtcoffset() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo) this.instance).clearUtcoffset();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new java.lang.Object[]{"bitField0_", "utcoffset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo geo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo();
                DEFAULT_INSTANCE = geo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.class, geo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class SdkInfo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfoOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo DEFAULT_INSTANCE;
            public static final int INITIALIZED_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo> PARSER;
            private int bitField0_;
            private boolean initialized_;

            private SdkInfo() {
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfoOrBuilder
            public boolean hasInitialized() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfoOrBuilder
            public boolean getInitialized() {
                return this.initialized_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitialized(boolean z) {
                this.bitField0_ |= 1;
                this.initialized_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitialized() {
                this.bitField0_ &= -2;
                this.initialized_ = false;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo sdkInfo) {
                return DEFAULT_INSTANCE.createBuilder(sdkInfo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfoOrBuilder
                public boolean hasInitialized() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) this.instance).hasInitialized();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfoOrBuilder
                public boolean getInitialized() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) this.instance).getInitialized();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder setInitialized(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) this.instance).setInitialized(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder clearInitialized() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo) this.instance).clearInitialized();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new java.lang.Object[]{"bitField0_", "initialized_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo sdkInfo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo();
                DEFAULT_INSTANCE = sdkInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.class, sdkInfo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class MemoryInfo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo DEFAULT_INSTANCE;
            public static final int LOW_MEM_FIELD_NUMBER = 1;
            public static final int LOW_MEM_THRESHOLD_BYTES_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo> PARSER = null;
            public static final int TOTAL_MEM_BYTES_FIELD_NUMBER = 3;
            private int bitField0_;
            private long lowMemThresholdBytes_;
            private boolean lowMem_;
            private long totalMemBytes_;

            private MemoryInfo() {
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
            public boolean hasLowMem() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
            public boolean getLowMem() {
                return this.lowMem_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLowMem(boolean z) {
                this.bitField0_ |= 1;
                this.lowMem_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLowMem() {
                this.bitField0_ &= -2;
                this.lowMem_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
            public boolean hasLowMemThresholdBytes() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
            public long getLowMemThresholdBytes() {
                return this.lowMemThresholdBytes_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLowMemThresholdBytes(long j) {
                this.bitField0_ |= 2;
                this.lowMemThresholdBytes_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLowMemThresholdBytes() {
                this.bitField0_ &= -3;
                this.lowMemThresholdBytes_ = 0L;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
            public boolean hasTotalMemBytes() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
            public long getTotalMemBytes() {
                return this.totalMemBytes_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTotalMemBytes(long j) {
                this.bitField0_ |= 4;
                this.totalMemBytes_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTotalMemBytes() {
                this.bitField0_ &= -5;
                this.totalMemBytes_ = 0L;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo) {
                return DEFAULT_INSTANCE.createBuilder(memoryInfo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
                public boolean hasLowMem() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).hasLowMem();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
                public boolean getLowMem() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).getLowMem();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder setLowMem(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).setLowMem(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder clearLowMem() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).clearLowMem();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
                public boolean hasLowMemThresholdBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).hasLowMemThresholdBytes();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
                public long getLowMemThresholdBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).getLowMemThresholdBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder setLowMemThresholdBytes(long j) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).setLowMemThresholdBytes(j);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder clearLowMemThresholdBytes() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).clearLowMemThresholdBytes();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
                public boolean hasTotalMemBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).hasTotalMemBytes();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfoOrBuilder
                public long getTotalMemBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).getTotalMemBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder setTotalMemBytes(long j) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).setTotalMemBytes(j);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder clearTotalMemBytes() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo) this.instance).clearTotalMemBytes();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new java.lang.Object[]{"bitField0_", "lowMem_", "lowMemThresholdBytes_", "totalMemBytes_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo();
                DEFAULT_INSTANCE = memoryInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.class, memoryInfo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class DirInfo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfoOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo DEFAULT_INSTANCE;
            public static final int DSIZE_BYTES_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo> PARSER;
            private int bitField0_;
            private long dsizeBytes_;

            private DirInfo() {
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfoOrBuilder
            public boolean hasDsizeBytes() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfoOrBuilder
            public long getDsizeBytes() {
                return this.dsizeBytes_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDsizeBytes(long j) {
                this.bitField0_ |= 1;
                this.dsizeBytes_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDsizeBytes() {
                this.bitField0_ &= -2;
                this.dsizeBytes_ = 0L;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo) {
                return DEFAULT_INSTANCE.createBuilder(dirInfo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfoOrBuilder
                public boolean hasDsizeBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) this.instance).hasDsizeBytes();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfoOrBuilder
                public long getDsizeBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) this.instance).getDsizeBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder setDsizeBytes(long j) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) this.instance).setDsizeBytes(j);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder clearDsizeBytes() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo) this.instance).clearDsizeBytes();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new java.lang.Object[]{"bitField0_", "dsizeBytes_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo();
                DEFAULT_INSTANCE = dirInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.class, dirInfo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class NetworkInfo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo DEFAULT_INSTANCE;
            public static final int MCC_FIELD_NUMBER = 3;
            public static final int MNC_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo> PARSER = null;
            public static final int RESTRICTED_FIELD_NUMBER = 2;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int bitField0_;
            private int mcc_;
            private int mnc_;
            private boolean restricted_;
            private int type_;

            private NetworkInfo() {
            }

            public enum ConnectionType implements com.google.protobuf.Internal.EnumLite {
                UNKNOWN(0),
                WIFI(1),
                CELLULAR(2),
                NO_NETWORK(3),
                UNRECOGNIZED(-1);

                public static final int CELLULAR_VALUE = 2;
                public static final int NO_NETWORK_VALUE = 3;
                public static final int UNKNOWN_VALUE = 0;
                public static final int WIFI_VALUE = 1;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType>() { // from class: com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType findValueByNumber(int i) {
                        return com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.forNumber(i);
                    }
                };
                private final int value;

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this == UNRECOGNIZED) {
                        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    return this.value;
                }

                @java.lang.Deprecated
                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType forNumber(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return WIFI;
                    }
                    if (i == 2) {
                        return CELLULAR;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return NO_NETWORK;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.ConnectionTypeVerifier.INSTANCE;
                }

                private static final class ConnectionTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.ConnectionTypeVerifier();

                    private ConnectionTypeVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.forNumber(i) != null;
                    }
                }

                ConnectionType(int i) {
                    this.value = i;
                }
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType getType() {
                com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType forNumber = com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.forNumber(this.type_);
                return forNumber == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeValue(int i) {
                this.bitField0_ |= 1;
                this.type_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType connectionType) {
                this.type_ = connectionType.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public boolean hasRestricted() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public boolean getRestricted() {
                return this.restricted_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRestricted(boolean z) {
                this.bitField0_ |= 2;
                this.restricted_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRestricted() {
                this.bitField0_ &= -3;
                this.restricted_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public boolean hasMcc() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public int getMcc() {
                return this.mcc_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMcc(int i) {
                this.bitField0_ |= 4;
                this.mcc_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMcc() {
                this.bitField0_ &= -5;
                this.mcc_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public boolean hasMnc() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
            public int getMnc() {
                return this.mnc_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMnc(int i) {
                this.bitField0_ |= 8;
                this.mnc_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMnc() {
                this.bitField0_ &= -9;
                this.mnc_ = 0;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo) {
                return DEFAULT_INSTANCE.createBuilder(networkInfo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public boolean hasType() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).hasType();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public int getTypeValue() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).getTypeValue();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder setTypeValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).setTypeValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType getType() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).getType();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder setType(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType connectionType) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).setType(connectionType);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder clearType() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).clearType();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public boolean hasRestricted() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).hasRestricted();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public boolean getRestricted() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).getRestricted();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder setRestricted(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).setRestricted(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder clearRestricted() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).clearRestricted();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public boolean hasMcc() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).hasMcc();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public int getMcc() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).getMcc();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder setMcc(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).setMcc(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder clearMcc() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).clearMcc();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public boolean hasMnc() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).hasMnc();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfoOrBuilder
                public int getMnc() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).getMnc();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder setMnc(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).setMnc(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder clearMnc() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo) this.instance).clearMnc();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new java.lang.Object[]{"bitField0_", "type_", "restricted_", "mcc_", "mnc_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo();
                DEFAULT_INSTANCE = networkInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.class, networkInfo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class AdvertisingInfo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo DEFAULT_INSTANCE;
            public static final int DNT_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo> PARSER;
            private int bitField0_;
            private boolean dnt_;
            private java.lang.String id_ = "";

            private AdvertisingInfo() {
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
            public java.lang.String getId() {
                return this.id_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
            public com.google.protobuf.ByteString getIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.id_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.bitField0_ &= -2;
                this.id_ = getDefaultInstance().getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIdBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.id_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
            public boolean hasDnt() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
            public boolean getDnt() {
                return this.dnt_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDnt(boolean z) {
                this.bitField0_ |= 2;
                this.dnt_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDnt() {
                this.bitField0_ &= -3;
                this.dnt_ = false;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo advertisingInfo) {
                return DEFAULT_INSTANCE.createBuilder(advertisingInfo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
                public boolean hasId() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).hasId();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
                public java.lang.String getId() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).getId();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
                public com.google.protobuf.ByteString getIdBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).getIdBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder setId(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).setId(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder clearId() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).clearId();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder setIdBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).setIdBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
                public boolean hasDnt() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).hasDnt();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfoOrBuilder
                public boolean getDnt() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).getDnt();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder setDnt(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).setDnt(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder clearDnt() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo) this.instance).clearDnt();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new java.lang.Object[]{"bitField0_", "id_", "dnt_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo advertisingInfo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo();
                DEFAULT_INSTANCE = advertisingInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.class, advertisingInfo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class BatteryInfo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder {
            public static final int BATTERY_STATUS_FIELD_NUMBER = 2;
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo DEFAULT_INSTANCE;
            public static final int LOW_POW_MODE_FIELD_NUMBER = 3;
            public static final int MAX_BATTERY_LEVEL_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo> PARSER;
            private int batteryStatus_;
            private int bitField0_;
            private boolean lowPowMode_;
            private int maxBatteryLevel_;

            private BatteryInfo() {
            }

            public enum BatteryStatus implements com.google.protobuf.Internal.EnumLite {
                UNKNOWN(0),
                CHARGING(1),
                DISCHARGING(2),
                NOT_CHARGING(3),
                FULL(4),
                UNRECOGNIZED(-1);

                public static final int CHARGING_VALUE = 1;
                public static final int DISCHARGING_VALUE = 2;
                public static final int FULL_VALUE = 4;
                public static final int NOT_CHARGING_VALUE = 3;
                public static final int UNKNOWN_VALUE = 0;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus>() { // from class: com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus findValueByNumber(int i) {
                        return com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.forNumber(i);
                    }
                };
                private final int value;

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this == UNRECOGNIZED) {
                        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    return this.value;
                }

                @java.lang.Deprecated
                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus forNumber(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return CHARGING;
                    }
                    if (i == 2) {
                        return DISCHARGING;
                    }
                    if (i == 3) {
                        return NOT_CHARGING;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return FULL;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.BatteryStatusVerifier.INSTANCE;
                }

                private static final class BatteryStatusVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.BatteryStatusVerifier();

                    private BatteryStatusVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.forNumber(i) != null;
                    }
                }

                BatteryStatus(int i) {
                    this.value = i;
                }
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
            public boolean hasMaxBatteryLevel() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
            public int getMaxBatteryLevel() {
                return this.maxBatteryLevel_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxBatteryLevel(int i) {
                this.bitField0_ |= 1;
                this.maxBatteryLevel_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxBatteryLevel() {
                this.bitField0_ &= -2;
                this.maxBatteryLevel_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
            public boolean hasBatteryStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
            public int getBatteryStatusValue() {
                return this.batteryStatus_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus getBatteryStatus() {
                com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus forNumber = com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.forNumber(this.batteryStatus_);
                return forNumber == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBatteryStatusValue(int i) {
                this.bitField0_ |= 2;
                this.batteryStatus_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBatteryStatus(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus batteryStatus) {
                this.batteryStatus_ = batteryStatus.getNumber();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBatteryStatus() {
                this.bitField0_ &= -3;
                this.batteryStatus_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
            public boolean hasLowPowMode() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
            public boolean getLowPowMode() {
                return this.lowPowMode_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLowPowMode(boolean z) {
                this.bitField0_ |= 4;
                this.lowPowMode_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLowPowMode() {
                this.bitField0_ &= -5;
                this.lowPowMode_ = false;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo) {
                return DEFAULT_INSTANCE.createBuilder(batteryInfo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
                public boolean hasMaxBatteryLevel() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).hasMaxBatteryLevel();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
                public int getMaxBatteryLevel() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).getMaxBatteryLevel();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder setMaxBatteryLevel(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).setMaxBatteryLevel(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder clearMaxBatteryLevel() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).clearMaxBatteryLevel();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
                public boolean hasBatteryStatus() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).hasBatteryStatus();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
                public int getBatteryStatusValue() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).getBatteryStatusValue();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder setBatteryStatusValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).setBatteryStatusValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
                public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus getBatteryStatus() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).getBatteryStatus();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder setBatteryStatus(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus batteryStatus) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).setBatteryStatus(batteryStatus);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder clearBatteryStatus() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).clearBatteryStatus();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
                public boolean hasLowPowMode() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).hasLowPowMode();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfoOrBuilder
                public boolean getLowPowMode() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).getLowPowMode();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder setLowPowMode(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).setLowPowMode(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder clearLowPowMode() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo) this.instance).clearLowPowMode();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new java.lang.Object[]{"bitField0_", "maxBatteryLevel_", "batteryStatus_", "lowPowMode_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo();
                DEFAULT_INSTANCE = batteryInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.class, batteryInfo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class AudioInfo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo DEFAULT_INSTANCE;
            public static final int MUTE_SWITCH_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo> PARSER = null;
            public static final int VOL_FIELD_NUMBER = 2;
            private int bitField0_;
            private int muteSwitch_;
            private int vol_;

            private AudioInfo() {
            }

            public enum MuteSwitchState implements com.google.protobuf.Internal.EnumLite {
                SILENT(0),
                VIBRATE(1),
                NORMAL(2),
                UNRECOGNIZED(-1);

                public static final int NORMAL_VALUE = 2;
                public static final int SILENT_VALUE = 0;
                public static final int VIBRATE_VALUE = 1;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState>() { // from class: com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState findValueByNumber(int i) {
                        return com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.forNumber(i);
                    }
                };
                private final int value;

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this == UNRECOGNIZED) {
                        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    return this.value;
                }

                @java.lang.Deprecated
                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState forNumber(int i) {
                    if (i == 0) {
                        return SILENT;
                    }
                    if (i == 1) {
                        return VIBRATE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return NORMAL;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.MuteSwitchStateVerifier.INSTANCE;
                }

                private static final class MuteSwitchStateVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.MuteSwitchStateVerifier();

                    private MuteSwitchStateVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.forNumber(i) != null;
                    }
                }

                MuteSwitchState(int i) {
                    this.value = i;
                }
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
            public boolean hasMuteSwitch() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
            public int getMuteSwitchValue() {
                return this.muteSwitch_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState getMuteSwitch() {
                com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState forNumber = com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.forNumber(this.muteSwitch_);
                return forNumber == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMuteSwitchValue(int i) {
                this.bitField0_ |= 1;
                this.muteSwitch_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMuteSwitch(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState muteSwitchState) {
                this.muteSwitch_ = muteSwitchState.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMuteSwitch() {
                this.bitField0_ &= -2;
                this.muteSwitch_ = 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
            public boolean hasVol() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
            public int getVol() {
                return this.vol_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVol(int i) {
                this.bitField0_ |= 2;
                this.vol_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVol() {
                this.bitField0_ &= -3;
                this.vol_ = 0;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo) {
                return DEFAULT_INSTANCE.createBuilder(audioInfo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
                public boolean hasMuteSwitch() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).hasMuteSwitch();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
                public int getMuteSwitchValue() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).getMuteSwitchValue();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder setMuteSwitchValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).setMuteSwitchValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState getMuteSwitch() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).getMuteSwitch();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder setMuteSwitch(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState muteSwitchState) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).setMuteSwitch(muteSwitchState);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder clearMuteSwitch() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).clearMuteSwitch();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
                public boolean hasVol() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).hasVol();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfoOrBuilder
                public int getVol() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).getVol();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder setVol(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).setVol(i);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder clearVol() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo) this.instance).clearVol();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new java.lang.Object[]{"bitField0_", "muteSwitch_", "vol_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo();
                DEFAULT_INSTANCE = audioInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.class, audioInfo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class AccessibilityInfo extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder {
            public static final int ACCESSIBILITY_CAPTIONING_ENABLED_FIELD_NUMBER = 1;
            public static final int ACCESSIBILITY_LARGE_POINTER_ICON_FIELD_NUMBER = 2;
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo DEFAULT_INSTANCE;
            public static final int FONT_SCALE_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo> PARSER = null;
            public static final int REDUCE_BRIGHT_COLORS_ACTIVATED_FIELD_NUMBER = 3;
            private boolean accessibilityCaptioningEnabled_;
            private boolean accessibilityLargePointerIcon_;
            private int bitField0_;
            private float fontScale_;
            private boolean reduceBrightColorsActivated_;

            private AccessibilityInfo() {
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
            public boolean hasAccessibilityCaptioningEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
            public boolean getAccessibilityCaptioningEnabled() {
                return this.accessibilityCaptioningEnabled_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAccessibilityCaptioningEnabled(boolean z) {
                this.bitField0_ |= 1;
                this.accessibilityCaptioningEnabled_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAccessibilityCaptioningEnabled() {
                this.bitField0_ &= -2;
                this.accessibilityCaptioningEnabled_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
            public boolean hasAccessibilityLargePointerIcon() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
            public boolean getAccessibilityLargePointerIcon() {
                return this.accessibilityLargePointerIcon_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAccessibilityLargePointerIcon(boolean z) {
                this.bitField0_ |= 2;
                this.accessibilityLargePointerIcon_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAccessibilityLargePointerIcon() {
                this.bitField0_ &= -3;
                this.accessibilityLargePointerIcon_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
            public boolean hasReduceBrightColorsActivated() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
            public boolean getReduceBrightColorsActivated() {
                return this.reduceBrightColorsActivated_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReduceBrightColorsActivated(boolean z) {
                this.bitField0_ |= 4;
                this.reduceBrightColorsActivated_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReduceBrightColorsActivated() {
                this.bitField0_ &= -5;
                this.reduceBrightColorsActivated_ = false;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
            public boolean hasFontScale() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
            public float getFontScale() {
                return this.fontScale_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFontScale(float f) {
                this.bitField0_ |= 8;
                this.fontScale_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFontScale() {
                this.bitField0_ &= -9;
                this.fontScale_ = 0.0f;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo) {
                return DEFAULT_INSTANCE.createBuilder(accessibilityInfo);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo, com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
                public boolean hasAccessibilityCaptioningEnabled() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).hasAccessibilityCaptioningEnabled();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
                public boolean getAccessibilityCaptioningEnabled() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).getAccessibilityCaptioningEnabled();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder setAccessibilityCaptioningEnabled(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).setAccessibilityCaptioningEnabled(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder clearAccessibilityCaptioningEnabled() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).clearAccessibilityCaptioningEnabled();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
                public boolean hasAccessibilityLargePointerIcon() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).hasAccessibilityLargePointerIcon();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
                public boolean getAccessibilityLargePointerIcon() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).getAccessibilityLargePointerIcon();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder setAccessibilityLargePointerIcon(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).setAccessibilityLargePointerIcon(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder clearAccessibilityLargePointerIcon() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).clearAccessibilityLargePointerIcon();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
                public boolean hasReduceBrightColorsActivated() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).hasReduceBrightColorsActivated();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
                public boolean getReduceBrightColorsActivated() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).getReduceBrightColorsActivated();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder setReduceBrightColorsActivated(boolean z) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).setReduceBrightColorsActivated(z);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder clearReduceBrightColorsActivated() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).clearReduceBrightColorsActivated();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
                public boolean hasFontScale() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).hasFontScale();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfoOrBuilder
                public float getFontScale() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).getFontScale();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder setFontScale(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).setFontScale(f);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder clearFontScale() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo) this.instance).clearFontScale();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003", new java.lang.Object[]{"bitField0_", "accessibilityCaptioningEnabled_", "accessibilityLargePointerIcon_", "reduceBrightColorsActivated_", "fontScale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo = new com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo();
                DEFAULT_INSTANCE = accessibilityInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.class, accessibilityInfo);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class ImpLvlRevData extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData, com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder {
            private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData DEFAULT_INSTANCE;
            public static final int IMP_COUNTS_FIELD_NUMBER = 4;
            public static final int LAST_IMP_TS_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData> PARSER = null;
            public static final int SESSION_ID_FIELD_NUMBER = 1;
            public static final int SESSION_START_TS_FIELD_NUMBER = 3;
            private com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts_;
            private long lastImpTs_;
            private java.lang.String sessionId_ = "";
            private long sessionStartTs_;

            public interface ImpCountsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
                int getBanner();

                int getInterstitial();

                int getMrec();

                int getNative();

                int getRewarded();
            }

            private ImpLvlRevData() {
            }

            public static final class ImpCounts extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts, com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder {
                public static final int BANNER_FIELD_NUMBER = 4;
                private static final com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts DEFAULT_INSTANCE;
                public static final int INTERSTITIAL_FIELD_NUMBER = 1;
                public static final int MREC_FIELD_NUMBER = 3;
                public static final int NATIVE_FIELD_NUMBER = 5;
                private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts> PARSER = null;
                public static final int REWARDED_FIELD_NUMBER = 2;
                private int banner_;
                private int interstitial_;
                private int mrec_;
                private int native_;
                private int rewarded_;

                private ImpCounts() {
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                public int getInterstitial() {
                    return this.interstitial_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setInterstitial(int i) {
                    this.interstitial_ = i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearInterstitial() {
                    this.interstitial_ = 0;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                public int getRewarded() {
                    return this.rewarded_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setRewarded(int i) {
                    this.rewarded_ = i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearRewarded() {
                    this.rewarded_ = 0;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                public int getMrec() {
                    return this.mrec_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMrec(int i) {
                    this.mrec_ = i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearMrec() {
                    this.mrec_ = 0;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                public int getBanner() {
                    return this.banner_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setBanner(int i) {
                    this.banner_ = i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearBanner() {
                    this.banner_ = 0;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                public int getNative() {
                    return this.native_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setNative(int i) {
                    this.native_ = i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearNative() {
                    this.native_ = 0;
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts) {
                    return DEFAULT_INSTANCE.createBuilder(impCounts);
                }

                public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts, com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder {
                    private Builder() {
                        super(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.DEFAULT_INSTANCE);
                    }

                    @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                    public int getInterstitial() {
                        return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getInterstitial();
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder setInterstitial(int i) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setInterstitial(i);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder clearInterstitial() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearInterstitial();
                        return this;
                    }

                    @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                    public int getRewarded() {
                        return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getRewarded();
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder setRewarded(int i) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setRewarded(i);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder clearRewarded() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearRewarded();
                        return this;
                    }

                    @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                    public int getMrec() {
                        return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getMrec();
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder setMrec(int i) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setMrec(i);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder clearMrec() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearMrec();
                        return this;
                    }

                    @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                    public int getBanner() {
                        return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getBanner();
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder setBanner(int i) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setBanner(i);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder clearBanner() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearBanner();
                        return this;
                    }

                    @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCountsOrBuilder
                    public int getNative() {
                        return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getNative();
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder setNative(int i) {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setNative(i);
                        return this;
                    }

                    public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder clearNative() {
                        copyOnWrite();
                        ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearNative();
                        return this;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                    switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                        case 1:
                            return new com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts();
                        case 2:
                            return new com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder();
                        case 3:
                            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new java.lang.Object[]{"interstitial_", "rewarded_", "mrec_", "banner_", "native_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts> parser = PARSER;
                            if (parser == null) {
                                synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.class) {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
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
                    com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts = new com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts();
                    DEFAULT_INSTANCE = impCounts;
                    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.class, impCounts);
                }

                public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
            public java.lang.String getSessionId() {
                return this.sessionId_;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
            public com.google.protobuf.ByteString getSessionIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.sessionId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSessionId(java.lang.String str) {
                str.getClass();
                this.sessionId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSessionId() {
                this.sessionId_ = getDefaultInstance().getSessionId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSessionIdBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.sessionId_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
            public long getLastImpTs() {
                return this.lastImpTs_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLastImpTs(long j) {
                this.lastImpTs_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLastImpTs() {
                this.lastImpTs_ = 0L;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
            public long getSessionStartTs() {
                return this.sessionStartTs_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSessionStartTs(long j) {
                this.sessionStartTs_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSessionStartTs() {
                this.sessionStartTs_ = 0L;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
            public boolean hasImpCounts() {
                return this.impCounts_ != null;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts getImpCounts() {
                com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts = this.impCounts_;
                return impCounts == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.getDefaultInstance() : impCounts;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setImpCounts(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts) {
                impCounts.getClass();
                this.impCounts_ = impCounts;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeImpCounts(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts) {
                impCounts.getClass();
                com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts2 = this.impCounts_;
                if (impCounts2 != null && impCounts2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.getDefaultInstance()) {
                    this.impCounts_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.newBuilder(this.impCounts_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder) impCounts).buildPartial();
                } else {
                    this.impCounts_ = impCounts;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearImpCounts() {
                this.impCounts_ = null;
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData) {
                return DEFAULT_INSTANCE.createBuilder(impLvlRevData);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData, com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
                public java.lang.String getSessionId() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).getSessionId();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
                public com.google.protobuf.ByteString getSessionIdBytes() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).getSessionIdBytes();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder setSessionId(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).setSessionId(str);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder clearSessionId() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).clearSessionId();
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder setSessionIdBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).setSessionIdBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
                public long getLastImpTs() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).getLastImpTs();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder setLastImpTs(long j) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).setLastImpTs(j);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder clearLastImpTs() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).clearLastImpTs();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
                public long getSessionStartTs() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).getSessionStartTs();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder setSessionStartTs(long j) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).setSessionStartTs(j);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder clearSessionStartTs() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).clearSessionStartTs();
                    return this;
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
                public boolean hasImpCounts() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).hasImpCounts();
                }

                @Override // com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevDataOrBuilder
                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts getImpCounts() {
                    return ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).getImpCounts();
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder setImpCounts(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).setImpCounts(impCounts);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder setImpCounts(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).setImpCounts(builder.build());
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder mergeImpCounts(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts) {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).mergeImpCounts(impCounts);
                    return this;
                }

                public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder clearImpCounts() {
                    copyOnWrite();
                    ((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData) this.instance).clearImpCounts();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData();
                    case 2:
                        return new com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\t", new java.lang.Object[]{"sessionId_", "lastImpTs_", "sessionStartTs_", "impCounts_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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
                com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData = new com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData();
                DEFAULT_INSTANCE = impLvlRevData;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.class, impLvlRevData);
            }

            public static com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasIdfv() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public java.lang.String getIdfv() {
            return this.idfv_;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.google.protobuf.ByteString getIdfvBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.idfv_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfv(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.idfv_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfv() {
            this.bitField0_ &= -2;
            this.idfv_ = getDefaultInstance().getIdfv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfvBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.idfv_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasPrivacy() {
            return this.privacy_ != null;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy getPrivacy() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy = this.privacy_;
            return privacy == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.getDefaultInstance() : privacy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacy(com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy) {
            privacy.getClass();
            this.privacy_ = privacy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePrivacy(com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy) {
            privacy.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy2 = this.privacy_;
            if (privacy2 != null && privacy2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.getDefaultInstance()) {
                this.privacy_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.newBuilder(this.privacy_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder) privacy).buildPartial();
            } else {
                this.privacy_ = privacy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacy() {
            this.privacy_ = null;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasDevice() {
            return this.device_ != null;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device getDevice() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device = this.device_;
            return device == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.getDefaultInstance() : device;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevice(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device) {
            device.getClass();
            this.device_ = device;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDevice(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device) {
            device.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device2 = this.device_;
            if (device2 != null && device2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.getDefaultInstance()) {
                this.device_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.newBuilder(this.device_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder) device).buildPartial();
            } else {
                this.device_ = device;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevice() {
            this.device_ = null;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo getInfo() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo sdkInfo = this.info_;
            return sdkInfo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.getDefaultInstance() : sdkInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo sdkInfo) {
            sdkInfo.getClass();
            this.info_ = sdkInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo sdkInfo) {
            sdkInfo.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo sdkInfo2 = this.info_;
            if (sdkInfo2 != null && sdkInfo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.getDefaultInstance()) {
                this.info_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.newBuilder(this.info_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder) sdkInfo).buildPartial();
            } else {
                this.info_ = sdkInfo;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInfo() {
            this.info_ = null;
            this.bitField0_ &= -3;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasMemoryInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo getMemoryInfo() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo = this.memoryInfo_;
            return memoryInfo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.getDefaultInstance() : memoryInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo) {
            memoryInfo.getClass();
            this.memoryInfo_ = memoryInfo;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMemoryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo) {
            memoryInfo.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo2 = this.memoryInfo_;
            if (memoryInfo2 != null && memoryInfo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.getDefaultInstance()) {
                this.memoryInfo_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.newBuilder(this.memoryInfo_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder) memoryInfo).buildPartial();
            } else {
                this.memoryInfo_ = memoryInfo;
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryInfo() {
            this.memoryInfo_ = null;
            this.bitField0_ &= -5;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasDirInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo getDirInfo() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo = this.dirInfo_;
            return dirInfo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.getDefaultInstance() : dirInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo) {
            dirInfo.getClass();
            this.dirInfo_ = dirInfo;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDirInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo) {
            dirInfo.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo2 = this.dirInfo_;
            if (dirInfo2 != null && dirInfo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.getDefaultInstance()) {
                this.dirInfo_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.newBuilder(this.dirInfo_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder) dirInfo).buildPartial();
            } else {
                this.dirInfo_ = dirInfo;
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDirInfo() {
            this.dirInfo_ = null;
            this.bitField0_ &= -9;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasNetworkInfo() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo getNetworkInfo() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo = this.networkInfo_;
            return networkInfo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.getDefaultInstance() : networkInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo) {
            networkInfo.getClass();
            this.networkInfo_ = networkInfo;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNetworkInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo) {
            networkInfo.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo2 = this.networkInfo_;
            if (networkInfo2 != null && networkInfo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.getDefaultInstance()) {
                this.networkInfo_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.newBuilder(this.networkInfo_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder) networkInfo).buildPartial();
            } else {
                this.networkInfo_ = networkInfo;
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkInfo() {
            this.networkInfo_ = null;
            this.bitField0_ &= -17;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasAdInfo() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo getAdInfo() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo advertisingInfo = this.adInfo_;
            return advertisingInfo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.getDefaultInstance() : advertisingInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo advertisingInfo) {
            advertisingInfo.getClass();
            this.adInfo_ = advertisingInfo;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo advertisingInfo) {
            advertisingInfo.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo advertisingInfo2 = this.adInfo_;
            if (advertisingInfo2 != null && advertisingInfo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.getDefaultInstance()) {
                this.adInfo_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.newBuilder(this.adInfo_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder) advertisingInfo).buildPartial();
            } else {
                this.adInfo_ = advertisingInfo;
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdInfo() {
            this.adInfo_ = null;
            this.bitField0_ &= -33;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasBatteryInfo() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo getBatteryInfo() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo = this.batteryInfo_;
            return batteryInfo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.getDefaultInstance() : batteryInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo) {
            batteryInfo.getClass();
            this.batteryInfo_ = batteryInfo;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBatteryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo) {
            batteryInfo.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo2 = this.batteryInfo_;
            if (batteryInfo2 != null && batteryInfo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.getDefaultInstance()) {
                this.batteryInfo_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.newBuilder(this.batteryInfo_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder) batteryInfo).buildPartial();
            } else {
                this.batteryInfo_ = batteryInfo;
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryInfo() {
            this.batteryInfo_ = null;
            this.bitField0_ &= -65;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasAudioInfo() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo getAudioInfo() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo = this.audioInfo_;
            return audioInfo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.getDefaultInstance() : audioInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo) {
            audioInfo.getClass();
            this.audioInfo_ = audioInfo;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAudioInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo) {
            audioInfo.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo2 = this.audioInfo_;
            if (audioInfo2 != null && audioInfo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.getDefaultInstance()) {
                this.audioInfo_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.newBuilder(this.audioInfo_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder) audioInfo).buildPartial();
            } else {
                this.audioInfo_ = audioInfo;
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioInfo() {
            this.audioInfo_ = null;
            this.bitField0_ &= -129;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasAccessibilityInfo() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo getAccessibilityInfo() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo = this.accessibilityInfo_;
            return accessibilityInfo == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.getDefaultInstance() : accessibilityInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessibilityInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo) {
            accessibilityInfo.getClass();
            this.accessibilityInfo_ = accessibilityInfo;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAccessibilityInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo) {
            accessibilityInfo.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo2 = this.accessibilityInfo_;
            if (accessibilityInfo2 != null && accessibilityInfo2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.getDefaultInstance()) {
                this.accessibilityInfo_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.newBuilder(this.accessibilityInfo_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder) accessibilityInfo).buildPartial();
            } else {
                this.accessibilityInfo_ = accessibilityInfo;
            }
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessibilityInfo() {
            this.accessibilityInfo_ = null;
            this.bitField0_ &= -257;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasImpLvlRevData() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData getImpLvlRevData() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData = this.impLvlRevData_;
            return impLvlRevData == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.getDefaultInstance() : impLvlRevData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpLvlRevData(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData) {
            impLvlRevData.getClass();
            this.impLvlRevData_ = impLvlRevData;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImpLvlRevData(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData) {
            impLvlRevData.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData2 = this.impLvlRevData_;
            if (impLvlRevData2 != null && impLvlRevData2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.getDefaultInstance()) {
                this.impLvlRevData_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.newBuilder(this.impLvlRevData_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder) impLvlRevData).buildPartial();
            } else {
                this.impLvlRevData_ = impLvlRevData;
            }
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpLvlRevData() {
            this.impLvlRevData_ = null;
            this.bitField0_ &= -513;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public boolean hasTestConfig() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
        public com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig getTestConfig() {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig = this.testConfig_;
            return testConfig == null ? com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.getDefaultInstance() : testConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTestConfig(com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig) {
            testConfig.getClass();
            this.testConfig_ = testConfig;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTestConfig(com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig) {
            testConfig.getClass();
            com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig2 = this.testConfig_;
            if (testConfig2 != null && testConfig2 != com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.getDefaultInstance()) {
                this.testConfig_ = com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.newBuilder(this.testConfig_).mergeFrom((com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder) testConfig).buildPartial();
            } else {
                this.testConfig_ = testConfig;
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTestConfig() {
            this.testConfig_ = null;
            this.bitField0_ &= -1025;
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidTokenComponents) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidTokenComponents clientBidTokenComponents) {
            return DEFAULT_INSTANCE.createBuilder(clientBidTokenComponents);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidTokenComponents, com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder {
            private Builder() {
                super(com.moloco.sdk.BidToken.ClientBidTokenComponents.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasIdfv() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasIdfv();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public java.lang.String getIdfv() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getIdfv();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.google.protobuf.ByteString getIdfvBytes() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getIdfvBytes();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setIdfv(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setIdfv(str);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearIdfv() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearIdfv();
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setIdfvBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setIdfvBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasPrivacy() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasPrivacy();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy getPrivacy() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getPrivacy();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setPrivacy(com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setPrivacy(privacy);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setPrivacy(com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setPrivacy(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergePrivacy(com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy privacy) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergePrivacy(privacy);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearPrivacy() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearPrivacy();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasDevice() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasDevice();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Device getDevice() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getDevice();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setDevice(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setDevice(device);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setDevice(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setDevice(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeDevice(com.moloco.sdk.BidToken.ClientBidTokenComponents.Device device) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeDevice(device);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearDevice() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearDevice();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasInfo();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo getInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getInfo();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo sdkInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setInfo(sdkInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setInfo(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo sdkInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeInfo(sdkInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearInfo() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearInfo();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasMemoryInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasMemoryInfo();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo getMemoryInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getMemoryInfo();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setMemoryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setMemoryInfo(memoryInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setMemoryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setMemoryInfo(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeMemoryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo memoryInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeMemoryInfo(memoryInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearMemoryInfo() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearMemoryInfo();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasDirInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasDirInfo();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo getDirInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getDirInfo();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setDirInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setDirInfo(dirInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setDirInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setDirInfo(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeDirInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo dirInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeDirInfo(dirInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearDirInfo() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearDirInfo();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasNetworkInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasNetworkInfo();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo getNetworkInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getNetworkInfo();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setNetworkInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setNetworkInfo(networkInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setNetworkInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setNetworkInfo(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeNetworkInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo networkInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeNetworkInfo(networkInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearNetworkInfo() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearNetworkInfo();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasAdInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasAdInfo();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo getAdInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getAdInfo();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setAdInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo advertisingInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setAdInfo(advertisingInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setAdInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setAdInfo(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeAdInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo advertisingInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeAdInfo(advertisingInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearAdInfo() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearAdInfo();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasBatteryInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasBatteryInfo();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo getBatteryInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getBatteryInfo();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setBatteryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setBatteryInfo(batteryInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setBatteryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setBatteryInfo(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeBatteryInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo batteryInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeBatteryInfo(batteryInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearBatteryInfo() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearBatteryInfo();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasAudioInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasAudioInfo();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo getAudioInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getAudioInfo();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setAudioInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setAudioInfo(audioInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setAudioInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setAudioInfo(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeAudioInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo audioInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeAudioInfo(audioInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearAudioInfo() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearAudioInfo();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasAccessibilityInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasAccessibilityInfo();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo getAccessibilityInfo() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getAccessibilityInfo();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setAccessibilityInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setAccessibilityInfo(accessibilityInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setAccessibilityInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setAccessibilityInfo(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeAccessibilityInfo(com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo accessibilityInfo) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeAccessibilityInfo(accessibilityInfo);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearAccessibilityInfo() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearAccessibilityInfo();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasImpLvlRevData() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasImpLvlRevData();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData getImpLvlRevData() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getImpLvlRevData();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setImpLvlRevData(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setImpLvlRevData(impLvlRevData);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setImpLvlRevData(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setImpLvlRevData(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeImpLvlRevData(com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData impLvlRevData) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeImpLvlRevData(impLvlRevData);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearImpLvlRevData() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearImpLvlRevData();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public boolean hasTestConfig() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).hasTestConfig();
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenComponentsOrBuilder
            public com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig getTestConfig() {
                return ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).getTestConfig();
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setTestConfig(com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setTestConfig(testConfig);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder setTestConfig(com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).setTestConfig(builder.build());
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder mergeTestConfig(com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig testConfig) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).mergeTestConfig(testConfig);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder clearTestConfig() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidTokenComponents) this.instance).clearTestConfig();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.BidToken.ClientBidTokenComponents();
                case 2:
                    return new com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ለ\u0000\u0002\t\u0003\t\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n", new java.lang.Object[]{"bitField0_", "idfv_", "privacy_", "device_", "info_", "memoryInfo_", "dirInfo_", "networkInfo_", "adInfo_", "batteryInfo_", "audioInfo_", "accessibilityInfo_", "impLvlRevData_", "testConfig_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.BidToken.ClientBidTokenComponents.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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
            com.moloco.sdk.BidToken.ClientBidTokenComponents clientBidTokenComponents = new com.moloco.sdk.BidToken.ClientBidTokenComponents();
            DEFAULT_INSTANCE = clientBidTokenComponents;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidTokenComponents.class, clientBidTokenComponents);
        }

        public static com.moloco.sdk.BidToken.ClientBidTokenComponents getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidTokenComponents> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ClientBidToken extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.BidToken.ClientBidToken, com.moloco.sdk.BidToken.ClientBidToken.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenOrBuilder {
        private static final com.moloco.sdk.BidToken.ClientBidToken DEFAULT_INSTANCE;
        public static final int ES_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidToken> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString es_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;

        private ClientBidToken() {
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenOrBuilder
        public com.google.protobuf.ByteString getEs() {
            return this.es_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEs(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.es_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEs() {
            this.es_ = getDefaultInstance().getEs();
        }

        @Override // com.moloco.sdk.BidToken.ClientBidTokenOrBuilder
        public com.google.protobuf.ByteString getPayload() {
            return this.payload_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidToken) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidToken) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.BidToken.ClientBidToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.BidToken.ClientBidToken.Builder newBuilder(com.moloco.sdk.BidToken.ClientBidToken clientBidToken) {
            return DEFAULT_INSTANCE.createBuilder(clientBidToken);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.BidToken.ClientBidToken, com.moloco.sdk.BidToken.ClientBidToken.Builder> implements com.moloco.sdk.BidToken.ClientBidTokenOrBuilder {
            private Builder() {
                super(com.moloco.sdk.BidToken.ClientBidToken.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenOrBuilder
            public com.google.protobuf.ByteString getEs() {
                return ((com.moloco.sdk.BidToken.ClientBidToken) this.instance).getEs();
            }

            public com.moloco.sdk.BidToken.ClientBidToken.Builder setEs(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidToken) this.instance).setEs(byteString);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidToken.Builder clearEs() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidToken) this.instance).clearEs();
                return this;
            }

            @Override // com.moloco.sdk.BidToken.ClientBidTokenOrBuilder
            public com.google.protobuf.ByteString getPayload() {
                return ((com.moloco.sdk.BidToken.ClientBidToken) this.instance).getPayload();
            }

            public com.moloco.sdk.BidToken.ClientBidToken.Builder setPayload(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidToken) this.instance).setPayload(byteString);
                return this;
            }

            public com.moloco.sdk.BidToken.ClientBidToken.Builder clearPayload() {
                copyOnWrite();
                ((com.moloco.sdk.BidToken.ClientBidToken) this.instance).clearPayload();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.BidToken.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.BidToken.ClientBidToken();
                case 2:
                    return new com.moloco.sdk.BidToken.ClientBidToken.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new java.lang.Object[]{"es_", "payload_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidToken> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.BidToken.ClientBidToken.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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
            com.moloco.sdk.BidToken.ClientBidToken clientBidToken = new com.moloco.sdk.BidToken.ClientBidToken();
            DEFAULT_INSTANCE = clientBidToken;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.BidToken.ClientBidToken.class, clientBidToken);
        }

        public static com.moloco.sdk.BidToken.ClientBidToken getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.BidToken.ClientBidToken> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
