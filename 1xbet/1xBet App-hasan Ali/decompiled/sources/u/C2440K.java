package u;

import com.google.android.gms.internal.ads.C0580Dh;
import java.util.Arrays;
import r.C2342u;
import r.C2343v;
import s.AbstractC2351a;

/* renamed from: u.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2440K implements InterfaceC2476x {

    /* renamed from: a, reason: collision with root package name */
    public final C2.h f19685a;

    public C2440K(C2.h hVar) {
        this.f19685a = hVar;
    }

    @Override // u.InterfaceC2476x, u.InterfaceC2464k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C0580Dh a(A0 a02) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        C2.h hVar = this.f19685a;
        C2343v c2343v = (C2343v) hVar.f834m;
        C2342u c2342u = new C2342u(c2343v.f19015e + 2);
        C2343v c2343v2 = new C2343v(c2343v.f19015e);
        int[] iArr3 = c2343v.f19012b;
        Object[] objArr3 = c2343v.f19013c;
        long[] jArr = c2343v.f19011a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j5 & 255) < 128) {
                            int i9 = (i5 << 3) + i8;
                            int i10 = iArr3[i9];
                            i = i6;
                            C2439J c2439j = (C2439J) objArr3[i9];
                            c2342u.a(i10);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c2343v2.g(i10, new F0((AbstractC2470q) a02.f19643a.c(c2439j.f19683a), c2439j.f19684b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i6;
                        }
                        j5 >>= i;
                        i8++;
                        iArr3 = iArr2;
                        i6 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i7 != i6) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c2343v.a(0)) {
            int i11 = c2342u.f19051b;
            if (i11 < 0) {
                AbstractC2351a.d("Index must be between 0 and size");
                throw null;
            }
            c2342u.b(i11 + 1);
            int[] iArr4 = c2342u.f19050a;
            int i12 = c2342u.f19051b;
            if (i12 != 0) {
                X3.l.s0(1, 0, i12, iArr4, iArr4);
            }
            iArr4[0] = 0;
            c2342u.f19051b++;
        }
        if (!c2343v.a(hVar.f833l)) {
            c2342u.a(hVar.f833l);
        }
        int i13 = c2342u.f19051b;
        if (i13 != 0) {
            int[] iArr5 = c2342u.f19050a;
            kotlin.jvm.internal.l.f("<this>", iArr5);
            Arrays.sort(iArr5, 0, i13);
        }
        return new C0580Dh(c2342u, c2343v2, hVar.f833l, AbstractC2478z.f19971b);
    }
}
