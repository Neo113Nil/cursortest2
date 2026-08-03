package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class IgniteRequestOuterClass$IgniteRequest extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
    public static final int APPID_FIELD_NUMBER = 1;
    public static final int APPSIGNATURE_FIELD_NUMBER = 3;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    private static final com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest DEFAULT_INSTANCE;
    public static final int IGNITEPACKAGENAME_FIELD_NUMBER = 4;
    public static final int IGNITEVERSIONNAME_FIELD_NUMBER = 5;
    private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
    public static final int SDKVERSION_FIELD_NUMBER = 6;
    private int bitField0_;
    private java.lang.String appId_ = "";
    private java.lang.String bundle_ = "";
    private java.lang.String appSignature_ = "";
    private java.lang.String ignitePackageName_ = "";
    private java.lang.String igniteVersionName_ = "";
    private java.lang.String sdkVersion_ = "";

    static {
        com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest igniteRequestOuterClass$IgniteRequest = new com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest();
        DEFAULT_INSTANCE = igniteRequestOuterClass$IgniteRequest;
        com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.class, igniteRequestOuterClass$IgniteRequest);
    }

    private IgniteRequestOuterClass$IgniteRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppId() {
        this.bitField0_ &= -2;
        this.appId_ = getDefaultInstance().getAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppSignature() {
        this.bitField0_ &= -5;
        this.appSignature_ = getDefaultInstance().getAppSignature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundle() {
        this.bitField0_ &= -3;
        this.bundle_ = getDefaultInstance().getBundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnitePackageName() {
        this.bitField0_ &= -9;
        this.ignitePackageName_ = getDefaultInstance().getIgnitePackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgniteVersionName() {
        this.bitField0_ &= -17;
        this.igniteVersionName_ = getDefaultInstance().getIgniteVersionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -33;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.fyber.inneractive.sdk.ignite.o newBuilder() {
        return (com.fyber.inneractive.sdk.ignite.o) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.appId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.appId_ = sVar.f();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppSignature(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.appSignature_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppSignatureBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.appSignature_ = sVar.f();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundle(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.bundle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.bundle_ = sVar.f();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnitePackageName(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.ignitePackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnitePackageNameBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.ignitePackageName_ = sVar.f();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteVersionName(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.igniteVersionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteVersionNameBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.igniteVersionName_ = sVar.f();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.sdkVersion_ = sVar.f();
        this.bitField0_ |= 32;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0
    public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.fyber.inneractive.sdk.ignite.n.f3779a[y0Var.ordinal()]) {
            case 1:
                return new com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest();
            case 2:
                return new com.fyber.inneractive.sdk.ignite.o();
            case 3:
                return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005", new java.lang.Object[]{"bitField0_", "appId_", "bundle_", "appSignature_", "ignitePackageName_", "igniteVersionName_", "sdkVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                if (m2Var == null) {
                    synchronized (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.class) {
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

    public java.lang.String getAppId() {
        return this.appId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAppIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.appId_);
    }

    public java.lang.String getAppSignature() {
        return this.appSignature_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getAppSignatureBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.appSignature_);
    }

    public java.lang.String getBundle() {
        return this.bundle_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getBundleBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.bundle_);
    }

    public java.lang.String getIgnitePackageName() {
        return this.ignitePackageName_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getIgnitePackageNameBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.ignitePackageName_);
    }

    public java.lang.String getIgniteVersionName() {
        return this.igniteVersionName_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getIgniteVersionNameBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.igniteVersionName_);
    }

    public java.lang.String getSdkVersion() {
        return this.sdkVersion_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getSdkVersionBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.sdkVersion_);
    }

    public boolean hasAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAppSignature() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBundle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIgnitePackageName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIgniteVersionName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public static com.fyber.inneractive.sdk.ignite.o newBuilder(com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest igniteRequestOuterClass$IgniteRequest) {
        return (com.fyber.inneractive.sdk.ignite.o) DEFAULT_INSTANCE.createBuilder(igniteRequestOuterClass$IgniteRequest);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
    }
}
