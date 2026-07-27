package x0;

import com.google.android.gms.internal.play_billing.i2;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248a {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f10538a;

    public C1248a(i2 i2Var) {
        this.f10538a = i2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1248a)) {
            return false;
        }
        C1248a c1248a = (C1248a) obj;
        c1248a.getClass();
        if (!this.f10538a.equals(c1248a.f10538a)) {
            return false;
        }
        Object obj2 = c.f10540a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return c.f10540a.hashCode() ^ (((1000003 * 1000003) ^ this.f10538a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f10538a + ", priority=" + c.f10540a + "}";
    }
}
