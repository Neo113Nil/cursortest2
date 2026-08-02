package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/PorterDuffXfermode;", "toXfermode", "(Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffXfermode;", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroid/graphics/PorterDuffColorFilter;", "toColorFilter", "(Landroid/graphics/PorterDuff$Mode;I)Landroid/graphics/PorterDuffColorFilter;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PorterDuffKt {
    public static final android.graphics.PorterDuffXfermode toXfermode(android.graphics.PorterDuff.Mode mode) {
        return new android.graphics.PorterDuffXfermode(mode);
    }

    public static final android.graphics.PorterDuffColorFilter toColorFilter(android.graphics.PorterDuff.Mode mode, int i) {
        return new android.graphics.PorterDuffColorFilter(i, mode);
    }
}
