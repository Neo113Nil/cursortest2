package W1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3392a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3393b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f3392a = str;
        this.f3393b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3392a.equals(aVar.f3392a) && this.f3393b.equals(aVar.f3393b);
    }

    public final int hashCode() {
        return ((this.f3392a.hashCode() ^ 1000003) * 1000003) ^ this.f3393b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f3392a + ", usedDates=" + this.f3393b + "}";
    }
}
