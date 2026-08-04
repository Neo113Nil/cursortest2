package E4;

import W5.AbstractC0486a1;
import Y4.I0;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H4.m f2126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0170c f2129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0170c f2130h;

    public I(H4.m mVar, String str, List list, List list2, long j, C0170c c0170c, C0170c c0170c2) {
        this.f2126d = mVar;
        this.f2127e = str;
        this.f2124b = list2;
        this.f2125c = list;
        this.f2128f = j;
        this.f2129g = c0170c;
        this.f2130h = c0170c2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:74:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.List] */
    public final Pair a(H4.d dVar, C0170c c0170c) {
        boolean z4;
        int iB;
        I0 i7 = H4.o.f3336c;
        H4.j jVar = dVar.f3310a;
        Iterator it = d(jVar).iterator();
        int i8 = 1;
        boolean z7 = true;
        while (true) {
            int i9 = -1;
            if (!it.hasNext()) {
                if (c0170c != null) {
                    int i10 = 0;
                    while (true) {
                        List list = this.f2124b;
                        if (i10 < list.size()) {
                            if (((A) list.get(i10)).f2085b.equals(jVar)) {
                                I0 i11 = (I0) c0170c.f2170b.get(i10);
                                int iB2 = H4.o.b(i7, i11);
                                boolean z8 = c0170c.f2169a;
                                if (iB2 != 0) {
                                    i8 = iB2;
                                } else if (z7 && !z8) {
                                    i8 = -1;
                                } else if (z7 || !z8) {
                                    i8 = 0;
                                }
                                if (i8 < 0) {
                                    i7 = i11;
                                    z7 = z8;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return new Pair(i7, Boolean.valueOf(z7));
            }
            C0177j c0177j = (C0177j) it.next();
            I0 i12 = H4.o.f3336c;
            int iOrdinal = c0177j.f2199a.ordinal();
            I0 i13 = c0177j.f2200b;
            if (iOrdinal == 0 || iOrdinal == 1) {
                switch (p136t.e.e(i13.R())) {
                    case 0:
                        i13 = H4.o.f3335b;
                        break;
                    case 1:
                        i13 = H4.o.f3341h;
                        break;
                    case 2:
                    case 3:
                        i13 = H4.o.f3342i;
                        break;
                    case 4:
                        i13 = H4.o.j;
                        break;
                    case 5:
                        i13 = H4.o.f3343k;
                        break;
                    case 6:
                        i13 = H4.o.f3344l;
                        break;
                    case 7:
                        i13 = H4.o.f3345m;
                        break;
                    case 8:
                        i13 = H4.o.f3346n;
                        break;
                    case 9:
                        i13 = H4.o.f3347o;
                        break;
                    case 10:
                        i13 = !H4.o.j(i13) ? H4.o.f3348p : H4.o.f3340g;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown value type: ".concat(AbstractC0486a1.w(i13.R())));
                }
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        z4 = true;
                    } else if (iOrdinal != 4) {
                        if (iOrdinal == 5 || iOrdinal == 8) {
                        }
                        z4 = true;
                    } else {
                        i12 = i13;
                        z4 = false;
                    }
                }
                iB = H4.o.b(i7, i12);
                if (iB != 0) {
                    i9 = iB;
                } else if (z7 || z4) {
                    if (z7 && z4) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                }
                if (i9 < 0) {
                    z7 = z4;
                    i7 = i12;
                }
            }
            i12 = i13;
            z4 = true;
            iB = H4.o.b(i7, i12);
            if (iB != 0) {
                i9 = iB;
            } else if (z7) {
                if (z7) {
                    i9 = 0;
                } else {
                    i9 = 0;
                }
            } else if (z7) {
                i9 = 0;
            } else {
                i9 = 0;
            }
            if (i9 < 0) {
                z7 = z4;
                i7 = i12;
            }
        }
    }

    public final String b() {
        String str = this.f2123a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2126d.c());
        String str2 = this.f2127e;
        if (str2 != null) {
            sb.append("|cg:");
            sb.append(str2);
        }
        sb.append("|f:");
        Iterator it = this.f2125c.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0178k) it.next()).a());
        }
        sb.append("|ob:");
        for (A a2 : this.f2124b) {
            sb.append(a2.f2085b.c());
            sb.append(p136t.e.b(a2.f2084a, 1) ? "asc" : "desc");
        }
        if (e()) {
            sb.append("|l:");
            sb.append(this.f2128f);
        }
        C0170c c0170c = this.f2129g;
        if (c0170c != null) {
            sb.append("|lb:");
            sb.append(c0170c.f2169a ? "b:" : "a:");
            sb.append(c0170c.b());
        }
        C0170c c0170c2 = this.f2130h;
        if (c0170c2 != null) {
            sb.append("|ub:");
            sb.append(c0170c2.f2169a ? "a:" : "b:");
            sb.append(c0170c2.b());
        }
        String string = sb.toString();
        this.f2123a = string;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:74:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.List] */
    public final Pair c(H4.d dVar, C0170c c0170c) {
        boolean z4;
        int iB;
        I0 i7 = H4.o.f3338e;
        H4.j jVar = dVar.f3310a;
        Iterator it = d(jVar).iterator();
        int i8 = 1;
        boolean z7 = true;
        while (true) {
            int i9 = -1;
            if (!it.hasNext()) {
                if (c0170c != null) {
                    int i10 = 0;
                    while (true) {
                        List list = this.f2124b;
                        if (i10 < list.size()) {
                            if (((A) list.get(i10)).f2085b.equals(jVar)) {
                                I0 i11 = (I0) c0170c.f2170b.get(i10);
                                int iB2 = H4.o.b(i7, i11);
                                boolean z8 = c0170c.f2169a;
                                if (iB2 != 0) {
                                    i8 = iB2;
                                } else if (!z7 || z8) {
                                    i8 = (z7 || !z8) ? 0 : -1;
                                }
                                if (i8 > 0) {
                                    i7 = i11;
                                    z7 = z8;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return new Pair(i7, Boolean.valueOf(z7));
            }
            C0177j c0177j = (C0177j) it.next();
            I0 i12 = H4.o.f3338e;
            int iOrdinal = c0177j.f2199a.ordinal();
            I0 i13 = c0177j.f2200b;
            if (iOrdinal != 0) {
                if (iOrdinal == 1 || iOrdinal == 2) {
                    i12 = i13;
                } else if (iOrdinal != 3) {
                    if (iOrdinal == 4 || iOrdinal == 5) {
                        switch (p136t.e.e(i13.R())) {
                            case 0:
                                i12 = H4.o.f3341h;
                                break;
                            case 1:
                                i12 = H4.o.f3342i;
                                break;
                            case 2:
                            case 3:
                                i12 = H4.o.j;
                                break;
                            case 4:
                                i12 = H4.o.f3343k;
                                break;
                            case 5:
                                i12 = H4.o.f3344l;
                                break;
                            case 6:
                                i12 = H4.o.f3345m;
                                break;
                            case 7:
                                i12 = H4.o.f3346n;
                                break;
                            case 8:
                                i12 = H4.o.f3347o;
                                break;
                            case 9:
                                i12 = H4.o.f3340g;
                                break;
                            case 10:
                                if (H4.o.j(i13)) {
                                    i12 = H4.o.f3348p;
                                }
                                break;
                            default:
                                throw new IllegalArgumentException("Unknown value type: ".concat(AbstractC0486a1.w(i13.R())));
                        }
                    } else if (iOrdinal == 8) {
                        i12 = i13;
                    }
                }
                z4 = true;
                iB = H4.o.b(i7, i12);
                if (iB != 0) {
                    i9 = iB;
                } else if (!z7 && !z4) {
                    i9 = 1;
                } else if (z7 || !z4) {
                    i9 = 0;
                }
                if (i9 > 0) {
                    z7 = z4;
                    i7 = i12;
                }
            } else {
                i12 = i13;
            }
            z4 = false;
            iB = H4.o.b(i7, i12);
            if (iB != 0) {
                i9 = iB;
            } else if (!z7) {
                if (z7) {
                    i9 = 0;
                } else {
                    i9 = 0;
                }
            } else if (z7) {
                i9 = 0;
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                z7 = z4;
                i7 = i12;
            }
        }
    }

    public final ArrayList d(H4.j jVar) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0178k abstractC0178k : this.f2125c) {
            if (abstractC0178k instanceof C0177j) {
                C0177j c0177j = (C0177j) abstractC0178k;
                if (c0177j.f2201c.equals(jVar)) {
                    arrayList.add(c0177j);
                }
            }
        }
        return arrayList;
    }

    public final boolean e() {
        return this.f2128f != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        I i7 = (I) obj;
        String str = i7.f2127e;
        String str2 = this.f2127e;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (this.f2128f != i7.f2128f || !this.f2124b.equals(i7.f2124b) || !this.f2125c.equals(i7.f2125c) || !this.f2126d.equals(i7.f2126d)) {
            return false;
        }
        C0170c c0170c = i7.f2129g;
        C0170c c0170c2 = this.f2129g;
        if (c0170c2 == null ? c0170c != null : !c0170c2.equals(c0170c)) {
            return false;
        }
        C0170c c0170c3 = i7.f2130h;
        C0170c c0170c4 = this.f2130h;
        if (c0170c4 != null) {
            return c0170c4.equals(c0170c3);
        }
        return c0170c3 == null;
    }

    public final boolean f() {
        return H4.h.f(this.f2126d) && this.f2127e == null && this.f2125c.isEmpty();
    }

    public final int hashCode() {
        int iHashCode = this.f2124b.hashCode() * 31;
        String str = this.f2127e;
        int iHashCode2 = (this.f2126d.hashCode() + ((this.f2125c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f2128f;
        int i7 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        C0170c c0170c = this.f2129g;
        int iHashCode3 = (i7 + (c0170c != null ? c0170c.hashCode() : 0)) * 31;
        C0170c c0170c2 = this.f2130h;
        return iHashCode3 + (c0170c2 != null ? c0170c2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Query(");
        sb.append(this.f2126d.c());
        String str = this.f2127e;
        if (str != null) {
            sb.append(" collectionGroup=");
            sb.append(str);
        }
        List list = this.f2125c;
        if (!list.isEmpty()) {
            sb.append(" where ");
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (i7 > 0) {
                    sb.append(" and ");
                }
                sb.append(list.get(i7));
            }
        }
        List list2 = this.f2124b;
        if (!list2.isEmpty()) {
            sb.append(" order by ");
            for (int i8 = 0; i8 < list2.size(); i8++) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(list2.get(i8));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
