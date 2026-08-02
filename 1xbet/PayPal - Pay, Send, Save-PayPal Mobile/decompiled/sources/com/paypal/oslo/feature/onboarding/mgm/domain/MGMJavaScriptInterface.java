package com.paypal.oslo.feature.onboarding.mgm.domain;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/mgm/domain/MGMJavaScriptInterface;", "", "Lkotlin/Function1;", "", "", "onShareInvite", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "message", "shareInvite", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Landroid/os/Handler;", "getHighSpeedVideoFpsRanges", "Landroid/os/Handler;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MGMJavaScriptInterface {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public MGMJavaScriptInterface(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @android.webkit.JavascriptInterface
    public final void shareInvite(final java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        this.getHighResolutionOutputSizeshNQ4ISI.post(new java.lang.Runnable() { // from class: com.paypal.oslo.feature.onboarding.mgm.domain.MGMJavaScriptInterface$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.paypal.oslo.feature.onboarding.mgm.domain.MGMJavaScriptInterface.this.getHighSpeedVideoFpsRangesFor.invoke(message);
            }
        });
    }
}
