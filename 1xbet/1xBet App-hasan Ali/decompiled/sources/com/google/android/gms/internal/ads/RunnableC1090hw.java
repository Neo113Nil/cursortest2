package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1090hw implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1403ow f13817k;

    /* renamed from: l, reason: collision with root package name */
    public final E3.a f13818l;

    public RunnableC1090hw(AbstractC1403ow abstractC1403ow, E3.a aVar) {
        this.f13817k = abstractC1403ow;
        this.f13818l = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13817k.f14874k != this) {
            return;
        }
        E3.a aVar = this.f13818l;
        if (AbstractC1403ow.f14872p.b0(this.f13817k, this, AbstractC1403ow.h(aVar))) {
            AbstractC1403ow.o(this.f13817k, false);
        }
    }
}
