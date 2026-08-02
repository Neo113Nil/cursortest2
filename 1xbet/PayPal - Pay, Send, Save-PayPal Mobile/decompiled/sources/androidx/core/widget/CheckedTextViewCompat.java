package androidx.core.widget;

/* loaded from: classes3.dex */
public final class CheckedTextViewCompat {
    private CheckedTextViewCompat() {
    }

    public static void setCheckMarkTintList(android.widget.CheckedTextView checkedTextView, android.content.res.ColorStateList colorStateList) {
        checkedTextView.setCheckMarkTintList(colorStateList);
    }

    public static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintList();
    }

    public static void setCheckMarkTintMode(android.widget.CheckedTextView checkedTextView, android.graphics.PorterDuff.Mode mode) {
        checkedTextView.setCheckMarkTintMode(mode);
    }

    public static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintMode();
    }

    @androidx.annotation.ReplaceWith(expression = "textView.getCheckMarkDrawable()")
    @java.lang.Deprecated
    public static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }
}
