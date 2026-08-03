package com.fyber.inneractive.sdk.widget;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f4367a = android.graphics.PorterDuff.Mode.SRC_IN;

    public static void a(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable;
        int i = android.os.Build.VERSION.SDK_INT;
        imageView.setImageTintList(colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
