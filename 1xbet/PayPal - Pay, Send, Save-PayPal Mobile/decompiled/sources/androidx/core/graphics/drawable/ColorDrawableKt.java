package androidx.core.graphics.drawable;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"", "Landroid/graphics/drawable/ColorDrawable;", "toDrawable", "(I)Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/Color;", "(Landroid/graphics/Color;)Landroid/graphics/drawable/ColorDrawable;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ColorDrawableKt {
    public static final android.graphics.drawable.ColorDrawable toDrawable(int i) {
        return new android.graphics.drawable.ColorDrawable(i);
    }

    public static final android.graphics.drawable.ColorDrawable toDrawable(android.graphics.Color color) {
        return new android.graphics.drawable.ColorDrawable(color.toArgb());
    }
}
