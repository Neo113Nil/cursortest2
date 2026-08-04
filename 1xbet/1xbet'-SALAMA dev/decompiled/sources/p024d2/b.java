package p024d2;

import A1.InterfaceC0027k;
import R5.M;
import android.net.Uri;
import java.util.Arrays;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0027k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f12387f = new b(new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f12388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final M f12389y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a[] f12394e;

    static {
        int iMax = Math.max(0, 0);
        int[] iArrCopyOf = Arrays.copyOf(new int[0], iMax);
        Arrays.fill(iArrCopyOf, 0, iMax, 0);
        int iMax2 = Math.max(0, 0);
        long[] jArrCopyOf = Arrays.copyOf(new long[0], iMax2);
        Arrays.fill(jArrCopyOf, 0, iMax2, -9223372036854775807L);
        f12388x = new a(0L, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), jArrCopyOf, 0L, false);
        f12389y = new M(19);
    }

    public b(a[] aVarArr, long j, long j3, int i7) {
        this.f12391b = j;
        this.f12392c = j3;
        this.f12390a = aVarArr.length + i7;
        this.f12394e = aVarArr;
        this.f12393d = i7;
    }

    public final a a(int i7) {
        int i8 = this.f12393d;
        return i7 < i8 ? f12388x : this.f12394e[i7 - i8];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return t.a(null, null) && this.f12390a == bVar.f12390a && this.f12391b == bVar.f12391b && this.f12392c == bVar.f12392c && this.f12393d == bVar.f12393d && Arrays.equals(this.f12394e, bVar.f12394e);
    }

    public final int hashCode() {
        return (((((((this.f12390a * 961) + ((int) this.f12391b)) * 31) + ((int) this.f12392c)) * 31) + this.f12393d) * 31) + Arrays.hashCode(this.f12394e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f12391b);
        sb.append(", adGroups=[");
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f12394e;
            if (i7 >= aVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(aVarArr[i7].f12380a);
            sb.append(", ads=[");
            for (int i8 = 0; i8 < aVarArr[i7].f12383d.length; i8++) {
                sb.append("ad(state=");
                int i9 = aVarArr[i7].f12383d[i8];
                if (i9 == 0) {
                    sb.append('_');
                } else if (i9 == 1) {
                    sb.append('R');
                } else if (i9 == 2) {
                    sb.append('S');
                } else if (i9 == 3) {
                    sb.append('P');
                } else if (i9 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(aVarArr[i7].f12384e[i8]);
                sb.append(')');
                if (i8 < aVarArr[i7].f12383d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i7 < aVarArr.length - 1) {
                sb.append(", ");
            }
            i7++;
        }
    }
}
