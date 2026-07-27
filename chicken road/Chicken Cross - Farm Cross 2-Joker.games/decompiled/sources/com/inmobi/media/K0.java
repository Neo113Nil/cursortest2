package com.inmobi.media;

/* loaded from: classes6.dex */
public final class K0 implements Wh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N0 f6659a;
    public final /* synthetic */ boolean b;

    public K0(N0 n0, boolean z) {
        this.f6659a = n0;
        this.b = z;
    }

    @Override // com.inmobi.media.Wh
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f6659a.a("result pushed to queue");
        if (this.b) {
            N0 n0 = this.f6659a;
            n0.a("session end - cleanup");
            n0.g = null;
            n0.f.clear();
            n0.c.set(false);
            n0.d.set(false);
        }
    }

    @Override // com.inmobi.media.Wh
    public final void onError(Exception exc) {
        this.f6659a.a("error in pushing to queue", exc);
    }
}
