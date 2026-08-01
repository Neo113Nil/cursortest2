package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import com.moloco.sdk.internal.x;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public interface f extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l {
    StateFlow<Boolean> L();

    Object a(String str, Continuation<? super x<c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation);

    void a(n nVar, String str);

    void a(r rVar);

    void a(s sVar);

    void a(t tVar);

    void a(boolean z);

    void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    WebView c();

    void j();

    SharedFlow<n> y();

    StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> z();
}
