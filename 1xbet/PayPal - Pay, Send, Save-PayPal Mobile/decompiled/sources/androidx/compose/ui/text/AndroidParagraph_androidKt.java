package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u000e\u001a\u001f\u0010\n\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\n\u0010\u0012\u001a\u0013\u0010\u0003\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b\u0003\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0002*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "p0", "", "getHighSpeedVideoFpsRanges", "(I)I", "Landroidx/compose/ui/text/style/Hyphens;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/android/TextLayout;", "(Landroidx/compose/ui/text/android/TextLayout;I)I", "Landroidx/compose/ui/text/TextStyle;", "", "p1", "(Landroidx/compose/ui/text/TextStyle;Z)Z", "", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Landroidx/compose/ui/text/TextGranularity;", "getHighSpeedVideoSizesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(int i) {
        if (androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk())) {
            return 3;
        }
        if (androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8447getRighte0LSkKk())) {
            return 4;
        }
        if (androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk())) {
            return 2;
        }
        return (!androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()) && androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoSizes(int i) {
        if (androidx.compose.ui.text.style.Hyphens.m8331equalsimpl0(i, androidx.compose.ui.text.style.Hyphens.INSTANCE.m8335getAutovmbZdU8())) {
            return android.os.Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        androidx.compose.ui.text.style.Hyphens.m8331equalsimpl0(i, androidx.compose.ui.text.style.Hyphens.INSTANCE.m8336getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRangesFor(int i) {
        if (androidx.compose.ui.text.style.LineBreak.Strategy.m8365equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m8371getSimplefcGXIks())) {
            return 0;
        }
        if (androidx.compose.ui.text.style.LineBreak.Strategy.m8365equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m8370getHighQualityfcGXIks())) {
            return 1;
        }
        return androidx.compose.ui.text.style.LineBreak.Strategy.m8365equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m8369getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(int i) {
        if (androidx.compose.ui.text.style.LineBreak.Strictness.m8376equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m8380getDefaultusljTpc())) {
            return 0;
        }
        if (androidx.compose.ui.text.style.LineBreak.Strictness.m8376equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m8381getLooseusljTpc())) {
            return 1;
        }
        if (androidx.compose.ui.text.style.LineBreak.Strictness.m8376equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m8382getNormalusljTpc())) {
            return 2;
        }
        return androidx.compose.ui.text.style.LineBreak.Strictness.m8376equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m8383getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return (!androidx.compose.ui.text.style.LineBreak.WordBreak.m8388equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.WordBreak.INSTANCE.m8392getDefaultjp8hJ3c()) && androidx.compose.ui.text.style.LineBreak.WordBreak.m8388equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.WordBreak.INSTANCE.m8393getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(androidx.compose.ui.text.android.TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.ui.text.TextStyle textStyle, boolean z) {
        return (!z || androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(textStyle.m8075getLetterSpacingXSAIIZE(), androidx.compose.ui.unit.TextUnitKt.getSp(0)) || androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(textStyle.m8075getLetterSpacingXSAIIZE(), androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE()) || androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(textStyle.m8080getTextAligne0LSkKk(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk()) || androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(textStyle.m8080getTextAligne0LSkKk(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()) || androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(textStyle.m8080getTextAligne0LSkKk(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8445getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        android.text.SpannableString spannableString = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new android.text.SpannableString(charSequence);
        }
        if (!androidx.compose.ui.text.android.SpannedExtensions_androidKt.hasSpan(spannableString, androidx.compose.ui.text.android.style.IndentationFixSpan.class)) {
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setSpan(spannableString, new androidx.compose.ui.text.android.style.IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoSizesFor(int i) {
        return (!androidx.compose.ui.text.TextGranularity.m7998equalsimpl0(i, androidx.compose.ui.text.TextGranularity.INSTANCE.m8002getCharacterDRrd7Zo()) && androidx.compose.ui.text.TextGranularity.m7998equalsimpl0(i, androidx.compose.ui.text.TextGranularity.INSTANCE.m8003getWordDRrd7Zo())) ? 1 : 0;
    }
}
