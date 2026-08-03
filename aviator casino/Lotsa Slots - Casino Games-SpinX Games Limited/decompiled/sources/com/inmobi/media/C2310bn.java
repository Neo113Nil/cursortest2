package com.inmobi.media;

/* renamed from: com.inmobi.media.bn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2310bn implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f5129a;
    public final /* synthetic */ com.inmobi.media.C2338cn b;

    public C2310bn(androidx.media3.exoplayer.ExoPlayer exoPlayer, com.inmobi.media.C2338cn c2338cn) {
        this.f5129a = exoPlayer;
        this.b = c2338cn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        this.f5129a.removeListener(this.b);
        this.f5129a.stop();
        this.f5129a.clearMediaItems();
        return kotlin.Unit.INSTANCE;
    }
}
