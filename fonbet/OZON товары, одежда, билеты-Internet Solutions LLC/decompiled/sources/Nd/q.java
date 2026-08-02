package Nd;

import Nd.p;
import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.p;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends h.d<q> {

    /* renamed from: o, reason: collision with root package name */
    private static final q f19372o;

    /* renamed from: p, reason: collision with root package name */
    public static Td.r<q> f19373p = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19374b;

    /* renamed from: c, reason: collision with root package name */
    private int f19375c;

    /* renamed from: d, reason: collision with root package name */
    private int f19376d;

    /* renamed from: e, reason: collision with root package name */
    private int f19377e;

    /* renamed from: f, reason: collision with root package name */
    private List<r> f19378f;

    /* renamed from: g, reason: collision with root package name */
    private p f19379g;

    /* renamed from: h, reason: collision with root package name */
    private int f19380h;

    /* renamed from: i, reason: collision with root package name */
    private p f19381i;

    /* renamed from: j, reason: collision with root package name */
    private int f19382j;

    /* renamed from: k, reason: collision with root package name */
    private List<Nd.a> f19383k;

    /* renamed from: l, reason: collision with root package name */
    private List<Integer> f19384l;

    /* renamed from: m, reason: collision with root package name */
    private byte f19385m;

    /* renamed from: n, reason: collision with root package name */
    private int f19386n;

    /* loaded from: classes10.dex */
    static class a extends Td.b<q> {
        a() {
        }

        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new q(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<q, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19387d;

        /* renamed from: e, reason: collision with root package name */
        private int f19388e = 6;

        /* renamed from: f, reason: collision with root package name */
        private int f19389f;

        /* renamed from: g, reason: collision with root package name */
        private List<r> f19390g;

        /* renamed from: h, reason: collision with root package name */
        private p f19391h;

        /* renamed from: i, reason: collision with root package name */
        private int f19392i;

        /* renamed from: j, reason: collision with root package name */
        private p f19393j;

        /* renamed from: k, reason: collision with root package name */
        private int f19394k;

        /* renamed from: l, reason: collision with root package name */
        private List<Nd.a> f19395l;

        /* renamed from: m, reason: collision with root package name */
        private List<Integer> f19396m;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f19390g = list;
            this.f19391h = p.T();
            this.f19393j = p.T();
            this.f19395l = list;
            this.f19396m = list;
        }

        static b i() {
            return new b();
        }

        @Override // Td.AbstractC4045a.AbstractC0542a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, Td.f fVar) throws IOException {
            l(dVar, fVar);
            return this;
        }

        @Override // Td.p.a
        public final Td.p build() {
            q j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw new Td.v();
        }

        @Override // Td.h.b
        /* renamed from: c */
        public final h.b clone() {
            b bVar = new b();
            bVar.k(j());
            return bVar;
        }

        @Override // Td.h.b
        public final Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            bVar.k(j());
            return bVar;
        }

        @Override // Td.h.b
        public final /* bridge */ /* synthetic */ h.b e(Td.h hVar) {
            k((q) hVar);
            return this;
        }

        public final q j() {
            q qVar = new q(this);
            int i11 = this.f19387d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            qVar.f19376d = this.f19388e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            qVar.f19377e = this.f19389f;
            if ((this.f19387d & 4) == 4) {
                this.f19390g = Collections.unmodifiableList(this.f19390g);
                this.f19387d &= -5;
            }
            qVar.f19378f = this.f19390g;
            if ((i11 & 8) == 8) {
                i12 |= 4;
            }
            qVar.f19379g = this.f19391h;
            if ((i11 & 16) == 16) {
                i12 |= 8;
            }
            qVar.f19380h = this.f19392i;
            if ((i11 & 32) == 32) {
                i12 |= 16;
            }
            qVar.f19381i = this.f19393j;
            if ((i11 & 64) == 64) {
                i12 |= 32;
            }
            qVar.f19382j = this.f19394k;
            if ((this.f19387d & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                this.f19395l = Collections.unmodifiableList(this.f19395l);
                this.f19387d &= -129;
            }
            qVar.f19383k = this.f19395l;
            if ((this.f19387d & 256) == 256) {
                this.f19396m = Collections.unmodifiableList(this.f19396m);
                this.f19387d &= -257;
            }
            qVar.f19384l = this.f19396m;
            qVar.f19375c = i12;
            return qVar;
        }

        public final void k(q qVar) {
            if (qVar == q.M()) {
                return;
            }
            if (qVar.W()) {
                int P11 = qVar.P();
                this.f19387d |= 1;
                this.f19388e = P11;
            }
            if (qVar.X()) {
                int Q11 = qVar.Q();
                this.f19387d |= 2;
                this.f19389f = Q11;
            }
            if (!qVar.f19378f.isEmpty()) {
                if (this.f19390g.isEmpty()) {
                    this.f19390g = qVar.f19378f;
                    this.f19387d &= -5;
                } else {
                    if ((this.f19387d & 4) != 4) {
                        this.f19390g = new ArrayList(this.f19390g);
                        this.f19387d |= 4;
                    }
                    this.f19390g.addAll(qVar.f19378f);
                }
            }
            if (qVar.Y()) {
                p S11 = qVar.S();
                if ((this.f19387d & 8) != 8 || this.f19391h == p.T()) {
                    this.f19391h = S11;
                } else {
                    p.c s02 = p.s0(this.f19391h);
                    s02.k(S11);
                    this.f19391h = s02.j();
                }
                this.f19387d |= 8;
            }
            if (qVar.Z()) {
                int T11 = qVar.T();
                this.f19387d |= 16;
                this.f19392i = T11;
            }
            if (qVar.U()) {
                p N11 = qVar.N();
                if ((this.f19387d & 32) != 32 || this.f19393j == p.T()) {
                    this.f19393j = N11;
                } else {
                    p.c s03 = p.s0(this.f19393j);
                    s03.k(N11);
                    this.f19393j = s03.j();
                }
                this.f19387d |= 32;
            }
            if (qVar.V()) {
                int O11 = qVar.O();
                this.f19387d |= 64;
                this.f19394k = O11;
            }
            if (!qVar.f19383k.isEmpty()) {
                if (this.f19395l.isEmpty()) {
                    this.f19395l = qVar.f19383k;
                    this.f19387d &= -129;
                } else {
                    if ((this.f19387d & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                        this.f19395l = new ArrayList(this.f19395l);
                        this.f19387d |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    this.f19395l.addAll(qVar.f19383k);
                }
            }
            if (!qVar.f19384l.isEmpty()) {
                if (this.f19396m.isEmpty()) {
                    this.f19396m = qVar.f19384l;
                    this.f19387d &= -257;
                } else {
                    if ((this.f19387d & 256) != 256) {
                        this.f19396m = new ArrayList(this.f19396m);
                        this.f19387d |= 256;
                    }
                    this.f19396m.addAll(qVar.f19384l);
                }
            }
            h(qVar);
            f(d().b(qVar.f19374b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            q qVar = null;
            try {
                try {
                    ((a) q.f19373p).getClass();
                    k(new q(dVar, fVar));
                } catch (Td.j e11) {
                    q qVar2 = (q) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        qVar = qVar2;
                        if (qVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (qVar != null) {
                    k(qVar);
                }
                throw th;
            }
        }

        @Override // Td.AbstractC4045a.AbstractC0542a, Td.p.a
        public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, Td.f fVar) throws IOException {
            l(dVar, fVar);
            return this;
        }
    }

    static {
        q qVar = new q(0);
        f19372o = qVar;
        qVar.a0();
    }

    private q() {
        throw null;
    }

    q(b bVar) {
        super(bVar);
        this.f19385m = (byte) -1;
        this.f19386n = -1;
        this.f19374b = bVar.d();
    }

    public static q M() {
        return f19372o;
    }

    private void a0() {
        this.f19376d = 6;
        this.f19377e = 0;
        List list = Collections.EMPTY_LIST;
        this.f19378f = list;
        this.f19379g = p.T();
        this.f19380h = 0;
        this.f19381i = p.T();
        this.f19382j = 0;
        this.f19383k = list;
        this.f19384l = list;
    }

    public final List<Nd.a> L() {
        return this.f19383k;
    }

    public final p N() {
        return this.f19381i;
    }

    public final int O() {
        return this.f19382j;
    }

    public final int P() {
        return this.f19376d;
    }

    public final int Q() {
        return this.f19377e;
    }

    public final List<r> R() {
        return this.f19378f;
    }

    public final p S() {
        return this.f19379g;
    }

    public final int T() {
        return this.f19380h;
    }

    public final boolean U() {
        return (this.f19375c & 16) == 16;
    }

    public final boolean V() {
        return (this.f19375c & 32) == 32;
    }

    public final boolean W() {
        return (this.f19375c & 1) == 1;
    }

    public final boolean X() {
        return (this.f19375c & 2) == 2;
    }

    public final boolean Y() {
        return (this.f19375c & 4) == 4;
    }

    public final boolean Z() {
        return (this.f19375c & 8) == 8;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19375c & 1) == 1) {
            eVar.m(1, this.f19376d);
        }
        if ((this.f19375c & 2) == 2) {
            eVar.m(2, this.f19377e);
        }
        for (int i11 = 0; i11 < this.f19378f.size(); i11++) {
            eVar.o(3, this.f19378f.get(i11));
        }
        if ((this.f19375c & 4) == 4) {
            eVar.o(4, this.f19379g);
        }
        if ((this.f19375c & 8) == 8) {
            eVar.m(5, this.f19380h);
        }
        if ((this.f19375c & 16) == 16) {
            eVar.o(6, this.f19381i);
        }
        if ((this.f19375c & 32) == 32) {
            eVar.m(7, this.f19382j);
        }
        for (int i12 = 0; i12 < this.f19383k.size(); i12++) {
            eVar.o(8, this.f19383k.get(i12));
        }
        for (int i13 = 0; i13 < this.f19384l.size(); i13++) {
            eVar.m(31, this.f19384l.get(i13).intValue());
        }
        n11.a(m.e.DEFAULT_DRAG_ANIMATION_DURATION, eVar);
        eVar.r(this.f19374b);
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19372o;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19386n;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19375c & 1) == 1 ? Td.e.b(1, this.f19376d) : 0;
        if ((this.f19375c & 2) == 2) {
            b11 += Td.e.b(2, this.f19377e);
        }
        for (int i12 = 0; i12 < this.f19378f.size(); i12++) {
            b11 += Td.e.d(3, this.f19378f.get(i12));
        }
        if ((this.f19375c & 4) == 4) {
            b11 += Td.e.d(4, this.f19379g);
        }
        if ((this.f19375c & 8) == 8) {
            b11 += Td.e.b(5, this.f19380h);
        }
        if ((this.f19375c & 16) == 16) {
            b11 += Td.e.d(6, this.f19381i);
        }
        if ((this.f19375c & 32) == 32) {
            b11 += Td.e.b(7, this.f19382j);
        }
        for (int i13 = 0; i13 < this.f19383k.size(); i13++) {
            b11 += Td.e.d(8, this.f19383k.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f19384l.size(); i15++) {
            i14 += Td.e.c(this.f19384l.get(i15).intValue());
        }
        int size = this.f19374b.size() + (this.f19384l.size() * 2) + b11 + i14 + g();
        this.f19386n = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19385m;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!X()) {
            this.f19385m = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f19378f.size(); i11++) {
            if (!this.f19378f.get(i11).isInitialized()) {
                this.f19385m = (byte) 0;
                return false;
            }
        }
        if (Y() && !this.f19379g.isInitialized()) {
            this.f19385m = (byte) 0;
            return false;
        }
        if (U() && !this.f19381i.isInitialized()) {
            this.f19385m = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f19383k.size(); i12++) {
            if (!this.f19383k.get(i12).isInitialized()) {
                this.f19385m = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f19385m = (byte) 1;
            return true;
        }
        this.f19385m = (byte) 0;
        return false;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return b.i();
    }

    @Override // Td.p
    public final p.a toBuilder() {
        b i11 = b.i();
        i11.k(this);
        return i11;
    }

    private q(int i11) {
        this.f19385m = (byte) -1;
        this.f19386n = -1;
        this.f19374b = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    q(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19385m = (byte) -1;
        this.f19386n = -1;
        a0();
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            ?? r52 = 128;
            if (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        p.c cVar = null;
                        switch (r11) {
                            case 0:
                                z11 = true;
                            case 8:
                                this.f19375c |= 1;
                                this.f19376d = dVar.n();
                            case 16:
                                this.f19375c |= 2;
                                this.f19377e = dVar.n();
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                if ((i11 & 4) != 4) {
                                    this.f19378f = new ArrayList();
                                    i11 |= 4;
                                }
                                this.f19378f.add(dVar.i(r.f19398n, fVar));
                            case 34:
                                if ((this.f19375c & 4) == 4) {
                                    p pVar = this.f19379g;
                                    pVar.getClass();
                                    cVar = p.s0(pVar);
                                }
                                p pVar2 = (p) dVar.i(p.f19325u, fVar);
                                this.f19379g = pVar2;
                                if (cVar != null) {
                                    cVar.k(pVar2);
                                    this.f19379g = cVar.j();
                                }
                                this.f19375c |= 4;
                            case 40:
                                this.f19375c |= 8;
                                this.f19380h = dVar.n();
                            case 50:
                                if ((this.f19375c & 16) == 16) {
                                    p pVar3 = this.f19381i;
                                    pVar3.getClass();
                                    cVar = p.s0(pVar3);
                                }
                                p pVar4 = (p) dVar.i(p.f19325u, fVar);
                                this.f19381i = pVar4;
                                if (cVar != null) {
                                    cVar.k(pVar4);
                                    this.f19381i = cVar.j();
                                }
                                this.f19375c |= 16;
                            case 56:
                                this.f19375c |= 32;
                                this.f19382j = dVar.n();
                            case 66:
                                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                                    this.f19383k = new ArrayList();
                                    i11 |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                }
                                this.f19383k.add(dVar.i(Nd.a.f19014h, fVar));
                            case 248:
                                if ((i11 & 256) != 256) {
                                    this.f19384l = new ArrayList();
                                    i11 |= 256;
                                }
                                this.f19384l.add(Integer.valueOf(dVar.n()));
                            case m.e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                int e11 = dVar.e(dVar.n());
                                if ((i11 & 256) != 256 && dVar.b() > 0) {
                                    this.f19384l = new ArrayList();
                                    i11 |= 256;
                                }
                                while (dVar.b() > 0) {
                                    this.f19384l.add(Integer.valueOf(dVar.n()));
                                }
                                dVar.d(e11);
                                break;
                            default:
                                r52 = p(dVar, j11, fVar, r11);
                                if (r52 == 0) {
                                    z11 = true;
                                }
                        }
                    } catch (Throwable th2) {
                        if ((i11 & 4) == 4) {
                            this.f19378f = Collections.unmodifiableList(this.f19378f);
                        }
                        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == r52) {
                            this.f19383k = Collections.unmodifiableList(this.f19383k);
                        }
                        if ((i11 & 256) == 256) {
                            this.f19384l = Collections.unmodifiableList(this.f19384l);
                        }
                        try {
                            j11.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f19374b = m11.j();
                            throw th3;
                        }
                        this.f19374b = m11.j();
                        m();
                        throw th2;
                    }
                } catch (Td.j e12) {
                    e12.b(this);
                    throw e12;
                } catch (IOException e13) {
                    Td.j jVar = new Td.j(e13.getMessage());
                    jVar.b(this);
                    throw jVar;
                }
            } else {
                if ((i11 & 4) == 4) {
                    this.f19378f = Collections.unmodifiableList(this.f19378f);
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    this.f19383k = Collections.unmodifiableList(this.f19383k);
                }
                if ((i11 & 256) == 256) {
                    this.f19384l = Collections.unmodifiableList(this.f19384l);
                }
                try {
                    j11.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f19374b = m11.j();
                    throw th4;
                }
                this.f19374b = m11.j();
                m();
                return;
            }
        }
    }
}
