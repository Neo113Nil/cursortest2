package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class B4 implements InterfaceC0814m4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6582a;

    /* renamed from: b, reason: collision with root package name */
    public final E4 f6583b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f6584c;

    public B4(Context context, E4 e42, C1073w4 c1073w4) {
        this.f6582a = context;
        this.f6583b = e42;
        this.f6584c = c1073w4.f9499c;
        e42.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0814m4
    public final void a(W5 w5, C1073w4 c1073w4) {
        this.f6583b.a(c1073w4.f9498b);
        this.f6583b.a(w5, this);
    }

    public final E4 b() {
        return this.f6583b;
    }

    public final Context c() {
        return this.f6582a;
    }

    public final ResultReceiver d() {
        return this.f6584c;
    }

    public final void a(C0504a4 c0504a4) {
        I6.a(this.f6584c, c0504a4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0814m4
    public final void a() {
        this.f6583b.b(this);
    }
}
