package u3;

import j5.i;
import java.util.List;
import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;
import n2.C1342d;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1480b extends AbstractC1283f {

    /* renamed from: f, reason: collision with root package name */
    public static final C1479a f12050f;

    /* renamed from: c, reason: collision with root package name */
    public final List f12051c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12052d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12053e;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f12050f = new C1479a(C1480b.class);
    }

    public C1480b(C1342d c1342d, int i2, C1342d c1342d2, i iVar) {
        super(f12050f, iVar);
        this.f12051c = AbstractC1341c.u("attributes", c1342d);
        this.f12052d = i2;
        this.f12053e = AbstractC1341c.u("entity_refs", c1342d2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1480b)) {
            return false;
        }
        C1480b c1480b = (C1480b) obj;
        return a().equals(c1480b.a()) && this.f12051c.equals(c1480b.f12051c) && AbstractC1341c.i(Integer.valueOf(this.f12052d), Integer.valueOf(c1480b.f12052d)) && this.f12053e.equals(c1480b.f12053e);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((Integer.hashCode(this.f12052d) + ((this.f12051c.hashCode() + (a().hashCode() * 37)) * 37)) * 37) + this.f12053e.hashCode();
        this.f11160b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f12051c;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f12052d);
        List list2 = this.f12053e;
        if (!list2.isEmpty()) {
            sb.append(", entity_refs=");
            sb.append(list2);
        }
        StringBuilder replace = sb.replace(0, 2, "Resource{");
        replace.append('}');
        return replace.toString();
    }
}
