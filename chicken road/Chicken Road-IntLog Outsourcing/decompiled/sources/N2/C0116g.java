package N2;

import a.AbstractC0169a;
import g4.AbstractC0466k;
import java.util.List;

/* renamed from: N2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2087b;

    public C0116g(String str, boolean z) {
        this.f2086a = str;
        this.f2087b = z;
    }

    public final List a() {
        return AbstractC0466k.A0(this.f2086a, Boolean.valueOf(this.f2087b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0116g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC0169a.i(a(), ((C0116g) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f2086a + ", useDataStore=" + this.f2087b + ")";
    }
}
