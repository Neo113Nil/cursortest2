package com.inmobi.media;

import android.view.Surface;

/* renamed from: com.inmobi.media.p8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3987p8 implements InterfaceC4141ul {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7300a;

    public C3987p8(C4043r8 c4043r8) {
        this.f7300a = c4043r8;
    }

    @Override // com.inmobi.media.InterfaceC4141ul
    public final void a() {
        this.f7300a.e();
    }

    @Override // com.inmobi.media.InterfaceC4141ul
    public final void b() {
        this.f7300a.d();
    }

    @Override // com.inmobi.media.InterfaceC4141ul
    public final void c() {
        Surface surface;
        C4043r8 c4043r8 = this.f7300a;
        if (c4043r8.o != null) {
            U8 u8 = c4043r8.z;
            if (u8.g || (surface = u8.e) == null) {
                return;
            }
            u8.g = true;
            u8.b.setVideoSurface(surface);
        }
    }
}
