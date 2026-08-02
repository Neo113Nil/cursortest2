package androidx.core.widget;

/* loaded from: classes3.dex */
public interface TintableImageSourceView {
    android.content.res.ColorStateList getSupportImageTintList();

    android.graphics.PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(android.content.res.ColorStateList colorStateList);

    void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode);
}
