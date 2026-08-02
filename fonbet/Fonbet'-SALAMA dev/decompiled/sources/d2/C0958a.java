package d2;

import A1.InterfaceC0027k;
import R5.M;
import android.net.Uri;
import java.util.Arrays;
import v2.AbstractC1664a;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958a implements InterfaceC0027k {

    /* renamed from: y, reason: collision with root package name */
    public static final M f12373y = new M(20);

    /* renamed from: a, reason: collision with root package name */
    public final long f12374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12375b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f12376c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f12377d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f12378e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12379f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f12380x;

    public C0958a(long j, int i7, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z4) {
        AbstractC1664a.f(iArr.length == uriArr.length);
        this.f12374a = j;
        this.f12375b = i7;
        this.f12377d = iArr;
        this.f12376c = uriArr;
        this.f12378e = jArr;
        this.f12379f = j3;
        this.f12380x = z4;
    }

    public final int a(int i7) {
        int i8;
        int i9 = i7 + 1;
        while (true) {
            int[] iArr = this.f12377d;
            if (i9 >= iArr.length || this.f12380x || (i8 = iArr[i9]) == 0 || i8 == 1) {
                break;
            }
            i9++;
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0958a.class != obj.getClass()) {
            return false;
        }
        C0958a c0958a = (C0958a) obj;
        return this.f12374a == c0958a.f12374a && this.f12375b == c0958a.f12375b && Arrays.equals(this.f12376c, c0958a.f12376c) && Arrays.equals(this.f12377d, c0958a.f12377d) && Arrays.equals(this.f12378e, c0958a.f12378e) && this.f12379f == c0958a.f12379f && this.f12380x == c0958a.f12380x;
    }

    public final int hashCode() {
        int i7 = this.f12375b * 31;
        long j = this.f12374a;
        int hashCode = (Arrays.hashCode(this.f12378e) + ((Arrays.hashCode(this.f12377d) + ((((i7 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f12376c)) * 31)) * 31)) * 31;
        long j3 = this.f12379f;
        return ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f12380x ? 1 : 0);
    }
}
