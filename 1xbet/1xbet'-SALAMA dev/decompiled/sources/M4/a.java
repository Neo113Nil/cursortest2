package M4;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4579b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f4578a = str;
        this.f4579b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4578a.equals(aVar.f4578a) && this.f4579b.equals(aVar.f4579b);
    }

    public final int hashCode() {
        return ((this.f4578a.hashCode() ^ 1000003) * 1000003) ^ this.f4579b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f4578a + ", usedDates=" + this.f4579b + "}";
    }
}
