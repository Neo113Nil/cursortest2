package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class d0 {
    public static final com.dyneti.android.dyscan.b0 e = new com.dyneti.android.dyscan.b0();
    public static final com.dyneti.android.dyscan.c0 f = new com.dyneti.android.dyscan.c0();

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.l f3296a;
    public final java.lang.String b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;

    public d0(java.util.ArrayList arrayList) {
        this.d = arrayList;
        java.util.Iterator it = arrayList.iterator();
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        while (it.hasNext()) {
            com.dyneti.android.dyscan.l lVar = ((com.dyneti.android.dyscan.f2) it.next()).c;
            float f6 = lVar.f3318a;
            f5 = f6 < f5 ? f6 : f5;
            float f7 = lVar.b;
            f4 = f7 > f4 ? f7 : f4;
            float f8 = lVar.c;
            f2 = f8 < f2 ? f8 : f2;
            float f9 = lVar.d;
            if (f9 > f3) {
                f3 = f9;
            }
        }
        this.f3296a = new com.dyneti.android.dyscan.l(f2, f5, f3, f4);
        java.util.Collections.sort(arrayList, com.dyneti.android.dyscan.f2.d);
        this.c = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        java.lang.String str = "";
        while (it2.hasNext()) {
            com.dyneti.android.dyscan.f2 f2Var = (com.dyneti.android.dyscan.f2) it2.next();
            str = str.concat(f2Var.b);
            this.c.add(f2Var.c);
        }
        this.b = str;
    }
}
