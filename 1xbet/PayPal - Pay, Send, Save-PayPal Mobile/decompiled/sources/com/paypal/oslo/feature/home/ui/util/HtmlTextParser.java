package com.paypal.oslo.feature.home.ui.util;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/util/HtmlTextParser;", "", "<init>", "()V", "", "htmlText", "", "Lcom/paypal/oslo/feature/home/ui/util/StyledTextSegment;", "parse", "(Ljava/lang/String;)Ljava/util/List;", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HtmlTextParser {
    public static final com.paypal.oslo.feature.home.ui.util.HtmlTextParser INSTANCE = new com.paypal.oslo.feature.home.ui.util.HtmlTextParser();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("<strong>(.*?)</strong>", kotlin.text.RegexOption.DOT_MATCHES_ALL);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("<br\\s*/?>|</br>", kotlin.text.RegexOption.IGNORE_CASE);
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex("</?[a-zA-Z][^>]*>|<[a-zA-Z][^>]*$|^[^<]*>");

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("<[^>]*$");
    public static final int $stable = 8;

    private HtmlTextParser() {
    }

    public final java.util.List<com.paypal.oslo.feature.home.ui.util.StyledTextSegment> parse(java.lang.String htmlText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlText, "");
        java.lang.String str = htmlText;
        if (!getHighSpeedVideoSizes.containsMatchIn(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String replace = getHighSpeedVideoFpsRangesFor.replace(str, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            int i = 0;
            for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(Camera2StreamConfigurationMap, replace, 0, 2, null)) {
                if (matchResult.getRange().getFirst() > i) {
                    java.lang.String substring = replace.substring(i, matchResult.getRange().getFirst());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    java.lang.String replace2 = getHighSpeedVideoFpsRanges.replace(substring, "");
                    if (replace2.length() > 0) {
                        arrayList.add(new com.paypal.oslo.feature.home.ui.util.StyledTextSegment.Plain(replace2));
                    }
                }
                java.lang.String replace3 = getHighSpeedVideoFpsRanges.replace(matchResult.getGroupValues().get(1), "");
                if (replace3.length() > 0) {
                    arrayList.add(new com.paypal.oslo.feature.home.ui.util.StyledTextSegment.Strong(replace3));
                }
                i = matchResult.getRange().getLast() + 1;
            }
            if (i < replace.length()) {
                java.lang.String substring2 = replace.substring(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                java.lang.String replace4 = getHighSpeedVideoFpsRanges.replace(substring2, "");
                if (replace4.length() > 0) {
                    arrayList.add(new com.paypal.oslo.feature.home.ui.util.StyledTextSegment.Plain(replace4));
                }
            }
            return arrayList;
        }
        java.lang.String replace5 = new kotlin.text.Regex("<[^>]*$").replace(new kotlin.text.Regex("<[^>]*>").replace(getHighSpeedVideoFpsRangesFor.replace(str, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE), ""), "");
        if (replace5.length() > 0) {
            return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.home.ui.util.StyledTextSegment.Plain(replace5));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
