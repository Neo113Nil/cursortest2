package F4;

import com.google.protobuf.AbstractC0867k;
import java.math.RoundingMode;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f2745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i7) {
        super(4);
        this.f2744d = i7;
        this.f2745e = cVar;
    }

    @Override // p113p3.f
    public final void d0(AbstractC0867k abstractC0867k) {
        switch (this.f2744d) {
            case 0:
                e eVar = this.f2745e.f2746a;
                for (int i7 = 0; i7 < abstractC0867k.size(); i7++) {
                    eVar.b(abstractC0867k.t(i7));
                }
                eVar.d((byte) 0);
                eVar.d((byte) 1);
                break;
            default:
                e eVar2 = this.f2745e.f2746a;
                for (int i8 = 0; i8 < abstractC0867k.size(); i8++) {
                    eVar2.c(abstractC0867k.t(i8));
                }
                eVar2.e((byte) 0);
                eVar2.e((byte) 1);
                break;
        }
    }

    @Override // p113p3.f
    public final void e0(double d7) {
        switch (this.f2744d) {
            case 0:
                e eVar = this.f2745e.f2746a;
                long jDoubleToLongBits = Double.doubleToLongBits(d7);
                long j = jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE);
                int iU = Q0.a.u(64 - Long.numberOfLeadingZeros(j), 8, RoundingMode.UP);
                eVar.a(iU + 1);
                byte[] bArr = eVar.f2751a;
                int i7 = eVar.f2752b;
                int i8 = i7 + 1;
                eVar.f2752b = i8;
                bArr[i7] = (byte) iU;
                int i9 = i8 + iU;
                while (true) {
                    i9--;
                    int i10 = eVar.f2752b;
                    if (i9 < i10) {
                        eVar.f2752b = i10 + iU;
                    } else {
                        eVar.f2751a[i9] = (byte) (255 & j);
                        j >>>= 8;
                    }
                    break;
                }
                break;
            default:
                e eVar2 = this.f2745e.f2746a;
                long jDoubleToLongBits2 = Double.doubleToLongBits(d7);
                long j3 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 < 0 ? -1L : Long.MIN_VALUE);
                int iU2 = Q0.a.u(64 - Long.numberOfLeadingZeros(j3), 8, RoundingMode.UP);
                eVar2.a(iU2 + 1);
                byte[] bArr2 = eVar2.f2751a;
                int i11 = eVar2.f2752b;
                int i12 = i11 + 1;
                eVar2.f2752b = i12;
                bArr2[i11] = (byte) (~iU2);
                int i13 = i12 + iU2;
                while (true) {
                    i13--;
                    int i14 = eVar2.f2752b;
                    if (i13 < i14) {
                        eVar2.f2752b = i14 + iU2;
                    } else {
                        eVar2.f2751a[i13] = (byte) (~(255 & j3));
                        j3 >>>= 8;
                    }
                    break;
                }
                break;
        }
    }

    @Override // p113p3.f
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

    @Override // p113p3.f
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

    @Override // p113p3.f
    public final void h0(String str) {
        switch (this.f2744d) {
            case 0:
                e eVar = this.f2745e.f2746a;
                int length = str.length();
                int i7 = 0;
                while (i7 < length) {
                    char cCharAt = str.charAt(i7);
                    if (cCharAt < 128) {
                        eVar.b((byte) cCharAt);
                    } else if (cCharAt < 2048) {
                        eVar.b((byte) ((cCharAt >>> 6) | 960));
                        eVar.b((byte) ((cCharAt & '?') | 128));
                    } else if (cCharAt < 55296 || 57343 < cCharAt) {
                        eVar.b((byte) ((cCharAt >>> '\f') | 480));
                        eVar.b((byte) (((cCharAt >>> 6) & 63) | 128));
                        eVar.b((byte) ((cCharAt & '?') | 128));
                    } else {
                        int iCodePointAt = Character.codePointAt(str, i7);
                        i7++;
                        eVar.b((byte) ((iCodePointAt >>> 18) | 240));
                        eVar.b((byte) (((iCodePointAt >>> 12) & 63) | 128));
                        eVar.b((byte) (((iCodePointAt >>> 6) & 63) | 128));
                        eVar.b((byte) ((iCodePointAt & 63) | 128));
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
                    char cCharAt2 = str.charAt(i8);
                    if (cCharAt2 < 128) {
                        eVar2.c((byte) cCharAt2);
                    } else if (cCharAt2 < 2048) {
                        eVar2.c((byte) ((cCharAt2 >>> 6) | 960));
                        eVar2.c((byte) ((cCharAt2 & '?') | 128));
                    } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                        eVar2.c((byte) ((cCharAt2 >>> '\f') | 480));
                        eVar2.c((byte) (((cCharAt2 >>> 6) & 63) | 128));
                        eVar2.c((byte) ((cCharAt2 & '?') | 128));
                    } else {
                        int iCodePointAt2 = Character.codePointAt(str, i8);
                        i8++;
                        eVar2.c((byte) ((iCodePointAt2 >>> 18) | 240));
                        eVar2.c((byte) (((iCodePointAt2 >>> 12) & 63) | 128));
                        eVar2.c((byte) (((iCodePointAt2 >>> 6) & 63) | 128));
                        eVar2.c((byte) ((iCodePointAt2 & 63) | 128));
                    }
                    i8++;
                }
                eVar2.e((byte) 0);
                eVar2.e((byte) 1);
                break;
        }
    }
}
