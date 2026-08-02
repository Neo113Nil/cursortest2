package P1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4701a;

    public a(boolean z3) {
        this.f4701a = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f4701a == aVar.f4701a;
    }

    public final int hashCode() {
        return 1169068184 + (this.f4701a ? 1231 : 1237);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f4701a;
    }
}
