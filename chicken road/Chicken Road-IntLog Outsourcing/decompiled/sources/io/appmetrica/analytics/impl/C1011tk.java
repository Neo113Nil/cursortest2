package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011tk implements Pc {
    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        Vm vm = (Vm) Tm.a(C0858nm.class);
        ProtobufStateStorage<Object> a6 = vm.a(context, vm.b(context));
        C0858nm c0858nm = (C0858nm) a6.read();
        C0832mm a7 = c0858nm.a(c0858nm.f8886m);
        a7.f8815o = 0L;
        a6.save(new C0858nm(a7));
    }
}
