package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Cp implements InterfaceC4112tl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dp f6502a;

    public Cp(Dp dp) {
        this.f6502a = dp;
    }

    @Override // com.inmobi.media.InterfaceC4112tl
    public final void a(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = new Surface(surface);
        Dp dp = this.f6502a;
        dp.g = surface2;
        MediaPlayer mediaPlayer = dp.b;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(surface2);
        } catch (IllegalStateException unused) {
        }
        this.f6502a.a();
        InterfaceC4141ul interfaceC4141ul = this.f6502a.h;
        if (interfaceC4141ul != null) {
            interfaceC4141ul.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC4112tl
    public final void a() {
        Surface surface = this.f6502a.g;
        if (surface != null) {
            surface.release();
        }
        Dp dp = this.f6502a;
        dp.g = null;
        MediaPlayer mediaPlayer = dp.b;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(null);
        } catch (IllegalStateException unused) {
        }
        this.f6502a.a();
    }
}
