package androidx.core.widget;

/* loaded from: classes2.dex */
public final class CheckedTextViewCompat {
    private CheckedTextViewCompat() {
    }

    public static void setCheckMarkTintList(android.widget.CheckedTextView checkedTextView, android.content.res.ColorStateList colorStateList) {
        androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintList(checkedTextView, colorStateList);
    }

    public static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView checkedTextView) {
        return androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintList(checkedTextView);
    }

    public static void setCheckMarkTintMode(android.widget.CheckedTextView checkedTextView, android.graphics.PorterDuff.Mode mode) {
        androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintMode(checkedTextView, mode);
    }

    public static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView checkedTextView) {
        return androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintMode(checkedTextView);
    }

    public static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void setCheckMarkTintList(android.widget.CheckedTextView checkedTextView, android.content.res.ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        static void setCheckMarkTintMode(android.widget.CheckedTextView checkedTextView, android.graphics.PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }

        static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }
    }
}
