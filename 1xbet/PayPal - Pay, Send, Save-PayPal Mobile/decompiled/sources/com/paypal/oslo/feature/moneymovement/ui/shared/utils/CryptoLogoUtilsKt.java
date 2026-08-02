package com.paypal.oslo.feature.moneymovement.ui.shared.utils;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080T¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"", "coinName", "cryptoLogoUrl", "(Ljava/lang/String;)Ljava/lang/String;", "CryptoLogoBaseUrl", "Ljava/lang/String;", "getCryptoLogoBaseUrl$annotations", "()V", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRanges", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CryptoLogoUtilsKt {
    public static final java.lang.String CryptoLogoBaseUrl = "https://www.paypalobjects.com/cryptocurrency/";
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex("\\s+");

    public static /* synthetic */ void getCryptoLogoBaseUrl$annotations() {
    }

    public static final java.lang.String cryptoLogoUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String replace = getHighSpeedVideoFpsRanges.replace(lowerCase, "-");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.paypalobjects.com/cryptocurrency/coin-");
        sb.append(replace);
        sb.append(".png");
        return sb.toString();
    }
}
