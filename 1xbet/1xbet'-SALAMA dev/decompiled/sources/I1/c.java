package I1;

import A1.C0042s;
import A1.C0045t0;
import C1.C0095a;
import E3.AbstractC0167z;
import E4.y;
import F1.h;
import F1.k;
import F1.l;
import F1.m;
import F1.n;
import F1.o;
import F1.s;
import F1.v;
import F1.x;
import F1.z;
import Y4.D;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f3513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v f3514f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Metadata f3516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f3517i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f3519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3521n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3509a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0095a f3510b = new C0095a(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3511c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f3512d = new y();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3515g = 0;

    @Override // F1.k
    public final boolean a(l lVar) throws EOFException, InterruptedIOException {
        h hVar = (h) lVar;
        Metadata metadataQ = new p145u1.c(4).q(hVar, X1.c.f7463h);
        if (metadataQ != null) {
            int length = metadataQ.f10562a.length;
        }
        byte[] bArr = new byte[4];
        hVar.c(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f3513e = mVar;
        this.f3514f = mVar.r(0, 1);
        mVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    @Override // F1.k
    public final int f(l lVar, y yVar) throws C0045t0, EOFException, InterruptedIOException {
        Metadata metadata;
        o oVar;
        Metadata metadata2;
        s nVar;
        long j;
        boolean z4;
        long j3;
        boolean zH;
        boolean z7 = true;
        int i7 = this.f3515g;
        Metadata metadata3 = null;
        if (i7 == 0) {
            ((h) lVar).f2536f = 0;
            h hVar = (h) lVar;
            long jD = hVar.d();
            Metadata metadataQ = new p145u1.c(4).q(hVar, !this.f3511c ? null : X1.c.f7463h);
            if (metadataQ != null && metadataQ.f10562a.length != 0) {
                metadata3 = metadataQ;
            }
            hVar.q((int) (hVar.d() - jD));
            this.f3516h = metadata3;
            this.f3515g = 1;
            return 0;
        }
        byte[] bArr = this.f3509a;
        if (i7 == 1) {
            ((h) lVar).c(bArr, 0, bArr.length, false);
            ((h) lVar).f2536f = 0;
            this.f3515g = 2;
            return 0;
        }
        int i8 = 3;
        if (i7 == 2) {
            byte[] bArr2 = new byte[4];
            ((h) lVar).a(bArr2, 0, 4, false);
            if ((((((long) bArr2[2]) & 255) << 8) | ((((long) bArr2[1]) & 255) << 16) | ((((long) bArr2[0]) & 255) << 24) | (((long) bArr2[3]) & 255)) != 1716281667) {
                throw C0045t0.a(null, "Failed to read FLAC stream marker.");
            }
            this.f3515g = 3;
            return 0;
        }
        if (i7 == 3) {
            ?? r15 = 0;
            o oVar2 = this.f3517i;
            boolean z8 = false;
            while (!z8) {
                ((h) lVar).f2536f = r15;
                byte[] bArr3 = new byte[4];
                x xVar = new x(bArr3, 4);
                h hVar2 = (h) lVar;
                hVar2.c(bArr3, r15, 4, r15);
                boolean zH2 = xVar.h();
                int i9 = xVar.i(7);
                int i10 = xVar.i(24) + 4;
                if (i9 == 0) {
                    byte[] bArr4 = new byte[38];
                    hVar2.a(bArr4, r15, 38, r15);
                    oVar2 = new o(bArr4, 4);
                } else {
                    if (oVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i9 == i8) {
                        C0095a c0095a = new C0095a(i10);
                        hVar2.a((byte[]) c0095a.f1465c, 0, i10, false);
                        oVar = new o(oVar2.f2549a, oVar2.f2550b, oVar2.f2551c, oVar2.f2552d, oVar2.f2553e, oVar2.f2555g, oVar2.f2556h, oVar2.j, p003a.a.n0(c0095a), oVar2.f2559l);
                    } else {
                        Metadata metadata4 = oVar2.f2559l;
                        if (i9 == 4) {
                            C0095a c0095a2 = new C0095a(i10);
                            hVar2.a((byte[]) c0095a2.f1465c, 0, i10, false);
                            c0095a2.E(4);
                            Metadata metadataB = z.b(Arrays.asList((String[]) z.c(c0095a2, false, false).f17938b));
                            if (metadata4 == null) {
                                metadata2 = metadataB;
                            } else {
                                if (metadataB != null) {
                                    Metadata.Entry[] entryArr = metadataB.f10562a;
                                    if (entryArr.length != 0) {
                                        int i11 = t.f17159a;
                                        Metadata.Entry[] entryArr2 = metadata4.f10562a;
                                        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                                        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                                        metadata4 = new Metadata((Metadata.Entry[]) objArrCopyOf);
                                    }
                                }
                                metadata2 = metadata4;
                            }
                            oVar = new o(oVar2.f2549a, oVar2.f2550b, oVar2.f2551c, oVar2.f2552d, oVar2.f2553e, oVar2.f2555g, oVar2.f2556h, oVar2.j, oVar2.f2558k, metadata2);
                        } else if (i9 == 6) {
                            C0095a c0095a3 = new C0095a(i10);
                            hVar2.a((byte[]) c0095a3.f1465c, 0, i10, false);
                            c0095a3.E(4);
                            Metadata metadata5 = new Metadata(AbstractC0167z.I(PictureFrame.a(c0095a3)));
                            if (metadata4 == null) {
                                metadata = metadata5;
                            } else {
                                Metadata.Entry[] entryArr3 = metadata5.f10562a;
                                if (entryArr3.length != 0) {
                                    int i12 = t.f17159a;
                                    Metadata.Entry[] entryArr4 = metadata4.f10562a;
                                    Object[] objArrCopyOf2 = Arrays.copyOf(entryArr4, entryArr4.length + entryArr3.length);
                                    System.arraycopy(entryArr3, 0, objArrCopyOf2, entryArr4.length, entryArr3.length);
                                    metadata4 = new Metadata((Metadata.Entry[]) objArrCopyOf2);
                                }
                                metadata = metadata4;
                            }
                            oVar = new o(oVar2.f2549a, oVar2.f2550b, oVar2.f2551c, oVar2.f2552d, oVar2.f2553e, oVar2.f2555g, oVar2.f2556h, oVar2.j, oVar2.f2558k, metadata);
                        } else {
                            hVar2.q(i10);
                        }
                    }
                    oVar2 = oVar;
                }
                int i13 = t.f17159a;
                this.f3517i = oVar2;
                z8 = zH2;
                i8 = 3;
                r15 = 0;
            }
            this.f3517i.getClass();
            this.j = Math.max(this.f3517i.f2551c, 6);
            v vVar = this.f3514f;
            int i14 = t.f17159a;
            vVar.a(this.f3517i.c(bArr, this.f3516h));
            this.f3515g = 4;
            return 0;
        }
        long jZ = 0;
        if (i7 == 4) {
            ((h) lVar).f2536f = 0;
            byte[] bArr5 = new byte[2];
            h hVar3 = (h) lVar;
            hVar3.c(bArr5, 0, 2, false);
            int i15 = (bArr5[1] & 255) | ((bArr5[0] & 255) << 8);
            if ((i15 >> 2) != 16382) {
                hVar3.f2536f = 0;
                throw C0045t0.a(null, "First frame does not start with sync code.");
            }
            hVar3.f2536f = 0;
            this.f3518k = i15;
            m mVar = this.f3513e;
            int i16 = t.f17159a;
            long j7 = hVar3.f2534d;
            this.f3517i.getClass();
            o oVar3 = this.f3517i;
            if (oVar3.f2558k != null) {
                nVar = new n(oVar3, j7, 0);
            } else {
                long j8 = hVar3.f2533c;
                if (j8 == -1 || oVar3.j <= 0) {
                    nVar = new n(oVar3.b());
                } else {
                    int i17 = this.f3518k;
                    C0042s c0042s = new C0042s(oVar3, 20);
                    a aVar = new a(oVar3, i17);
                    long jB = oVar3.b();
                    int i18 = oVar3.f2551c;
                    int i19 = oVar3.f2552d;
                    if (i19 > 0) {
                        j = ((((long) i19) + ((long) i18)) / 2) + 1;
                    } else {
                        int i20 = oVar3.f2550b;
                        int i21 = oVar3.f2549a;
                        j = (((((i21 != i20 || i21 <= 0) ? 4096L : i21) * ((long) oVar3.f2555g)) * ((long) oVar3.f2556h)) / 8) + 64;
                    }
                    b bVar = new b(c0042s, aVar, jB, oVar3.j, j7, j8, j, Math.max(6, i18));
                    this.f3519l = bVar;
                    nVar = bVar.f3505a;
                }
            }
            mVar.m(nVar);
            this.f3515g = 5;
            return 0;
        }
        if (i7 != 5) {
            throw new IllegalStateException();
        }
        this.f3514f.getClass();
        this.f3517i.getClass();
        b bVar2 = this.f3519l;
        if (bVar2 != null && bVar2.f3507c != null) {
            return bVar2.b((h) lVar, yVar);
        }
        if (this.f3521n == -1) {
            o oVar4 = this.f3517i;
            ((h) lVar).f2536f = 0;
            h hVar4 = (h) lVar;
            hVar4.b(1, false);
            byte[] bArr6 = new byte[1];
            hVar4.c(bArr6, 0, 1, false);
            boolean z9 = (bArr6[0] & 1) == 1;
            hVar4.b(2, false);
            int i22 = z9 ? 7 : 6;
            C0095a c0095a4 = new C0095a(i22);
            byte[] bArr7 = (byte[]) c0095a4.f1465c;
            int i23 = 0;
            while (i23 < i22) {
                int iF = hVar4.f(bArr7, i23, i22 - i23);
                if (iF == -1) {
                    break;
                }
                i23 += iF;
            }
            c0095a4.C(i23);
            hVar4.f2536f = 0;
            try {
                jZ = c0095a4.z();
                if (!z9) {
                    jZ *= (long) oVar4.f2550b;
                }
            } catch (NumberFormatException unused) {
                z7 = false;
            }
            if (!z7) {
                throw C0045t0.a(null, null);
            }
            this.f3521n = jZ;
            return 0;
        }
        C0095a c0095a5 = this.f3510b;
        int i24 = c0095a5.f1464b;
        if (i24 < 32768) {
            int i25 = ((h) lVar).read((byte[]) c0095a5.f1465c, i24, 32768 - i24);
            z4 = i25 == -1;
            if (!z4) {
                c0095a5.C(i24 + i25);
            } else if (c0095a5.d() == 0) {
                long j9 = this.f3521n * 1000000;
                o oVar5 = this.f3517i;
                int i26 = t.f17159a;
                this.f3514f.e(j9 / ((long) oVar5.f2553e), 1, this.f3520m, 0, null);
                return -1;
            }
        } else {
            z4 = false;
        }
        int i27 = c0095a5.f1463a;
        int i28 = this.f3520m;
        int i29 = this.j;
        if (i28 < i29) {
            c0095a5.E(Math.min(i29 - i28, c0095a5.d()));
        }
        this.f3517i.getClass();
        int i30 = c0095a5.f1463a;
        while (true) {
            int i31 = c0095a5.f1464b - 16;
            y yVar2 = this.f3512d;
            if (i30 > i31) {
                if (z4) {
                    while (true) {
                        int i32 = c0095a5.f1464b;
                        if (i30 <= i32 - this.j) {
                            c0095a5.D(i30);
                            try {
                                zH = D.h(c0095a5, this.f3517i, this.f3518k, yVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zH = false;
                            }
                            if (c0095a5.f1463a > c0095a5.f1464b) {
                                zH = false;
                            }
                            if (zH) {
                                c0095a5.D(i30);
                                j3 = yVar2.f2247a;
                                break;
                            }
                            i30++;
                        } else {
                            c0095a5.D(i32);
                        }
                    }
                } else {
                    c0095a5.D(i30);
                }
                j3 = -1;
                break;
            }
            c0095a5.D(i30);
            if (D.h(c0095a5, this.f3517i, this.f3518k, yVar2)) {
                c0095a5.D(i30);
                j3 = yVar2.f2247a;
                break;
            }
            i30++;
        }
        int i33 = c0095a5.f1463a - i27;
        c0095a5.D(i27);
        this.f3514f.c(i33, c0095a5);
        int i34 = this.f3520m + i33;
        this.f3520m = i34;
        if (j3 != -1) {
            long j10 = this.f3521n * 1000000;
            o oVar6 = this.f3517i;
            int i35 = t.f17159a;
            this.f3514f.e(j10 / ((long) oVar6.f2553e), 1, i34, 0, null);
            this.f3520m = 0;
            this.f3521n = j3;
        }
        if (c0095a5.d() >= 16) {
            return 0;
        }
        int iD = c0095a5.d();
        byte[] bArr8 = (byte[]) c0095a5.f1465c;
        System.arraycopy(bArr8, c0095a5.f1463a, bArr8, 0, iD);
        c0095a5.D(0);
        c0095a5.C(iD);
        return 0;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        if (j == 0) {
            this.f3515g = 0;
        } else {
            b bVar = this.f3519l;
            if (bVar != null) {
                bVar.d(j3);
            }
        }
        this.f3521n = j3 != 0 ? -1L : 0L;
        this.f3520m = 0;
        this.f3510b.A(0);
    }

    @Override // F1.k
    public final void release() {
    }
}
