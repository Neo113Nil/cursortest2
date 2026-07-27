package R0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1179a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.e f1180b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0.b f1181c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1182d;

    public a(a1.e eVar, Q0.b bVar, String str) {
        this.f1180b = eVar;
        this.f1181c = bVar;
        this.f1182d = str;
        this.f1179a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return S0.r.e(this.f1180b, aVar.f1180b) && S0.r.e(this.f1181c, aVar.f1181c) && S0.r.e(this.f1182d, aVar.f1182d);
    }

    public final int hashCode() {
        return this.f1179a;
    }
}
