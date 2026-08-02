package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/RichTextElement;", "", "Lkotlin/ranges/IntRange;", "p0", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/ElementType;", "p1", "", "p2", "p3", "p4", "<init>", "(Lkotlin/ranges/IntRange;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/ElementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lkotlin/ranges/IntRange;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/ElementType;", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class RichTextElement {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final kotlin.ranges.IntRange getHighSpeedVideoFpsRanges;
    final com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.lang.String Camera2StreamConfigurationMap;
    final java.lang.String getHighSpeedVideoSizes;

    private RichTextElement(kotlin.ranges.IntRange intRange, com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType elementType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = intRange;
        this.getHighResolutionOutputSizeshNQ4ISI = elementType;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = str2;
        this.Camera2StreamConfigurationMap = str3;
    }

    public /* synthetic */ RichTextElement(kotlin.ranges.IntRange intRange, com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType elementType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(intRange, elementType, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public final java.lang.String toString() {
        kotlin.ranges.IntRange intRange = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType elementType = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        java.lang.String str3 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RichTextElement(getHighSpeedVideoFpsRanges=");
        sb.append(intRange);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(elementType);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(str2);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode2 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode3 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        java.lang.String str = this.getHighSpeedVideoSizes;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement richTextElement = (com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, richTextElement.getHighSpeedVideoFpsRanges) && this.getHighResolutionOutputSizeshNQ4ISI == richTextElement.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, richTextElement.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, richTextElement.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, richTextElement.Camera2StreamConfigurationMap);
    }
}
