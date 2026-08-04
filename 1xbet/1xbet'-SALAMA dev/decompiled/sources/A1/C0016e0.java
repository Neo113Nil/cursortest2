package A1;

import E3.AbstractC0167z;
import E3.C0164w;
import android.net.Uri;
import java.util.List;
import p155w1.C1013m0;

/* JADX INFO: renamed from: A1.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0016e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E3.L f348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f349e;

    public C0016e0(Uri uri, String str, P6.b bVar, List list, E3.L l7, String str2) {
        this.f345a = uri;
        this.f346b = str;
        this.f347c = list;
        this.f348d = l7;
        C0164w c0164wC = AbstractC0167z.C();
        for (int i7 = 0; i7 < l7.size(); i7++) {
            ((C0020g0) l7.get(i7)).getClass();
            new C1013m0(1);
            c0164wC.a(new C0020g0());
        }
        c0164wC.d();
        this.f349e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0016e0)) {
            return false;
        }
        C0016e0 c0016e0 = (C0016e0) obj;
        return this.f345a.equals(c0016e0.f345a) && p151v2.t.a(this.f346b, c0016e0.f346b) && p151v2.t.a(null, null) && p151v2.t.a(null, null) && this.f347c.equals(c0016e0.f347c) && p151v2.t.a(null, null) && this.f348d.equals(c0016e0.f348d) && p151v2.t.a(this.f349e, c0016e0.f349e);
    }

    public final int hashCode() {
        int iHashCode = this.f345a.hashCode() * 31;
        String str = this.f346b;
        int iHashCode2 = (this.f348d.hashCode() + ((this.f347c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
        String str2 = this.f349e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
