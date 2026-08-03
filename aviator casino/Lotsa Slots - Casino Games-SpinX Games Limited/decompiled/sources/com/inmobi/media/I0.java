package com.inmobi.media;

/* loaded from: classes5.dex */
public final class I0 implements com.inmobi.media.Ng {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.L0 f4753a;
    public final /* synthetic */ boolean b;

    public I0(com.inmobi.media.L0 l0, boolean z) {
        this.f4753a = l0;
        this.b = z;
    }

    @Override // com.inmobi.media.Ng
    public final void a(java.lang.Object obj) {
        ((java.lang.Boolean) obj).getClass();
        this.f4753a.a("result pushed to queue");
        if (this.b) {
            com.inmobi.media.L0 l0 = this.f4753a;
            l0.a("session end - cleanup");
            l0.g = null;
            l0.f.clear();
            l0.c.set(false);
            l0.d.set(false);
        }
    }

    @Override // com.inmobi.media.Ng
    public final void onError(java.lang.Exception exc) {
        this.f4753a.a("error in pushing to queue", exc);
    }
}
