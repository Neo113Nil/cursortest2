package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.l f3299a;
    public final java.util.ArrayList b;
    public final com.dyneti.android.dyscan.l[] c;
    public final java.util.ArrayList d = new java.util.ArrayList();
    public final boolean e;
    public final boolean f;

    public e0(java.util.ArrayList arrayList, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.b = arrayList;
        this.e = bool.booleanValue();
        this.f = bool2.booleanValue();
        java.util.Iterator it = arrayList.iterator();
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        while (it.hasNext()) {
            com.dyneti.android.dyscan.l lVar = ((com.dyneti.android.dyscan.d0) it.next()).f3296a;
            float f5 = lVar.f3318a;
            f4 = f5 < f4 ? f5 : f4;
            float f6 = lVar.b;
            f3 = f6 > f3 ? f6 : f3;
            float f7 = lVar.c;
            f = f7 < f ? f7 : f;
            float f8 = lVar.d;
            if (f8 > f2) {
                f2 = f8;
            }
        }
        this.f3299a = new com.dyneti.android.dyscan.l(f, f4, f2, f3);
        if (!bool2.booleanValue()) {
            if (bool.booleanValue()) {
                java.util.Collections.sort(arrayList, com.dyneti.android.dyscan.d0.f);
            } else {
                java.util.Collections.sort(arrayList, com.dyneti.android.dyscan.d0.e);
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            com.dyneti.android.dyscan.d0 d0Var = (com.dyneti.android.dyscan.d0) it2.next();
            this.d.add(d0Var.b);
            i2 += d0Var.b.length();
        }
        this.c = new com.dyneti.android.dyscan.l[i2];
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            java.util.Iterator it4 = ((com.dyneti.android.dyscan.d0) it3.next()).c.iterator();
            while (it4.hasNext()) {
                this.c[i] = (com.dyneti.android.dyscan.l) it4.next();
                i++;
            }
        }
    }
}
