package t3;

import j5.i;
import java.util.List;
import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;
import n2.C1342d;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1427b extends AbstractC1283f {

    /* renamed from: n, reason: collision with root package name */
    public static final C1426a f11922n;

    /* renamed from: c, reason: collision with root package name */
    public final long f11923c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11924d;

    /* renamed from: e, reason: collision with root package name */
    public final h f11925e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11926f;

    /* renamed from: g, reason: collision with root package name */
    public final s3.b f11927g;

    /* renamed from: h, reason: collision with root package name */
    public final List f11928h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11929i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11930j;

    /* renamed from: k, reason: collision with root package name */
    public final i f11931k;

    /* renamed from: l, reason: collision with root package name */
    public final i f11932l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11933m;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11922n = new C1426a(C1427b.class);
    }

    public C1427b(long j2, long j6, h hVar, String str, s3.b bVar, C1342d c1342d, int i2, int i3, i iVar, i iVar2, String str2, i iVar3) {
        super(f11922n, iVar3);
        this.f11923c = j2;
        this.f11924d = j6;
        if (hVar == null) {
            throw new IllegalArgumentException("severity_number == null");
        }
        this.f11925e = hVar;
        if (str == null) {
            throw new IllegalArgumentException("severity_text == null");
        }
        this.f11926f = str;
        this.f11927g = bVar;
        this.f11928h = AbstractC1341c.u("attributes", c1342d);
        this.f11929i = i2;
        this.f11930j = i3;
        if (iVar == null) {
            throw new IllegalArgumentException("trace_id == null");
        }
        this.f11931k = iVar;
        if (iVar2 == null) {
            throw new IllegalArgumentException("span_id == null");
        }
        this.f11932l = iVar2;
        if (str2 == null) {
            throw new IllegalArgumentException("event_name == null");
        }
        this.f11933m = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1427b)) {
            return false;
        }
        C1427b c1427b = (C1427b) obj;
        return a().equals(c1427b.a()) && AbstractC1341c.i(Long.valueOf(this.f11923c), Long.valueOf(c1427b.f11923c)) && AbstractC1341c.i(Long.valueOf(this.f11924d), Long.valueOf(c1427b.f11924d)) && AbstractC1341c.i(this.f11925e, c1427b.f11925e) && AbstractC1341c.i(this.f11926f, c1427b.f11926f) && AbstractC1341c.i(this.f11927g, c1427b.f11927g) && this.f11928h.equals(c1427b.f11928h) && AbstractC1341c.i(Integer.valueOf(this.f11929i), Integer.valueOf(c1427b.f11929i)) && AbstractC1341c.i(Integer.valueOf(this.f11930j), Integer.valueOf(c1427b.f11930j)) && AbstractC1341c.i(this.f11931k, c1427b.f11931k) && AbstractC1341c.i(this.f11932l, c1427b.f11932l) && AbstractC1341c.i(this.f11933m, c1427b.f11933m);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = (Long.hashCode(this.f11924d) + ((Long.hashCode(this.f11923c) + (a().hashCode() * 37)) * 37)) * 37;
        h hVar = this.f11925e;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37;
        String str = this.f11926f;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        s3.b bVar = this.f11927g;
        int hashCode4 = (Integer.hashCode(this.f11930j) + ((Integer.hashCode(this.f11929i) + ((this.f11928h.hashCode() + ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37)) * 37)) * 37;
        i iVar = this.f11931k;
        int hashCode5 = (hashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        i iVar2 = this.f11932l;
        int hashCode6 = (hashCode5 + (iVar2 != null ? iVar2.hashCode() : 0)) * 37;
        String str2 = this.f11933m;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.f11160b = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", time_unix_nano=");
        sb.append(this.f11923c);
        sb.append(", observed_time_unix_nano=");
        sb.append(this.f11924d);
        h hVar = this.f11925e;
        if (hVar != null) {
            sb.append(", severity_number=");
            sb.append(hVar);
        }
        String str = this.f11926f;
        if (str != null) {
            sb.append(", severity_text=");
            sb.append(AbstractC1341c.C(str));
        }
        s3.b bVar = this.f11927g;
        if (bVar != null) {
            sb.append(", body=");
            sb.append(bVar);
        }
        List list = this.f11928h;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f11929i);
        sb.append(", flags=");
        sb.append(this.f11930j);
        i iVar = this.f11931k;
        if (iVar != null) {
            sb.append(", trace_id=");
            sb.append(iVar);
        }
        i iVar2 = this.f11932l;
        if (iVar2 != null) {
            sb.append(", span_id=");
            sb.append(iVar2);
        }
        String str2 = this.f11933m;
        if (str2 != null) {
            sb.append(", event_name=");
            sb.append(AbstractC1341c.C(str2));
        }
        StringBuilder replace = sb.replace(0, 2, "LogRecord{");
        replace.append('}');
        return replace.toString();
    }
}
