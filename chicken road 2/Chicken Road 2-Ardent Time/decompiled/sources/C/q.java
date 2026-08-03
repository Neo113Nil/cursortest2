package C;

/* loaded from: classes.dex */
public abstract class q {
    public static java.lang.String[] b(android.icu.text.DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static android.text.PrecomputedText.Params c(android.widget.TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void d(android.widget.TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }

    public static java.lang.CharSequence a(android.text.PrecomputedText precomputedText) {
        return precomputedText;
    }
}
