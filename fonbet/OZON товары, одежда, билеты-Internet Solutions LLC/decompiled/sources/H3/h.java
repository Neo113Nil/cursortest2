package H3;

import F3.InterfaceC3018x;
import H3.f;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.exoplayer.AbstractC5444f;
import androidx.media3.exoplayer.k0;
import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import j3.u;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import k4.C7479a;
import k4.j;
import k4.k;
import k4.m;
import k4.n;
import l3.C7855a;
import l3.C7856b;
import m3.C8063e;
import m3.N;
import m3.s;
import t3.C9730B;

/* loaded from: classes.dex */
public final class h extends AbstractC5444f implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private n f10530A;

    /* renamed from: B, reason: collision with root package name */
    private n f10531B;

    /* renamed from: C, reason: collision with root package name */
    private int f10532C;

    /* renamed from: D, reason: collision with root package name */
    private final Handler f10533D;

    /* renamed from: E, reason: collision with root package name */
    private final g f10534E;

    /* renamed from: F, reason: collision with root package name */
    private final C9730B f10535F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f10536G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f10537H;

    /* renamed from: I, reason: collision with root package name */
    private C7272n f10538I;

    /* renamed from: J, reason: collision with root package name */
    private long f10539J;

    /* renamed from: K, reason: collision with root package name */
    private long f10540K;

    /* renamed from: s, reason: collision with root package name */
    private final C7479a f10541s;

    /* renamed from: t, reason: collision with root package name */
    private final s3.f f10542t;

    /* renamed from: u, reason: collision with root package name */
    private a f10543u;

    /* renamed from: v, reason: collision with root package name */
    private final f f10544v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10545w;

    /* renamed from: x, reason: collision with root package name */
    private int f10546x;

    /* renamed from: y, reason: collision with root package name */
    private j f10547y;

    /* renamed from: z, reason: collision with root package name */
    private m f10548z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, Looper looper) {
        super(3);
        Handler handler;
        f fVar = f.f10528a;
        this.f10534E = gVar;
        if (looper == null) {
            handler = null;
        } else {
            int i11 = N.f74289a;
            handler = new Handler(looper, this);
        }
        this.f10533D = handler;
        this.f10544v = fVar;
        this.f10541s = new C7479a();
        this.f10542t = new s3.f(1);
        this.f10535F = new C9730B();
        this.f10540K = -9223372036854775807L;
        this.f10539J = -9223372036854775807L;
    }

    private void a0() {
        G10.a.g("Legacy decoding is disabled, can't handle " + this.f10538I.f69127o + " samples (expected application/x-media3-cues).", Objects.equals(this.f10538I.f69127o, "application/cea-608") || Objects.equals(this.f10538I.f69127o, "application/x-mp4-cea-608") || Objects.equals(this.f10538I.f69127o, "application/cea-708"));
    }

    private void b0() {
        AbstractC5880y v11 = AbstractC5880y.v();
        d0(this.f10539J);
        C7856b c7856b = new C7856b(v11);
        Handler handler = this.f10533D;
        if (handler != null) {
            handler.obtainMessage(1, c7856b).sendToTarget();
            return;
        }
        AbstractC5880y<C7855a> abstractC5880y = c7856b.f72637a;
        g gVar = this.f10534E;
        gVar.t(abstractC5880y);
        gVar.x(c7856b);
    }

    private long c0() {
        if (this.f10532C == -1) {
            return Long.MAX_VALUE;
        }
        this.f10530A.getClass();
        if (this.f10532C >= this.f10530A.b()) {
            return Long.MAX_VALUE;
        }
        return this.f10530A.a(this.f10532C);
    }

    private long d0(long j11) {
        G10.a.h(j11 != -9223372036854775807L);
        return j11 - L();
    }

    private void e0() {
        this.f10548z = null;
        this.f10532C = -1;
        n nVar = this.f10530A;
        if (nVar != null) {
            nVar.n();
            this.f10530A = null;
        }
        n nVar2 = this.f10531B;
        if (nVar2 != null) {
            nVar2.n();
            this.f10531B = null;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void O() {
        this.f10538I = null;
        this.f10540K = -9223372036854775807L;
        b0();
        this.f10539J = -9223372036854775807L;
        if (this.f10547y != null) {
            e0();
            j jVar = this.f10547y;
            jVar.getClass();
            jVar.release();
            this.f10547y = null;
            this.f10546x = 0;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void Q(long j11, boolean z11) {
        this.f10539J = j11;
        a aVar = this.f10543u;
        if (aVar != null) {
            aVar.clear();
        }
        b0();
        this.f10536G = false;
        this.f10537H = false;
        this.f10540K = -9223372036854775807L;
        C7272n c7272n = this.f10538I;
        if (c7272n == null || Objects.equals(c7272n.f69127o, "application/x-media3-cues")) {
            return;
        }
        if (this.f10546x == 0) {
            e0();
            j jVar = this.f10547y;
            jVar.getClass();
            jVar.flush();
            jVar.a(I());
            return;
        }
        e0();
        j jVar2 = this.f10547y;
        jVar2.getClass();
        jVar2.release();
        this.f10547y = null;
        this.f10546x = 0;
        this.f10545w = true;
        C7272n c7272n2 = this.f10538I;
        c7272n2.getClass();
        j a11 = ((f.a) this.f10544v).a(c7272n2);
        this.f10547y = a11;
        a11.a(I());
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void W(C7272n[] c7272nArr, long j11, long j12, InterfaceC3018x.b bVar) {
        C7272n c7272n = c7272nArr[0];
        this.f10538I = c7272n;
        if (Objects.equals(c7272n.f69127o, "application/x-media3-cues")) {
            this.f10543u = this.f10538I.f69108M == 1 ? new d() : new e();
            return;
        }
        a0();
        if (this.f10547y != null) {
            this.f10546x = 1;
            return;
        }
        this.f10545w = true;
        C7272n c7272n2 = this.f10538I;
        c7272n2.getClass();
        j a11 = ((f.a) this.f10544v).a(c7272n2);
        this.f10547y = a11;
        a11.a(I());
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.j0
    public final boolean a() {
        return this.f10537H;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void c(long j11, long j12) {
        boolean z11;
        long j13;
        if (k()) {
            long j14 = this.f10540K;
            if (j14 != -9223372036854775807L && j11 >= j14) {
                e0();
                this.f10537H = true;
            }
        }
        if (this.f10537H) {
            return;
        }
        C7272n c7272n = this.f10538I;
        c7272n.getClass();
        boolean equals = Objects.equals(c7272n.f69127o, "application/x-media3-cues");
        g gVar = this.f10534E;
        Handler handler = this.f10533D;
        boolean z12 = false;
        C9730B c9730b = this.f10535F;
        if (equals) {
            this.f10543u.getClass();
            if (!this.f10536G) {
                s3.f fVar = this.f10542t;
                if (X(c9730b, fVar, 0) == -4) {
                    if (fVar.i()) {
                        this.f10536G = true;
                    } else {
                        fVar.p();
                        ByteBuffer byteBuffer = fVar.f98184d;
                        byteBuffer.getClass();
                        long j15 = fVar.f98186f;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.f10541s.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        k4.c cVar = new k4.c(C8063e.a(new com.google.android.gms.internal.mlkit_common.a(), parcelableArrayList), j15, readBundle.getLong("d"));
                        fVar.f();
                        z12 = this.f10543u.d(cVar, j11);
                    }
                }
            }
            long b11 = this.f10543u.b(this.f10539J);
            if (b11 == Long.MIN_VALUE && this.f10536G && !z12) {
                this.f10537H = true;
            }
            if (b11 != Long.MIN_VALUE && b11 <= j11) {
                z12 = true;
            }
            if (z12) {
                AbstractC5880y<C7855a> a11 = this.f10543u.a(j11);
                long e11 = this.f10543u.e(j11);
                d0(e11);
                C7856b c7856b = new C7856b(a11);
                if (handler != null) {
                    handler.obtainMessage(1, c7856b).sendToTarget();
                } else {
                    gVar.t(c7856b.f72637a);
                    gVar.x(c7856b);
                }
                this.f10543u.c(e11);
            }
            this.f10539J = j11;
            return;
        }
        a0();
        this.f10539J = j11;
        n nVar = this.f10531B;
        f fVar2 = this.f10544v;
        if (nVar == null) {
            j jVar = this.f10547y;
            jVar.getClass();
            jVar.d(j11);
            try {
                j jVar2 = this.f10547y;
                jVar2.getClass();
                this.f10531B = jVar2.e();
            } catch (k e12) {
                s.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f10538I, e12);
                b0();
                e0();
                j jVar3 = this.f10547y;
                jVar3.getClass();
                jVar3.release();
                this.f10547y = null;
                this.f10546x = 0;
                this.f10545w = true;
                C7272n c7272n2 = this.f10538I;
                c7272n2.getClass();
                j a12 = ((f.a) fVar2).a(c7272n2);
                this.f10547y = a12;
                a12.a(I());
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f10530A != null) {
            long c02 = c0();
            z11 = false;
            while (c02 <= j11) {
                this.f10532C++;
                c02 = c0();
                z11 = true;
            }
        } else {
            z11 = false;
        }
        n nVar2 = this.f10531B;
        if (nVar2 != null) {
            if (nVar2.i()) {
                if (!z11 && c0() == Long.MAX_VALUE) {
                    if (this.f10546x == 2) {
                        e0();
                        j jVar4 = this.f10547y;
                        jVar4.getClass();
                        jVar4.release();
                        this.f10547y = null;
                        this.f10546x = 0;
                        this.f10545w = true;
                        C7272n c7272n3 = this.f10538I;
                        c7272n3.getClass();
                        j a13 = ((f.a) fVar2).a(c7272n3);
                        this.f10547y = a13;
                        a13.a(I());
                    } else {
                        e0();
                        this.f10537H = true;
                    }
                }
            } else if (nVar2.f98189b <= j11) {
                n nVar3 = this.f10530A;
                if (nVar3 != null) {
                    nVar3.n();
                }
                this.f10532C = nVar2.c(j11);
                this.f10530A = nVar2;
                this.f10531B = null;
                z11 = true;
            }
        }
        if (z11) {
            this.f10530A.getClass();
            int c11 = this.f10530A.c(j11);
            if (c11 == 0 || this.f10530A.b() == 0) {
                j13 = this.f10530A.f98189b;
            } else if (c11 == -1) {
                n nVar4 = this.f10530A;
                j13 = nVar4.a(nVar4.b() - 1);
            } else {
                j13 = this.f10530A.a(c11 - 1);
            }
            d0(j13);
            C7856b c7856b2 = new C7856b(this.f10530A.d(j11));
            if (handler != null) {
                handler.obtainMessage(1, c7856b2).sendToTarget();
            } else {
                gVar.t(c7856b2.f72637a);
                gVar.x(c7856b2);
            }
        }
        if (this.f10546x == 2) {
            return;
        }
        while (!this.f10536G) {
            try {
                m mVar = this.f10548z;
                if (mVar == null) {
                    j jVar5 = this.f10547y;
                    jVar5.getClass();
                    mVar = jVar5.b();
                    if (mVar == null) {
                        return;
                    } else {
                        this.f10548z = mVar;
                    }
                }
                if (this.f10546x == 1) {
                    mVar.m(4);
                    j jVar6 = this.f10547y;
                    jVar6.getClass();
                    jVar6.f(mVar);
                    this.f10548z = null;
                    this.f10546x = 2;
                    return;
                }
                int X9 = X(c9730b, mVar, 0);
                if (X9 == -4) {
                    if (mVar.i()) {
                        this.f10536G = true;
                        this.f10545w = false;
                    } else {
                        C7272n c7272n4 = c9730b.f98980b;
                        if (c7272n4 == null) {
                            return;
                        }
                        mVar.f70471i = c7272n4.f69132t;
                        mVar.p();
                        this.f10545w &= !mVar.j();
                    }
                    if (!this.f10545w) {
                        j jVar7 = this.f10547y;
                        jVar7.getClass();
                        jVar7.f(mVar);
                        this.f10548z = null;
                    }
                } else if (X9 == -3) {
                    return;
                }
            } catch (k e13) {
                s.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f10538I, e13);
                b0();
                e0();
                j jVar8 = this.f10547y;
                jVar8.getClass();
                jVar8.release();
                this.f10547y = null;
                this.f10546x = 0;
                this.f10545w = true;
                C7272n c7272n5 = this.f10538I;
                c7272n5.getClass();
                j a14 = ((f.a) fVar2).a(c7272n5);
                this.f10547y = a14;
                a14.a(I());
                return;
            }
        }
    }

    @Override // androidx.media3.exoplayer.k0
    public final int e(C7272n c7272n) {
        if (Objects.equals(c7272n.f69127o, "application/x-media3-cues") || ((f.a) this.f10544v).b(c7272n)) {
            return k0.g(c7272n.f69111P == 0 ? 4 : 2, 0, 0, 0);
        }
        return u.k(c7272n.f69127o) ? k0.g(1, 0, 0, 0) : k0.g(0, 0, 0, 0);
    }

    public final void f0(long j11) {
        G10.a.h(k());
        this.f10540K = j11;
    }

    @Override // androidx.media3.exoplayer.j0, androidx.media3.exoplayer.k0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        C7856b c7856b = (C7856b) message.obj;
        AbstractC5880y<C7855a> abstractC5880y = c7856b.f72637a;
        g gVar = this.f10534E;
        gVar.t(abstractC5880y);
        gVar.x(c7856b);
        return true;
    }

    @Override // androidx.media3.exoplayer.j0
    public final boolean isReady() {
        C7272n c7272n = this.f10538I;
        if (c7272n != null) {
            if (Objects.equals(c7272n.f69127o, "application/x-media3-cues")) {
                a aVar = this.f10543u;
                aVar.getClass();
                if (aVar.b(this.f10539J) == Long.MIN_VALUE) {
                    try {
                        u();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.f10537H) {
                    return false;
                }
                if (this.f10536G) {
                    n nVar = this.f10530A;
                    long j11 = this.f10539J;
                    if (nVar == null || nVar.b() <= 0 || nVar.a(nVar.b() - 1) <= j11) {
                        n nVar2 = this.f10531B;
                        long j12 = this.f10539J;
                        if ((nVar2 == null || nVar2.b() <= 0 || nVar2.a(nVar2.b() - 1) <= j12) && this.f10548z != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
