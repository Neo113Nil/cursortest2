package j2;

import A1.AbstractC0023i;
import A1.C0042s;
import A1.H;
import A1.K;
import A1.N;
import A1.X;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.C0844v;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import l2.C1379a;
import m2.C1435b;
import o2.C1502a;
import p2.C1534a;
import q2.C1552d;
import r2.C1571a;
import v2.AbstractC1664a;
import v2.t;
import w1.L;
import w1.V0;

/* renamed from: j2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314k extends AbstractC0023i implements Handler.Callback {

    /* renamed from: D, reason: collision with root package name */
    public final Handler f14606D;

    /* renamed from: E, reason: collision with root package name */
    public final K f14607E;

    /* renamed from: F, reason: collision with root package name */
    public final C1312i f14608F;

    /* renamed from: G, reason: collision with root package name */
    public final V0 f14609G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f14610H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f14611I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14612J;

    /* renamed from: K, reason: collision with root package name */
    public int f14613K;

    /* renamed from: L, reason: collision with root package name */
    public X f14614L;

    /* renamed from: M, reason: collision with root package name */
    public InterfaceC1310g f14615M;

    /* renamed from: N, reason: collision with root package name */
    public C1313j f14616N;

    /* renamed from: O, reason: collision with root package name */
    public C1307d f14617O;

    /* renamed from: P, reason: collision with root package name */
    public C1307d f14618P;

    /* renamed from: Q, reason: collision with root package name */
    public int f14619Q;

    /* renamed from: R, reason: collision with root package name */
    public long f14620R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1314k(K k7, Looper looper) {
        super(3);
        Handler handler;
        C1312i c1312i = C1312i.f14604a;
        this.f14607E = k7;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = t.f17153a;
            handler = new Handler(looper, this);
        }
        this.f14606D = handler;
        this.f14608F = c1312i;
        this.f14609G = new V0(1, false);
        this.f14620R = -9223372036854775807L;
    }

    public final long B() {
        if (this.f14619Q == -1) {
            return Long.MAX_VALUE;
        }
        this.f14617O.getClass();
        if (this.f14619Q >= this.f14617O.p()) {
            return Long.MAX_VALUE;
        }
        return this.f14617O.h(this.f14619Q);
    }

    public final void C() {
        int i7;
        List list;
        InterfaceC1310g c1379a;
        int i8 = 0;
        this.f14612J = true;
        X x4 = this.f14614L;
        x4.getClass();
        this.f14608F.getClass();
        String str = x4.f283C;
        if (str != null) {
            i7 = x4.f301U;
            list = x4.f285E;
            switch (str) {
                case "application/dvbsubs":
                    c1379a = new C1379a(list);
                    break;
                case "application/pgs":
                    c1379a = new C1435b();
                    break;
                case "application/x-mp4-vtt":
                    c1379a = new C1379a();
                    break;
                case "text/vtt":
                    c1379a = new s2.i();
                    break;
                case "application/x-quicktime-tx3g":
                    c1379a = new C1571a(list);
                    break;
                case "text/x-ssa":
                    c1379a = new C1502a(list);
                    break;
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    c1379a = new k2.c(str, i7);
                    break;
                case "text/x-exoplayer-cues":
                    C0844v c0844v = new C0844v();
                    c0844v.f11196c = new C1313j(1);
                    c0844v.f11197d = new ArrayDeque();
                    for (int i9 = 0; i9 < 2; i9++) {
                        ((ArrayDeque) c0844v.f11197d).addFirst(new C1307d(c0844v, i8));
                    }
                    c0844v.f11194a = 0;
                    c1379a = c0844v;
                    break;
                case "application/cea-708":
                    c1379a = new k2.f(i7, list);
                    break;
                case "application/x-subrip":
                    c1379a = new C1534a();
                    break;
                case "application/ttml+xml":
                    c1379a = new C1552d();
                    break;
            }
            this.f14615M = c1379a;
            return;
        }
        throw new IllegalArgumentException(L.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final void D(List list) {
        K k7 = this.f14607E;
        k7.f109a.f164l.k(27, new H(list));
        C1306c c1306c = new C1306c(list);
        N n2 = k7.f109a;
        n2.getClass();
        n2.f164l.k(27, new C0042s(c1306c, 4));
    }

    public final void E() {
        this.f14616N = null;
        this.f14619Q = -1;
        C1307d c1307d = this.f14617O;
        if (c1307d != null) {
            c1307d.t();
            this.f14617O = null;
        }
        C1307d c1307d2 = this.f14618P;
        if (c1307d2 != null) {
            c1307d2.t();
            this.f14618P = null;
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
        return this.f14611I;
    }

    @Override // A1.AbstractC0023i
    public final boolean m() {
        return true;
    }

    @Override // A1.AbstractC0023i
    public final void n() {
        this.f14614L = null;
        this.f14620R = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        Handler handler = this.f14606D;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            D(emptyList);
        }
        E();
        InterfaceC1310g interfaceC1310g = this.f14615M;
        interfaceC1310g.getClass();
        interfaceC1310g.release();
        this.f14615M = null;
        this.f14613K = 0;
    }

    @Override // A1.AbstractC0023i
    public final void p(long j, boolean z4) {
        List emptyList = Collections.emptyList();
        Handler handler = this.f14606D;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            D(emptyList);
        }
        this.f14610H = false;
        this.f14611I = false;
        this.f14620R = -9223372036854775807L;
        if (this.f14613K == 0) {
            E();
            InterfaceC1310g interfaceC1310g = this.f14615M;
            interfaceC1310g.getClass();
            interfaceC1310g.flush();
            return;
        }
        E();
        InterfaceC1310g interfaceC1310g2 = this.f14615M;
        interfaceC1310g2.getClass();
        interfaceC1310g2.release();
        this.f14615M = null;
        this.f14613K = 0;
        C();
    }

    @Override // A1.AbstractC0023i
    public final void t(X[] xArr, long j, long j3) {
        this.f14614L = xArr[0];
        if (this.f14615M != null) {
            this.f14613K = 1;
        } else {
            C();
        }
    }

    @Override // A1.AbstractC0023i
    public final void v(long j, long j3) {
        boolean z4;
        V0 v02 = this.f14609G;
        if (this.f373B) {
            long j7 = this.f14620R;
            if (j7 != -9223372036854775807L && j >= j7) {
                E();
                this.f14611I = true;
            }
        }
        if (this.f14611I) {
            return;
        }
        C1307d c1307d = this.f14618P;
        Handler handler = this.f14606D;
        if (c1307d == null) {
            InterfaceC1310g interfaceC1310g = this.f14615M;
            interfaceC1310g.getClass();
            interfaceC1310g.a(j);
            try {
                InterfaceC1310g interfaceC1310g2 = this.f14615M;
                interfaceC1310g2.getClass();
                this.f14618P = interfaceC1310g2.b();
            } catch (C1311h e7) {
                AbstractC1664a.l("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f14614L, e7);
                List emptyList = Collections.emptyList();
                if (handler != null) {
                    handler.obtainMessage(0, emptyList).sendToTarget();
                } else {
                    D(emptyList);
                }
                E();
                InterfaceC1310g interfaceC1310g3 = this.f14615M;
                interfaceC1310g3.getClass();
                interfaceC1310g3.release();
                this.f14615M = null;
                this.f14613K = 0;
                C();
                return;
            }
        }
        if (this.f380f != 2) {
            return;
        }
        if (this.f14617O != null) {
            long B7 = B();
            z4 = false;
            while (B7 <= j) {
                this.f14619Q++;
                B7 = B();
                z4 = true;
            }
        } else {
            z4 = false;
        }
        C1307d c1307d2 = this.f14618P;
        if (c1307d2 != null) {
            if (c1307d2.f(4)) {
                if (!z4 && B() == Long.MAX_VALUE) {
                    if (this.f14613K == 2) {
                        E();
                        InterfaceC1310g interfaceC1310g4 = this.f14615M;
                        interfaceC1310g4.getClass();
                        interfaceC1310g4.release();
                        this.f14615M = null;
                        this.f14613K = 0;
                        C();
                    } else {
                        E();
                        this.f14611I = true;
                    }
                }
            } else if (c1307d2.f14587c <= j) {
                C1307d c1307d3 = this.f14617O;
                if (c1307d3 != null) {
                    c1307d3.t();
                }
                this.f14619Q = c1307d2.d(j);
                this.f14617O = c1307d2;
                this.f14618P = null;
                z4 = true;
            }
        }
        if (z4) {
            this.f14617O.getClass();
            List m7 = this.f14617O.m(j);
            if (handler != null) {
                handler.obtainMessage(0, m7).sendToTarget();
            } else {
                D(m7);
            }
        }
        if (this.f14613K == 2) {
            return;
        }
        while (!this.f14610H) {
            try {
                C1313j c1313j = this.f14616N;
                if (c1313j == null) {
                    InterfaceC1310g interfaceC1310g5 = this.f14615M;
                    interfaceC1310g5.getClass();
                    c1313j = (C1313j) interfaceC1310g5.c();
                    if (c1313j == null) {
                        return;
                    } else {
                        this.f14616N = c1313j;
                    }
                }
                if (this.f14613K == 1) {
                    c1313j.f1675b = 4;
                    InterfaceC1310g interfaceC1310g6 = this.f14615M;
                    interfaceC1310g6.getClass();
                    interfaceC1310g6.d(c1313j);
                    this.f14616N = null;
                    this.f14613K = 2;
                    return;
                }
                int u4 = u(v02, c1313j, 0);
                if (u4 == -4) {
                    if (c1313j.f(4)) {
                        this.f14610H = true;
                        this.f14612J = false;
                    } else {
                        X x4 = (X) v02.f17563c;
                        if (x4 == null) {
                            return;
                        }
                        c1313j.f14605z = x4.f287G;
                        c1313j.A();
                        this.f14612J &= !c1313j.f(1);
                    }
                    if (!this.f14612J) {
                        InterfaceC1310g interfaceC1310g7 = this.f14615M;
                        interfaceC1310g7.getClass();
                        interfaceC1310g7.d(c1313j);
                        this.f14616N = null;
                    }
                } else if (u4 == -3) {
                    return;
                }
            } catch (C1311h e8) {
                AbstractC1664a.l("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f14614L, e8);
                List emptyList2 = Collections.emptyList();
                if (handler != null) {
                    handler.obtainMessage(0, emptyList2).sendToTarget();
                } else {
                    D(emptyList2);
                }
                E();
                InterfaceC1310g interfaceC1310g8 = this.f14615M;
                interfaceC1310g8.getClass();
                interfaceC1310g8.release();
                this.f14615M = null;
                this.f14613K = 0;
                C();
                return;
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final int z(X x4) {
        this.f14608F.getClass();
        String str = x4.f283C;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return AbstractC0023i.e(x4.f302V == 0 ? 4 : 2, 0, 0);
        }
        return v2.i.i(x4.f283C) ? AbstractC0023i.e(1, 0, 0) : AbstractC0023i.e(0, 0, 0);
    }
}
