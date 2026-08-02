package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ValidatedDigitizedCardFields;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getOutputMinFrameDuration", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class ValidatedDigitizedCardFields {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;
    final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    public ValidatedDigitizedCardFields(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighSpeedVideoFpsRanges = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = str5;
        this.getInputSizeshNQ4ISI = str6;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        java.lang.String str3 = this.getHighSpeedVideoSizes;
        java.lang.String str4 = this.getHighSpeedVideoFpsRanges;
        java.lang.String str5 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str6 = this.getInputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidatedDigitizedCardFields(getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(str2);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(str3);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str4);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(str5);
        sb.append(", getInputSizeshNQ4ISI=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getInputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ValidatedDigitizedCardFields)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ValidatedDigitizedCardFields validatedDigitizedCardFields = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ValidatedDigitizedCardFields) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, validatedDigitizedCardFields.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, validatedDigitizedCardFields.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, validatedDigitizedCardFields.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, validatedDigitizedCardFields.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, validatedDigitizedCardFields.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, validatedDigitizedCardFields.getInputSizeshNQ4ISI);
    }
}
