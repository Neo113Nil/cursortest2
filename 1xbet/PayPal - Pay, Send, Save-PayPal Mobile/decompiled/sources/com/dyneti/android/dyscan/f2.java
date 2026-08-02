package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class f2 {
    public static final com.dyneti.android.dyscan.d2 d = new com.dyneti.android.dyscan.d2();
    public static final com.dyneti.android.dyscan.e2 e = new com.dyneti.android.dyscan.e2();

    /* renamed from: a, reason: collision with root package name */
    public float f3302a;
    public final java.lang.String b;
    public final com.dyneti.android.dyscan.l c;

    public f2(float f, java.lang.String str, com.dyneti.android.dyscan.l lVar) {
        this.f3302a = f;
        this.b = str;
        this.c = lVar;
    }

    public final int a() {
        com.dyneti.android.dyscan.l[] lVarArr = {new com.dyneti.android.dyscan.l(0.0f, 0.0f, 0.5f, 0.5f), new com.dyneti.android.dyscan.l(0.0f, 0.5f, 0.5f, 1.0f), new com.dyneti.android.dyscan.l(0.5f, 0.0f, 1.0f, 0.5f), new com.dyneti.android.dyscan.l(0.5f, 0.5f, 1.0f, 1.0f)};
        double d2 = 0.0d;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            double a2 = com.dyneti.android.dyscan.l.a(lVarArr[i2], this.c);
            if (a2 > d2) {
                i = i2;
                d2 = a2;
            }
        }
        return i;
    }
}
