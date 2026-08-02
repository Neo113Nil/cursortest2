package F4;

import com.google.protobuf.AbstractC0911k;
import java.math.RoundingMode;
import p3.f;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f2745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i7) {
        super(4);
        this.f2744d = i7;
        this.f2745e = cVar;
    }

    @Override // p3.f
    public final void d0(AbstractC0911k abstractC0911k) {
        switch (this.f2744d) {
            case 0:
                e eVar = this.f2745e.f2746a;
                for (int i7 = 0; i7 < abstractC0911k.size(); i7++) {
                    eVar.b(abstractC0911k.t(i7));
                }
                eVar.d((byte) 0);
                eVar.d((byte) 1);
                break;
            default:
                e eVar2 = this.f2745e.f2746a;
                for (int i8 = 0; i8 < abstractC0911k.size(); i8++) {
                    eVar2.c(abstractC0911k.t(i8));
                }
                eVar2.e((byte) 0);
                eVar2.e((byte) 1);
                break;
        }
    }

    @Override // p3.f
    public final void e0(double d7) {
        switch (this.f2744d) {
            case 0:
                e eVar = this.f2745e.f2746a;
                long doubleToLongBits = Double.doubleToLongBits(d7);
                long j = doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE);
                int u4 = Q0.a.u(64 - Long.numberOfLeadingZeros(j), 8, RoundingMode.UP);
                eVar.a(u4 + 1);
                byte[] bArr = eVar.f2751a;
                int i7 = eVar.f2752b;
                int i8 = i7 + 1;
                eVar.f2752b = i8;
                bArr[i7] = (byte) u4;
                int i9 = i8 + u4;
                while (true) {
                    i9--;
                    int i10 = eVar.f2752b;
                    if (i9 < i10) {
                        eVar.f2752b = i10 + u4;
                        break;
                    } else {
                        eVar.f2751a[i9] = (byte) (255 & j);
                        j >>>= 8;
                    }
                }
            default:
                e eVar2 = this.f2745e.f2746a;
                long doubleToLongBits2 = Double.doubleToLongBits(d7);
                long j3 = doubleToLongBits2 ^ (doubleToLongBits2 < 0 ? -1L : Long.MIN_VALUE);
                int u7 = Q0.a.u(64 - Long.numberOfLeadingZeros(j3), 8, RoundingMode.UP);
                eVar2.a(u7 + 1);
                byte[] bArr2 = eVar2.f2751a;
                int i11 = eVar2.f2752b;
                int i12 = i11 + 1;
                eVar2.f2752b = i12;
                bArr2[i11] = (byte) (~u7);
                int i13 = i12 + u7;
                while (true) {
                    i13--;
                    int i14 = eVar2.f2752b;
                    if (i13 < i14) {
                        eVar2.f2752b = i14 + u7;
                        break;
                    } else {
                        eVar2.f2751a[i13] = (byte) (~(255 & j3));
                        j3 >>>= 8;
                    }
                }
        }
    }

    @Override // p3.f
    public final void f0() {
        switch (this.f2744d) {
            case 0:
                e eVar = this.f2745e.f2746a;
                eVar.d((byte) -1);
                eVar.d((byte) -1);
                break;
            default:
                e eVar2 = this.f2745e.f2746a;
                eVar2.e((byte) -1);
                eVar2.e((byte) -1);
                break;
        }
    }

    @Override // p3.f
    public final void g0(long j) {
        switch (this.f2744d) {
            case 0:
                this.f2745e.f2746a.f(j);
                break;
            default:
                this.f2745e.f2746a.f(~j);
                break;
        }
    }

    @Override // p3.f
    public final void h0(String str) {
        switch (this.f2744d) {
            case 0:
                e eVar = this.f2745e.f2746a;
                int length = str.length();
                int i7 = 0;
                while (i7 < length) {
                    char charAt = str.charAt(i7);
                    if (charAt < 128) {
                        eVar.b((byte) charAt);
                    } else if (charAt < 2048) {
                        eVar.b((byte) ((charAt >>> 6) | 960));
                        eVar.b((byte) ((charAt & '?') | 128));
                    } else if (charAt < 55296 || 57343 < charAt) {
                        eVar.b((byte) ((charAt >>> '\f') | 480));
                        eVar.b((byte) (((charAt >>> 6) & 63) | 128));
                        eVar.b((byte) ((charAt & '?') | 128));
                    } else {
                        int codePointAt = Character.codePointAt(str, i7);
                        i7++;
                        eVar.b((byte) ((codePointAt >>> 18) | 240));
                        eVar.b((byte) (((codePointAt >>> 12) & 63) | 128));
                        eVar.b((byte) (((codePointAt >>> 6) & 63) | 128));
                        eVar.b((byte) ((codePointAt & 63) | 128));
                    }
                    i7++;
                }
                eVar.d((byte) 0);
                eVar.d((byte) 1);
                break;
            default:
                e eVar2 = this.f2745e.f2746a;
                int length2 = str.length();
                int i8 = 0;
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 128) {
                        eVar2.c((byte) charAt2);
                    } else if (charAt2 < 2048) {
                        eVar2.c((byte) ((charAt2 >>> 6) | 960));
                        eVar2.c((byte) ((charAt2 & '?') | 128));
                    } else if (charAt2 < 55296 || 57343 < charAt2) {
                        eVar2.c((byte) ((charAt2 >>> '\f') | 480));
                        eVar2.c((byte) (((charAt2 >>> 6) & 63) | 128));
                        eVar2.c((byte) ((charAt2 & '?') | 128));
                    } else {
                        int codePointAt2 = Character.codePointAt(str, i8);
                        i8++;
                        eVar2.c((byte) ((codePointAt2 >>> 18) | 240));
                        eVar2.c((byte) (((codePointAt2 >>> 12) & 63) | 128));
                        eVar2.c((byte) (((codePointAt2 >>> 6) & 63) | 128));
                        eVar2.c((byte) ((codePointAt2 & 63) | 128));
                    }
                    i8++;
                }
                eVar2.e((byte) 0);
                eVar2.e((byte) 1);
                break;
        }
    }
}
