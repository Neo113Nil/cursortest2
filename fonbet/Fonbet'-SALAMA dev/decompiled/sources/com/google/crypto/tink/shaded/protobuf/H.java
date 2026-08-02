package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public final class H extends I {
    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(long j, Object obj) {
        ((AbstractC0866b) ((InterfaceC0889z) o0.f11810c.i(j, obj))).f11754a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void b(Object obj, long j, Object obj2) {
        n0 n0Var = o0.f11810c;
        InterfaceC0889z interfaceC0889z = (InterfaceC0889z) n0Var.i(j, obj);
        InterfaceC0889z interfaceC0889z2 = (InterfaceC0889z) n0Var.i(j, obj2);
        int size = interfaceC0889z.size();
        int size2 = interfaceC0889z2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0866b) interfaceC0889z).f11754a) {
                interfaceC0889z = interfaceC0889z.a(size2 + size);
            }
            interfaceC0889z.addAll(interfaceC0889z2);
        }
        if (size > 0) {
            interfaceC0889z2 = interfaceC0889z;
        }
        o0.v(obj, j, interfaceC0889z2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List c(long j, Object obj) {
        InterfaceC0889z interfaceC0889z = (InterfaceC0889z) o0.f11810c.i(j, obj);
        if (((AbstractC0866b) interfaceC0889z).f11754a) {
            return interfaceC0889z;
        }
        int size = interfaceC0889z.size();
        InterfaceC0889z a2 = interfaceC0889z.a(size == 0 ? 10 : size * 2);
        o0.v(obj, j, a2);
        return a2;
    }
}
