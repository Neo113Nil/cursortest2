package K1;

import A1.C0045t0;
import A1.X;
import C0.C0083b;
import C1.C0095a;
import E3.L;
import E4.y;
import F1.h;
import F1.k;
import F1.l;
import F1.m;
import F1.n;
import F1.v;
import N1.p;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: b, reason: collision with root package name */
    public m f3883b;

    /* renamed from: c, reason: collision with root package name */
    public int f3884c;

    /* renamed from: d, reason: collision with root package name */
    public int f3885d;

    /* renamed from: e, reason: collision with root package name */
    public int f3886e;

    /* renamed from: g, reason: collision with root package name */
    public MotionPhotoMetadata f3888g;

    /* renamed from: h, reason: collision with root package name */
    public h f3889h;

    /* renamed from: i, reason: collision with root package name */
    public C0083b f3890i;
    public N1.m j;

    /* renamed from: a, reason: collision with root package name */
    public final C0095a f3882a = new C0095a(6);

    /* renamed from: f, reason: collision with root package name */
    public long f3887f = -1;

    @Override // F1.k
    public final boolean a(l lVar) {
        h hVar = (h) lVar;
        C0095a c0095a = this.f3882a;
        c0095a.A(2);
        hVar.c((byte[]) c0095a.f1465c, 0, 2, false);
        if (c0095a.y() != 65496) {
            return false;
        }
        c0095a.A(2);
        hVar.c((byte[]) c0095a.f1465c, 0, 2, false);
        int y4 = c0095a.y();
        this.f3885d = y4;
        if (y4 == 65504) {
            c0095a.A(2);
            hVar.c((byte[]) c0095a.f1465c, 0, 2, false);
            hVar.b(c0095a.y() - 2, false);
            c0095a.A(2);
            hVar.c((byte[]) c0095a.f1465c, 0, 2, false);
            this.f3885d = c0095a.y();
        }
        if (this.f3885d != 65505) {
            return false;
        }
        hVar.b(2, false);
        c0095a.A(6);
        hVar.c((byte[]) c0095a.f1465c, 0, 6, false);
        return c0095a.u() == 1165519206 && c0095a.y() == 0;
    }

    public final void b() {
        c(new Metadata.Entry[0]);
        m mVar = this.f3883b;
        mVar.getClass();
        mVar.n();
        this.f3883b.m(new n(-9223372036854775807L));
        this.f3884c = 6;
    }

    public final void c(Metadata.Entry... entryArr) {
        m mVar = this.f3883b;
        mVar.getClass();
        v r7 = mVar.r(1024, 4);
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.j = "image/jpeg";
        format$Builder.f10536i = new Metadata(entryArr);
        r7.a(new X(format$Builder));
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f3883b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0164  */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(l lVar, y yVar) {
        String o7;
        c cVar;
        L l7;
        int i7;
        MotionPhotoMetadata motionPhotoMetadata;
        long j;
        int i8 = this.f3884c;
        C0095a c0095a = this.f3882a;
        long j3 = -1;
        if (i8 == 0) {
            c0095a.A(2);
            ((h) lVar).a((byte[]) c0095a.f1465c, 0, 2, false);
            int y4 = c0095a.y();
            this.f3885d = y4;
            if (y4 == 65498) {
                if (this.f3887f != -1) {
                    this.f3884c = 4;
                } else {
                    b();
                }
            } else if ((y4 < 65488 || y4 > 65497) && y4 != 65281) {
                this.f3884c = 1;
            }
            return 0;
        }
        if (i8 == 1) {
            c0095a.A(2);
            ((h) lVar).a((byte[]) c0095a.f1465c, 0, 2, false);
            this.f3886e = c0095a.y() - 2;
            this.f3884c = 2;
            return 0;
        }
        if (i8 != 2) {
            if (i8 != 4) {
                if (i8 != 5) {
                    if (i8 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f3890i == null || lVar != this.f3889h) {
                    h hVar = (h) lVar;
                    this.f3889h = hVar;
                    this.f3890i = new C0083b(hVar, this.f3887f);
                }
                N1.m mVar = this.j;
                mVar.getClass();
                int f7 = mVar.f(this.f3890i, yVar);
                if (f7 == 1) {
                    yVar.f2247a += this.f3887f;
                }
                return f7;
            }
            long j7 = ((h) lVar).f2534d;
            long j8 = this.f3887f;
            if (j7 != j8) {
                yVar.f2247a = j8;
                return 1;
            }
            h hVar2 = (h) lVar;
            if (hVar2.c((byte[]) c0095a.f1465c, 0, 1, true)) {
                hVar2.f2536f = 0;
                if (this.j == null) {
                    this.j = new N1.m();
                }
                C0083b c0083b = new C0083b(hVar2, this.f3887f);
                this.f3890i = c0083b;
                this.j.getClass();
                if (p.c(c0083b, false, false)) {
                    N1.m mVar2 = this.j;
                    long j9 = this.f3887f;
                    m mVar3 = this.f3883b;
                    mVar3.getClass();
                    mVar2.f4725q = new C0083b(j9, mVar3, 4);
                    MotionPhotoMetadata motionPhotoMetadata2 = this.f3888g;
                    motionPhotoMetadata2.getClass();
                    c(motionPhotoMetadata2);
                    this.f3884c = 5;
                } else {
                    b();
                }
            } else {
                b();
            }
            return 0;
        }
        if (this.f3885d == 65505) {
            C0095a c0095a2 = new C0095a(this.f3886e);
            ((h) lVar).a((byte[]) c0095a2.f1465c, 0, this.f3886e, false);
            if (this.f3888g == null && "http://ns.adobe.com/xap/1.0/".equals(c0095a2.o()) && (o7 = c0095a2.o()) != null) {
                long j10 = ((h) lVar).f2533c;
                if (j10 != -1) {
                    try {
                        cVar = e.a(o7);
                    } catch (C0045t0 | NumberFormatException | XmlPullParserException unused) {
                        Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        cVar = null;
                    }
                    if (cVar != null && (i7 = (l7 = cVar.f3895b).f2002d) >= 2) {
                        int i9 = i7 - 1;
                        boolean z4 = false;
                        long j11 = -1;
                        long j12 = -1;
                        long j13 = -1;
                        long j14 = -1;
                        while (i9 >= 0) {
                            b bVar = (b) l7.get(i9);
                            z4 |= "video/mp4".equals(bVar.f3891a);
                            if (i9 == 0) {
                                j10 -= bVar.f3893c;
                                j = 0;
                            } else {
                                j = j10 - bVar.f3892b;
                            }
                            long j15 = j10;
                            j10 = j;
                            if (z4 && j10 != j15) {
                                j14 = j15 - j10;
                                z4 = false;
                                j13 = j10;
                            }
                            if (i9 == 0) {
                                j11 = j10;
                                j12 = j15;
                            }
                            i9--;
                            j3 = -1;
                        }
                        long j16 = j3;
                        if (j13 != j16 && j14 != j16 && j11 != j16 && j12 != j16) {
                            motionPhotoMetadata = new MotionPhotoMetadata(j11, j12, cVar.f3894a, j13, j14);
                            this.f3888g = motionPhotoMetadata;
                            if (motionPhotoMetadata != null) {
                                this.f3887f = motionPhotoMetadata.f10647d;
                            }
                        }
                    }
                }
                motionPhotoMetadata = null;
                this.f3888g = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                }
            }
        } else {
            ((h) lVar).q(this.f3886e);
        }
        this.f3884c = 0;
        return 0;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        if (j == 0) {
            this.f3884c = 0;
            this.j = null;
        } else if (this.f3884c == 5) {
            N1.m mVar = this.j;
            mVar.getClass();
            mVar.g(j, j3);
        }
    }

    @Override // F1.k
    public final void release() {
        N1.m mVar = this.j;
        if (mVar != null) {
            mVar.getClass();
        }
    }
}
