package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433d4 extends Qc {

    /* renamed from: a, reason: collision with root package name */
    public final C0366af f7139a;

    public C0433d4(Context context) {
        this(new C0366af(C0513g7.a(context).b()));
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final void a(int i3) {
        this.f7139a.c(i3);
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final int b() {
        return (int) this.f7139a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final SparseArray<Pc> c() {
        return new SparseArray<>();
    }

    public C0433d4(C0366af c0366af) {
        this.f7139a = c0366af;
    }
}
