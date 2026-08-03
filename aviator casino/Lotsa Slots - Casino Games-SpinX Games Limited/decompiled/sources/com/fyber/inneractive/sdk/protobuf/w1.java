package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class w1 implements com.fyber.inneractive.sdk.protobuf.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.b2[] f4224a;

    public w1(com.fyber.inneractive.sdk.protobuf.b2... b2VarArr) {
        this.f4224a = b2VarArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(java.lang.Class cls) {
        for (com.fyber.inneractive.sdk.protobuf.b2 b2Var : this.f4224a) {
            if (b2Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final com.fyber.inneractive.sdk.protobuf.r2 b(java.lang.Class cls) {
        for (com.fyber.inneractive.sdk.protobuf.b2 b2Var : this.f4224a) {
            if (b2Var.a(cls)) {
                return b2Var.b(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
