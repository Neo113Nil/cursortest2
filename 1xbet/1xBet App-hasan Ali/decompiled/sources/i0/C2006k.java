package i0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import n.AbstractC2107A;

/* renamed from: i0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2006k {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f17283a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17284b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17285c;

    public C2006k(int i, long j5) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1996a.d();
            porterDuffColorFilter = AbstractC1996a.c(F.u(j5), F.q(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(F.u(j5), F.y(i));
        }
        this.f17283a = porterDuffColorFilter;
        this.f17284b = j5;
        this.f17285c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2006k)) {
            return false;
        }
        C2006k c2006k = (C2006k) obj;
        if (p.c(this.f17284b, c2006k.f17284b)) {
            return this.f17285c == c2006k.f17285c;
        }
        return false;
    }

    public final int hashCode() {
        return (p.i(this.f17284b) * 31) + this.f17285c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC2107A.z(this.f17284b, sb, ", blendMode=");
        sb.append((Object) F.z(this.f17285c));
        sb.append(')');
        return sb.toString();
    }
}
