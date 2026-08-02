package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lt1 implements Iterable, ht1 {

    /* JADX INFO: renamed from: j */
    public final String f4908j;

    public lt1(String str) {
        if (str != null) {
            this.f4908j = str;
        } else {
            C0270h1.m2190f("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    public final Iterator mo750b() {
        return new jt1(0, this);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: e */
    public final Boolean mo752e() {
        return Boolean.valueOf(!this.f4908j.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lt1) {
            return this.f4908j.equals(((lt1) obj).f4908j);
        }
        return false;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: f */
    public final String mo753f() {
        return this.f4908j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
      0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ht1
    /* JADX INFO: renamed from: g */
    public final ht1 mo754g(String str, f71 f71Var, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        f71 f71Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                C0270h1.m2190f(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strMo753f = "undefined";
        String str3 = this.f4908j;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    wo1.m5396w("hasOwnProperty", 1, arrayList);
                    ht1 ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    boolean zEquals = "length".equals(ht1VarM96t.mo753f());
                    up1 up1Var = ht1.f3335g;
                    if (zEquals) {
                        return up1Var;
                    }
                    double dDoubleValue = ht1VarM96t.mo755h().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? ht1.f3336h : up1Var;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    wo1.m5396w("toString", 0, arrayList);
                    return this;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    wo1.m5396w("toLocaleLowerCase", 0, arrayList);
                    return new lt1(str3.toLowerCase());
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    wo1.m5399z("charAt", 1, arrayList);
                    int iM5374E = arrayList.isEmpty() ? 0 : (int) wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue());
                    return (iM5374E < 0 || iM5374E >= str3.length()) ? ht1.f3337i : new lt1(String.valueOf(str3.charAt(iM5374E)));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(i4)).mo753f());
                        }
                        return new lt1(sb.toString());
                    }
                    return this;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    wo1.m5396w("toLowerCase", 0, arrayList);
                    return new lt1(str3.toLowerCase(Locale.ENGLISH));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    wo1.m5399z("search", 1, arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo753f()).matcher(str3);
                    return matcher.find() ? new gr1(Double.valueOf(matcher.start())) : new gr1(Double.valueOf(-1.0d));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    wo1.m5396w("toLocaleUpperCase", 0, arrayList);
                    return new lt1(str3.toUpperCase());
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    wo1.m5399z("lastIndexOf", 2, arrayList);
                    String strMo753f2 = arrayList.size() > 0 ? ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo753f() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue();
                    return new gr1(Double.valueOf(str3.lastIndexOf(strMo753f2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : wo1.m5374E(dDoubleValue2)))));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    wo1.m5396w("toUpperCase", 0, arrayList);
                    return new lt1(str3.toUpperCase(Locale.ENGLISH));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    wo1.m5396w("toUpperCase", 0, arrayList);
                    return new lt1(str3.trim());
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    wo1.m5399z("match", 1, arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo753f()).matcher(str3);
                    return matcher2.find() ? new dp1(Arrays.asList(new lt1(matcher2.group()))) : ht1.f3331c;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    wo1.m5399z("slice", 2, arrayList);
                    double dM5374E = wo1.m5374E(!arrayList.isEmpty() ? ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue() : 0.0d);
                    double dMax = dM5374E < 0.0d ? Math.max(((double) str3.length()) + dM5374E, 0.0d) : Math.min(dM5374E, str3.length());
                    double dM5374E2 = wo1.m5374E(arrayList.size() > 1 ? ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new lt1(str3.substring(i5, Math.max(0, ((int) (dM5374E2 < 0.0d ? Math.max(((double) str3.length()) + dM5374E2, 0.0d) : Math.min(dM5374E2, str3.length()))) - i5) + i5));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    wo1.m5399z("split", 2, arrayList);
                    if (str3.length() == 0) {
                        return new dp1(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strMo753f3 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo753f();
                        long jM5373D = arrayList.size() > 1 ? ((long) wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue())) & 4294967295L : 2147483647L;
                        if (jM5373D == 0) {
                            return new dp1();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strMo753f3), ((int) jM5373D) + 1);
                        int length = strArrSplit.length;
                        if (!strMo753f3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jM5373D) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new lt1(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new dp1(arrayList2);
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    wo1.m5399z("substring", 2, arrayList);
                    int iM5374E2 = !arrayList.isEmpty() ? (int) wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue()) : 0;
                    int iM5374E3 = arrayList.size() > 1 ? (int) wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iM5374E2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iM5374E3, 0), str3.length());
                    return new lt1(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    wo1.m5399z("replace", 2, arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    ht1 ht1VarMo749a = ht1.f3330b;
                    if (!zIsEmpty2) {
                        strMo753f = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo753f();
                        if (arrayList.size() > 1) {
                            ht1VarMo749a = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                        }
                    }
                    String str4 = strMo753f;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (ht1VarMo749a instanceof bs1) {
                            ht1VarMo749a = ((bs1) ht1VarMo749a).mo749a(f71Var, Arrays.asList(new lt1(str4), new gr1(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strMo753f4 = ht1VarMo749a.mo753f();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new lt1(AbstractC0024an.m286i(new StringBuilder(strSubstring.length() + String.valueOf(strMo753f4).length() + strSubstring2.length()), strSubstring, strMo753f4, strSubstring2));
                    }
                    return this;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    wo1.m5399z("indexOf", 2, arrayList);
                    if (arrayList.size() <= 0) {
                        f71Var2 = f71Var;
                    } else {
                        f71Var2 = f71Var;
                        strMo753f = ((a81) f71Var2.f2335l).m96t(f71Var2, (ht1) arrayList.get(0)).mo753f();
                    }
                    return new gr1(Double.valueOf(str3.indexOf(strMo753f, (int) wo1.m5374E(arrayList.size() < 2 ? 0.0d : ((a81) f71Var2.f2335l).m96t(f71Var2, (ht1) arrayList.get(1)).mo755h().doubleValue()))));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            default:
                C0270h1.m2190f("Command not supported");
                return null;
        }
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: h */
    public final Double mo755h() {
        String str = this.f4908j;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f4908j.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jt1(1, this);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: p */
    public final ht1 mo758p() {
        return new lt1(this.f4908j);
    }

    public final String toString() {
        String str = this.f4908j;
        return AbstractC0024an.m286i(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
