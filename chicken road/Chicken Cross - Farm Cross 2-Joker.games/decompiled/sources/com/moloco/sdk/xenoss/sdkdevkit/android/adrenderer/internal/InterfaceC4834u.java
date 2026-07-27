package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C4782e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC4834u {
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y> a(Context context, C4782e c4782e, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, MetricsRecorder metricsRecorder);

    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, String str, r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, MetricsRecorder metricsRecorder);

    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(Context context, CoroutineScope coroutineScope, C4782e c4782e, r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, MutableStateFlow<Boolean> mutableStateFlow, boolean z, MetricsRecorder metricsRecorder);
}
