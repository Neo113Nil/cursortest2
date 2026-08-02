package com.google.protobuf;

/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0935z implements InterfaceC0898d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0935z f12296b = new C0935z(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12297a;

    public /* synthetic */ C0935z(int i7) {
        this.f12297a = i7;
    }

    @Override // com.google.protobuf.InterfaceC0898d0
    public final C0920o0 a(Class cls) {
        switch (this.f12297a) {
            case 0:
                if (!C.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0920o0) C.k(cls.asSubclass(C.class)).j(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.InterfaceC0898d0
    public final boolean b(Class cls) {
        switch (this.f12297a) {
            case 0:
                return C.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
