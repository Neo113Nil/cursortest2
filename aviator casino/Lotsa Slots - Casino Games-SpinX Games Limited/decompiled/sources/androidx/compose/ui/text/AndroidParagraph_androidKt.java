package androidx.compose.ui.text;

/* compiled from: AndroidParagraph.android.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m3822toLayoutAlignaXe7zB0(int i) {
        if (androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m4363getLefte0LSkKk())) {
            return 3;
        }
        if (androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m4364getRighte0LSkKk())) {
            return 4;
        }
        if (androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk())) {
            return 2;
        }
        return (!androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk()) && androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(i, androidx.compose.ui.text.style.TextAlign.INSTANCE.m4361getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m3824toLayoutHyphenationFrequency3fSNIE(int i) {
        if (androidx.compose.ui.text.style.Hyphens.m4266equalsimpl0(i, androidx.compose.ui.text.style.Hyphens.INSTANCE.m4270getAutovmbZdU8())) {
            return android.os.Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        androidx.compose.ui.text.style.Hyphens.m4266equalsimpl0(i, androidx.compose.ui.text.style.Hyphens.INSTANCE.m4271getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m3823toLayoutBreakStrategyxImikfE(int i) {
        if (androidx.compose.ui.text.style.LineBreak.Strategy.m4297equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m4303getSimplefcGXIks())) {
            return 0;
        }
        if (androidx.compose.ui.text.style.LineBreak.Strategy.m4297equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m4302getHighQualityfcGXIks())) {
            return 1;
        }
        return androidx.compose.ui.text.style.LineBreak.Strategy.m4297equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m4301getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m3825toLayoutLineBreakStylehpcqdu8(int i) {
        if (androidx.compose.ui.text.style.LineBreak.Strictness.m4308equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m4312getDefaultusljTpc())) {
            return 0;
        }
        if (androidx.compose.ui.text.style.LineBreak.Strictness.m4308equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m4313getLooseusljTpc())) {
            return 1;
        }
        if (androidx.compose.ui.text.style.LineBreak.Strictness.m4308equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m4314getNormalusljTpc())) {
            return 2;
        }
        return androidx.compose.ui.text.style.LineBreak.Strictness.m4308equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m4315getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m3826toLayoutLineBreakWordStylewPN0Rpw(int i) {
        return (!androidx.compose.ui.text.style.LineBreak.WordBreak.m4320equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.WordBreak.INSTANCE.m4324getDefaultjp8hJ3c()) && androidx.compose.ui.text.style.LineBreak.WordBreak.m4320equalsimpl0(i, androidx.compose.ui.text.style.LineBreak.WordBreak.INSTANCE.m4325getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(androidx.compose.ui.text.android.TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(androidx.compose.ui.text.TextStyle textStyle, boolean z) {
        return (!z || androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(textStyle.m4000getLetterSpacingXSAIIZE(), androidx.compose.ui.unit.TextUnitKt.getSp(0)) || androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(textStyle.m4000getLetterSpacingXSAIIZE(), androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE()) || androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(textStyle.m4005getTextAligne0LSkKk(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk()) || androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(textStyle.m4005getTextAligne0LSkKk(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk()) || androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(textStyle.m4005getTextAligne0LSkKk(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m4362getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence attachIndentationFixSpan(java.lang.CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        android.text.SpannableString spannableString = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableString(charSequence);
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setSpan(spannableString, new androidx.compose.ui.text.android.style.IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }
}
