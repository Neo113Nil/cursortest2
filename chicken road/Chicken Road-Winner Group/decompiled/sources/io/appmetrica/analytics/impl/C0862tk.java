package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862tk implements Pc {
    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        Vm vm = (Vm) Tm.a(C0709nm.class);
        ProtobufStateStorage<Object> a3 = vm.a(context, vm.b(context));
        C0709nm c0709nm = (C0709nm) a3.read();
        C0683mm a4 = c0709nm.a(c0709nm.f7955m);
        a4.f7887o = 0L;
        a3.save(new C0709nm(a4));
    }
}
