package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: an */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0024an {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f252a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m278a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static int m279b(int i, int i2, int i3, int i4) {
        return AbstractC0397ki.m3034d(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: c */
    public static ClassCastException m280c(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: d */
    public static String m281d(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: e */
    public static String m282e(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: f */
    public static String m283f(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: g */
    public static String m284g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: h */
    public static String m285h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m286i(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static HashMap m287j(Class cls, C0646r8 c0646r8) {
        HashMap map = new HashMap();
        map.put(cls, c0646r8);
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static Map m288k(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m289l(Object obj) {
        if (obj == null) {
            return;
        }
        dd0.m1158c();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m290m(String str, int i) {
        if (i != 0) {
            return;
        }
        C0270h1.m2192h(str);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m291n(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m292o(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m293p(int i) {
        if (i == 1) {
            return "LOCAL";
        }
        if (i == 2) {
            return "REMOTE";
        }
        if (i == 3) {
            return "DATA_DISK_CACHE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "MEMORY_CACHE";
        }
        return "RESOURCE_DISK_CACHE";
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m294q(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "OUTBOUND";
        }
        return "INBOUND";
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m295r(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m296s(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m297t(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "PLAINTEXT";
        }
        return "TLS";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int[] m298u(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f252a, 0, iArr, 0, i);
        return iArr;
    }
}
