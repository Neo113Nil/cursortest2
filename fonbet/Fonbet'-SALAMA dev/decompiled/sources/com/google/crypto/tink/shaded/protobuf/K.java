package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class K implements P {

    /* renamed from: a, reason: collision with root package name */
    public P[] f11720a;

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final b0 a(Class cls) {
        for (P p5 : this.f11720a) {
            if (p5.b(cls)) {
                return p5.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final boolean b(Class cls) {
        for (P p5 : this.f11720a) {
            if (p5.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
