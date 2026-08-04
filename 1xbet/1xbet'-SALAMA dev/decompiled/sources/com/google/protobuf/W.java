package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements InterfaceC0854d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0854d0[] f12166a;

    @Override // com.google.protobuf.InterfaceC0854d0
    public final C0876o0 a(Class cls) {
        for (InterfaceC0854d0 interfaceC0854d0 : this.f12166a) {
            if (interfaceC0854d0.b(cls)) {
                return interfaceC0854d0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.InterfaceC0854d0
    public final boolean b(Class cls) {
        for (InterfaceC0854d0 interfaceC0854d0 : this.f12166a) {
            if (interfaceC0854d0.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
