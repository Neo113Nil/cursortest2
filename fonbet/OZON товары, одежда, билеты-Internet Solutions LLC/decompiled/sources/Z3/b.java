package Z3;

import G.g;
import j3.s;
import j3.t;

@Deprecated
/* loaded from: classes8.dex */
public class b implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f35350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35351b;

    public b(String str, String str2) {
        this.f35350a = O7.b.c(str);
        this.f35351b = str2;
    }

    @Override // j3.t.a
    public final void a(s.a aVar) {
        String str;
        String str2 = this.f35350a;
        str2.getClass();
        str = this.f35351b;
        switch (str2) {
            case "TOTALTRACKS":
                Integer g10 = com.google.common.primitives.b.g(str);
                if (g10 != null) {
                    aVar.b0(g10);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer g11 = com.google.common.primitives.b.g(str);
                if (g11 != null) {
                    aVar.a0(g11);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer g12 = com.google.common.primitives.b.g(str);
                if (g12 != null) {
                    aVar.c0(g12);
                    break;
                }
                break;
            case "ALBUM":
                aVar.L(str);
                break;
            case "GENRE":
                aVar.R(str);
                break;
            case "TITLE":
                aVar.Z(str);
                break;
            case "DESCRIPTION":
                aVar.P(str);
                break;
            case "DISCNUMBER":
                Integer g13 = com.google.common.primitives.b.g(str);
                if (g13 != null) {
                    aVar.Q(g13);
                    break;
                }
                break;
            case "ALBUMARTIST":
                aVar.K(str);
                break;
            case "ARTIST":
                aVar.M(str);
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f35350a.equals(bVar.f35350a) && this.f35351b.equals(bVar.f35351b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35351b.hashCode() + g.a(527, 31, this.f35350a);
    }

    public final String toString() {
        return "VC: " + this.f35350a + "=" + this.f35351b;
    }
}
