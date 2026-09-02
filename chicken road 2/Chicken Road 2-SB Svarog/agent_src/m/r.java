package m;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final p f881a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = o.f878q;
        } else {
            int i3 = p.f879b;
        }
    }

    public r(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f881a = new o(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f881a = new n(this, windowInsets);
        } else if (i2 >= 28) {
            this.f881a = new l(this, windowInsets);
        } else {
            this.f881a = new k(this, windowInsets);
        }
    }

    public static r a(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        r rVar = new r(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i2 = d.f857a;
            r a2 = c.a(view);
            p pVar = rVar.f881a;
            pVar.o(a2);
            pVar.d(view.getRootView());
        }
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return Objects.equals(this.f881a, ((r) obj).f881a);
        }
        return false;
    }

    public final int hashCode() {
        p pVar = this.f881a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public r() {
        this.f881a = new p(this);
    }
}
