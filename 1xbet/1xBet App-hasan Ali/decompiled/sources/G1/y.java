package G1;

import a3.AbstractC0467k;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.C2189a;
import o4.AbstractC2227e;
import r.S;
import r.T;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1963s = 0;

    /* renamed from: k, reason: collision with root package name */
    public final String f1964k;

    /* renamed from: l, reason: collision with root package name */
    public B f1965l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1966m;

    /* renamed from: n, reason: collision with root package name */
    public final S f1967n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f1968o;

    /* renamed from: p, reason: collision with root package name */
    public int f1969p;

    /* renamed from: q, reason: collision with root package name */
    public String f1970q;

    /* renamed from: r, reason: collision with root package name */
    public W3.m f1971r;

    static {
        new LinkedHashMap();
    }

    public y(O o5) {
        kotlin.jvm.internal.l.f("navigator", o5);
        LinkedHashMap linkedHashMap = P.f1876b;
        this.f1964k = AbstractC0136g.c(o5.getClass());
        this.f1966m = new ArrayList();
        this.f1967n = new S(0);
        this.f1968o = new LinkedHashMap();
    }

    public final Bundle c(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f1968o;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((C0135f) entry.getValue()).getClass();
            kotlin.jvm.internal.l.f("name", str);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C0135f c0135f = (C0135f) entry2.getValue();
                c0135f.getClass();
                kotlin.jvm.internal.l.f("name", str2);
                boolean containsKey = bundle2.containsKey(str2);
                M m5 = c0135f.f1891a;
                if (!containsKey || bundle2.get(str2) != null) {
                    try {
                        m5.a(str2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder w5 = AbstractC0467k.w("Wrong argument type for '", str2, "' in argument bundle. ");
                w5.append(m5.b());
                w5.append(" expected.");
                throw new IllegalArgumentException(w5.toString().toString());
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (G1.AbstractC0136g.d(r3, new G1.u(1, r15)).isEmpty() != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w d(v3.e eVar) {
        boolean matches;
        y yVar = this;
        ArrayList arrayList = yVar.f1966m;
        Bundle bundle = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        w wVar = null;
        int i = 0;
        while (i < size) {
            int i5 = i + 1;
            v vVar = (v) arrayList.get(i);
            vVar.getClass();
            W3.m mVar = vVar.f1949d;
            Pattern pattern = (Pattern) mVar.getValue();
            Uri uri = (Uri) eVar.f20432l;
            if (pattern == null) {
                matches = true;
            } else if (uri == null) {
                matches = false;
            } else {
                Pattern pattern2 = (Pattern) mVar.getValue();
                kotlin.jvm.internal.l.c(pattern2);
                matches = pattern2.matcher(uri.toString()).matches();
            }
            if (matches) {
                LinkedHashMap linkedHashMap = yVar.f1968o;
                Bundle d5 = uri != null ? vVar.d(uri, linkedHashMap) : bundle;
                boolean z3 = true;
                int b3 = vVar.b(uri);
                String str = (String) eVar.f20433m;
                if (str == null || !str.equals(bundle)) {
                    z3 = false;
                }
                if (d5 == null) {
                    if (z3) {
                        kotlin.jvm.internal.l.f("arguments", linkedHashMap);
                        Bundle bundle2 = new Bundle();
                        if (uri != null) {
                            Pattern pattern3 = (Pattern) mVar.getValue();
                            Matcher matcher = pattern3 != null ? pattern3.matcher(uri.toString()) : null;
                            if (matcher != null && matcher.matches()) {
                                vVar.e(matcher, bundle2, linkedHashMap);
                                if (((Boolean) vVar.f1950e.getValue()).booleanValue()) {
                                    vVar.f(uri, bundle2, linkedHashMap);
                                }
                            }
                        }
                    }
                }
                w wVar2 = new w(yVar, d5, vVar.f1955l, b3, z3);
                if (wVar == null || wVar2.compareTo(wVar) > 0) {
                    bundle = null;
                    yVar = this;
                    wVar = wVar2;
                    i = i5;
                }
            }
            bundle = null;
            yVar = this;
            i = i5;
        }
        return wVar;
    }

    public final w e(String str) {
        v vVar;
        kotlin.jvm.internal.l.f("route", str);
        W3.m mVar = this.f1971r;
        if (mVar == null || (vVar = (v) mVar.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        kotlin.jvm.internal.l.b(parse);
        Bundle d5 = vVar.d(parse, this.f1968o);
        if (d5 == null) {
            return null;
        }
        return new w(this, d5, vVar.f1955l, vVar.b(parse), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z3;
        int size;
        LinkedHashMap linkedHashMap;
        boolean z5;
        if (this != obj) {
            if (obj != null && (obj instanceof y)) {
                y yVar = (y) obj;
                boolean a5 = kotlin.jvm.internal.l.a(this.f1966m, yVar.f1966m);
                S s2 = this.f1967n;
                int j5 = s2.j();
                S s5 = yVar.f1967n;
                if (j5 == s5.j()) {
                    Iterator it = ((C2189a) n4.i.L(new T(s2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!kotlin.jvm.internal.l.a(s2.e(intValue), s5.e(intValue))) {
                        }
                    }
                    z3 = true;
                    LinkedHashMap linkedHashMap2 = this.f1968o;
                    size = linkedHashMap2.size();
                    linkedHashMap = yVar.f1968o;
                    if (size == linkedHashMap.size()) {
                        Set<Map.Entry> entrySet = linkedHashMap2.entrySet();
                        kotlin.jvm.internal.l.f("<this>", entrySet);
                        for (Map.Entry entry : entrySet) {
                            if (linkedHashMap.containsKey(entry.getKey()) && kotlin.jvm.internal.l.a(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z5 = true;
                        if (this.f1969p == yVar.f1969p || !kotlin.jvm.internal.l.a(this.f1970q, yVar.f1970q) || !a5 || !z3 || !z5) {
                        }
                    }
                    z5 = false;
                    if (this.f1969p == yVar.f1969p) {
                    }
                }
                z3 = false;
                LinkedHashMap linkedHashMap22 = this.f1968o;
                size = linkedHashMap22.size();
                linkedHashMap = yVar.f1968o;
                if (size == linkedHashMap.size()) {
                }
                z5 = false;
                if (this.f1969p == yVar.f1969p) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f1969p * 31;
        String str = this.f1970q;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = this.f1966m;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            hashCode = (((v) obj).f1946a.hashCode() + (hashCode * 31)) * 961;
        }
        S s2 = this.f1967n;
        kotlin.jvm.internal.l.f("<this>", s2);
        if (s2.j() > 0) {
            s2.k(0).getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f1968o;
        for (String str2 : linkedHashMap.keySet()) {
            int i6 = L1.a.i(hashCode * 31, 31, str2);
            Object obj2 = linkedHashMap.get(str2);
            hashCode = i6 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f1969p));
        sb.append(")");
        String str = this.f1970q;
        if (str != null && !AbstractC2227e.H0(str)) {
            sb.append(" route=");
            sb.append(this.f1970q);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", sb2);
        return sb2;
    }
}
