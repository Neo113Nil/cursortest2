package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\f\u0010\rR#\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000e\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\n8\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/screens/GranularContentCallbacks;", "", "Lkotlin/Function2;", "", "", "", "p0", "Lcom/paypal/oslo/feature/consumerprivacy/ui/screens/GranularMoneyIdentifierCallbacks;", "p1", "p2", "Lkotlin/Function1;", "p3", "<init>", "(Lkotlin/jvm/functions/Function2;Lcom/paypal/oslo/feature/consumerprivacy/ui/screens/GranularMoneyIdentifierCallbacks;Lcom/paypal/oslo/feature/consumerprivacy/ui/screens/GranularMoneyIdentifierCallbacks;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/consumerprivacy/ui/screens/GranularMoneyIdentifierCallbacks;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class GranularContentCallbacks {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final com.paypal.oslo.feature.consumerprivacy.ui.screens.GranularMoneyIdentifierCallbacks getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.paypal.oslo.feature.consumerprivacy.ui.screens.GranularMoneyIdentifierCallbacks getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public GranularContentCallbacks(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> function2, com.paypal.oslo.feature.consumerprivacy.ui.screens.GranularMoneyIdentifierCallbacks granularMoneyIdentifierCallbacks, com.paypal.oslo.feature.consumerprivacy.ui.screens.GranularMoneyIdentifierCallbacks granularMoneyIdentifierCallbacks2, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(granularMoneyIdentifierCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(granularMoneyIdentifierCallbacks2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizes = granularMoneyIdentifierCallbacks;
        this.getHighSpeedVideoFpsRanges = granularMoneyIdentifierCallbacks2;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
