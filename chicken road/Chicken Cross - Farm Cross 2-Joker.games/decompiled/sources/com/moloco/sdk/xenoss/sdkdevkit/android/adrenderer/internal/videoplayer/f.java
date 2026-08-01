package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public interface f extends l {
    boolean G();

    View R();

    Object a(Continuation<? super Unit> continuation);

    void a(String str);

    void b(boolean z);

    StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> f();

    StateFlow<b> isPlaying();

    String m();

    StateFlow<i> p();

    void pause();

    void play();

    void seekTo(long j);
}
