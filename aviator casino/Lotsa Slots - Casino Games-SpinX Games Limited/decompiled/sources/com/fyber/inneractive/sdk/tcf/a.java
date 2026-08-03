package com.fyber.inneractive.sdk.tcf;

/* loaded from: classes3.dex */
public final class a {
    public java.lang.String b;
    public int d;
    public int e;
    public boolean f;
    public boolean g;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.tcf.b f4266a = new com.fyber.inneractive.sdk.tcf.b();
    public boolean c = false;

    public final void a() {
        com.fyber.inneractive.sdk.tcf.b bVar = this.f4266a;
        bVar.b += 78;
        this.d = bVar.a(12);
        this.e = this.f4266a.a(12);
        this.f4266a.b += 50;
        boolean[] zArr = new boolean[24];
        for (int i = 0; i < 24; i++) {
            zArr[i] = this.f4266a.a();
        }
        boolean z = zArr[0];
        this.g = !z;
        this.f4266a.b += 37;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int a2 = this.f4266a.a(16);
        if (this.f4266a.a()) {
            int a3 = this.f4266a.a(12);
            for (int i2 = 0; i2 < a3; i2++) {
                boolean a4 = this.f4266a.a();
                int a5 = this.f4266a.a(16);
                if (a4) {
                    int a6 = this.f4266a.a(16);
                    while (a5 <= a6) {
                        arrayList.add(java.lang.Integer.valueOf(a5));
                        a5++;
                    }
                } else {
                    arrayList.add(java.lang.Integer.valueOf(a5));
                }
            }
        } else {
            for (int i3 = 1; i3 <= a2; i3++) {
                if (this.f4266a.a()) {
                    arrayList.add(java.lang.Integer.valueOf(i3));
                }
            }
        }
        this.f = arrayList.contains(262);
    }

    public final java.lang.String toString() {
        return "GppTcf{mCmpVersion=" + this.e + ", mCmpId=" + this.d + ", mConsentStatus=" + this.f + ", mIsPurpose1Disabled=" + this.g + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }
}
