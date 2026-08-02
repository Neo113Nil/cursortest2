package Nd;

import Nd.p;
import Nd.t;
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
public final class m extends h.d<m> {

    /* renamed from: u, reason: collision with root package name */
    private static final m f19259u;

    /* renamed from: v, reason: collision with root package name */
    public static Td.r<m> f19260v = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19261b;

    /* renamed from: c, reason: collision with root package name */
    private int f19262c;

    /* renamed from: d, reason: collision with root package name */
    private int f19263d;

    /* renamed from: e, reason: collision with root package name */
    private int f19264e;

    /* renamed from: f, reason: collision with root package name */
    private int f19265f;

    /* renamed from: g, reason: collision with root package name */
    private p f19266g;

    /* renamed from: h, reason: collision with root package name */
    private int f19267h;

    /* renamed from: i, reason: collision with root package name */
    private List<r> f19268i;

    /* renamed from: j, reason: collision with root package name */
    private p f19269j;

    /* renamed from: k, reason: collision with root package name */
    private int f19270k;

    /* renamed from: l, reason: collision with root package name */
    private List<p> f19271l;

    /* renamed from: m, reason: collision with root package name */
    private List<Integer> f19272m;

    /* renamed from: n, reason: collision with root package name */
    private int f19273n;

    /* renamed from: o, reason: collision with root package name */
    private t f19274o;

    /* renamed from: p, reason: collision with root package name */
    private int f19275p;

    /* renamed from: q, reason: collision with root package name */
    private int f19276q;

    /* renamed from: r, reason: collision with root package name */
    private List<Integer> f19277r;

    /* renamed from: s, reason: collision with root package name */
    private byte f19278s;

    /* renamed from: t, reason: collision with root package name */
    private int f19279t;

    static class a extends Td.b<m> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new m(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<m, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19280d;

        /* renamed from: g, reason: collision with root package name */
        private int f19283g;

        /* renamed from: i, reason: collision with root package name */
        private int f19285i;

        /* renamed from: j, reason: collision with root package name */
        private List<r> f19286j;

        /* renamed from: k, reason: collision with root package name */
        private p f19287k;

        /* renamed from: l, reason: collision with root package name */
        private int f19288l;

        /* renamed from: m, reason: collision with root package name */
        private List<p> f19289m;

        /* renamed from: n, reason: collision with root package name */
        private List<Integer> f19290n;

        /* renamed from: o, reason: collision with root package name */
        private t f19291o;

        /* renamed from: p, reason: collision with root package name */
        private int f19292p;

        /* renamed from: q, reason: collision with root package name */
        private int f19293q;

        /* renamed from: r, reason: collision with root package name */
        private List<Integer> f19294r;

        /* renamed from: e, reason: collision with root package name */
        private int f19281e = 518;

        /* renamed from: f, reason: collision with root package name */
        private int f19282f = 2054;

        /* renamed from: h, reason: collision with root package name */
        private p f19284h = p.T();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f19286j = list;
            this.f19287k = p.T();
            this.f19289m = list;
            this.f19290n = list;
            this.f19291o = t.F();
            this.f19294r = list;
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
            m j11 = j();
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
            k((m) hVar);
            return this;
        }

        public final m j() {
            m mVar = new m(this);
            int i11 = this.f19280d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            mVar.f19263d = this.f19281e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            mVar.f19264e = this.f19282f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            mVar.f19265f = this.f19283g;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            mVar.f19266g = this.f19284h;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            mVar.f19267h = this.f19285i;
            if ((this.f19280d & 32) == 32) {
                this.f19286j = Collections.unmodifiableList(this.f19286j);
                this.f19280d &= -33;
            }
            mVar.f19268i = this.f19286j;
            if ((i11 & 64) == 64) {
                i12 |= 32;
            }
            mVar.f19269j = this.f19287k;
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                i12 |= 64;
            }
            mVar.f19270k = this.f19288l;
            if ((this.f19280d & 256) == 256) {
                this.f19289m = Collections.unmodifiableList(this.f19289m);
                this.f19280d &= -257;
            }
            mVar.f19271l = this.f19289m;
            if ((this.f19280d & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                this.f19290n = Collections.unmodifiableList(this.f19290n);
                this.f19280d &= -513;
            }
            mVar.f19272m = this.f19290n;
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                i12 |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            mVar.f19274o = this.f19291o;
            if ((i11 & 2048) == 2048) {
                i12 |= 256;
            }
            mVar.f19275p = this.f19292p;
            if ((i11 & 4096) == 4096) {
                i12 |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            mVar.f19276q = this.f19293q;
            if ((this.f19280d & 8192) == 8192) {
                this.f19294r = Collections.unmodifiableList(this.f19294r);
                this.f19280d &= -8193;
            }
            mVar.f19277r = this.f19294r;
            mVar.f19262c = i12;
            return mVar;
        }

        public final void k(m mVar) {
            if (mVar == m.T()) {
                return;
            }
            if (mVar.f0()) {
                int U10 = mVar.U();
                this.f19280d |= 1;
                this.f19281e = U10;
            }
            if (mVar.i0()) {
                int X9 = mVar.X();
                this.f19280d |= 2;
                this.f19282f = X9;
            }
            if (mVar.h0()) {
                int W11 = mVar.W();
                this.f19280d |= 4;
                this.f19283g = W11;
            }
            if (mVar.l0()) {
                p a02 = mVar.a0();
                if ((this.f19280d & 8) != 8 || this.f19284h == p.T()) {
                    this.f19284h = a02;
                } else {
                    p.c s02 = p.s0(this.f19284h);
                    s02.k(a02);
                    this.f19284h = s02.j();
                }
                this.f19280d |= 8;
            }
            if (mVar.m0()) {
                int b02 = mVar.b0();
                this.f19280d |= 16;
                this.f19285i = b02;
            }
            if (!mVar.f19268i.isEmpty()) {
                if (this.f19286j.isEmpty()) {
                    this.f19286j = mVar.f19268i;
                    this.f19280d &= -33;
                } else {
                    if ((this.f19280d & 32) != 32) {
                        this.f19286j = new ArrayList(this.f19286j);
                        this.f19280d |= 32;
                    }
                    this.f19286j.addAll(mVar.f19268i);
                }
            }
            if (mVar.j0()) {
                p Y11 = mVar.Y();
                if ((this.f19280d & 64) != 64 || this.f19287k == p.T()) {
                    this.f19287k = Y11;
                } else {
                    p.c s03 = p.s0(this.f19287k);
                    s03.k(Y11);
                    this.f19287k = s03.j();
                }
                this.f19280d |= 64;
            }
            if (mVar.k0()) {
                int Z11 = mVar.Z();
                this.f19280d |= UserVerificationMethods.USER_VERIFY_PATTERN;
                this.f19288l = Z11;
            }
            if (!mVar.f19271l.isEmpty()) {
                if (this.f19289m.isEmpty()) {
                    this.f19289m = mVar.f19271l;
                    this.f19280d &= -257;
                } else {
                    if ((this.f19280d & 256) != 256) {
                        this.f19289m = new ArrayList(this.f19289m);
                        this.f19280d |= 256;
                    }
                    this.f19289m.addAll(mVar.f19271l);
                }
            }
            if (!mVar.f19272m.isEmpty()) {
                if (this.f19290n.isEmpty()) {
                    this.f19290n = mVar.f19272m;
                    this.f19280d &= -513;
                } else {
                    if ((this.f19280d & UserVerificationMethods.USER_VERIFY_NONE) != 512) {
                        this.f19290n = new ArrayList(this.f19290n);
                        this.f19280d |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    this.f19290n.addAll(mVar.f19272m);
                }
            }
            if (mVar.o0()) {
                t d02 = mVar.d0();
                if ((this.f19280d & UserVerificationMethods.USER_VERIFY_ALL) != 1024 || this.f19291o == t.F()) {
                    this.f19291o = d02;
                } else {
                    t tVar = this.f19291o;
                    t.b i11 = t.b.i();
                    i11.k(tVar);
                    i11.k(d02);
                    this.f19291o = i11.j();
                }
                this.f19280d |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (mVar.g0()) {
                int V11 = mVar.V();
                this.f19280d |= 2048;
                this.f19292p = V11;
            }
            if (mVar.n0()) {
                int c02 = mVar.c0();
                this.f19280d |= 4096;
                this.f19293q = c02;
            }
            if (!mVar.f19277r.isEmpty()) {
                if (this.f19294r.isEmpty()) {
                    this.f19294r = mVar.f19277r;
                    this.f19280d &= -8193;
                } else {
                    if ((this.f19280d & 8192) != 8192) {
                        this.f19294r = new ArrayList(this.f19294r);
                        this.f19280d |= 8192;
                    }
                    this.f19294r.addAll(mVar.f19277r);
                }
            }
            h(mVar);
            f(d().b(mVar.f19261b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            m mVar = null;
            try {
                try {
                    ((a) m.f19260v).getClass();
                    k(new m(dVar, fVar));
                } catch (Td.j e11) {
                    m mVar2 = (m) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        mVar = mVar2;
                        if (mVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (mVar != null) {
                    k(mVar);
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
        m mVar = new m(0);
        f19259u = mVar;
        mVar.p0();
    }

    private m() {
        throw null;
    }

    m(b bVar) {
        super(bVar);
        this.f19273n = -1;
        this.f19278s = (byte) -1;
        this.f19279t = -1;
        this.f19261b = bVar.d();
    }

    public static m T() {
        return f19259u;
    }

    private void p0() {
        this.f19263d = 518;
        this.f19264e = 2054;
        this.f19265f = 0;
        this.f19266g = p.T();
        this.f19267h = 0;
        List list = Collections.EMPTY_LIST;
        this.f19268i = list;
        this.f19269j = p.T();
        this.f19270k = 0;
        this.f19271l = list;
        this.f19272m = list;
        this.f19274o = t.F();
        this.f19275p = 0;
        this.f19276q = 0;
        this.f19277r = list;
    }

    public final List<Integer> R() {
        return this.f19272m;
    }

    public final List<p> S() {
        return this.f19271l;
    }

    public final int U() {
        return this.f19263d;
    }

    public final int V() {
        return this.f19275p;
    }

    public final int W() {
        return this.f19265f;
    }

    public final int X() {
        return this.f19264e;
    }

    public final p Y() {
        return this.f19269j;
    }

    public final int Z() {
        return this.f19270k;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19262c & 2) == 2) {
            eVar.m(1, this.f19264e);
        }
        if ((this.f19262c & 4) == 4) {
            eVar.m(2, this.f19265f);
        }
        if ((this.f19262c & 8) == 8) {
            eVar.o(3, this.f19266g);
        }
        for (int i11 = 0; i11 < this.f19268i.size(); i11++) {
            eVar.o(4, this.f19268i.get(i11));
        }
        if ((this.f19262c & 32) == 32) {
            eVar.o(5, this.f19269j);
        }
        if ((this.f19262c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            eVar.o(6, this.f19274o);
        }
        if ((this.f19262c & 256) == 256) {
            eVar.m(7, this.f19275p);
        }
        if ((this.f19262c & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            eVar.m(8, this.f19276q);
        }
        if ((this.f19262c & 16) == 16) {
            eVar.m(9, this.f19267h);
        }
        if ((this.f19262c & 64) == 64) {
            eVar.m(10, this.f19270k);
        }
        if ((this.f19262c & 1) == 1) {
            eVar.m(11, this.f19263d);
        }
        for (int i12 = 0; i12 < this.f19271l.size(); i12++) {
            eVar.o(12, this.f19271l.get(i12));
        }
        if (this.f19272m.size() > 0) {
            eVar.v(106);
            eVar.v(this.f19273n);
        }
        for (int i13 = 0; i13 < this.f19272m.size(); i13++) {
            eVar.n(this.f19272m.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.f19277r.size(); i14++) {
            eVar.m(31, this.f19277r.get(i14).intValue());
        }
        n11.a(19000, eVar);
        eVar.r(this.f19261b);
    }

    public final p a0() {
        return this.f19266g;
    }

    public final int b0() {
        return this.f19267h;
    }

    public final int c0() {
        return this.f19276q;
    }

    public final t d0() {
        return this.f19274o;
    }

    public final List<r> e0() {
        return this.f19268i;
    }

    public final boolean f0() {
        return (this.f19262c & 1) == 1;
    }

    public final boolean g0() {
        return (this.f19262c & 256) == 256;
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19259u;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19279t;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19262c & 2) == 2 ? Td.e.b(1, this.f19264e) : 0;
        if ((this.f19262c & 4) == 4) {
            b11 += Td.e.b(2, this.f19265f);
        }
        if ((this.f19262c & 8) == 8) {
            b11 += Td.e.d(3, this.f19266g);
        }
        for (int i12 = 0; i12 < this.f19268i.size(); i12++) {
            b11 += Td.e.d(4, this.f19268i.get(i12));
        }
        if ((this.f19262c & 32) == 32) {
            b11 += Td.e.d(5, this.f19269j);
        }
        if ((this.f19262c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            b11 += Td.e.d(6, this.f19274o);
        }
        if ((this.f19262c & 256) == 256) {
            b11 += Td.e.b(7, this.f19275p);
        }
        if ((this.f19262c & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            b11 += Td.e.b(8, this.f19276q);
        }
        if ((this.f19262c & 16) == 16) {
            b11 += Td.e.b(9, this.f19267h);
        }
        if ((this.f19262c & 64) == 64) {
            b11 += Td.e.b(10, this.f19270k);
        }
        if ((this.f19262c & 1) == 1) {
            b11 += Td.e.b(11, this.f19263d);
        }
        for (int i13 = 0; i13 < this.f19271l.size(); i13++) {
            b11 += Td.e.d(12, this.f19271l.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f19272m.size(); i15++) {
            i14 += Td.e.c(this.f19272m.get(i15).intValue());
        }
        int i16 = b11 + i14;
        if (!this.f19272m.isEmpty()) {
            i16 = i16 + 1 + Td.e.c(i14);
        }
        this.f19273n = i14;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f19277r.size(); i18++) {
            i17 += Td.e.c(this.f19277r.get(i18).intValue());
        }
        int size = this.f19261b.size() + (this.f19277r.size() * 2) + i16 + i17 + g();
        this.f19279t = size;
        return size;
    }

    public final boolean h0() {
        return (this.f19262c & 4) == 4;
    }

    public final boolean i0() {
        return (this.f19262c & 2) == 2;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19278s;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!h0()) {
            this.f19278s = (byte) 0;
            return false;
        }
        if (l0() && !this.f19266g.isInitialized()) {
            this.f19278s = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f19268i.size(); i11++) {
            if (!this.f19268i.get(i11).isInitialized()) {
                this.f19278s = (byte) 0;
                return false;
            }
        }
        if (j0() && !this.f19269j.isInitialized()) {
            this.f19278s = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f19271l.size(); i12++) {
            if (!this.f19271l.get(i12).isInitialized()) {
                this.f19278s = (byte) 0;
                return false;
            }
        }
        if (o0() && !this.f19274o.isInitialized()) {
            this.f19278s = (byte) 0;
            return false;
        }
        if (f()) {
            this.f19278s = (byte) 1;
            return true;
        }
        this.f19278s = (byte) 0;
        return false;
    }

    public final boolean j0() {
        return (this.f19262c & 32) == 32;
    }

    public final boolean k0() {
        return (this.f19262c & 64) == 64;
    }

    public final boolean l0() {
        return (this.f19262c & 8) == 8;
    }

    public final boolean m0() {
        return (this.f19262c & 16) == 16;
    }

    public final boolean n0() {
        return (this.f19262c & UserVerificationMethods.USER_VERIFY_NONE) == 512;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return b.i();
    }

    public final boolean o0() {
        return (this.f19262c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128;
    }

    @Override // Td.p
    public final p.a toBuilder() {
        b i11 = b.i();
        i11.k(this);
        return i11;
    }

    private m(int i11) {
        this.f19273n = -1;
        this.f19278s = (byte) -1;
        this.f19279t = -1;
        this.f19261b = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    m(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19273n = -1;
        this.f19278s = (byte) -1;
        this.f19279t = -1;
        p0();
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        char c11 = 0;
        while (true) {
            ?? r52 = 256;
            if (!z11) {
                try {
                    try {
                        try {
                            int r11 = dVar.r();
                            p.c cVar = null;
                            t.b bVar = null;
                            p.c cVar2 = null;
                            switch (r11) {
                                case 0:
                                    z11 = true;
                                case 8:
                                    this.f19262c |= 2;
                                    this.f19264e = dVar.n();
                                case 16:
                                    this.f19262c |= 4;
                                    this.f19265f = dVar.n();
                                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                    if ((this.f19262c & 8) == 8) {
                                        p pVar = this.f19266g;
                                        pVar.getClass();
                                        cVar = p.s0(pVar);
                                    }
                                    p pVar2 = (p) dVar.i(p.f19325u, fVar);
                                    this.f19266g = pVar2;
                                    if (cVar != null) {
                                        cVar.k(pVar2);
                                        this.f19266g = cVar.j();
                                    }
                                    this.f19262c |= 8;
                                case 34:
                                    int i11 = (c11 == true ? 1 : 0) & 32;
                                    c11 = c11;
                                    if (i11 != 32) {
                                        this.f19268i = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | ' ';
                                    }
                                    this.f19268i.add(dVar.i(r.f19398n, fVar));
                                case 42:
                                    if ((this.f19262c & 32) == 32) {
                                        p pVar3 = this.f19269j;
                                        pVar3.getClass();
                                        cVar2 = p.s0(pVar3);
                                    }
                                    p pVar4 = (p) dVar.i(p.f19325u, fVar);
                                    this.f19269j = pVar4;
                                    if (cVar2 != null) {
                                        cVar2.k(pVar4);
                                        this.f19269j = cVar2.j();
                                    }
                                    this.f19262c |= 32;
                                case 50:
                                    if ((this.f19262c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                                        t tVar = this.f19274o;
                                        tVar.getClass();
                                        bVar = t.b.i();
                                        bVar.k(tVar);
                                    }
                                    t tVar2 = (t) dVar.i(t.f19429m, fVar);
                                    this.f19274o = tVar2;
                                    if (bVar != null) {
                                        bVar.k(tVar2);
                                        this.f19274o = bVar.j();
                                    }
                                    this.f19262c |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                case 56:
                                    this.f19262c |= 256;
                                    this.f19275p = dVar.n();
                                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                    this.f19262c |= UserVerificationMethods.USER_VERIFY_NONE;
                                    this.f19276q = dVar.n();
                                case 72:
                                    this.f19262c |= 16;
                                    this.f19267h = dVar.n();
                                case 80:
                                    this.f19262c |= 64;
                                    this.f19270k = dVar.n();
                                case 88:
                                    this.f19262c |= 1;
                                    this.f19263d = dVar.n();
                                case 98:
                                    int i12 = (c11 == true ? 1 : 0) & 256;
                                    c11 = c11;
                                    if (i12 != 256) {
                                        this.f19271l = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 256;
                                    }
                                    this.f19271l.add(dVar.i(p.f19325u, fVar));
                                case 104:
                                    int i13 = (c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                                    c11 = c11;
                                    if (i13 != 512) {
                                        this.f19272m = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 512;
                                    }
                                    this.f19272m.add(Integer.valueOf(dVar.n()));
                                case 106:
                                    int e11 = dVar.e(dVar.n());
                                    int i14 = (c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                                    c11 = c11;
                                    if (i14 != 512) {
                                        c11 = c11;
                                        if (dVar.b() > 0) {
                                            this.f19272m = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (dVar.b() > 0) {
                                        this.f19272m.add(Integer.valueOf(dVar.n()));
                                    }
                                    dVar.d(e11);
                                case 248:
                                    int i15 = (c11 == true ? 1 : 0) & 8192;
                                    c11 = c11;
                                    if (i15 != 8192) {
                                        this.f19277r = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 8192;
                                    }
                                    this.f19277r.add(Integer.valueOf(dVar.n()));
                                case m.e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                    int e12 = dVar.e(dVar.n());
                                    int i16 = (c11 == true ? 1 : 0) & 8192;
                                    c11 = c11;
                                    if (i16 != 8192) {
                                        c11 = c11;
                                        if (dVar.b() > 0) {
                                            this.f19277r = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (dVar.b() > 0) {
                                        this.f19277r.add(Integer.valueOf(dVar.n()));
                                    }
                                    dVar.d(e12);
                                default:
                                    r52 = p(dVar, j11, fVar, r11);
                                    if (r52 == 0) {
                                        z11 = true;
                                    }
                            }
                        } catch (Td.j e13) {
                            e13.b(this);
                            throw e13;
                        }
                    } catch (IOException e14) {
                        Td.j jVar = new Td.j(e14.getMessage());
                        jVar.b(this);
                        throw jVar;
                    }
                } catch (Throwable th2) {
                    if (((c11 == true ? 1 : 0) & 32) == 32) {
                        this.f19268i = Collections.unmodifiableList(this.f19268i);
                    }
                    if (((c11 == true ? 1 : 0) & 256) == r52) {
                        this.f19271l = Collections.unmodifiableList(this.f19271l);
                    }
                    if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                        this.f19272m = Collections.unmodifiableList(this.f19272m);
                    }
                    if (((c11 == true ? 1 : 0) & 8192) == 8192) {
                        this.f19277r = Collections.unmodifiableList(this.f19277r);
                    }
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19261b = m11.j();
                        throw th3;
                    }
                    this.f19261b = m11.j();
                    m();
                    throw th2;
                }
            } else {
                if (((c11 == true ? 1 : 0) & 32) == 32) {
                    this.f19268i = Collections.unmodifiableList(this.f19268i);
                }
                if (((c11 == true ? 1 : 0) & 256) == 256) {
                    this.f19271l = Collections.unmodifiableList(this.f19271l);
                }
                if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    this.f19272m = Collections.unmodifiableList(this.f19272m);
                }
                if (((c11 == true ? 1 : 0) & 8192) == 8192) {
                    this.f19277r = Collections.unmodifiableList(this.f19277r);
                }
                try {
                    j11.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f19261b = m11.j();
                    throw th4;
                }
                this.f19261b = m11.j();
                m();
                return;
            }
        }
    }
}
