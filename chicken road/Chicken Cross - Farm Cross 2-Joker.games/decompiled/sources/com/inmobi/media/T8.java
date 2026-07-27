package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class T8 implements InterfaceC4112tl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U8 f6867a;

    public T8(U8 u8) {
        this.f6867a = u8;
    }

    @Override // com.inmobi.media.InterfaceC4112tl
    public final void a(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = new Surface(surface);
        U8 u8 = this.f6867a;
        Surface surface3 = u8.e;
        if (surface3 != null) {
            surface3.release();
        }
        u8.e = surface2;
        InterfaceC4141ul interfaceC4141ul = this.f6867a.f;
        if (interfaceC4141ul != null) {
            interfaceC4141ul.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC4112tl
    public final void a() {
        this.f6867a.b.clearVideoSurface();
        this.f6867a.b.setVideoSurface(null);
        Surface surface = this.f6867a.e;
        if (surface != null) {
            surface.release();
        }
        this.f6867a.e = null;
    }
}
