package a2;

import e2.AbstractC0293h;
import java.util.List;

/* renamed from: a2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1842a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1843b;

    public C0112h(String str, boolean z3) {
        this.f1842a = str;
        this.f1843b = z3;
    }

    public final List a() {
        return AbstractC0293h.S(this.f1842a, Boolean.valueOf(this.f1843b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0112h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return X0.a.q(a(), ((C0112h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f1842a + ", useDataStore=" + this.f1843b + ")";
    }
}
