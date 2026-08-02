package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832c6 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0832c6 f12972b = new C0832c6(new C0736a[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final C0736a f12973c;

    /* renamed from: a, reason: collision with root package name */
    public final C0736a[] f12974a;

    static {
        C0736a c0736a = new C0736a(-1, new int[0], new Q3[0], new long[0]);
        int[] iArr = c0736a.f12552d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0736a.f12553e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f12973c = new C0736a(0, copyOf, (Q3[]) Arrays.copyOf(c0736a.f12551c, 0), copyOf2);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C0832c6(C0736a[] c0736aArr) {
        this.f12974a = c0736aArr;
    }

    public final C0736a a(int i) {
        return i < 0 ? f12973c : this.f12974a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0832c6.class == obj.getClass() && Arrays.equals(this.f12974a, ((C0832c6) obj).f12974a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12974a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return L1.a.m("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
