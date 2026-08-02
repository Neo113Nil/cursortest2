package B3;

import B3.M;
import B3.q;
import F3.InterfaceC3018x;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.exoplayer.AbstractC5444f;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.j0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7266h;
import j3.C7272n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import m3.C8055H;
import s3.InterfaceC9588b;
import s3.f;
import t3.C9730B;
import t3.C9737c;
import t3.C9738d;
import u3.P;
import w3.g;

/* loaded from: classes.dex */
public abstract class C extends AbstractC5444f {

    /* renamed from: Z0, reason: collision with root package name */
    private static final byte[] f2221Z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final MediaCodec.BufferInfo f2222A;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f2223A0;

    /* renamed from: B, reason: collision with root package name */
    private final ArrayDeque<d> f2224B;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f2225B0;

    /* renamed from: C, reason: collision with root package name */
    private final v3.K f2226C;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f2227C0;

    /* renamed from: D, reason: collision with root package name */
    private C7272n f2228D;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f2229D0;

    /* renamed from: E, reason: collision with root package name */
    private C7272n f2230E;

    /* renamed from: E0, reason: collision with root package name */
    private int f2231E0;

    /* renamed from: F, reason: collision with root package name */
    private w3.g f2232F;

    /* renamed from: F0, reason: collision with root package name */
    private int f2233F0;

    /* renamed from: G, reason: collision with root package name */
    private w3.g f2234G;

    /* renamed from: G0, reason: collision with root package name */
    private int f2235G0;

    /* renamed from: H, reason: collision with root package name */
    private j0.a f2236H;

    /* renamed from: H0, reason: collision with root package name */
    private boolean f2237H0;

    /* renamed from: I, reason: collision with root package name */
    private MediaCrypto f2238I;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f2239I0;

    /* renamed from: J, reason: collision with root package name */
    private long f2240J;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f2241J0;

    /* renamed from: K, reason: collision with root package name */
    private float f2242K;

    /* renamed from: K0, reason: collision with root package name */
    private long f2243K0;

    /* renamed from: L, reason: collision with root package name */
    private float f2244L;

    /* renamed from: L0, reason: collision with root package name */
    private long f2245L0;

    /* renamed from: M, reason: collision with root package name */
    private q f2246M;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f2247M0;

    /* renamed from: N, reason: collision with root package name */
    private C7272n f2248N;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f2249N0;

    /* renamed from: O, reason: collision with root package name */
    private MediaFormat f2250O;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f2251O0;

    /* renamed from: P, reason: collision with root package name */
    private boolean f2252P;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f2253P0;

    /* renamed from: Q, reason: collision with root package name */
    private float f2254Q;

    /* renamed from: Q0, reason: collision with root package name */
    private C5449k f2255Q0;

    /* renamed from: R, reason: collision with root package name */
    private ArrayDeque<t> f2256R;

    /* renamed from: R0, reason: collision with root package name */
    protected C9737c f2257R0;

    /* renamed from: S, reason: collision with root package name */
    private b f2258S;

    /* renamed from: S0, reason: collision with root package name */
    private d f2259S0;

    /* renamed from: T0, reason: collision with root package name */
    private long f2260T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f2261U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f2262V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f2263W0;

    /* renamed from: X, reason: collision with root package name */
    private t f2264X;

    /* renamed from: X0, reason: collision with root package name */
    private long f2265X0;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f2266Y;

    /* renamed from: Y0, reason: collision with root package name */
    private long f2267Y0;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f2268Z;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f2269r0;

    /* renamed from: s, reason: collision with root package name */
    private final q.b f2270s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f2271s0;

    /* renamed from: t, reason: collision with root package name */
    private final E f2272t;

    /* renamed from: t0, reason: collision with root package name */
    private long f2273t0;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f2274u;

    /* renamed from: u0, reason: collision with root package name */
    private long f2275u0;

    /* renamed from: v, reason: collision with root package name */
    private final float f2276v;

    /* renamed from: v0, reason: collision with root package name */
    private int f2277v0;

    /* renamed from: w, reason: collision with root package name */
    private final s3.f f2278w;

    /* renamed from: w0, reason: collision with root package name */
    private int f2279w0;

    /* renamed from: x, reason: collision with root package name */
    private final s3.f f2280x;

    /* renamed from: x0, reason: collision with root package name */
    private ByteBuffer f2281x0;

    /* renamed from: y, reason: collision with root package name */
    private final s3.f f2282y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f2283y0;

    /* renamed from: z, reason: collision with root package name */
    private final C2565i f2284z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f2285z0;

    /* loaded from: classes8.dex */
    private static final class a {
        public static void a(q.a aVar, P p11) {
            boolean equals;
            String stringId;
            LogSessionId unused;
            LogSessionId a11 = p11.a();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a11.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.f2362b;
            stringId = a11.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements q.c {
        c() {
        }
    }

    private static final class d {

        /* renamed from: e, reason: collision with root package name */
        public static final d f2291e = new d(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f2292a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2293b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2294c;

        /* renamed from: d, reason: collision with root package name */
        public final C8055H<C7272n> f2295d = new C8055H<>();

        public d(long j11, long j12, long j13) {
            this.f2292a = j11;
            this.f2293b = j12;
            this.f2294c = j13;
        }
    }

    public C(int i11, q.b bVar, E e11, boolean z11, float f7) {
        super(i11);
        this.f2270s = bVar;
        e11.getClass();
        this.f2272t = e11;
        this.f2274u = z11;
        this.f2276v = f7;
        this.f2278w = new s3.f(0);
        this.f2280x = new s3.f(0);
        this.f2282y = new s3.f(2);
        C2565i c2565i = new C2565i();
        this.f2284z = c2565i;
        this.f2222A = new MediaCodec.BufferInfo();
        this.f2242K = 1.0f;
        this.f2244L = 1.0f;
        this.f2240J = -9223372036854775807L;
        this.f2224B = new ArrayDeque<>();
        this.f2259S0 = d.f2291e;
        c2565i.o(0);
        c2565i.f98184d.order(ByteOrder.nativeOrder());
        this.f2226C = new v3.K();
        this.f2254Q = -1.0f;
        this.f2231E0 = 0;
        this.f2277v0 = -1;
        this.f2279w0 = -1;
        this.f2275u0 = -9223372036854775807L;
        this.f2243K0 = -9223372036854775807L;
        this.f2245L0 = -9223372036854775807L;
        this.f2260T0 = -9223372036854775807L;
        this.f2273t0 = -9223372036854775807L;
        this.f2233F0 = 0;
        this.f2235G0 = 0;
        this.f2257R0 = new C9737c();
        this.f2265X0 = -9223372036854775807L;
        this.f2267Y0 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if ("OMX.bcm.vdec.hevc.tunnel.secure".equals(r1) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r13.f2374f != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void C0(t tVar, MediaCrypto mediaCrypto) throws Exception {
        this.f2264X = tVar;
        C7272n c7272n = this.f2228D;
        c7272n.getClass();
        int i11 = Build.VERSION.SDK_INT;
        float q02 = q0(this.f2244L, c7272n, K());
        if (q02 <= this.f2276v) {
            q02 = -1.0f;
        }
        F();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        q.a v02 = v0(tVar, c7272n, mediaCrypto, q02);
        if (i11 >= 31) {
            a.a(v02, J());
        }
        q a11 = this.f2270s.a(v02);
        this.f2246M = a11;
        a11.h(new c());
        F();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean g10 = tVar.g(c7272n);
        String str = tVar.f2369a;
        if (!g10) {
            String d11 = C7272n.d(c7272n);
            Locale locale = Locale.US;
            m3.s.f("MediaCodecRenderer", V.e.a("Format exceeds selected codec's capabilities [", d11, ", ", str, "]"));
        }
        this.f2254Q = q02;
        this.f2248N = c7272n;
        boolean z11 = false;
        this.f2266Y = i11 == 29 && "c2.android.aac.decoder".equals(str);
        if (i11 <= 29) {
            String str2 = tVar.f2369a;
            if (!"OMX.broadcom.video_decoder.tunnel".equals(str2)) {
                if (!"OMX.broadcom.video_decoder.tunnel.secure".equals(str2)) {
                    if (!"OMX.bcm.vdec.avc.tunnel".equals(str2)) {
                        if (!"OMX.bcm.vdec.avc.tunnel.secure".equals(str2)) {
                            if (!"OMX.bcm.vdec.hevc.tunnel".equals(str2)) {
                            }
                        }
                    }
                }
            }
            z11 = true;
            this.f2271s0 = z11;
            this.f2246M.getClass();
            if (getState() == 2) {
                F();
                this.f2275u0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f2257R0.f99011a++;
            K0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        }
        if ("Amazon".equals(Build.MANUFACTURER)) {
            if ("AFTS".equals(Build.MODEL)) {
            }
        }
        this.f2271s0 = z11;
        this.f2246M.getClass();
        if (getState() == 2) {
        }
        this.f2257R0.f99011a++;
        K0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    private boolean F0(long j11, long j12) {
        if (j12 >= j11) {
            return false;
        }
        C7272n c7272n = this.f2230E;
        return (c7272n != null && Objects.equals(c7272n.f69127o, "audio/opus") && Jb.b.e(j11, j12)) ? false : true;
    }

    private void H0(MediaCrypto mediaCrypto, boolean z11) throws b, C5449k {
        C7272n c7272n = this.f2228D;
        c7272n.getClass();
        if (this.f2256R == null) {
            try {
                List<t> l02 = l0(z11);
                ArrayDeque<t> arrayDeque = new ArrayDeque<>();
                this.f2256R = arrayDeque;
                if (this.f2274u) {
                    arrayDeque.addAll(l02);
                } else {
                    ArrayList arrayList = (ArrayList) l02;
                    if (!arrayList.isEmpty()) {
                        this.f2256R.add((t) arrayList.get(0));
                    }
                }
                this.f2258S = null;
            } catch (M.b e11) {
                throw new b(c7272n, e11, z11, -49998);
            }
        }
        if (this.f2256R.isEmpty()) {
            throw new b(c7272n, (M.b) null, z11, -49999);
        }
        ArrayDeque<t> arrayDeque2 = this.f2256R;
        arrayDeque2.getClass();
        while (this.f2246M == null) {
            t peekFirst = arrayDeque2.peekFirst();
            peekFirst.getClass();
            if (!I0(c7272n) || !f1(peekFirst)) {
                return;
            }
            try {
                C0(peekFirst, mediaCrypto);
            } catch (Exception e12) {
                m3.s.g("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e12);
                arrayDeque2.removeFirst();
                b bVar = new b(c7272n, e12, z11, peekFirst);
                J0(bVar);
                if (this.f2258S == null) {
                    this.f2258S = bVar;
                } else {
                    this.f2258S = b.a(this.f2258S);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f2258S;
                }
            }
        }
        this.f2256R = null;
    }

    @TargetApi(23)
    private void S0() throws C5449k {
        int i11 = this.f2235G0;
        if (i11 == 1) {
            i0();
            return;
        }
        if (i11 == 2) {
            i0();
            l1();
        } else if (i11 != 3) {
            this.f2249N0 = true;
            W0();
        } else {
            V0();
            G0();
        }
    }

    private boolean U0(int i11) throws C5449k {
        C9730B H11 = H();
        s3.f fVar = this.f2278w;
        fVar.f();
        int X9 = X(H11, fVar, i11 | 4);
        if (X9 == -5) {
            M0(H11);
            return true;
        }
        if (X9 != -4 || !fVar.i()) {
            return false;
        }
        this.f2247M0 = true;
        S0();
        return false;
    }

    private void Z0(w3.g gVar) {
        w3.g gVar2 = this.f2232F;
        if (gVar2 != gVar) {
            if (gVar != null) {
                gVar.e(null);
            }
            if (gVar2 != null) {
                gVar2.a(null);
            }
        }
        this.f2232F = gVar;
    }

    private void a1(d dVar) {
        this.f2259S0 = dVar;
        long j11 = dVar.f2294c;
        if (j11 != -9223372036854775807L) {
            this.f2261U0 = true;
            O0(j11);
        }
    }

    private boolean b0(long j11, long j12) throws C5449k {
        C2565i c2565i;
        C2565i c2565i2;
        G10.a.h(!this.f2249N0);
        C2565i c2565i3 = this.f2284z;
        if (c2565i3.u()) {
            ByteBuffer byteBuffer = c2565i3.f98184d;
            int i11 = this.f2279w0;
            int t2 = c2565i3.t();
            long j13 = c2565i3.f98186f;
            boolean F02 = F0(I(), c2565i3.s());
            boolean i12 = c2565i3.i();
            C7272n c7272n = this.f2230E;
            c7272n.getClass();
            c2565i = c2565i3;
            if (!T0(j11, j12, null, byteBuffer, i11, 0, t2, j13, F02, i12, c7272n)) {
                return false;
            }
            P0(c2565i.s());
            c2565i.f();
        } else {
            c2565i = c2565i3;
        }
        if (this.f2247M0) {
            this.f2249N0 = true;
            return false;
        }
        boolean z11 = this.f2225B0;
        s3.f fVar = this.f2282y;
        if (z11) {
            c2565i2 = c2565i;
            G10.a.h(c2565i2.r(fVar));
            this.f2225B0 = false;
        } else {
            c2565i2 = c2565i;
        }
        boolean z12 = this.f2227C0;
        v3.K k11 = this.f2226C;
        if (z12) {
            if (!c2565i2.u()) {
                this.f2223A0 = false;
                this.f2243K0 = -9223372036854775807L;
                this.f2245L0 = -9223372036854775807L;
                this.f2260T0 = -9223372036854775807L;
                this.f2227C0 = false;
                c2565i2.f();
                fVar.f();
                this.f2225B0 = false;
                k11.b();
                this.f2227C0 = false;
                G0();
                if (!this.f2223A0) {
                    return false;
                }
            }
        }
        G10.a.h(!this.f2247M0);
        C9730B H11 = H();
        fVar.f();
        do {
            fVar.f();
            int X9 = X(H11, fVar, 0);
            if (X9 == -5) {
                M0(H11);
                break;
            }
            if (X9 == -4) {
                if (!fVar.i()) {
                    this.f2243K0 = Math.max(this.f2243K0, fVar.f98186f);
                    if (f() || this.f2280x.k()) {
                        this.f2245L0 = this.f2243K0;
                    }
                    if (this.f2251O0) {
                        C7272n c7272n2 = this.f2228D;
                        c7272n2.getClass();
                        this.f2230E = c7272n2;
                        if (Objects.equals(c7272n2.f69127o, "audio/opus") && !this.f2230E.f69130r.isEmpty()) {
                            byte[] bArr = this.f2230E.f69130r.get(0);
                            int i13 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                            C7272n.a a11 = this.f2230E.a();
                            a11.d0(i13);
                            this.f2230E = a11.P();
                        }
                        N0(this.f2230E, null);
                        this.f2251O0 = false;
                    }
                    fVar.p();
                    C7272n c7272n3 = this.f2230E;
                    if (c7272n3 != null && Objects.equals(c7272n3.f69127o, "audio/opus")) {
                        if (fVar.h()) {
                            fVar.f98182b = this.f2230E;
                            A0(fVar);
                        }
                        if (Jb.b.e(I(), fVar.f98186f)) {
                            k11.a(fVar, this.f2230E.f69130r);
                        }
                    }
                    if (c2565i2.u()) {
                        long I11 = I();
                        if (F0(I11, c2565i2.s()) != F0(I11, fVar.f98186f)) {
                            break;
                        }
                    }
                } else {
                    this.f2247M0 = true;
                    this.f2245L0 = this.f2243K0;
                    break;
                }
            } else {
                if (X9 != -3) {
                    throw new IllegalStateException();
                }
                if (f()) {
                    this.f2245L0 = this.f2243K0;
                }
            }
        } while (c2565i2.r(fVar));
        this.f2225B0 = true;
        if (c2565i2.u()) {
            c2565i2.p();
        }
        return c2565i2.u() || this.f2247M0 || this.f2227C0;
    }

    @TargetApi(23)
    private boolean e0() throws C5449k {
        if (!this.f2237H0) {
            l1();
            return true;
        }
        this.f2233F0 = 1;
        this.f2235G0 = 2;
        return true;
    }

    private boolean f0(long j11, long j12) throws C5449k {
        q qVar = this.f2246M;
        qVar.getClass();
        boolean z11 = this.f2279w0 >= 0;
        MediaCodec.BufferInfo bufferInfo = this.f2222A;
        if (!z11) {
            int i11 = qVar.i(bufferInfo);
            if (i11 < 0) {
                if (i11 == -2) {
                    this.f2241J0 = true;
                    q qVar2 = this.f2246M;
                    qVar2.getClass();
                    this.f2250O = qVar2.j();
                    this.f2252P = true;
                    return true;
                }
                if (this.f2271s0 && (this.f2247M0 || this.f2233F0 == 2)) {
                    S0();
                }
                long j13 = this.f2273t0;
                if (j13 != -9223372036854775807L) {
                    long j14 = j13 + 100;
                    F();
                    if (j14 < System.currentTimeMillis()) {
                        S0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f2269r0) {
                this.f2269r0 = false;
                qVar.f(i11);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                S0();
                return false;
            }
            this.f2279w0 = i11;
            ByteBuffer o11 = qVar.o(i11);
            this.f2281x0 = o11;
            if (o11 != null) {
                o11.position(bufferInfo.offset);
                this.f2281x0.limit(bufferInfo.offset + bufferInfo.size);
            }
            m1(bufferInfo.presentationTimeUs);
        }
        this.f2283y0 = bufferInfo.presentationTimeUs < I();
        long j15 = this.f2245L0;
        this.f2285z0 = j15 != -9223372036854775807L && j15 <= bufferInfo.presentationTimeUs;
        if (this.f2263W0) {
            long j16 = this.f2265X0;
            if (j16 == -9223372036854775807L || bufferInfo.presentationTimeUs > j16) {
                this.f2265X0 = bufferInfo.presentationTimeUs;
                this.f2283y0 = true;
                this.f2285z0 = false;
            } else {
                this.f2263W0 = false;
                this.f2265X0 = -9223372036854775807L;
            }
        }
        ByteBuffer byteBuffer = this.f2281x0;
        int i12 = this.f2279w0;
        int i13 = bufferInfo.flags;
        long j17 = bufferInfo.presentationTimeUs;
        boolean z12 = this.f2283y0;
        boolean z13 = this.f2285z0;
        C7272n c7272n = this.f2230E;
        c7272n.getClass();
        if (!T0(j11, j12, qVar, byteBuffer, i12, i13, 1, j17, z12, z13, c7272n)) {
            return false;
        }
        P0(bufferInfo.presentationTimeUs);
        boolean z14 = (bufferInfo.flags & 4) != 0;
        if (!z14 && this.f2239I0 && this.f2285z0) {
            F();
            this.f2273t0 = System.currentTimeMillis();
        }
        this.f2279w0 = -1;
        this.f2281x0 = null;
        if (!z14) {
            return true;
        }
        S0();
        return false;
    }

    private boolean h0() throws C5449k {
        q qVar = this.f2246M;
        if (qVar != null && this.f2233F0 != 2 && !this.f2247M0) {
            int i11 = this.f2277v0;
            s3.f fVar = this.f2280x;
            if (i11 < 0) {
                int n11 = qVar.n();
                this.f2277v0 = n11;
                if (n11 >= 0) {
                    fVar.f98184d = qVar.l(n11);
                    fVar.f();
                }
            }
            if (this.f2233F0 == 1) {
                if (!this.f2271s0) {
                    this.f2239I0 = true;
                    qVar.c(this.f2277v0, 0, 4, 0L);
                    this.f2277v0 = -1;
                    fVar.f98184d = null;
                }
                this.f2233F0 = 2;
                return false;
            }
            if (this.f2268Z) {
                this.f2268Z = false;
                ByteBuffer byteBuffer = fVar.f98184d;
                byteBuffer.getClass();
                byteBuffer.put(f2221Z0);
                qVar.c(this.f2277v0, 38, 0, 0L);
                this.f2277v0 = -1;
                fVar.f98184d = null;
                this.f2237H0 = true;
                return true;
            }
            if (this.f2231E0 == 1) {
                int i12 = 0;
                while (true) {
                    C7272n c7272n = this.f2248N;
                    c7272n.getClass();
                    if (i12 >= c7272n.f69130r.size()) {
                        break;
                    }
                    byte[] bArr = this.f2248N.f69130r.get(i12);
                    ByteBuffer byteBuffer2 = fVar.f98184d;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i12++;
                }
                this.f2231E0 = 2;
            }
            ByteBuffer byteBuffer3 = fVar.f98184d;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            C9730B H11 = H();
            try {
                int X9 = X(H11, fVar, 0);
                if (X9 == -3) {
                    if (f()) {
                        this.f2245L0 = this.f2243K0;
                        return false;
                    }
                } else {
                    if (X9 == -5) {
                        if (this.f2231E0 == 2) {
                            fVar.f();
                            this.f2231E0 = 1;
                        }
                        M0(H11);
                        return true;
                    }
                    if (!fVar.i()) {
                        if (!this.f2237H0 && !fVar.j()) {
                            fVar.f();
                            if (this.f2231E0 == 2) {
                                this.f2231E0 = 1;
                                return true;
                            }
                        } else if (!d1(fVar)) {
                            boolean q11 = fVar.q();
                            if (q11) {
                                fVar.f98183c.b(position);
                            }
                            long j11 = fVar.f98186f;
                            if (this.f2251O0) {
                                ArrayDeque<d> arrayDeque = this.f2224B;
                                if (arrayDeque.isEmpty()) {
                                    C8055H<C7272n> c8055h = this.f2259S0.f2295d;
                                    C7272n c7272n2 = this.f2228D;
                                    c7272n2.getClass();
                                    c8055h.a(j11, c7272n2);
                                } else {
                                    C8055H<C7272n> c8055h2 = arrayDeque.peekLast().f2295d;
                                    C7272n c7272n3 = this.f2228D;
                                    c7272n3.getClass();
                                    c8055h2.a(j11, c7272n3);
                                }
                                this.f2251O0 = false;
                            }
                            this.f2243K0 = Math.max(this.f2243K0, j11);
                            if (f() || fVar.k()) {
                                this.f2245L0 = this.f2243K0;
                            }
                            fVar.p();
                            if (fVar.h()) {
                                A0(fVar);
                            }
                            R0(fVar);
                            int n02 = n0(fVar);
                            if ((Build.VERSION.SDK_INT < 34 || (n02 & 32) == 0) && !G().f98987b) {
                                this.f2267Y0 = Math.max(this.f2267Y0, fVar.f98186f);
                            }
                            if (q11) {
                                qVar.b(this.f2277v0, fVar.f98183c, j11, n02);
                            } else {
                                int i13 = this.f2277v0;
                                ByteBuffer byteBuffer4 = fVar.f98184d;
                                byteBuffer4.getClass();
                                qVar.c(i13, byteBuffer4.limit(), n02, j11);
                            }
                            this.f2277v0 = -1;
                            fVar.f98184d = null;
                            this.f2237H0 = true;
                            this.f2231E0 = 0;
                            this.f2257R0.f99013c++;
                            return true;
                        }
                        return true;
                    }
                    this.f2245L0 = this.f2243K0;
                    if (this.f2231E0 == 2) {
                        fVar.f();
                        this.f2231E0 = 1;
                    }
                    this.f2247M0 = true;
                    if (!this.f2237H0) {
                        S0();
                        return false;
                    }
                    if (!this.f2271s0) {
                        this.f2239I0 = true;
                        qVar.c(this.f2277v0, 0, 4, 0L);
                        this.f2277v0 = -1;
                        fVar.f98184d = null;
                        return false;
                    }
                }
            } catch (f.a e11) {
                J0(e11);
                U0(0);
                i0();
                return true;
            }
        }
        return false;
    }

    private void i0() {
        try {
            q qVar = this.f2246M;
            G10.a.i(qVar);
            qVar.flush();
        } finally {
            X0();
        }
    }

    private boolean k0() {
        if (this.f2246M != null) {
            if (g1()) {
                V0();
                return true;
            }
            if (e1()) {
                i0();
                return false;
            }
            if (this.f2267Y0 != -9223372036854775807L) {
                long I11 = I();
                long j11 = this.f2267Y0;
                if (I11 <= j11 && this.f2260T0 < j11) {
                    this.f2263W0 = true;
                    this.f2267Y0 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    private boolean k1(C7272n c7272n) throws C5449k {
        if (this.f2246M != null && this.f2235G0 != 3 && getState() != 0) {
            float f7 = this.f2244L;
            c7272n.getClass();
            float q02 = q0(f7, c7272n, K());
            float f11 = this.f2254Q;
            if (f11 != q02) {
                if (q02 == -1.0f) {
                    if (this.f2237H0) {
                        this.f2233F0 = 1;
                        this.f2235G0 = 3;
                        return false;
                    }
                    V0();
                    G0();
                    return false;
                }
                if (f11 != -1.0f || q02 > this.f2276v) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", q02);
                    q qVar = this.f2246M;
                    qVar.getClass();
                    qVar.a(bundle);
                    this.f2254Q = q02;
                }
            }
        }
        return true;
    }

    private List<t> l0(boolean z11) throws M.b {
        C7272n c7272n = this.f2228D;
        c7272n.getClass();
        E e11 = this.f2272t;
        ArrayList s02 = s0(e11, c7272n, z11);
        if (!s02.isEmpty() || !z11) {
            return s02;
        }
        ArrayList s03 = s0(e11, c7272n, false);
        if (!s03.isEmpty()) {
            m3.s.f("MediaCodecRenderer", "Drm session requires secure decoder for " + c7272n.f69127o + ", but no secure decoder available. Trying to proceed with " + s03 + ".");
        }
        return s03;
    }

    private void l1() throws C5449k {
        w3.g gVar = this.f2234G;
        gVar.getClass();
        InterfaceC9588b c11 = gVar.c();
        if (c11 instanceof w3.p) {
            try {
                MediaCrypto mediaCrypto = this.f2238I;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((w3.p) c11).f103490b);
            } catch (MediaCryptoException e11) {
                throw D(e11, this.f2228D, 6006);
            }
        }
        Z0(this.f2234G);
        this.f2233F0 = 0;
        this.f2235G0 = 0;
    }

    @Override // androidx.media3.exoplayer.j0
    public void A(float f7, float f11) throws C5449k {
        this.f2242K = f7;
        this.f2244L = f11;
        k1(this.f2248N);
    }

    protected abstract void A0(s3.f fVar) throws C5449k;

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.k0
    public final int B() {
        return 8;
    }

    protected final boolean B0() {
        return this.f2263W0;
    }

    protected final boolean D0() {
        return this.f2223A0;
    }

    protected final boolean E0(C7272n c7272n) {
        return this.f2234G == null && h1(c7272n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r7 != 4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r1.getError() != null) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void G0() throws C5449k {
        C7272n c7272n;
        if (this.f2246M != null || this.f2223A0 || (c7272n = this.f2228D) == null) {
            return;
        }
        boolean E02 = E0(c7272n);
        boolean z11 = false;
        String str = c7272n.f69127o;
        if (E02) {
            this.f2223A0 = false;
            this.f2243K0 = -9223372036854775807L;
            this.f2245L0 = -9223372036854775807L;
            this.f2260T0 = -9223372036854775807L;
            this.f2227C0 = false;
            C2565i c2565i = this.f2284z;
            c2565i.f();
            this.f2282y.f();
            this.f2225B0 = false;
            this.f2226C.b();
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c2565i.v(32);
            } else {
                c2565i.v(1);
            }
            this.f2223A0 = true;
            return;
        }
        Z0(this.f2234G);
        if (this.f2232F != null) {
            G10.a.h(this.f2238I == null);
            w3.g gVar = this.f2232F;
            InterfaceC9588b c11 = gVar.c();
            if (w3.p.f103488c && (c11 instanceof w3.p)) {
                int state = gVar.getState();
                if (state == 1) {
                    g.a error = gVar.getError();
                    error.getClass();
                    throw D(error, this.f2228D, error.f103472a);
                }
            }
            if (c11 != null) {
                if (c11 instanceof w3.p) {
                    w3.p pVar = (w3.p) c11;
                    try {
                        this.f2238I = new MediaCrypto(pVar.f103489a, pVar.f103490b);
                    } catch (MediaCryptoException e11) {
                        throw D(e11, this.f2228D, 6006);
                    }
                }
            }
        }
        try {
            w3.g gVar2 = this.f2232F;
            if (gVar2 != null) {
                if (gVar2.getState() != 3) {
                    if (this.f2232F.getState() == 4) {
                    }
                }
                w3.g gVar3 = this.f2232F;
                G10.a.i(str);
                if (gVar3.f(str)) {
                    z11 = true;
                }
            }
            H0(this.f2238I, z11);
            MediaCrypto mediaCrypto = this.f2238I;
            if (mediaCrypto == null || this.f2246M != null) {
                return;
            }
            mediaCrypto.release();
            this.f2238I = null;
        } catch (b e12) {
            throw D(e12, c7272n, 4001);
        }
    }

    protected boolean I0(C7272n c7272n) throws C5449k {
        return true;
    }

    protected abstract void J0(Exception exc);

    protected abstract void K0(String str, long j11, long j12);

    protected abstract void L0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        if (r3.f(r2) != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected C9738d M0(C9730B c9730b) throws C5449k {
        int i11;
        InterfaceC9588b c11;
        InterfaceC9588b c12;
        this.f2251O0 = true;
        C7272n c7272n = c9730b.f98980b;
        c7272n.getClass();
        String str = c7272n.f69127o;
        if (str == null) {
            throw D(new IllegalArgumentException("Sample MIME type is null."), c7272n, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !c7272n.f69130r.isEmpty()) {
            C7272n.a a11 = c7272n.a();
            a11.k0(null);
            c7272n = a11.P();
        }
        C7272n c7272n2 = c7272n;
        w3.g gVar = c9730b.f98979a;
        w3.g gVar2 = this.f2234G;
        if (gVar2 != gVar) {
            if (gVar != null) {
                gVar.e(null);
            }
            if (gVar2 != null) {
                gVar2.a(null);
            }
        }
        this.f2234G = gVar;
        this.f2228D = c7272n2;
        if (this.f2223A0) {
            this.f2227C0 = true;
            return null;
        }
        q qVar = this.f2246M;
        if (qVar == null) {
            this.f2256R = null;
            G0();
            return null;
        }
        t tVar = this.f2264X;
        tVar.getClass();
        C7272n c7272n3 = this.f2248N;
        c7272n3.getClass();
        w3.g gVar3 = this.f2232F;
        w3.g gVar4 = this.f2234G;
        if (gVar3 != gVar4) {
            if (gVar4 != null && gVar3 != null && (c11 = gVar4.c()) != null && (c12 = gVar3.c()) != null && c11.getClass().equals(c12.getClass())) {
                if (c11 instanceof w3.p) {
                    if (gVar4.d().equals(gVar3.d())) {
                        UUID uuid = C7266h.f69065e;
                        if (!uuid.equals(gVar3.d()) && !uuid.equals(gVar4.d())) {
                            if (!tVar.f2374f) {
                                if (gVar4.getState() != 2) {
                                    if (gVar4.getState() == 3 || gVar4.getState() == 4) {
                                        String str2 = c7272n2.f69127o;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f2237H0) {
                this.f2233F0 = 1;
                this.f2235G0 = 3;
            } else {
                V0();
                G0();
            }
            return new C9738d(tVar.f2369a, c7272n3, c7272n2, 0, UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        boolean z11 = this.f2234G != this.f2232F;
        C9738d c02 = c0(tVar, c7272n3, c7272n2);
        int i12 = c02.f99026d;
        if (i12 != 0) {
            i11 = 16;
            if (i12 == 1) {
                if (k1(c7272n2)) {
                    this.f2248N = c7272n2;
                    if (z11) {
                        e0();
                    } else if (this.f2237H0) {
                        this.f2233F0 = 1;
                        this.f2235G0 = 1;
                    }
                }
                if (i12 != 0) {
                }
            }
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException();
                }
                if (k1(c7272n2)) {
                    this.f2248N = c7272n2;
                    if (z11) {
                        e0();
                    }
                }
                return (i12 != 0 || (this.f2246M == qVar && this.f2235G0 != 3)) ? c02 : new C9738d(tVar.f2369a, c7272n3, c7272n2, 0, i11);
            }
            if (k1(c7272n2)) {
                this.f2229D0 = true;
                this.f2231E0 = 1;
                this.f2268Z = false;
                this.f2248N = c7272n2;
                if (z11) {
                    e0();
                }
            }
            if (i12 != 0) {
            }
        }
        if (this.f2237H0) {
            this.f2233F0 = 1;
            this.f2235G0 = 3;
        } else {
            V0();
            G0();
        }
        i11 = 0;
        if (i12 != 0) {
        }
    }

    protected abstract void N0(C7272n c7272n, MediaFormat mediaFormat) throws C5449k;

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected void O() {
        this.f2228D = null;
        a1(d.f2291e);
        this.f2224B.clear();
        if (!this.f2223A0) {
            k0();
            return;
        }
        this.f2223A0 = false;
        this.f2243K0 = -9223372036854775807L;
        this.f2245L0 = -9223372036854775807L;
        this.f2260T0 = -9223372036854775807L;
        this.f2227C0 = false;
        this.f2284z.f();
        this.f2282y.f();
        this.f2225B0 = false;
        this.f2226C.b();
    }

    protected void O0(long j11) {
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected void P(boolean z11, boolean z12) throws C5449k {
        this.f2257R0 = new C9737c();
    }

    protected void P0(long j11) {
        this.f2260T0 = j11;
        while (true) {
            ArrayDeque<d> arrayDeque = this.f2224B;
            if (arrayDeque.isEmpty() || j11 < arrayDeque.peek().f2292a) {
                return;
            }
            d poll = arrayDeque.poll();
            poll.getClass();
            a1(poll);
            Q0();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected void Q(long j11, boolean z11) throws C5449k {
        this.f2247M0 = false;
        this.f2249N0 = false;
        this.f2253P0 = false;
        if (this.f2223A0) {
            this.f2243K0 = -9223372036854775807L;
            this.f2245L0 = -9223372036854775807L;
            this.f2260T0 = -9223372036854775807L;
            this.f2227C0 = false;
            this.f2284z.f();
            this.f2282y.f();
            this.f2225B0 = false;
            this.f2226C.b();
        } else {
            j0();
        }
        if (this.f2259S0.f2295d.i() > 0) {
            this.f2251O0 = true;
        }
        this.f2259S0.f2295d.b();
        this.f2224B.clear();
    }

    protected abstract void Q0();

    protected void R0(s3.f fVar) throws C5449k {
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected void T() {
        try {
            this.f2223A0 = false;
            this.f2243K0 = -9223372036854775807L;
            this.f2245L0 = -9223372036854775807L;
            this.f2260T0 = -9223372036854775807L;
            this.f2227C0 = false;
            this.f2284z.f();
            this.f2282y.f();
            this.f2225B0 = false;
            this.f2226C.b();
            V0();
            w3.g gVar = this.f2234G;
            if (gVar != null && gVar != null) {
                gVar.a(null);
            }
            this.f2234G = null;
        } catch (Throwable th2) {
            w3.g gVar2 = this.f2234G;
            if (gVar2 != null && gVar2 != null) {
                gVar2.a(null);
            }
            this.f2234G = null;
            throw th2;
        }
    }

    protected abstract boolean T0(long j11, long j12, q qVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, C7272n c7272n) throws C5449k;

    /* JADX WARN: Multi-variable type inference failed */
    protected final void V0() {
        try {
            q qVar = this.f2246M;
            if (qVar != null) {
                qVar.release();
                this.f2257R0.f99012b++;
                t tVar = this.f2264X;
                tVar.getClass();
                L0(tVar.f2369a);
            }
            this.f2246M = null;
            try {
                MediaCrypto mediaCrypto = this.f2238I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f2246M = null;
            try {
                MediaCrypto mediaCrypto2 = this.f2238I;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.AbstractC5444f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void W(C7272n[] c7272nArr, long j11, long j12, InterfaceC3018x.b bVar) throws C5449k {
        if (this.f2259S0.f2294c == -9223372036854775807L) {
            a1(new d(-9223372036854775807L, j11, j12));
            if (this.f2262V0) {
                Q0();
                return;
            }
            return;
        }
        ArrayDeque<d> arrayDeque = this.f2224B;
        if (arrayDeque.isEmpty()) {
            long j13 = this.f2243K0;
            if (j13 != -9223372036854775807L) {
                long j14 = this.f2260T0;
                if (j14 != -9223372036854775807L) {
                }
            }
            a1(new d(-9223372036854775807L, j11, j12));
            if (this.f2259S0.f2294c != -9223372036854775807L) {
                Q0();
                return;
            }
            return;
        }
        arrayDeque.add(new d(this.f2243K0, j11, j12));
    }

    protected abstract void W0() throws C5449k;

    protected void X0() {
        this.f2277v0 = -1;
        this.f2280x.f98184d = null;
        this.f2279w0 = -1;
        this.f2281x0 = null;
        this.f2243K0 = -9223372036854775807L;
        this.f2245L0 = -9223372036854775807L;
        this.f2260T0 = -9223372036854775807L;
        this.f2275u0 = -9223372036854775807L;
        this.f2239I0 = false;
        this.f2273t0 = -9223372036854775807L;
        this.f2237H0 = false;
        this.f2268Z = false;
        this.f2269r0 = false;
        this.f2283y0 = false;
        this.f2285z0 = false;
        this.f2233F0 = 0;
        this.f2235G0 = 0;
        this.f2231E0 = this.f2229D0 ? 1 : 0;
        this.f2263W0 = false;
        this.f2265X0 = -9223372036854775807L;
        this.f2267Y0 = -9223372036854775807L;
    }

    protected final void Y0() {
        X0();
        this.f2255Q0 = null;
        this.f2256R = null;
        this.f2264X = null;
        this.f2248N = null;
        this.f2250O = null;
        this.f2252P = false;
        this.f2241J0 = false;
        this.f2254Q = -1.0f;
        this.f2266Y = false;
        this.f2271s0 = false;
        this.f2229D0 = false;
        this.f2231E0 = 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.j0
    public boolean a() {
        return this.f2249N0;
    }

    protected final void b1() {
        this.f2253P0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0065 A[LOOP:1: B:31:0x0042->B:40:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[EDGE_INSN: B:41:0x0066->B:42:? BREAK  A[LOOP:1: B:31:0x0042->B:40:0x0065], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0084 A[LOOP:2: B:43:0x0066->B:52:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093 A[EDGE_INSN: B:53:0x0093->B:24:0x0093 BREAK  A[LOOP:2: B:43:0x0066->B:52:0x0084], SYNTHETIC] */
    @Override // androidx.media3.exoplayer.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(long j11, long j12) throws C5449k {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (this.f2253P0) {
            this.f2253P0 = false;
            S0();
        }
        C5449k c5449k = this.f2255Q0;
        if (c5449k != null) {
            this.f2255Q0 = null;
            throw c5449k;
        }
        try {
            if (this.f2249N0) {
                W0();
                return;
            }
            if (this.f2228D != null || U0(2)) {
                G0();
                if (this.f2223A0) {
                    while (b0(j11, j12)) {
                    }
                } else if (this.f2246M != null) {
                    F();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    while (f0(j11, j12)) {
                        long j13 = this.f2240J;
                        if (j13 != -9223372036854775807L) {
                            F();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j13) {
                                z12 = false;
                                if (z12) {
                                    break;
                                }
                            }
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                    while (h0()) {
                        long j14 = this.f2240J;
                        if (j14 != -9223372036854775807L) {
                            F();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j14) {
                                z11 = false;
                                if (z11) {
                                    break;
                                }
                            }
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                } else {
                    this.f2257R0.f99014d += Z(j11);
                    U0(1);
                }
                synchronized (this.f2257R0) {
                }
            }
        } catch (MediaCodec.CryptoException e11) {
            throw D(e11, this.f2228D, m3.N.y(e11.getErrorCode()));
        } catch (IllegalStateException e12) {
            boolean z14 = e12 instanceof MediaCodec.CodecException;
            if (!z14) {
                StackTraceElement[] stackTrace = e12.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e12;
                }
            }
            J0(e12);
            if (z14 && ((MediaCodec.CodecException) e12).isRecoverable()) {
                z13 = true;
            }
            if (z13) {
                V0();
            }
            s d02 = d0(e12, this.f2264X);
            throw E(d02, this.f2228D, z13, d02.f2368b == 1101 ? 4006 : 4003);
        }
    }

    protected abstract C9738d c0(t tVar, C7272n c7272n, C7272n c7272n2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c1(C5449k c5449k) {
        this.f2255Q0 = c5449k;
    }

    protected s d0(IllegalStateException illegalStateException, t tVar) {
        return new s(illegalStateException, tVar);
    }

    protected boolean d1(s3.f fVar) {
        return false;
    }

    @Override // androidx.media3.exoplayer.k0
    public final int e(C7272n c7272n) throws C5449k {
        try {
            return i1(this.f2272t, c7272n);
        } catch (M.b e11) {
            throw D(e11, c7272n, 4002);
        }
    }

    protected boolean e1() {
        return true;
    }

    protected boolean f1(t tVar) {
        return true;
    }

    public final void g0() {
        this.f2262V0 = true;
    }

    protected boolean g1() {
        int i11 = this.f2235G0;
        if (i11 == 3 || (this.f2266Y && !this.f2241J0)) {
            return true;
        }
        if (i11 != 2) {
            return false;
        }
        try {
            l1();
            return false;
        } catch (C5449k e11) {
            m3.s.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e11);
            return true;
        }
    }

    protected boolean h1(C7272n c7272n) {
        return false;
    }

    protected abstract int i1(E e11, C7272n c7272n) throws M.b;

    @Override // androidx.media3.exoplayer.j0
    public boolean isReady() {
        if (this.f2228D == null) {
            return false;
        }
        if (N() || this.f2279w0 >= 0) {
            return true;
        }
        if (this.f2275u0 == -9223372036854775807L) {
            return false;
        }
        F();
        return SystemClock.elapsedRealtime() < this.f2275u0;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.h0.b
    public void j(int i11, Object obj) throws C5449k {
        if (i11 == 11) {
            j0.a aVar = (j0.a) obj;
            aVar.getClass();
            this.f2236H = aVar;
        }
    }

    protected final void j0() throws C5449k {
        if (k0()) {
            G0();
        }
    }

    protected final void j1() throws C5449k {
        k1(this.f2248N);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q m0() {
        return this.f2246M;
    }

    protected final void m1(long j11) throws C5449k {
        C7272n g10 = this.f2259S0.f2295d.g(j11);
        if (g10 == null && this.f2261U0 && this.f2250O != null) {
            g10 = this.f2259S0.f2295d.f();
        }
        if (g10 != null) {
            this.f2230E = g10;
        } else if (!this.f2252P || this.f2230E == null) {
            return;
        }
        C7272n c7272n = this.f2230E;
        c7272n.getClass();
        N0(c7272n, this.f2250O);
        this.f2252P = false;
        this.f2261U0 = false;
    }

    protected int n0(s3.f fVar) {
        return 0;
    }

    protected final t o0() {
        return this.f2264X;
    }

    protected final C7272n p0() {
        return this.f2248N;
    }

    protected abstract float q0(float f7, C7272n c7272n, C7272n[] c7272nArr);

    protected final MediaFormat r0() {
        return this.f2250O;
    }

    protected abstract ArrayList s0(E e11, C7272n c7272n, boolean z11) throws M.b;

    protected long t0(long j11, long j12) {
        return super.w(j11, j12);
    }

    protected final long u0() {
        return this.f2245L0;
    }

    protected abstract q.a v0(t tVar, C7272n c7272n, MediaCrypto mediaCrypto, float f7);

    @Override // androidx.media3.exoplayer.j0
    public final long w(long j11, long j12) {
        return t0(j11, j12);
    }

    protected final long w0() {
        return this.f2259S0.f2294c;
    }

    protected final long x0() {
        return this.f2259S0.f2293b;
    }

    protected final float y0() {
        return this.f2242K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j0.a z0() {
        return this.f2236H;
    }

    public static class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f2286a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2287b;

        /* renamed from: c, reason: collision with root package name */
        public final t f2288c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2289d;

        public b(C7272n c7272n, M.b bVar, boolean z11, int i11) {
            this("Decoder init failed: [" + i11 + "], " + c7272n, bVar, c7272n.f69127o, z11, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i11 < 0 ? "neg_" : "") + Math.abs(i11));
        }

        static b a(b bVar) {
            return new b(bVar.getMessage(), bVar.getCause(), bVar.f2286a, bVar.f2287b, bVar.f2288c, bVar.f2289d);
        }

        public b(C7272n c7272n, Exception exc, boolean z11, t tVar) {
            this("Decoder init failed: " + tVar.f2369a + ", " + c7272n, exc, c7272n.f69127o, z11, tVar, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
        }

        private b(String str, Throwable th2, String str2, boolean z11, t tVar, String str3) {
            super(str, th2);
            this.f2286a = str2;
            this.f2287b = z11;
            this.f2288c = tVar;
            this.f2289d = str3;
        }
    }
}
