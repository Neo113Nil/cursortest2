package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/composables/CurrencyConversionCallbacks;", "", "Lkotlin/Function1;", "", "", "p0", "Lkotlin/Function0;", "p1", "p2", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class CurrencyConversionCallbacks {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyConversionCallbacks(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = function0;
        this.Camera2StreamConfigurationMap = function02;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyConversionCallbacks(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(function1);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(function0);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(function02);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionCallbacks)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionCallbacks currencyConversionCallbacks = (com.paypal.oslo.feature.p2p.ui.review.composables.CurrencyConversionCallbacks) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, currencyConversionCallbacks.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, currencyConversionCallbacks.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, currencyConversionCallbacks.Camera2StreamConfigurationMap);
    }
}
