package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class Yo implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f6981a;
    public final /* synthetic */ Zo b;

    public Yo(ExoPlayer exoPlayer, Zo zo) {
        this.f6981a = exoPlayer;
        this.b = zo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f6981a.removeListener(this.b);
        this.f6981a.stop();
        this.f6981a.clearMediaItems();
        return Unit.INSTANCE;
    }
}
