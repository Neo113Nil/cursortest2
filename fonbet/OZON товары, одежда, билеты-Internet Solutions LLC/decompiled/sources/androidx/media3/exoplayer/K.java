package androidx.media3.exoplayer;

import F3.C2997b;
import F3.InterfaceC3017w;
import F3.InterfaceC3018x;
import I3.E;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.C5443e;
import androidx.media3.exoplayer.C5447i;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.L;
import androidx.media3.exoplayer.M;
import androidx.media3.exoplayer.f0;
import androidx.media3.exoplayer.h0;
import androidx.media3.exoplayer.j0;
import androidx.media3.exoplayer.k0;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.AbstractC5880y;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import j3.AbstractC7252H;
import j3.C7263e;
import j3.C7272n;
import j3.C7275q;
import j3.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m3.C8053F;
import m3.C8067i;
import m3.InterfaceC8073o;
import p3.C8847g;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import t3.C9732D;
import t3.C9734F;
import u3.InterfaceC9927a;
import w3.g;

/* loaded from: classes.dex */
final class K implements Handler.Callback, InterfaceC3017w.a, E.a, f0.d, C5447i.a, h0.a, C5443e.a, L3.u {

    /* renamed from: A0, reason: collision with root package name */
    private static final long f43575A0 = m3.N.g0(10000);

    /* renamed from: A, reason: collision with root package name */
    private final C5443e f43576A;

    /* renamed from: B, reason: collision with root package name */
    private t3.I f43577B;

    /* renamed from: C, reason: collision with root package name */
    private t3.H f43578C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f43579D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f43580E;

    /* renamed from: F, reason: collision with root package name */
    private g f43581F;

    /* renamed from: G, reason: collision with root package name */
    private g0 f43582G;

    /* renamed from: H, reason: collision with root package name */
    private e f43583H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f43584I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f43585J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f43586K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f43587L;

    /* renamed from: M, reason: collision with root package name */
    private long f43588M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f43589N;

    /* renamed from: O, reason: collision with root package name */
    private int f43590O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f43591P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f43592Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f43593R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f43594S;

    /* renamed from: X, reason: collision with root package name */
    private int f43595X;

    /* renamed from: Y, reason: collision with root package name */
    private g f43596Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f43597Z;

    /* renamed from: a, reason: collision with root package name */
    private final l0[] f43598a;

    /* renamed from: b, reason: collision with root package name */
    private final k0[] f43599b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f43600c;

    /* renamed from: d, reason: collision with root package name */
    private final I3.E f43601d;

    /* renamed from: e, reason: collision with root package name */
    private final I3.F f43602e;

    /* renamed from: f, reason: collision with root package name */
    private final L f43603f;

    /* renamed from: g, reason: collision with root package name */
    private final J3.d f43604g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC8073o f43605h;

    /* renamed from: i, reason: collision with root package name */
    private final C9732D f43606i;

    /* renamed from: j, reason: collision with root package name */
    private final Looper f43607j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC7252H.c f43608k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC7252H.b f43609l;

    /* renamed from: m, reason: collision with root package name */
    private final long f43610m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f43611n;

    /* renamed from: o, reason: collision with root package name */
    private final C5447i f43612o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<d> f43613p;

    /* renamed from: q, reason: collision with root package name */
    private final C8053F f43614q;

    /* renamed from: r, reason: collision with root package name */
    private final r f43615r;

    /* renamed from: r0, reason: collision with root package name */
    private long f43616r0;

    /* renamed from: s, reason: collision with root package name */
    private final Q f43617s;

    /* renamed from: s0, reason: collision with root package name */
    private int f43618s0;

    /* renamed from: t, reason: collision with root package name */
    private final f0 f43619t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f43620t0;

    /* renamed from: u, reason: collision with root package name */
    private final C5445g f43621u;

    /* renamed from: u0, reason: collision with root package name */
    private C5449k f43622u0;

    /* renamed from: v, reason: collision with root package name */
    private final long f43623v;

    /* renamed from: v0, reason: collision with root package name */
    private long f43624v0;

    /* renamed from: w, reason: collision with root package name */
    private final u3.P f43625w;

    /* renamed from: w0, reason: collision with root package name */
    private ExoPlayer.c f43626w0;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC9927a f43627x;

    /* renamed from: x0, reason: collision with root package name */
    private long f43628x0;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC8073o f43629y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f43630y0;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f43631z;

    /* renamed from: z0, reason: collision with root package name */
    private float f43632z0;

    final class a implements j0.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.j0.a
        public final void a() {
            K.this.f43593R = true;
        }

        @Override // androidx.media3.exoplayer.j0.a
        public final void b() {
            K k11 = K.this;
            if (K.j(k11) || k11.f43594S) {
                k11.f43605h.k(2);
            }
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f43634a;

        /* renamed from: b, reason: collision with root package name */
        private final F3.W f43635b;

        /* renamed from: c, reason: collision with root package name */
        private final int f43636c;

        /* renamed from: d, reason: collision with root package name */
        private final long f43637d;

        private b() {
            throw null;
        }

        b(int i11, long j11, F3.W w11, ArrayList arrayList) {
            this.f43634a = arrayList;
            this.f43635b = w11;
            this.f43636c = i11;
            this.f43637d = j11;
        }
    }

    /* loaded from: classes8.dex */
    private static class c {
    }

    /* loaded from: classes8.dex */
    private static final class d implements Comparable<d> {
        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            dVar.getClass();
            return 0;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private boolean f43638a;

        /* renamed from: b, reason: collision with root package name */
        public g0 f43639b;

        /* renamed from: c, reason: collision with root package name */
        public int f43640c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f43641d;

        /* renamed from: e, reason: collision with root package name */
        public int f43642e;

        public e(g0 g0Var) {
            this.f43639b = g0Var;
        }

        public final void b(int i11) {
            this.f43638a |= i11 > 0;
            this.f43640c += i11;
        }

        public final void c(g0 g0Var) {
            this.f43638a |= this.f43639b != g0Var;
            this.f43639b = g0Var;
        }

        public final void d(int i11) {
            if (this.f43641d && this.f43642e != 5) {
                G10.a.c(i11 == 5);
                return;
            }
            this.f43638a = true;
            this.f43641d = true;
            this.f43642e = i11;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3018x.b f43643a;

        /* renamed from: b, reason: collision with root package name */
        public final long f43644b;

        /* renamed from: c, reason: collision with root package name */
        public final long f43645c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f43646d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f43647e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f43648f;

        public f(InterfaceC3018x.b bVar, long j11, long j12, boolean z11, boolean z12, boolean z13) {
            this.f43643a = bVar;
            this.f43644b = j11;
            this.f43645c = j12;
            this.f43646d = z11;
            this.f43647e = z12;
            this.f43648f = z13;
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC7252H f43649a;

        /* renamed from: b, reason: collision with root package name */
        public final int f43650b;

        /* renamed from: c, reason: collision with root package name */
        public final long f43651c;

        public g(AbstractC7252H abstractC7252H, int i11, long j11) {
            this.f43649a = abstractC7252H;
            this.f43650b = i11;
            this.f43651c = j11;
        }
    }

    public K(Context context, j0[] j0VarArr, j0[] j0VarArr2, I3.E e11, I3.F f7, L l11, J3.d dVar, int i11, boolean z11, InterfaceC9927a interfaceC9927a, t3.I i12, C5445g c5445g, long j11, Looper looper, C8053F c8053f, r rVar, u3.P p11, final L3.u uVar) {
        ExoPlayer.c cVar = ExoPlayer.c.f43565a;
        this.f43628x0 = -9223372036854775807L;
        this.f43615r = rVar;
        this.f43601d = e11;
        this.f43602e = f7;
        this.f43603f = l11;
        this.f43604g = dVar;
        this.f43590O = i11;
        this.f43591P = z11;
        this.f43577B = i12;
        this.f43621u = c5445g;
        this.f43623v = j11;
        this.f43585J = false;
        this.f43614q = c8053f;
        this.f43625w = p11;
        this.f43626w0 = cVar;
        this.f43627x = interfaceC9927a;
        this.f43632z0 = 1.0f;
        this.f43578C = t3.H.f98988f;
        this.f43624v0 = -9223372036854775807L;
        this.f43588M = -9223372036854775807L;
        this.f43610m = l11.i();
        this.f43611n = l11.a();
        AbstractC7252H abstractC7252H = AbstractC7252H.EMPTY;
        g0 k11 = g0.k(f7);
        this.f43582G = k11;
        this.f43583H = new e(k11);
        this.f43599b = new k0[j0VarArr.length];
        this.f43600c = new boolean[j0VarArr.length];
        k0.a c11 = e11.c();
        this.f43598a = new l0[j0VarArr.length];
        boolean z12 = false;
        for (int i13 = 0; i13 < j0VarArr.length; i13++) {
            j0VarArr[i13].x(i13, p11, c8053f);
            this.f43599b[i13] = j0VarArr[i13].y();
            if (c11 != null) {
                ((AbstractC5444f) this.f43599b[i13]).Y(c11);
            }
            j0 j0Var = j0VarArr2[i13];
            if (j0Var != null) {
                j0Var.x(i13, p11, c8053f);
                z12 = true;
            }
            this.f43598a[i13] = new l0(j0VarArr[i13], j0VarArr2[i13], i13);
        }
        this.f43631z = z12;
        this.f43612o = new C5447i(this, c8053f);
        this.f43613p = new ArrayList<>();
        this.f43608k = new AbstractC7252H.c();
        this.f43609l = new AbstractC7252H.b();
        e11.d(this, dVar);
        this.f43620t0 = true;
        InterfaceC8073o a11 = c8053f.a(looper, null);
        this.f43629y = a11;
        this.f43617s = new Q(interfaceC9927a, a11, new I(this));
        this.f43619t = new f0(this, interfaceC9927a, a11, p11);
        C9732D c9732d = new C9732D();
        this.f43606i = c9732d;
        Looper a12 = c9732d.a();
        this.f43607j = a12;
        InterfaceC8073o a13 = c8053f.a(a12, this);
        this.f43605h = a13;
        this.f43576A = new C5443e(context, a12, this);
        a13.d(35, new L3.u() { // from class: androidx.media3.exoplayer.J
            @Override // L3.u
            public final void b(long j12, long j13, C7272n c7272n, MediaFormat mediaFormat) {
                K k12 = K.this;
                k12.getClass();
                uVar.b(j12, j13, c7272n, mediaFormat);
                k12.b(j12, j13, c7272n, mediaFormat);
            }
        }).a();
    }

    private void A(int i11) throws C5449k {
        g0 g0Var = this.f43582G;
        Y0(i11, g0Var.f43838n, g0Var.f43837m, g0Var.f43836l);
    }

    private void A0(int i11) throws C5449k {
        this.f43590O = i11;
        int I11 = this.f43617s.I(this.f43582G.f43825a, i11);
        if ((I11 & 1) != 0) {
            j0(true);
        } else if ((I11 & 2) != 0) {
            q();
        }
        E(false);
    }

    private void B() throws C5449k {
        float f7 = this.f43632z0;
        this.f43632z0 = f7;
        float c11 = f7 * this.f43576A.c();
        for (l0 l0Var : this.f43598a) {
            l0Var.P(c11);
        }
    }

    private void C(InterfaceC3017w interfaceC3017w) {
        Q q11 = this.f43617s;
        if (q11.u(interfaceC3017w)) {
            q11.y(this.f43597Z);
            M();
        } else if (q11.v(interfaceC3017w)) {
            N();
        }
    }

    private void C0(boolean z11) throws C5449k {
        if (!z11) {
            this.f43580E = false;
            this.f43605h.l(37);
            g gVar = this.f43581F;
            if (gVar != null) {
                k0(gVar, false);
                this.f43581F = null;
            }
        }
        this.f43579D = z11;
        for (l0 l0Var : this.f43598a) {
            l0Var.L(this.f43579D ? this.f43578C : null);
        }
    }

    private void D(int i11, IOException iOException) {
        C5449k e11 = C5449k.e(i11, iOException);
        N m11 = this.f43617s.m();
        if (m11 != null) {
            e11 = e11.b(m11.f43669g.f43679a);
        }
        m3.s.d("ExoPlayerImplInternal", "Playback error", e11);
        T0(false, false);
        this.f43582G = this.f43582G.f(e11);
    }

    private void E(boolean z11) {
        N h11 = this.f43617s.h();
        InterfaceC3018x.b bVar = h11 == null ? this.f43582G.f43826b : h11.f43669g.f43679a;
        boolean equals = this.f43582G.f43835k.equals(bVar);
        if (!equals) {
            this.f43582G = this.f43582G.c(bVar);
        }
        g0 g0Var = this.f43582G;
        g0Var.f43841q = h11 == null ? g0Var.f43843s : h11.f();
        g0 g0Var2 = this.f43582G;
        g0Var2.f43842r = z(g0Var2.f43841q);
        if ((!equals || z11) && h11 != null && h11.f43667e) {
            W0(h11.f43669g.f43679a, h11.j(), h11.k());
        }
    }

    private void E0(t3.H h11) throws C5449k {
        this.f43578C = h11;
        for (l0 l0Var : this.f43598a) {
            l0Var.L(this.f43579D ? this.f43578C : null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:107|108|(1:110)(1:146)|111|(5:(11:116|117|118|119|120|121|122|123|124|125|(2:127|128)(2:129|(1:131)))|123|124|125|(0)(0))|144|117|118|119|120|121|122) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x043a, code lost:
    
        r10 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03f0, code lost:
    
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f3, code lost:
    
        r17 = r7;
        r23 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02f5, code lost:
    
        r12 = null;
        r21 = 1;
        r8 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02fc, code lost:
    
        r23 = r3;
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03ed, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0404, code lost:
    
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x045b, code lost:
    
        r41.f43596Y = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0423, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0432, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e6 A[Catch: all -> 0x02df, TryCatch #8 {all -> 0x02df, blocks: (B:128:0x02db, B:129:0x02e6, B:131:0x02e9, B:21:0x030b, B:56:0x0321, B:58:0x032b, B:60:0x0338), top: B:19:0x028b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0411 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0432  */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.media3.exoplayer.l0[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [androidx.media3.exoplayer.l0] */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v21, types: [androidx.media3.exoplayer.K$f] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void F(AbstractC7252H abstractC7252H, boolean z11) throws C5449k {
        long j11;
        int i11;
        AbstractC7252H.c cVar;
        int i12;
        long j12;
        long j13;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC7252H.b bVar;
        boolean z15;
        AbstractC7252H abstractC7252H2;
        InterfaceC3018x.b bVar2;
        AbstractC7252H.b bVar3;
        AbstractC7252H abstractC7252H3;
        long j14;
        long j15;
        f fVar;
        int i13;
        long longValue;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        AbstractC7252H abstractC7252H4;
        AbstractC7252H abstractC7252H5;
        AbstractC7252H abstractC7252H6;
        InterfaceC3018x.b bVar4;
        long j16;
        long j17;
        ?? r19;
        boolean z21;
        long j18;
        Object obj;
        int i14;
        boolean z22;
        ?? r23;
        ?? r21;
        ?? r17;
        long w11;
        long j19;
        int H11;
        long j21;
        boolean z23;
        long j22;
        g gVar;
        long j23;
        long j24;
        long j25;
        Q q11;
        g0 g0Var = this.f43582G;
        g gVar2 = this.f43596Y;
        Q q12 = this.f43617s;
        int i15 = this.f43590O;
        boolean z24 = this.f43591P;
        AbstractC7252H.c cVar2 = this.f43608k;
        AbstractC7252H.b bVar5 = this.f43609l;
        if (abstractC7252H.isEmpty()) {
            r21 = -9223372036854775807;
            r23 = 0;
            r17 = new f(g0.l(), 0L, -9223372036854775807L, false, true, false);
            abstractC7252H5 = abstractC7252H;
            j11 = -9223372036854775807L;
            fVar = r17;
            i11 = 4;
            abstractC7252H4 = bVar5;
        } else {
            InterfaceC3018x.b bVar6 = g0Var.f43826b;
            Object obj2 = bVar6.f8751a;
            AbstractC7252H abstractC7252H7 = g0Var.f43825a;
            boolean z25 = abstractC7252H7.isEmpty() || abstractC7252H7.getPeriodByUid(bVar6.f8751a, bVar5).f68942f;
            long j26 = (g0Var.f43826b.b() || z25) ? g0Var.f43827c : g0Var.f43843s;
            if (gVar2 != null) {
                bVar2 = bVar6;
                i11 = 4;
                AbstractC7252H abstractC7252H8 = abstractC7252H;
                Pair<Object, Long> f02 = f0(abstractC7252H8, gVar2, true, i15, z24, cVar2, bVar5);
                if (f02 == null) {
                    i12 = abstractC7252H8.getFirstWindowIndex(z24);
                    j11 = -9223372036854775807L;
                    longValue = j26;
                    z19 = true;
                    z17 = false;
                    z18 = false;
                } else {
                    if (gVar2.f43651c == -9223372036854775807L) {
                        i12 = abstractC7252H8.getPeriodByUid(f02.first, bVar5).f68939c;
                        longValue = j26;
                        z16 = false;
                    } else {
                        obj2 = f02.first;
                        longValue = ((Long) f02.second).longValue();
                        i12 = -1;
                        z16 = true;
                    }
                    j11 = -9223372036854775807L;
                    z17 = g0Var.f43829e == 4;
                    z18 = z16;
                    z19 = false;
                }
                z13 = z19;
                z12 = z17;
                z14 = z18;
                long j27 = longValue;
                cVar = cVar2;
                j13 = j27;
                abstractC7252H3 = abstractC7252H8;
                bVar3 = bVar5;
            } else {
                InterfaceC3018x.b bVar7 = bVar6;
                j11 = -9223372036854775807L;
                i11 = 4;
                AbstractC7252H abstractC7252H9 = abstractC7252H;
                if (g0Var.f43825a.isEmpty()) {
                    i12 = abstractC7252H9.getFirstWindowIndex(z24);
                    cVar = cVar2;
                } else if (abstractC7252H9.getIndexOfPeriod(obj2) == -1) {
                    int g02 = g0(cVar2, bVar5, i15, z24, obj2, g0Var.f43825a, abstractC7252H9);
                    cVar = cVar2;
                    AbstractC7252H abstractC7252H10 = abstractC7252H9;
                    bVar = bVar5;
                    if (g02 == -1) {
                        i12 = abstractC7252H10.getFirstWindowIndex(z24);
                        z15 = true;
                    } else {
                        i12 = g02;
                        z15 = false;
                    }
                    z13 = z15;
                    obj2 = obj2;
                    j13 = j26;
                    z12 = false;
                    abstractC7252H2 = abstractC7252H10;
                    z14 = false;
                    abstractC7252H3 = abstractC7252H2;
                    bVar3 = bVar;
                    bVar2 = bVar7;
                } else {
                    cVar = cVar2;
                    if (j26 == -9223372036854775807L) {
                        i12 = abstractC7252H9.getPeriodByUid(obj2, bVar5).f68939c;
                        obj2 = obj2;
                    } else if (z25) {
                        g0Var.f43825a.getPeriodByUid(bVar7.f8751a, bVar5);
                        if (g0Var.f43825a.getWindow(bVar5.f68939c, cVar).f68959n == g0Var.f43825a.getIndexOfPeriod(bVar7.f8751a)) {
                            Pair<Object, Long> periodPositionUs = abstractC7252H9.getPeriodPositionUs(cVar, bVar5, abstractC7252H9.getPeriodByUid(obj2, bVar5).f68939c, j26 + bVar5.f68941e);
                            obj2 = periodPositionUs.first;
                            j12 = ((Long) periodPositionUs.second).longValue();
                        } else if (abstractC7252H9.getPeriodByUid(obj2, bVar5).f68940d != -9223372036854775807L) {
                            j12 = m3.N.j(j26, 0L, bVar5.f68940d - 1);
                            obj2 = obj2;
                        } else {
                            obj2 = obj2;
                            j12 = j26;
                        }
                        j13 = j12;
                        i12 = -1;
                        z12 = false;
                        z13 = false;
                        z14 = true;
                        abstractC7252H3 = abstractC7252H9;
                        bVar3 = bVar5;
                        bVar2 = bVar7;
                    } else {
                        obj2 = obj2;
                        i12 = -1;
                    }
                }
                j13 = j26;
                z12 = false;
                z13 = false;
                abstractC7252H2 = abstractC7252H9;
                bVar = bVar5;
                z14 = false;
                abstractC7252H3 = abstractC7252H2;
                bVar3 = bVar;
                bVar2 = bVar7;
            }
            if (i12 != -1) {
                Pair<Object, Long> periodPositionUs2 = abstractC7252H3.getPeriodPositionUs(cVar, bVar3, i12, -9223372036854775807L);
                obj2 = periodPositionUs2.first;
                j13 = ((Long) periodPositionUs2.second).longValue();
                j14 = j11;
            } else {
                j14 = j13;
            }
            InterfaceC3018x.b C11 = q12.C(abstractC7252H3, obj2, j13);
            int i16 = C11.f8755e;
            boolean z26 = bVar2.f8751a.equals(obj2) && !bVar2.b() && !C11.b() && (i16 == -1 || ((i13 = bVar2.f8755e) != -1 && i16 >= i13));
            AbstractC7252H.b periodByUid = abstractC7252H3.getPeriodByUid(obj2, bVar3);
            if (!z25 && j26 == j14 && bVar2.f8751a.equals(C11.f8751a)) {
                if (bVar2.b()) {
                    periodByUid.g(bVar2.f8752b);
                }
                if (C11.b()) {
                    periodByUid.g(C11.f8752b);
                }
            }
            if (z26) {
                C11 = bVar2;
            }
            if (C11.b()) {
                if (C11.equals(bVar2)) {
                    j13 = g0Var.f43843s;
                } else {
                    abstractC7252H3.getPeriodByUid(C11.f8751a, bVar3);
                    if (C11.f8753c == bVar3.e(C11.f8752b)) {
                        bVar3.f68943g.getClass();
                    }
                    j15 = 0;
                    fVar = new f(C11, j15, j14, z12, z13, z14);
                    abstractC7252H5 = abstractC7252H3;
                    abstractC7252H4 = bVar3;
                }
            }
            j15 = j13;
            fVar = new f(C11, j15, j14, z12, z13, z14);
            abstractC7252H5 = abstractC7252H3;
            abstractC7252H4 = bVar3;
        }
        InterfaceC3018x.b bVar8 = fVar.f43643a;
        long j28 = fVar.f43645c;
        boolean z27 = fVar.f43646d;
        long j29 = fVar.f43644b;
        boolean z28 = (this.f43582G.f43826b.equals(bVar8) && j29 == this.f43582G.f43843s) ? false : true;
        try {
            if (fVar.f43647e) {
                try {
                    z22 = true;
                    if (this.f43582G.f43829e != 1) {
                        try {
                            J0(i11);
                        } catch (Throwable th2) {
                            th = th2;
                            abstractC7252H6 = abstractC7252H5;
                            bVar4 = bVar8;
                            j16 = j28;
                            j17 = j29;
                            z21 = z22;
                            r19 = null;
                            g0 g0Var2 = this.f43582G;
                            AbstractC7252H abstractC7252H11 = g0Var2.f43825a;
                            InterfaceC3018x.b bVar9 = g0Var2.f43826b;
                            if (fVar.f43648f) {
                            }
                            InterfaceC3018x.b bVar10 = bVar4;
                            a1(abstractC7252H6, bVar10, abstractC7252H11, bVar9, j18, false);
                            if (!z28) {
                            }
                            g0 g0Var3 = this.f43582G;
                            obj = g0Var3.f43826b.f8751a;
                            AbstractC7252H abstractC7252H12 = g0Var3.f43825a;
                            if (z28) {
                            }
                            boolean z29 = false;
                            long j31 = this.f43582G.f43828d;
                            if (abstractC7252H6.getIndexOfPeriod(obj) == -1) {
                            }
                            g gVar3 = r19;
                            this.f43582G = I(bVar10, j17, j16, j31, z29, i14);
                            c0();
                            e0(abstractC7252H6, this.f43582G.f43825a);
                            this.f43582G = this.f43582G.j(abstractC7252H6);
                            if (!abstractC7252H6.isEmpty()) {
                            }
                            E(false);
                            this.f43605h.k(2);
                            throw th;
                        }
                    }
                    b0(false, false, false, true);
                } catch (Throwable th3) {
                    th = th3;
                    z22 = true;
                    abstractC7252H6 = abstractC7252H5;
                    bVar4 = bVar8;
                    j16 = j28;
                    j17 = j29;
                    z21 = z22;
                    r19 = null;
                    g0 g0Var22 = this.f43582G;
                    AbstractC7252H abstractC7252H112 = g0Var22.f43825a;
                    InterfaceC3018x.b bVar92 = g0Var22.f43826b;
                    if (fVar.f43648f) {
                    }
                    InterfaceC3018x.b bVar102 = bVar4;
                    a1(abstractC7252H6, bVar102, abstractC7252H112, bVar92, j18, false);
                    if (!z28) {
                    }
                    g0 g0Var32 = this.f43582G;
                    obj = g0Var32.f43826b.f8751a;
                    AbstractC7252H abstractC7252H122 = g0Var32.f43825a;
                    if (z28) {
                    }
                    boolean z292 = false;
                    long j312 = this.f43582G.f43828d;
                    if (abstractC7252H6.getIndexOfPeriod(obj) == -1) {
                    }
                    g gVar32 = r19;
                    this.f43582G = I(bVar102, j17, j16, j312, z292, i14);
                    c0();
                    e0(abstractC7252H6, this.f43582G.f43825a);
                    this.f43582G = this.f43582G.j(abstractC7252H6);
                    if (!abstractC7252H6.isEmpty()) {
                    }
                    E(false);
                    this.f43605h.k(2);
                    throw th;
                }
            } else {
                z22 = true;
            }
            ?? r02 = this.f43598a;
            int length = r02.length;
            int i17 = 0;
            InterfaceC3018x.b bVar11 = bVar2;
            while (i17 < length) {
                ?? r12 = r02[i17];
                r12.M(abstractC7252H5);
                i17++;
                bVar11 = r12;
            }
            try {
                if (z28) {
                    long j32 = j28;
                    long j33 = j29;
                    gVar = null;
                    gVar = null;
                    z23 = true;
                    z23 = true;
                    z21 = true;
                    AbstractC7252H abstractC7252H13 = abstractC7252H5;
                    j24 = j33;
                    j23 = j32;
                    if (!abstractC7252H13.isEmpty()) {
                        try {
                            for (N m11 = this.f43617s.m(); m11 != null; m11 = m11.g()) {
                                if (m11.f43669g.f43679a.equals(bVar8)) {
                                    m11.f43669g = this.f43617s.r(abstractC7252H13, m11.f43669g);
                                    m11.v();
                                }
                            }
                            q11 = this.f43617s;
                            bVar4 = bVar8;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar4 = bVar8;
                            j25 = j33;
                        }
                        try {
                            j22 = l0(bVar4, j33, q11.m() != q11.q(), z27);
                            j21 = j32;
                            g0 g0Var4 = this.f43582G;
                            InterfaceC3018x.b bVar12 = bVar4;
                            a1(abstractC7252H, bVar12, g0Var4.f43825a, g0Var4.f43826b, !fVar.f43648f ? j22 : j11, false);
                            if (!z28 || j21 != this.f43582G.f43827c) {
                                g0 g0Var5 = this.f43582G;
                                Object obj3 = g0Var5.f43826b.f8751a;
                                AbstractC7252H abstractC7252H14 = g0Var5.f43825a;
                                this.f43582G = I(bVar12, j22, j21, this.f43582G.f43828d, (z28 || !z11 || abstractC7252H14.isEmpty() || abstractC7252H14.getPeriodByUid(obj3, this.f43609l).f68942f) ? false : z23, abstractC7252H.getIndexOfPeriod(obj3) != -1 ? i11 : 3);
                            }
                            c0();
                            e0(abstractC7252H, this.f43582G.f43825a);
                            this.f43582G = this.f43582G.j(abstractC7252H);
                            if (!abstractC7252H.isEmpty()) {
                                this.f43596Y = gVar;
                            }
                            E(false);
                            this.f43605h.k(2);
                        } catch (Throwable th5) {
                            th = th5;
                            j25 = j33;
                            abstractC7252H6 = abstractC7252H13;
                            r19 = null;
                            j17 = j25;
                            j16 = j32;
                            g0 g0Var222 = this.f43582G;
                            AbstractC7252H abstractC7252H1122 = g0Var222.f43825a;
                            InterfaceC3018x.b bVar922 = g0Var222.f43826b;
                            if (fVar.f43648f) {
                            }
                            InterfaceC3018x.b bVar1022 = bVar4;
                            a1(abstractC7252H6, bVar1022, abstractC7252H1122, bVar922, j18, false);
                            if (!z28) {
                            }
                            g0 g0Var322 = this.f43582G;
                            obj = g0Var322.f43826b.f8751a;
                            AbstractC7252H abstractC7252H1222 = g0Var322.f43825a;
                            if (z28) {
                            }
                            boolean z2922 = false;
                            long j3122 = this.f43582G.f43828d;
                            if (abstractC7252H6.getIndexOfPeriod(obj) == -1) {
                            }
                            g gVar322 = r19;
                            this.f43582G = I(bVar1022, j17, j16, j3122, z2922, i14);
                            c0();
                            e0(abstractC7252H6, this.f43582G.f43825a);
                            this.f43582G = this.f43582G.j(abstractC7252H6);
                            if (!abstractC7252H6.isEmpty()) {
                            }
                            E(false);
                            this.f43605h.k(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        w11 = this.f43617s.q() == null ? 0L : w(this.f43617s.q());
                    } catch (Throwable th6) {
                        th = th6;
                        r23 = j28;
                        r17 = j29;
                        bVar11 = null;
                        r21 = 1;
                        abstractC7252H4 = abstractC7252H5;
                    }
                    try {
                        if (n() && this.f43617s.p() != null) {
                            j19 = w(this.f43617s.p());
                            r23 = j28;
                            long j34 = j19;
                            r17 = j29;
                            bVar11 = null;
                            gVar = null;
                            gVar = null;
                            gVar = null;
                            r21 = 1;
                            z23 = true;
                            z23 = true;
                            z23 = true;
                            H11 = this.f43617s.H(abstractC7252H, this.f43597Z, w11, j34);
                            if ((H11 & 1) == 0) {
                                j0(false);
                                j24 = r17;
                                j23 = r23;
                            } else {
                                j24 = r17;
                                j23 = r23;
                                if ((H11 & 2) != 0) {
                                    q();
                                    j24 = r17;
                                    j23 = r23;
                                }
                            }
                        }
                        H11 = this.f43617s.H(abstractC7252H, this.f43597Z, w11, j34);
                        if ((H11 & 1) == 0) {
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        abstractC7252H4 = abstractC7252H;
                        bVar4 = bVar8;
                        r19 = bVar11;
                        abstractC7252H6 = abstractC7252H4;
                        j17 = r17;
                        z21 = r21;
                        j16 = r23;
                        g0 g0Var2222 = this.f43582G;
                        AbstractC7252H abstractC7252H11222 = g0Var2222.f43825a;
                        InterfaceC3018x.b bVar9222 = g0Var2222.f43826b;
                        if (fVar.f43648f) {
                        }
                        InterfaceC3018x.b bVar10222 = bVar4;
                        a1(abstractC7252H6, bVar10222, abstractC7252H11222, bVar9222, j18, false);
                        if (!z28) {
                        }
                        g0 g0Var3222 = this.f43582G;
                        obj = g0Var3222.f43826b.f8751a;
                        AbstractC7252H abstractC7252H12222 = g0Var3222.f43825a;
                        if (z28) {
                        }
                        boolean z29222 = false;
                        long j31222 = this.f43582G.f43828d;
                        if (abstractC7252H6.getIndexOfPeriod(obj) == -1) {
                        }
                        g gVar3222 = r19;
                        this.f43582G = I(bVar10222, j17, j16, j31222, z29222, i14);
                        c0();
                        e0(abstractC7252H6, this.f43582G.f43825a);
                        this.f43582G = this.f43582G.j(abstractC7252H6);
                        if (!abstractC7252H6.isEmpty()) {
                        }
                        E(false);
                        this.f43605h.k(2);
                        throw th;
                    }
                    j19 = 0;
                    r23 = j28;
                    long j342 = j19;
                    r17 = j29;
                    bVar11 = null;
                    gVar = null;
                    gVar = null;
                    gVar = null;
                    r21 = 1;
                    z23 = true;
                    z23 = true;
                    z23 = true;
                }
                bVar4 = bVar8;
                j22 = j24;
                j21 = j23;
                g0 g0Var42 = this.f43582G;
                InterfaceC3018x.b bVar122 = bVar4;
                a1(abstractC7252H, bVar122, g0Var42.f43825a, g0Var42.f43826b, !fVar.f43648f ? j22 : j11, false);
                if (!z28) {
                }
                g0 g0Var52 = this.f43582G;
                Object obj32 = g0Var52.f43826b.f8751a;
                AbstractC7252H abstractC7252H142 = g0Var52.f43825a;
                if (z28) {
                }
                this.f43582G = I(bVar122, j22, j21, this.f43582G.f43828d, (z28 || !z11 || abstractC7252H142.isEmpty() || abstractC7252H142.getPeriodByUid(obj32, this.f43609l).f68942f) ? false : z23, abstractC7252H.getIndexOfPeriod(obj32) != -1 ? i11 : 3);
                c0();
                e0(abstractC7252H, this.f43582G.f43825a);
                this.f43582G = this.f43582G.j(abstractC7252H);
                if (!abstractC7252H.isEmpty()) {
                }
                E(false);
                this.f43605h.k(2);
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            abstractC7252H6 = abstractC7252H5;
            bVar4 = bVar8;
            j16 = j28;
            j17 = j29;
            r19 = null;
            z21 = true;
        }
    }

    private void F0(t3.I i11) {
        this.f43577B = i11;
    }

    private void G(InterfaceC3017w interfaceC3017w) throws C5449k {
        Q q11 = this.f43617s;
        boolean u11 = q11.u(interfaceC3017w);
        C5447i c5447i = this.f43612o;
        if (!u11) {
            N n11 = q11.n(interfaceC3017w);
            if (n11 != null) {
                G10.a.h(true ^ n11.f43667e);
                float f7 = c5447i.d().f69345a;
                g0 g0Var = this.f43582G;
                n11.l(f7, g0Var.f43825a, g0Var.f43836l);
                if (q11.v(interfaceC3017w)) {
                    N();
                    return;
                }
                return;
            }
            return;
        }
        N h11 = q11.h();
        h11.getClass();
        if (!h11.f43667e) {
            float f11 = c5447i.d().f69345a;
            g0 g0Var2 = this.f43582G;
            h11.l(f11, g0Var2.f43825a, g0Var2.f43836l);
        }
        O o11 = h11.f43669g;
        W0(o11.f43679a, h11.j(), h11.k());
        if (h11 == q11.m()) {
            d0(h11.f43669g.f43680b);
            t(new boolean[this.f43598a.length], q11.q().i());
            h11.f43670h = true;
            g0 g0Var3 = this.f43582G;
            InterfaceC3018x.b bVar = g0Var3.f43826b;
            O o12 = h11.f43669g;
            long j11 = g0Var3.f43827c;
            long j12 = o12.f43680b;
            this.f43582G = I(bVar, j12, j11, j12, false, 5);
        }
        M();
    }

    private void H(j3.x xVar, float f7, boolean z11, boolean z12) throws C5449k {
        int i11;
        if (z11) {
            if (z12) {
                this.f43583H.b(1);
            }
            this.f43582G = this.f43582G.g(xVar);
        }
        float f11 = xVar.f69345a;
        N m11 = this.f43617s.m();
        while (true) {
            i11 = 0;
            if (m11 == null) {
                break;
            }
            I3.y[] yVarArr = m11.k().f11824c;
            int length = yVarArr.length;
            while (i11 < length) {
                I3.y yVar = yVarArr[i11];
                if (yVar != null) {
                    yVar.o(f11);
                }
                i11++;
            }
            m11 = m11.g();
        }
        l0[] l0VarArr = this.f43598a;
        int length2 = l0VarArr.length;
        while (i11 < length2) {
            l0VarArr[i11].K(f7, xVar.f69345a);
            i11++;
        }
    }

    private void H0(boolean z11) throws C5449k {
        this.f43591P = z11;
        int J11 = this.f43617s.J(this.f43582G.f43825a, z11);
        if ((J11 & 1) != 0) {
            j0(true);
        } else if ((J11 & 2) != 0) {
            q();
        }
        E(false);
    }

    private g0 I(InterfaceC3018x.b bVar, long j11, long j12, long j13, boolean z11, int i11) {
        List<j3.t> list;
        F3.d0 d0Var;
        I3.F f7;
        N m11;
        boolean z12;
        boolean z13 = false;
        this.f43620t0 = (!this.f43620t0 && j11 == this.f43582G.f43843s && bVar.equals(this.f43582G.f43826b)) ? false : true;
        c0();
        g0 g0Var = this.f43582G;
        F3.d0 d0Var2 = g0Var.f43832h;
        I3.F f11 = g0Var.f43833i;
        List<j3.t> list2 = g0Var.f43834j;
        if (this.f43619t.j()) {
            N m12 = this.f43617s.m();
            F3.d0 j14 = m12 == null ? F3.d0.f8643d : m12.j();
            I3.F k11 = m12 == null ? this.f43602e : m12.k();
            I3.y[] yVarArr = k11.f11824c;
            AbstractC5880y.a aVar = new AbstractC5880y.a();
            boolean z14 = false;
            for (I3.y yVar : yVarArr) {
                if (yVar != null) {
                    j3.t tVar = yVar.m(0).f69124l;
                    if (tVar == null) {
                        aVar.e(new j3.t(new t.a[0]));
                    } else {
                        aVar.e(tVar);
                        z14 = true;
                    }
                }
            }
            AbstractC5880y j15 = z14 ? aVar.j() : AbstractC5880y.v();
            if (m12 != null) {
                O o11 = m12.f43669g;
                if (o11.f43681c != j12) {
                    m12.f43669g = o11.a(j12);
                }
            }
            Q q11 = this.f43617s;
            if (q11.m() == q11.q() && (m11 = q11.m()) != null) {
                I3.F k12 = m11.k();
                int i12 = 0;
                boolean z15 = false;
                while (true) {
                    l0[] l0VarArr = this.f43598a;
                    if (i12 >= l0VarArr.length) {
                        z12 = true;
                        break;
                    }
                    if (k12.b(i12)) {
                        if (l0VarArr[i12].k() != 1) {
                            z12 = false;
                            break;
                        }
                        if (k12.f11823b[i12].f98986a != 0) {
                            z15 = true;
                        }
                    }
                    i12++;
                }
                if (z15 && z12) {
                    z13 = true;
                }
                if (z13 != this.f43594S) {
                    this.f43594S = z13;
                    if (!z13 && this.f43582G.f43840p) {
                        this.f43605h.k(2);
                    }
                }
            }
            d0Var = j14;
            f7 = k11;
            list = j15;
        } else {
            if (!bVar.equals(this.f43582G.f43826b)) {
                d0Var2 = F3.d0.f8643d;
                f11 = this.f43602e;
                list2 = AbstractC5880y.v();
            }
            list = list2;
            d0Var = d0Var2;
            f7 = f11;
        }
        if (z11) {
            this.f43583H.d(i11);
        }
        g0 g0Var2 = this.f43582G;
        return g0Var2.d(bVar, j11, j12, j13, z(g0Var2.f43841q), d0Var, f7, list);
    }

    private void I0(F3.W w11) throws C5449k {
        this.f43583H.b(1);
        F(this.f43619t.t(w11), false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [F3.V, F3.w, java.lang.Object] */
    private static boolean J(N n11) {
        if (n11 != null) {
            try {
                ?? r12 = n11.f43663a;
                if (n11.f43667e) {
                    for (F3.U u11 : n11.f43665c) {
                        if (u11 != null) {
                            u11.maybeThrowError();
                        }
                    }
                } else {
                    r12.maybeThrowPrepareError();
                }
                if ((!n11.f43667e ? 0L : r12.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private void J0(int i11) {
        g0 g0Var = this.f43582G;
        if (g0Var.f43829e != i11) {
            if (i11 != 2) {
                this.f43624v0 = -9223372036854775807L;
            }
            if (i11 != 3 && g0Var.f43840p) {
                this.f43582G = g0Var.i(false);
            }
            this.f43582G = this.f43582G.h(i11);
        }
    }

    private boolean K(int i11, InterfaceC3018x.b bVar) {
        Q q11 = this.f43617s;
        if (q11.p() == null || !q11.p().f43669g.f43679a.equals(bVar)) {
            return false;
        }
        return this.f43598a[i11].s(q11.p());
    }

    private void K0(L3.u uVar) throws C5449k {
        for (l0 l0Var : this.f43598a) {
            l0Var.N(uVar);
        }
    }

    private boolean L() {
        N m11 = this.f43617s.m();
        long j11 = m11.f43669g.f43683e;
        if (m11.f43667e) {
            return j11 == -9223372036854775807L || this.f43582G.f43843s < j11 || !P0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [F3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [F3.V, java.lang.Object] */
    private void M() {
        boolean z11 = false;
        if (J(this.f43617s.h())) {
            N h11 = this.f43617s.h();
            long z12 = z(!h11.f43667e ? 0L : h11.f43663a.getNextLoadPositionUs());
            long t2 = h11 == this.f43617s.m() ? h11.t(this.f43597Z) : h11.t(this.f43597Z) - h11.f43669g.f43680b;
            long b11 = Q0(this.f43582G.f43825a, h11.f43669g.f43679a) ? this.f43621u.b() : -9223372036854775807L;
            u3.P p11 = this.f43625w;
            AbstractC7252H abstractC7252H = this.f43582G.f43825a;
            InterfaceC3018x.b bVar = h11.f43669g.f43679a;
            float f7 = this.f43612o.d().f69345a;
            boolean z13 = this.f43582G.f43836l;
            L.a aVar = new L.a(p11, abstractC7252H, bVar, t2, z12, f7, this.f43587L, b11);
            boolean c11 = this.f43603f.c(aVar);
            N m11 = this.f43617s.m();
            if (c11 || !m11.f43667e || z12 >= 500000 || (this.f43610m <= 0 && !this.f43611n)) {
                z11 = c11;
            } else {
                m11.f43663a.discardBuffer(this.f43582G.f43843s, false);
                z11 = this.f43603f.c(aVar);
            }
        }
        this.f43589N = z11;
        if (z11) {
            N h12 = this.f43617s.h();
            h12.getClass();
            M.a aVar2 = new M.a();
            aVar2.f(h12.t(this.f43597Z));
            aVar2.g(this.f43612o.d().f69345a);
            aVar2.e(this.f43588M);
            h12.c(new M(aVar2));
        }
        V0();
    }

    private void M0(Object obj, C8067i c8067i) throws C5449k {
        for (l0 l0Var : this.f43598a) {
            l0Var.O(obj);
        }
        int i11 = this.f43582G.f43829e;
        if (i11 == 3 || i11 == 2) {
            this.f43605h.k(2);
        }
        if (c8067i != null) {
            c8067i.g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [F3.V, F3.w, java.lang.Object] */
    private void N() {
        Q q11 = this.f43617s;
        q11.w();
        N o11 = q11.o();
        if (o11 != null) {
            if (!o11.f43666d || o11.f43667e) {
                ?? r12 = o11.f43663a;
                if (r12.isLoading()) {
                    return;
                }
                AbstractC7252H abstractC7252H = this.f43582G.f43825a;
                if (o11.f43667e) {
                    r12.getBufferedPositionUs();
                }
                if (this.f43603f.d()) {
                    if (!o11.f43666d) {
                        O o12 = o11.f43669g;
                        o11.f43666d = true;
                        r12.prepare(this, o12.f43680b);
                    } else {
                        M.a aVar = new M.a();
                        aVar.f(o11.t(this.f43597Z));
                        aVar.g(this.f43612o.d().f69345a);
                        aVar.e(this.f43588M);
                        o11.c(new M(aVar));
                    }
                }
            }
        }
    }

    private void O() {
        this.f43583H.c(this.f43582G);
        if (this.f43583H.f43638a) {
            E.l0(this.f43615r.f44097a, this.f43583H);
            this.f43583H = new e(this.f43582G);
        }
    }

    private void P(int i11) throws IOException, C5449k {
        l0 l0Var = this.f43598a[i11];
        try {
            N m11 = this.f43617s.m();
            m11.getClass();
            l0Var.A(m11);
        } catch (IOException | RuntimeException e11) {
            int k11 = l0Var.k();
            if (k11 != 3 && k11 != 5) {
                throw e11;
            }
            I3.F k12 = this.f43617s.m().k();
            m3.s.d("ExoPlayerImplInternal", "Disabling track due to error: " + C7272n.d(k12.f11824c[i11].j()), e11);
            I3.F f7 = new I3.F((C9734F[]) k12.f11823b.clone(), (I3.y[]) k12.f11824c.clone(), k12.f11825d, k12.f11826e);
            f7.f11823b[i11] = null;
            f7.f11824c[i11] = null;
            l0[] l0VarArr = this.f43598a;
            int g10 = l0VarArr[i11].g();
            l0VarArr[i11].b(this.f43612o);
            Q(i11, false);
            this.f43595X -= g10;
            this.f43617s.m().a(f7, this.f43582G.f43843s);
        }
    }

    private boolean P0() {
        g0 g0Var = this.f43582G;
        return g0Var.f43836l && g0Var.f43838n == 0;
    }

    private void Q(final int i11, final boolean z11) {
        boolean[] zArr = this.f43600c;
        if (zArr[i11] != z11) {
            zArr[i11] = z11;
            this.f43629y.i(new Runnable() { // from class: androidx.media3.exoplayer.G
                @Override // java.lang.Runnable
                public final void run() {
                    r1.f43627x.b0(r2, K.this.f43598a[i11].k(), z11);
                }
            });
        }
    }

    private boolean Q0(AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar) {
        if (!bVar.b() && !abstractC7252H.isEmpty()) {
            int i11 = abstractC7252H.getPeriodByUid(bVar.f8751a, this.f43609l).f68939c;
            AbstractC7252H.c cVar = this.f43608k;
            abstractC7252H.getWindow(i11, cVar);
            if (cVar.a() && cVar.f68954i && cVar.f68951f != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private void R() throws C5449k {
        F(this.f43619t.f(), true);
    }

    private void R0() throws C5449k {
        N m11 = this.f43617s.m();
        if (m11 == null) {
            return;
        }
        I3.F k11 = m11.k();
        int i11 = 0;
        while (true) {
            l0[] l0VarArr = this.f43598a;
            if (i11 >= l0VarArr.length) {
                return;
            }
            if (k11.b(i11)) {
                l0VarArr[i11].Q();
            }
            i11++;
        }
    }

    private void S(c cVar) throws C5449k {
        this.f43583H.b(1);
        cVar.getClass();
        F(this.f43619t.l(), false);
    }

    private void T0(boolean z11, boolean z12) {
        b0(z11 || !this.f43592Q, false, true, false);
        this.f43583H.b(z12 ? 1 : 0);
        this.f43603f.e(this.f43625w);
        this.f43576A.g(1, this.f43582G.f43836l);
        J0(1);
    }

    private void U0() throws C5449k {
        this.f43612o.g();
        for (l0 l0Var : this.f43598a) {
            l0Var.S();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [F3.V, java.lang.Object] */
    private void V0() {
        N h11 = this.f43617s.h();
        boolean z11 = this.f43589N || (h11 != null && h11.f43663a.isLoading());
        g0 g0Var = this.f43582G;
        if (z11 != g0Var.f43831g) {
            this.f43582G = g0Var.b(z11);
        }
    }

    private void W() throws C5449k {
        this.f43583H.b(1);
        b0(false, false, false, true);
        this.f43603f.b(this.f43625w);
        J0(this.f43582G.f43825a.isEmpty() ? 4 : 2);
        g0 g0Var = this.f43582G;
        boolean z11 = g0Var.f43836l;
        Y0(this.f43576A.g(g0Var.f43829e, z11), g0Var.f43838n, g0Var.f43837m, z11);
        this.f43619t.m(this.f43604g.c());
        this.f43605h.k(2);
    }

    private void W0(InterfaceC3018x.b bVar, F3.d0 d0Var, I3.F f7) {
        Q q11 = this.f43617s;
        N h11 = q11.h();
        h11.getClass();
        long t2 = h11 == q11.m() ? h11.t(this.f43597Z) : h11.t(this.f43597Z) - h11.f43669g.f43680b;
        long z11 = z(h11.f());
        long b11 = Q0(this.f43582G.f43825a, h11.f43669g.f43679a) ? this.f43621u.b() : -9223372036854775807L;
        AbstractC7252H abstractC7252H = this.f43582G.f43825a;
        float f11 = this.f43612o.d().f69345a;
        boolean z12 = this.f43582G.f43836l;
        this.f43603f.h(new L.a(this.f43625w, abstractC7252H, bVar, t2, z11, f11, this.f43587L, b11), f7.f11824c);
    }

    private void X0(int i11, int i12, List<C7275q> list) throws C5449k {
        this.f43583H.b(1);
        F(this.f43619t.u(i11, i12, list), false);
    }

    private void Y(C8067i c8067i) {
        C9732D c9732d = this.f43606i;
        InterfaceC8073o interfaceC8073o = this.f43605h;
        int i11 = 0;
        try {
            b0(true, false, true, false);
            while (true) {
                l0[] l0VarArr = this.f43598a;
                if (i11 >= l0VarArr.length) {
                    this.f43603f.f(this.f43625w);
                    this.f43576A.d();
                    this.f43601d.h();
                    J0(1);
                    return;
                }
                ((AbstractC5444f) this.f43599b[i11]).C();
                l0VarArr[i11].B();
                i11++;
            }
        } finally {
            interfaceC8073o.c();
            c9732d.b();
            c8067i.g();
        }
    }

    private void Y0(int i11, int i12, int i13, boolean z11) throws C5449k {
        boolean z12 = z11 && i11 != -1;
        if (i11 == -1) {
            i13 = 2;
        } else if (i13 == 2) {
            i13 = 1;
        }
        if (i11 == 0) {
            i12 = 1;
        } else if (i12 == 1) {
            i12 = 0;
        }
        g0 g0Var = this.f43582G;
        if (g0Var.f43836l == z12 && g0Var.f43838n == i12 && g0Var.f43837m == i13) {
            return;
        }
        this.f43582G = g0Var.e(i13, i12, z12);
        b1(false, false);
        Q q11 = this.f43617s;
        for (N m11 = q11.m(); m11 != null; m11 = m11.g()) {
            for (I3.y yVar : m11.k().f11824c) {
                if (yVar != null) {
                    yVar.q(z12);
                }
            }
        }
        if (!P0()) {
            U0();
            Z0();
            g0 g0Var2 = this.f43582G;
            if (g0Var2.f43840p) {
                this.f43582G = g0Var2.i(false);
            }
            q11.y(this.f43597Z);
            return;
        }
        int i14 = this.f43582G.f43829e;
        InterfaceC8073o interfaceC8073o = this.f43605h;
        if (i14 == 3) {
            this.f43612o.f();
            R0();
            interfaceC8073o.k(2);
        } else if (i14 == 2) {
            interfaceC8073o.k(2);
        }
    }

    private void Z(int i11, int i12, F3.W w11) throws C5449k {
        this.f43583H.b(1);
        F(this.f43619t.q(i11, i12, w11), false);
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [F3.w, java.lang.Object] */
    private void Z0() throws C5449k {
        N m11 = this.f43617s.m();
        if (m11 == null) {
            return;
        }
        long readDiscontinuity = m11.f43667e ? m11.f43663a.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            if (!m11.m()) {
                this.f43617s.A(m11);
                E(false);
                M();
            }
            d0(readDiscontinuity);
            if (readDiscontinuity != this.f43582G.f43843s) {
                g0 g0Var = this.f43582G;
                long j11 = readDiscontinuity;
                this.f43582G = I(g0Var.f43826b, j11, g0Var.f43827c, j11, true, 5);
            }
        } else {
            long h11 = this.f43612o.h(m11 != this.f43617s.q());
            this.f43597Z = h11;
            long t2 = m11.t(h11);
            long j12 = this.f43582G.f43843s;
            if (!this.f43613p.isEmpty() && !this.f43582G.f43826b.b()) {
                if (this.f43620t0) {
                    j12--;
                    this.f43620t0 = false;
                }
                g0 g0Var2 = this.f43582G;
                int indexOfPeriod = g0Var2.f43825a.getIndexOfPeriod(g0Var2.f43826b.f8751a);
                int min = Math.min(this.f43618s0, this.f43613p.size());
                d dVar = min > 0 ? this.f43613p.get(min - 1) : null;
                while (dVar != null && (indexOfPeriod < 0 || (indexOfPeriod == 0 && 0 > j12))) {
                    int i11 = min - 1;
                    dVar = i11 > 0 ? this.f43613p.get(min - 2) : null;
                    min = i11;
                }
                if (min < this.f43613p.size()) {
                    this.f43613p.get(min);
                }
                this.f43618s0 = min;
            }
            if (this.f43612o.i()) {
                boolean z11 = !this.f43583H.f43641d;
                g0 g0Var3 = this.f43582G;
                this.f43582G = I(g0Var3.f43826b, t2, g0Var3.f43827c, t2, z11, 6);
            } else {
                g0 g0Var4 = this.f43582G;
                g0Var4.f43843s = t2;
                g0Var4.f43844t = SystemClock.elapsedRealtime();
            }
        }
        this.f43582G.f43841q = this.f43617s.h().f();
        g0 g0Var5 = this.f43582G;
        g0Var5.f43842r = z(g0Var5.f43841q);
        g0 g0Var6 = this.f43582G;
        if (g0Var6.f43836l && g0Var6.f43829e == 3 && Q0(g0Var6.f43825a, g0Var6.f43826b)) {
            g0 g0Var7 = this.f43582G;
            if (g0Var7.f43839o.f69345a == 1.0f) {
                float a11 = this.f43621u.a(v(g0Var7.f43825a, g0Var7.f43826b.f8751a, g0Var7.f43843s), this.f43582G.f43842r);
                if (this.f43612o.d().f69345a != a11) {
                    j3.x xVar = new j3.x(a11, this.f43582G.f43839o.f69346b);
                    this.f43605h.l(16);
                    this.f43612o.b(xVar);
                    H(this.f43582G.f43839o, this.f43612o.d().f69345a, false, false);
                }
            }
        }
    }

    private void a0() throws C5449k {
        int i11;
        float f7 = this.f43612o.d().f69345a;
        N m11 = this.f43617s.m();
        N q11 = this.f43617s.q();
        I3.F f11 = null;
        boolean z11 = true;
        while (m11 != null && m11.f43667e) {
            g0 g0Var = this.f43582G;
            I3.F q12 = m11.q(f7, g0Var.f43825a, g0Var.f43836l);
            I3.F f12 = m11 == this.f43617s.m() ? q12 : f11;
            I3.F k11 = m11.k();
            if (k11 != null) {
                int length = k11.f11824c.length;
                I3.y[] yVarArr = q12.f11824c;
                if (length == yVarArr.length) {
                    for (int i12 = 0; i12 < yVarArr.length; i12++) {
                        if (q12.a(k11, i12)) {
                        }
                    }
                    if (m11 == q11) {
                        z11 = false;
                    }
                    m11 = m11.g();
                    f11 = f12;
                }
            }
            if (z11) {
                N m12 = this.f43617s.m();
                boolean z12 = (this.f43617s.A(m12) & 1) != 0;
                boolean[] zArr = new boolean[this.f43598a.length];
                f12.getClass();
                long b11 = m12.b(f12, this.f43582G.f43843s, z12, zArr);
                g0 g0Var2 = this.f43582G;
                boolean z13 = (g0Var2.f43829e == 4 || b11 == g0Var2.f43843s) ? false : true;
                g0 g0Var3 = this.f43582G;
                i11 = 4;
                this.f43582G = I(g0Var3.f43826b, b11, g0Var3.f43827c, g0Var3.f43828d, z13, 5);
                if (z13) {
                    d0(b11);
                }
                q();
                boolean[] zArr2 = new boolean[this.f43598a.length];
                int i13 = 0;
                while (true) {
                    l0[] l0VarArr = this.f43598a;
                    if (i13 >= l0VarArr.length) {
                        break;
                    }
                    int g10 = l0VarArr[i13].g();
                    zArr2[i13] = this.f43598a[i13].u();
                    this.f43598a[i13].w(m12.f43665c[i13], this.f43612o, this.f43597Z, zArr[i13]);
                    if (g10 - this.f43598a[i13].g() > 0) {
                        Q(i13, false);
                    }
                    this.f43595X -= g10 - this.f43598a[i13].g();
                    i13++;
                }
                t(zArr2, this.f43597Z);
                m12.f43670h = true;
            } else {
                i11 = 4;
                this.f43617s.A(m11);
                if (m11.f43667e) {
                    long max = Math.max(m11.f43669g.f43680b, m11.t(this.f43597Z));
                    if (this.f43631z && n() && this.f43617s.p() == m11) {
                        q();
                    }
                    m11.a(q12, max);
                }
            }
            E(true);
            if (this.f43582G.f43829e != i11) {
                M();
                Z0();
                this.f43605h.k(2);
                return;
            }
            return;
        }
    }

    private void a1(AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar, AbstractC7252H abstractC7252H2, InterfaceC3018x.b bVar2, long j11, boolean z11) throws C5449k {
        if (!Q0(abstractC7252H, bVar)) {
            j3.x xVar = bVar.b() ? j3.x.f69344d : this.f43582G.f43839o;
            C5447i c5447i = this.f43612o;
            if (c5447i.d().equals(xVar)) {
                return;
            }
            this.f43605h.l(16);
            c5447i.b(xVar);
            H(this.f43582G.f43839o, xVar.f69345a, false, false);
            return;
        }
        Object obj = bVar.f8751a;
        AbstractC7252H.b bVar3 = this.f43609l;
        int i11 = abstractC7252H.getPeriodByUid(obj, bVar3).f68939c;
        AbstractC7252H.c cVar = this.f43608k;
        abstractC7252H.getWindow(i11, cVar);
        C7275q.e eVar = cVar.f68955j;
        C5445g c5445g = this.f43621u;
        c5445g.e(eVar);
        if (j11 != -9223372036854775807L) {
            c5445g.f(v(abstractC7252H, obj, j11));
            return;
        }
        if (!Objects.equals(!abstractC7252H2.isEmpty() ? abstractC7252H2.getWindow(abstractC7252H2.getPeriodByUid(bVar2.f8751a, bVar3).f68939c, cVar).f68946a : null, cVar.f68946a) || z11) {
            c5445g.f(-9223372036854775807L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b0(boolean z11, boolean z12, boolean z13, boolean z14) {
        long j11;
        long j12;
        long j13;
        boolean z15;
        AbstractC7252H abstractC7252H;
        AbstractC7252H abstractC7252H2;
        InterfaceC3018x.b bVar;
        this.f43605h.l(2);
        this.f43580E = false;
        this.f43581F = null;
        this.f43622u0 = null;
        b1(false, true);
        this.f43612o.g();
        this.f43597Z = 1000000000000L;
        int i11 = 0;
        while (true) {
            try {
                l0[] l0VarArr = this.f43598a;
                if (i11 >= l0VarArr.length) {
                    break;
                }
                int g10 = l0VarArr[i11].g();
                l0VarArr[i11].b(this.f43612o);
                Q(i11, false);
                this.f43595X -= g10;
                i11++;
            } catch (C5449k | RuntimeException e11) {
                m3.s.d("ExoPlayerImplInternal", "Disable failed.", e11);
            }
        }
        this.f43628x0 = -9223372036854775807L;
        if (z11) {
            for (l0 l0Var : this.f43598a) {
                try {
                    l0Var.F();
                } catch (RuntimeException e12) {
                    m3.s.d("ExoPlayerImplInternal", "Reset failed.", e12);
                }
            }
        }
        this.f43595X = 0;
        g0 g0Var = this.f43582G;
        InterfaceC3018x.b bVar2 = g0Var.f43826b;
        long j14 = g0Var.f43843s;
        if (!this.f43582G.f43826b.b()) {
            g0 g0Var2 = this.f43582G;
            AbstractC7252H.b bVar3 = this.f43609l;
            InterfaceC3018x.b bVar4 = g0Var2.f43826b;
            AbstractC7252H abstractC7252H3 = g0Var2.f43825a;
            if (!abstractC7252H3.isEmpty() && !abstractC7252H3.getPeriodByUid(bVar4.f8751a, bVar3).f68942f) {
                j11 = this.f43582G.f43843s;
                if (z12) {
                    j12 = j14;
                    j13 = j11;
                    z15 = false;
                } else {
                    this.f43596Y = null;
                    Pair<InterfaceC3018x.b, Long> x11 = x(this.f43582G.f43825a);
                    bVar2 = (InterfaceC3018x.b) x11.first;
                    long longValue = ((Long) x11.second).longValue();
                    z15 = bVar2.equals(this.f43582G.f43826b) ? false : true;
                    j12 = longValue;
                    j13 = -9223372036854775807L;
                }
                this.f43617s.e();
                this.f43589N = false;
                abstractC7252H = this.f43582G.f43825a;
                if (z13 && (abstractC7252H instanceof i0)) {
                    abstractC7252H = ((i0) abstractC7252H).i(this.f43619t.h());
                    if (bVar2.f8752b != -1) {
                        abstractC7252H.getPeriodByUid(bVar2.f8751a, this.f43609l);
                        if (abstractC7252H.getWindow(this.f43609l.f68939c, this.f43608k).a()) {
                            abstractC7252H2 = abstractC7252H;
                            bVar = new InterfaceC3018x.b(bVar2.f8754d, bVar2.f8751a);
                            g0 g0Var3 = this.f43582G;
                            int i12 = g0Var3.f43829e;
                            C5449k c5449k = z14 ? null : g0Var3.f43830f;
                            F3.d0 d0Var = z15 ? F3.d0.f8643d : g0Var3.f43832h;
                            I3.F f7 = z15 ? this.f43602e : g0Var3.f43833i;
                            List v11 = z15 ? AbstractC5880y.v() : g0Var3.f43834j;
                            g0 g0Var4 = this.f43582G;
                            this.f43582G = new g0(abstractC7252H2, bVar, j13, j12, i12, c5449k, false, d0Var, f7, v11, bVar, g0Var4.f43836l, g0Var4.f43837m, g0Var4.f43838n, g0Var4.f43839o, j12, 0L, j12, 0L, false);
                            if (z13) {
                                this.f43617s.z();
                                this.f43619t.o();
                                return;
                            }
                            return;
                        }
                    }
                }
                abstractC7252H2 = abstractC7252H;
                bVar = bVar2;
                g0 g0Var32 = this.f43582G;
                int i122 = g0Var32.f43829e;
                C5449k c5449k2 = z14 ? null : g0Var32.f43830f;
                F3.d0 d0Var2 = z15 ? F3.d0.f8643d : g0Var32.f43832h;
                I3.F f72 = z15 ? this.f43602e : g0Var32.f43833i;
                List v112 = z15 ? AbstractC5880y.v() : g0Var32.f43834j;
                g0 g0Var42 = this.f43582G;
                this.f43582G = new g0(abstractC7252H2, bVar, j13, j12, i122, c5449k2, false, d0Var2, f72, v112, bVar, g0Var42.f43836l, g0Var42.f43837m, g0Var42.f43838n, g0Var42.f43839o, j12, 0L, j12, 0L, false);
                if (z13) {
                }
            }
        }
        j11 = this.f43582G.f43827c;
        if (z12) {
        }
        this.f43617s.e();
        this.f43589N = false;
        abstractC7252H = this.f43582G.f43825a;
        if (z13) {
            abstractC7252H = ((i0) abstractC7252H).i(this.f43619t.h());
            if (bVar2.f8752b != -1) {
            }
        }
        abstractC7252H2 = abstractC7252H;
        bVar = bVar2;
        g0 g0Var322 = this.f43582G;
        int i1222 = g0Var322.f43829e;
        C5449k c5449k22 = z14 ? null : g0Var322.f43830f;
        F3.d0 d0Var22 = z15 ? F3.d0.f8643d : g0Var322.f43832h;
        I3.F f722 = z15 ? this.f43602e : g0Var322.f43833i;
        List v1122 = z15 ? AbstractC5880y.v() : g0Var322.f43834j;
        g0 g0Var422 = this.f43582G;
        this.f43582G = new g0(abstractC7252H2, bVar, j13, j12, i1222, c5449k22, false, d0Var22, f722, v1122, bVar, g0Var422.f43836l, g0Var422.f43837m, g0Var422.f43838n, g0Var422.f43839o, j12, 0L, j12, 0L, false);
        if (z13) {
        }
    }

    private void b1(boolean z11, boolean z12) {
        long j11;
        this.f43587L = z11;
        if (!z11 || z12) {
            j11 = -9223372036854775807L;
        } else {
            this.f43614q.getClass();
            j11 = SystemClock.elapsedRealtime();
        }
        this.f43588M = j11;
    }

    private void c0() {
        N m11 = this.f43617s.m();
        this.f43586K = m11 != null && m11.f43669g.f43687i && this.f43585J;
    }

    private void d0(long j11) throws C5449k {
        N m11 = this.f43617s.m();
        long u11 = m11 == null ? j11 + 1000000000000L : m11.u(j11);
        this.f43597Z = u11;
        this.f43612o.e(u11);
        for (l0 l0Var : this.f43598a) {
            l0Var.G(m11, this.f43597Z);
        }
        for (N m12 = r0.m(); m12 != null; m12 = m12.g()) {
            for (I3.y yVar : m12.k().f11824c) {
                if (yVar != null) {
                    yVar.e();
                }
            }
        }
    }

    private void e0(AbstractC7252H abstractC7252H, AbstractC7252H abstractC7252H2) {
        if (abstractC7252H.isEmpty() && abstractC7252H2.isEmpty()) {
            return;
        }
        ArrayList<d> arrayList = this.f43613p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public static N f(K k11, O o11, long j11) {
        J3.e j12 = k11.f43603f.j();
        k11.f43626w0.getClass();
        return new N(k11.f43599b, j11, k11.f43601d, j12, k11.f43619t, o11, k11.f43602e);
    }

    private static Pair<Object, Long> f0(AbstractC7252H abstractC7252H, g gVar, boolean z11, int i11, boolean z12, AbstractC7252H.c cVar, AbstractC7252H.b bVar) {
        int g02;
        AbstractC7252H abstractC7252H2 = gVar.f43649a;
        if (abstractC7252H.isEmpty()) {
            return null;
        }
        AbstractC7252H abstractC7252H3 = abstractC7252H2.isEmpty() ? abstractC7252H : abstractC7252H2;
        try {
            Pair<Object, Long> periodPositionUs = abstractC7252H3.getPeriodPositionUs(cVar, bVar, gVar.f43650b, gVar.f43651c);
            if (abstractC7252H.equals(abstractC7252H3)) {
                return periodPositionUs;
            }
            if (abstractC7252H.getIndexOfPeriod(periodPositionUs.first) != -1) {
                return (abstractC7252H3.getPeriodByUid(periodPositionUs.first, bVar).f68942f && abstractC7252H3.getWindow(bVar.f68939c, cVar).f68959n == abstractC7252H3.getIndexOfPeriod(periodPositionUs.first)) ? abstractC7252H.getPeriodPositionUs(cVar, bVar, abstractC7252H.getPeriodByUid(periodPositionUs.first, bVar).f68939c, gVar.f43651c) : periodPositionUs;
            }
            if (!z11 || (g02 = g0(cVar, bVar, i11, z12, periodPositionUs.first, abstractC7252H3, abstractC7252H)) == -1) {
                return null;
            }
            return abstractC7252H.getPeriodPositionUs(cVar, bVar, g02, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    static int g0(AbstractC7252H.c cVar, AbstractC7252H.b bVar, int i11, boolean z11, Object obj, AbstractC7252H abstractC7252H, AbstractC7252H abstractC7252H2) {
        AbstractC7252H.b bVar2;
        Object obj2 = abstractC7252H.getWindow(abstractC7252H.getPeriodByUid(obj, bVar).f68939c, cVar).f68946a;
        int i12 = 0;
        for (int i13 = 0; i13 < abstractC7252H2.getWindowCount(); i13++) {
            if (abstractC7252H2.getWindow(i13, cVar).f68946a.equals(obj2)) {
                return i13;
            }
        }
        int indexOfPeriod = abstractC7252H.getIndexOfPeriod(obj);
        int periodCount = abstractC7252H.getPeriodCount();
        int i14 = indexOfPeriod;
        int i15 = -1;
        while (i12 < periodCount && i15 == -1) {
            AbstractC7252H.c cVar2 = cVar;
            bVar2 = bVar;
            int i16 = i11;
            boolean z12 = z11;
            AbstractC7252H abstractC7252H3 = abstractC7252H;
            i14 = abstractC7252H3.getNextPeriodIndex(i14, bVar2, cVar2, i16, z12);
            if (i14 == -1) {
                break;
            }
            i15 = abstractC7252H2.getIndexOfPeriod(abstractC7252H3.getUidOfPeriod(i14));
            i12++;
            abstractC7252H = abstractC7252H3;
            bVar = bVar2;
            cVar = cVar2;
            i11 = i16;
            z11 = z12;
        }
        bVar2 = bVar;
        if (i15 == -1) {
            return -1;
        }
        return abstractC7252H2.getPeriod(i15, bVar2).f68939c;
    }

    public static /* synthetic */ void h(K k11, h0 h0Var) {
        k11.getClass();
        try {
            p(h0Var);
        } catch (C5449k e11) {
            m3.s.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
            throw new RuntimeException(e11);
        }
    }

    private void h0(long j11) {
        boolean z11 = this.f43579D && this.f43578C.f98992d;
        long j12 = f43575A0;
        if (z11) {
            r2 = this.f43582G.f43829e != 3 ? j12 : 1000L;
            for (l0 l0Var : this.f43598a) {
                r2 = Math.min(r2, m3.N.g0(l0Var.h(this.f43597Z, this.f43616r0)));
            }
            if (this.f43582G.n()) {
                Q q11 = this.f43617s;
                if ((q11.m() != null ? q11.m().g() : null) != null) {
                    if ((m3.N.Q(r2) * this.f43582G.f43839o.f69345a) + this.f43597Z >= r0.i()) {
                        r2 = Math.min(r2, j12);
                    }
                }
            }
        } else if (this.f43582G.f43829e != 3 || P0()) {
            r2 = j12;
        }
        this.f43605h.j(j11 + r2);
    }

    static boolean j(K k11) {
        return k11.f43579D && k11.f43578C.f98992d;
    }

    private void j0(boolean z11) throws C5449k {
        InterfaceC3018x.b bVar = this.f43617s.m().f43669g.f43679a;
        long l02 = l0(bVar, this.f43582G.f43843s, true, false);
        if (l02 != this.f43582G.f43843s) {
            g0 g0Var = this.f43582G;
            this.f43582G = I(bVar, l02, g0Var.f43827c, g0Var.f43828d, z11, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(7:(8:27|(1:92)(3:33|(1:37)|38)|39|(1:48)|46|47|17|18)(1:93)|68|69|70|16|17|18)|49|50|(1:52)(1:89)|53|54|(1:56)(1:85)|57|58|(1:60)(1:83)|61|62|63|64|65|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0170, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0174, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0176, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017b, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #5 {all -> 0x00aa, blocks: (B:14:0x00a7, B:21:0x00b4, B:23:0x00ba, B:24:0x00bd, B:27:0x00d0, B:29:0x00d8, B:33:0x00e0, B:37:0x00ee, B:38:0x00f3, B:39:0x00fb, B:41:0x010b, B:46:0x0119), top: B:12:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Type inference failed for: r0v30, types: [F3.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void k0(g gVar, boolean z11) throws C5449k {
        long longValue;
        long j11;
        InterfaceC3018x.b C11;
        long j12;
        boolean z12;
        boolean z13;
        InterfaceC3018x.b bVar;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z14;
        long l02;
        g0 g0Var;
        InterfaceC3018x.b bVar2;
        AbstractC7252H abstractC7252H;
        long j17;
        InterfaceC3018x.b bVar3;
        long j18;
        long j19;
        g0 g0Var2;
        int i11;
        int i12;
        long j21;
        K k11 = this;
        k11.f43583H.b(z11 ? 1 : 0);
        if (k11.f43580E) {
            k11.f43581F = gVar;
            return;
        }
        Pair<Object, Long> f02 = f0(k11.f43582G.f43825a, gVar, true, k11.f43590O, k11.f43591P, k11.f43608k, k11.f43609l);
        try {
            try {
                if (f02 == null) {
                    Pair<InterfaceC3018x.b, Long> x11 = k11.x(k11.f43582G.f43825a);
                    C11 = (InterfaceC3018x.b) x11.first;
                    longValue = ((Long) x11.second).longValue();
                    z12 = !k11.f43582G.f43825a.isEmpty();
                    j11 = -9223372036854775807L;
                } else {
                    Object obj = f02.first;
                    longValue = ((Long) f02.second).longValue();
                    j11 = gVar.f43651c == -9223372036854775807L ? -9223372036854775807L : longValue;
                    C11 = k11.f43617s.C(k11.f43582G.f43825a, obj, longValue);
                    if (!C11.b()) {
                        j12 = 0;
                        z12 = gVar.f43651c == -9223372036854775807L;
                        if (!k11.f43582G.f43825a.isEmpty()) {
                            k11.f43596Y = gVar;
                        } else if (f02 == null) {
                            if (k11.f43582G.f43829e != 1) {
                                k11.J0(4);
                            }
                            k11.b0(false, true, false, true);
                        } else {
                            try {
                                try {
                                    if (C11.equals(k11.f43582G.f43826b)) {
                                        N m11 = k11.f43617s.m();
                                        if (m11 == null || !m11.f43667e || longValue == j12) {
                                            j15 = longValue;
                                        } else {
                                            ?? r02 = m11.f43663a;
                                            long j22 = k11.f43608k.f68958m;
                                            if (k11.f43579D && j22 != -9223372036854775807L) {
                                                k11.f43578C.getClass();
                                            }
                                            j15 = r02.getAdjustedSeekPositionUs(longValue, k11.f43577B);
                                        }
                                        if (m3.N.g0(j15) != m3.N.g0(k11.f43582G.f43843s) || ((i11 = (g0Var2 = k11.f43582G).f43829e) != 2 && i11 != 3)) {
                                            z13 = z12;
                                            bVar = C11;
                                        }
                                        j19 = g0Var2.f43843s;
                                        i12 = 2;
                                        j21 = j19;
                                        z13 = z12;
                                        bVar3 = C11;
                                        j18 = j11;
                                        k11.f43582G = k11.I(bVar3, j19, j18, j21, z13, i12);
                                        return;
                                    }
                                    z13 = z12;
                                    bVar = C11;
                                    j15 = longValue;
                                    k11.a1(abstractC7252H, bVar2, abstractC7252H, g0Var.f43826b, j17, true);
                                    bVar3 = bVar2;
                                    j18 = j17;
                                    j19 = l02;
                                    i12 = 2;
                                    j21 = j19;
                                    k11 = this;
                                    k11.f43582G = k11.I(bVar3, j19, j18, j21, z13, i12);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar = bVar2;
                                    j13 = j17;
                                    j14 = l02;
                                    k11.f43582G = k11.I(bVar, j14, j13, j14, z13, 2);
                                    throw th;
                                }
                                k11.f43580E = k11.f43579D;
                                boolean z15 = k11.f43582G.f43829e == 4;
                                Q q11 = k11.f43617s;
                                if (q11.m() != q11.q()) {
                                    j16 = j15;
                                    z14 = true;
                                } else {
                                    j16 = j15;
                                    z14 = false;
                                }
                                l02 = k11.l0(bVar, j16, z14, z15);
                                z13 |= longValue != l02;
                                g0Var = k11.f43582G;
                                bVar2 = bVar;
                                abstractC7252H = g0Var.f43825a;
                                j17 = j11;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        z13 = z12;
                        bVar3 = C11;
                        j19 = longValue;
                        j18 = j11;
                        i12 = 2;
                        j21 = j19;
                        k11 = this;
                        k11.f43582G = k11.I(bVar3, j19, j18, j21, z13, i12);
                        return;
                    }
                    k11.f43582G.f43825a.getPeriodByUid(C11.f8751a, k11.f43609l);
                    if (k11.f43609l.e(C11.f8752b) == C11.f8753c) {
                        k11.f43609l.f68943g.getClass();
                    }
                    z12 = true;
                    longValue = 0;
                }
                if (!k11.f43582G.f43825a.isEmpty()) {
                }
                z13 = z12;
                bVar3 = C11;
                j19 = longValue;
                j18 = j11;
                i12 = 2;
                j21 = j19;
                k11 = this;
                k11.f43582G = k11.I(bVar3, j19, j18, j21, z13, i12);
                return;
            } catch (Throwable th4) {
                th = th4;
                z13 = z12;
                bVar = C11;
                j14 = longValue;
                j13 = j11;
            }
        } catch (Throwable th5) {
            th = th5;
            z13 = z12;
            bVar = C11;
        }
        j12 = 0;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [F3.w, java.lang.Object] */
    private long l0(InterfaceC3018x.b bVar, long j11, boolean z11, boolean z12) throws C5449k {
        l0[] l0VarArr;
        U0();
        b1(false, true);
        if (z12 || this.f43582G.f43829e == 3) {
            J0(2);
        }
        Q q11 = this.f43617s;
        N m11 = q11.m();
        N n11 = m11;
        while (n11 != null && !bVar.equals(n11.f43669g.f43679a)) {
            n11 = n11.g();
        }
        if (z11 || m11 != n11 || (n11 != null && n11.u(j11) < 0)) {
            int i11 = 0;
            while (true) {
                l0VarArr = this.f43598a;
                if (i11 >= l0VarArr.length) {
                    break;
                }
                int g10 = l0VarArr[i11].g();
                l0VarArr[i11].b(this.f43612o);
                Q(i11, false);
                this.f43595X -= g10;
                i11++;
            }
            this.f43628x0 = -9223372036854775807L;
            if (n11 != null) {
                while (q11.m() != n11) {
                    q11.b();
                }
                q11.A(n11);
                n11.s(1000000000000L);
                t(new boolean[l0VarArr.length], q11.q().i());
                n11.f43670h = true;
            }
        }
        q();
        if (n11 != null) {
            q11.A(n11);
            if (!n11.f43667e) {
                n11.f43669g = n11.f43669g.b(j11);
            } else if (n11.f43668f) {
                ?? r102 = n11.f43663a;
                j11 = r102.seekToUs(j11);
                r102.discardBuffer(j11 - this.f43610m, this.f43611n);
            }
            d0(j11);
            M();
        } else {
            q11.e();
            d0(j11);
        }
        E(false);
        this.f43605h.k(2);
        return j11;
    }

    private void m(b bVar, int i11) throws C5449k {
        this.f43583H.b(1);
        f0 f0Var = this.f43619t;
        if (i11 == -1) {
            i11 = f0Var.i();
        }
        F(f0Var.d(i11, bVar.f43634a, bVar.f43635b), false);
    }

    private boolean n() {
        if (!this.f43631z) {
            return false;
        }
        for (l0 l0Var : this.f43598a) {
            if (l0Var.r()) {
                return true;
            }
        }
        return false;
    }

    private void n0(h0 h0Var) throws C5449k {
        h0Var.getClass();
        Looper a11 = h0Var.a();
        Looper looper = this.f43607j;
        InterfaceC8073o interfaceC8073o = this.f43605h;
        if (a11 != looper) {
            interfaceC8073o.d(15, h0Var).a();
            return;
        }
        p(h0Var);
        int i11 = this.f43582G.f43829e;
        if (i11 == 3 || i11 == 2) {
            interfaceC8073o.k(2);
        }
    }

    private void o() throws C5449k {
        a0();
        j0(true);
    }

    private void o0(final h0 h0Var) {
        Looper a11 = h0Var.a();
        if (a11.getThread().isAlive()) {
            this.f43614q.a(a11, null).i(new Runnable() { // from class: androidx.media3.exoplayer.H
                @Override // java.lang.Runnable
                public final void run() {
                    K.h(K.this, h0Var);
                }
            });
        } else {
            m3.s.f("TAG", "Trying to send message on a dead thread.");
            h0Var.e(false);
        }
    }

    private static void p(h0 h0Var) throws C5449k {
        synchronized (h0Var) {
        }
        try {
            h0Var.c().j(h0Var.d(), h0Var.b());
        } finally {
            h0Var.e(true);
        }
    }

    private void q() {
        if (this.f43631z && n()) {
            for (l0 l0Var : this.f43598a) {
                int g10 = l0Var.g();
                l0Var.c(this.f43612o);
                this.f43595X -= g10 - l0Var.g();
            }
            this.f43628x0 = -9223372036854775807L;
        }
    }

    private void q0(C7263e c7263e, boolean z11) throws C5449k {
        this.f43601d.j(c7263e);
        if (!z11) {
            c7263e = null;
        }
        C5443e c5443e = this.f43576A;
        c5443e.e(c7263e);
        g0 g0Var = this.f43582G;
        boolean z12 = g0Var.f43836l;
        Y0(c5443e.g(g0Var.f43829e, z12), g0Var.f43838n, g0Var.f43837m, z12);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039f A[LOOP:4: B:132:0x039d->B:133:0x039f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e6  */
    /* JADX WARN: Type inference failed for: r1v42, types: [F3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v98, types: [F3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v59, types: [F3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [F3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v59, types: [F3.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void r() throws C5449k, IOException {
        boolean z11;
        boolean z12;
        long j11;
        boolean z13;
        g0 g0Var;
        boolean g10;
        boolean z14;
        boolean z15;
        g0 g0Var2;
        int i11;
        l0[] l0VarArr;
        N q11;
        Q q12;
        I3.F f7;
        N q13;
        boolean z16;
        N m11;
        N g11;
        N b11;
        boolean z17;
        int i12;
        int i13;
        boolean z18;
        boolean z19;
        N p11;
        l0[] l0VarArr2;
        I3.F f11;
        int i14;
        O l11;
        this.f43614q.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f43605h.l(2);
        long j12 = -9223372036854775807L;
        if (!this.f43582G.f43825a.isEmpty() && this.f43619t.j()) {
            long j13 = this.f43597Z;
            Q q14 = this.f43617s;
            q14.y(j13);
            if (q14.E() && (l11 = q14.l(this.f43597Z, this.f43582G)) != null) {
                N f12 = q14.f(l11);
                boolean z21 = f12.f43666d;
                long j14 = l11.f43680b;
                if (!z21) {
                    f12.f43666d = true;
                    f12.f43663a.prepare(this, j14);
                } else if (f12.f43667e) {
                    this.f43605h.d(8, f12.f43663a).a();
                }
                if (q14.m() == f12) {
                    d0(j14);
                }
                E(false);
            }
            if (this.f43589N) {
                this.f43589N = J(q14.h());
                V0();
            } else {
                M();
            }
            boolean z22 = this.f43586K;
            boolean z23 = this.f43631z;
            l0[] l0VarArr3 = this.f43598a;
            if (!z22 && z23 && !this.f43630y0 && !n() && (p11 = q14.p()) != null && p11 == q14.q() && p11.g() != null && p11.g().f43667e) {
                q14.c();
                N p12 = q14.p();
                if (p12 != null) {
                    I3.F k11 = p12.k();
                    int i15 = 0;
                    while (i15 < l0VarArr3.length) {
                        if (k11.b(i15) && l0VarArr3[i15].p() && !l0VarArr3[i15].r()) {
                            l0VarArr3[i15].R();
                            l0[] l0VarArr4 = l0VarArr3;
                            i14 = i15;
                            f11 = k11;
                            l0VarArr2 = l0VarArr4;
                            s(p12, i14, false, p12.i());
                        } else {
                            l0VarArr2 = l0VarArr3;
                            f11 = k11;
                            i14 = i15;
                        }
                        i15 = i14 + 1;
                        l0VarArr3 = l0VarArr2;
                        k11 = f11;
                    }
                    l0VarArr = l0VarArr3;
                    if (n()) {
                        this.f43628x0 = p12.f43663a.readDiscontinuity();
                        if (!p12.m()) {
                            q14.A(p12);
                            E(false);
                            M();
                        }
                    }
                    q11 = q14.q();
                    if (q11 != null) {
                        if (q11.g() == null || this.f43586K) {
                            q12 = q14;
                            if (q11.f43669g.f43688j || this.f43586K) {
                                int length = l0VarArr.length;
                                int i16 = 0;
                                while (i16 < length) {
                                    l0 l0Var = l0VarArr[i16];
                                    if (l0Var.t(q11) && l0Var.o(q11)) {
                                        long j15 = q11.f43669g.f43683e;
                                        l0Var.I(q11, (j15 == j12 || j15 == Long.MIN_VALUE) ? -9223372036854775807L : q11.h() + q11.f43669g.f43683e);
                                    }
                                    i16++;
                                    j12 = -9223372036854775807L;
                                }
                            }
                        } else {
                            N q15 = q14.q();
                            if (q15.f43667e) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 < l0VarArr.length) {
                                        if (!l0VarArr[i17].m(q15)) {
                                            break;
                                        } else {
                                            i17++;
                                        }
                                    } else if ((!n() || q14.p() != q14.q()) && (q11.g().f43667e || this.f43597Z >= q11.g().i())) {
                                        I3.F k12 = q11.k();
                                        N d11 = q14.d();
                                        I3.F k13 = d11.k();
                                        AbstractC7252H abstractC7252H = this.f43582G.f43825a;
                                        q12 = q14;
                                        I3.F f13 = k13;
                                        a1(abstractC7252H, d11.f43669g.f43679a, abstractC7252H, q11.f43669g.f43679a, -9223372036854775807L, false);
                                        if (!d11.f43667e || ((!z23 || this.f43628x0 == -9223372036854775807L) && d11.f43663a.readDiscontinuity() == -9223372036854775807L)) {
                                            f7 = f13;
                                        } else {
                                            this.f43628x0 = -9223372036854775807L;
                                            boolean z24 = z23 && !this.f43630y0;
                                            if (z24) {
                                                int i18 = 0;
                                                while (i18 < l0VarArr.length) {
                                                    f7 = f13;
                                                    if (f7.b(i18) && l0VarArr[i18].k() != -2) {
                                                        I3.y[] yVarArr = f7.f11824c;
                                                        if (!j3.u.a(yVarArr[i18].j().f69127o, yVarArr[i18].j().f69123k) && !l0VarArr[i18].r()) {
                                                            z24 = false;
                                                            break;
                                                        }
                                                    }
                                                    i18++;
                                                    f13 = f7;
                                                }
                                            }
                                            f7 = f13;
                                            if (!z24) {
                                                long i19 = d11.i();
                                                for (l0 l0Var2 : l0VarArr) {
                                                    l0Var2.H(i19);
                                                }
                                                if (!d11.m()) {
                                                    q12.A(d11);
                                                    E(false);
                                                    M();
                                                }
                                            }
                                        }
                                        for (l0 l0Var3 : l0VarArr) {
                                            l0Var3.z(k12, f7, d11.i());
                                        }
                                    }
                                }
                            }
                        }
                        q13 = q12.q();
                        if (q13 != null && q12.m() != q13 && !q13.f43670h) {
                            N q16 = q12.q();
                            I3.F k14 = q16.k();
                            z18 = true;
                            for (i13 = 0; i13 < l0VarArr.length; i13++) {
                                int g12 = l0VarArr[i13].g();
                                int D11 = l0VarArr[i13].D(q16, k14, this.f43612o);
                                if ((D11 & 2) != 0 && (z19 = this.f43594S) && z19) {
                                    this.f43594S = false;
                                    if (this.f43582G.f43840p) {
                                        this.f43605h.k(2);
                                    }
                                }
                                this.f43595X -= g12 - l0VarArr[i13].g();
                                z18 &= (D11 & 1) != 0;
                            }
                            if (z18) {
                                for (int i21 = 0; i21 < l0VarArr.length; i21++) {
                                    if (k14.b(i21) && !l0VarArr[i21].t(q16)) {
                                        s(q16, i21, false, q16.i());
                                    }
                                }
                            }
                            if (z18) {
                                q12.q().f43670h = true;
                            }
                        }
                        z16 = false;
                        while (P0() && !this.f43586K && (m11 = q12.m()) != null && (g11 = m11.g()) != null && this.f43597Z >= g11.i() && g11.f43670h) {
                            if (z16) {
                                O();
                            }
                            this.f43630y0 = false;
                            b11 = q12.b();
                            b11.getClass();
                            if (this.f43582G.f43826b.f8751a.equals(b11.f43669g.f43679a.f8751a)) {
                                InterfaceC3018x.b bVar = this.f43582G.f43826b;
                                if (bVar.f8752b == -1) {
                                    InterfaceC3018x.b bVar2 = b11.f43669g.f43679a;
                                    if (bVar2.f8752b == -1 && bVar.f8755e != bVar2.f8755e) {
                                        z17 = true;
                                        O o11 = b11.f43669g;
                                        boolean z25 = z17;
                                        InterfaceC3018x.b bVar3 = o11.f43679a;
                                        boolean z26 = !z25;
                                        long j16 = o11.f43680b;
                                        this.f43582G = I(bVar3, j16, o11.f43681c, j16, z26, 0);
                                        c0();
                                        Z0();
                                        if (n() && b11 == q12.p()) {
                                            for (l0 l0Var4 : l0VarArr) {
                                                l0Var4.x();
                                            }
                                        }
                                        if (this.f43582G.f43829e == 3) {
                                            R0();
                                        }
                                        I3.F k15 = q12.m().k();
                                        for (i12 = 0; i12 < l0VarArr.length; i12++) {
                                            if (k15.b(i12)) {
                                                l0VarArr[i12].f();
                                            }
                                        }
                                        z16 = true;
                                    }
                                }
                            }
                            z17 = false;
                            O o112 = b11.f43669g;
                            boolean z252 = z17;
                            InterfaceC3018x.b bVar32 = o112.f43679a;
                            boolean z262 = !z252;
                            long j162 = o112.f43680b;
                            this.f43582G = I(bVar32, j162, o112.f43681c, j162, z262, 0);
                            c0();
                            Z0();
                            if (n()) {
                                while (r2 < r1) {
                                }
                            }
                            if (this.f43582G.f43829e == 3) {
                            }
                            I3.F k152 = q12.m().k();
                            while (i12 < l0VarArr.length) {
                            }
                            z16 = true;
                        }
                        this.f43626w0.getClass();
                    }
                    q12 = q14;
                    q13 = q12.q();
                    if (q13 != null) {
                        N q162 = q12.q();
                        I3.F k142 = q162.k();
                        z18 = true;
                        while (i13 < l0VarArr.length) {
                        }
                        if (z18) {
                        }
                        if (z18) {
                        }
                    }
                    z16 = false;
                    while (P0()) {
                        if (z16) {
                        }
                        this.f43630y0 = false;
                        b11 = q12.b();
                        b11.getClass();
                        if (this.f43582G.f43826b.f8751a.equals(b11.f43669g.f43679a.f8751a)) {
                        }
                        z17 = false;
                        O o1122 = b11.f43669g;
                        boolean z2522 = z17;
                        InterfaceC3018x.b bVar322 = o1122.f43679a;
                        boolean z2622 = !z2522;
                        long j1622 = o1122.f43680b;
                        this.f43582G = I(bVar322, j1622, o1122.f43681c, j1622, z2622, 0);
                        c0();
                        Z0();
                        if (n()) {
                        }
                        if (this.f43582G.f43829e == 3) {
                        }
                        I3.F k1522 = q12.m().k();
                        while (i12 < l0VarArr.length) {
                        }
                        z16 = true;
                    }
                    this.f43626w0.getClass();
                }
            }
            l0VarArr = l0VarArr3;
            q11 = q14.q();
            if (q11 != null) {
            }
            q12 = q14;
            q13 = q12.q();
            if (q13 != null) {
            }
            z16 = false;
            while (P0()) {
            }
            this.f43626w0.getClass();
        }
        int i22 = this.f43582G.f43829e;
        if (i22 == 1 || i22 == 4) {
            return;
        }
        N m12 = this.f43617s.m();
        if (m12 == null) {
            h0(uptimeMillis);
            return;
        }
        Z0();
        if (m12.f43667e) {
            this.f43614q.getClass();
            this.f43616r0 = m3.N.Q(SystemClock.elapsedRealtime());
            m12.f43663a.discardBuffer(this.f43582G.f43843s - this.f43610m, this.f43611n);
            z11 = true;
            z12 = true;
            int i23 = 0;
            while (true) {
                l0[] l0VarArr5 = this.f43598a;
                if (i23 >= l0VarArr5.length) {
                    break;
                }
                l0 l0Var5 = l0VarArr5[i23];
                if (l0Var5.g() == 0) {
                    Q(i23, false);
                } else {
                    l0Var5.C(this.f43597Z, this.f43616r0);
                    z11 = z11 && l0Var5.q();
                    boolean a11 = l0Var5.a(m12);
                    Q(i23, a11);
                    z12 = z12 && a11;
                    if (!a11) {
                        P(i23);
                    }
                }
                i23++;
            }
        } else {
            m12.f43663a.maybeThrowPrepareError();
            z11 = true;
            z12 = true;
        }
        long j17 = m12.f43669g.f43683e;
        if (z11 && m12.f43667e) {
            j11 = -9223372036854775807L;
            if (j17 == -9223372036854775807L || j17 <= this.f43582G.f43843s) {
                z13 = true;
                if (z13 && this.f43586K) {
                    this.f43586K = false;
                    int i24 = this.f43582G.f43838n;
                    this.f43583H.b(0);
                    Y0(this.f43576A.g(this.f43582G.f43829e, false), i24, 5, false);
                }
                if (z13 || !m12.f43669g.f43688j) {
                    g0Var = this.f43582G;
                    if (g0Var.f43829e == 2) {
                        if (this.f43595X == 0) {
                            g10 = L();
                        } else if (z12) {
                            if (g0Var.f43831g) {
                                Q q17 = this.f43617s;
                                N m13 = q17.m();
                                long b12 = Q0(this.f43582G.f43825a, m13.f43669g.f43679a) ? this.f43621u.b() : j11;
                                N h11 = q17.h();
                                boolean z27 = h11.m() && h11.f43669g.f43688j;
                                boolean z28 = h11.f43669g.f43679a.b() && !h11.f43667e;
                                if (!z27 && !z28) {
                                    long z29 = z(h11.f());
                                    AbstractC7252H abstractC7252H2 = this.f43582G.f43825a;
                                    InterfaceC3018x.b bVar4 = m13.f43669g.f43679a;
                                    long t2 = m13.t(this.f43597Z);
                                    float f14 = this.f43612o.d().f69345a;
                                    boolean z31 = this.f43582G.f43836l;
                                    g10 = this.f43603f.g(new L.a(this.f43625w, abstractC7252H2, bVar4, t2, z29, f14, this.f43587L, b12));
                                }
                            }
                            g10 = true;
                        } else {
                            g10 = false;
                        }
                        if (g10) {
                            J0(3);
                            this.f43622u0 = null;
                            if (P0()) {
                                b1(false, false);
                                this.f43612o.f();
                                R0();
                            }
                        }
                    }
                    if (this.f43582G.f43829e == 3 && (this.f43595X != 0 ? !z12 : !L())) {
                        b1(P0(), false);
                        J0(2);
                        if (this.f43587L) {
                            for (N m14 = this.f43617s.m(); m14 != null; m14 = m14.g()) {
                                for (I3.y yVar : m14.k().f11824c) {
                                    if (yVar != null) {
                                        yVar.k();
                                    }
                                }
                            }
                            this.f43621u.d();
                        }
                        U0();
                    }
                } else {
                    J0(4);
                    U0();
                }
                if (this.f43582G.f43829e == 2) {
                    int i25 = 0;
                    while (true) {
                        l0[] l0VarArr6 = this.f43598a;
                        if (i25 >= l0VarArr6.length) {
                            break;
                        }
                        if (l0VarArr6[i25].t(m12)) {
                            P(i25);
                        }
                        i25++;
                    }
                    g0 g0Var3 = this.f43582G;
                    if (!g0Var3.f43831g && g0Var3.f43842r < 500000 && J(this.f43617s.h()) && P0()) {
                        z14 = true;
                        if (!z14) {
                            this.f43624v0 = j11;
                        } else if (this.f43624v0 == j11) {
                            this.f43614q.getClass();
                            this.f43624v0 = SystemClock.elapsedRealtime();
                        } else {
                            this.f43614q.getClass();
                            if (SystemClock.elapsedRealtime() - this.f43624v0 >= 4000) {
                                throw new IllegalStateException("Playback stuck buffering and not loading");
                            }
                        }
                        boolean z32 = !P0() && this.f43582G.f43829e == 3;
                        z15 = !this.f43594S && this.f43593R && z32;
                        g0Var2 = this.f43582G;
                        if (g0Var2.f43840p != z15) {
                            this.f43582G = g0Var2.i(z15);
                        }
                        this.f43593R = false;
                        if (z15 || (i11 = this.f43582G.f43829e) == 4) {
                            return;
                        }
                        if (z32 || i11 == 2 || (i11 == 3 && this.f43595X != 0)) {
                            h0(uptimeMillis);
                            return;
                        }
                        return;
                    }
                }
                z14 = false;
                if (!z14) {
                }
                if (P0()) {
                }
                if (this.f43594S) {
                }
                g0Var2 = this.f43582G;
                if (g0Var2.f43840p != z15) {
                }
                this.f43593R = false;
                if (z15) {
                    return;
                } else {
                    return;
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        z13 = false;
        if (z13) {
            this.f43586K = false;
            int i242 = this.f43582G.f43838n;
            this.f43583H.b(0);
            Y0(this.f43576A.g(this.f43582G.f43829e, false), i242, 5, false);
        }
        if (z13) {
        }
        g0Var = this.f43582G;
        if (g0Var.f43829e == 2) {
        }
        if (this.f43582G.f43829e == 3) {
            b1(P0(), false);
            J0(2);
            if (this.f43587L) {
            }
            U0();
        }
        if (this.f43582G.f43829e == 2) {
        }
        z14 = false;
        if (!z14) {
        }
        if (P0()) {
        }
        if (this.f43594S) {
        }
        g0Var2 = this.f43582G;
        if (g0Var2.f43840p != z15) {
        }
        this.f43593R = false;
        if (z15) {
        }
    }

    private void r0(boolean z11, C8067i c8067i) {
        if (this.f43592Q != z11) {
            this.f43592Q = z11;
            if (!z11) {
                for (l0 l0Var : this.f43598a) {
                    l0Var.F();
                }
            }
        }
        if (c8067i != null) {
            c8067i.g();
        }
    }

    private void s(N n11, int i11, boolean z11, long j11) throws C5449k {
        l0 l0Var = this.f43598a[i11];
        if (l0Var.u()) {
            return;
        }
        boolean z12 = n11 == this.f43617s.m();
        I3.F k11 = n11.k();
        C9734F c9734f = k11.f11823b[i11];
        I3.y yVar = k11.f11824c[i11];
        boolean z13 = P0() && this.f43582G.f43829e == 3;
        boolean z14 = !z11 && z13;
        this.f43595X++;
        l0Var.e(c9734f, yVar, n11.f43665c[i11], this.f43597Z, z14, z12, j11, n11.h(), n11.f43669g.f43679a, this.f43612o);
        l0Var.l(new a(), n11);
        if (z13 && z12) {
            l0Var.Q();
        }
    }

    private void s0(b bVar) throws C5449k {
        this.f43583H.b(1);
        if (bVar.f43636c != -1) {
            this.f43596Y = new g(new i0(bVar.f43634a, bVar.f43635b), bVar.f43636c, bVar.f43637d);
        }
        F(this.f43619t.s(bVar.f43634a, bVar.f43635b), false);
    }

    private void t(boolean[] zArr, long j11) throws C5449k {
        l0[] l0VarArr;
        long j12;
        N q11 = this.f43617s.q();
        I3.F k11 = q11.k();
        int i11 = 0;
        while (true) {
            l0VarArr = this.f43598a;
            if (i11 >= l0VarArr.length) {
                break;
            }
            if (!k11.b(i11)) {
                l0VarArr[i11].F();
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < l0VarArr.length) {
            if (!k11.b(i12) || l0VarArr[i12].t(q11)) {
                j12 = j11;
            } else {
                j12 = j11;
                s(q11, i12, zArr[i12], j12);
            }
            i12++;
            j11 = j12;
        }
    }

    private void u0(boolean z11) throws C5449k {
        this.f43585J = z11;
        c0();
        if (this.f43586K) {
            Q q11 = this.f43617s;
            if (q11.q() != q11.m()) {
                j0(true);
                E(false);
            }
        }
    }

    private long v(AbstractC7252H abstractC7252H, Object obj, long j11) {
        AbstractC7252H.b bVar = this.f43609l;
        int i11 = abstractC7252H.getPeriodByUid(obj, bVar).f68939c;
        AbstractC7252H.c cVar = this.f43608k;
        abstractC7252H.getWindow(i11, cVar);
        if (cVar.f68951f == -9223372036854775807L || !cVar.a() || !cVar.f68954i) {
            return -9223372036854775807L;
        }
        long j12 = cVar.f68952g;
        return m3.N.Q((j12 == -9223372036854775807L ? System.currentTimeMillis() : j12 + SystemClock.elapsedRealtime()) - cVar.f68951f) - (j11 + bVar.f68941e);
    }

    private long w(N n11) {
        if (n11 == null) {
            return 0L;
        }
        long h11 = n11.h();
        if (!n11.f43667e) {
            return h11;
        }
        int i11 = 0;
        while (true) {
            l0[] l0VarArr = this.f43598a;
            if (i11 >= l0VarArr.length) {
                return h11;
            }
            if (l0VarArr[i11].t(n11)) {
                long i12 = l0VarArr[i11].i(n11);
                if (i12 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                h11 = Math.max(i12, h11);
            }
            i11++;
        }
    }

    private Pair<InterfaceC3018x.b, Long> x(AbstractC7252H abstractC7252H) {
        long j11 = 0;
        if (abstractC7252H.isEmpty()) {
            return Pair.create(g0.l(), 0L);
        }
        Pair<Object, Long> periodPositionUs = abstractC7252H.getPeriodPositionUs(this.f43608k, this.f43609l, abstractC7252H.getFirstWindowIndex(this.f43591P), -9223372036854775807L);
        InterfaceC3018x.b C11 = this.f43617s.C(abstractC7252H, periodPositionUs.first, 0L);
        long longValue = ((Long) periodPositionUs.second).longValue();
        if (C11.b()) {
            Object obj = C11.f8751a;
            AbstractC7252H.b bVar = this.f43609l;
            abstractC7252H.getPeriodByUid(obj, bVar);
            if (C11.f8753c == bVar.e(C11.f8752b)) {
                bVar.f68943g.getClass();
            }
        } else {
            j11 = longValue;
        }
        return Pair.create(C11, Long.valueOf(j11));
    }

    private void x0(j3.x xVar) throws C5449k {
        this.f43605h.l(16);
        C5447i c5447i = this.f43612o;
        c5447i.b(xVar);
        j3.x d11 = c5447i.d();
        H(d11, d11.f69345a, true, true);
    }

    private void y0(ExoPlayer.c cVar) {
        this.f43626w0 = cVar;
        this.f43617s.G(this.f43582G.f43825a, cVar);
    }

    private long z(long j11) {
        N h11 = this.f43617s.h();
        if (h11 == null) {
            return 0L;
        }
        return Math.max(0L, j11 - h11.t(this.f43597Z));
    }

    public final void B0(boolean z11) {
        this.f43605h.d(36, Boolean.valueOf(z11)).a();
    }

    public final void D0(t3.H h11) {
        this.f43605h.d(38, h11).a();
    }

    public final void G0(boolean z11) {
        this.f43605h.e(12, z11 ? 1 : 0, 0).a();
    }

    public final boolean L0(long j11, Object obj) {
        if (this.f43584I || !this.f43607j.getThread().isAlive()) {
            return true;
        }
        C8067i c8067i = new C8067i(this.f43614q);
        this.f43605h.d(30, new Pair(obj, c8067i)).a();
        if (j11 != -9223372036854775807L) {
            return c8067i.d(j11);
        }
        return true;
    }

    public final void N0(float f7) {
        this.f43605h.d(32, Float.valueOf(f7)).a();
    }

    public final void O0() {
        this.f43605h.k(34);
    }

    public final void S0() {
        this.f43605h.b(6).a();
    }

    public final void T(j3.x xVar) {
        this.f43605h.d(16, xVar).a();
    }

    public final void U() {
        InterfaceC8073o interfaceC8073o = this.f43605h;
        interfaceC8073o.l(2);
        interfaceC8073o.k(22);
    }

    public final void V() {
        this.f43605h.b(29).a();
    }

    public final boolean X() {
        if (this.f43584I || !this.f43607j.getThread().isAlive()) {
            return true;
        }
        this.f43584I = true;
        C8067i c8067i = new C8067i(this.f43614q);
        this.f43605h.d(7, c8067i).a();
        return c8067i.d(this.f43623v);
    }

    @Override // I3.E.a
    public final void a() {
        this.f43605h.k(10);
    }

    @Override // L3.u
    public final void b(long j11, long j12, C7272n c7272n, MediaFormat mediaFormat) {
        if (this.f43580E) {
            this.f43605h.b(37).a();
        }
    }

    @Override // F3.V.a
    public final void c(InterfaceC3017w interfaceC3017w) {
        this.f43605h.d(9, interfaceC3017w).a();
    }

    @Override // I3.E.a
    public final void d() {
        this.f43605h.k(26);
    }

    @Override // F3.InterfaceC3017w.a
    public final void e(InterfaceC3017w interfaceC3017w) {
        this.f43605h.d(8, interfaceC3017w).a();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11;
        int i12;
        InterfaceC3018x.b bVar;
        N q11;
        try {
            int i13 = message.what;
            C5443e c5443e = this.f43576A;
            switch (i13) {
                case 1:
                    boolean z11 = message.arg1 != 0;
                    int i14 = message.arg2;
                    this.f43583H.b(1);
                    Y0(c5443e.g(this.f43582G.f43829e, z11), i14 >> 4, i14 & 15, z11);
                    break;
                case 2:
                    r();
                    break;
                case 3:
                    k0((g) message.obj, true);
                    break;
                case 4:
                    x0((j3.x) message.obj);
                    break;
                case 5:
                    F0((t3.I) message.obj);
                    break;
                case 6:
                    T0(false, true);
                    break;
                case 7:
                    Y((C8067i) message.obj);
                    return true;
                case 8:
                    G((InterfaceC3017w) message.obj);
                    break;
                case 9:
                    C((InterfaceC3017w) message.obj);
                    break;
                case 10:
                    a0();
                    break;
                case 11:
                    A0(message.arg1);
                    break;
                case 12:
                    H0(message.arg1 != 0);
                    break;
                case 13:
                    r0(message.arg1 != 0, (C8067i) message.obj);
                    break;
                case 14:
                    n0((h0) message.obj);
                    break;
                case 15:
                    o0((h0) message.obj);
                    break;
                case 16:
                    j3.x xVar = (j3.x) message.obj;
                    H(xVar, xVar.f69345a, true, false);
                    break;
                case 17:
                    s0((b) message.obj);
                    break;
                case 18:
                    m((b) message.obj, message.arg1);
                    break;
                case 19:
                    S((c) message.obj);
                    break;
                case 20:
                    Z(message.arg1, message.arg2, (F3.W) message.obj);
                    break;
                case 21:
                    I0((F3.W) message.obj);
                    break;
                case 22:
                    R();
                    break;
                case 23:
                    u0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    o();
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    a0();
                    j0(true);
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    X0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    y0((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    W();
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    Pair pair = (Pair) message.obj;
                    M0(pair.first, (C8067i) pair.second);
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    q0((C7263e) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    float floatValue = ((Float) message.obj).floatValue();
                    this.f43632z0 = floatValue;
                    float c11 = floatValue * c5443e.c();
                    for (l0 l0Var : this.f43598a) {
                        l0Var.P(c11);
                    }
                    break;
                case 33:
                    A(message.arg1);
                    break;
                case 34:
                    B();
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    K0((L3.u) message.obj);
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    C0(((Boolean) message.obj).booleanValue());
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    this.f43580E = false;
                    g gVar = this.f43581F;
                    if (gVar != null) {
                        k0(gVar, false);
                        this.f43581F = null;
                        break;
                    }
                    break;
                case 38:
                    E0((t3.H) message.obj);
                    break;
            }
        } catch (C2997b e11) {
            D(1002, e11);
        } catch (C5449k e12) {
            e = e12;
            int i15 = e.f44076c;
            Q q12 = this.f43617s;
            if (i15 == 1 && (q11 = q12.q()) != null && e.f44081h == null) {
                e = e.b(q11.f43669g.f43679a);
            }
            int i16 = e.f44076c;
            InterfaceC8073o interfaceC8073o = this.f43605h;
            if (i16 == 1 && (bVar = e.f44081h) != null && K(e.f44078e, bVar)) {
                this.f43630y0 = true;
                q();
                N p11 = q12.p();
                N m11 = q12.m();
                if (q12.m() != p11) {
                    while (m11 != null && m11.g() != p11) {
                        m11 = m11.g();
                    }
                }
                q12.A(m11);
                if (this.f43582G.f43829e != 4) {
                    M();
                    interfaceC8073o.k(2);
                }
            } else {
                C5449k c5449k = this.f43622u0;
                if (c5449k != null) {
                    c5449k.addSuppressed(e);
                    e = this.f43622u0;
                }
                if (e.f44076c == 1 && q12.m() != q12.q()) {
                    while (q12.m() != q12.q()) {
                        q12.b();
                    }
                    N m12 = q12.m();
                    G10.a.e(m12);
                    O();
                    O o11 = m12.f43669g;
                    InterfaceC3018x.b bVar2 = o11.f43679a;
                    long j11 = o11.f43680b;
                    this.f43582G = I(bVar2, j11, o11.f43681c, j11, true, 0);
                }
                if (e.f44082i && (this.f43622u0 == null || (i12 = e.f69342a) == 5004 || i12 == 5003)) {
                    m3.s.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f43622u0 == null) {
                        this.f43622u0 = e;
                    }
                    interfaceC8073o.g(interfaceC8073o.d(25, e));
                } else {
                    m3.s.d("ExoPlayerImplInternal", "Playback error", e);
                    T0(true, false);
                    this.f43582G = this.f43582G.f(e);
                }
            }
        } catch (j3.v e13) {
            boolean z12 = e13.f69340a;
            int i17 = e13.f69341b;
            if (i17 == 1) {
                i11 = z12 ? AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else {
                if (i17 == 4) {
                    i11 = z12 ? AuthApiStatusCodes.AUTH_API_CLIENT_ERROR : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
                }
                D(r3, e13);
            }
            r3 = i11;
            D(r3, e13);
        } catch (RuntimeException e14) {
            C5449k f7 = C5449k.f(e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            m3.s.d("ExoPlayerImplInternal", "Playback error", f7);
            T0(true, false);
            this.f43582G = this.f43582G.f(f7);
        } catch (C8847g e15) {
            D(e15.f80060a, e15);
        } catch (g.a e16) {
            D(e16.f103472a, e16);
        } catch (IOException e17) {
            D(2000, e17);
        }
        O();
        return true;
    }

    public final void i0(AbstractC7252H abstractC7252H, int i11, long j11) {
        this.f43605h.d(3, new g(abstractC7252H, i11, j11)).a();
    }

    public final void m0(h0 h0Var) {
        if (!this.f43584I && this.f43607j.getThread().isAlive()) {
            this.f43605h.d(14, h0Var).a();
        } else {
            m3.s.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            h0Var.e(false);
        }
    }

    public final void p0(C7263e c7263e) {
        this.f43605h.f(c7263e).a();
    }

    public final void t0(int i11, long j11, F3.W w11, ArrayList arrayList) {
        this.f43605h.d(17, new b(i11, j11, w11, arrayList)).a();
    }

    public final void u(int i11) {
        this.f43605h.e(33, i11, 0).a();
    }

    public final void v0(int i11, int i12, boolean z11) {
        this.f43605h.e(1, z11 ? 1 : 0, i11 | (i12 << 4)).a();
    }

    public final void w0(j3.x xVar) {
        this.f43605h.d(4, xVar).a();
    }

    public final Looper y() {
        return this.f43607j;
    }

    public final void z0(int i11) {
        this.f43605h.e(11, i11, 0).a();
    }
}
