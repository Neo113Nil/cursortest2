package n;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final C0802p f6171a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = C0801o.f6168q;
        } else {
            int i3 = C0802p.f6169b;
        }
    }

    public r(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f6171a = new C0801o(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f6171a = new C0800n(this, windowInsets);
        } else if (i2 >= 28) {
            this.f6171a = new C0798l(this, windowInsets);
        } else {
            this.f6171a = new C0797k(this, windowInsets);
        }
    }

    public static r a(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        r rVar = new r(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i2 = AbstractC0790d.f6147a;
            r a2 = AbstractC0789c.a(view);
            C0802p c0802p = rVar.f6171a;
            c0802p.o(a2);
            c0802p.d(view.getRootView());
        }
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return Objects.equals(this.f6171a, ((r) obj).f6171a);
    }

    public final int hashCode() {
        C0802p c0802p = this.f6171a;
        if (c0802p == null) {
            return 0;
        }
        return c0802p.hashCode();
    }

    public r() {
        this.f6171a = new C0802p(this);
    }
}
