package com.paypal.oslo.feature.paypalassistant.api.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/api/util/MarkdownDetector;", "", "<init>", "()V", "", "text", "", "containsMarkdown", "(Ljava/lang/String;)Z", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getInputFormats", "getOutputFormats", "getInputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getOutputStallDuration", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "getOutputSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MarkdownDetector {
    public static final com.paypal.oslo.feature.paypalassistant.api.util.MarkdownDetector INSTANCE = new com.paypal.oslo.feature.paypalassistant.api.util.MarkdownDetector();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("^#{1,6}\\s+.+", kotlin.text.RegexOption.MULTILINE);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex("\\*\\*.+?\\*\\*|__.+?__");

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("(?<!\\*)\\*(?!\\*)([^*]+?)(?<!\\*)\\*(?!\\*)");

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("(?<!_)_(?!_)([^_]+?)(?<!_)_(?!_)");

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("\\[.+?\\]\\(.+?\\)");

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoSizesFor = new kotlin.text.Regex("^[\\s]*[-*]\\s+.+", kotlin.text.RegexOption.MULTILINE);

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final kotlin.text.Regex getOutputFormats = new kotlin.text.Regex("^[\\s]*\\d+\\.\\s+.+", kotlin.text.RegexOption.MULTILINE);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlin.text.Regex getInputFormats = new kotlin.text.Regex("`[^`]+`");

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlin.text.Regex getOutputMinFrameDuration = new kotlin.text.Regex("^[\\s]*(-{3,}|\\*{3,})[\\s]*$", kotlin.text.RegexOption.MULTILINE);

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private static final kotlin.text.Regex getInputSizeshNQ4ISI = new kotlin.text.Regex("<u>.+?</u>");

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlin.text.Regex getOutputSizes = new kotlin.text.Regex("^[\\s]*>.+", kotlin.text.RegexOption.MULTILINE);
    public static final int $stable = 8;

    private MarkdownDetector() {
    }

    public final boolean containsMarkdown(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        java.lang.String str = text;
        if (kotlin.text.StringsKt.isBlank(str)) {
            return false;
        }
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, false, 2, (java.lang.Object) null) || getHighSpeedVideoFpsRangesFor.containsMatchIn(str) || getHighSpeedVideoFpsRanges.containsMatchIn(str) || getHighResolutionOutputSizeshNQ4ISI.containsMatchIn(str) || getHighSpeedVideoSizes.containsMatchIn(str) || Camera2StreamConfigurationMap.containsMatchIn(str) || getHighSpeedVideoSizesFor.containsMatchIn(str) || getOutputFormats.containsMatchIn(str) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "```", false, 2, (java.lang.Object) null) || getInputFormats.containsMatchIn(str) || getOutputMinFrameDuration.containsMatchIn(str) || getInputSizeshNQ4ISI.containsMatchIn(str) || getOutputSizes.containsMatchIn(str);
    }
}
