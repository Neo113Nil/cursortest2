package com.google.android.gms.internal.ads;

import Q2.C0361h;
import Q2.C0375o;
import Q2.C0379q;
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import y4.C2674b;

/* renamed from: com.google.android.gms.internal.ads.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234l6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14322a;

    /* renamed from: b, reason: collision with root package name */
    public String f14323b;

    /* renamed from: c, reason: collision with root package name */
    public int f14324c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14325d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14326e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14327g;

    /* renamed from: h, reason: collision with root package name */
    public Object f14328h;
    public Object i;

    public C1234l6(Context context, String str, Q2.A0 a02, L2.a aVar) {
        this.f14322a = 0;
        this.f14328h = new BinderC0610Ia();
        this.f14326e = context;
        this.f14323b = str;
        this.f = a02;
        this.f14324c = 1;
        this.f14327g = aVar;
        this.i = Q2.Z0.f4973k;
    }

    public y4.n a() {
        ArrayList arrayList;
        String str = this.f14323b;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e3 = C2674b.e(0, 0, 7, (String) this.f14325d);
        String e5 = C2674b.e(0, 0, 7, (String) this.f14326e);
        String str2 = (String) this.f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b3 = b();
        ArrayList arrayList2 = (ArrayList) this.f14327g;
        ArrayList arrayList3 = new ArrayList(X3.o.S(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(C2674b.e(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = (ArrayList) this.f14328h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(X3.o.S(arrayList4, 10));
            int size2 = arrayList4.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList4.get(i5);
                i5++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? C2674b.e(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new y4.n(str, e3, e5, str2, b3, arrayList3, arrayList, str4 != null ? C2674b.e(0, 0, 7, str4) : null, toString());
    }

    public int b() {
        int i = this.f14324c;
        if (i != -1) {
            return i;
        }
        String str = this.f14323b;
        kotlin.jvm.internal.l.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0216, code lost:
    
        if (r6 < 65536) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r14 == ':') goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x033a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(y4.n nVar, String str) {
        int i;
        int e3;
        int i5;
        int e5;
        char charAt;
        kotlin.jvm.internal.l.f("input", str);
        byte[] bArr = z4.b.f21979a;
        int m5 = z4.b.m(0, str.length(), str);
        int n5 = z4.b.n(m5, str.length(), str);
        if (n5 - m5 >= 2) {
            char charAt2 = str.charAt(m5);
            char c5 = 'a';
            if ((kotlin.jvm.internal.l.g(charAt2, 97) >= 0 && kotlin.jvm.internal.l.g(charAt2, 122) <= 0) || (kotlin.jvm.internal.l.g(charAt2, 65) >= 0 && kotlin.jvm.internal.l.g(charAt2, 90) <= 0)) {
                i = m5 + 1;
                while (true) {
                    if (i >= n5) {
                        break;
                    }
                    char charAt3 = str.charAt(i);
                    if ((c5 <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i++;
                        c5 = 'a';
                    }
                }
            }
        }
        i = -1;
        if (i == -1) {
            if (nVar == null) {
                throw new IllegalArgumentException(L1.a.m("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? AbstractC2227e.P0(str, 6).concat("...") : str));
            }
            this.f14323b = nVar.f21362a;
        } else if (AbstractC2234l.w0(str, m5, "https:", true)) {
            this.f14323b = "https";
            m5 += 6;
        } else {
            if (!AbstractC2234l.w0(str, m5, "http:", true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = str.substring(0, i);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.f14323b = "http";
            m5 += 5;
        }
        int i6 = 0;
        for (int i7 = m5; i7 < n5 && ((charAt = str.charAt(i7)) == '\\' || charAt == '/'); i7++) {
            i6++;
        }
        ArrayList arrayList = (ArrayList) this.f14327g;
        char c6 = '#';
        if (i6 < 2 && nVar != null) {
            if (kotlin.jvm.internal.l.a(nVar.f21362a, this.f14323b)) {
                this.f14325d = nVar.e();
                this.f14326e = nVar.a();
                this.f = nVar.f21365d;
                this.f14324c = nVar.f21366e;
                arrayList.clear();
                arrayList.addAll(nVar.c());
                if (m5 == n5 || str.charAt(m5) == '#') {
                    String d5 = nVar.d();
                    this.f14328h = d5 != null ? C2674b.f(C2674b.b(0, 0, 211, d5, " \"'<>#")) : null;
                }
                e5 = z4.b.e(m5, n5, str, "?#");
                if (m5 != e5) {
                    char charAt4 = str.charAt(m5);
                    if (charAt4 == '/' || charAt4 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        m5++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (m5 < e5) {
                        int e6 = z4.b.e(m5, e5, str, "/\\");
                        boolean z3 = e6 < e5;
                        String b3 = C2674b.b(m5, e6, 240, str, " \"<>^`{}|/\\?#");
                        if (!b3.equals(".") && !b3.equalsIgnoreCase("%2e")) {
                            if (b3.equals("..") || b3.equalsIgnoreCase("%2e.") || b3.equalsIgnoreCase(".%2e") || b3.equalsIgnoreCase("%2e%2e")) {
                                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                    arrayList.add("");
                                } else {
                                    arrayList.set(arrayList.size() - 1, "");
                                }
                                m5 = !z3 ? e6 + 1 : e6;
                            } else {
                                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, b3);
                                } else {
                                    arrayList.add(b3);
                                }
                                if (z3) {
                                    arrayList.add("");
                                }
                            }
                        }
                        if (!z3) {
                        }
                    }
                }
                if (e5 < n5 && str.charAt(e5) == '?') {
                    int f = z4.b.f(str, '#', e5, n5);
                    this.f14328h = C2674b.f(C2674b.b(e5 + 1, f, 208, str, " \"'<>#"));
                    e5 = f;
                }
                if (e5 < n5 || str.charAt(e5) != '#') {
                }
                this.i = C2674b.b(e5 + 1, n5, 176, str, "");
                return;
            }
        }
        int i8 = m5 + i6;
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            e3 = z4.b.e(i8, n5, str, "@/\\?#");
            char charAt5 = e3 != n5 ? str.charAt(e3) : (char) 65535;
            if (charAt5 == 65535 || charAt5 == c6 || charAt5 == '/' || charAt5 == '\\' || charAt5 == '?') {
                break;
            }
            if (charAt5 == '@') {
                if (z5) {
                    this.f14326e = ((String) this.f14326e) + "%40" + C2674b.b(i8, e3, 240, str, " \"':;<=>@[]^`{}|/\\?#");
                    z5 = z5;
                } else {
                    boolean z7 = z5;
                    int f5 = z4.b.f(str, ':', i8, e3);
                    String b5 = C2674b.b(i8, f5, 240, str, " \"':;<=>@[]^`{}|/\\?#");
                    if (z6) {
                        b5 = ((String) this.f14325d) + "%40" + b5;
                    }
                    this.f14325d = b5;
                    if (f5 != e3) {
                        this.f14326e = C2674b.b(f5 + 1, e3, 240, str, " \"':;<=>@[]^`{}|/\\?#");
                        z5 = true;
                    } else {
                        z5 = z7;
                    }
                    z6 = true;
                }
                i8 = e3 + 1;
                c6 = '#';
            }
        }
        int i9 = i8;
        while (true) {
            if (i9 >= e3) {
                i9 = e3;
                break;
            }
            char charAt6 = str.charAt(i9);
            if (charAt6 != '[') {
                if (charAt6 == ':') {
                    break;
                }
            } else {
                do {
                    i9++;
                    if (i9 >= e3) {
                        break;
                    }
                } while (str.charAt(i9) != ']');
            }
            i9++;
        }
        int i10 = i9 + 1;
        if (i10 < e3) {
            this.f = v.w0.f(C2674b.e(i8, i9, 4, str));
            try {
                i5 = Integer.parseInt(C2674b.b(i10, e3, 248, str, ""));
                if (1 <= i5) {
                }
            } catch (NumberFormatException unused) {
            }
            i5 = -1;
            this.f14324c = i5;
            if (i5 == -1) {
                StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                String substring2 = str.substring(i10, e3);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring2);
                sb2.append(substring2);
                sb2.append('\"');
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        } else {
            this.f = v.w0.f(C2674b.e(i8, i9, 4, str));
            String str2 = this.f14323b;
            kotlin.jvm.internal.l.c(str2);
            this.f14324c = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        }
        if (((String) this.f) == null) {
            StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
            String substring3 = str.substring(i8, i9);
            kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring3);
            sb3.append(substring3);
            sb3.append('\"');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        m5 = e3;
        e5 = z4.b.e(m5, n5, str, "?#");
        if (m5 != e5) {
        }
        if (e5 < n5) {
            int f6 = z4.b.f(str, '#', e5, n5);
            this.f14328h = C2674b.f(C2674b.b(e5 + 1, f6, 208, str, " \"'<>#"));
            e5 = f6;
        }
        if (e5 < n5) {
        }
    }

    public void d() {
        Q2.A0 a02 = (Q2.A0) this.f;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Q2.a1 a5 = Q2.a1.a();
            C0375o c0375o = C0379q.f.f5049b;
            Context context = (Context) this.f14326e;
            String str = this.f14323b;
            BinderC0610Ia binderC0610Ia = (BinderC0610Ia) this.f14328h;
            c0375o.getClass();
            Q2.K k5 = (Q2.K) new C0361h(c0375o, context, a5, str, binderC0610Ia).d(context, false);
            this.f14325d = k5;
            if (k5 != null) {
                int i = this.f14324c;
                if (i != 3) {
                    k5.K1(new Q2.d1(i));
                }
                a02.f4898j = currentTimeMillis;
                ((Q2.K) this.f14325d).P2(new BinderC0743a6((L2.a) this.f14327g, this.f14323b));
                Q2.K k6 = (Q2.K) this.f14325d;
                Q2.Z0 z02 = (Q2.Z0) this.i;
                Context context2 = (Context) this.f14326e;
                z02.getClass();
                k6.v0(Q2.Z0.a(context2, a02));
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.f14322a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                String str = this.f14323b;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f14325d).length() > 0 || ((String) this.f14326e).length() > 0) {
                    sb.append((String) this.f14325d);
                    if (((String) this.f14326e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f14326e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f;
                if (str2 != null) {
                    if (AbstractC2227e.A0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f);
                    }
                }
                int i = -1;
                if (this.f14324c != -1 || this.f14323b != null) {
                    int b3 = b();
                    String str3 = this.f14323b;
                    if (str3 != null) {
                        if (str3.equals("http")) {
                            i = 80;
                            break;
                        } else if (str3.equals("https")) {
                            i = 443;
                            break;
                        }
                    }
                    sb.append(':');
                    sb.append(b3);
                }
                ArrayList arrayList = (ArrayList) this.f14327g;
                kotlin.jvm.internal.l.f("<this>", arrayList);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i5));
                }
                if (((ArrayList) this.f14328h) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f14328h;
                    kotlin.jvm.internal.l.c(arrayList2);
                    C2674b.g(arrayList2, sb);
                }
                if (((String) this.i) != null) {
                    sb.append('#');
                    sb.append((String) this.i);
                }
                String sb2 = sb.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", sb2);
                return sb2;
            default:
                return super.toString();
        }
    }

    public C1234l6() {
        this.f14322a = 1;
        this.f14325d = "";
        this.f14326e = "";
        this.f14324c = -1;
        ArrayList arrayList = new ArrayList();
        this.f14327g = arrayList;
        arrayList.add("");
    }
}
