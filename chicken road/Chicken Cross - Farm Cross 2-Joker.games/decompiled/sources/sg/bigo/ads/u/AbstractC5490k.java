package sg.bigo.ads.u;

import android.view.View;
import android.widget.Button;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.T;

/* renamed from: sg.bigo.ads.u.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5490k {
    public static int a(int i) {
        return i;
    }

    public static void a(View view, Button button, int i, boolean[] zArr, boolean z, long j) {
        if (zArr == null || zArr.length == 0 || zArr.length < 2) {
            return;
        }
        T.a(button, i, new C5489j(zArr, view, z, j));
    }

    public static void a(View view, boolean z, boolean z2, boolean z3) {
        if (z3 && z && z2 && view != null) {
            AbstractC5140Q.a(view);
        }
    }
}
