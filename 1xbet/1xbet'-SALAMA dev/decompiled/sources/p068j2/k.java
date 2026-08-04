package p068j2;

import A1.AbstractC0023i;
import A1.C0042s;
import A1.H;
import A1.K;
import A1.N;
import A1.X;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.C0800v;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import p073k2.c;
import p073k2.f;
import p081l2.a;
import p089m2.b;
import p118q2.d;
import p132s2.i;
import p151v2.t;
import p155w1.L;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0023i implements Handler.Callback {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Handler f14612D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final K f14613E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final i f14614F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final V0 f14615G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f14616H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f14617I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f14618J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f14619K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public X f14620L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public g f14621M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public j f14622N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public d f14623O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public d f14624P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f14625Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f14626R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(K k7, Looper looper) {
        Handler handler;
        super(3);
        i iVar = i.f14610a;
        this.f14613E = k7;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = t.f17159a;
            handler = new Handler(looper, this);
        }
        this.f14612D = handler;
        this.f14614F = iVar;
        this.f14615G = new V0(1, false);
        this.f14626R = -9223372036854775807L;
    }

    public final long B() {
        if (this.f14625Q == -1) {
            return Long.MAX_VALUE;
        }
        this.f14623O.getClass();
        if (this.f14625Q >= this.f14623O.p()) {
            return Long.MAX_VALUE;
        }
        return this.f14623O.h(this.f14625Q);
    }

    public final void C() {
        g aVar;
        int i7 = 0;
        this.f14618J = true;
        X x4 = this.f14620L;
        x4.getClass();
        this.f14614F.getClass();
        String str = x4.f283C;
        if (str != null) {
            int i8 = x4.f301U;
            List list = x4.f285E;
            switch (str) {
                case "application/dvbsubs":
                    aVar = new a(list);
                    break;
                case "application/pgs":
                    aVar = new b();
                    break;
                case "application/x-mp4-vtt":
                    aVar = new a();
                    break;
                case "text/vtt":
                    aVar = new i();
                    break;
                case "application/x-quicktime-tx3g":
                    aVar = new p125r2.a(list);
                    break;
                case "text/x-ssa":
                    aVar = new p104o2.a(list);
                    break;
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    aVar = new c(str, i8);
                    break;
                case "text/x-exoplayer-cues":
                    C0800v c0800v = new C0800v();
                    c0800v.f11196c = new j(1);
                    c0800v.f11197d = new ArrayDeque();
                    for (int i9 = 0; i9 < 2; i9++) {
                        ((ArrayDeque) c0800v.f11197d).addFirst(new d(c0800v, i7));
                    }
                    c0800v.f11194a = 0;
                    aVar = c0800v;
                    break;
                case "application/cea-708":
                    aVar = new f(i8, list);
                    break;
                case "application/x-subrip":
                    aVar = new p112p2.a();
                    break;
                case "application/ttml+xml":
                    aVar = new d();
                    break;
            }
            this.f14621M = aVar;
            return;
        }
        throw new IllegalArgumentException(L.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final void D(List list) {
        K k7 = this.f14613E;
        k7.f109a.f164l.k(27, new H(list));
        c cVar = new c(list);
        N n2 = k7.f109a;
        n2.getClass();
        n2.f164l.k(27, new C0042s(cVar, 4));
    }

    public final void E() {
        this.f14622N = null;
        this.f14625Q = -1;
        d dVar = this.f14623O;
        if (dVar != null) {
            dVar.t();
            this.f14623O = null;
        }
        d dVar2 = this.f14624P;
        if (dVar2 != null) {
            dVar2.t();
            this.f14624P = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        D((List) message.obj);
        return true;
    }

    @Override // A1.AbstractC0023i
    public final String j() {
        return "TextRenderer";
    }

    @Override // A1.AbstractC0023i
    public final boolean l() {
        return this.f14617I;
    }

    @Override // A1.AbstractC0023i
    public final boolean m() {
        return true;
    }

    @Override // A1.AbstractC0023i
    public final void n() {
        this.f14620L = null;
        this.f14626R = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        Handler handler = this.f14612D;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            D(listEmptyList);
        }
        E();
        g gVar = this.f14621M;
        gVar.getClass();
        gVar.release();
        this.f14621M = null;
        this.f14619K = 0;
    }

    @Override // A1.AbstractC0023i
    public final void p(long j, boolean z4) {
        List listEmptyList = Collections.emptyList();
        Handler handler = this.f14612D;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            D(listEmptyList);
        }
        this.f14616H = false;
        this.f14617I = false;
        this.f14626R = -9223372036854775807L;
        if (this.f14619K == 0) {
            E();
            g gVar = this.f14621M;
            gVar.getClass();
            gVar.flush();
            return;
        }
        E();
        g gVar2 = this.f14621M;
        gVar2.getClass();
        gVar2.release();
        this.f14621M = null;
        this.f14619K = 0;
        C();
    }

    @Override // A1.AbstractC0023i
    public final void t(X[] xArr, long j, long j3) {
        this.f14620L = xArr[0];
        if (this.f14621M != null) {
            this.f14619K = 1;
        } else {
            C();
        }
    }

    @Override // A1.AbstractC0023i
    public final void v(long j, long j3) {
        boolean z4;
        V0 v6 = this.f14615G;
        if (this.f373B) {
            long j7 = this.f14626R;
            if (j7 != -9223372036854775807L && j >= j7) {
                E();
                this.f14617I = true;
            }
        }
        if (this.f14617I) {
            return;
        }
        d dVar = this.f14624P;
        Handler handler = this.f14612D;
        if (dVar == null) {
            g gVar = this.f14621M;
            gVar.getClass();
            gVar.a(j);
            try {
                g gVar2 = this.f14621M;
                gVar2.getClass();
                this.f14624P = gVar2.b();
            } catch (h e7) {
                p151v2.a.l("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f14620L, e7);
                List listEmptyList = Collections.emptyList();
                if (handler != null) {
                    handler.obtainMessage(0, listEmptyList).sendToTarget();
                } else {
                    D(listEmptyList);
                }
                E();
                g gVar3 = this.f14621M;
                gVar3.getClass();
                gVar3.release();
                this.f14621M = null;
                this.f14619K = 0;
                C();
                return;
            }
        }
        if (this.f380f != 2) {
            return;
        }
        if (this.f14623O != null) {
            long jB = B();
            z4 = false;
            while (jB <= j) {
                this.f14625Q++;
                jB = B();
                z4 = true;
            }
        } else {
            z4 = false;
        }
        d dVar2 = this.f14624P;
        if (dVar2 != null) {
            if (dVar2.f(4)) {
                if (!z4 && B() == Long.MAX_VALUE) {
                    if (this.f14619K == 2) {
                        E();
                        g gVar4 = this.f14621M;
                        gVar4.getClass();
                        gVar4.release();
                        this.f14621M = null;
                        this.f14619K = 0;
                        C();
                    } else {
                        E();
                        this.f14617I = true;
                    }
                }
            } else if (dVar2.f14593c <= j) {
                d dVar3 = this.f14623O;
                if (dVar3 != null) {
                    dVar3.t();
                }
                this.f14625Q = dVar2.d(j);
                this.f14623O = dVar2;
                this.f14624P = null;
                z4 = true;
            }
        }
        if (z4) {
            this.f14623O.getClass();
            List listM = this.f14623O.m(j);
            if (handler != null) {
                handler.obtainMessage(0, listM).sendToTarget();
            } else {
                D(listM);
            }
        }
        if (this.f14619K == 2) {
            return;
        }
        while (!this.f14616H) {
            try {
                j jVar = this.f14622N;
                if (jVar == null) {
                    g gVar5 = this.f14621M;
                    gVar5.getClass();
                    jVar = (j) gVar5.c();
                    if (jVar == null) {
                        return;
                    } else {
                        this.f14622N = jVar;
                    }
                }
                if (this.f14619K == 1) {
                    jVar.f1675b = 4;
                    g gVar6 = this.f14621M;
                    gVar6.getClass();
                    gVar6.d(jVar);
                    this.f14622N = null;
                    this.f14619K = 2;
                    return;
                }
                int iU = u(v6, jVar, 0);
                if (iU == -4) {
                    if (jVar.f(4)) {
                        this.f14616H = true;
                        this.f14618J = false;
                    } else {
                        X x4 = (X) v6.f17569c;
                        if (x4 == null) {
                            return;
                        }
                        jVar.f14611z = x4.f287G;
                        jVar.A();
                        this.f14618J &= !jVar.f(1);
                    }
                    if (!this.f14618J) {
                        g gVar7 = this.f14621M;
                        gVar7.getClass();
                        gVar7.d(jVar);
                        this.f14622N = null;
                    }
                } else if (iU == -3) {
                    return;
                }
            } catch (h e8) {
                p151v2.a.l("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f14620L, e8);
                List listEmptyList2 = Collections.emptyList();
                if (handler != null) {
                    handler.obtainMessage(0, listEmptyList2).sendToTarget();
                } else {
                    D(listEmptyList2);
                }
                E();
                g gVar8 = this.f14621M;
                gVar8.getClass();
                gVar8.release();
                this.f14621M = null;
                this.f14619K = 0;
                C();
                return;
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final int z(X x4) {
        this.f14614F.getClass();
        String str = x4.f283C;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return AbstractC0023i.e(x4.f302V == 0 ? 4 : 2, 0, 0);
        }
        return p151v2.i.i(x4.f283C) ? AbstractC0023i.e(1, 0, 0) : AbstractC0023i.e(0, 0, 0);
    }
}
