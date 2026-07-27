package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.C4776d;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.ortb.model.C4785h;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4815b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes7.dex */
public final class m {

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function8<Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, C4782e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z, com.moloco.sdk.internal.C, com.moloco.sdk.internal.services.s, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10618a = new a();

        public a() {
            super(8, m.class, "createXenossAggregatedBanner", "createXenossAggregatedBanner(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService;Lcom/moloco/sdk/internal/ortb/model/Bid;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/Watermark;Lcom/moloco/sdk/internal/ViewLifecycleOwner;Lcom/moloco/sdk/internal/services/ClickthroughService;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/ButtonTracker;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/XenossBannerView;", 1);
        }

        @Override // kotlin.jvm.functions.Function8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h> invoke(Context p0, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a p1, C4782e p2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r p3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z p4, com.moloco.sdk.internal.C p5, com.moloco.sdk.internal.services.s p6, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h p7) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            Intrinsics.checkNotNullParameter(p4, "p4");
            Intrinsics.checkNotNullParameter(p5, "p5");
            Intrinsics.checkNotNullParameter(p6, "p6");
            Intrinsics.checkNotNullParameter(p7, "p7");
            return m.b(p0, p1, p2, p3, p4, p5, p6, p7);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, c> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f10619a = new b();

        public b() {
            super(1, m.class, "createXenossAggregatedAdShowListener", "createXenossAggregatedAdShowListener(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/VastAdShowListener;)Lcom/moloco/sdk/internal/publisher/BannerKt$createXenossAggregatedAdShowListener$1;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.b(p0);
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x f10620a;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar) {
            this.f10620a = xVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            this.f10620a.a();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            this.f10620a.b();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            this.f10620a.a(internalShowError);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x
        public void a(boolean z) {
            this.f10620a.a(z);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h> b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, C4782e c4782e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, com.moloco.sdk.internal.C c2, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar) {
        return new C4815b(context, aVar, null, c4782e, a(c4782e), rVar, zVar, c2, CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), sVar, hVar);
    }

    public static final Banner a(Context context, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, com.moloco.sdk.internal.C viewLifecycleOwnerSingleton, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.internal.services.s clickthroughService, MetricsRecorder metricsRecorder, Q viewVisibilityTracker, AdFormatType adFormatType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        return new n(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, z, externalLinkHandler, a.f10618a, b.f10619a, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, clickthroughService, metricsRecorder, viewVisibilityTracker, adFormatType);
    }

    public static final c b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar) {
        return new c(xVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a(C4782e c4782e) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b2;
        com.moloco.sdk.internal.ortb.model.B player = c4782e.getExt().getPlayer();
        boolean b3 = C4785h.b(c4782e);
        float a3 = C4785h.a(c4782e);
        Integer w = c4782e.getW();
        int a4 = w != null ? com.moloco.sdk.internal.j.a(w.intValue()) : 0;
        Integer h = c4782e.getH();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(b3, a3, a4, h != null ? com.moloco.sdk.internal.j.a(h.intValue()) : 0);
        return C4785h.c(c4782e) ? (player == null || (b2 = C4776d.b(player, gVar)) == null) ? C4776d.b(gVar) : b2 : (player == null || (a2 = C4776d.a(player, gVar)) == null) ? C4776d.a(gVar) : a2;
    }
}
