package com.fyber.inneractive.sdk.tcf;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class a {
    public String b;
    public int d;
    public int e;
    public boolean f;
    public boolean g;

    /* renamed from: a, reason: collision with root package name */
    public final b f5923a = new b();
    public boolean c = false;

    public final void a() {
        b bVar = this.f5923a;
        bVar.b += 78;
        this.d = bVar.a(12);
        this.e = this.f5923a.a(12);
        this.f5923a.b += 50;
        boolean[] zArr = new boolean[24];
        for (int i = 0; i < 24; i++) {
            zArr[i] = this.f5923a.a();
        }
        boolean z = zArr[0];
        this.g = !z;
        this.f5923a.b += 37;
        ArrayList arrayList = new ArrayList();
        int a2 = this.f5923a.a(16);
        if (this.f5923a.a()) {
            int a3 = this.f5923a.a(12);
            for (int i2 = 0; i2 < a3; i2++) {
                boolean a4 = this.f5923a.a();
                int a5 = this.f5923a.a(16);
                if (a4) {
                    int a6 = this.f5923a.a(16);
                    while (a5 <= a6) {
                        arrayList.add(Integer.valueOf(a5));
                        a5++;
                    }
                } else {
                    arrayList.add(Integer.valueOf(a5));
                }
            }
        } else {
            for (int i3 = 1; i3 <= a2; i3++) {
                if (this.f5923a.a()) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
        }
        this.f = arrayList.contains(262);
    }

    public final String toString() {
        return "GppTcf{mCmpVersion=" + this.e + ", mCmpId=" + this.d + ", mConsentStatus=" + this.f + ", mIsPurpose1Disabled=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }
}
