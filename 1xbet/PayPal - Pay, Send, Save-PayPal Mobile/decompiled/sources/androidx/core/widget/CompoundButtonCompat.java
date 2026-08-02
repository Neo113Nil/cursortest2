package androidx.core.widget;

/* loaded from: classes3.dex */
public final class CompoundButtonCompat {
    private CompoundButtonCompat() {
    }

    public static void setButtonTintList(android.widget.CompoundButton compoundButton, android.content.res.ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static void setButtonTintMode(android.widget.CompoundButton compoundButton, android.graphics.PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }

    public static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }
}
