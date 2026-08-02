package com.paypal.oslo.feature.inappcheckout.ui.error.screen;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/screen/ButtonConfig;", "", "", "p0", "Lcom/paypal/pds/components/ButtonStyle;", "p1", "", "p2", "Lkotlin/Function0;", "", "p3", "<init>", "(ILcom/paypal/pds/components/ButtonStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/pds/components/ButtonStyle;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class ButtonConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final int getHighSpeedVideoFpsRanges;
    final com.paypal.pds.components.ButtonStyle getHighSpeedVideoSizes;

    public ButtonConfig(int i, com.paypal.pds.components.ButtonStyle buttonStyle, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = buttonStyle;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    public final java.lang.String toString() {
        int i = this.getHighSpeedVideoFpsRanges;
        com.paypal.pds.components.ButtonStyle buttonStyle = this.getHighSpeedVideoSizes;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ButtonConfig(getHighSpeedVideoFpsRanges=");
        sb.append(i);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(buttonStyle);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig buttonConfig = (com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig) p0;
        return this.getHighSpeedVideoFpsRanges == buttonConfig.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, buttonConfig.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, buttonConfig.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, buttonConfig.getHighSpeedVideoFpsRangesFor);
    }
}
