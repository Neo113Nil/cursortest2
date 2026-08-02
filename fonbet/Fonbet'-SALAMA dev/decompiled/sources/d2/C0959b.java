package d2;

import A1.InterfaceC0027k;
import R5.M;
import android.net.Uri;
import java.util.Arrays;
import v2.t;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959b implements InterfaceC0027k {

    /* renamed from: f, reason: collision with root package name */
    public static final C0959b f12381f = new C0959b(new C0958a[0], 0, -9223372036854775807L, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final C0958a f12382x;

    /* renamed from: y, reason: collision with root package name */
    public static final M f12383y;

    /* renamed from: a, reason: collision with root package name */
    public final int f12384a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12385b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12386c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12387d;

    /* renamed from: e, reason: collision with root package name */
    public final C0958a[] f12388e;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, -9223372036854775807L);
        f12382x = new C0958a(0L, 0, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2, 0L, false);
        f12383y = new M(19);
    }

    public C0959b(C0958a[] c0958aArr, long j, long j3, int i7) {
        this.f12385b = j;
        this.f12386c = j3;
        this.f12384a = c0958aArr.length + i7;
        this.f12388e = c0958aArr;
        this.f12387d = i7;
    }

    public final C0958a a(int i7) {
        int i8 = this.f12387d;
        return i7 < i8 ? f12382x : this.f12388e[i7 - i8];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0959b.class != obj.getClass()) {
            return false;
        }
        C0959b c0959b = (C0959b) obj;
        return t.a(null, null) && this.f12384a == c0959b.f12384a && this.f12385b == c0959b.f12385b && this.f12386c == c0959b.f12386c && this.f12387d == c0959b.f12387d && Arrays.equals(this.f12388e, c0959b.f12388e);
    }

    public final int hashCode() {
        return (((((((this.f12384a * 961) + ((int) this.f12385b)) * 31) + ((int) this.f12386c)) * 31) + this.f12387d) * 31) + Arrays.hashCode(this.f12388e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f12385b);
        sb.append(", adGroups=[");
        int i7 = 0;
        while (true) {
            C0958a[] c0958aArr = this.f12388e;
            if (i7 >= c0958aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(c0958aArr[i7].f12374a);
            sb.append(", ads=[");
            for (int i8 = 0; i8 < c0958aArr[i7].f12377d.length; i8++) {
                sb.append("ad(state=");
                int i9 = c0958aArr[i7].f12377d[i8];
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
                sb.append(c0958aArr[i7].f12378e[i8]);
                sb.append(')');
                if (i8 < c0958aArr[i7].f12377d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i7 < c0958aArr.length - 1) {
                sb.append(", ");
            }
            i7++;
        }
    }
}
