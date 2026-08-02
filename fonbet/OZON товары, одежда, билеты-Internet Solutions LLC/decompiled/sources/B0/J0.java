package B0;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;
import v1.C10176a;
import v1.C10179d;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f1412a = new a();

    public static final class a {
        public final F0 a(@NotNull KeyEvent keyEvent) {
            F0 f02 = null;
            if (C10179d.f(keyEvent) && C10179d.d(keyEvent)) {
                long a11 = C10179d.a(keyEvent);
                if (C10176a.n(a11, Z0.i())) {
                    f02 = F0.SELECT_LINE_LEFT;
                } else if (C10176a.n(a11, Z0.j())) {
                    f02 = F0.SELECT_LINE_RIGHT;
                } else if (C10176a.n(a11, Z0.k())) {
                    f02 = F0.SELECT_HOME;
                } else if (C10176a.n(a11, Z0.h())) {
                    f02 = F0.SELECT_END;
                }
            } else if (C10179d.d(keyEvent)) {
                long a12 = C10179d.a(keyEvent);
                if (C10176a.n(a12, Z0.i())) {
                    f02 = F0.LINE_LEFT;
                } else if (C10176a.n(a12, Z0.j())) {
                    f02 = F0.LINE_RIGHT;
                } else if (C10176a.n(a12, Z0.k())) {
                    f02 = F0.HOME;
                } else if (C10176a.n(a12, Z0.h())) {
                    f02 = F0.END;
                }
            }
            return f02 == null ? I0.a().a(keyEvent) : f02;
        }
    }

    @NotNull
    public static final a a() {
        return f1412a;
    }
}
