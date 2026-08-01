package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Se implements InterfaceC4141ul {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Te f6850a;

    public Se(Te te) {
        this.f6850a = te;
    }

    @Override // com.inmobi.media.InterfaceC4141ul
    public final void a() {
        Te te = this.f6850a;
        Kh kh = te.g;
        if (kh == Kh.e || kh == Kh.c) {
            Context context = te.i.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (AbstractC3720fp.a(context, te.b.f7093a)) {
                C3597bf c3597bf = te.k;
                AbstractC4012q5.a(c3597bf.b, new Ze(c3597bf, null));
                te.l.b();
                MediaPlayer mediaPlayer = te.j;
                Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
                try {
                    mediaPlayer.start();
                } catch (IllegalStateException unused) {
                }
                AbstractC4012q5.a(te.h, te.f6871a, new C4172vp(te.j.getCurrentPosition()));
                te.g = Kh.d;
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC4141ul
    public final void b() {
        Te te = this.f6850a;
        if (te.g != Kh.d) {
            return;
        }
        MediaPlayer mediaPlayer = te.j;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.pause();
        } catch (IllegalStateException unused) {
        }
        te.l.c();
        C3597bf c3597bf = te.k;
        AbstractC4012q5.a(c3597bf.b, new Ye(c3597bf, null));
        AbstractC4012q5.a(te.h, te.f6871a, new C3636cp(te.j.getCurrentPosition()));
        te.g = Kh.e;
    }

    @Override // com.inmobi.media.InterfaceC4141ul
    public final void c() {
        Te te = this.f6850a;
        if (te.g != Kh.f) {
            return;
        }
        MediaPlayer mediaPlayer = te.j;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.seekTo(0);
        } catch (IllegalStateException unused) {
        }
    }
}
