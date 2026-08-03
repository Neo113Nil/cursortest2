package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f4203a = java.nio.charset.Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
    }

    public static java.lang.String a(byte[] bArr) {
        return new java.lang.String(bArr, f4203a);
    }

    public static com.fyber.inneractive.sdk.protobuf.z0 a(java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.protobuf.d2 d2Var = (com.fyber.inneractive.sdk.protobuf.d2) obj2;
        com.fyber.inneractive.sdk.protobuf.t0 t0Var = (com.fyber.inneractive.sdk.protobuf.t0) ((com.fyber.inneractive.sdk.protobuf.d2) obj).toBuilder();
        if (!t0Var.f4219a.getClass().isInstance(d2Var)) {
            throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        t0Var.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(t0Var.b, (com.fyber.inneractive.sdk.protobuf.z0) ((com.fyber.inneractive.sdk.protobuf.b) d2Var));
        return t0Var.b();
    }
}
