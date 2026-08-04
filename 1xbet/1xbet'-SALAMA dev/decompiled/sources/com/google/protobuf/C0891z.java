package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0891z implements InterfaceC0854d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0891z f12296b = new C0891z(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12297a;

    public /* synthetic */ C0891z(int i7) {
        this.f12297a = i7;
    }

    @Override // com.google.protobuf.InterfaceC0854d0
    public final C0876o0 a(Class cls) {
        switch (this.f12297a) {
            case 0:
                if (!C.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0876o0) C.k(cls.asSubclass(C.class)).j(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.InterfaceC0854d0
    public final boolean b(Class cls) {
        switch (this.f12297a) {
            case 0:
                return C.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
