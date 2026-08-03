package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public final class TokenParametersOuterClass$TokenParameters extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
    public static final int AAID_FIELD_NUMBER = 54;
    public static final int ABEXPERIMENTS_FIELD_NUMBER = 63;
    public static final int ADSERVICESVERSION_FIELD_NUMBER = 76;
    public static final int AIRPLANEMODE_FIELD_NUMBER = 50;
    public static final int AMAZONID_FIELD_NUMBER = 53;
    public static final int APPBUILDVERSION_FIELD_NUMBER = 55;
    public static final int APPSETID_FIELD_NUMBER = 73;
    public static final int APPVERSION_FIELD_NUMBER = 6;
    public static final int BATTERYCHARGING_FIELD_NUMBER = 43;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 44;
    public static final int BLUETOOTHPLUGGED_FIELD_NUMBER = 46;
    public static final int BUNDLEID_FIELD_NUMBER = 4;
    public static final int CARRIERNAME_FIELD_NUMBER = 18;
    public static final int CCPASTRING_FIELD_NUMBER = 27;
    public static final int CHILDMODE_FIELD_NUMBER = 69;
    public static final int COPPAAPPLIES_FIELD_NUMBER = 70;
    public static final int COUNTRYCODE_FIELD_NUMBER = 17;
    public static final int DARKMODE_FIELD_NUMBER = 49;
    private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters DEFAULT_INSTANCE;
    public static final int DEVICEAPI_FIELD_NUMBER = 8;
    public static final int DEVICEHEIGHT_FIELD_NUMBER = 13;
    public static final int DEVICELANGUAGE_FIELD_NUMBER = 10;
    public static final int DEVICEMODEL_FIELD_NUMBER = 5;
    public static final int DEVICEOS_FIELD_NUMBER = 7;
    public static final int DEVICEWIDTH_FIELD_NUMBER = 12;
    public static final int DNDMODE_FIELD_NUMBER = 51;
    public static final int DNT_FIELD_NUMBER = 24;
    public static final int ENCRYPTEDTOPICS_FIELD_NUMBER = 74;
    public static final int FRAMEWORKNAME_FIELD_NUMBER = 15;
    public static final int FREESPACE_FIELD_NUMBER = 47;
    public static final int GDPRCONSENT_FIELD_NUMBER = 25;
    public static final int GDPRSTRING_FIELD_NUMBER = 26;
    public static final int GPP_FIELD_NUMBER = 78;
    public static final int HEADSETPLUGGED_FIELD_NUMBER = 45;
    public static final int HORACCURACY_FIELD_NUMBER = 39;
    public static final int IDFA_FIELD_NUMBER = 22;
    public static final int IDFV_FIELD_NUMBER = 23;
    public static final int IGNITEPACKAGENAME_FIELD_NUMBER = 68;
    public static final int IGNITEVERSION_FIELD_NUMBER = 67;
    public static final int INPUTLANGUAGES_FIELD_NUMBER = 21;
    public static final int ISRINGMUTED_FIELD_NUMBER = 52;
    public static final int KEYWORDS_FIELD_NUMBER = 36;
    public static final int LASTADOMAINS_FIELD_NUMBER = 57;
    public static final int LASTADVERTISEDBUNDLES_FIELD_NUMBER = 58;
    public static final int LATITUDE_FIELD_NUMBER = 37;
    public static final int LGPDCONSENT_FIELD_NUMBER = 66;
    public static final int LONGITUDE_FIELD_NUMBER = 38;
    public static final int LOWPOWERMODE_FIELD_NUMBER = 48;
    public static final int MEDIAMUTED_FIELD_NUMBER = 72;
    public static final int MEDIATIONTYPE_FIELD_NUMBER = 14;
    public static final int MOBILECOUNTRYCODE_FIELD_NUMBER = 19;
    public static final int MOBILENETWORKCODE_FIELD_NUMBER = 20;
    public static final int MOCKRESPONSEID_FIELD_NUMBER = 65;
    public static final int MUTEAUDIO_FIELD_NUMBER = 32;
    public static final int NETWORK_FIELD_NUMBER = 31;
    public static final int ODT_FIELD_NUMBER = 71;
    public static final int OFFSETFROMGMT_FIELD_NUMBER = 28;
    public static final int OSVERSION_FIELD_NUMBER = 9;
    private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
    public static final int PORTAL_FIELD_NUMBER = 64;
    public static final int PRIORCLICKS_FIELD_NUMBER = 59;
    public static final int PRIORCLICKTYPES_FIELD_NUMBER = 61;
    public static final int PRIORSKIP_FIELD_NUMBER = 60;
    public static final int PUBEXTRADATA_FIELD_NUMBER = 77;
    public static final int PXRATIO_FIELD_NUMBER = 11;
    public static final int SDKVERSION_FIELD_NUMBER = 3;
    public static final int SECURECONTENT_FIELD_NUMBER = 42;
    public static final int SESSIONDURATION_FIELD_NUMBER = 56;
    public static final int TIMEACCURACY_FIELD_NUMBER = 41;
    public static final int TOPICS_FIELD_NUMBER = 75;
    public static final int TOTALSPACE_FIELD_NUMBER = 16;
    public static final int TRACKINGSTATUS_FIELD_NUMBER = 29;
    public static final int USERAGENT_FIELD_NUMBER = 2;
    public static final int USERAGE_FIELD_NUMBER = 33;
    public static final int USERGENDER_FIELD_NUMBER = 34;
    public static final int USERID_FIELD_NUMBER = 30;
    public static final int USERSESSIONS_FIELD_NUMBER = 62;
    public static final int VERACCURACY_FIELD_NUMBER = 40;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int ZIPCODE_FIELD_NUMBER = 35;
    private static final com.fyber.inneractive.sdk.protobuf.h1 priorClicks_converter_ = new com.fyber.inneractive.sdk.bidder.j();
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString aaid_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 adServicesVersion_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool airplaneMode_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString amazonId_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString appBuildVersion_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString appSetId_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString appVersion_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool batteryCharging_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 batteryLevel_;
    private int bitField0_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool bluetoothPlugged_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString bundleID_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString carrierName_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString ccpaString_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool childMode_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool coppaApplies_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString countryCode_;
    private boolean darkMode_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 deviceApi_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 deviceHeight_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString deviceLanguage_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString deviceModel_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString deviceOS_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 deviceWidth_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool dndMode_;
    private boolean dnt_;
    private int frameworkName_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 freeSpace_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool gdprConsent_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString gdprString_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp gpp_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool headsetPlugged_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat horAccuracy_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString idfa_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString idfv_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString ignitePackageName_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString igniteVersion_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString inputLanguages_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool isRingMuted_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString keywords_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat latitude_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool lgpdConsent_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat longitude_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool lowPowerMode_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool mediaMuted_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString mediationType_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString mobileCountryCode_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString mobileNetworkCode_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString mockResponseId_;
    private boolean muteAudio_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString network_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString odt_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 offsetFromGMT_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString osVersion_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 portal_;
    private int priorClicksMemoizedSerializedSize;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool priorSkip_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat pxRatio_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString sdkVersion_;
    private int secureContent_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 sessionDuration_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat timeAccuracy_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 totalSpace_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 trackingStatus_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 userAge_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString userAgent_;
    private int userGender_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString userID_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat verAccuracy_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString version_;
    private com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString zipCode_;
    private com.fyber.inneractive.sdk.protobuf.k1 lastAdomains_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    private com.fyber.inneractive.sdk.protobuf.k1 lastAdvertisedBundles_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    private com.fyber.inneractive.sdk.protobuf.g1 priorClicks_ = com.fyber.inneractive.sdk.protobuf.z0.emptyIntList();
    private com.fyber.inneractive.sdk.protobuf.k1 priorClickTypes_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    private com.fyber.inneractive.sdk.protobuf.k1 userSessions_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    private com.fyber.inneractive.sdk.protobuf.k1 abExperiments_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    private com.fyber.inneractive.sdk.protobuf.k1 encryptedTopics_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    private com.fyber.inneractive.sdk.protobuf.k1 topics_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    private com.fyber.inneractive.sdk.protobuf.k1 pubExtraData_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();

    public static final class EncryptedTopic extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.m {
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic DEFAULT_INSTANCE;
        public static final int ENCAPSULATEDKEY_FIELD_NUMBER = 3;
        public static final int ENCRYPTEDTOPIC_FIELD_NUMBER = 1;
        public static final int KEYIDENTIFIER_FIELD_NUMBER = 2;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
        private int bitField0_;
        private com.fyber.inneractive.sdk.protobuf.s encapsulatedKey_;
        private com.fyber.inneractive.sdk.protobuf.s encryptedTopic_;
        private java.lang.String keyIdentifier_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic encryptedTopic = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic();
            DEFAULT_INSTANCE = encryptedTopic;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic.class, encryptedTopic);
        }

        private EncryptedTopic() {
            com.fyber.inneractive.sdk.protobuf.q qVar = com.fyber.inneractive.sdk.protobuf.s.b;
            this.encryptedTopic_ = qVar;
            this.keyIdentifier_ = "";
            this.encapsulatedKey_ = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncapsulatedKey() {
            this.bitField0_ &= -5;
            this.encapsulatedKey_ = getDefaultInstance().getEncapsulatedKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryptedTopic() {
            this.bitField0_ &= -2;
            this.encryptedTopic_ = getDefaultInstance().getEncryptedTopic();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyIdentifier() {
            this.bitField0_ &= -3;
            this.keyIdentifier_ = getDefaultInstance().getKeyIdentifier();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.l newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.l) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncapsulatedKey(com.fyber.inneractive.sdk.protobuf.s sVar) {
            sVar.getClass();
            this.bitField0_ |= 4;
            this.encapsulatedKey_ = sVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptedTopic(com.fyber.inneractive.sdk.protobuf.s sVar) {
            sVar.getClass();
            this.bitField0_ |= 1;
            this.encryptedTopic_ = sVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyIdentifier(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.keyIdentifier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyIdentifierBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.keyIdentifier_ = sVar.f();
            this.bitField0_ |= 2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.l();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ለ\u0001\u0003ည\u0002", new java.lang.Object[]{"bitField0_", "encryptedTopic_", "keyIdentifier_", "encapsulatedKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public com.fyber.inneractive.sdk.protobuf.s getEncapsulatedKey() {
            return this.encapsulatedKey_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getEncryptedTopic() {
            return this.encryptedTopic_;
        }

        public java.lang.String getKeyIdentifier() {
            return this.keyIdentifier_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getKeyIdentifierBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.keyIdentifier_);
        }

        public boolean hasEncapsulatedKey() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasEncryptedTopic() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasKeyIdentifier() {
            return (this.bitField0_ & 2) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.l newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic encryptedTopic) {
            return (com.fyber.inneractive.sdk.bidder.l) DEFAULT_INSTANCE.createBuilder(encryptedTopic);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class Experiment extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.o {
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private int bitField0_;
        private java.lang.String identifier_ = "";
        private java.lang.String variant_ = "";

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment experiment = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment();
            DEFAULT_INSTANCE = experiment;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment.class, experiment);
        }

        private Experiment() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifier() {
            this.bitField0_ &= -2;
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVariant() {
            this.bitField0_ &= -3;
            this.variant_ = getDefaultInstance().getVariant();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.n newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.n) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifier(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.identifier_ = sVar.f();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVariant(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.variant_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVariantBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.variant_ = sVar.f();
            this.bitField0_ |= 2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.n();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new java.lang.Object[]{"bitField0_", "identifier_", "variant_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public java.lang.String getIdentifier() {
            return this.identifier_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getIdentifierBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.identifier_);
        }

        public java.lang.String getVariant() {
            return this.variant_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getVariantBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.variant_);
        }

        public boolean hasIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVariant() {
            return (this.bitField0_ & 2) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.n newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment experiment) {
            return (com.fyber.inneractive.sdk.bidder.n) DEFAULT_INSTANCE.createBuilder(experiment);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class Gpp extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp DEFAULT_INSTANCE;
        public static final int GPPENCODEDSTRING_FIELD_NUMBER = 1;
        public static final int GPPSID_FIELD_NUMBER = 2;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
        private int bitField0_;
        private java.lang.String gppEncodedString_ = "";
        private java.lang.String gppSid_ = "";

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp gpp = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp();
            DEFAULT_INSTANCE = gpp;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp.class, gpp);
        }

        private Gpp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGppEncodedString() {
            this.bitField0_ &= -2;
            this.gppEncodedString_ = getDefaultInstance().getGppEncodedString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGppSid() {
            this.bitField0_ &= -3;
            this.gppSid_ = getDefaultInstance().getGppSid();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.r newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.r) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGppEncodedString(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.gppEncodedString_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGppEncodedStringBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.gppEncodedString_ = sVar.f();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGppSid(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.gppSid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGppSidBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.gppSid_ = sVar.f();
            this.bitField0_ |= 2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.r();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new java.lang.Object[]{"bitField0_", "gppEncodedString_", "gppSid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public java.lang.String getGppEncodedString() {
            return this.gppEncodedString_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getGppEncodedStringBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.gppEncodedString_);
        }

        public java.lang.String getGppSid() {
            return this.gppSid_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getGppSidBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.gppSid_);
        }

        public boolean hasGppEncodedString() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasGppSid() {
            return (this.bitField0_ & 2) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.r newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp gpp) {
            return (com.fyber.inneractive.sdk.bidder.r) DEFAULT_INSTANCE.createBuilder(gpp);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class LastAdomain extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.t {
        public static final int ADOMAIN_FIELD_NUMBER = 2;
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private java.lang.String adomain_ = "";
        private int bitField0_;
        private int type_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain();
            DEFAULT_INSTANCE = lastAdomain;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain.class, lastAdomain);
        }

        private LastAdomain() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdomain() {
            this.bitField0_ &= -3;
            this.adomain_ = getDefaultInstance().getAdomain();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.s newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.s) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdomain(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.adomain_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdomainBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.adomain_ = sVar.f();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(com.fyber.inneractive.sdk.bidder.o0 o0Var) {
            this.type_ = o0Var.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.s();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new java.lang.Object[]{"bitField0_", "type_", "adomain_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public java.lang.String getAdomain() {
            return this.adomain_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getAdomainBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.adomain_);
        }

        public com.fyber.inneractive.sdk.bidder.o0 getType() {
            com.fyber.inneractive.sdk.bidder.o0 a2 = com.fyber.inneractive.sdk.bidder.o0.a(this.type_);
            return a2 == null ? com.fyber.inneractive.sdk.bidder.o0.UNRECOGNIZED : a2;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasAdomain() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.s newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain) {
            return (com.fyber.inneractive.sdk.bidder.s) DEFAULT_INSTANCE.createBuilder(lastAdomain);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class LastAdvertisedBundle extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.v {
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle DEFAULT_INSTANCE;
        public static final int LASTBUNDLE_FIELD_NUMBER = 2;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private java.lang.String lastBundle_ = "";
        private int type_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle();
            DEFAULT_INSTANCE = lastAdvertisedBundle;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.class, lastAdvertisedBundle);
        }

        private LastAdvertisedBundle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastBundle() {
            this.bitField0_ &= -3;
            this.lastBundle_ = getDefaultInstance().getLastBundle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.u newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.u) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastBundle(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.lastBundle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastBundleBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.lastBundle_ = sVar.f();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(com.fyber.inneractive.sdk.bidder.o0 o0Var) {
            this.type_ = o0Var.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.u();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new java.lang.Object[]{"bitField0_", "type_", "lastBundle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public java.lang.String getLastBundle() {
            return this.lastBundle_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getLastBundleBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.lastBundle_);
        }

        public com.fyber.inneractive.sdk.bidder.o0 getType() {
            com.fyber.inneractive.sdk.bidder.o0 a2 = com.fyber.inneractive.sdk.bidder.o0.a(this.type_);
            return a2 == null ? com.fyber.inneractive.sdk.bidder.o0.UNRECOGNIZED : a2;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasLastBundle() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.u newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle) {
            return (com.fyber.inneractive.sdk.bidder.u) DEFAULT_INSTANCE.createBuilder(lastAdvertisedBundle);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class NullableBool extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
        private int bitField0_;
        private boolean data_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool();
            DEFAULT_INSTANCE = nullableBool;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.class, nullableBool);
        }

        private NullableBool() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = false;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.w newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.w) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(boolean z) {
            this.bitField0_ |= 1;
            this.data_ = z;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.w();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new java.lang.Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public boolean getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.w newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
            return (com.fyber.inneractive.sdk.bidder.w) DEFAULT_INSTANCE.createBuilder(nullableBool);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class NullableFloat extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
        private int bitField0_;
        private float data_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat();
            DEFAULT_INSTANCE = nullableFloat;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.class, nullableFloat);
        }

        private NullableFloat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0.0f;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.x newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.x) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(float f) {
            this.bitField0_ |= 1;
            this.data_ = f;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.x();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new java.lang.Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public float getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.x newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
            return (com.fyber.inneractive.sdk.bidder.x) DEFAULT_INSTANCE.createBuilder(nullableFloat);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class NullableSInt32 extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
        private int bitField0_;
        private int data_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32();
            DEFAULT_INSTANCE = nullableSInt32;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32.class, nullableSInt32);
        }

        private NullableSInt32() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.y newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.y) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(int i) {
            this.bitField0_ |= 1;
            this.data_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.y();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဏ\u0000", new java.lang.Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.y newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32) {
            return (com.fyber.inneractive.sdk.bidder.y) DEFAULT_INSTANCE.createBuilder(nullableSInt32);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class NullableString extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
        private int bitField0_;
        private java.lang.String data_ = "";

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString();
            DEFAULT_INSTANCE = nullableString;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.class, nullableString);
        }

        private NullableString() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = getDefaultInstance().getData();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.z newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.z) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.data_ = sVar.f();
            this.bitField0_ |= 1;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.z();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new java.lang.Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public java.lang.String getData() {
            return this.data_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getDataBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.data_);
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.z newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
            return (com.fyber.inneractive.sdk.bidder.z) DEFAULT_INSTANCE.createBuilder(nullableString);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class NullableUInt32 extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
        private int bitField0_;
        private int data_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32();
            DEFAULT_INSTANCE = nullableUInt32;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.class, nullableUInt32);
        }

        private NullableUInt32() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.a0 newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.a0) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(int i) {
            this.bitField0_ |= 1;
            this.data_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.a0();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new java.lang.Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.a0 newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
            return (com.fyber.inneractive.sdk.bidder.a0) DEFAULT_INSTANCE.createBuilder(nullableUInt32);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class PriorVideoClickType extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.c0 {
        public static final int CLICKTYPE_FIELD_NUMBER = 2;
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int clickType_;
        private int type_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType();
            DEFAULT_INSTANCE = priorVideoClickType;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType.class, priorVideoClickType);
        }

        private PriorVideoClickType() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickType() {
            this.bitField0_ &= -3;
            this.clickType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.b0 newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.b0) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickType(com.fyber.inneractive.sdk.bidder.u0 u0Var) {
            this.clickType_ = u0Var.a();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickTypeValue(int i) {
            this.bitField0_ |= 2;
            this.clickType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(com.fyber.inneractive.sdk.bidder.o0 o0Var) {
            this.type_ = o0Var.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.b0();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new java.lang.Object[]{"bitField0_", "type_", "clickType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public com.fyber.inneractive.sdk.bidder.u0 getClickType() {
            int i = this.clickType_;
            com.fyber.inneractive.sdk.bidder.u0 u0Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : com.fyber.inneractive.sdk.bidder.u0.STOREPROMO : com.fyber.inneractive.sdk.bidder.u0.APPINFO : com.fyber.inneractive.sdk.bidder.u0.VIDEOVIEW : com.fyber.inneractive.sdk.bidder.u0.COMPANION : com.fyber.inneractive.sdk.bidder.u0.CTABUTTON : com.fyber.inneractive.sdk.bidder.u0.NOCLICK;
            return u0Var == null ? com.fyber.inneractive.sdk.bidder.u0.UNRECOGNIZED : u0Var;
        }

        public int getClickTypeValue() {
            return this.clickType_;
        }

        public com.fyber.inneractive.sdk.bidder.o0 getType() {
            com.fyber.inneractive.sdk.bidder.o0 a2 = com.fyber.inneractive.sdk.bidder.o0.a(this.type_);
            return a2 == null ? com.fyber.inneractive.sdk.bidder.o0.UNRECOGNIZED : a2;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasClickType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.b0 newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType) {
            return (com.fyber.inneractive.sdk.bidder.b0) DEFAULT_INSTANCE.createBuilder(priorVideoClickType);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class PubExtraData extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.e0 {
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private java.lang.String key_ = "";
        private java.lang.String value_ = "";

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData();
            DEFAULT_INSTANCE = pubExtraData;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData.class, pubExtraData);
        }

        private PubExtraData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKey() {
            this.bitField0_ &= -2;
            this.key_ = getDefaultInstance().getKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.bitField0_ &= -3;
            this.value_ = getDefaultInstance().getValue();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.d0 newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.d0) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKey(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.key_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.key_ = sVar.f();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.value_ = sVar.f();
            this.bitField0_ |= 2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.d0();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new java.lang.Object[]{"bitField0_", "key_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public java.lang.String getKey() {
            return this.key_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getKeyBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.key_);
        }

        public java.lang.String getValue() {
            return this.value_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getValueBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.value_);
        }

        public boolean hasKey() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.d0 newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData) {
            return (com.fyber.inneractive.sdk.bidder.d0) DEFAULT_INSTANCE.createBuilder(pubExtraData);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class SessionData extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.i0 {
        public static final int CLICKS_FIELD_NUMBER = 2;
        public static final int COMPLETIONS_FIELD_NUMBER = 3;
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData DEFAULT_INSTANCE;
        public static final int IMPRESSIONS_FIELD_NUMBER = 1;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
        private int bitField0_;
        private int clicks_;
        private int completions_;
        private int impressions_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData sessionData = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData();
            DEFAULT_INSTANCE = sessionData;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData.class, sessionData);
        }

        private SessionData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClicks() {
            this.bitField0_ &= -3;
            this.clicks_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompletions() {
            this.bitField0_ &= -5;
            this.completions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressions() {
            this.bitField0_ &= -2;
            this.impressions_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.h0 newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.h0) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClicks(int i) {
            this.bitField0_ |= 2;
            this.clicks_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompletions(int i) {
            this.bitField0_ |= 4;
            this.completions_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressions(int i) {
            this.bitField0_ |= 1;
            this.impressions_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.h0();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new java.lang.Object[]{"bitField0_", "impressions_", "clicks_", "completions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public int getClicks() {
            return this.clicks_;
        }

        public int getCompletions() {
            return this.completions_;
        }

        public int getImpressions() {
            return this.impressions_;
        }

        public boolean hasClicks() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCompletions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasImpressions() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.h0 newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData sessionData) {
            return (com.fyber.inneractive.sdk.bidder.h0) DEFAULT_INSTANCE.createBuilder(sessionData);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class Topic extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.k0 {
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic DEFAULT_INSTANCE;
        public static final int MODELVERSION_FIELD_NUMBER = 3;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int TAXONOMYVERSION_FIELD_NUMBER = 2;
        public static final int TOPICID_FIELD_NUMBER = 1;
        private int bitField0_;
        private long modelVersion_;
        private long taxonomyVersion_;
        private int topicId_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic topic = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic();
            DEFAULT_INSTANCE = topic;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic.class, topic);
        }

        private Topic() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModelVersion() {
            this.bitField0_ &= -5;
            this.modelVersion_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTaxonomyVersion() {
            this.bitField0_ &= -3;
            this.taxonomyVersion_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopicId() {
            this.bitField0_ &= -2;
            this.topicId_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.j0 newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.j0) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelVersion(long j) {
            this.bitField0_ |= 4;
            this.modelVersion_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaxonomyVersion(long j) {
            this.bitField0_ |= 2;
            this.taxonomyVersion_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopicId(int i) {
            this.bitField0_ |= 1;
            this.topicId_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.j0();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new java.lang.Object[]{"bitField0_", "topicId_", "taxonomyVersion_", "modelVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public long getModelVersion() {
            return this.modelVersion_;
        }

        public long getTaxonomyVersion() {
            return this.taxonomyVersion_;
        }

        public int getTopicId() {
            return this.topicId_;
        }

        public boolean hasModelVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTaxonomyVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTopicId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.j0 newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic topic) {
            return (com.fyber.inneractive.sdk.bidder.j0) DEFAULT_INSTANCE.createBuilder(topic);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class UserSession extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.s0 {
        private static final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int SESSIONDATAITEMS_FIELD_NUMBER = 3;
        public static final int SUBTYPE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private com.fyber.inneractive.sdk.protobuf.k1 sessionDataItems_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
        private int subType_;
        private int type_;

        static {
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession userSession = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession();
            DEFAULT_INSTANCE = userSession;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession.class, userSession);
        }

        private UserSession() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSessionDataItems(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData> iterable) {
            ensureSessionDataItemsIsMutable();
            com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.sessionDataItems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSessionDataItems(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(sessionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionDataItems() {
            this.sessionDataItems_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubType() {
            this.bitField0_ &= -3;
            this.subType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureSessionDataItemsIsMutable() {
            com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.sessionDataItems_;
            if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
                return;
            }
            this.sessionDataItems_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.r0 newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.r0) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSessionDataItems(int i) {
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionDataItems(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.set(i, sessionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubType(com.fyber.inneractive.sdk.bidder.m0 m0Var) {
            this.subType_ = m0Var.a();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTypeValue(int i) {
            this.bitField0_ |= 2;
            this.subType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(com.fyber.inneractive.sdk.bidder.o0 o0Var) {
            this.type_ = o0Var.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.r0();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new java.lang.Object[]{"bitField0_", "type_", "subType_", "sessionDataItems_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession.class) {
                            m2Var = PARSER;
                            if (m2Var == null) {
                                m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                                PARSER = m2Var;
                            }
                        }
                    }
                    return m2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData getSessionDataItems(int i) {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) this.sessionDataItems_.get(i);
        }

        public int getSessionDataItemsCount() {
            return this.sessionDataItems_.size();
        }

        public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData> getSessionDataItemsList() {
            return this.sessionDataItems_;
        }

        public com.fyber.inneractive.sdk.bidder.i0 getSessionDataItemsOrBuilder(int i) {
            return (com.fyber.inneractive.sdk.bidder.i0) this.sessionDataItems_.get(i);
        }

        public java.util.List<? extends com.fyber.inneractive.sdk.bidder.i0> getSessionDataItemsOrBuilderList() {
            return this.sessionDataItems_;
        }

        public com.fyber.inneractive.sdk.bidder.m0 getSubType() {
            int i = this.subType_;
            com.fyber.inneractive.sdk.bidder.m0 m0Var = i != 0 ? i != 1 ? i != 2 ? null : com.fyber.inneractive.sdk.bidder.m0.VIDEO : com.fyber.inneractive.sdk.bidder.m0.DISPLAY : com.fyber.inneractive.sdk.bidder.m0.UNITCONTENTTYPEUNKNOWN;
            return m0Var == null ? com.fyber.inneractive.sdk.bidder.m0.UNRECOGNIZED : m0Var;
        }

        public int getSubTypeValue() {
            return this.subType_;
        }

        public com.fyber.inneractive.sdk.bidder.o0 getType() {
            com.fyber.inneractive.sdk.bidder.o0 a2 = com.fyber.inneractive.sdk.bidder.o0.a(this.type_);
            return a2 == null ? com.fyber.inneractive.sdk.bidder.o0.UNRECOGNIZED : a2;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasSubType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.r0 newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession userSession) {
            return (com.fyber.inneractive.sdk.bidder.r0) DEFAULT_INSTANCE.createBuilder(userSession);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSessionDataItems(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(i, sessionData);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    static {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters();
        DEFAULT_INSTANCE = tokenParametersOuterClass$TokenParameters;
        com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.class, tokenParametersOuterClass$TokenParameters);
    }

    private TokenParametersOuterClass$TokenParameters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAbExperiments(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment> iterable) {
        ensureAbExperimentsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.abExperiments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEncryptedTopics(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic> iterable) {
        ensureEncryptedTopicsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.encryptedTopics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLastAdomains(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain> iterable) {
        ensureLastAdomainsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.lastAdomains_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLastAdvertisedBundles(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle> iterable) {
        ensureLastAdvertisedBundlesIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.lastAdvertisedBundles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClickTypes(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType> iterable) {
        ensurePriorClickTypesIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.priorClickTypes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClicks(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.o0> iterable) {
        ensurePriorClicksIsMutable();
        for (com.fyber.inneractive.sdk.bidder.o0 o0Var : iterable) {
            ((com.fyber.inneractive.sdk.protobuf.a1) this.priorClicks_).c(o0Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClicksValue(java.lang.Iterable<java.lang.Integer> iterable) {
        ensurePriorClicksIsMutable();
        java.util.Iterator<java.lang.Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.protobuf.a1) this.priorClicks_).c(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPubExtraData(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData> iterable) {
        ensurePubExtraDataIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.pubExtraData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTopics(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic> iterable) {
        ensureTopicsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.topics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUserSessions(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession> iterable) {
        ensureUserSessionsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.userSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEncryptedTopics(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic encryptedTopic) {
        encryptedTopic.getClass();
        ensureEncryptedTopicsIsMutable();
        this.encryptedTopics_.add(encryptedTopic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdomains(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdvertisedBundles(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClickTypes(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClicks(com.fyber.inneractive.sdk.bidder.o0 o0Var) {
        o0Var.getClass();
        ensurePriorClicksIsMutable();
        ((com.fyber.inneractive.sdk.protobuf.a1) this.priorClicks_).c(o0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClicksValue(int i) {
        ensurePriorClicksIsMutable();
        ((com.fyber.inneractive.sdk.protobuf.a1) this.priorClicks_).c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPubExtraData(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData) {
        pubExtraData.getClass();
        ensurePubExtraDataIsMutable();
        this.pubExtraData_.add(pubExtraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopics(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic topic) {
        topic.getClass();
        ensureTopicsIsMutable();
        this.topics_.add(topic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserSessions(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAaid() {
        this.aaid_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbExperiments() {
        this.abExperiments_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdServicesVersion() {
        this.adServicesVersion_ = null;
        this.bitField0_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAirplaneMode() {
        this.airplaneMode_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmazonId() {
        this.amazonId_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppBuildVersion() {
        this.appBuildVersion_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppSetId() {
        this.appSetId_ = null;
        this.bitField0_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.appVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryCharging() {
        this.batteryCharging_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryLevel() {
        this.batteryLevel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothPlugged() {
        this.bluetoothPlugged_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundleID() {
        this.bundleID_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarrierName() {
        this.carrierName_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcpaString() {
        this.ccpaString_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildMode() {
        this.childMode_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoppaApplies() {
        this.coppaApplies_ = null;
        this.bitField0_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.countryCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDarkMode() {
        this.darkMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceApi() {
        this.deviceApi_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceHeight() {
        this.deviceHeight_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceLanguage() {
        this.deviceLanguage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.deviceModel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceOS() {
        this.deviceOS_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceWidth() {
        this.deviceWidth_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDndMode() {
        this.dndMode_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDnt() {
        this.bitField0_ &= -17;
        this.dnt_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedTopics() {
        this.encryptedTopics_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrameworkName() {
        this.frameworkName_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeSpace() {
        this.freeSpace_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprConsent() {
        this.gdprConsent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprString() {
        this.gdprString_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpp() {
        this.gpp_ = null;
        this.bitField0_ &= -33554433;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadsetPlugged() {
        this.headsetPlugged_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHorAccuracy() {
        this.horAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfa() {
        this.idfa_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfv() {
        this.idfv_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnitePackageName() {
        this.ignitePackageName_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgniteVersion() {
        this.igniteVersion_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputLanguages() {
        this.inputLanguages_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRingMuted() {
        this.isRingMuted_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeywords() {
        this.keywords_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAdomains() {
        this.lastAdomains_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAdvertisedBundles() {
        this.lastAdvertisedBundles_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLgpdConsent() {
        this.lgpdConsent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowPowerMode() {
        this.lowPowerMode_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaMuted() {
        this.mediaMuted_ = null;
        this.bitField0_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediationType() {
        this.mediationType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileCountryCode() {
        this.mobileCountryCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileNetworkCode() {
        this.mobileNetworkCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMockResponseId() {
        this.mockResponseId_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMuteAudio() {
        this.muteAudio_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetwork() {
        this.network_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOdt() {
        this.odt_ = null;
        this.bitField0_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffsetFromGMT() {
        this.offsetFromGMT_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortal() {
        this.portal_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorClickTypes() {
        this.priorClickTypes_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorClicks() {
        this.priorClicks_ = com.fyber.inneractive.sdk.protobuf.z0.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorSkip() {
        this.priorSkip_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPubExtraData() {
        this.pubExtraData_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPxRatio() {
        this.pxRatio_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.sdkVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecureContent() {
        this.secureContent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionDuration() {
        this.sessionDuration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeAccuracy() {
        this.timeAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopics() {
        this.topics_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSpace() {
        this.totalSpace_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackingStatus() {
        this.trackingStatus_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAge() {
        this.userAge_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserGender() {
        this.userGender_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserID() {
        this.userID_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSessions() {
        this.userSessions_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerAccuracy() {
        this.verAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZipCode() {
        this.zipCode_ = null;
    }

    private void ensureAbExperimentsIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.abExperiments_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.abExperiments_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    private void ensureEncryptedTopicsIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.encryptedTopics_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.encryptedTopics_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    private void ensureLastAdomainsIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.lastAdomains_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.lastAdomains_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    private void ensureLastAdvertisedBundlesIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.lastAdvertisedBundles_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.lastAdvertisedBundles_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    private void ensurePriorClickTypesIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.priorClickTypes_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.priorClickTypes_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensurePriorClicksIsMutable() {
        com.fyber.inneractive.sdk.protobuf.g1 g1Var = this.priorClicks_;
        if (((com.fyber.inneractive.sdk.protobuf.c) g1Var).f4180a) {
            return;
        }
        this.priorClicks_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(g1Var);
    }

    private void ensurePubExtraDataIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.pubExtraData_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.pubExtraData_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    private void ensureTopicsIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.topics_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.topics_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    private void ensureUserSessionsIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.userSessions_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.userSessions_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAaid(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.aaid_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.aaid_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.aaid_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.aaid_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdServicesVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.adServicesVersion_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.adServicesVersion_ = nullableUInt32;
        } else {
            com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.adServicesVersion_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
            this.adServicesVersion_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
        }
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAirplaneMode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.airplaneMode_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.airplaneMode_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.airplaneMode_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.airplaneMode_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAmazonId(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.amazonId_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.amazonId_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.amazonId_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.amazonId_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppBuildVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.appBuildVersion_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.appBuildVersion_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.appBuildVersion_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.appBuildVersion_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppSetId(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.appSetId_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.appSetId_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.appSetId_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.appSetId_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.appVersion_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.appVersion_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.appVersion_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.appVersion_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBatteryCharging(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.batteryCharging_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.batteryCharging_ = nullableBool;
            return;
        }
        com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.batteryCharging_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
        this.batteryCharging_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBatteryLevel(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.batteryLevel_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.batteryLevel_ = nullableUInt32;
            return;
        }
        com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.batteryLevel_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
        this.batteryLevel_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothPlugged(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.bluetoothPlugged_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.bluetoothPlugged_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.bluetoothPlugged_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.bluetoothPlugged_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBundleID(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.bundleID_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.bundleID_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.bundleID_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.bundleID_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarrierName(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.carrierName_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.carrierName_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.carrierName_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.carrierName_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCcpaString(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.ccpaString_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.ccpaString_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.ccpaString_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.ccpaString_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChildMode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.childMode_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.childMode_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.childMode_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.childMode_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoppaApplies(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.coppaApplies_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.coppaApplies_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.coppaApplies_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.coppaApplies_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCountryCode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.countryCode_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.countryCode_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.countryCode_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.countryCode_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceApi(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.deviceApi_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.deviceApi_ = nullableUInt32;
        } else {
            com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.deviceApi_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
            this.deviceApi_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceHeight(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.deviceHeight_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.deviceHeight_ = nullableUInt32;
            return;
        }
        com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.deviceHeight_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
        this.deviceHeight_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceLanguage(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.deviceLanguage_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.deviceLanguage_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.deviceLanguage_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.deviceLanguage_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceModel(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.deviceModel_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.deviceModel_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.deviceModel_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.deviceModel_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceOS(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.deviceOS_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.deviceOS_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.deviceOS_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.deviceOS_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceWidth(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.deviceWidth_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.deviceWidth_ = nullableUInt32;
            return;
        }
        com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.deviceWidth_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
        this.deviceWidth_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDndMode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.dndMode_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.dndMode_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.dndMode_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.dndMode_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFreeSpace(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.freeSpace_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.freeSpace_ = nullableUInt32;
            return;
        }
        com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.freeSpace_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
        this.freeSpace_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprConsent(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.gdprConsent_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.gdprConsent_ = nullableBool;
            return;
        }
        com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.gdprConsent_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
        this.gdprConsent_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprString(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.gdprString_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.gdprString_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.gdprString_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.gdprString_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGpp(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp gpp) {
        gpp.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp gpp2 = this.gpp_;
        if (gpp2 == null || gpp2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp.getDefaultInstance()) {
            this.gpp_ = gpp;
        } else {
            com.fyber.inneractive.sdk.bidder.r newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp.newBuilder(this.gpp_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, gpp);
            this.gpp_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) newBuilder.b();
        }
        this.bitField0_ |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeadsetPlugged(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.headsetPlugged_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.headsetPlugged_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.headsetPlugged_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.headsetPlugged_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHorAccuracy(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat2 = this.horAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance()) {
            this.horAccuracy_ = nullableFloat;
            return;
        }
        com.fyber.inneractive.sdk.bidder.x newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder(this.horAccuracy_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableFloat);
        this.horAccuracy_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdfa(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.idfa_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.idfa_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.idfa_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.idfa_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdfv(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.idfv_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.idfv_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.idfv_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.idfv_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIgnitePackageName(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.ignitePackageName_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.ignitePackageName_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.ignitePackageName_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.ignitePackageName_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIgniteVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.igniteVersion_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.igniteVersion_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.igniteVersion_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.igniteVersion_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInputLanguages(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.inputLanguages_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.inputLanguages_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.inputLanguages_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.inputLanguages_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIsRingMuted(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.isRingMuted_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.isRingMuted_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.isRingMuted_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.isRingMuted_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeywords(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.keywords_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.keywords_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.keywords_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.keywords_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLatitude(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat2 = this.latitude_;
        if (nullableFloat2 == null || nullableFloat2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance()) {
            this.latitude_ = nullableFloat;
            return;
        }
        com.fyber.inneractive.sdk.bidder.x newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder(this.latitude_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableFloat);
        this.latitude_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLgpdConsent(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.lgpdConsent_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.lgpdConsent_ = nullableBool;
            return;
        }
        com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.lgpdConsent_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
        this.lgpdConsent_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLongitude(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat2 = this.longitude_;
        if (nullableFloat2 == null || nullableFloat2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance()) {
            this.longitude_ = nullableFloat;
            return;
        }
        com.fyber.inneractive.sdk.bidder.x newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder(this.longitude_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableFloat);
        this.longitude_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLowPowerMode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.lowPowerMode_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.lowPowerMode_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.lowPowerMode_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.lowPowerMode_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMediaMuted(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.mediaMuted_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.mediaMuted_ = nullableBool;
        } else {
            com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.mediaMuted_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
            this.mediaMuted_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
        }
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMediationType(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.mediationType_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.mediationType_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.mediationType_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.mediationType_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobileCountryCode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.mobileCountryCode_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.mobileCountryCode_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.mobileCountryCode_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.mobileCountryCode_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobileNetworkCode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.mobileNetworkCode_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.mobileNetworkCode_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.mobileNetworkCode_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.mobileNetworkCode_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMockResponseId(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.mockResponseId_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.mockResponseId_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.mockResponseId_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.mockResponseId_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetwork(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.network_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.network_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.network_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.network_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOdt(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.odt_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.odt_ = nullableString;
        } else {
            com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.odt_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
            this.odt_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
        }
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOffsetFromGMT(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt322 = this.offsetFromGMT_;
        if (nullableSInt322 == null || nullableSInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32.getDefaultInstance()) {
            this.offsetFromGMT_ = nullableSInt32;
            return;
        }
        com.fyber.inneractive.sdk.bidder.y newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder(this.offsetFromGMT_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableSInt32);
        this.offsetFromGMT_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOsVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.osVersion_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.osVersion_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.osVersion_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.osVersion_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePortal(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.portal_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.portal_ = nullableUInt32;
        } else {
            com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.portal_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
            this.portal_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
        }
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriorSkip(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool2 = this.priorSkip_;
        if (nullableBool2 == null || nullableBool2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance()) {
            this.priorSkip_ = nullableBool;
            return;
        }
        com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder(this.priorSkip_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableBool);
        this.priorSkip_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePxRatio(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat2 = this.pxRatio_;
        if (nullableFloat2 == null || nullableFloat2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance()) {
            this.pxRatio_ = nullableFloat;
        } else {
            com.fyber.inneractive.sdk.bidder.x newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder(this.pxRatio_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableFloat);
            this.pxRatio_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.b();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdkVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.sdkVersion_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.sdkVersion_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.sdkVersion_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.sdkVersion_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSessionDuration(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.sessionDuration_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.sessionDuration_ = nullableUInt32;
            return;
        }
        com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.sessionDuration_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
        this.sessionDuration_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeAccuracy(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat2 = this.timeAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance()) {
            this.timeAccuracy_ = nullableFloat;
            return;
        }
        com.fyber.inneractive.sdk.bidder.x newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder(this.timeAccuracy_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableFloat);
        this.timeAccuracy_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTotalSpace(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.totalSpace_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.totalSpace_ = nullableUInt32;
            return;
        }
        com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.totalSpace_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
        this.totalSpace_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackingStatus(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.trackingStatus_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.trackingStatus_ = nullableUInt32;
        } else {
            com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.trackingStatus_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
            this.trackingStatus_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAge(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = this.userAge_;
        if (nullableUInt322 == null || nullableUInt322 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance()) {
            this.userAge_ = nullableUInt32;
            return;
        }
        com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder(this.userAge_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableUInt32);
        this.userAge_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgent(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.userAgent_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.userAgent_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.userAgent_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.userAgent_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserID(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.userID_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.userID_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.userID_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.userID_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVerAccuracy(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat2 = this.verAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance()) {
            this.verAccuracy_ = nullableFloat;
            return;
        }
        com.fyber.inneractive.sdk.bidder.x newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder(this.verAccuracy_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableFloat);
        this.verAccuracy_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.version_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.version_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.version_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.version_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZipCode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString2 = this.zipCode_;
        if (nullableString2 == null || nullableString2 == com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance()) {
            this.zipCode_ = nullableString;
            return;
        }
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder(this.zipCode_);
        newBuilder.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, nullableString);
        this.zipCode_ = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b();
    }

    public static com.fyber.inneractive.sdk.bidder.k newBuilder() {
        return (com.fyber.inneractive.sdk.bidder.k) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAbExperiments(int i) {
        ensureAbExperimentsIsMutable();
        this.abExperiments_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEncryptedTopics(int i) {
        ensureEncryptedTopicsIsMutable();
        this.encryptedTopics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLastAdomains(int i) {
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLastAdvertisedBundles(int i) {
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePriorClickTypes(int i) {
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePubExtraData(int i) {
        ensurePubExtraDataIsMutable();
        this.pubExtraData_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTopics(int i) {
        ensureTopicsIsMutable();
        this.topics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUserSessions(int i) {
        ensureUserSessionsIsMutable();
        this.userSessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAaid(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.aaid_ = nullableString;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbExperiments(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.set(i, experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdServicesVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.adServicesVersion_ = nullableUInt32;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAirplaneMode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.airplaneMode_ = nullableBool;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmazonId(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.amazonId_ = nullableString;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppBuildVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.appBuildVersion_ = nullableString;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppSetId(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.appSetId_ = nullableString;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.appVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryCharging(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.batteryCharging_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryLevel(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.batteryLevel_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothPlugged(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.bluetoothPlugged_ = nullableBool;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleID(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.bundleID_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarrierName(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.carrierName_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcpaString(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.ccpaString_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildMode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.childMode_ = nullableBool;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoppaApplies(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.coppaApplies_ = nullableBool;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.countryCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkMode(boolean z) {
        this.darkMode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceApi(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceApi_ = nullableUInt32;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceHeight(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceHeight_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceLanguage(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.deviceLanguage_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.deviceModel_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOS(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.deviceOS_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceWidth(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceWidth_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDndMode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.dndMode_ = nullableBool;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDnt(boolean z) {
        this.bitField0_ |= 16;
        this.dnt_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedTopics(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic encryptedTopic) {
        encryptedTopic.getClass();
        ensureEncryptedTopicsIsMutable();
        this.encryptedTopics_.set(i, encryptedTopic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkName(com.fyber.inneractive.sdk.bidder.q qVar) {
        this.frameworkName_ = qVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkNameValue(int i) {
        this.frameworkName_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeSpace(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.freeSpace_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprConsent(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.gdprConsent_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprString(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.gdprString_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpp(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp gpp) {
        gpp.getClass();
        this.gpp_ = gpp;
        this.bitField0_ |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadsetPlugged(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.headsetPlugged_ = nullableBool;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorAccuracy(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.horAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfa(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.idfa_ = nullableString;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfv(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.idfv_ = nullableString;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnitePackageName(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.ignitePackageName_ = nullableString;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.igniteVersion_ = nullableString;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputLanguages(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.inputLanguages_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRingMuted(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.isRingMuted_ = nullableBool;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeywords(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.keywords_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAdomains(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.set(i, lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAdvertisedBundles(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.set(i, lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.latitude_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLgpdConsent(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.lgpdConsent_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.longitude_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowPowerMode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.lowPowerMode_ = nullableBool;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaMuted(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.mediaMuted_ = nullableBool;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationType(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.mediationType_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileCountryCode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.mobileCountryCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileNetworkCode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.mobileNetworkCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockResponseId(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.mockResponseId_ = nullableString;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMuteAudio(boolean z) {
        this.muteAudio_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetwork(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.network_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOdt(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.odt_ = nullableString;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffsetFromGMT(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        this.offsetFromGMT_ = nullableSInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.osVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortal(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.portal_ = nullableUInt32;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClickTypes(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.set(i, priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClicks(int i, com.fyber.inneractive.sdk.bidder.o0 o0Var) {
        o0Var.getClass();
        ensurePriorClicksIsMutable();
        com.fyber.inneractive.sdk.protobuf.g1 g1Var = this.priorClicks_;
        int a2 = o0Var.a();
        com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) g1Var;
        a1Var.c();
        a1Var.d(i);
        int[] iArr = a1Var.b;
        int i2 = iArr[i];
        iArr[i] = a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClicksValue(int i, int i2) {
        ensurePriorClicksIsMutable();
        com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) this.priorClicks_;
        a1Var.c();
        a1Var.d(i);
        int[] iArr = a1Var.b;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorSkip(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool) {
        nullableBool.getClass();
        this.priorSkip_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPubExtraData(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData) {
        pubExtraData.getClass();
        ensurePubExtraDataIsMutable();
        this.pubExtraData_.set(i, pubExtraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPxRatio(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.pxRatio_ = nullableFloat;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.sdkVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecureContent(com.fyber.inneractive.sdk.bidder.g0 g0Var) {
        this.secureContent_ = g0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecureContentValue(int i) {
        this.secureContent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionDuration(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.sessionDuration_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeAccuracy(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.timeAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopics(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic topic) {
        topic.getClass();
        ensureTopicsIsMutable();
        this.topics_.set(i, topic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSpace(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.totalSpace_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackingStatus(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.trackingStatus_ = nullableUInt32;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAge(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.userAge_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.userAgent_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGender(com.fyber.inneractive.sdk.bidder.q0 q0Var) {
        this.userGender_ = q0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGenderValue(int i) {
        this.userGender_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserID(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.userID_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSessions(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.set(i, userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerAccuracy(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.verAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.version_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZipCode(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString) {
        nullableString.getClass();
        this.zipCode_ = nullableString;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0
    public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.fyber.inneractive.sdk.bidder.i.f3548a[y0Var.ordinal()]) {
            case 1:
                return new com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters();
            case 2:
                return new com.fyber.inneractive.sdk.bidder.k();
            case 3:
                return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000N\u0000\u0001\u0001NN\u0000\t\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\bဉ\u0000\t\t\n\t\u000bဉ\u0001\f\t\r\t\u000e\t\u000f\f\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016ဉ\u0002\u0017ဉ\u0003\u0018ဇ\u0004\u0019\t\u001a\t\u001b\t\u001c\t\u001dဉ\u0005\u001e\t\u001f\t \u0007!\t\"\f#\t$\t%\t&\t'\t(\t)\t*\f+\t,\t-ဉ\u0006.ဉ\u0007/\t0ဉ\b1\u00072ဉ\t3ဉ\n4ဉ\u000b5ဉ\f6ဉ\r7ဉ\u000e8\t9\u001b:\u001b;,<\t=\u001b>\u001b?\u001b@ဉ\u000fAဉ\u0010B\tCဉ\u0011Dဉ\u0012Eဉ\u0013Fဉ\u0014Gဉ\u0015Hဉ\u0016Iဉ\u0017J\u001bK\u001bLဉ\u0018M\u001bNဉ\u0019", new java.lang.Object[]{"bitField0_", "version_", "userAgent_", "sdkVersion_", "bundleID_", "deviceModel_", "appVersion_", "deviceOS_", "deviceApi_", "osVersion_", "deviceLanguage_", "pxRatio_", "deviceWidth_", "deviceHeight_", "mediationType_", "frameworkName_", "totalSpace_", "countryCode_", "carrierName_", "mobileCountryCode_", "mobileNetworkCode_", "inputLanguages_", "idfa_", "idfv_", "dnt_", "gdprConsent_", "gdprString_", "ccpaString_", "offsetFromGMT_", "trackingStatus_", "userID_", "network_", "muteAudio_", "userAge_", "userGender_", "zipCode_", "keywords_", "latitude_", "longitude_", "horAccuracy_", "verAccuracy_", "timeAccuracy_", "secureContent_", "batteryCharging_", "batteryLevel_", "headsetPlugged_", "bluetoothPlugged_", "freeSpace_", "lowPowerMode_", "darkMode_", "airplaneMode_", "dndMode_", "isRingMuted_", "amazonId_", "aaid_", "appBuildVersion_", "sessionDuration_", "lastAdomains_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain.class, "lastAdvertisedBundles_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.class, "priorClicks_", "priorSkip_", "priorClickTypes_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType.class, "userSessions_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession.class, "abExperiments_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment.class, "portal_", "mockResponseId_", "lgpdConsent_", "igniteVersion_", "ignitePackageName_", "childMode_", "coppaApplies_", "odt_", "mediaMuted_", "appSetId_", "encryptedTopics_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic.class, "topics_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic.class, "adServicesVersion_", "pubExtraData_", com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData.class, "gpp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                if (m2Var == null) {
                    synchronized (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.class) {
                        m2Var = PARSER;
                        if (m2Var == null) {
                            m2Var = new com.fyber.inneractive.sdk.protobuf.u0();
                            PARSER = m2Var;
                        }
                    }
                }
                return m2Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getAaid() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.aaid_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment getAbExperiments(int i) {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) this.abExperiments_.get(i);
    }

    public int getAbExperimentsCount() {
        return this.abExperiments_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment> getAbExperimentsList() {
        return this.abExperiments_;
    }

    public com.fyber.inneractive.sdk.bidder.o getAbExperimentsOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.o) this.abExperiments_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.o> getAbExperimentsOrBuilderList() {
        return this.abExperiments_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getAdServicesVersion() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.adServicesVersion_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getAirplaneMode() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.airplaneMode_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getAmazonId() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.amazonId_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getAppBuildVersion() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.appBuildVersion_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getAppSetId() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.appSetId_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getAppVersion() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.appVersion_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getBatteryCharging() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.batteryCharging_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getBatteryLevel() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.batteryLevel_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getBluetoothPlugged() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.bluetoothPlugged_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getBundleID() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.bundleID_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getCarrierName() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.carrierName_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getCcpaString() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.ccpaString_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getChildMode() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.childMode_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getCoppaApplies() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.coppaApplies_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getCountryCode() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.countryCode_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getDarkMode() {
        return this.darkMode_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getDeviceApi() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.deviceApi_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getDeviceHeight() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.deviceHeight_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getDeviceLanguage() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.deviceLanguage_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getDeviceModel() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.deviceModel_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getDeviceOS() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.deviceOS_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getDeviceWidth() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.deviceWidth_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getDndMode() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.dndMode_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public boolean getDnt() {
        return this.dnt_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic getEncryptedTopics(int i) {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic) this.encryptedTopics_.get(i);
    }

    public int getEncryptedTopicsCount() {
        return this.encryptedTopics_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic> getEncryptedTopicsList() {
        return this.encryptedTopics_;
    }

    public com.fyber.inneractive.sdk.bidder.m getEncryptedTopicsOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.m) this.encryptedTopics_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.m> getEncryptedTopicsOrBuilderList() {
        return this.encryptedTopics_;
    }

    public com.fyber.inneractive.sdk.bidder.q getFrameworkName() {
        int i = this.frameworkName_;
        com.fyber.inneractive.sdk.bidder.q qVar = i != 0 ? i != 1 ? null : com.fyber.inneractive.sdk.bidder.q.UNITY3D : com.fyber.inneractive.sdk.bidder.q.NATIVE;
        return qVar == null ? com.fyber.inneractive.sdk.bidder.q.UNRECOGNIZED : qVar;
    }

    public int getFrameworkNameValue() {
        return this.frameworkName_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getFreeSpace() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.freeSpace_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getGdprConsent() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.gdprConsent_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getGdprString() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.gdprString_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp getGpp() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp gpp = this.gpp_;
        return gpp == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp.getDefaultInstance() : gpp;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getHeadsetPlugged() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.headsetPlugged_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat getHorAccuracy() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat = this.horAccuracy_;
        return nullableFloat == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getIdfa() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.idfa_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getIdfv() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.idfv_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getIgnitePackageName() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.ignitePackageName_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getIgniteVersion() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.igniteVersion_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getInputLanguages() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.inputLanguages_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getIsRingMuted() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.isRingMuted_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getKeywords() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.keywords_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain getLastAdomains(int i) {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) this.lastAdomains_.get(i);
    }

    public int getLastAdomainsCount() {
        return this.lastAdomains_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain> getLastAdomainsList() {
        return this.lastAdomains_;
    }

    public com.fyber.inneractive.sdk.bidder.t getLastAdomainsOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.t) this.lastAdomains_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.t> getLastAdomainsOrBuilderList() {
        return this.lastAdomains_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle getLastAdvertisedBundles(int i) {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) this.lastAdvertisedBundles_.get(i);
    }

    public int getLastAdvertisedBundlesCount() {
        return this.lastAdvertisedBundles_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle> getLastAdvertisedBundlesList() {
        return this.lastAdvertisedBundles_;
    }

    public com.fyber.inneractive.sdk.bidder.v getLastAdvertisedBundlesOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.v) this.lastAdvertisedBundles_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.v> getLastAdvertisedBundlesOrBuilderList() {
        return this.lastAdvertisedBundles_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat getLatitude() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat = this.latitude_;
        return nullableFloat == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getLgpdConsent() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.lgpdConsent_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat getLongitude() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat = this.longitude_;
        return nullableFloat == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getLowPowerMode() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.lowPowerMode_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getMediaMuted() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.mediaMuted_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getMediationType() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.mediationType_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getMobileCountryCode() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.mobileCountryCode_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getMobileNetworkCode() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.mobileNetworkCode_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getMockResponseId() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.mockResponseId_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getMuteAudio() {
        return this.muteAudio_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getNetwork() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.network_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getOdt() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.odt_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 getOffsetFromGMT() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = this.offsetFromGMT_;
        return nullableSInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32.getDefaultInstance() : nullableSInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getOsVersion() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.osVersion_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getPortal() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.portal_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType getPriorClickTypes(int i) {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) this.priorClickTypes_.get(i);
    }

    public int getPriorClickTypesCount() {
        return this.priorClickTypes_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType> getPriorClickTypesList() {
        return this.priorClickTypes_;
    }

    public com.fyber.inneractive.sdk.bidder.c0 getPriorClickTypesOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.c0) this.priorClickTypes_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.c0> getPriorClickTypesOrBuilderList() {
        return this.priorClickTypes_;
    }

    public com.fyber.inneractive.sdk.bidder.o0 getPriorClicks(int i) {
        com.fyber.inneractive.sdk.protobuf.h1 h1Var = priorClicks_converter_;
        com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) this.priorClicks_;
        a1Var.d(i);
        int i2 = a1Var.b[i];
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
        ((com.fyber.inneractive.sdk.bidder.j) h1Var).getClass();
        valueOf.getClass();
        com.fyber.inneractive.sdk.bidder.o0 a2 = com.fyber.inneractive.sdk.bidder.o0.a(i2);
        return a2 == null ? com.fyber.inneractive.sdk.bidder.o0.UNRECOGNIZED : a2;
    }

    public int getPriorClicksCount() {
        return ((com.fyber.inneractive.sdk.protobuf.a1) this.priorClicks_).size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.o0> getPriorClicksList() {
        return new com.fyber.inneractive.sdk.protobuf.i1(this.priorClicks_, priorClicks_converter_);
    }

    public int getPriorClicksValue(int i) {
        com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) this.priorClicks_;
        a1Var.d(i);
        return a1Var.b[i];
    }

    public java.util.List<java.lang.Integer> getPriorClicksValueList() {
        return this.priorClicks_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool getPriorSkip() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool nullableBool = this.priorSkip_;
        return nullableBool == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.getDefaultInstance() : nullableBool;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData getPubExtraData(int i) {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) this.pubExtraData_.get(i);
    }

    public int getPubExtraDataCount() {
        return this.pubExtraData_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData> getPubExtraDataList() {
        return this.pubExtraData_;
    }

    public com.fyber.inneractive.sdk.bidder.e0 getPubExtraDataOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.e0) this.pubExtraData_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.e0> getPubExtraDataOrBuilderList() {
        return this.pubExtraData_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat getPxRatio() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat = this.pxRatio_;
        return nullableFloat == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getSdkVersion() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.sdkVersion_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.g0 getSecureContent() {
        int i = this.secureContent_;
        com.fyber.inneractive.sdk.bidder.g0 g0Var = i != 0 ? i != 1 ? i != 2 ? null : com.fyber.inneractive.sdk.bidder.g0.PARTIALLYSECURE : com.fyber.inneractive.sdk.bidder.g0.SECURE : com.fyber.inneractive.sdk.bidder.g0.UNSECURE;
        return g0Var == null ? com.fyber.inneractive.sdk.bidder.g0.UNRECOGNIZED : g0Var;
    }

    public int getSecureContentValue() {
        return this.secureContent_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getSessionDuration() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.sessionDuration_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat getTimeAccuracy() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat = this.timeAccuracy_;
        return nullableFloat == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic getTopics(int i) {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic) this.topics_.get(i);
    }

    public int getTopicsCount() {
        return this.topics_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic> getTopicsList() {
        return this.topics_;
    }

    public com.fyber.inneractive.sdk.bidder.k0 getTopicsOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.k0) this.topics_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.k0> getTopicsOrBuilderList() {
        return this.topics_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getTotalSpace() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.totalSpace_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getTrackingStatus() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.trackingStatus_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 getUserAge() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = this.userAge_;
        return nullableUInt32 == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getUserAgent() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.userAgent_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.q0 getUserGender() {
        int i = this.userGender_;
        com.fyber.inneractive.sdk.bidder.q0 q0Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : com.fyber.inneractive.sdk.bidder.q0.OTHER : com.fyber.inneractive.sdk.bidder.q0.FEMALE : com.fyber.inneractive.sdk.bidder.q0.MALE : com.fyber.inneractive.sdk.bidder.q0.UNKNOWN;
        return q0Var == null ? com.fyber.inneractive.sdk.bidder.q0.UNRECOGNIZED : q0Var;
    }

    public int getUserGenderValue() {
        return this.userGender_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getUserID() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.userID_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession getUserSessions(int i) {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) this.userSessions_.get(i);
    }

    public int getUserSessionsCount() {
        return this.userSessions_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession> getUserSessionsList() {
        return this.userSessions_;
    }

    public com.fyber.inneractive.sdk.bidder.s0 getUserSessionsOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.s0) this.userSessions_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.s0> getUserSessionsOrBuilderList() {
        return this.userSessions_;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat getVerAccuracy() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat nullableFloat = this.verAccuracy_;
        return nullableFloat == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getVersion() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.version_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString getZipCode() {
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString nullableString = this.zipCode_;
        return nullableString == null ? com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.getDefaultInstance() : nullableString;
    }

    public boolean hasAaid() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasAdServicesVersion() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasAirplaneMode() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAmazonId() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasAppBuildVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasAppSetId() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasAppVersion() {
        return this.appVersion_ != null;
    }

    public boolean hasBatteryCharging() {
        return this.batteryCharging_ != null;
    }

    public boolean hasBatteryLevel() {
        return this.batteryLevel_ != null;
    }

    public boolean hasBluetoothPlugged() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasBundleID() {
        return this.bundleID_ != null;
    }

    public boolean hasCarrierName() {
        return this.carrierName_ != null;
    }

    public boolean hasCcpaString() {
        return this.ccpaString_ != null;
    }

    public boolean hasChildMode() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasCoppaApplies() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasCountryCode() {
        return this.countryCode_ != null;
    }

    public boolean hasDeviceApi() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeviceHeight() {
        return this.deviceHeight_ != null;
    }

    public boolean hasDeviceLanguage() {
        return this.deviceLanguage_ != null;
    }

    public boolean hasDeviceModel() {
        return this.deviceModel_ != null;
    }

    public boolean hasDeviceOS() {
        return this.deviceOS_ != null;
    }

    public boolean hasDeviceWidth() {
        return this.deviceWidth_ != null;
    }

    public boolean hasDndMode() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDnt() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFreeSpace() {
        return this.freeSpace_ != null;
    }

    public boolean hasGdprConsent() {
        return this.gdprConsent_ != null;
    }

    public boolean hasGdprString() {
        return this.gdprString_ != null;
    }

    public boolean hasGpp() {
        return (this.bitField0_ & 33554432) != 0;
    }

    public boolean hasHeadsetPlugged() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHorAccuracy() {
        return this.horAccuracy_ != null;
    }

    public boolean hasIdfa() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIdfv() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIgnitePackageName() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasIgniteVersion() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasInputLanguages() {
        return this.inputLanguages_ != null;
    }

    public boolean hasIsRingMuted() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasKeywords() {
        return this.keywords_ != null;
    }

    public boolean hasLatitude() {
        return this.latitude_ != null;
    }

    public boolean hasLgpdConsent() {
        return this.lgpdConsent_ != null;
    }

    public boolean hasLongitude() {
        return this.longitude_ != null;
    }

    public boolean hasLowPowerMode() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMediaMuted() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasMediationType() {
        return this.mediationType_ != null;
    }

    public boolean hasMobileCountryCode() {
        return this.mobileCountryCode_ != null;
    }

    public boolean hasMobileNetworkCode() {
        return this.mobileNetworkCode_ != null;
    }

    public boolean hasMockResponseId() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasNetwork() {
        return this.network_ != null;
    }

    public boolean hasOdt() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasOffsetFromGMT() {
        return this.offsetFromGMT_ != null;
    }

    public boolean hasOsVersion() {
        return this.osVersion_ != null;
    }

    public boolean hasPortal() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasPriorSkip() {
        return this.priorSkip_ != null;
    }

    public boolean hasPxRatio() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSdkVersion() {
        return this.sdkVersion_ != null;
    }

    public boolean hasSessionDuration() {
        return this.sessionDuration_ != null;
    }

    public boolean hasTimeAccuracy() {
        return this.timeAccuracy_ != null;
    }

    public boolean hasTotalSpace() {
        return this.totalSpace_ != null;
    }

    public boolean hasTrackingStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserAge() {
        return this.userAge_ != null;
    }

    public boolean hasUserAgent() {
        return this.userAgent_ != null;
    }

    public boolean hasUserID() {
        return this.userID_ != null;
    }

    public boolean hasVerAccuracy() {
        return this.verAccuracy_ != null;
    }

    public boolean hasVersion() {
        return this.version_ != null;
    }

    public boolean hasZipCode() {
        return this.zipCode_ != null;
    }

    public static com.fyber.inneractive.sdk.bidder.k newBuilder(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters) {
        return (com.fyber.inneractive.sdk.bidder.k) DEFAULT_INSTANCE.createBuilder(tokenParametersOuterClass$TokenParameters);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(i, experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEncryptedTopics(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.EncryptedTopic encryptedTopic) {
        encryptedTopic.getClass();
        ensureEncryptedTopicsIsMutable();
        this.encryptedTopics_.add(i, encryptedTopic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdomains(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(i, lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdvertisedBundles(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(i, lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClickTypes(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(i, priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPubExtraData(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData) {
        pubExtraData.getClass();
        ensurePubExtraDataIsMutable();
        this.pubExtraData_.add(i, pubExtraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopics(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Topic topic) {
        topic.getClass();
        ensureTopicsIsMutable();
        this.topics_.add(i, topic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserSessions(int i, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(i, userSession);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
    }
}
