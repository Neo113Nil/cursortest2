package p000;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l12 {

    /* JADX INFO: renamed from: c */
    public static final l12 f4643c = new l12(100);

    /* JADX INFO: renamed from: a */
    public final EnumMap f4644a;

    /* JADX INFO: renamed from: b */
    public final int f4645b;

    public l12(int i) {
        EnumMap enumMap = new EnumMap(k12.class);
        this.f4644a = enumMap;
        k12 k12Var = k12.f4249k;
        h12 h12Var = h12.f3002k;
        enumMap.put(k12Var, h12Var);
        enumMap.put(k12.f4250l, h12Var);
        this.f4645b = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m3148a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    /* JADX INFO: renamed from: b */
    public static l12 m3149b(int i, Bundle bundle) {
        if (bundle == null) {
            return new l12(i);
        }
        EnumMap enumMap = new EnumMap(k12.class);
        for (k12 k12Var : i12.STORAGE.f3395j) {
            enumMap.put(k12Var, m3151d(bundle.getString(k12Var.f4254j)));
        }
        return new l12(enumMap, i);
    }

    /* JADX INFO: renamed from: c */
    public static l12 m3150c(String str, int i) {
        EnumMap enumMap = new EnumMap(k12.class);
        k12[] k12VarArr = i12.STORAGE.f3395j;
        for (int i2 = 0; i2 < k12VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            k12 k12Var = k12VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(k12Var, m3152e(str2.charAt(i3)));
            } else {
                enumMap.put(k12Var, h12.f3002k);
            }
        }
        return new l12(enumMap, i);
    }

    /* JADX INFO: renamed from: d */
    public static h12 m3151d(String str) {
        h12 h12Var = h12.f3002k;
        if (str == null) {
            return h12Var;
        }
        if (str.equals("granted")) {
            return h12.f3005n;
        }
        return str.equals("denied") ? h12.f3004m : h12Var;
    }

    /* JADX INFO: renamed from: e */
    public static h12 m3152e(char c) {
        if (c == '+') {
            return h12.f3003l;
        }
        if (c != '0') {
            return c != '1' ? h12.f3002k : h12.f3005n;
        }
        return h12.f3004m;
    }

    /* JADX INFO: renamed from: h */
    public static char m3153h(h12 h12Var) {
        if (h12Var == null) {
            return '-';
        }
        int iOrdinal = h12Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3154l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l12) {
            l12 l12Var = (l12) obj;
            for (k12 k12Var : i12.STORAGE.f3395j) {
                if (this.f4644a.get(k12Var) == l12Var.f4644a.get(k12Var)) {
                }
            }
            if (this.f4645b == l12Var.f4645b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX INFO: renamed from: f */
    public final String m3155f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (k12 k12Var : i12.STORAGE.f3395j) {
            h12 h12Var = (h12) this.f4644a.get(k12Var);
            char c = '-';
            if (h12Var != null && (iOrdinal = h12Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal == 3) {
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public final String m3156g() {
        StringBuilder sb = new StringBuilder("G1");
        for (k12 k12Var : i12.STORAGE.f3395j) {
            sb.append(m3153h((h12) this.f4644a.get(k12Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.f4644a.values().iterator();
        int iHashCode = this.f4645b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((h12) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3157i(k12 k12Var) {
        return ((h12) this.f4644a.get(k12Var)) != h12.f3004m;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX INFO: renamed from: j */
    public final l12 m3158j(l12 l12Var) {
        EnumMap enumMap = new EnumMap(k12.class);
        for (k12 k12Var : i12.STORAGE.f3395j) {
            h12 h12Var = (h12) this.f4644a.get(k12Var);
            h12 h12Var2 = (h12) l12Var.f4644a.get(k12Var);
            if (h12Var == null) {
                h12Var = h12Var2;
            } else if (h12Var2 != null) {
                h12 h12Var3 = h12.f3002k;
                if (h12Var == h12Var3) {
                    h12Var = h12Var2;
                } else if (h12Var2 != h12Var3) {
                    h12 h12Var4 = h12.f3003l;
                    if (h12Var == h12Var4) {
                        h12Var = h12Var2;
                    } else if (h12Var2 != h12Var4) {
                        h12 h12Var5 = h12.f3004m;
                        h12Var = (h12Var == h12Var5 || h12Var2 == h12Var5) ? h12Var5 : h12.f3005n;
                    }
                }
            }
            if (h12Var != null) {
                enumMap.put(k12Var, h12Var);
            }
        }
        return new l12(enumMap, 100);
    }

    /* JADX INFO: renamed from: k */
    public final l12 m3159k(l12 l12Var) {
        EnumMap enumMap = new EnumMap(k12.class);
        for (k12 k12Var : i12.STORAGE.f3395j) {
            h12 h12Var = (h12) this.f4644a.get(k12Var);
            if (h12Var == h12.f3002k) {
                h12Var = (h12) l12Var.f4644a.get(k12Var);
            }
            if (h12Var != null) {
                enumMap.put(k12Var, h12Var);
            }
        }
        return new l12(enumMap, this.f4645b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m3148a(this.f4645b));
        for (k12 k12Var : i12.STORAGE.f3395j) {
            sb.append(",");
            sb.append(k12Var.f4254j);
            sb.append("=");
            h12 h12Var = (h12) this.f4644a.get(k12Var);
            if (h12Var == null) {
                h12Var = h12.f3002k;
            }
            sb.append(h12Var);
        }
        return sb.toString();
    }

    public l12(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(k12.class);
        this.f4644a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f4645b = i;
    }
}
