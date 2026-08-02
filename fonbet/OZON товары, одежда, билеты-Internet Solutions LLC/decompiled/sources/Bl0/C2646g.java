package Bl0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.mlkit.common.sdkinternal.C5946b;
import n8.InterfaceC8452b;

/* renamed from: Bl0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2646g implements n8.e, n6.c {
    public static final long c(float f7, boolean z11) {
        return ((z11 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f7) << 32);
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return new C5946b();
    }

    @Override // n6.c
    public boolean b(Object obj, m6.f fVar) {
        Drawable drawable = (Drawable) obj;
        Drawable b11 = fVar.b();
        if (b11 == null) {
            b11 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{b11, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(300);
        fVar.c(transitionDrawable);
        return true;
    }
}
