package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e9 {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f3616c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final e9 f3617d;

    /* renamed from: e, reason: collision with root package name */
    public static final e9 f3618e;
    public static final e9 f;

    /* renamed from: g, reason: collision with root package name */
    public static final e9 f3619g;

    /* renamed from: h, reason: collision with root package name */
    public static final e9 f3620h;

    /* renamed from: i, reason: collision with root package name */
    public static final e9 f3621i;

    /* renamed from: j, reason: collision with root package name */
    public static final e9 f3622j;

    /* renamed from: k, reason: collision with root package name */
    public static final e9 f3623k;

    /* renamed from: l, reason: collision with root package name */
    public static final e9 f3624l;

    /* renamed from: m, reason: collision with root package name */
    public static final e9 f3625m;

    /* renamed from: n, reason: collision with root package name */
    public static final e9 f3626n;

    /* renamed from: o, reason: collision with root package name */
    public static final e9 f3627o;

    /* renamed from: p, reason: collision with root package name */
    public static final e9 f3628p;

    /* renamed from: a, reason: collision with root package name */
    public final String f3629a;

    /* renamed from: b, reason: collision with root package name */
    public final g9 f3630b;

    static {
        f9 f9Var = new f9();
        f9Var.f3681b = 23;
        f9Var.f3682c = 50;
        f9Var.f3683d = true;
        i9 i9Var = new i9();
        String[] strArr = {"initialize"};
        ArrayList arrayList = i9Var.f3860a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            i9Var.f3860a = arrayList;
        }
        String str = strArr[0];
        if (str != null) {
            arrayList.add(str);
        }
        i9 a3 = i9Var.a("value");
        a3.f3863d = "8h";
        f9 a4 = f9Var.a(new j9(a3));
        i9 a5 = new i9().a("value", "details");
        a5.f3863d = "30m";
        f9 a6 = a4.a(new j9(a5));
        i9 i9Var2 = new i9();
        String[] strArr2 = {"CNS.shown", "CNS.closed"};
        ArrayList arrayList2 = i9Var2.f3861b;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            i9Var2.f3861b = arrayList2;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            String str2 = strArr2[i3];
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        i9 a7 = i9Var2.a("value");
        a7.f3863d = "10s";
        f9 a8 = a6.a(new j9(a7));
        a8.f3684e = "2h";
        a8.f = "2s";
        f3617d = new e9("general", new g9(a8));
        f9 f9Var2 = new f9();
        f9Var2.f3681b = 17;
        f9Var2.f3682c = 20;
        f9Var2.f3683d = true;
        i9 i9Var3 = new i9();
        String[] strArr3 = {"fake_click"};
        ArrayList arrayList3 = i9Var3.f3861b;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            i9Var3.f3861b = arrayList3;
        }
        String str3 = strArr3[0];
        if (str3 != null) {
            arrayList3.add(str3);
        }
        i9 a9 = i9Var3.a("appActivity", "value", "details");
        a9.f3863d = "30m";
        f9 a10 = f9Var2.a(new j9(a9));
        i9 i9Var4 = new i9();
        String[] strArr4 = {"fake_click"};
        ArrayList arrayList4 = i9Var4.f3861b;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            i9Var4.f3861b = arrayList4;
        }
        String str4 = strArr4[0];
        if (str4 != null) {
            arrayList4.add(str4);
        }
        i9 a11 = i9Var4.a("appActivity", "value");
        a11.f3863d = "10s";
        f9 a12 = a10.a(new j9(a11));
        a12.f3684e = "4h";
        a12.f = "5s";
        f3618e = new e9("error", new g9(a12));
        f9 f9Var3 = new f9();
        f9Var3.f3680a = 0.0d;
        f9Var3.f3681b = 17;
        f9Var3.f3682c = 30;
        f9Var3.f3683d = true;
        i9 a13 = new i9().a("appActivity", "value", "details");
        a13.f3863d = "12h";
        f9 a14 = f9Var3.a(new j9(a13));
        i9 a15 = new i9().a("appActivity", "value");
        a15.f3863d = "1h";
        f9 a16 = a14.a(new j9(a15));
        a16.f3684e = "1d";
        a16.f = "5s";
        g9 g9Var = new g9(a16);
        f = new e9("exception", g9Var);
        new e9("exception_nt", g9Var);
        f9 f9Var4 = new f9();
        f9Var4.f3681b = 17;
        f9Var4.f3682c = 40;
        f9Var4.f3683d = true;
        i9 a17 = new i9().a("value", "details");
        a17.f3863d = "1h";
        f9 a18 = f9Var4.a(new j9(a17));
        a18.f3684e = "2d";
        a18.f = "5s";
        f3619g = new e9("exception_fatal", new g9(a18));
        f3620h = new e9("anr", g9Var);
        f9 f9Var5 = new f9();
        f9Var5.f3680a = 0.0d;
        f9Var5.f3681b = 17;
        f9Var5.f3682c = 10;
        f9Var5.f3683d = false;
        f9Var5.f = "10s";
        new e9("netdiag", new g9(f9Var5));
        f9 f9Var6 = new f9();
        f9Var6.f3681b = 3007;
        f9Var6.f3682c = 90;
        f9Var6.f3683d = true;
        i9 a19 = new i9().a("service");
        a19.f3863d = "1m";
        f9 a20 = f9Var6.a(new j9(a19));
        a20.f3684e = "1h";
        f3621i = new e9("periodic", new g9(a20));
        f9 f9Var7 = new f9();
        f9Var7.f3682c = 90;
        f9Var7.f3683d = true;
        f9Var7.f3684e = "4h";
        f3622j = new e9("nonimpression", new g9(f9Var7));
        f9 f9Var8 = new f9();
        f9Var8.f3681b = 17;
        f9Var8.f3682c = 10;
        f9Var8.f3683d = true;
        f9Var8.f3684e = "4h";
        f3623k = new e9("impression_responses", new g9(f9Var8));
        f9 f9Var9 = new f9();
        f9Var9.f3680a = 0.0d;
        f9Var9.f3681b = 17;
        f9Var9.f3682c = 60;
        f9Var9.f3683d = true;
        f9Var9.f3684e = "1d";
        f9Var9.f = "5s";
        f3624l = new e9("success_smart_redirect_hop_info", new g9(f9Var9));
        f9 f9Var10 = new f9();
        f9Var10.f3681b = 17;
        f9Var10.f3682c = 70;
        f9Var10.f3683d = false;
        new e9("triggeredLink", new g9(f9Var10));
        f9 f9Var11 = new f9();
        f9Var11.f3681b = 23;
        f9Var11.f3682c = 80;
        f9Var11.f3683d = true;
        f9Var11.f3684e = "1d";
        f3625m = new e9("ct", new g9(f9Var11));
        f9 f9Var12 = new f9();
        f9Var12.f3681b = 23;
        f9Var12.f3682c = 80;
        f9Var12.f3683d = true;
        f9Var12.f3684e = "1d";
        f3626n = new e9("lt", new g9(f9Var12));
        f9 f9Var13 = new f9();
        f9Var13.f3681b = 23;
        f9Var13.f3682c = 80;
        f9Var13.f3683d = true;
        f9Var13.f3684e = "1d";
        f3627o = new e9("nir", new g9(f9Var13));
        f9 f9Var14 = new f9();
        f9Var14.f3681b = 19;
        f9Var14.f3682c = 10;
        f9Var14.f3683d = true;
        f9Var14.f3684e = "12h";
        f3628p = new e9("sensors", new g9(f9Var14));
    }

    public e9(String str, g9 g9Var) {
        this.f3629a = str;
        this.f3630b = g9Var;
        f3616c.put(str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e9.class != obj.getClass()) {
            return false;
        }
        return si.a((Object) this.f3629a, (Object) ((e9) obj).f3629a);
    }

    public final int hashCode() {
        return this.f3629a.hashCode();
    }

    public final String toString() {
        return this.f3629a;
    }
}
