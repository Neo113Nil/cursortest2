package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class B4 implements InterfaceC0665m4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5750a;

    /* renamed from: b, reason: collision with root package name */
    public final E4 f5751b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f5752c;

    public B4(Context context, E4 e4, C0924w4 c0924w4) {
        this.f5750a = context;
        this.f5751b = e4;
        this.f5752c = c0924w4.f8542c;
        e4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0665m4
    public final void a(W5 w5, C0924w4 c0924w4) {
        this.f5751b.a(c0924w4.f8541b);
        this.f5751b.a(w5, this);
    }

    public final E4 b() {
        return this.f5751b;
    }

    public final Context c() {
        return this.f5750a;
    }

    public final ResultReceiver d() {
        return this.f5752c;
    }

    public final void a(C0355a4 c0355a4) {
        I6.a(this.f5752c, c0355a4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0665m4
    public final void a() {
        this.f5751b.b(this);
    }
}
