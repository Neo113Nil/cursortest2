package com.paypal.oslo.feature.verificationcapture.ui.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/util/LabelSize;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "LARGE", "XLARGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LabelSize {
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize LARGE;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize MEDIUM;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize SMALL;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize XLARGE;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private LabelSize(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize labelSize = new com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize("SMALL", 0);
        SMALL = labelSize;
        com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize labelSize2 = new com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize("MEDIUM", 1);
        MEDIUM = labelSize2;
        com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize labelSize3 = new com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize("LARGE", 2);
        LARGE = labelSize3;
        com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize labelSize4 = new com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize("XLARGE", 3);
        XLARGE = labelSize4;
        com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize[] labelSizeArr = {labelSize, labelSize2, labelSize3, labelSize4};
        getHighResolutionOutputSizeshNQ4ISI = labelSizeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(labelSizeArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.util.LabelSize> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
