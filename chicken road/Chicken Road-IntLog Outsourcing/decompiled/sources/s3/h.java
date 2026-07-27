package s3;

import java.util.List;
import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;
import n2.C1342d;

/* loaded from: classes.dex */
public final class h extends AbstractC1283f {

    /* renamed from: g, reason: collision with root package name */
    public static final g f11827g;

    /* renamed from: c, reason: collision with root package name */
    public final String f11828c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11829d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11830e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11831f;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11827g = new g(h.class);
    }

    public h(String str, String str2, C1342d c1342d, int i2, j5.i iVar) {
        super(f11827g, iVar);
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        this.f11828c = str;
        if (str2 == null) {
            throw new IllegalArgumentException("version == null");
        }
        this.f11829d = str2;
        this.f11830e = AbstractC1341c.u("attributes", c1342d);
        this.f11831f = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a().equals(hVar.a()) && AbstractC1341c.i(this.f11828c, hVar.f11828c) && AbstractC1341c.i(this.f11829d, hVar.f11829d) && this.f11830e.equals(hVar.f11830e) && AbstractC1341c.i(Integer.valueOf(this.f11831f), Integer.valueOf(hVar.f11831f));
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f11828c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f11829d;
        int hashCode3 = Integer.hashCode(this.f11831f) + ((this.f11830e.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f11160b = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f11828c;
        if (str != null) {
            sb.append(", name=");
            sb.append(AbstractC1341c.C(str));
        }
        String str2 = this.f11829d;
        if (str2 != null) {
            sb.append(", version=");
            sb.append(AbstractC1341c.C(str2));
        }
        List list = this.f11830e;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f11831f);
        StringBuilder replace = sb.replace(0, 2, "InstrumentationScope{");
        replace.append('}');
        return replace.toString();
    }
}
