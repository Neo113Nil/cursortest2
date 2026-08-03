package C;

/* loaded from: classes.dex */
public abstract class o {
    public static int a(android.widget.TextView textView) {
        return textView.getBreakStrategy();
    }

    public static android.content.res.ColorStateList b(android.widget.TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    public static android.graphics.PorterDuff.Mode c(android.widget.TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    public static int d(android.widget.TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static void e(android.widget.TextView textView, int i2) {
        textView.setBreakStrategy(i2);
    }

    public static void f(android.widget.TextView textView, android.content.res.ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void g(android.widget.TextView textView, android.graphics.PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void h(android.widget.TextView textView, int i2) {
        textView.setHyphenationFrequency(i2);
    }
}
