package com.paypal.oslo.core.permission.ui.controller;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1", f = "RememberPermissionController.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 135, 144, 152, 175}, m = "requestPermission", n = {"request", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "request", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "shouldShowRationale", "request", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "shouldShowRationale", "hasRequestedBefore", "request", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "shouldShowRationale", "hasRequestedBefore", "granted", "request", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "shouldShowRationale", "hasRequestedBefore", "granted", "rationaleAfter"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 142, 150, 153, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "Z$1", "L$0", "L$1", "Z$0", "Z$1", "Z$2", "L$0", "L$1", "Z$0", "Z$1", "Z$2", "Z$3"}, v = 2)
/* loaded from: classes10.dex */
final class RememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1 getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    boolean getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.requestPermission(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1(com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1 rememberPermissionControllerKt$rememberPermissionController$1$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = rememberPermissionControllerKt$rememberPermissionController$1$1;
    }
}
