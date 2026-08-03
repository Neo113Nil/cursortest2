package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public final class AdmParametersOuterClass$AdmParameters extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
    public static final int ABEXPERIMENTS_FIELD_NUMBER = 33;
    public static final int ADCOMPLETIONURL_FIELD_NUMBER = 24;
    public static final int ADDOMAIN_FIELD_NUMBER = 29;
    public static final int ADDURATION_FIELD_NUMBER = 25;
    public static final int ADEXPIRATIONINTERVAL_FIELD_NUMBER = 13;
    public static final int ADHEIGHT_FIELD_NUMBER = 5;
    public static final int ADNETWORKID_FIELD_NUMBER = 12;
    public static final int ADNETWORKNAME_FIELD_NUMBER = 11;
    public static final int ADTYPE_FIELD_NUMBER = 14;
    public static final int ADUNITDISPLAYTYPE_FIELD_NUMBER = 8;
    public static final int ADUNITID_FIELD_NUMBER = 6;
    public static final int ADUNITTYPE_FIELD_NUMBER = 7;
    public static final int ADVERTISEDAPPID_FIELD_NUMBER = 18;
    public static final int ADWIDTH_FIELD_NUMBER = 4;
    public static final int APPBUNDLEID_FIELD_NUMBER = 23;
    public static final int ATTRIBUTIONCLICKURL_FIELD_NUMBER = 45;
    public static final int ATTRIBUTIONIMPRESSIONURL_FIELD_NUMBER = 44;
    public static final int AUTOSTOREKITSTATE_FIELD_NUMBER = 42;
    public static final int BRANDBIDDERCTATEXT_FIELD_NUMBER = 40;
    public static final int BRANDBIDDERDONTSHOWENDCARD_FIELD_NUMBER = 39;
    public static final int CAMPAIGNID_FIELD_NUMBER = 31;
    public static final int CONTENTID_FIELD_NUMBER = 9;
    public static final int CREATIVEID_FIELD_NUMBER = 30;
    public static final int CREATIVETYPE_FIELD_NUMBER = 26;
    public static final int CUSTOMPRODUCTPAGEID_FIELD_NUMBER = 43;
    private static final com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters DEFAULT_INSTANCE;
    public static final int ERRORMESSAGE_FIELD_NUMBER = 3;
    public static final int IGNITEINSTALLURL_FIELD_NUMBER = 36;
    public static final int IGNITELAUNCHERACTIVITY_FIELD_NUMBER = 37;
    public static final int IGNITEMODE_FIELD_NUMBER = 35;
    public static final int MARKUPURL_FIELD_NUMBER = 1;
    public static final int MRAIDVIDEOOMSIGNAL_FIELD_NUMBER = 41;
    public static final int MRCDATA_FIELD_NUMBER = 32;
    private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
    public static final int PRICINGVALUE_FIELD_NUMBER = 28;
    public static final int PUBLISHERID_FIELD_NUMBER = 10;
    public static final int SDKCLICKURL_FIELD_NUMBER = 16;
    public static final int SDKIMPRESSIONURL_FIELD_NUMBER = 15;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    public static final int SKADNETWORKDATA_FIELD_NUMBER = 27;
    public static final int SKIPMODE_FIELD_NUMBER = 22;
    public static final int SKOVERLAYDATA_FIELD_NUMBER = 38;
    public static final int SPOTID_FIELD_NUMBER = 34;
    public static final int STORECTATEXT_FIELD_NUMBER = 21;
    public static final int STOREEVENTURL_FIELD_NUMBER = 20;
    public static final int STOREURLTYPE_FIELD_NUMBER = 19;
    public static final int STOREURL_FIELD_NUMBER = 17;
    private int adDuration_;
    private int adExpirationInterval_;
    private int adHeight_;
    private long adNetworkId_;
    private int adType_;
    private int adUnitDisplayType_;
    private int adUnitType_;
    private int adWidth_;
    private int autoStorekitState_;
    private int bitField0_;
    private int bitField1_;
    private boolean brandBidderDontShowEndcard_;
    private long contentId_;
    private int igniteMode_;
    private boolean mraidVideoOMSignal_;
    private com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData mrcData_;
    private double pricingValue_;
    private long publisherId_;
    private com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData skAdNetworkData_;
    private com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData skOverlayData_;
    private boolean skipMode_;
    private long spotId_;
    private int storeUrlType_;
    private java.lang.String markupUrl_ = "";
    private java.lang.String sessionId_ = "";
    private java.lang.String errorMessage_ = "";
    private java.lang.String adUnitId_ = "";
    private java.lang.String adNetworkName_ = "";
    private java.lang.String sdkImpressionUrl_ = "";
    private java.lang.String sdkClickUrl_ = "";
    private java.lang.String storeUrl_ = "";
    private java.lang.String advertisedAppId_ = "";
    private java.lang.String storeEventUrl_ = "";
    private java.lang.String storeCTAText_ = "";
    private java.lang.String appBundleId_ = "";
    private java.lang.String adCompletionUrl_ = "";
    private java.lang.String creativeType_ = "";
    private java.lang.String adDomain_ = "";
    private java.lang.String creativeId_ = "";
    private java.lang.String campaignId_ = "";
    private com.fyber.inneractive.sdk.protobuf.k1 abExperiments_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    private java.lang.String igniteInstallUrl_ = "";
    private java.lang.String igniteLauncherActivity_ = "";
    private java.lang.String brandBidderCtaText_ = "";
    private java.lang.String customProductPageId_ = "";
    private java.lang.String attributionImpressionUrl_ = "";
    private java.lang.String attributionClickUrl_ = "";

    public static final class Experiment extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.bidder.adm.l {
        private static final com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private int bitField0_;
        private java.lang.String identifier_ = "";
        private java.lang.String variant_ = "";

        static {
            com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment experiment = new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment();
            DEFAULT_INSTANCE = experiment;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment.class, experiment);
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

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.k newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.adm.k) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
            switch (com.fyber.inneractive.sdk.bidder.adm.a.f3536a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.adm.k();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new java.lang.Object[]{"bitField0_", "identifier_", "variant_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment.class) {
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

        public static com.fyber.inneractive.sdk.bidder.adm.k newBuilder(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment experiment) {
            return (com.fyber.inneractive.sdk.bidder.adm.k) DEFAULT_INSTANCE.createBuilder(experiment);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class MRCData extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        private static final com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int PIXELDURATION_FIELD_NUMBER = 2;
        public static final int PIXELIMPRESSIONURL_FIELD_NUMBER = 3;
        public static final int PIXELPERCENT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int pixelDuration_;
        private java.lang.String pixelImpressionUrl_ = "";
        private int pixelPercent_;

        static {
            com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData mRCData = new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData();
            DEFAULT_INSTANCE = mRCData;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData.class, mRCData);
        }

        private MRCData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPixelDuration() {
            this.bitField0_ &= -3;
            this.pixelDuration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPixelImpressionUrl() {
            this.bitField0_ &= -5;
            this.pixelImpressionUrl_ = getDefaultInstance().getPixelImpressionUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPixelPercent() {
            this.bitField0_ &= -2;
            this.pixelPercent_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.o newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.adm.o) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPixelDuration(int i) {
            this.bitField0_ |= 2;
            this.pixelDuration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPixelImpressionUrl(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.pixelImpressionUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPixelImpressionUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.pixelImpressionUrl_ = sVar.f();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPixelPercent(int i) {
            this.bitField0_ |= 1;
            this.pixelPercent_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.adm.a.f3536a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.adm.o();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ለ\u0002", new java.lang.Object[]{"bitField0_", "pixelPercent_", "pixelDuration_", "pixelImpressionUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData.class) {
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

        public int getPixelDuration() {
            return this.pixelDuration_;
        }

        public java.lang.String getPixelImpressionUrl() {
            return this.pixelImpressionUrl_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getPixelImpressionUrlBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.pixelImpressionUrl_);
        }

        public int getPixelPercent() {
            return this.pixelPercent_;
        }

        public boolean hasPixelDuration() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPixelImpressionUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPixelPercent() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.o newBuilder(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData mRCData) {
            return (com.fyber.inneractive.sdk.bidder.adm.o) DEFAULT_INSTANCE.createBuilder(mRCData);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class SKAdNetworkData extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        private static final com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int SKADNBUNDLE_FIELD_NUMBER = 4;
        public static final int SKADNCAMPIGN_FIELD_NUMBER = 3;
        public static final int SKADNETWORKID_FIELD_NUMBER = 2;
        public static final int SKADNID_FIELD_NUMBER = 5;
        public static final int SKADNIMPID_FIELD_NUMBER = 6;
        public static final int SKADNIMPSIGNATURE_FIELD_NUMBER = 10;
        public static final int SKADNIMPTIMESTAMP_FIELD_NUMBER = 9;
        public static final int SKADNSIGNATURE_FIELD_NUMBER = 11;
        public static final int SKADNSOURCEAPP_FIELD_NUMBER = 7;
        public static final int SKADNTIMESTAMP_FIELD_NUMBER = 8;
        public static final int SKADNVERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private long skAdnImpTimestamp_;
        private long skAdnSourceApp_;
        private long skAdnTimestamp_;
        private java.lang.String skAdnVersion_ = "";
        private java.lang.String skAdNetworkId_ = "";
        private java.lang.String skAdnCampign_ = "";
        private java.lang.String skAdnBundle_ = "";
        private java.lang.String skAdnId_ = "";
        private java.lang.String skAdnImpId_ = "";
        private java.lang.String skAdnImpSignature_ = "";
        private java.lang.String skAdnSignature_ = "";

        static {
            com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData sKAdNetworkData = new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData();
            DEFAULT_INSTANCE = sKAdNetworkData;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData.class, sKAdNetworkData);
        }

        private SKAdNetworkData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdNetworkId() {
            this.bitField0_ &= -3;
            this.skAdNetworkId_ = getDefaultInstance().getSkAdNetworkId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnBundle() {
            this.bitField0_ &= -9;
            this.skAdnBundle_ = getDefaultInstance().getSkAdnBundle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnCampign() {
            this.bitField0_ &= -5;
            this.skAdnCampign_ = getDefaultInstance().getSkAdnCampign();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnId() {
            this.bitField0_ &= -17;
            this.skAdnId_ = getDefaultInstance().getSkAdnId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnImpId() {
            this.bitField0_ &= -33;
            this.skAdnImpId_ = getDefaultInstance().getSkAdnImpId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnImpSignature() {
            this.bitField0_ &= -513;
            this.skAdnImpSignature_ = getDefaultInstance().getSkAdnImpSignature();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnImpTimestamp() {
            this.bitField0_ &= -257;
            this.skAdnImpTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnSignature() {
            this.bitField0_ &= -1025;
            this.skAdnSignature_ = getDefaultInstance().getSkAdnSignature();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnSourceApp() {
            this.bitField0_ &= -65;
            this.skAdnSourceApp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnTimestamp() {
            this.bitField0_ &= -129;
            this.skAdnTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnVersion() {
            this.bitField0_ &= -2;
            this.skAdnVersion_ = getDefaultInstance().getSkAdnVersion();
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.p newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.adm.p) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdNetworkId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.skAdNetworkId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdNetworkIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.skAdNetworkId_ = sVar.f();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnBundle(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.skAdnBundle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnBundleBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.skAdnBundle_ = sVar.f();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnCampign(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.skAdnCampign_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnCampignBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.skAdnCampign_ = sVar.f();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.skAdnId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.skAdnId_ = sVar.f();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.skAdnImpId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.skAdnImpId_ = sVar.f();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpSignature(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.skAdnImpSignature_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpSignatureBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.skAdnImpSignature_ = sVar.f();
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpTimestamp(long j) {
            this.bitField0_ |= 256;
            this.skAdnImpTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnSignature(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.skAdnSignature_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnSignatureBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.skAdnSignature_ = sVar.f();
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnSourceApp(long j) {
            this.bitField0_ |= 64;
            this.skAdnSourceApp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnTimestamp(long j) {
            this.bitField0_ |= 128;
            this.skAdnTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.skAdnVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnVersionBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.skAdnVersion_ = sVar.f();
            this.bitField0_ |= 1;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.adm.a.f3536a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.adm.p();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဃ\u0006\bဃ\u0007\tတ\b\nለ\t\u000bለ\n", new java.lang.Object[]{"bitField0_", "skAdnVersion_", "skAdNetworkId_", "skAdnCampign_", "skAdnBundle_", "skAdnId_", "skAdnImpId_", "skAdnSourceApp_", "skAdnTimestamp_", "skAdnImpTimestamp_", "skAdnImpSignature_", "skAdnSignature_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData.class) {
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

        public java.lang.String getSkAdNetworkId() {
            return this.skAdNetworkId_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getSkAdNetworkIdBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.skAdNetworkId_);
        }

        public java.lang.String getSkAdnBundle() {
            return this.skAdnBundle_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getSkAdnBundleBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.skAdnBundle_);
        }

        public java.lang.String getSkAdnCampign() {
            return this.skAdnCampign_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getSkAdnCampignBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.skAdnCampign_);
        }

        public java.lang.String getSkAdnId() {
            return this.skAdnId_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getSkAdnIdBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.skAdnId_);
        }

        public java.lang.String getSkAdnImpId() {
            return this.skAdnImpId_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getSkAdnImpIdBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.skAdnImpId_);
        }

        public java.lang.String getSkAdnImpSignature() {
            return this.skAdnImpSignature_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getSkAdnImpSignatureBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.skAdnImpSignature_);
        }

        public long getSkAdnImpTimestamp() {
            return this.skAdnImpTimestamp_;
        }

        public java.lang.String getSkAdnSignature() {
            return this.skAdnSignature_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getSkAdnSignatureBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.skAdnSignature_);
        }

        public long getSkAdnSourceApp() {
            return this.skAdnSourceApp_;
        }

        public long getSkAdnTimestamp() {
            return this.skAdnTimestamp_;
        }

        public java.lang.String getSkAdnVersion() {
            return this.skAdnVersion_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getSkAdnVersionBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.skAdnVersion_);
        }

        public boolean hasSkAdNetworkId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSkAdnBundle() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSkAdnCampign() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSkAdnId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSkAdnImpId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSkAdnImpSignature() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasSkAdnImpTimestamp() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasSkAdnSignature() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSkAdnSourceApp() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasSkAdnTimestamp() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSkAdnVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.p newBuilder(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData sKAdNetworkData) {
            return (com.fyber.inneractive.sdk.bidder.adm.p) DEFAULT_INSTANCE.createBuilder(sKAdNetworkData);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    public static final class SKOverlayData extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
        private static final com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData DEFAULT_INSTANCE;
        private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
        public static final int SKOVERLAYAUTOCLICK_FIELD_NUMBER = 7;
        public static final int SKOVERLAYAUTOCLOSE_FIELD_NUMBER = 4;
        public static final int SKOVERLAYDELAY_FIELD_NUMBER = 2;
        public static final int SKOVERLAYDISMISSIBLE_FIELD_NUMBER = 5;
        public static final int SKOVERLAYENDCARDDELAY_FIELD_NUMBER = 6;
        public static final int SKOVERLAYENDCARD_FIELD_NUMBER = 3;
        public static final int SKOVERLAYPOSITION_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean skOverlayAutoclick_;
        private int skOverlayAutoclose_;
        private int skOverlayDelay_;
        private int skOverlayDismissible_;
        private int skOverlayEndcardDelay_;
        private int skOverlayEndcard_;
        private int skOverlayPosition_;

        static {
            com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData sKOverlayData = new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData();
            DEFAULT_INSTANCE = sKOverlayData;
            com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData.class, sKOverlayData);
        }

        private SKOverlayData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkOverlayAutoclick() {
            this.bitField0_ &= -65;
            this.skOverlayAutoclick_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkOverlayAutoclose() {
            this.bitField0_ &= -9;
            this.skOverlayAutoclose_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkOverlayDelay() {
            this.bitField0_ &= -3;
            this.skOverlayDelay_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkOverlayDismissible() {
            this.bitField0_ &= -17;
            this.skOverlayDismissible_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkOverlayEndcard() {
            this.bitField0_ &= -5;
            this.skOverlayEndcard_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkOverlayEndcardDelay() {
            this.bitField0_ &= -33;
            this.skOverlayEndcardDelay_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkOverlayPosition() {
            this.bitField0_ &= -2;
            this.skOverlayPosition_ = 0;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.q newBuilder() {
            return (com.fyber.inneractive.sdk.bidder.adm.q) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkOverlayAutoclick(boolean z) {
            this.bitField0_ |= 64;
            this.skOverlayAutoclick_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkOverlayAutoclose(int i) {
            this.bitField0_ |= 8;
            this.skOverlayAutoclose_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkOverlayDelay(int i) {
            this.bitField0_ |= 2;
            this.skOverlayDelay_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkOverlayDismissible(int i) {
            this.bitField0_ |= 16;
            this.skOverlayDismissible_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkOverlayEndcard(int i) {
            this.bitField0_ |= 4;
            this.skOverlayEndcard_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkOverlayEndcardDelay(int i) {
            this.bitField0_ |= 32;
            this.skOverlayEndcardDelay_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkOverlayPosition(int i) {
            this.bitField0_ |= 1;
            this.skOverlayPosition_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.adm.a.f3536a[y0Var.ordinal()]) {
                case 1:
                    return new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData();
                case 2:
                    return new com.fyber.inneractive.sdk.bidder.adm.q();
                case 3:
                    return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006င\u0005\u0007ဇ\u0006", new java.lang.Object[]{"bitField0_", "skOverlayPosition_", "skOverlayDelay_", "skOverlayEndcard_", "skOverlayAutoclose_", "skOverlayDismissible_", "skOverlayEndcardDelay_", "skOverlayAutoclick_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                    if (m2Var == null) {
                        synchronized (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData.class) {
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

        public boolean getSkOverlayAutoclick() {
            return this.skOverlayAutoclick_;
        }

        public int getSkOverlayAutoclose() {
            return this.skOverlayAutoclose_;
        }

        public int getSkOverlayDelay() {
            return this.skOverlayDelay_;
        }

        public int getSkOverlayDismissible() {
            return this.skOverlayDismissible_;
        }

        public int getSkOverlayEndcard() {
            return this.skOverlayEndcard_;
        }

        public int getSkOverlayEndcardDelay() {
            return this.skOverlayEndcardDelay_;
        }

        public int getSkOverlayPosition() {
            return this.skOverlayPosition_;
        }

        public boolean hasSkOverlayAutoclick() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasSkOverlayAutoclose() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSkOverlayDelay() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSkOverlayDismissible() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSkOverlayEndcard() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSkOverlayEndcardDelay() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSkOverlayPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.fyber.inneractive.sdk.bidder.adm.q newBuilder(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData sKOverlayData) {
            return (com.fyber.inneractive.sdk.bidder.adm.q) DEFAULT_INSTANCE.createBuilder(sKOverlayData);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
            return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    static {
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters();
        DEFAULT_INSTANCE = admParametersOuterClass$AdmParameters;
        com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.class, admParametersOuterClass$AdmParameters);
    }

    private AdmParametersOuterClass$AdmParameters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAbExperiments(java.lang.Iterable<? extends com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment> iterable) {
        ensureAbExperimentsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((java.lang.Iterable) iterable, (java.util.List) this.abExperiments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbExperiments() {
        this.abExperiments_ = com.fyber.inneractive.sdk.protobuf.z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdCompletionUrl() {
        this.bitField0_ &= -1048577;
        this.adCompletionUrl_ = getDefaultInstance().getAdCompletionUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDomain() {
        this.bitField0_ &= -33554433;
        this.adDomain_ = getDefaultInstance().getAdDomain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDuration() {
        this.bitField0_ &= -2097153;
        this.adDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdExpirationInterval() {
        this.bitField0_ &= -1025;
        this.adExpirationInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdHeight() {
        this.bitField0_ &= -17;
        this.adHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdNetworkId() {
        this.bitField0_ &= -513;
        this.adNetworkId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdNetworkName() {
        this.bitField0_ &= -257;
        this.adNetworkName_ = getDefaultInstance().getAdNetworkName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdType() {
        this.adType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdUnitDisplayType() {
        this.adUnitDisplayType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdUnitId() {
        this.bitField0_ &= -33;
        this.adUnitId_ = getDefaultInstance().getAdUnitId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdUnitType() {
        this.adUnitType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdWidth() {
        this.bitField0_ &= -9;
        this.adWidth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertisedAppId() {
        this.bitField0_ &= -16385;
        this.advertisedAppId_ = getDefaultInstance().getAdvertisedAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppBundleId() {
        this.bitField0_ &= -524289;
        this.appBundleId_ = getDefaultInstance().getAppBundleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributionClickUrl() {
        this.bitField1_ &= -257;
        this.attributionClickUrl_ = getDefaultInstance().getAttributionClickUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributionImpressionUrl() {
        this.bitField1_ &= -129;
        this.attributionImpressionUrl_ = getDefaultInstance().getAttributionImpressionUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoStorekitState() {
        this.bitField1_ &= -33;
        this.autoStorekitState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandBidderCtaText() {
        this.bitField1_ &= -9;
        this.brandBidderCtaText_ = getDefaultInstance().getBrandBidderCtaText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandBidderDontShowEndcard() {
        this.bitField1_ &= -5;
        this.brandBidderDontShowEndcard_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.bitField0_ &= -134217729;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentId() {
        this.bitField0_ &= -65;
        this.contentId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.bitField0_ &= -67108865;
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeType() {
        this.bitField0_ &= -4194305;
        this.creativeType_ = getDefaultInstance().getCreativeType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomProductPageId() {
        this.bitField1_ &= -65;
        this.customProductPageId_ = getDefaultInstance().getCustomProductPageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.bitField0_ &= -5;
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgniteInstallUrl() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.igniteInstallUrl_ = getDefaultInstance().getIgniteInstallUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgniteLauncherActivity() {
        this.bitField1_ &= -2;
        this.igniteLauncherActivity_ = getDefaultInstance().getIgniteLauncherActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgniteMode() {
        this.bitField0_ &= -1073741825;
        this.igniteMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarkupUrl() {
        this.bitField0_ &= -2;
        this.markupUrl_ = getDefaultInstance().getMarkupUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMraidVideoOMSignal() {
        this.bitField1_ &= -17;
        this.mraidVideoOMSignal_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMrcData() {
        this.mrcData_ = null;
        this.bitField0_ &= -268435457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPricingValue() {
        this.bitField0_ &= -16777217;
        this.pricingValue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisherId() {
        this.bitField0_ &= -129;
        this.publisherId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkClickUrl() {
        this.bitField0_ &= -4097;
        this.sdkClickUrl_ = getDefaultInstance().getSdkClickUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkImpressionUrl() {
        this.bitField0_ &= -2049;
        this.sdkImpressionUrl_ = getDefaultInstance().getSdkImpressionUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkAdNetworkData() {
        this.skAdNetworkData_ = null;
        this.bitField0_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkOverlayData() {
        this.skOverlayData_ = null;
        this.bitField1_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipMode() {
        this.bitField0_ &= -262145;
        this.skipMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpotId() {
        this.bitField0_ &= -536870913;
        this.spotId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreCTAText() {
        this.bitField0_ &= -131073;
        this.storeCTAText_ = getDefaultInstance().getStoreCTAText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreEventUrl() {
        this.bitField0_ &= -65537;
        this.storeEventUrl_ = getDefaultInstance().getStoreEventUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreUrl() {
        this.bitField0_ &= -8193;
        this.storeUrl_ = getDefaultInstance().getStoreUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreUrlType() {
        this.bitField0_ &= -32769;
        this.storeUrlType_ = 0;
    }

    private void ensureAbExperimentsIsMutable() {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = this.abExperiments_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return;
        }
        this.abExperiments_ = com.fyber.inneractive.sdk.protobuf.z0.mutableCopy(k1Var);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMrcData(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData mRCData) {
        mRCData.getClass();
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData mRCData2 = this.mrcData_;
        if (mRCData2 == null || mRCData2 == com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData.getDefaultInstance()) {
            this.mrcData_ = mRCData;
        } else {
            com.fyber.inneractive.sdk.bidder.adm.o newBuilder = com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData.newBuilder(this.mrcData_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, mRCData);
            this.mrcData_ = (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData) newBuilder.b();
        }
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSkAdNetworkData(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData sKAdNetworkData) {
        sKAdNetworkData.getClass();
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData sKAdNetworkData2 = this.skAdNetworkData_;
        if (sKAdNetworkData2 == null || sKAdNetworkData2 == com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData.getDefaultInstance()) {
            this.skAdNetworkData_ = sKAdNetworkData;
        } else {
            com.fyber.inneractive.sdk.bidder.adm.p newBuilder = com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData.newBuilder(this.skAdNetworkData_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, sKAdNetworkData);
            this.skAdNetworkData_ = (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData) newBuilder.b();
        }
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSkOverlayData(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData sKOverlayData) {
        sKOverlayData.getClass();
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData sKOverlayData2 = this.skOverlayData_;
        if (sKOverlayData2 == null || sKOverlayData2 == com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData.getDefaultInstance()) {
            this.skOverlayData_ = sKOverlayData;
        } else {
            com.fyber.inneractive.sdk.bidder.adm.q newBuilder = com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData.newBuilder(this.skOverlayData_);
            newBuilder.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(newBuilder.b, sKOverlayData);
            this.skOverlayData_ = (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData) newBuilder.b();
        }
        this.bitField1_ |= 2;
    }

    public static com.fyber.inneractive.sdk.bidder.adm.h newBuilder() {
        return (com.fyber.inneractive.sdk.bidder.adm.h) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setAbExperiments(int i, com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.set(i, experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdCompletionUrl(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 1048576;
        this.adCompletionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdCompletionUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.adCompletionUrl_ = sVar.f();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDomain(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 33554432;
        this.adDomain_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDomainBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.adDomain_ = sVar.f();
        this.bitField0_ |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDuration(int i) {
        this.bitField0_ |= 2097152;
        this.adDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExpirationInterval(int i) {
        this.bitField0_ |= 1024;
        this.adExpirationInterval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdHeight(int i) {
        this.bitField0_ |= 16;
        this.adHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNetworkId(long j) {
        this.bitField0_ |= 512;
        this.adNetworkId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNetworkName(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.adNetworkName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNetworkNameBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.adNetworkName_ = sVar.f();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdType(com.fyber.inneractive.sdk.bidder.adm.c cVar) {
        this.adType_ = cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdTypeValue(int i) {
        this.adType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitDisplayType(com.fyber.inneractive.sdk.bidder.adm.s sVar) {
        this.adUnitDisplayType_ = sVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitDisplayTypeValue(int i) {
        this.adUnitDisplayType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.adUnitId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.adUnitId_ = sVar.f();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitType(com.fyber.inneractive.sdk.bidder.adm.e eVar) {
        this.adUnitType_ = eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitTypeValue(int i) {
        this.adUnitType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdWidth(int i) {
        this.bitField0_ |= 8;
        this.adWidth_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisedAppId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.advertisedAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisedAppIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.advertisedAppId_ = sVar.f();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppBundleId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 524288;
        this.appBundleId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppBundleIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.appBundleId_ = sVar.f();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributionClickUrl(java.lang.String str) {
        str.getClass();
        this.bitField1_ |= 256;
        this.attributionClickUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributionClickUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.attributionClickUrl_ = sVar.f();
        this.bitField1_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributionImpressionUrl(java.lang.String str) {
        str.getClass();
        this.bitField1_ |= 128;
        this.attributionImpressionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributionImpressionUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.attributionImpressionUrl_ = sVar.f();
        this.bitField1_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoStorekitState(com.fyber.inneractive.sdk.bidder.adm.g gVar) {
        this.autoStorekitState_ = gVar.a();
        this.bitField1_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoStorekitStateValue(int i) {
        this.bitField1_ |= 32;
        this.autoStorekitState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBidderCtaText(java.lang.String str) {
        str.getClass();
        this.bitField1_ |= 8;
        this.brandBidderCtaText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBidderCtaTextBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.brandBidderCtaText_ = sVar.f();
        this.bitField1_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBidderDontShowEndcard(boolean z) {
        this.bitField1_ |= 4;
        this.brandBidderDontShowEndcard_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 134217728;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.campaignId_ = sVar.f();
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentId(long j) {
        this.bitField0_ |= 64;
        this.contentId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.creativeId_ = sVar.f();
        this.bitField0_ |= androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeType(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4194304;
        this.creativeType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeTypeBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.creativeType_ = sVar.f();
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomProductPageId(java.lang.String str) {
        str.getClass();
        this.bitField1_ |= 64;
        this.customProductPageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomProductPageIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.customProductPageId_ = sVar.f();
        this.bitField1_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.errorMessage_ = sVar.f();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteInstallUrl(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= Integer.MIN_VALUE;
        this.igniteInstallUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteInstallUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.igniteInstallUrl_ = sVar.f();
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteLauncherActivity(java.lang.String str) {
        str.getClass();
        this.bitField1_ |= 1;
        this.igniteLauncherActivity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteLauncherActivityBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.igniteLauncherActivity_ = sVar.f();
        this.bitField1_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteMode(com.fyber.inneractive.sdk.bidder.adm.n nVar) {
        this.igniteMode_ = nVar.a();
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteModeValue(int i) {
        this.bitField0_ |= 1073741824;
        this.igniteMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkupUrl(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.markupUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkupUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.markupUrl_ = sVar.f();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMraidVideoOMSignal(boolean z) {
        this.bitField1_ |= 16;
        this.mraidVideoOMSignal_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMrcData(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData mRCData) {
        mRCData.getClass();
        this.mrcData_ = mRCData;
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPricingValue(double d) {
        this.bitField0_ |= 16777216;
        this.pricingValue_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherId(long j) {
        this.bitField0_ |= 128;
        this.publisherId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkClickUrl(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.sdkClickUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkClickUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.sdkClickUrl_ = sVar.f();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkImpressionUrl(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.sdkImpressionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkImpressionUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.sdkImpressionUrl_ = sVar.f();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.sessionId_ = sVar.f();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkAdNetworkData(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData sKAdNetworkData) {
        sKAdNetworkData.getClass();
        this.skAdNetworkData_ = sKAdNetworkData;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkOverlayData(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData sKOverlayData) {
        sKOverlayData.getClass();
        this.skOverlayData_ = sKOverlayData;
        this.bitField1_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipMode(boolean z) {
        this.bitField0_ |= 262144;
        this.skipMode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpotId(long j) {
        this.bitField0_ |= 536870912;
        this.spotId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreCTAText(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.storeCTAText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreCTATextBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.storeCTAText_ = sVar.f();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreEventUrl(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.storeEventUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreEventUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.storeEventUrl_ = sVar.f();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreUrl(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.storeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreUrlBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.storeUrl_ = sVar.f();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreUrlType(com.fyber.inneractive.sdk.bidder.adm.j jVar) {
        this.storeUrlType_ = jVar.a();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreUrlTypeValue(int i) {
        this.bitField0_ |= 32768;
        this.storeUrlType_ = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0
    public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.fyber.inneractive.sdk.bidder.adm.a.f3536a[y0Var.ordinal()]) {
            case 1:
                return new com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters();
            case 2:
                return new com.fyber.inneractive.sdk.bidder.adm.h();
            case 3:
                return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000-\u0000\u0002\u0001--\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ለ\u0005\u0007\f\b\f\tဃ\u0006\nဃ\u0007\u000bለ\b\fဃ\t\rင\n\u000e\f\u000fለ\u000b\u0010ለ\f\u0011ለ\r\u0012ለ\u000e\u0013ဌ\u000f\u0014ለ\u0010\u0015ለ\u0011\u0016ဇ\u0012\u0017ለ\u0013\u0018ለ\u0014\u0019ဋ\u0015\u001aለ\u0016\u001bဉ\u0017\u001cက\u0018\u001dለ\u0019\u001eለ\u001a\u001fለ\u001b ဉ\u001c!\u001b\"ဃ\u001d#ဌ\u001e$ለ\u001f%ለ &ဉ!'ဇ\"(ለ#)ဇ$*ဌ%+ለ&,ለ'-ለ(", new java.lang.Object[]{"bitField0_", "bitField1_", "markupUrl_", "sessionId_", "errorMessage_", "adWidth_", "adHeight_", "adUnitId_", "adUnitType_", "adUnitDisplayType_", "contentId_", "publisherId_", "adNetworkName_", "adNetworkId_", "adExpirationInterval_", "adType_", "sdkImpressionUrl_", "sdkClickUrl_", "storeUrl_", "advertisedAppId_", "storeUrlType_", "storeEventUrl_", "storeCTAText_", "skipMode_", "appBundleId_", "adCompletionUrl_", "adDuration_", "creativeType_", "skAdNetworkData_", "pricingValue_", "adDomain_", "creativeId_", "campaignId_", "mrcData_", "abExperiments_", com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment.class, "spotId_", "igniteMode_", "igniteInstallUrl_", "igniteLauncherActivity_", "skOverlayData_", "brandBidderDontShowEndcard_", "brandBidderCtaText_", "mraidVideoOMSignal_", "autoStorekitState_", "customProductPageId_", "attributionImpressionUrl_", "attributionClickUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                if (m2Var == null) {
                    synchronized (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.class) {
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

    public com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment getAbExperiments(int i) {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment) this.abExperiments_.get(i);
    }

    public int getAbExperimentsCount() {
        return this.abExperiments_.size();
    }

    public java.util.List<com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment> getAbExperimentsList() {
        return this.abExperiments_;
    }

    public com.fyber.inneractive.sdk.bidder.adm.l getAbExperimentsOrBuilder(int i) {
        return (com.fyber.inneractive.sdk.bidder.adm.l) this.abExperiments_.get(i);
    }

    public java.util.List<? extends com.fyber.inneractive.sdk.bidder.adm.l> getAbExperimentsOrBuilderList() {
        return this.abExperiments_;
    }

    public java.lang.String getAdCompletionUrl() {
        return this.adCompletionUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAdCompletionUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.adCompletionUrl_);
    }

    public java.lang.String getAdDomain() {
        return this.adDomain_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAdDomainBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.adDomain_);
    }

    public int getAdDuration() {
        return this.adDuration_;
    }

    public int getAdExpirationInterval() {
        return this.adExpirationInterval_;
    }

    public int getAdHeight() {
        return this.adHeight_;
    }

    public long getAdNetworkId() {
        return this.adNetworkId_;
    }

    public java.lang.String getAdNetworkName() {
        return this.adNetworkName_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAdNetworkNameBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.adNetworkName_);
    }

    public com.fyber.inneractive.sdk.bidder.adm.c getAdType() {
        int i = this.adType_;
        com.fyber.inneractive.sdk.bidder.adm.c cVar = i != 0 ? i != 4 ? i != 6 ? i != 8 ? i != 10 ? i != 15 ? null : com.fyber.inneractive.sdk.bidder.adm.c.DV360 : com.fyber.inneractive.sdk.bidder.adm.c.NATIVE : com.fyber.inneractive.sdk.bidder.adm.c.VAST : com.fyber.inneractive.sdk.bidder.adm.c.MRAID : com.fyber.inneractive.sdk.bidder.adm.c.HTML : com.fyber.inneractive.sdk.bidder.adm.c.OTHER;
        return cVar == null ? com.fyber.inneractive.sdk.bidder.adm.c.UNRECOGNIZED : cVar;
    }

    public int getAdTypeValue() {
        return this.adType_;
    }

    public com.fyber.inneractive.sdk.bidder.adm.s getAdUnitDisplayType() {
        int i = this.adUnitDisplayType_;
        com.fyber.inneractive.sdk.bidder.adm.s sVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : com.fyber.inneractive.sdk.bidder.adm.s.TYPENATIVE : com.fyber.inneractive.sdk.bidder.adm.s.MRECT : com.fyber.inneractive.sdk.bidder.adm.s.REWARDED : com.fyber.inneractive.sdk.bidder.adm.s.INTERSTITIAL : com.fyber.inneractive.sdk.bidder.adm.s.BANNER : com.fyber.inneractive.sdk.bidder.adm.s.UNITDISPLAYTYPEUNKNOWN;
        return sVar == null ? com.fyber.inneractive.sdk.bidder.adm.s.UNRECOGNIZED : sVar;
    }

    public int getAdUnitDisplayTypeValue() {
        return this.adUnitDisplayType_;
    }

    public java.lang.String getAdUnitId() {
        return this.adUnitId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAdUnitIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.adUnitId_);
    }

    public com.fyber.inneractive.sdk.bidder.adm.e getAdUnitType() {
        int i = this.adUnitType_;
        com.fyber.inneractive.sdk.bidder.adm.e eVar = i != 0 ? i != 1 ? i != 2 ? null : com.fyber.inneractive.sdk.bidder.adm.e.VIDEOANDDISPLAY : com.fyber.inneractive.sdk.bidder.adm.e.VIDEO : com.fyber.inneractive.sdk.bidder.adm.e.DISPLAY;
        return eVar == null ? com.fyber.inneractive.sdk.bidder.adm.e.UNRECOGNIZED : eVar;
    }

    public int getAdUnitTypeValue() {
        return this.adUnitType_;
    }

    public int getAdWidth() {
        return this.adWidth_;
    }

    public java.lang.String getAdvertisedAppId() {
        return this.advertisedAppId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAdvertisedAppIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.advertisedAppId_);
    }

    public java.lang.String getAppBundleId() {
        return this.appBundleId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAppBundleIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.appBundleId_);
    }

    public java.lang.String getAttributionClickUrl() {
        return this.attributionClickUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAttributionClickUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.attributionClickUrl_);
    }

    public java.lang.String getAttributionImpressionUrl() {
        return this.attributionImpressionUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAttributionImpressionUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.attributionImpressionUrl_);
    }

    public com.fyber.inneractive.sdk.bidder.adm.g getAutoStorekitState() {
        int i = this.autoStorekitState_;
        com.fyber.inneractive.sdk.bidder.adm.g gVar = i != 0 ? i != 1 ? i != 2 ? null : com.fyber.inneractive.sdk.bidder.adm.g.AUTOSTOREKITPRESENTANDTRACK : com.fyber.inneractive.sdk.bidder.adm.g.AUTOSTOREKITPRESENTONLY : com.fyber.inneractive.sdk.bidder.adm.g.AUTOSTOREKITNONE;
        return gVar == null ? com.fyber.inneractive.sdk.bidder.adm.g.UNRECOGNIZED : gVar;
    }

    public int getAutoStorekitStateValue() {
        return this.autoStorekitState_;
    }

    public java.lang.String getBrandBidderCtaText() {
        return this.brandBidderCtaText_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getBrandBidderCtaTextBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.brandBidderCtaText_);
    }

    public boolean getBrandBidderDontShowEndcard() {
        return this.brandBidderDontShowEndcard_;
    }

    public java.lang.String getCampaignId() {
        return this.campaignId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getCampaignIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.campaignId_);
    }

    public long getContentId() {
        return this.contentId_;
    }

    public java.lang.String getCreativeId() {
        return this.creativeId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getCreativeIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.creativeId_);
    }

    public java.lang.String getCreativeType() {
        return this.creativeType_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getCreativeTypeBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.creativeType_);
    }

    public java.lang.String getCustomProductPageId() {
        return this.customProductPageId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getCustomProductPageIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.customProductPageId_);
    }

    public java.lang.String getErrorMessage() {
        return this.errorMessage_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getErrorMessageBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.errorMessage_);
    }

    public java.lang.String getIgniteInstallUrl() {
        return this.igniteInstallUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getIgniteInstallUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.igniteInstallUrl_);
    }

    public java.lang.String getIgniteLauncherActivity() {
        return this.igniteLauncherActivity_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getIgniteLauncherActivityBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.igniteLauncherActivity_);
    }

    public com.fyber.inneractive.sdk.bidder.adm.n getIgniteMode() {
        int i = this.igniteMode_;
        com.fyber.inneractive.sdk.bidder.adm.n nVar = i != 0 ? i != 1 ? i != 2 ? null : com.fyber.inneractive.sdk.bidder.adm.n.TRUESINGLETAP : com.fyber.inneractive.sdk.bidder.adm.n.SINGLETAP : com.fyber.inneractive.sdk.bidder.adm.n.NONE;
        return nVar == null ? com.fyber.inneractive.sdk.bidder.adm.n.UNRECOGNIZED : nVar;
    }

    public int getIgniteModeValue() {
        return this.igniteMode_;
    }

    public java.lang.String getMarkupUrl() {
        return this.markupUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getMarkupUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.markupUrl_);
    }

    public boolean getMraidVideoOMSignal() {
        return this.mraidVideoOMSignal_;
    }

    public com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData getMrcData() {
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData mRCData = this.mrcData_;
        return mRCData == null ? com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.MRCData.getDefaultInstance() : mRCData;
    }

    public double getPricingValue() {
        return this.pricingValue_;
    }

    public long getPublisherId() {
        return this.publisherId_;
    }

    public java.lang.String getSdkClickUrl() {
        return this.sdkClickUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getSdkClickUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.sdkClickUrl_);
    }

    public java.lang.String getSdkImpressionUrl() {
        return this.sdkImpressionUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getSdkImpressionUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.sdkImpressionUrl_);
    }

    public java.lang.String getSessionId() {
        return this.sessionId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getSessionIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.sessionId_);
    }

    public com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData getSkAdNetworkData() {
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData sKAdNetworkData = this.skAdNetworkData_;
        return sKAdNetworkData == null ? com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKAdNetworkData.getDefaultInstance() : sKAdNetworkData;
    }

    public com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData getSkOverlayData() {
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData sKOverlayData = this.skOverlayData_;
        return sKOverlayData == null ? com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.SKOverlayData.getDefaultInstance() : sKOverlayData;
    }

    public boolean getSkipMode() {
        return this.skipMode_;
    }

    public long getSpotId() {
        return this.spotId_;
    }

    public java.lang.String getStoreCTAText() {
        return this.storeCTAText_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getStoreCTATextBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.storeCTAText_);
    }

    public java.lang.String getStoreEventUrl() {
        return this.storeEventUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getStoreEventUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.storeEventUrl_);
    }

    public java.lang.String getStoreUrl() {
        return this.storeUrl_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getStoreUrlBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.storeUrl_);
    }

    public com.fyber.inneractive.sdk.bidder.adm.j getStoreUrlType() {
        int i = this.storeUrlType_;
        com.fyber.inneractive.sdk.bidder.adm.j jVar = i != 0 ? i != 1 ? null : com.fyber.inneractive.sdk.bidder.adm.j.AUTOMATIC : com.fyber.inneractive.sdk.bidder.adm.j.MANUAL;
        return jVar == null ? com.fyber.inneractive.sdk.bidder.adm.j.UNRECOGNIZED : jVar;
    }

    public int getStoreUrlTypeValue() {
        return this.storeUrlType_;
    }

    public boolean hasAdCompletionUrl() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasAdDomain() {
        return (this.bitField0_ & 33554432) != 0;
    }

    public boolean hasAdDuration() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasAdExpirationInterval() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasAdHeight() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasAdNetworkId() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAdNetworkName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasAdUnitId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasAdWidth() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAdvertisedAppId() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasAppBundleId() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasAttributionClickUrl() {
        return (this.bitField1_ & 256) != 0;
    }

    public boolean hasAttributionImpressionUrl() {
        return (this.bitField1_ & 128) != 0;
    }

    public boolean hasAutoStorekitState() {
        return (this.bitField1_ & 32) != 0;
    }

    public boolean hasBrandBidderCtaText() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasBrandBidderDontShowEndcard() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasContentId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCreativeId() {
        return (this.bitField0_ & androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    public boolean hasCreativeType() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasCustomProductPageId() {
        return (this.bitField1_ & 64) != 0;
    }

    public boolean hasErrorMessage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIgniteInstallUrl() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasIgniteLauncherActivity() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasIgniteMode() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasMarkupUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMraidVideoOMSignal() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasMrcData() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasPricingValue() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasPublisherId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSdkClickUrl() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasSdkImpressionUrl() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSkAdNetworkData() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasSkOverlayData() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasSkipMode() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasSpotId() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasStoreCTAText() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasStoreEventUrl() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasStoreUrl() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasStoreUrlType() {
        return (this.bitField0_ & 32768) != 0;
    }

    public static com.fyber.inneractive.sdk.bidder.adm.h newBuilder(com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters) {
        return (com.fyber.inneractive.sdk.bidder.adm.h) DEFAULT_INSTANCE.createBuilder(admParametersOuterClass$AdmParameters);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(int i, com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(i, experiment);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
    }

    public static com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
    }
}
