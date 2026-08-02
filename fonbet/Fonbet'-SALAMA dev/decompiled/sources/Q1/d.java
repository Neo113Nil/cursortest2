package Q1;

import A1.C0045t0;
import C1.C0095a;
import E4.y;
import F1.h;
import F1.k;
import F1.l;
import F1.m;
import F1.v;
import android.util.Log;
import android.util.Pair;
import v2.AbstractC1664a;
import v2.t;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public m f5778a;

    /* renamed from: b, reason: collision with root package name */
    public v f5779b;

    /* renamed from: c, reason: collision with root package name */
    public int f5780c;

    /* renamed from: d, reason: collision with root package name */
    public long f5781d;

    /* renamed from: e, reason: collision with root package name */
    public b f5782e;

    /* renamed from: f, reason: collision with root package name */
    public int f5783f;

    /* renamed from: g, reason: collision with root package name */
    public long f5784g;

    @Override // F1.k
    public final boolean a(l lVar) {
        return p3.f.j((h) lVar);
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f5778a = mVar;
        this.f5779b = mVar.r(0, 1);
        mVar.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bc  */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(l lVar, y yVar) {
        byte[] bArr;
        int v6;
        int i7;
        AbstractC1664a.i(this.f5779b);
        int i8 = t.f17153a;
        int i9 = this.f5780c;
        if (i9 == 0) {
            AbstractC1664a.h(((h) lVar).f2534d == 0);
            int i10 = this.f5783f;
            if (i10 != -1) {
                ((h) lVar).q(i10);
                this.f5780c = 4;
            } else {
                h hVar = (h) lVar;
                if (!p3.f.j(hVar)) {
                    throw C0045t0.a(null, "Unsupported or unrecognized wav file type.");
                }
                hVar.q((int) (hVar.d() - hVar.f2534d));
                this.f5780c = 1;
            }
            return 0;
        }
        long j = -1;
        if (i9 == 1) {
            C0095a c0095a = new C0095a(8);
            h hVar2 = (h) lVar;
            e b7 = e.b(hVar2, c0095a);
            if (b7.f5785a != 1685272116) {
                hVar2.f2536f = 0;
            } else {
                hVar2.b(8, false);
                c0095a.D(0);
                h hVar3 = (h) lVar;
                hVar3.c((byte[]) c0095a.f1465c, 0, 8, false);
                j = c0095a.j();
                hVar3.q(((int) b7.f5786b) + 8);
            }
            this.f5781d = j;
            this.f5780c = 2;
            return 0;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC1664a.h(this.f5784g != -1);
                long j3 = this.f5784g - ((h) lVar).f2534d;
                b bVar = this.f5782e;
                bVar.getClass();
                return bVar.b((h) lVar, j3) ? -1 : 0;
            }
            ((h) lVar).f2536f = 0;
            h hVar4 = (h) lVar;
            e a02 = p3.f.a0(1684108385, hVar4, new C0095a(8));
            hVar4.q(8);
            Pair create = Pair.create(Long.valueOf(hVar4.f2534d), Long.valueOf(a02.f5786b));
            this.f5783f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j7 = this.f5781d;
            if (j7 != -1 && longValue == 4294967295L) {
                longValue = j7;
            }
            long j8 = this.f5783f + longValue;
            this.f5784g = j8;
            long j9 = hVar4.f2533c;
            if (j9 != -1 && j8 > j9) {
                Log.w("WavExtractor", "Data exceeds input length: " + this.f5784g + ", " + j9);
                this.f5784g = j9;
            }
            b bVar2 = this.f5782e;
            bVar2.getClass();
            bVar2.c(this.f5783f, this.f5784g);
            this.f5780c = 4;
            return 0;
        }
        C0095a c0095a2 = new C0095a(16);
        h hVar5 = (h) lVar;
        long j10 = p3.f.a0(1718449184, hVar5, c0095a2).f5786b;
        AbstractC1664a.h(j10 >= 16);
        hVar5.c((byte[]) c0095a2.f1465c, 0, 16, false);
        c0095a2.D(0);
        int m7 = c0095a2.m();
        int m8 = c0095a2.m();
        int l7 = c0095a2.l();
        c0095a2.l();
        int m9 = c0095a2.m();
        int m10 = c0095a2.m();
        int i11 = ((int) j10) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            ((h) lVar).c(bArr, 0, i11, false);
        } else {
            bArr = t.f17158f;
        }
        h hVar6 = (h) lVar;
        hVar6.q((int) (hVar6.d() - hVar6.f2534d));
        N1.e eVar = new N1.e();
        eVar.f4646a = m8;
        eVar.f4647b = l7;
        eVar.f4648c = m9;
        eVar.f4649d = m10;
        eVar.f4650e = bArr;
        if (m7 == 17) {
            this.f5782e = new a(this.f5778a, this.f5779b, eVar);
        } else if (m7 == 6) {
            this.f5782e = new c(this.f5778a, this.f5779b, eVar, "audio/g711-alaw", -1);
        } else if (m7 == 7) {
            this.f5782e = new c(this.f5778a, this.f5779b, eVar, "audio/g711-mlaw", -1);
        } else {
            if (m7 != 1) {
                if (m7 == 3) {
                    v6 = m10 == 32 ? 4 : 0;
                    i7 = v6;
                    if (i7 == 0) {
                    }
                } else if (m7 != 65534) {
                    i7 = 0;
                    if (i7 == 0) {
                        throw C0045t0.c("Unsupported WAV format type: " + m7);
                    }
                    this.f5782e = new c(this.f5778a, this.f5779b, eVar, "audio/raw", i7);
                }
            }
            v6 = t.v(m10);
            i7 = v6;
            if (i7 == 0) {
            }
        }
        this.f5780c = 3;
        return 0;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        this.f5780c = j == 0 ? 0 : 4;
        b bVar = this.f5782e;
        if (bVar != null) {
            bVar.a(j3);
        }
    }

    @Override // F1.k
    public final void release() {
    }
}
