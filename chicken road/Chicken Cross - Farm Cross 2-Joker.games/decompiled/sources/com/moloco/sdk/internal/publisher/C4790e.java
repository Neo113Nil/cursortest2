package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.moloco.sdk.internal.publisher.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4790e {
    public static final AdLoad a(CoroutineScope scope, Function1<? super Long, Duration> timeout, String adUnitId, Function1<? super C4782e, ? extends InterfaceC4812b> recreateXenossAdLoader, AdFormatType adFormatType, com.moloco.sdk.internal.services.K webViewChecker, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new C4789d(scope, timeout, adUnitId, recreateXenossAdLoader, com.moloco.sdk.internal.ortb.d.a(), r.a(), adFormatType, webViewChecker, metricsRecorder, function0);
    }

    public static final com.moloco.sdk.internal.t a(AdFormatType adFormatType, C4782e bid, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        if (adFormatType != AdFormatType.INLINE_ADAPTIVE_BANNER && adFormatType != AdFormatType.ANCHORED_ADAPTIVE_BANNER) {
            return null;
        }
        if (bid.getW() != null && bid.getH() != null) {
            return null;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        if (bid.getW() == null) {
            createListBuilder.add("w");
        }
        if (bid.getH() == null) {
            createListBuilder.add("h");
        }
        return com.moloco.sdk.internal.u.a(adUnitId, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.o.d, MapsKt.mapOf(TuplesKt.to("missing_fields", CollectionsKt.joinToString$default(CollectionsKt.build(createListBuilder), ",", null, null, 0, null, null, 62, null))));
    }
}
