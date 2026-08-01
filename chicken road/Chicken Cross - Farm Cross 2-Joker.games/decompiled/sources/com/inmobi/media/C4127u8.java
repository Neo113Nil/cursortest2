package com.inmobi.media;

/* renamed from: com.inmobi.media.u8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4127u8 implements InterfaceC3782i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4182w8 f7409a;

    public C4127u8(C4182w8 c4182w8) {
        this.f7409a = c4182w8;
    }

    @Override // com.inmobi.media.InterfaceC3782i2
    public final void a() {
        this.f7409a.a();
    }

    @Override // com.inmobi.media.InterfaceC3782i2
    public final void b() {
        C4182w8 c4182w8 = this.f7409a;
        c4182w8.b.setVolume(1.0f);
        AbstractC4012q5.a(c4182w8.c, c4182w8.f7453a, new C3866l2(1.0f, false));
        c4182w8.e = false;
    }
}
