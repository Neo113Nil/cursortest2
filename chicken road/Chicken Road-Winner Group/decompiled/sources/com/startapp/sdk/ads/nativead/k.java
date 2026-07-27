package com.startapp.sdk.ads.nativead;

import io.appmetrica.analytics.impl.C0817s1;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f3031b;

    public /* synthetic */ k(int i3, Object[] objArr) {
        this.f3030a = i3;
        this.f3031b = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3030a) {
            case 0:
                NativeAdDetails.lambda$finishOmAdSession$0(this.f3031b);
                break;
            default:
                C0817s1.a(this.f3031b);
                break;
        }
    }
}
