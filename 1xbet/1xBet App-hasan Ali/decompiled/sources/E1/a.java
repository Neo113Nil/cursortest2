package E1;

import B1.h;
import P.C0315s;
import P.D;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.L;
import androidx.lifecycle.Y;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final D f1396a = new D(new h(1));

    public static Y a(C0315s c0315s) {
        Y y5 = (Y) c0315s.j(f1396a);
        if (y5 != null) {
            c0315s.X(1260196492);
            c0315s.q(false);
            return y5;
        }
        c0315s.X(1260197608);
        Y g5 = L.g((View) c0315s.j(AndroidCompositionLocals_androidKt.f));
        c0315s.q(false);
        return g5;
    }
}
