package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0883t implements P {

    /* renamed from: b, reason: collision with root package name */
    public static final C0883t f11824b = new C0883t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11825a;

    public /* synthetic */ C0883t(int i7) {
        this.f11825a = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final b0 a(Class cls) {
        switch (this.f11825a) {
            case 0:
                if (!AbstractC0886w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (b0) AbstractC0886w.l(cls.asSubclass(AbstractC0886w.class)).k(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final boolean b(Class cls) {
        switch (this.f11825a) {
            case 0:
                return AbstractC0886w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
