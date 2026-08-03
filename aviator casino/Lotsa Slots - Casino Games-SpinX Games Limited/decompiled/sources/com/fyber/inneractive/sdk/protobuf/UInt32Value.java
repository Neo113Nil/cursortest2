package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class UInt32Value extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
    private static final com.fyber.inneractive.sdk.protobuf.UInt32Value DEFAULT_INSTANCE;
    private static volatile com.fyber.inneractive.sdk.protobuf.m2 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        com.fyber.inneractive.sdk.protobuf.UInt32Value uInt32Value = new com.fyber.inneractive.sdk.protobuf.UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        com.fyber.inneractive.sdk.protobuf.z0.registerDefaultInstance(com.fyber.inneractive.sdk.protobuf.UInt32Value.class, uInt32Value);
    }

    private UInt32Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.fyber.inneractive.sdk.protobuf.j3 newBuilder() {
        return (com.fyber.inneractive.sdk.protobuf.j3) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value of(int i) {
        com.fyber.inneractive.sdk.protobuf.j3 newBuilder = newBuilder();
        newBuilder.c();
        ((com.fyber.inneractive.sdk.protobuf.UInt32Value) newBuilder.b).setValue(i);
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) newBuilder.a();
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.fyber.inneractive.sdk.protobuf.m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0
    public final java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.fyber.inneractive.sdk.protobuf.i3.f4198a[y0Var.ordinal()]) {
            case 1:
                return new com.fyber.inneractive.sdk.protobuf.UInt32Value();
            case 2:
                return new com.fyber.inneractive.sdk.protobuf.j3();
            case 3:
                return com.fyber.inneractive.sdk.protobuf.z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.fyber.inneractive.sdk.protobuf.m2 m2Var = PARSER;
                if (m2Var == null) {
                    synchronized (com.fyber.inneractive.sdk.protobuf.UInt32Value.class) {
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

    public int getValue() {
        return this.value_;
    }

    public static com.fyber.inneractive.sdk.protobuf.j3 newBuilder(com.fyber.inneractive.sdk.protobuf.UInt32Value uInt32Value) {
        return (com.fyber.inneractive.sdk.protobuf.j3) DEFAULT_INSTANCE.createBuilder(uInt32Value);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseDelimitedFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar);
    }

    public static com.fyber.inneractive.sdk.protobuf.UInt32Value parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        return (com.fyber.inneractive.sdk.protobuf.UInt32Value) com.fyber.inneractive.sdk.protobuf.z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
    }
}
