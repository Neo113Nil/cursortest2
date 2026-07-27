package io.appmetrica.analytics.impl;

import android.app.Activity;

/* loaded from: classes.dex */
public final /* synthetic */ class To implements InterfaceC0546he {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0398bl f6687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f6688c;

    public /* synthetic */ To(C0398bl c0398bl, Activity activity, int i3) {
        this.f6686a = i3;
        this.f6687b = c0398bl;
        this.f6688c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0546he
    public final void consume(Object obj) {
        switch (this.f6686a) {
            case 0:
                this.f6687b.a(this.f6688c, (C0725oc) obj);
                break;
            default:
                this.f6687b.b(this.f6688c, (C0725oc) obj);
                break;
        }
    }
}
