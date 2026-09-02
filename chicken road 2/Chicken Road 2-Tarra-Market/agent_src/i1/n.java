package i1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f1367a;

    /* renamed from: d, reason: collision with root package name */
    public String f1370d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1372f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1373g;

    /* renamed from: h, reason: collision with root package name */
    public String f1374h;

    /* renamed from: b, reason: collision with root package name */
    public String f1368b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f1369c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f1371e = -1;

    public n() {
        ArrayList arrayList = new ArrayList();
        this.f1372f = arrayList;
        arrayList.add("");
    }

    public final o a() {
        if (this.f1367a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f1370d != null) {
            return new o(this);
        }
        throw new IllegalStateException("host == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0238, code lost:
    
        if (r1 <= 65535) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(o oVar, String str) {
        char charAt;
        int i2;
        int i3;
        int i4;
        char c2;
        char c3;
        ArrayList arrayList;
        char c4;
        char c5;
        int i5;
        int h2;
        char charAt2;
        ArrayList arrayList2;
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList3;
        int i10;
        char c6;
        ArrayList arrayList4;
        char charAt3;
        boolean z2 = false;
        int p2 = j1.d.p(str, 0, str.length());
        int q2 = j1.d.q(str, p2, str.length());
        if (q2 - p2 >= 2 && (((charAt = str.charAt(p2)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
            int i11 = p2 + 1;
            while (true) {
                if (i11 >= q2) {
                    break;
                }
                char charAt4 = str.charAt(i11);
                if ((charAt4 >= 'a' && charAt4 <= 'z') || ((charAt4 >= 'A' && charAt4 <= 'Z') || ((charAt4 >= '0' && charAt4 <= '9') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                    i11++;
                } else if (charAt4 == ':') {
                    i2 = i11;
                }
            }
            if (i2 == -1) {
                if (str.regionMatches(true, p2, "https:", 0, 6)) {
                    this.f1367a = "https";
                    p2 += 6;
                } else {
                    if (!str.regionMatches(true, p2, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i2) + "'");
                    }
                    this.f1367a = "http";
                    p2 += 5;
                }
            } else {
                if (oVar == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f1367a = oVar.f1376a;
            }
            i3 = p2;
            i4 = 0;
            while (true) {
                c2 = '/';
                c3 = '\\';
                if (i3 >= q2 || !((charAt3 = str.charAt(i3)) == '\\' || charAt3 == '/')) {
                    break;
                }
                i4++;
                i3++;
            }
            arrayList = this.f1372f;
            c4 = '?';
            c5 = '#';
            if (i4 < 2 || oVar == null || !oVar.f1376a.equals(this.f1367a)) {
                i5 = p2 + i4;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    h2 = j1.d.h(str, i5, q2, "@/\\?#");
                    charAt2 = h2 == q2 ? str.charAt(h2) : (char) 65535;
                    if (charAt2 == 65535 || charAt2 == c5 || charAt2 == c2 || charAt2 == c3 || charAt2 == c4) {
                        break;
                    }
                    if (charAt2 != '@') {
                        arrayList3 = arrayList;
                    } else {
                        if (z3) {
                            arrayList3 = arrayList;
                            i10 = h2;
                            this.f1369c += "%40" + o.a(str, i5, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        } else {
                            int g2 = j1.d.g(str, i5, h2, ':');
                            arrayList3 = arrayList;
                            i10 = h2;
                            String a2 = o.a(str, i5, g2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            if (z4) {
                                a2 = this.f1368b + "%40" + a2;
                            }
                            this.f1368b = a2;
                            if (g2 != i10) {
                                this.f1369c = o.a(str, g2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                z3 = true;
                            }
                            z4 = true;
                        }
                        i5 = i10 + 1;
                    }
                    arrayList = arrayList3;
                    c5 = '#';
                    c4 = '?';
                    c3 = '\\';
                    c2 = '/';
                }
                arrayList2 = arrayList;
                i6 = i5;
                while (true) {
                    if (i6 < h2) {
                        char charAt5 = str.charAt(i6);
                        if (charAt5 == ':') {
                            i7 = i6;
                            break;
                        }
                        if (charAt5 == '[') {
                            do {
                                i6++;
                                if (i6 < h2) {
                                }
                            } while (str.charAt(i6) != ']');
                        }
                        i6++;
                    } else {
                        i7 = h2;
                        break;
                    }
                }
                i8 = i7 + 1;
                if (i8 >= h2) {
                    this.f1370d = j1.d.b(o.g(str, i5, i7, false));
                    try {
                        i9 = Integer.parseInt(o.a(str, i8, h2, "", false, false, false, true));
                        if (i9 > 0) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i9 = -1;
                    this.f1371e = i9;
                    if (i9 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i8, h2) + '\"');
                    }
                    z2 = false;
                } else {
                    this.f1370d = j1.d.b(o.g(str, i5, i7, false));
                    this.f1371e = o.b(this.f1367a);
                }
                if (this.f1370d != null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i5, i7) + '\"');
                }
                p2 = h2;
            } else {
                this.f1368b = oVar.f();
                this.f1369c = oVar.c();
                this.f1370d = oVar.f1379d;
                this.f1371e = oVar.f1380e;
                arrayList.clear();
                arrayList.addAll(oVar.d());
                if (p2 == q2 || str.charAt(p2) == '#') {
                    String e2 = oVar.e();
                    this.f1373g = e2 != null ? o.j(o.a(e2, 0, e2.length(), " \"'<>#", true, false, true, true)) : null;
                }
                arrayList2 = arrayList;
            }
            int h3 = j1.d.h(str, p2, q2, "?#");
            if (p2 != h3) {
                char charAt6 = str.charAt(p2);
                if (charAt6 == '/' || charAt6 == '\\') {
                    arrayList4 = arrayList2;
                    arrayList4.clear();
                    arrayList4.add("");
                    p2++;
                } else {
                    arrayList4 = arrayList2;
                    arrayList4.set(arrayList2.size() - 1, "");
                }
                int i12 = p2;
                while (i12 < h3) {
                    int h4 = j1.d.h(str, i12, h3, "/\\");
                    boolean z5 = h4 < h3 ? true : z2;
                    String a3 = o.a(str, i12, h4, " \"<>^`{}|/\\?#", true, false, false, true);
                    if (!a3.equals(".") && !a3.equalsIgnoreCase("%2e")) {
                        if (!a3.equals("..") && !a3.equalsIgnoreCase("%2e.") && !a3.equalsIgnoreCase(".%2e") && !a3.equalsIgnoreCase("%2e%2e")) {
                            if (((String) arrayList4.get(arrayList4.size() - 1)).isEmpty()) {
                                arrayList4.set(arrayList4.size() - 1, a3);
                            } else {
                                arrayList4.add(a3);
                            }
                            if (z5) {
                                arrayList4.add("");
                            }
                        } else if (!((String) arrayList4.remove(arrayList4.size() - 1)).isEmpty() || arrayList4.isEmpty()) {
                            arrayList4.add("");
                        } else {
                            arrayList4.set(arrayList4.size() - 1, "");
                        }
                    }
                    if (z5) {
                        h4++;
                    }
                    i12 = h4;
                }
            }
            if (h3 >= q2 || str.charAt(h3) != '?') {
                c6 = '#';
            } else {
                c6 = '#';
                int g3 = j1.d.g(str, h3, q2, '#');
                this.f1373g = o.j(o.a(str, h3 + 1, g3, " \"'<>#", true, false, true, true));
                h3 = g3;
            }
            if (h3 >= q2 || str.charAt(h3) != c6) {
                return;
            }
            this.f1374h = o.a(str, h3 + 1, q2, "", true, false, false, false);
            return;
        }
        i2 = -1;
        if (i2 == -1) {
        }
        i3 = p2;
        i4 = 0;
        while (true) {
            c2 = '/';
            c3 = '\\';
            if (i3 >= q2) {
                break;
            } else {
                break;
            }
            i4++;
            i3++;
        }
        arrayList = this.f1372f;
        c4 = '?';
        c5 = '#';
        if (i4 < 2) {
        }
        i5 = p2 + i4;
        boolean z32 = false;
        boolean z42 = false;
        while (true) {
            h2 = j1.d.h(str, i5, q2, "@/\\?#");
            if (h2 == q2) {
            }
            if (charAt2 == 65535) {
                break;
            } else {
                break;
            }
            arrayList = arrayList3;
            c5 = '#';
            c4 = '?';
            c3 = '\\';
            c2 = '/';
        }
        arrayList2 = arrayList;
        i6 = i5;
        while (true) {
            if (i6 < h2) {
            }
            i6++;
        }
        i8 = i7 + 1;
        if (i8 >= h2) {
        }
        if (this.f1370d != null) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1367a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.f1368b.isEmpty() || !this.f1369c.isEmpty()) {
            sb.append(this.f1368b);
            if (!this.f1369c.isEmpty()) {
                sb.append(':');
                sb.append(this.f1369c);
            }
            sb.append('@');
        }
        String str2 = this.f1370d;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f1370d);
                sb.append(']');
            } else {
                sb.append(this.f1370d);
            }
        }
        int i2 = this.f1371e;
        if (i2 != -1 || this.f1367a != null) {
            if (i2 == -1) {
                i2 = o.b(this.f1367a);
            }
            String str3 = this.f1367a;
            if (str3 == null || i2 != o.b(str3)) {
                sb.append(':');
                sb.append(i2);
            }
        }
        ArrayList arrayList = this.f1372f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append('/');
            sb.append((String) arrayList.get(i3));
        }
        if (this.f1373g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f1373g;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4 += 2) {
                String str4 = (String) arrayList2.get(i4);
                String str5 = (String) arrayList2.get(i4 + 1);
                if (i4 > 0) {
                    sb.append('&');
                }
                sb.append(str4);
                if (str5 != null) {
                    sb.append('=');
                    sb.append(str5);
                }
            }
        }
        if (this.f1374h != null) {
            sb.append('#');
            sb.append(this.f1374h);
        }
        return sb.toString();
    }
}
