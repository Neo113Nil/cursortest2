package com.inmobi.media;

/* loaded from: classes5.dex */
public final class U7 implements com.inmobi.media.P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.W7 f4991a;

    public U7(com.inmobi.media.W7 w7) {
        this.f4991a = w7;
    }

    @Override // com.inmobi.media.P1
    public final void a() {
        this.f4991a.a();
    }

    @Override // com.inmobi.media.P1
    public final void b() {
        com.inmobi.media.W7 w7 = this.f4991a;
        w7.b.setVolume(1.0f);
        com.inmobi.media.T4.a(w7.c, w7.f5025a, new com.inmobi.media.S1(1.0f, false));
        w7.e = false;
    }
}
