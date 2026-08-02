package A5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hd.C6915b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.C10435g;
import w5.EnumC10434f;

/* loaded from: classes8.dex */
public final class m {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (n5.f.a(r9, r1, kotlin.jvm.internal.Intrinsics.d(r7, r2) ? r0.getWidth() : A5.k.h(r7.d(), r8), kotlin.jvm.internal.Intrinsics.d(r7, r2) ? r0.getHeight() : A5.k.h(r7.c(), r8), r8) == 1.0d) goto L24;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(@NotNull Drawable drawable, @NotNull Bitmap.Config config, @NotNull C10435g c10435g, @NotNull EnumC10434f enumC10434f, boolean z11) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || config == Bitmap.Config.HARDWARE) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z11) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    C10435g c10435g2 = C10435g.f103580c;
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        int i11 = k.f430d;
        boolean z12 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z12 ? (BitmapDrawable) mutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? mutate.getIntrinsicWidth() : bitmap2.getWidth();
        int i12 = UserVerificationMethods.USER_VERIFY_NONE;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z12 ? (BitmapDrawable) mutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? mutate.getIntrinsicHeight() : bitmap.getHeight();
        if (intrinsicHeight > 0) {
            i12 = intrinsicHeight;
        }
        C10435g c10435g3 = C10435g.f103580c;
        double a11 = n5.f.a(intrinsicWidth, i12, Intrinsics.d(c10435g, c10435g3) ? intrinsicWidth : k.h(c10435g.d(), enumC10434f), Intrinsics.d(c10435g, c10435g3) ? i12 : k.h(c10435g.c(), enumC10434f), enumC10434f);
        int b11 = C6915b.b(intrinsicWidth * a11);
        int b12 = C6915b.b(a11 * i12);
        if (config == null || config == Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(b11, b12, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i13 = bounds.left;
        int i14 = bounds.top;
        int i15 = bounds.right;
        int i16 = bounds.bottom;
        mutate.setBounds(0, 0, b11, b12);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i13, i14, i15, i16);
        return createBitmap;
    }
}
