package V3;

import N3.C3659j;
import N3.G;
import N3.H;
import N3.InterfaceC3665p;
import N3.M;
import N3.q;
import N3.r;
import c4.C5743a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h4.i;
import j3.C7272n;
import j3.t;
import java.io.IOException;
import k4.o;
import m3.C8050C;

/* loaded from: classes.dex */
final class b implements InterfaceC3665p {

    /* renamed from: b, reason: collision with root package name */
    private r f27961b;

    /* renamed from: c, reason: collision with root package name */
    private int f27962c;

    /* renamed from: d, reason: collision with root package name */
    private int f27963d;

    /* renamed from: e, reason: collision with root package name */
    private int f27964e;

    /* renamed from: g, reason: collision with root package name */
    private C5743a f27966g;

    /* renamed from: h, reason: collision with root package name */
    private C3659j f27967h;

    /* renamed from: i, reason: collision with root package name */
    private d f27968i;

    /* renamed from: j, reason: collision with root package name */
    private i f27969j;

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f27960a = new C8050C(2);

    /* renamed from: f, reason: collision with root package name */
    private long f27965f = -1;

    private void g() {
        r rVar = this.f27961b;
        rVar.getClass();
        rVar.endTracks();
        this.f27961b.seekMap(new H.b(-9223372036854775807L));
        this.f27962c = 6;
    }

    private int h(C3659j c3659j) throws IOException {
        C8050C c8050c = this.f27960a;
        c8050c.O(2);
        c3659j.d(c8050c.e(), 0, 2, false);
        return c8050c.L();
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        if (j11 == 0) {
            this.f27962c = 0;
            this.f27969j = null;
        } else if (this.f27962c == 5) {
            i iVar = this.f27969j;
            iVar.getClass();
            iVar.a(j11, j12);
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f27961b = rVar;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        C3659j c3659j = (C3659j) qVar;
        if (h(c3659j) == 65496) {
            int h11 = h(c3659j);
            this.f27963d = h11;
            if (h11 == 65504) {
                C8050C c8050c = this.f27960a;
                c8050c.O(2);
                c3659j.d(c8050c.e(), 0, 2, false);
                c3659j.i(c8050c.L() - 2, false);
                this.f27963d = h(c3659j);
            }
            if (this.f27963d == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        String z11;
        c a11;
        int i11 = this.f27962c;
        C8050C c8050c = this.f27960a;
        if (i11 == 0) {
            c8050c.O(2);
            ((C3659j) qVar).b(c8050c.e(), 0, 2, false);
            int L11 = c8050c.L();
            this.f27963d = L11;
            if (L11 == 65498) {
                if (this.f27965f != -1) {
                    this.f27962c = 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((L11 < 65488 || L11 > 65497) && L11 != 65281) {
                this.f27962c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            c8050c.O(2);
            ((C3659j) qVar).b(c8050c.e(), 0, 2, false);
            this.f27964e = c8050c.L() - 2;
            this.f27962c = 2;
            return 0;
        }
        if (i11 == 2) {
            if (this.f27963d == 65505) {
                C8050C c8050c2 = new C8050C(this.f27964e);
                ((C3659j) qVar).b(c8050c2.e(), 0, this.f27964e, false);
                if (this.f27966g == null && "http://ns.adobe.com/xap/1.0/".equals(c8050c2.z()) && (z11 = c8050c2.z()) != null) {
                    long length = ((C3659j) qVar).getLength();
                    C5743a c5743a = null;
                    if (length != -1 && (a11 = f.a(z11)) != null) {
                        c5743a = a11.a(length);
                    }
                    this.f27966g = c5743a;
                    if (c5743a != null) {
                        this.f27965f = c5743a.f56484d;
                    }
                }
            } else {
                ((C3659j) qVar).m(this.f27964e, false);
            }
            this.f27962c = 0;
            return 0;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 == 6) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            if (this.f27968i == null || qVar != this.f27967h) {
                C3659j c3659j = (C3659j) qVar;
                this.f27967h = c3659j;
                this.f27968i = new d(c3659j, this.f27965f);
            }
            i iVar = this.f27969j;
            iVar.getClass();
            int f7 = iVar.f(this.f27968i, g10);
            if (f7 == 1) {
                g10.f18501a += this.f27965f;
            }
            return f7;
        }
        C3659j c3659j2 = (C3659j) qVar;
        long position = c3659j2.getPosition();
        long j11 = this.f27965f;
        if (position != j11) {
            g10.f18501a = j11;
            return 1;
        }
        if (!c3659j2.d(c8050c.e(), 0, 1, true)) {
            g();
            return 0;
        }
        c3659j2.e();
        if (this.f27969j == null) {
            this.f27969j = new i(o.a.f70474a, 8);
        }
        d dVar = new d(c3659j2, this.f27965f);
        this.f27968i = dVar;
        if (!this.f27969j.d(dVar)) {
            g();
            return 0;
        }
        i iVar2 = this.f27969j;
        long j12 = this.f27965f;
        r rVar = this.f27961b;
        rVar.getClass();
        iVar2.b(new e(j12, rVar));
        C5743a c5743a2 = this.f27966g;
        c5743a2.getClass();
        r rVar2 = this.f27961b;
        rVar2.getClass();
        M track = rVar2.track(UserVerificationMethods.USER_VERIFY_ALL, 4);
        C7272n.a aVar = new C7272n.a();
        aVar.W("image/jpeg");
        aVar.r0(new t(c5743a2));
        track.a(aVar.P());
        this.f27962c = 5;
        return 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
        i iVar = this.f27969j;
        if (iVar != null) {
            iVar.getClass();
        }
    }
}
