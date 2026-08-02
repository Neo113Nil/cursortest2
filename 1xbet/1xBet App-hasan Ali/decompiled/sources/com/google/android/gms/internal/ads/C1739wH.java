package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.wH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1739wH {

    /* renamed from: g, reason: collision with root package name */
    public static final C1589t2 f16108g = new C1589t2(13);

    /* renamed from: h, reason: collision with root package name */
    public static final C1589t2 f16109h = new C1589t2(14);

    /* renamed from: d, reason: collision with root package name */
    public int f16113d;

    /* renamed from: e, reason: collision with root package name */
    public int f16114e;
    public int f;

    /* renamed from: b, reason: collision with root package name */
    public final C1694vH[] f16111b = new C1694vH[5];

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16110a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f16112c = -1;

    public final float a() {
        int i = this.f16112c;
        ArrayList arrayList = this.f16110a;
        if (i != 0) {
            Collections.sort(arrayList, f16109h);
            this.f16112c = 0;
        }
        float f = this.f16114e;
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            float f5 = 0.5f * f;
            C1694vH c1694vH = (C1694vH) arrayList.get(i6);
            i5 += c1694vH.f16006b;
            if (i5 >= f5) {
                return c1694vH.f16007c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C1694vH) arrayList.get(arrayList.size() - 1)).f16007c;
    }

    public final void b(int i, float f) {
        C1694vH c1694vH;
        int i5 = this.f16112c;
        ArrayList arrayList = this.f16110a;
        if (i5 != 1) {
            Collections.sort(arrayList, f16108g);
            this.f16112c = 1;
        }
        int i6 = this.f;
        C1694vH[] c1694vHArr = this.f16111b;
        if (i6 > 0) {
            int i7 = i6 - 1;
            this.f = i7;
            c1694vH = c1694vHArr[i7];
        } else {
            c1694vH = new C1694vH();
        }
        int i8 = this.f16113d;
        this.f16113d = i8 + 1;
        c1694vH.f16005a = i8;
        c1694vH.f16006b = i;
        c1694vH.f16007c = f;
        arrayList.add(c1694vH);
        this.f16114e += i;
        while (true) {
            int i9 = this.f16114e;
            if (i9 <= 2000) {
                return;
            }
            int i10 = i9 - 2000;
            C1694vH c1694vH2 = (C1694vH) arrayList.get(0);
            int i11 = c1694vH2.f16006b;
            if (i11 <= i10) {
                this.f16114e -= i11;
                arrayList.remove(0);
                int i12 = this.f;
                if (i12 < 5) {
                    this.f = i12 + 1;
                    c1694vHArr[i12] = c1694vH2;
                }
            } else {
                c1694vH2.f16006b = i11 - i10;
                this.f16114e -= i10;
            }
        }
    }
}
