package com.datadog.android.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/core/SdkReference;", "", "", "sdkInstanceName", "Lkotlin/Function1;", "Lcom/datadog/android/api/SdkCore;", "", "onSdkInstanceCaptured", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "get", "()Lcom/datadog/android/api/SdkCore;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SdkReference {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.datadog.android.api.SdkCore, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<com.datadog.android.api.SdkCore> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public SdkReference(java.lang.String str, kotlin.jvm.functions.Function1<? super com.datadog.android.api.SdkCore, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(null);
    }

    public /* synthetic */ SdkReference(java.lang.String str, com.datadog.android.core.SdkReference.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new kotlin.jvm.functions.Function1<com.datadog.android.api.SdkCore, kotlin.Unit>() { // from class: com.datadog.android.core.SdkReference.1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.SdkCore sdkCore) {
                Camera2StreamConfigurationMap(sdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.datadog.android.api.SdkCore sdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            }
        } : anonymousClass1);
    }

    public final com.datadog.android.api.SdkCore get() {
        com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoSizes.get();
        if (sdkCore == null) {
            return getHighSpeedVideoFpsRanges();
        }
        com.datadog.android.core.internal.DatadogCore datadogCore = sdkCore instanceof com.datadog.android.core.internal.DatadogCore ? (com.datadog.android.core.internal.DatadogCore) sdkCore : null;
        java.lang.Boolean valueOf = datadogCore != null ? java.lang.Boolean.valueOf(datadogCore.isActive$dd_sdk_android_core_release()) : null;
        if (valueOf == null || valueOf.booleanValue()) {
            return sdkCore;
        }
        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, sdkCore, null);
        return null;
    }

    private final com.datadog.android.api.SdkCore getHighSpeedVideoFpsRanges() {
        com.datadog.android.api.SdkCore sdkCore;
        synchronized (this.getHighSpeedVideoSizes) {
            sdkCore = this.getHighSpeedVideoSizes.get();
            if (sdkCore == null) {
                if (com.datadog.android.Datadog.isInitialized(this.getHighResolutionOutputSizeshNQ4ISI)) {
                    sdkCore = com.datadog.android.Datadog.getInstance(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighSpeedVideoSizes.set(sdkCore);
                    this.getHighSpeedVideoFpsRangesFor.invoke(sdkCore);
                } else {
                    sdkCore = null;
                }
            }
        }
        return sdkCore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkReference(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkReference() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
