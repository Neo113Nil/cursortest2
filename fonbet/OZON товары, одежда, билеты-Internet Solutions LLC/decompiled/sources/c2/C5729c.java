package c2;

import D1.AbstractC2810k0;
import D1.H;
import android.view.View;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;
import w1.InterfaceC10406a;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5729c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f56375a = new a();

    /* renamed from: c2.c$a */
    public static final class a implements InterfaceC10406a {
    }

    public static final void b(View view, H h11) {
        long y11 = ((AbstractC2810k0) h11.D()).y(0L);
        int round = Math.round(C7459e.g(y11));
        int round2 = Math.round(C7459e.h(y11));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }

    public static final float c(int i11) {
        return i11 * (-1);
    }

    public static final float d(float f7) {
        return f7 * (-1.0f);
    }

    public static final int e(int i11) {
        return i11 == 0 ? 1 : 2;
    }
}
