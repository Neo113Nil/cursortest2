package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375oC {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1464qB f14782a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14783b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f14784c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14785d;

    public C1375oC(AbstractC1464qB abstractC1464qB, String str, Object[] objArr) {
        this.f14782a = abstractC1464qB;
        this.f14783b = str;
        this.f14784c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f14785d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i5 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 < 55296) {
                this.f14785d = i | (charAt2 << i5);
                return;
            } else {
                i |= (charAt2 & 8191) << i5;
                i5 += 13;
                i6 = i7;
            }
        }
    }

    public final int a() {
        int i = this.f14785d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
