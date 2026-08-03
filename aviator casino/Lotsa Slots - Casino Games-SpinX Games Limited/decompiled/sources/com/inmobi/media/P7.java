package com.inmobi.media;

/* loaded from: classes5.dex */
public final class P7 implements com.inmobi.media.Zj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f4890a;

    public P7(com.inmobi.media.R7 r7) {
        this.f4890a = r7;
    }

    @Override // com.inmobi.media.Zj
    public final void a() {
        this.f4890a.d();
    }

    @Override // com.inmobi.media.Zj
    public final void b() {
        this.f4890a.c();
    }

    @Override // com.inmobi.media.Zj
    public final void c() {
        android.view.Surface surface;
        com.inmobi.media.R7 r7 = this.f4890a;
        if (r7.q != null) {
            com.inmobi.media.C2742s8 c2742s8 = r7.z;
            if (c2742s8.g || (surface = c2742s8.e) == null) {
                return;
            }
            c2742s8.g = true;
            c2742s8.b.setVideoSurface(surface);
        }
    }
}
