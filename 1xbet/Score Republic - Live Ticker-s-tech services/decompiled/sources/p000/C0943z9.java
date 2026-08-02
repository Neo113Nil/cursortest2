package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: z9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0943z9 {

    /* JADX INFO: renamed from: a */
    public final String f9689a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9690b;

    public C0943z9(String str, ArrayList arrayList) {
        if (str == null) {
            C0270h1.m2192h("Null userAgent");
            throw null;
        }
        this.f9689a = str;
        this.f9690b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0943z9)) {
            return false;
        }
        C0943z9 c0943z9 = (C0943z9) obj;
        return this.f9689a.equals(c0943z9.f9689a) && this.f9690b.equals(c0943z9.f9690b);
    }

    public final int hashCode() {
        return this.f9690b.hashCode() ^ ((this.f9689a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f9689a + ", usedDates=" + this.f9690b + "}";
    }
}
