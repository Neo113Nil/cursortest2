package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736a {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f12549a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f12550b;

    /* renamed from: c, reason: collision with root package name */
    public final Q3[] f12551c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f12552d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f12553e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
    }

    public C0736a(int i, int[] iArr, Q3[] q3Arr, long[] jArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = q3Arr.length;
        int i5 = 0;
        AbstractC1668us.S(length == length2);
        this.f12549a = i;
        this.f12552d = iArr;
        this.f12551c = q3Arr;
        this.f12553e = jArr;
        this.f12550b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f12550b;
            if (i5 >= uriArr.length) {
                return;
            }
            Q3 q32 = q3Arr[i5];
            if (q32 == null) {
                uri = null;
            } else {
                C1859z2 c1859z2 = q32.f11161b;
                c1859z2.getClass();
                uri = c1859z2.f16540a;
            }
            uriArr[i5] = uri;
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0736a.class == obj.getClass()) {
            C0736a c0736a = (C0736a) obj;
            if (this.f12549a == c0736a.f12549a && Arrays.equals(this.f12551c, c0736a.f12551c) && Arrays.equals(this.f12552d, c0736a.f12552d) && Arrays.equals(this.f12553e, c0736a.f12553e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f12553e) + ((Arrays.hashCode(this.f12552d) + ((Arrays.hashCode(this.f12551c) + (((this.f12549a * 31) - 1) * 961)) * 31)) * 31)) * 961;
    }
}
