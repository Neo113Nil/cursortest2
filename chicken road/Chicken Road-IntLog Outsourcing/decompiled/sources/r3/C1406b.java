package r3;

import j5.i;
import java.util.List;
import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;
import n2.C1342d;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406b extends AbstractC1283f {

    /* renamed from: d, reason: collision with root package name */
    public static final C1405a f11722d;

    /* renamed from: c, reason: collision with root package name */
    public final List f11723c;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11722d = new C1405a(C1406b.class);
    }

    public C1406b(C1342d c1342d, i iVar) {
        super(f11722d, iVar);
        this.f11723c = AbstractC1341c.u("resource_logs", c1342d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1406b)) {
            return false;
        }
        C1406b c1406b = (C1406b) obj;
        return a().equals(c1406b.a()) && this.f11723c.equals(c1406b.f11723c);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = (a().hashCode() * 37) + this.f11723c.hashCode();
        this.f11160b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f11723c;
        if (!list.isEmpty()) {
            sb.append(", resource_logs=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "ExportLogsServiceRequest{");
        replace.append('}');
        return replace.toString();
    }
}
