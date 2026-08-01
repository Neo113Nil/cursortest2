package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public interface k extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b, n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {
    boolean D();

    void H();

    void J();

    String K();

    boolean P();

    float U();

    StateFlow<m<Long>> V();

    int W();

    void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar);

    void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar);

    void b();

    void c(boolean z);

    void d(boolean z);

    void h();

    StateFlow<Boolean> isPlaying();

    int n();

    StateFlow<Boolean> r();

    String s();

    int u();
}
