package Nd;

import Nd.d;
import Nd.p;
import Nd.s;
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
public final class h extends h.d<h> {

    /* renamed from: u, reason: collision with root package name */
    private static final h f19191u;

    /* renamed from: v, reason: collision with root package name */
    public static Td.r<h> f19192v = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19193b;

    /* renamed from: c, reason: collision with root package name */
    private int f19194c;

    /* renamed from: d, reason: collision with root package name */
    private int f19195d;

    /* renamed from: e, reason: collision with root package name */
    private int f19196e;

    /* renamed from: f, reason: collision with root package name */
    private int f19197f;

    /* renamed from: g, reason: collision with root package name */
    private p f19198g;

    /* renamed from: h, reason: collision with root package name */
    private int f19199h;

    /* renamed from: i, reason: collision with root package name */
    private List<r> f19200i;

    /* renamed from: j, reason: collision with root package name */
    private p f19201j;

    /* renamed from: k, reason: collision with root package name */
    private int f19202k;

    /* renamed from: l, reason: collision with root package name */
    private List<p> f19203l;

    /* renamed from: m, reason: collision with root package name */
    private List<Integer> f19204m;

    /* renamed from: n, reason: collision with root package name */
    private int f19205n;

    /* renamed from: o, reason: collision with root package name */
    private List<t> f19206o;

    /* renamed from: p, reason: collision with root package name */
    private s f19207p;

    /* renamed from: q, reason: collision with root package name */
    private List<Integer> f19208q;

    /* renamed from: r, reason: collision with root package name */
    private d f19209r;

    /* renamed from: s, reason: collision with root package name */
    private byte f19210s;

    /* renamed from: t, reason: collision with root package name */
    private int f19211t;

    static class a extends Td.b<h> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new h(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<h, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19212d;

        /* renamed from: g, reason: collision with root package name */
        private int f19215g;

        /* renamed from: i, reason: collision with root package name */
        private int f19217i;

        /* renamed from: j, reason: collision with root package name */
        private List<r> f19218j;

        /* renamed from: k, reason: collision with root package name */
        private p f19219k;

        /* renamed from: l, reason: collision with root package name */
        private int f19220l;

        /* renamed from: m, reason: collision with root package name */
        private List<p> f19221m;

        /* renamed from: n, reason: collision with root package name */
        private List<Integer> f19222n;

        /* renamed from: o, reason: collision with root package name */
        private List<t> f19223o;

        /* renamed from: p, reason: collision with root package name */
        private s f19224p;

        /* renamed from: q, reason: collision with root package name */
        private List<Integer> f19225q;

        /* renamed from: r, reason: collision with root package name */
        private d f19226r;

        /* renamed from: e, reason: collision with root package name */
        private int f19213e = 6;

        /* renamed from: f, reason: collision with root package name */
        private int f19214f = 6;

        /* renamed from: h, reason: collision with root package name */
        private p f19216h = p.T();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f19218j = list;
            this.f19219k = p.T();
            this.f19221m = list;
            this.f19222n = list;
            this.f19223o = list;
            this.f19224p = s.j();
            this.f19225q = list;
            this.f19226r = d.h();
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
            h j11 = j();
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
            k((h) hVar);
            return this;
        }

        public final h j() {
            h hVar = new h(this);
            int i11 = this.f19212d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            hVar.f19195d = this.f19213e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            hVar.f19196e = this.f19214f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            hVar.f19197f = this.f19215g;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            hVar.f19198g = this.f19216h;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            hVar.f19199h = this.f19217i;
            if ((this.f19212d & 32) == 32) {
                this.f19218j = Collections.unmodifiableList(this.f19218j);
                this.f19212d &= -33;
            }
            hVar.f19200i = this.f19218j;
            if ((i11 & 64) == 64) {
                i12 |= 32;
            }
            hVar.f19201j = this.f19219k;
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                i12 |= 64;
            }
            hVar.f19202k = this.f19220l;
            if ((this.f19212d & 256) == 256) {
                this.f19221m = Collections.unmodifiableList(this.f19221m);
                this.f19212d &= -257;
            }
            hVar.f19203l = this.f19221m;
            if ((this.f19212d & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                this.f19222n = Collections.unmodifiableList(this.f19222n);
                this.f19212d &= -513;
            }
            hVar.f19204m = this.f19222n;
            if ((this.f19212d & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                this.f19223o = Collections.unmodifiableList(this.f19223o);
                this.f19212d &= -1025;
            }
            hVar.f19206o = this.f19223o;
            if ((i11 & 2048) == 2048) {
                i12 |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            hVar.f19207p = this.f19224p;
            if ((this.f19212d & 4096) == 4096) {
                this.f19225q = Collections.unmodifiableList(this.f19225q);
                this.f19212d &= -4097;
            }
            hVar.f19208q = this.f19225q;
            if ((i11 & 8192) == 8192) {
                i12 |= 256;
            }
            hVar.f19209r = this.f19226r;
            hVar.f19194c = i12;
            return hVar;
        }

        public final void k(h hVar) {
            if (hVar == h.V()) {
                return;
            }
            if (hVar.h0()) {
                int W11 = hVar.W();
                this.f19212d |= 1;
                this.f19213e = W11;
            }
            if (hVar.j0()) {
                int Y11 = hVar.Y();
                this.f19212d |= 2;
                this.f19214f = Y11;
            }
            if (hVar.i0()) {
                int X9 = hVar.X();
                this.f19212d |= 4;
                this.f19215g = X9;
            }
            if (hVar.m0()) {
                p b02 = hVar.b0();
                if ((this.f19212d & 8) != 8 || this.f19216h == p.T()) {
                    this.f19216h = b02;
                } else {
                    p.c s02 = p.s0(this.f19216h);
                    s02.k(b02);
                    this.f19216h = s02.j();
                }
                this.f19212d |= 8;
            }
            if (hVar.n0()) {
                int c02 = hVar.c0();
                this.f19212d |= 16;
                this.f19217i = c02;
            }
            if (!hVar.f19200i.isEmpty()) {
                if (this.f19218j.isEmpty()) {
                    this.f19218j = hVar.f19200i;
                    this.f19212d &= -33;
                } else {
                    if ((this.f19212d & 32) != 32) {
                        this.f19218j = new ArrayList(this.f19218j);
                        this.f19212d |= 32;
                    }
                    this.f19218j.addAll(hVar.f19200i);
                }
            }
            if (hVar.k0()) {
                p Z11 = hVar.Z();
                if ((this.f19212d & 64) != 64 || this.f19219k == p.T()) {
                    this.f19219k = Z11;
                } else {
                    p.c s03 = p.s0(this.f19219k);
                    s03.k(Z11);
                    this.f19219k = s03.j();
                }
                this.f19212d |= 64;
            }
            if (hVar.l0()) {
                int a02 = hVar.a0();
                this.f19212d |= UserVerificationMethods.USER_VERIFY_PATTERN;
                this.f19220l = a02;
            }
            if (!hVar.f19203l.isEmpty()) {
                if (this.f19221m.isEmpty()) {
                    this.f19221m = hVar.f19203l;
                    this.f19212d &= -257;
                } else {
                    if ((this.f19212d & 256) != 256) {
                        this.f19221m = new ArrayList(this.f19221m);
                        this.f19212d |= 256;
                    }
                    this.f19221m.addAll(hVar.f19203l);
                }
            }
            if (!hVar.f19204m.isEmpty()) {
                if (this.f19222n.isEmpty()) {
                    this.f19222n = hVar.f19204m;
                    this.f19212d &= -513;
                } else {
                    if ((this.f19212d & UserVerificationMethods.USER_VERIFY_NONE) != 512) {
                        this.f19222n = new ArrayList(this.f19222n);
                        this.f19212d |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    this.f19222n.addAll(hVar.f19204m);
                }
            }
            if (!hVar.f19206o.isEmpty()) {
                if (this.f19223o.isEmpty()) {
                    this.f19223o = hVar.f19206o;
                    this.f19212d &= -1025;
                } else {
                    if ((this.f19212d & UserVerificationMethods.USER_VERIFY_ALL) != 1024) {
                        this.f19223o = new ArrayList(this.f19223o);
                        this.f19212d |= UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    this.f19223o.addAll(hVar.f19206o);
                }
            }
            if (hVar.o0()) {
                s e02 = hVar.e0();
                if ((this.f19212d & 2048) != 2048 || this.f19224p == s.j()) {
                    this.f19224p = e02;
                } else {
                    s.b p11 = s.p(this.f19224p);
                    p11.i(e02);
                    this.f19224p = p11.h();
                }
                this.f19212d |= 2048;
            }
            if (!hVar.f19208q.isEmpty()) {
                if (this.f19225q.isEmpty()) {
                    this.f19225q = hVar.f19208q;
                    this.f19212d &= -4097;
                } else {
                    if ((this.f19212d & 4096) != 4096) {
                        this.f19225q = new ArrayList(this.f19225q);
                        this.f19212d |= 4096;
                    }
                    this.f19225q.addAll(hVar.f19208q);
                }
            }
            if (hVar.g0()) {
                d U10 = hVar.U();
                if ((this.f19212d & 8192) != 8192 || this.f19226r == d.h()) {
                    this.f19226r = U10;
                } else {
                    d dVar = this.f19226r;
                    d.b g10 = d.b.g();
                    g10.i(dVar);
                    g10.i(U10);
                    this.f19226r = g10.h();
                }
                this.f19212d |= 8192;
            }
            h(hVar);
            f(d().b(hVar.f19193b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            h hVar = null;
            try {
                try {
                    ((a) h.f19192v).getClass();
                    k(new h(dVar, fVar));
                } catch (Td.j e11) {
                    h hVar2 = (h) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        hVar = hVar2;
                        if (hVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (hVar != null) {
                    k(hVar);
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
        h hVar = new h(0);
        f19191u = hVar;
        hVar.p0();
    }

    private h() {
        throw null;
    }

    h(b bVar) {
        super(bVar);
        this.f19205n = -1;
        this.f19210s = (byte) -1;
        this.f19211t = -1;
        this.f19193b = bVar.d();
    }

    public static h V() {
        return f19191u;
    }

    private void p0() {
        this.f19195d = 6;
        this.f19196e = 6;
        this.f19197f = 0;
        this.f19198g = p.T();
        this.f19199h = 0;
        List list = Collections.EMPTY_LIST;
        this.f19200i = list;
        this.f19201j = p.T();
        this.f19202k = 0;
        this.f19203l = list;
        this.f19204m = list;
        this.f19206o = list;
        this.f19207p = s.j();
        this.f19208q = list;
        this.f19209r = d.h();
    }

    public final List<Integer> S() {
        return this.f19204m;
    }

    public final List<p> T() {
        return this.f19203l;
    }

    public final d U() {
        return this.f19209r;
    }

    public final int W() {
        return this.f19195d;
    }

    public final int X() {
        return this.f19197f;
    }

    public final int Y() {
        return this.f19196e;
    }

    public final p Z() {
        return this.f19201j;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19194c & 2) == 2) {
            eVar.m(1, this.f19196e);
        }
        if ((this.f19194c & 4) == 4) {
            eVar.m(2, this.f19197f);
        }
        if ((this.f19194c & 8) == 8) {
            eVar.o(3, this.f19198g);
        }
        for (int i11 = 0; i11 < this.f19200i.size(); i11++) {
            eVar.o(4, this.f19200i.get(i11));
        }
        if ((this.f19194c & 32) == 32) {
            eVar.o(5, this.f19201j);
        }
        for (int i12 = 0; i12 < this.f19206o.size(); i12++) {
            eVar.o(6, this.f19206o.get(i12));
        }
        if ((this.f19194c & 16) == 16) {
            eVar.m(7, this.f19199h);
        }
        if ((this.f19194c & 64) == 64) {
            eVar.m(8, this.f19202k);
        }
        if ((this.f19194c & 1) == 1) {
            eVar.m(9, this.f19195d);
        }
        for (int i13 = 0; i13 < this.f19203l.size(); i13++) {
            eVar.o(10, this.f19203l.get(i13));
        }
        if (this.f19204m.size() > 0) {
            eVar.v(90);
            eVar.v(this.f19205n);
        }
        for (int i14 = 0; i14 < this.f19204m.size(); i14++) {
            eVar.n(this.f19204m.get(i14).intValue());
        }
        if ((this.f19194c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            eVar.o(30, this.f19207p);
        }
        for (int i15 = 0; i15 < this.f19208q.size(); i15++) {
            eVar.m(31, this.f19208q.get(i15).intValue());
        }
        if ((this.f19194c & 256) == 256) {
            eVar.o(32, this.f19209r);
        }
        n11.a(19000, eVar);
        eVar.r(this.f19193b);
    }

    public final int a0() {
        return this.f19202k;
    }

    public final p b0() {
        return this.f19198g;
    }

    public final int c0() {
        return this.f19199h;
    }

    public final List<r> d0() {
        return this.f19200i;
    }

    public final s e0() {
        return this.f19207p;
    }

    public final List<t> f0() {
        return this.f19206o;
    }

    public final boolean g0() {
        return (this.f19194c & 256) == 256;
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19191u;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19211t;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19194c & 2) == 2 ? Td.e.b(1, this.f19196e) : 0;
        if ((this.f19194c & 4) == 4) {
            b11 += Td.e.b(2, this.f19197f);
        }
        if ((this.f19194c & 8) == 8) {
            b11 += Td.e.d(3, this.f19198g);
        }
        for (int i12 = 0; i12 < this.f19200i.size(); i12++) {
            b11 += Td.e.d(4, this.f19200i.get(i12));
        }
        if ((this.f19194c & 32) == 32) {
            b11 += Td.e.d(5, this.f19201j);
        }
        for (int i13 = 0; i13 < this.f19206o.size(); i13++) {
            b11 += Td.e.d(6, this.f19206o.get(i13));
        }
        if ((this.f19194c & 16) == 16) {
            b11 += Td.e.b(7, this.f19199h);
        }
        if ((this.f19194c & 64) == 64) {
            b11 += Td.e.b(8, this.f19202k);
        }
        if ((this.f19194c & 1) == 1) {
            b11 += Td.e.b(9, this.f19195d);
        }
        for (int i14 = 0; i14 < this.f19203l.size(); i14++) {
            b11 += Td.e.d(10, this.f19203l.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f19204m.size(); i16++) {
            i15 += Td.e.c(this.f19204m.get(i16).intValue());
        }
        int i17 = b11 + i15;
        if (!this.f19204m.isEmpty()) {
            i17 = i17 + 1 + Td.e.c(i15);
        }
        this.f19205n = i15;
        if ((this.f19194c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            i17 += Td.e.d(30, this.f19207p);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f19208q.size(); i19++) {
            i18 += Td.e.c(this.f19208q.get(i19).intValue());
        }
        int size = (this.f19208q.size() * 2) + i17 + i18;
        if ((this.f19194c & 256) == 256) {
            size += Td.e.d(32, this.f19209r);
        }
        int size2 = this.f19193b.size() + size + g();
        this.f19211t = size2;
        return size2;
    }

    public final boolean h0() {
        return (this.f19194c & 1) == 1;
    }

    public final boolean i0() {
        return (this.f19194c & 4) == 4;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19210s;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!i0()) {
            this.f19210s = (byte) 0;
            return false;
        }
        if (m0() && !this.f19198g.isInitialized()) {
            this.f19210s = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f19200i.size(); i11++) {
            if (!this.f19200i.get(i11).isInitialized()) {
                this.f19210s = (byte) 0;
                return false;
            }
        }
        if (k0() && !this.f19201j.isInitialized()) {
            this.f19210s = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f19203l.size(); i12++) {
            if (!this.f19203l.get(i12).isInitialized()) {
                this.f19210s = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f19206o.size(); i13++) {
            if (!this.f19206o.get(i13).isInitialized()) {
                this.f19210s = (byte) 0;
                return false;
            }
        }
        if (o0() && !this.f19207p.isInitialized()) {
            this.f19210s = (byte) 0;
            return false;
        }
        if (g0() && !this.f19209r.isInitialized()) {
            this.f19210s = (byte) 0;
            return false;
        }
        if (f()) {
            this.f19210s = (byte) 1;
            return true;
        }
        this.f19210s = (byte) 0;
        return false;
    }

    public final boolean j0() {
        return (this.f19194c & 2) == 2;
    }

    public final boolean k0() {
        return (this.f19194c & 32) == 32;
    }

    public final boolean l0() {
        return (this.f19194c & 64) == 64;
    }

    public final boolean m0() {
        return (this.f19194c & 8) == 8;
    }

    public final boolean n0() {
        return (this.f19194c & 16) == 16;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return b.i();
    }

    public final boolean o0() {
        return (this.f19194c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128;
    }

    @Override // Td.p
    public final p.a toBuilder() {
        b i11 = b.i();
        i11.k(this);
        return i11;
    }

    private h(int i11) {
        this.f19205n = -1;
        this.f19210s = (byte) -1;
        this.f19211t = -1;
        this.f19193b = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    h(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19205n = -1;
        this.f19210s = (byte) -1;
        this.f19211t = -1;
        p0();
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        char c11 = 0;
        while (true) {
            ?? r52 = 1024;
            if (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        p.c cVar = null;
                        d.b bVar = null;
                        s.b bVar2 = null;
                        p.c cVar2 = null;
                        switch (r11) {
                            case 0:
                                z11 = true;
                            case 8:
                                this.f19194c |= 2;
                                this.f19196e = dVar.n();
                            case 16:
                                this.f19194c |= 4;
                                this.f19197f = dVar.n();
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                if ((this.f19194c & 8) == 8) {
                                    p pVar = this.f19198g;
                                    pVar.getClass();
                                    cVar = p.s0(pVar);
                                }
                                p pVar2 = (p) dVar.i(p.f19325u, fVar);
                                this.f19198g = pVar2;
                                if (cVar != null) {
                                    cVar.k(pVar2);
                                    this.f19198g = cVar.j();
                                }
                                this.f19194c |= 8;
                            case 34:
                                int i11 = (c11 == true ? 1 : 0) & 32;
                                c11 = c11;
                                if (i11 != 32) {
                                    this.f19200i = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | ' ';
                                }
                                this.f19200i.add(dVar.i(r.f19398n, fVar));
                            case 42:
                                if ((this.f19194c & 32) == 32) {
                                    p pVar3 = this.f19201j;
                                    pVar3.getClass();
                                    cVar2 = p.s0(pVar3);
                                }
                                p pVar4 = (p) dVar.i(p.f19325u, fVar);
                                this.f19201j = pVar4;
                                if (cVar2 != null) {
                                    cVar2.k(pVar4);
                                    this.f19201j = cVar2.j();
                                }
                                this.f19194c |= 32;
                            case 50:
                                int i12 = (c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL;
                                c11 = c11;
                                if (i12 != 1024) {
                                    this.f19206o = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 1024;
                                }
                                this.f19206o.add(dVar.i(t.f19429m, fVar));
                            case 56:
                                this.f19194c |= 16;
                                this.f19199h = dVar.n();
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                this.f19194c |= 64;
                                this.f19202k = dVar.n();
                            case 72:
                                this.f19194c |= 1;
                                this.f19195d = dVar.n();
                            case 82:
                                int i13 = (c11 == true ? 1 : 0) & 256;
                                c11 = c11;
                                if (i13 != 256) {
                                    this.f19203l = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 256;
                                }
                                this.f19203l.add(dVar.i(p.f19325u, fVar));
                            case 88:
                                int i14 = (c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                                c11 = c11;
                                if (i14 != 512) {
                                    this.f19204m = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 512;
                                }
                                this.f19204m.add(Integer.valueOf(dVar.n()));
                            case 90:
                                int e11 = dVar.e(dVar.n());
                                int i15 = (c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                                c11 = c11;
                                if (i15 != 512) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19204m = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19204m.add(Integer.valueOf(dVar.n()));
                                }
                                dVar.d(e11);
                            case 242:
                                if ((this.f19194c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                                    s sVar = this.f19207p;
                                    sVar.getClass();
                                    bVar2 = s.p(sVar);
                                }
                                s sVar2 = (s) dVar.i(s.f19418h, fVar);
                                this.f19207p = sVar2;
                                if (bVar2 != null) {
                                    bVar2.i(sVar2);
                                    this.f19207p = bVar2.h();
                                }
                                this.f19194c |= UserVerificationMethods.USER_VERIFY_PATTERN;
                            case 248:
                                int i16 = (c11 == true ? 1 : 0) & 4096;
                                c11 = c11;
                                if (i16 != 4096) {
                                    this.f19208q = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 4096;
                                }
                                this.f19208q.add(Integer.valueOf(dVar.n()));
                            case m.e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                int e12 = dVar.e(dVar.n());
                                int i17 = (c11 == true ? 1 : 0) & 4096;
                                c11 = c11;
                                if (i17 != 4096) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19208q = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19208q.add(Integer.valueOf(dVar.n()));
                                }
                                dVar.d(e12);
                            case 258:
                                if ((this.f19194c & 256) == 256) {
                                    d dVar2 = this.f19209r;
                                    dVar2.getClass();
                                    bVar = d.b.g();
                                    bVar.i(dVar2);
                                }
                                d dVar3 = (d) dVar.i(d.f19139f, fVar);
                                this.f19209r = dVar3;
                                if (bVar != null) {
                                    bVar.i(dVar3);
                                    this.f19209r = bVar.h();
                                }
                                this.f19194c |= 256;
                            default:
                                r52 = p(dVar, j11, fVar, r11);
                                if (r52 == 0) {
                                    z11 = true;
                                }
                        }
                    } catch (Td.j e13) {
                        e13.b(this);
                        throw e13;
                    } catch (IOException e14) {
                        Td.j jVar = new Td.j(e14.getMessage());
                        jVar.b(this);
                        throw jVar;
                    }
                } catch (Throwable th2) {
                    if (((c11 == true ? 1 : 0) & 32) == 32) {
                        this.f19200i = Collections.unmodifiableList(this.f19200i);
                    }
                    if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL) == r52) {
                        this.f19206o = Collections.unmodifiableList(this.f19206o);
                    }
                    if (((c11 == true ? 1 : 0) & 256) == 256) {
                        this.f19203l = Collections.unmodifiableList(this.f19203l);
                    }
                    if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                        this.f19204m = Collections.unmodifiableList(this.f19204m);
                    }
                    if (((c11 == true ? 1 : 0) & 4096) == 4096) {
                        this.f19208q = Collections.unmodifiableList(this.f19208q);
                    }
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19193b = m11.j();
                        throw th3;
                    }
                    this.f19193b = m11.j();
                    m();
                    throw th2;
                }
            } else {
                if (((c11 == true ? 1 : 0) & 32) == 32) {
                    this.f19200i = Collections.unmodifiableList(this.f19200i);
                }
                if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                    this.f19206o = Collections.unmodifiableList(this.f19206o);
                }
                if (((c11 == true ? 1 : 0) & 256) == 256) {
                    this.f19203l = Collections.unmodifiableList(this.f19203l);
                }
                if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    this.f19204m = Collections.unmodifiableList(this.f19204m);
                }
                if (((c11 == true ? 1 : 0) & 4096) == 4096) {
                    this.f19208q = Collections.unmodifiableList(this.f19208q);
                }
                try {
                    j11.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f19193b = m11.j();
                    throw th4;
                }
                this.f19193b = m11.j();
                m();
                return;
            }
        }
    }
}
