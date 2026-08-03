package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class IgniteResponseOuterClass$IgniteResponse extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
    public static final int CLIENTID_FIELD_NUMBER = 1;
    public static final int CLIENTSECRET_FIELD_NUMBER = 2;
    private static final com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse DEFAULT_INSTANCE;
    private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER;
    private int bitField0_;
    private java.lang.String clientId_ = "";
    private java.lang.String clientSecret_ = "";

    static {
        com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse igniteResponseOuterClass$IgniteResponse = new com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse();
        DEFAULT_INSTANCE = igniteResponseOuterClass$IgniteResponse;
        com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse.class, igniteResponseOuterClass$IgniteResponse);
    }

    private IgniteResponseOuterClass$IgniteResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientId() {
        this.bitField0_ &= -2;
        this.clientId_ = getDefaultInstance().getClientId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientSecret() {
        this.bitField0_ &= -3;
        this.clientSecret_ = getDefaultInstance().getClientSecret();
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.fyber.inneractive.sdk.ignite.q newBuilder() {
        return (com.fyber.inneractive.sdk.ignite.q) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.clientId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientIdBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.clientId_ = sVar.f();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSecret(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.clientSecret_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSecretBytes(com.fyber.inneractive.sdk.protobuf.s sVar) {
        com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
        this.clientSecret_ = sVar.f();
        this.bitField0_ |= 2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0
    public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.fyber.inneractive.sdk.ignite.p.f3780a[y0Var.ordinal()]) {
            case 1:
                return new com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse();
            case 2:
                return new com.fyber.inneractive.sdk.ignite.q();
            case 3:
                return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new java.lang.Object[]{"bitField0_", "clientId_", "clientSecret_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                if (m2Var == null) {
                    synchronized (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse.class) {
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

    public java.lang.String getClientId() {
        return this.clientId_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getClientIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.clientId_);
    }

    public java.lang.String getClientSecret() {
        return this.clientSecret_;
    }

    public com.fyber.inneractive.sdk.protobuf.s getClientSecretBytes() {
        return com.fyber.inneractive.sdk.protobuf.s.a(this.clientSecret_);
    }

    public boolean hasClientId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClientSecret() {
        return (this.bitField0_ & 2) != 0;
    }

    public static com.fyber.inneractive.sdk.ignite.q newBuilder(com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse igniteResponseOuterClass$IgniteResponse) {
        return (com.fyber.inneractive.sdk.ignite.q) DEFAULT_INSTANCE.createBuilder(igniteResponseOuterClass$IgniteResponse);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
    }

    public static com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
    }
}
