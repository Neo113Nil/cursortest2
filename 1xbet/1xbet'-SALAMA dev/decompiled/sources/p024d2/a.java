package p024d2;

import A1.InterfaceC0027k;
import R5.M;
import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0027k {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final M f12379y = new M(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f12382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f12383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f12384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12385f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12386x;

    public a(long j, int i7, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z4) {
        p151v2.a.f(iArr.length == uriArr.length);
        this.f12380a = j;
        this.f12381b = i7;
        this.f12383d = iArr;
        this.f12382c = uriArr;
        this.f12384e = jArr;
        this.f12385f = j3;
        this.f12386x = z4;
    }

    public final int a(int i7) {
        int i8;
        int i9 = i7 + 1;
        while (true) {
            int[] iArr = this.f12383d;
            if (i9 >= iArr.length || this.f12386x || (i8 = iArr[i9]) == 0 || i8 == 1) {
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12380a == aVar.f12380a && this.f12381b == aVar.f12381b && Arrays.equals(this.f12382c, aVar.f12382c) && Arrays.equals(this.f12383d, aVar.f12383d) && Arrays.equals(this.f12384e, aVar.f12384e) && this.f12385f == aVar.f12385f && this.f12386x == aVar.f12386x;
    }

    public final int hashCode() {
        int i7 = this.f12381b * 31;
        long j = this.f12380a;
        int iHashCode = (Arrays.hashCode(this.f12384e) + ((Arrays.hashCode(this.f12383d) + ((((i7 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f12382c)) * 31)) * 31)) * 31;
        long j3 = this.f12385f;
        return ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f12386x ? 1 : 0);
    }
}
