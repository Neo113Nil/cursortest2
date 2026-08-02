package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682Sc {

    /* renamed from: a, reason: collision with root package name */
    public final int f11532a;

    /* renamed from: b, reason: collision with root package name */
    public final C1292mb f11533b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11534c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f11535d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f11536e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C0682Sc(C1292mb c1292mb, boolean z3, int[] iArr, boolean[] zArr) {
        int i = c1292mb.f14495a;
        this.f11532a = i;
        AbstractC1668us.S(i == iArr.length && i == zArr.length);
        this.f11533b = c1292mb;
        this.f11534c = z3 && i > 1;
        this.f11535d = (int[]) iArr.clone();
        this.f11536e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0682Sc.class == obj.getClass()) {
            C0682Sc c0682Sc = (C0682Sc) obj;
            if (this.f11534c == c0682Sc.f11534c && this.f11533b.equals(c0682Sc.f11533b) && Arrays.equals(this.f11535d, c0682Sc.f11535d) && Arrays.equals(this.f11536e, c0682Sc.f11536e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11536e) + ((Arrays.hashCode(this.f11535d) + (((this.f11533b.hashCode() * 31) + (this.f11534c ? 1 : 0)) * 31)) * 31);
    }
}
