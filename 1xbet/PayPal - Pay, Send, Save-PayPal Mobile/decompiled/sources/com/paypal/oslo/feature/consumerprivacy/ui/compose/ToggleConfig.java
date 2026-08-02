package com.paypal.oslo.feature.consumerprivacy.ui.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001a\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/compose/ToggleConfig;", "", "", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ZZLjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class ToggleConfig {
    final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final boolean getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoSizes;
    final java.lang.String getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    private ToggleConfig(java.lang.String str, boolean z, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, boolean z2, boolean z3, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = z2;
        this.Camera2StreamConfigurationMap = z3;
        this.getOutputMinFrameDuration = str2;
    }

    public /* synthetic */ ToggleConfig(java.lang.String str, boolean z, kotlin.jvm.functions.Function1 function1, boolean z2, boolean z3, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, function1, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? "" : str2);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z2 = this.getHighSpeedVideoFpsRanges;
        boolean z3 = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getOutputMinFrameDuration;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ToggleConfig(getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(z);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(function1);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(z2);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(z3);
        sb.append(", getOutputMinFrameDuration=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes)) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap)) * 31) + this.getOutputMinFrameDuration.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.consumerprivacy.ui.compose.ToggleConfig)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.ui.compose.ToggleConfig toggleConfig = (com.paypal.oslo.feature.consumerprivacy.ui.compose.ToggleConfig) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, toggleConfig.getHighSpeedVideoFpsRangesFor) && this.getHighSpeedVideoSizes == toggleConfig.getHighSpeedVideoSizes && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, toggleConfig.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRanges == toggleConfig.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == toggleConfig.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, toggleConfig.getOutputMinFrameDuration);
    }
}
