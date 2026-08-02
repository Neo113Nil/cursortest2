package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616Ig implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9588a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.g f9589b;

    public /* synthetic */ C0616Ig(m2.g gVar, int i) {
        this.f9588a = i;
        this.f9589b = gVar;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f9588a) {
            case 0:
                View view = (View) this.f9589b.f17995m;
                AbstractC1400ot.D(view);
                return view;
            case 1:
                Mq mq = (Mq) this.f9589b.f17996n;
                AbstractC1400ot.D(mq);
                return mq;
            case 2:
                return (InterfaceC0735Zg) this.f9589b.f17994l;
            default:
                return (InterfaceC0677Re) this.f9589b.f17997o;
        }
    }
}
