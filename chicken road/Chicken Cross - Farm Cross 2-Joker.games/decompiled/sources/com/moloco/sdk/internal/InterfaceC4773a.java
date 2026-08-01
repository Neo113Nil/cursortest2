package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.i;
import com.moloco.sdk.internal.publisher.C4786a;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;

/* renamed from: com.moloco.sdk.internal.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC4773a {
    Banner a(Context context, InterfaceC4805f interfaceC4805f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, C c, i.a aVar, MetricsRecorder metricsRecorder);

    Banner a(Context context, InterfaceC4805f interfaceC4805f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, C c, i.c cVar, MetricsRecorder metricsRecorder);

    Banner a(Context context, InterfaceC4805f interfaceC4805f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, C c, i iVar, MetricsRecorder metricsRecorder);

    InterstitialAd a(Context context, InterfaceC4805f interfaceC4805f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, MetricsRecorder metricsRecorder);

    NativeAd a(Context context, InterfaceC4805f interfaceC4805f, com.moloco.sdk.internal.services.n nVar, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, C c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, I i, MetricsRecorder metricsRecorder);

    RewardedInterstitialAd a(Context context, InterfaceC4805f interfaceC4805f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.config.a aVar);

    Banner b(Context context, InterfaceC4805f interfaceC4805f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, C c, i iVar, MetricsRecorder metricsRecorder);

    Banner c(Context context, InterfaceC4805f interfaceC4805f, String str, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, C c, i iVar, MetricsRecorder metricsRecorder);
}
