package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

/* loaded from: classes5.dex */
public interface e extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    boolean C();

    android.view.View N();

    java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void a(java.lang.String str);

    void b(boolean z);

    kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> f();

    kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> isPlaying();

    java.lang.String m();

    kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> o();

    void pause();

    void play();

    void seekTo(long j);
}
