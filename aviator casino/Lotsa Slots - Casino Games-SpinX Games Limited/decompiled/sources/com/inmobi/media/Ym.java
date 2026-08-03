package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ym implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f5072a;

    public Ym(android.media.MediaPlayer mediaPlayer) {
        this.f5072a = mediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        this.f5072a.release();
        return kotlin.Unit.INSTANCE;
    }
}
