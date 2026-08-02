package com.google.android.material.drawable;

/* loaded from: classes8.dex */
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    private DrawableUtils() {
    }

    public static void setTint(android.graphics.drawable.Drawable drawable, int i) {
        if (i != 0) {
            androidx.core.graphics.drawable.DrawableCompat.setTint(drawable, i);
        } else {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, null);
        }
    }

    public static android.graphics.PorterDuffColorFilter updateTintFilter(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static android.util.AttributeSet parseDrawableXml(android.content.Context context, int i, java.lang.CharSequence charSequence) {
        int next;
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            }
            if (!android.text.TextUtils.equals(xml.getName(), charSequence)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Must have a <");
                sb.append((java.lang.Object) charSequence);
                sb.append("> start tag");
                throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
            }
            return android.util.Xml.asAttributeSet(xml);
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can't load badge resource ID #0x");
            sb2.append(java.lang.Integer.toHexString(i));
            android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException(sb2.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    public static void setRippleDrawableRadius(android.graphics.drawable.RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    public static android.graphics.drawable.Drawable createTintableDrawableIfNeeded(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    public static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    private static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z) {
                drawable.mutate();
            }
            return drawable;
        }
        android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
        if (mode != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(mutate, mode);
        }
        return mutate;
    }

    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }

    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1) {
            i = getTopLayerIntrinsicWidth(drawable, drawable2);
        }
        if (i2 == -1) {
            i2 = getTopLayerIntrinsicHeight(drawable, drawable2);
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    private static int getTopLayerIntrinsicWidth(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    private static int getTopLayerIntrinsicHeight(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    public static int[] getCheckedState(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static int[] getUncheckedState(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    public static void setOutlineToPath(android.graphics.Outline outline, android.graphics.Path path) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            com.google.android.material.drawable.DrawableUtils.OutlineCompatR.setPath(outline, path);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            try {
                com.google.android.material.drawable.DrawableUtils.OutlineCompatL.setConvexPath(outline, path);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            com.google.android.material.drawable.DrawableUtils.OutlineCompatL.setConvexPath(outline, path);
        }
    }

    public static android.content.res.ColorStateList getColorStateListOrNull(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            return android.content.res.ColorStateList.valueOf(((android.graphics.drawable.ColorDrawable) drawable).getColor());
        }
        if (android.os.Build.VERSION.SDK_INT < 29 || !(drawable instanceof android.graphics.drawable.ColorStateListDrawable)) {
            return null;
        }
        return ((android.graphics.drawable.ColorStateListDrawable) drawable).getColorStateList();
    }

    static class OutlineCompatR {
        private OutlineCompatR() {
        }

        static void setPath(android.graphics.Outline outline, android.graphics.Path path) {
            outline.setPath(path);
        }
    }

    static class OutlineCompatL {
        private OutlineCompatL() {
        }

        static void setConvexPath(android.graphics.Outline outline, android.graphics.Path path) {
            outline.setConvexPath(path);
        }
    }
}
