package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes7.dex */
public final class v implements InterfaceC4834u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11210a = 0;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object>, SuspendFunction {
        public a(Object obj) {
            super(1, obj, b.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
            return ((b) this.receiver).b(continuation);
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e {
        public final /* synthetic */ MutableStateFlow<Boolean> o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f fVar, MutableStateFlow<Boolean> mutableStateFlow, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r rVar2) {
            super(context, str, rVar2, null, null, null, rVar, false, fVar, 184, null);
            this.o = mutableStateFlow;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
        public void v() {
            super.v();
            this.o.setValue(Boolean.FALSE);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(Object obj) {
            super(0, obj, b.class, "closeFullscreenAdRepresentation", "closeFullscreenAdRepresentation()V", 0);
        }

        public final void a() {
            ((b) this.receiver).v();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC4834u
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(Context context, CoroutineScope scope, C4782e bid, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, MutableStateFlow<Boolean> isAdDisplaying, boolean z, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(isAdDisplaying, "isAdDisplaying");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h.a(context, scope, z);
        b bVar = new b(context, externalLinkHandler, a2, isAdDisplaying, bid.getAdm(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.c);
        return B.a(context, watermark, new y(scope, bid, a.C1507a.f10866a.a(), new a(bVar)), bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k(true, new c(bVar), scope, UInt.m8176constructorimpl(RangesKt.coerceAtLeast(0, 0)), a2.c(), a2.y(), null, 64, null), MraidActivity.INSTANCE, bid.getBundle(), metricsRecorder);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC4834u
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y> a(Context context, C4782e bid, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return P.a(context, bid, a.g.f10872a.b().h(), watermark, metricsRecorder, null, null, 96, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC4834u
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adm, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return H.a(context, customUserEventBuilderService, adm, externalLinkHandler, watermark, metricsRecorder);
    }
}
