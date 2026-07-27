package io.appmetrica.analytics.impl;

import android.app.Activity;

/* loaded from: classes.dex */
public final /* synthetic */ class So implements InterfaceC0695he {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0547bl f7500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f7501c;

    public /* synthetic */ So(C0547bl c0547bl, Activity activity, int i2) {
        this.f7499a = i2;
        this.f7500b = c0547bl;
        this.f7501c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0695he
    public final void consume(Object obj) {
        switch (this.f7499a) {
            case 0:
                this.f7500b.a(this.f7501c, (C0874oc) obj);
                break;
            default:
                this.f7500b.b(this.f7501c, (C0874oc) obj);
                break;
        }
    }
}
