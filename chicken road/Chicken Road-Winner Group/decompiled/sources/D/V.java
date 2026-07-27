package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final T f223a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i3 = S.f220q;
        } else {
            int i4 = T.f221b;
        }
    }

    public V(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f223a = new S(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f223a = new P(this, windowInsets);
        } else if (i3 >= 28) {
            this.f223a = new O(this, windowInsets);
        } else {
            this.f223a = new N(this, windowInsets);
        }
    }

    public static V a(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        V v3 = new V(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = z.f259a;
            V a3 = r.a(view);
            T t3 = v3.f223a;
            t3.o(a3);
            t3.d(view.getRootView());
        }
        return v3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        return Objects.equals(this.f223a, ((V) obj).f223a);
    }

    public final int hashCode() {
        T t3 = this.f223a;
        if (t3 == null) {
            return 0;
        }
        return t3.hashCode();
    }

    public V() {
        this.f223a = new T(this);
    }
}
