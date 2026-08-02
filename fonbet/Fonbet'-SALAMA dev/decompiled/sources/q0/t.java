package q0;

import android.os.Build;
import android.text.TextUtils;
import f5.AbstractC1102b;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public v f15784a;

    public t(String str, int i7, int i8) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f15784a = new v(str, i7, i8);
            return;
        }
        u uVar = new u(str, i7, i8);
        AbstractC1102b.o(i7, i8, str);
        this.f15784a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f15784a.equals(((t) obj).f15784a);
    }

    public final int hashCode() {
        return this.f15784a.hashCode();
    }
}
