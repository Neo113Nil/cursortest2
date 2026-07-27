package com.moloco.sdk.internal.publisher;

import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.moloco.sdk.internal.publisher.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4791f implements z {
    public static final a g = new a(null);
    public static final int h = 8;
    public static final String i = "AdLoadListenerTrackerImpl";

    /* renamed from: a, reason: collision with root package name */
    public final AdLoad.Listener f10614a;
    public final com.moloco.sdk.internal.y b;
    public final TimerEvent c;
    public final AdFormatType d;
    public final MetricsRecorder e;
    public final Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> f;

    /* renamed from: com.moloco.sdk.internal.publisher.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4791f(AdLoad.Listener listener, com.moloco.sdk.internal.y sdkEventUrlTracker, TimerEvent acmLoadTimerEvent, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(acmLoadTimerEvent, "acmLoadTimerEvent");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10614a = listener;
        this.b = sdkEventUrlTracker;
        this.c = acmLoadTimerEvent;
        this.d = adFormatType;
        this.e = metricsRecorder;
        this.f = function0;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(MolocoAd molocoAd, long j, com.moloco.sdk.internal.ortb.model.D d) {
        String onAdLoadStart;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "onAdLoadStarted: " + molocoAd + ", " + j, null, false, 12, null);
        if (d == null || (onAdLoadStart = d.getOnAdLoadStart()) == null) {
            return;
        }
        y.a.a(this.b, onAdLoadStart, j, null, 4, null);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(MolocoAd molocoAd, com.moloco.sdk.internal.ortb.model.D d) {
        String onAdLoadSuccess;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "onAdLoadSuccess: " + molocoAd, null, false, 12, null);
        if (d != null && (onAdLoadSuccess = d.getOnAdLoadSuccess()) != null) {
            y.a.a(this.b, onAdLoadSuccess, System.currentTimeMillis(), null, 4, null);
        }
        MetricsRecorder metricsRecorder = this.e;
        TimerEvent withTag = this.c.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success");
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.c;
        String c = dVar.c();
        String name = this.d.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordTimerEvent(C4793h.a(withTag.withTag(c, lowerCase), this.f));
        MetricsRecorder metricsRecorder2 = this.e;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.l.c());
        String c2 = dVar.c();
        String lowerCase2 = this.d.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        metricsRecorder2.recordCountEvent(C4793h.a(countEvent.withTag(c2, lowerCase2), this.f));
        AdLoad.Listener listener = this.f10614a;
        if (listener != null) {
            listener.onAdLoadSuccess(molocoAd);
        }
    }

    public /* synthetic */ C4791f(AdLoad.Listener listener, com.moloco.sdk.internal.y yVar, TimerEvent timerEvent, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(listener, yVar, timerEvent, adFormatType, metricsRecorder, (i2 & 32) != 0 ? null : function0);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.internal.t internalError, com.moloco.sdk.internal.ortb.model.D d) {
        String str;
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "onAdLoadFailed: " + internalError, null, false, 12, null);
        if (d != null && (str = d.getCom.ironsource.Wf.b java.lang.String()) != null) {
            this.b.a(str, System.currentTimeMillis(), internalError);
        }
        String str2 = internalError.d().get("missing_fields");
        MetricsRecorder metricsRecorder = this.e;
        TimerEvent withTag = this.c.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
        TimerEvent withTag2 = withTag.withTag(dVar.c(), internalError.f().a());
        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
        String c = dVar2.c();
        String name = this.d.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordTimerEvent(withTag2.withTag(c, lowerCase));
        CountEvent withTag3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag("network", internalError.e().getNetworkName()).withTag(dVar.c(), internalError.f().a());
        String c2 = dVar2.c();
        String lowerCase2 = this.d.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        CountEvent a2 = C4793h.a(withTag3.withTag(c2, lowerCase2), this.f);
        if (str2 != null && !StringsKt.isBlank(str2)) {
            a2 = a2.withTag(com.moloco.sdk.internal.client_metrics_data.d.i.c(), str2);
        }
        this.e.recordCountEvent(a2);
        AdLoad.Listener listener = this.f10614a;
        if (listener != null) {
            listener.onAdLoadFailed(internalError.e());
        }
    }
}
