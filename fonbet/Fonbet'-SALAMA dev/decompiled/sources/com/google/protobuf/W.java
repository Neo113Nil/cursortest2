package com.google.protobuf;

/* loaded from: classes2.dex */
public final class W implements InterfaceC0898d0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0898d0[] f12166a;

    @Override // com.google.protobuf.InterfaceC0898d0
    public final C0920o0 a(Class cls) {
        for (InterfaceC0898d0 interfaceC0898d0 : this.f12166a) {
            if (interfaceC0898d0.b(cls)) {
                return interfaceC0898d0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.InterfaceC0898d0
    public final boolean b(Class cls) {
        for (InterfaceC0898d0 interfaceC0898d0 : this.f12166a) {
            if (interfaceC0898d0.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
