package s3;

import g4.AbstractC0465j;
import java.util.List;
import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;
import n2.C1340b;
import n2.C1342d;

/* loaded from: classes.dex */
public final class f extends AbstractC1283f {

    /* renamed from: g, reason: collision with root package name */
    public static final e f11822g;

    /* renamed from: c, reason: collision with root package name */
    public final String f11823c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11824d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11825e;

    /* renamed from: f, reason: collision with root package name */
    public final List f11826f;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11822g = new e(f.class);
    }

    public f(String str, String str2, C1342d c1342d, C1342d c1342d2, j5.i iVar) {
        super(f11822g, iVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f11823c = str;
        if (str2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        this.f11824d = str2;
        this.f11825e = AbstractC1341c.u("id_keys", c1342d);
        this.f11826f = AbstractC1341c.u("description_keys", c1342d2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && AbstractC1341c.i(this.f11823c, fVar.f11823c) && AbstractC1341c.i(this.f11824d, fVar.f11824d) && this.f11825e.equals(fVar.f11825e) && this.f11826f.equals(fVar.f11826f);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f11823c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f11824d;
        int hashCode3 = this.f11826f.hashCode() + ((this.f11825e.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f11160b = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f11823c;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(AbstractC1341c.C(str));
        }
        String str2 = this.f11824d;
        if (str2 != null) {
            sb.append(", type=");
            sb.append(AbstractC1341c.C(str2));
        }
        List list = this.f11825e;
        if (!list.isEmpty()) {
            sb.append(", id_keys=");
            sb.append(AbstractC0465j.K0(list, null, "[", "]", C1340b.f11464a, 25));
        }
        List list2 = this.f11826f;
        if (!list2.isEmpty()) {
            sb.append(", description_keys=");
            sb.append(AbstractC0465j.K0(list2, null, "[", "]", C1340b.f11464a, 25));
        }
        StringBuilder replace = sb.replace(0, 2, "EntityRef{");
        replace.append('}');
        return replace.toString();
    }
}
