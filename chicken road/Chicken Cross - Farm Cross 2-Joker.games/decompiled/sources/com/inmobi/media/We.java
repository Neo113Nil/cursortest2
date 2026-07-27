package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class We implements InterfaceC3782i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3597bf f6932a;

    public We(C3597bf c3597bf) {
        this.f6932a = c3597bf;
    }

    @Override // com.inmobi.media.InterfaceC3782i2
    public final void a() {
        this.f6932a.a();
    }

    @Override // com.inmobi.media.InterfaceC3782i2
    public final void b() {
        C3597bf c3597bf = this.f6932a;
        MediaPlayer mediaPlayer = c3597bf.c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(1.0f, 1.0f);
        } catch (IllegalStateException unused) {
        }
        c3597bf.a(c3597bf.k, c3597bf.j);
        AbstractC4012q5.a(c3597bf.e, c3597bf.b, new C3866l2(1.0f, false));
        c3597bf.i = false;
    }
}
