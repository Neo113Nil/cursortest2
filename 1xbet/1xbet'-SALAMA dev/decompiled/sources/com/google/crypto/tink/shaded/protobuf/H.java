package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends I {
    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(long j, Object obj) {
        ((AbstractC0822b) ((InterfaceC0845z) o0.f11810c.i(j, obj))).f11754a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void b(Object obj, long j, Object obj2) {
        n0 n0Var = o0.f11810c;
        InterfaceC0845z interfaceC0845zA = (InterfaceC0845z) n0Var.i(j, obj);
        InterfaceC0845z interfaceC0845z = (InterfaceC0845z) n0Var.i(j, obj2);
        int size = interfaceC0845zA.size();
        int size2 = interfaceC0845z.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0822b) interfaceC0845zA).f11754a) {
                interfaceC0845zA = interfaceC0845zA.a(size2 + size);
            }
            interfaceC0845zA.addAll(interfaceC0845z);
        }
        if (size > 0) {
            interfaceC0845z = interfaceC0845zA;
        }
        o0.v(obj, j, interfaceC0845z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List c(long j, Object obj) {
        InterfaceC0845z interfaceC0845z = (InterfaceC0845z) o0.f11810c.i(j, obj);
        if (((AbstractC0822b) interfaceC0845z).f11754a) {
            return interfaceC0845z;
        }
        int size = interfaceC0845z.size();
        InterfaceC0845z interfaceC0845zA = interfaceC0845z.a(size == 0 ? 10 : size * 2);
        o0.v(obj, j, interfaceC0845zA);
        return interfaceC0845zA;
    }
}
