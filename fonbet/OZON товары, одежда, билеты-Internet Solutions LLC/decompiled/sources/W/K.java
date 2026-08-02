package W;

import C.InterfaceC2694n;
import C.s0;
import Cm.RunnableC2781a;
import Ij.C3261b;
import W.AbstractC4847s;
import W.C4832c;
import W.C4836g;
import W.C4843n;
import W.K;
import W.K.b;
import W.K.c;
import W.K.d;
import W.Y;
import W.s0;
import W.t0;
import W.u0;
import Z.m;
import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5125w0;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.core.impl.S0;
import androidx.camera.core.impl.Y0;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import androidx.concurrent.futures.b;
import c0.C5694b;
import c0.C5695c;
import d0.AbstractC5990a;
import d0.C5995f;
import d0.C5996g;
import d0.InterfaceC5997h;
import d0.InterfaceC5999j;
import d0.InterfaceC6000k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final class K implements s0 {

    /* renamed from: e0, reason: collision with root package name */
    private static final Set<k> f32877e0 = Collections.unmodifiableSet(EnumSet.of(k.PENDING_RECORDING, k.PENDING_PAUSED));

    /* renamed from: f0, reason: collision with root package name */
    private static final Set<k> f32878f0 = Collections.unmodifiableSet(EnumSet.of(k.CONFIGURING, k.IDLING, k.RESETTING, k.STOPPING, k.ERROR));

    /* renamed from: g0, reason: collision with root package name */
    private static final u0 f32879g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final AbstractC4847s f32880h0;

    /* renamed from: i0, reason: collision with root package name */
    static final D3.h f32881i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final Executor f32882j0;

    /* renamed from: k0, reason: collision with root package name */
    static int f32883k0;

    /* renamed from: l0, reason: collision with root package name */
    static long f32884l0;

    /* renamed from: A, reason: collision with root package name */
    Surface f32885A;

    /* renamed from: B, reason: collision with root package name */
    MediaMuxer f32886B;

    /* renamed from: C, reason: collision with root package name */
    final C5125w0<AbstractC4847s> f32887C;

    /* renamed from: D, reason: collision with root package name */
    Z.m f32888D;

    /* renamed from: E, reason: collision with root package name */
    InterfaceC5999j f32889E;

    /* renamed from: F, reason: collision with root package name */
    B90.C f32890F;

    /* renamed from: G, reason: collision with root package name */
    d0.J f32891G;

    /* renamed from: H, reason: collision with root package name */
    B90.C f32892H;

    /* renamed from: I, reason: collision with root package name */
    g f32893I;

    /* renamed from: J, reason: collision with root package name */
    @NonNull
    Uri f32894J;

    /* renamed from: K, reason: collision with root package name */
    long f32895K;

    /* renamed from: L, reason: collision with root package name */
    long f32896L;

    /* renamed from: M, reason: collision with root package name */
    long f32897M;

    /* renamed from: N, reason: collision with root package name */
    long f32898N;

    /* renamed from: O, reason: collision with root package name */
    long f32899O;

    /* renamed from: P, reason: collision with root package name */
    long f32900P;

    /* renamed from: Q, reason: collision with root package name */
    long f32901Q;

    /* renamed from: R, reason: collision with root package name */
    long f32902R;

    /* renamed from: S, reason: collision with root package name */
    int f32903S;

    /* renamed from: T, reason: collision with root package name */
    InterfaceC5997h f32904T;

    /* renamed from: U, reason: collision with root package name */
    @NonNull
    final M.a f32905U;

    /* renamed from: V, reason: collision with root package name */
    Throwable f32906V;

    /* renamed from: W, reason: collision with root package name */
    boolean f32907W;

    /* renamed from: X, reason: collision with root package name */
    s0.a f32908X;

    /* renamed from: Y, reason: collision with root package name */
    ScheduledFuture<?> f32909Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f32910Z;

    /* renamed from: a, reason: collision with root package name */
    private final C5125w0<Y> f32911a;

    /* renamed from: a0, reason: collision with root package name */
    @NonNull
    r0 f32912a0;

    /* renamed from: b, reason: collision with root package name */
    private final C5125w0<Boolean> f32913b;

    /* renamed from: b0, reason: collision with root package name */
    r0 f32914b0;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f32915c;

    /* renamed from: c0, reason: collision with root package name */
    double f32916c0;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f32917d;

    /* renamed from: d0, reason: collision with root package name */
    private j f32918d0;

    /* renamed from: e, reason: collision with root package name */
    final Executor f32919e;

    /* renamed from: f, reason: collision with root package name */
    private final D3.h f32920f;

    /* renamed from: g, reason: collision with root package name */
    private final D3.h f32921g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f32922h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final boolean f32923i;

    /* renamed from: j, reason: collision with root package name */
    private k f32924j;

    /* renamed from: k, reason: collision with root package name */
    private k f32925k;

    /* renamed from: l, reason: collision with root package name */
    int f32926l;

    /* renamed from: m, reason: collision with root package name */
    C4840k f32927m;

    /* renamed from: n, reason: collision with root package name */
    C4840k f32928n;

    /* renamed from: o, reason: collision with root package name */
    private long f32929o;

    /* renamed from: p, reason: collision with root package name */
    i f32930p;

    /* renamed from: q, reason: collision with root package name */
    boolean f32931q;

    /* renamed from: r, reason: collision with root package name */
    private s0.d f32932r;

    /* renamed from: s, reason: collision with root package name */
    private s0.d f32933s;

    /* renamed from: t, reason: collision with root package name */
    private Y.f f32934t;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList f32935u;

    /* renamed from: v, reason: collision with root package name */
    Integer f32936v;

    /* renamed from: w, reason: collision with root package name */
    Integer f32937w;

    /* renamed from: x, reason: collision with root package name */
    C.s0 f32938x;

    /* renamed from: y, reason: collision with root package name */
    Y0 f32939y;

    /* renamed from: z, reason: collision with root package name */
    Surface f32940z;

    final class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z.m f32941a;

        a(Z.m mVar) {
            this.f32941a = mVar;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            C.S.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f32941a.hashCode())));
        }

        @Override // I.c
        public final void onSuccess(Void r22) {
            C.S.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f32941a.hashCode())));
        }
    }

    final class b implements InterfaceC6000k {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f32942b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f32943c;

        b(b.a aVar, i iVar) {
            this.f32942b = aVar;
            this.f32943c = iVar;
        }

        @Override // d0.InterfaceC6000k
        public final void a() {
            this.f32942b.c(null);
        }

        @Override // d0.InterfaceC6000k
        public final void b(@NonNull C5996g c5996g) {
            this.f32942b.e(c5996g);
        }

        @Override // d0.InterfaceC6000k
        public final void c(@NonNull B90.C c11) {
            K.this.f32890F = c11;
        }

        @Override // d0.InterfaceC6000k
        public final void d(@NonNull InterfaceC5997h interfaceC5997h) {
            boolean z11;
            K k11 = K.this;
            MediaMuxer mediaMuxer = k11.f32886B;
            i iVar = this.f32943c;
            if (mediaMuxer != null) {
                try {
                    k11.Y(interfaceC5997h, iVar);
                    interfaceC5997h.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        interfaceC5997h.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (k11.f32931q) {
                C.S.a("Recorder", "Drop video data since recording is stopping.");
                interfaceC5997h.close();
                return;
            }
            InterfaceC5997h interfaceC5997h2 = k11.f32904T;
            if (interfaceC5997h2 != null) {
                interfaceC5997h2.close();
                k11.f32904T = null;
                z11 = true;
            } else {
                z11 = false;
            }
            if (!interfaceC5997h.K()) {
                if (z11) {
                    C.S.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                C.S.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                k11.f32889E.b();
                interfaceC5997h.close();
                return;
            }
            k11.f32904T = interfaceC5997h;
            if (!k11.v() || !k11.f32905U.c()) {
                C.S.a("Recorder", "Received video keyframe. Starting muxer...");
                k11.N(iVar);
            } else if (z11) {
                C.S.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                C.S.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }
    }

    final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I f32945a;

        c(I i11) {
            this.f32945a = i11;
        }

        @Override // Z.m.a
        public final void a(boolean z11) {
            K k11 = K.this;
            if (k11.f32907W != z11) {
                k11.f32907W = z11;
                k11.V();
            } else {
                C.S.k("Recorder", "Audio source silenced transitions to the same state " + z11);
            }
        }

        @Override // Z.m.a
        public final void b(double d11) {
            K.this.f32916c0 = d11;
        }

        @Override // Z.m.a
        public final void onError(@NonNull Throwable th2) {
            C.S.d("Recorder", "Error occurred after audio source started.", th2);
            if (th2 instanceof Z.n) {
                this.f32945a.accept(th2);
            }
        }
    }

    final class d implements InterfaceC6000k {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f32947b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I f32948c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f32949d;

        d(b.a aVar, I i11, i iVar) {
            this.f32947b = aVar;
            this.f32948c = i11;
            this.f32949d = iVar;
        }

        @Override // d0.InterfaceC6000k
        public final void a() {
            this.f32947b.c(null);
        }

        @Override // d0.InterfaceC6000k
        public final void b(@NonNull C5996g c5996g) {
            if (K.this.f32906V == null) {
                this.f32948c.accept(c5996g);
            }
        }

        @Override // d0.InterfaceC6000k
        public final void c(@NonNull B90.C c11) {
            K.this.f32892H = c11;
        }

        @Override // d0.InterfaceC6000k
        public final void d(@NonNull InterfaceC5997h interfaceC5997h) {
            K k11 = K.this;
            if (k11.f32893I == g.DISABLED) {
                interfaceC5997h.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            MediaMuxer mediaMuxer = k11.f32886B;
            i iVar = this.f32949d;
            if (mediaMuxer != null) {
                try {
                    k11.X(interfaceC5997h, iVar);
                    interfaceC5997h.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        interfaceC5997h.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (k11.f32931q) {
                C.S.a("Recorder", "Drop audio data since recording is stopping.");
            } else {
                k11.f32905U.b(new C5995f(interfaceC5997h));
                if (k11.f32904T != null) {
                    C.S.a("Recorder", "Received audio data. Starting muxer...");
                    k11.N(iVar);
                } else {
                    C.S.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                }
            }
            interfaceC5997h.close();
        }
    }

    final class e implements I.c<List<Void>> {
        e() {
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            K k11 = K.this;
            x2.i.f("In-progress recording shouldn't be null", k11.f32930p != null);
            if (k11.f32930p.t()) {
                return;
            }
            C.S.a("Recorder", "Encodings end with error: " + th2);
            k11.q(k11.f32886B == null ? 8 : 6);
        }

        @Override // I.c
        public final void onSuccess(List<Void> list) {
            C.S.a("Recorder", "Encodings end successfully.");
            K k11 = K.this;
            k11.q(k11.f32903S);
        }
    }

    final class f implements InterfaceC5129y0.a<Boolean> {
        f() {
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0.a
        public final void a(Boolean bool) {
            K.this.f32913b.h(bool);
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0.a
        public final void onError(@NonNull Throwable th2) {
            K.this.f32913b.g(th2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class g {
        private static final /* synthetic */ g[] $VALUES;
        public static final g DISABLED;
        public static final g ENABLED;
        public static final g ERROR_ENCODER;
        public static final g ERROR_SOURCE;
        public static final g IDLING;
        public static final g INITIALIZING;

        static {
            g gVar = new g("INITIALIZING", 0);
            INITIALIZING = gVar;
            g gVar2 = new g("IDLING", 1);
            IDLING = gVar2;
            g gVar3 = new g("DISABLED", 2);
            DISABLED = gVar3;
            g gVar4 = new g("ENABLED", 3);
            ENABLED = gVar4;
            g gVar5 = new g("ERROR_ENCODER", 4);
            ERROR_ENCODER = gVar5;
            g gVar6 = new g("ERROR_SOURCE", 5);
            ERROR_SOURCE = gVar6;
            $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        }

        private g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC4847s.a f32953a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f32954b = null;

        /* renamed from: c, reason: collision with root package name */
        private D3.h f32955c;

        /* renamed from: d, reason: collision with root package name */
        private D3.h f32956d;

        public h() {
            D3.h hVar = K.f32881i0;
            this.f32955c = hVar;
            this.f32956d = hVar;
            C4836g.a aVar = new C4836g.a();
            aVar.e();
            Range<Integer> range = AbstractC4830a.f32997a;
            C4832c.a aVar2 = new C4832c.a();
            aVar2.f();
            aVar2.e();
            aVar2.c(-1);
            aVar2.b(AbstractC4830a.f32997a);
            aVar2.d(AbstractC4830a.f32998b);
            aVar.d(aVar2.a());
            Range<Integer> range2 = u0.f33137a;
            C4843n.a aVar3 = new C4843n.a();
            aVar3.c(u0.f33139c);
            aVar3.e(u0.f33137a);
            aVar3.d(u0.f33138b);
            aVar3.b(-1);
            aVar.c(aVar3.a());
            this.f32953a = aVar;
        }

        @NonNull
        public final K a() {
            return new K(this.f32954b, this.f32953a.a(), this.f32955c, this.f32956d);
        }

        @NonNull
        public final void b(@NonNull Executor executor) {
            x2.i.e(executor, "The specified executor can't be null.");
            this.f32954b = executor;
        }

        @NonNull
        public final void c(@NonNull A a11) {
            x2.i.e(a11, "The specified quality selector can't be null.");
            AbstractC4847s.a aVar = this.f32953a;
            u0.a e11 = aVar.b().e();
            e11.c(a11);
            aVar.c(e11.a());
        }
    }

    static abstract class i implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        private final G.d f32957a = G.d.b();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f32958b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final AtomicReference<d> f32959c = new AtomicReference<>(null);

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReference<c> f32960d = new AtomicReference<>(null);

        /* renamed from: e, reason: collision with root package name */
        private final AtomicReference<InterfaceC10646a<Uri>> f32961e = new AtomicReference<>(new P());

        /* renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f32962f = new AtomicBoolean(false);

        /* renamed from: g, reason: collision with root package name */
        @NonNull
        private final C5125w0<Boolean> f32963g = C5125w0.k(Boolean.FALSE);

        final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f32964a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4840k f32965b;

            a(C4840k c4840k, Context context) {
                this.f32965b = c4840k;
                this.f32964a = context;
            }

            @Override // W.K.i.c
            @NonNull
            public final Z.m a(@NonNull Z.a aVar, @NonNull Executor executor) throws Z.n {
                return new Z.m(aVar, executor, this.f32964a);
            }
        }

        final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4840k f32966a;

            b(C4840k c4840k) {
                this.f32966a = c4840k;
            }

            @Override // W.K.i.c
            @NonNull
            public final Z.m a(@NonNull Z.a aVar, @NonNull Executor executor) throws Z.n {
                return new Z.m(aVar, executor, null);
            }
        }

        private interface c {
            @NonNull
            Z.m a(@NonNull Z.a aVar, @NonNull Executor executor) throws Z.n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        interface d {
            @NonNull
            MediaMuxer a(int i11, @NonNull E e11) throws IOException;
        }

        i() {
        }

        private void d(InterfaceC10646a<Uri> interfaceC10646a, @NonNull Uri uri) {
            if (interfaceC10646a != null) {
                this.f32957a.a();
                interfaceC10646a.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        final void c(@NonNull Uri uri) {
            if (this.f32958b.get()) {
                d(this.f32961e.getAndSet(null), uri);
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            c(Uri.EMPTY);
        }

        protected final void finalize() throws Throwable {
            try {
                this.f32957a.d();
                InterfaceC10646a<Uri> andSet = this.f32961e.getAndSet(null);
                if (andSet != null) {
                    d(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        abstract Executor j();

        abstract InterfaceC10646a<t0> k();

        @NonNull
        abstract AbstractC4849u m();

        abstract long o();

        @NonNull
        final C5125w0 p() {
            return this.f32963g;
        }

        abstract boolean q();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v5, types: [W.N] */
        /* JADX WARN: Type inference failed for: r7v3, types: [W.M] */
        final void r(@NonNull final Context context) throws IOException {
            if (this.f32958b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final AbstractC4849u m11 = m();
            boolean z11 = m11 instanceof C4846q;
            O o11 = null;
            if (z11) {
                ((C4846q) m11).getClass();
                throw null;
            }
            this.f32957a.c("finalizeRecording");
            this.f32959c.set(new d() { // from class: W.L
                @Override // W.K.i.d
                public final MediaMuxer a(int i11, E e11) {
                    Uri uri = Uri.EMPTY;
                    AbstractC4849u abstractC4849u = AbstractC4849u.this;
                    if (!(abstractC4849u instanceof r)) {
                        if (abstractC4849u instanceof C4846q) {
                            throw null;
                        }
                        if (!(abstractC4849u instanceof C4848t)) {
                            throw new AssertionError("Invalid output options type: ".concat(abstractC4849u.getClass().getSimpleName()));
                        }
                        ((C4848t) abstractC4849u).getClass();
                        throw null;
                    }
                    File d11 = ((r) abstractC4849u).d();
                    File parentFile = d11.getParentFile();
                    if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
                        C.S.k("Recorder", "Failed to create folder for " + d11.getAbsolutePath());
                    }
                    MediaMuxer mediaMuxer = new MediaMuxer(d11.getAbsolutePath(), i11);
                    e11.f32863a.f32894J = Uri.fromFile(d11);
                    return mediaMuxer;
                }
            });
            if (q()) {
                int i11 = Build.VERSION.SDK_INT;
                AtomicReference<c> atomicReference = this.f32960d;
                if (i11 >= 31) {
                    atomicReference.set(new a((C4840k) this, context));
                } else {
                    atomicReference.set(new b((C4840k) this));
                }
            }
            if (m11 instanceof C4848t) {
                final C4848t c4848t = (C4848t) m11;
                o11 = Build.VERSION.SDK_INT >= 29 ? new InterfaceC10646a() { // from class: W.M
                    @Override // x2.InterfaceC10646a
                    public final void accept(Object obj) {
                        if (((Uri) obj).equals(Uri.EMPTY)) {
                            return;
                        }
                        new ContentValues().put("is_pending", (Integer) 0);
                        C4848t.this.getClass();
                        throw null;
                    }
                } : new InterfaceC10646a(context) { // from class: W.N
                    @Override // x2.InterfaceC10646a
                    public final void accept(Object obj) {
                        if (((Uri) obj).equals(Uri.EMPTY)) {
                            return;
                        }
                        C4848t.this.getClass();
                        throw null;
                    }
                };
            } else if (z11) {
                o11 = new O();
            }
            if (o11 != null) {
                this.f32961e.set(o11);
            }
        }

        final boolean s() {
            return this.f32962f.get();
        }

        abstract boolean t();

        @NonNull
        final Z.m v(@NonNull Z.a aVar, @NonNull Executor executor) throws Z.n {
            if (!q()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c andSet = this.f32960d.getAndSet(null);
            if (andSet != null) {
                return andSet.a(aVar, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        @NonNull
        final MediaMuxer w(int i11, @NonNull E e11) throws IOException {
            if (!this.f32958b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d andSet = this.f32959c.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.a(i11, e11);
            } catch (RuntimeException e12) {
                throw new IOException("Failed to create MediaMuxer by " + e12, e12);
            }
        }

        final void x(@NonNull final t0 t0Var) {
            String str;
            if (!Objects.equals(t0Var.a(), m())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + t0Var.a() + ", Expected: " + m() + "]");
            }
            String concat = "Sending VideoRecordEvent ".concat(t0Var.getClass().getSimpleName());
            boolean z11 = t0Var instanceof t0.a;
            if (z11) {
                t0.a aVar = (t0.a) t0Var;
                if (aVar.d()) {
                    StringBuilder e11 = C3261b.e(concat);
                    int c11 = aVar.c();
                    switch (c11) {
                        case 0:
                            str = "ERROR_NONE";
                            break;
                        case 1:
                            str = "ERROR_UNKNOWN";
                            break;
                        case 2:
                            str = "ERROR_FILE_SIZE_LIMIT_REACHED";
                            break;
                        case 3:
                            str = "ERROR_INSUFFICIENT_STORAGE";
                            break;
                        case 4:
                            str = "ERROR_SOURCE_INACTIVE";
                            break;
                        case 5:
                            str = "ERROR_INVALID_OUTPUT_OPTIONS";
                            break;
                        case 6:
                            str = "ERROR_ENCODING_FAILED";
                            break;
                        case 7:
                            str = "ERROR_RECORDER_ERROR";
                            break;
                        case 8:
                            str = "ERROR_NO_VALID_DATA";
                            break;
                        case 9:
                            str = "ERROR_DURATION_LIMIT_REACHED";
                            break;
                        case 10:
                            str = "ERROR_RECORDING_GARBAGE_COLLECTED";
                            break;
                        default:
                            str = T7.E.a(c11, "Unknown(", ")");
                            break;
                    }
                    e11.append(" [error: " + str + "]");
                    concat = e11.toString();
                }
            }
            C.S.a("Recorder", concat);
            boolean z12 = t0Var instanceof t0.d;
            C5125w0<Boolean> c5125w0 = this.f32963g;
            if (z12 || (t0Var instanceof t0.c)) {
                c5125w0.h(Boolean.TRUE);
            } else if ((t0Var instanceof t0.b) || z11) {
                c5125w0.h(Boolean.FALSE);
            }
            if (j() == null || k() == null) {
                return;
            }
            try {
                j().execute(new Runnable() { // from class: W.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.i.this.k().accept(t0Var);
                    }
                });
            } catch (RejectedExecutionException e12) {
                C.S.d("Recorder", "The callback executor is invalid.", e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class j {

        /* renamed from: a, reason: collision with root package name */
        private final C.s0 f32967a;

        /* renamed from: b, reason: collision with root package name */
        private final Y0 f32968b;

        /* renamed from: c, reason: collision with root package name */
        private final int f32969c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f32970d = false;

        /* renamed from: e, reason: collision with root package name */
        private int f32971e = 0;

        /* renamed from: f, reason: collision with root package name */
        private ScheduledFuture<?> f32972f = null;

        j(@NonNull C.s0 s0Var, @NonNull Y0 y02, int i11) {
            this.f32967a = s0Var;
            this.f32968b = y02;
            this.f32969c = i11;
        }

        static /* synthetic */ void c(j jVar) {
            jVar.f32971e++;
        }

        final void h() {
            if (this.f32970d) {
                return;
            }
            this.f32970d = true;
            ScheduledFuture<?> scheduledFuture = this.f32972f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f32972f = null;
            }
        }

        final void i() {
            StringBuilder sb2 = new StringBuilder("Try to safely release video encoder: ");
            K k11 = K.this;
            sb2.append(k11.f32889E);
            C.S.a("Recorder", sb2.toString());
            k11.f32912a0.o().a(new S(this, this.f32967a, this.f32968b), k11.f32919e);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class k {
        private static final /* synthetic */ k[] $VALUES;
        public static final k CONFIGURING;
        public static final k ERROR;
        public static final k IDLING;
        public static final k PAUSED;
        public static final k PENDING_PAUSED;
        public static final k PENDING_RECORDING;
        public static final k RECORDING;
        public static final k RESETTING;
        public static final k STOPPING;

        static {
            k kVar = new k("CONFIGURING", 0);
            CONFIGURING = kVar;
            k kVar2 = new k("PENDING_RECORDING", 1);
            PENDING_RECORDING = kVar2;
            k kVar3 = new k("PENDING_PAUSED", 2);
            PENDING_PAUSED = kVar3;
            k kVar4 = new k("IDLING", 3);
            IDLING = kVar4;
            k kVar5 = new k("RECORDING", 4);
            RECORDING = kVar5;
            k kVar6 = new k("PAUSED", 5);
            PAUSED = kVar6;
            k kVar7 = new k("STOPPING", 6);
            STOPPING = kVar7;
            k kVar8 = new k("RESETTING", 7);
            RESETTING = kVar8;
            k kVar9 = new k("ERROR", 8);
            ERROR = kVar9;
            $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9};
        }

        private k() {
            throw null;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) $VALUES.clone();
        }
    }

    static {
        C4852x c4852x = C4852x.f33149c;
        A b11 = A.b(Arrays.asList(c4852x, C4852x.f33148b, C4852x.f33147a), C4845p.a(c4852x));
        C4843n.a aVar = new C4843n.a();
        A a11 = u0.f33139c;
        aVar.c(a11);
        Range<Integer> range = u0.f33137a;
        aVar.e(range);
        Range<Integer> range2 = u0.f33138b;
        aVar.d(range2);
        aVar.b(-1);
        aVar.c(b11);
        aVar.b(-1);
        u0 a12 = aVar.a();
        f32879g0 = a12;
        C4836g.a aVar2 = new C4836g.a();
        aVar2.e();
        Range<Integer> range3 = AbstractC4830a.f32997a;
        C4832c.a aVar3 = new C4832c.a();
        aVar3.f();
        aVar3.e();
        aVar3.c(-1);
        aVar3.b(AbstractC4830a.f32997a);
        aVar3.d(AbstractC4830a.f32998b);
        aVar2.d(aVar3.a());
        C4843n.a aVar4 = new C4843n.a();
        aVar4.c(a11);
        aVar4.e(range);
        aVar4.d(range2);
        aVar4.b(-1);
        aVar2.c(aVar4.a());
        aVar2.e();
        aVar2.c(a12);
        f32880h0 = aVar2.a();
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f32881i0 = new D3.h();
        f32882j0 = H.c.g(H.c.d());
        f32883k0 = 3;
        f32884l0 = 1000L;
    }

    K(Executor executor, @NonNull AbstractC4847s abstractC4847s, @NonNull D3.h hVar, @NonNull D3.h hVar2) {
        this.f32923i = androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f32924j = k.CONFIGURING;
        this.f32925k = null;
        this.f32926l = 0;
        this.f32927m = null;
        this.f32928n = null;
        this.f32929o = 0L;
        this.f32930p = null;
        this.f32931q = false;
        this.f32932r = null;
        this.f32933s = null;
        this.f32934t = null;
        this.f32935u = new ArrayList();
        this.f32936v = null;
        this.f32937w = null;
        this.f32940z = null;
        this.f32885A = null;
        this.f32886B = null;
        this.f32888D = null;
        this.f32889E = null;
        this.f32890F = null;
        this.f32891G = null;
        this.f32892H = null;
        this.f32893I = g.INITIALIZING;
        this.f32894J = Uri.EMPTY;
        this.f32895K = 0L;
        this.f32896L = 0L;
        this.f32897M = Long.MAX_VALUE;
        this.f32898N = Long.MAX_VALUE;
        this.f32899O = Long.MAX_VALUE;
        this.f32900P = Long.MAX_VALUE;
        this.f32901Q = 0L;
        this.f32902R = 0L;
        this.f32903S = 1;
        this.f32904T = null;
        this.f32905U = new M.a(60, null);
        this.f32906V = null;
        this.f32907W = false;
        this.f32908X = s0.a.INACTIVE;
        this.f32909Y = null;
        this.f32910Z = false;
        this.f32914b0 = null;
        this.f32916c0 = 0.0d;
        this.f32918d0 = null;
        this.f32915c = executor;
        executor = executor == null ? H.c.d() : executor;
        this.f32917d = executor;
        Executor g10 = H.c.g(executor);
        this.f32919e = g10;
        C4836g.a aVar = new C4836g.a((C4836g) abstractC4847s);
        if (abstractC4847s.c().a() == -1) {
            u0.a e11 = aVar.b().e();
            e11.b(f32879g0.a());
            aVar.c(e11.a());
        }
        this.f32887C = C5125w0.k(aVar.a());
        int i11 = this.f32926l;
        Y.a u11 = u(this.f32924j);
        Y y11 = Y.f32993a;
        this.f32911a = C5125w0.k(new C4842m(i11, u11, null));
        this.f32913b = C5125w0.k(Boolean.FALSE);
        this.f32920f = hVar;
        this.f32921g = hVar2;
        this.f32912a0 = new r0(hVar, g10, executor);
    }

    private void D() {
        final Z.m mVar = this.f32888D;
        if (mVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f32888D = null;
        C.S.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(mVar.hashCode())));
        I.k.b(androidx.concurrent.futures.b.a(new b.c() { // from class: Z.d
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                m mVar2 = m.this;
                mVar2.f35238a.execute(new RunnableC2781a(3, mVar2, aVar));
                return "AudioSource-release";
            }
        }), new a(mVar), H.c.b());
    }

    private void F() {
        if (this.f32891G != null) {
            C.S.a("Recorder", "Releasing audio encoder.");
            this.f32891G.v();
            this.f32891G = null;
            this.f32892H = null;
        }
        if (this.f32888D != null) {
            D();
        }
        I(g.INITIALIZING);
        G();
    }

    private void G() {
        C.s0 s0Var;
        boolean z11 = true;
        if (this.f32889E != null) {
            C.S.a("Recorder", "Releasing video encoder.");
            r0 r0Var = this.f32914b0;
            if (r0Var != null) {
                x2.i.f(null, r0Var.l() == this.f32889E);
                C.S.a("Recorder", "Releasing video encoder: " + this.f32889E);
                this.f32914b0.p();
                this.f32914b0 = null;
                this.f32889E = null;
                this.f32890F = null;
                K(null);
            } else {
                C.S.a("Recorder", "Try to safely release video encoder: " + this.f32889E);
                this.f32912a0.o();
            }
        }
        synchronized (this.f32922h) {
            try {
                switch (this.f32924j.ordinal()) {
                    case 1:
                    case 2:
                        W(k.CONFIGURING);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (w()) {
                            z11 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        L(k.CONFIGURING);
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f32910Z = false;
        if (!z11 || (s0Var = this.f32938x) == null || s0Var.j()) {
            return;
        }
        p(this.f32938x, this.f32939y, false);
    }

    private void H() {
        if (f32877e0.contains(this.f32924j)) {
            L(this.f32925k);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.f32924j);
        }
    }

    private void M(int i11) {
        if (this.f32926l == i11) {
            return;
        }
        C.S.a("Recorder", "Transitioning streamId: " + this.f32926l + " --> " + i11);
        this.f32926l = i11;
        Y.a u11 = u(this.f32924j);
        s0.d dVar = this.f32932r;
        Y y11 = Y.f32993a;
        this.f32911a.h(new C4842m(i11, u11, dVar));
    }

    private void O(@NonNull i iVar) throws Z.n, d0.U {
        AbstractC4847s abstractC4847s = (AbstractC4847s) t(this.f32887C);
        c0.e a11 = C5694b.a(abstractC4847s, this.f32934t);
        Y0 y02 = Y0.UPTIME;
        AbstractC4830a a12 = abstractC4847s.a();
        InterfaceC5086c0.a c11 = a11.c();
        Z.a aVar = (Z.a) (c11 != null ? new c0.f(a12, c11) : new c0.g(a12)).get();
        if (this.f32888D != null) {
            D();
        }
        Z.m v11 = iVar.v(aVar, f32882j0);
        this.f32888D = v11;
        C.S.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(v11.hashCode())));
        AbstractC4830a a13 = abstractC4847s.a();
        InterfaceC5086c0.a c12 = a11.c();
        AbstractC5990a abstractC5990a = (AbstractC5990a) (c12 != null ? new C5695c(a11.a(), a11.b(), y02, a13, aVar, c12) : new c0.d(a11.a(), a11.b(), y02, a13, aVar)).get();
        this.f32921g.getClass();
        d0.J j11 = new d0.J(this.f32917d, abstractC5990a);
        this.f32891G = j11;
        InterfaceC5999j.b q11 = j11.q();
        if (!(q11 instanceof InterfaceC5999j.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.f32888D.k((InterfaceC5999j.a) q11);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Q(@NonNull i iVar, boolean z11) {
        if (this.f32930p != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        if (iVar.m().b() > 0) {
            this.f32901Q = Math.round(iVar.m().b() * 0.95d);
            C.S.a("Recorder", "File size limit in bytes: " + this.f32901Q);
        } else {
            this.f32901Q = 0L;
        }
        if (iVar.m().a() > 0) {
            this.f32902R = TimeUnit.MILLISECONDS.toNanos(iVar.m().a());
            C.S.a("Recorder", "Duration limit in nanoseconds: " + this.f32902R);
        } else {
            this.f32902R = 0L;
        }
        this.f32930p = iVar;
        int ordinal = this.f32893I.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                I(iVar.q() ? g.ENABLED : g.DISABLED);
            } else if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f32893I);
            }
        } else if (iVar.q()) {
            if (((AbstractC4847s) t(this.f32887C)).a().b() == 0) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (this.f32930p.t()) {
                    if (this.f32891G == null) {
                    }
                    I(g.ENABLED);
                }
                O(iVar);
                I(g.ENABLED);
            } catch (Z.n e11) {
                e = e11;
                C.S.d("Recorder", "Unable to create audio resource with error: ", e);
                I(!(e instanceof d0.U) ? g.ERROR_ENCODER : g.ERROR_SOURCE);
                this.f32906V = e;
                U(iVar, false);
                if (v()) {
                }
                this.f32889E.start();
                i iVar2 = this.f32930p;
                iVar2.x(new t0.d(iVar2.m(), s()));
                if (z11) {
                    return;
                } else {
                    return;
                }
            } catch (d0.U e12) {
                e = e12;
                C.S.d("Recorder", "Unable to create audio resource with error: ", e);
                I(!(e instanceof d0.U) ? g.ERROR_ENCODER : g.ERROR_SOURCE);
                this.f32906V = e;
                U(iVar, false);
                if (v()) {
                }
                this.f32889E.start();
                i iVar22 = this.f32930p;
                iVar22.x(new t0.d(iVar22.m(), s()));
                if (z11) {
                }
            }
        }
        U(iVar, false);
        if (v()) {
            this.f32888D.m(iVar.s());
            this.f32891G.start();
        }
        this.f32889E.start();
        i iVar222 = this.f32930p;
        iVar222.x(new t0.d(iVar222.m(), s()));
        if (z11 || this.f32930p != iVar || this.f32931q) {
            return;
        }
        if (v()) {
            this.f32891G.pause();
        }
        this.f32889E.pause();
        i iVar3 = this.f32930p;
        iVar3.x(new t0.b(iVar3.m(), s()));
    }

    private void U(@NonNull final i iVar, boolean z11) {
        ArrayList arrayList = this.f32935u;
        if (!arrayList.isEmpty()) {
            com.google.common.util.concurrent.m c11 = I.k.c(arrayList);
            if (!c11.isDone()) {
                c11.cancel(true);
            }
            arrayList.clear();
        }
        arrayList.add(androidx.concurrent.futures.b.a(new b.c() { // from class: W.G
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                K k11 = K.this;
                k11.f32889E.a(k11.new b(aVar, iVar), k11.f32919e);
                return "videoEncodingFuture";
            }
        }));
        if (v() && !z11) {
            arrayList.add(androidx.concurrent.futures.b.a(new b.c() { // from class: W.H
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar) {
                    K k11 = K.this;
                    k11.getClass();
                    I i11 = new I(k11, aVar);
                    Z.m mVar = k11.f32888D;
                    Executor executor = k11.f32919e;
                    mVar.j(executor, k11.new c(i11));
                    k11.f32891G.a(k11.new d(aVar, i11, iVar), executor);
                    return "audioEncodingFuture";
                }
            }));
        }
        I.k.b(I.k.c(arrayList), new e(), H.c.b());
    }

    private void W(@NonNull k kVar) {
        if (!f32877e0.contains(this.f32924j)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f32924j);
        }
        if (!f32878f0.contains(kVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + kVar);
        }
        if (this.f32925k != kVar) {
            this.f32925k = kVar;
            int i11 = this.f32926l;
            Y.a u11 = u(kVar);
            s0.d dVar = this.f32932r;
            Y y11 = Y.f32993a;
            this.f32911a.h(new C4842m(i11, u11, dVar));
        }
    }

    public static void h(K k11, C.s0 s0Var, Y0 y02) {
        C.s0 s0Var2 = k11.f32938x;
        if (s0Var2 != null && !s0Var2.j()) {
            k11.f32938x.n();
        }
        k11.f32938x = s0Var;
        k11.f32939y = y02;
        k11.p(s0Var, y02, true);
    }

    public static void i(K k11, s0.a aVar) {
        ScheduledFuture<?> scheduledFuture;
        InterfaceC5999j interfaceC5999j;
        s0.a aVar2 = k11.f32908X;
        k11.f32908X = aVar;
        if (aVar2 == aVar) {
            C.S.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        C.S.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != s0.a.INACTIVE) {
            if (aVar == s0.a.ACTIVE_NON_STREAMING && (scheduledFuture = k11.f32909Y) != null && scheduledFuture.cancel(false) && (interfaceC5999j = k11.f32889E) != null && (interfaceC5999j instanceof d0.J)) {
                ((d0.J) interfaceC5999j).B();
                return;
            }
            return;
        }
        if (k11.f32885A == null) {
            j jVar = k11.f32918d0;
            if (jVar != null) {
                jVar.h();
                k11.f32918d0 = null;
            }
            k11.E(false);
            return;
        }
        k11.f32910Z = true;
        i iVar = k11.f32930p;
        if (iVar == null || iVar.t()) {
            return;
        }
        k11.B(k11.f32930p, 4, null);
    }

    public static /* synthetic */ void j(K k11) {
        C.s0 s0Var = k11.f32938x;
        if (s0Var == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        k11.p(s0Var, k11.f32939y, false);
    }

    private void p(@NonNull C.s0 s0Var, @NonNull Y0 y02, boolean z11) {
        if (s0Var.j()) {
            C.S.k("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        s0Var.l(this.f32919e, new B90.T(this));
        Size g10 = s0Var.g();
        C.A e11 = s0Var.e();
        V v11 = new V((androidx.camera.core.impl.H) s0Var.c().b());
        C4852x d11 = v11.d(g10, e11);
        C.S.a("Recorder", "Using supported quality of " + d11 + " for surface size " + g10);
        if (d11 != C4852x.f33153g) {
            Y.f a11 = v11.a(d11, e11);
            this.f32934t = a11;
            if (a11 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        j jVar = this.f32918d0;
        if (jVar != null) {
            jVar.h();
        }
        j jVar2 = new j(s0Var, y02, z11 ? f32883k0 : 0);
        this.f32918d0 = jVar2;
        jVar2.i();
    }

    private void r(@NonNull i iVar, int i11) {
        Uri uri = Uri.EMPTY;
        iVar.c(uri);
        AbstractC4849u m11 = iVar.m();
        Throwable th2 = this.f32906V;
        int i12 = AbstractC4831b.f33002b;
        X d11 = X.d(0L, 0L, new C4833d(1, 0.0d, th2));
        x2.i.e(uri, "OutputUri cannot be null.");
        new C4837h(uri);
        x2.i.a("An error type is required.", i11 != 0);
        iVar.x(new t0.a(m11, d11, i11));
    }

    static Object t(@NonNull S0 s02) {
        try {
            return s02.b().get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @NonNull
    private static Y.a u(@NonNull k kVar) {
        return (kVar == k.RECORDING || (kVar == k.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? Y.a.ACTIVE : Y.a.INACTIVE;
    }

    private static boolean x(@NonNull W w11, C4840k c4840k) {
        return c4840k != null && w11.d() == c4840k.o();
    }

    @NonNull
    private i y(@NonNull k kVar) {
        boolean z11;
        if (kVar == k.PENDING_PAUSED) {
            z11 = true;
        } else {
            if (kVar != k.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z11 = false;
        }
        if (this.f32927m != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        C4840k c4840k = this.f32928n;
        if (c4840k == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f32927m = c4840k;
        c4840k.p().c(H.c.b(), new f());
        this.f32928n = null;
        if (z11) {
            L(k.PAUSED);
            return c4840k;
        }
        L(k.RECORDING);
        return c4840k;
    }

    final void A(Throwable th2) {
        C4840k c4840k;
        synchronized (this.f32922h) {
            try {
                c4840k = null;
                switch (this.f32924j.ordinal()) {
                    case 1:
                    case 2:
                        C4840k c4840k2 = this.f32928n;
                        this.f32928n = null;
                        c4840k = c4840k2;
                    case 0:
                        M(-1);
                        L(k.ERROR);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f32924j + ": " + th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c4840k != null) {
            r(c4840k, 7);
        }
    }

    final void B(@NonNull i iVar, int i11, Exception exc) {
        Throwable th2;
        if (iVar != this.f32930p) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f32922h) {
            try {
                try {
                    boolean z11 = false;
                    switch (this.f32924j.ordinal()) {
                        case 0:
                        case 3:
                        case 8:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f32924j);
                        case 4:
                        case 5:
                            try {
                                L(k.STOPPING);
                                z11 = true;
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        case 1:
                        case 2:
                        case 6:
                        case 7:
                            if (iVar != this.f32927m) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z11) {
                                S(iVar, -1L, i11, exc);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @NonNull
    public final C4851w C(@NonNull Context context, @NonNull r rVar) {
        return new C4851w(context, this, rVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    final void E(boolean z11) {
        boolean z12;
        boolean z13;
        synchronized (this.f32922h) {
            try {
                z12 = true;
                z13 = false;
                switch (this.f32924j.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        W(k.RESETTING);
                        break;
                    case 4:
                    case 5:
                        x2.i.f("In-progress recording shouldn't be null when in state " + this.f32924j, this.f32930p != null);
                        if (this.f32927m != this.f32930p) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!w()) {
                            L(k.RESETTING);
                            z13 = true;
                            z12 = false;
                        }
                        break;
                    case 6:
                        L(k.RESETTING);
                        z12 = false;
                        break;
                    case 7:
                    default:
                        z12 = false;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z12) {
            if (z13) {
                S(this.f32930p, -1L, 4, null);
            }
        } else if (z11) {
            G();
        } else {
            F();
        }
    }

    final void I(@NonNull g gVar) {
        C.S.a("Recorder", "Transitioning audio state: " + this.f32893I + " --> " + gVar);
        this.f32893I = gVar;
    }

    final void J(s0.d dVar) {
        C.S.a("Recorder", "Update stream transformation info: " + dVar);
        this.f32932r = dVar;
        synchronized (this.f32922h) {
            C5125w0<Y> c5125w0 = this.f32911a;
            int i11 = this.f32926l;
            Y.a u11 = u(this.f32924j);
            Y y11 = Y.f32993a;
            c5125w0.h(new C4842m(i11, u11, dVar));
        }
    }

    final void K(Surface surface) {
        int hashCode;
        if (this.f32940z == surface) {
            return;
        }
        this.f32940z = surface;
        synchronized (this.f32922h) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                hashCode = 0;
            }
            M(hashCode);
        }
    }

    final void L(@NonNull k kVar) {
        if (this.f32924j == kVar) {
            throw new AssertionError("Attempted to transition to state " + kVar + ", but Recorder is already in state " + kVar);
        }
        C.S.a("Recorder", "Transitioning Recorder internal state: " + this.f32924j + " --> " + kVar);
        Set<k> set = f32877e0;
        Y.a aVar = null;
        if (set.contains(kVar)) {
            if (!set.contains(this.f32924j)) {
                if (!f32878f0.contains(this.f32924j)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f32924j);
                }
                k kVar2 = this.f32924j;
                this.f32925k = kVar2;
                aVar = u(kVar2);
            }
        } else if (this.f32925k != null) {
            this.f32925k = null;
        }
        this.f32924j = kVar;
        if (aVar == null) {
            aVar = u(kVar);
        }
        int i11 = this.f32926l;
        s0.d dVar = this.f32932r;
        Y y11 = Y.f32993a;
        this.f32911a.h(new C4842m(i11, aVar, dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x0024, B:15:0x002f, B:17:0x0035, B:20:0x0043, B:25:0x0047, B:26:0x004f, B:28:0x0055, B:30:0x0065, B:34:0x0072, B:39:0x0093, B:41:0x00a4, B:45:0x00b3, B:53:0x00d0, B:54:0x00d9, B:56:0x00dd, B:57:0x00e7, B:70:0x00f1, B:78:0x0119, B:79:0x010f, B:80:0x011e, B:59:0x014b, B:61:0x0161, B:62:0x0171, B:63:0x017d, B:65:0x0183, B:83:0x0141, B:89:0x00c7, B:95:0x0191), top: B:13:0x0024, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x0024, B:15:0x002f, B:17:0x0035, B:20:0x0043, B:25:0x0047, B:26:0x004f, B:28:0x0055, B:30:0x0065, B:34:0x0072, B:39:0x0093, B:41:0x00a4, B:45:0x00b3, B:53:0x00d0, B:54:0x00d9, B:56:0x00dd, B:57:0x00e7, B:70:0x00f1, B:78:0x0119, B:79:0x010f, B:80:0x011e, B:59:0x014b, B:61:0x0161, B:62:0x0171, B:63:0x017d, B:65:0x0183, B:83:0x0141, B:89:0x00c7, B:95:0x0191), top: B:13:0x0024, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183 A[Catch: all -> 0x0061, LOOP:2: B:63:0x017d->B:65:0x0183, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x0024, B:15:0x002f, B:17:0x0035, B:20:0x0043, B:25:0x0047, B:26:0x004f, B:28:0x0055, B:30:0x0065, B:34:0x0072, B:39:0x0093, B:41:0x00a4, B:45:0x00b3, B:53:0x00d0, B:54:0x00d9, B:56:0x00dd, B:57:0x00e7, B:70:0x00f1, B:78:0x0119, B:79:0x010f, B:80:0x011e, B:59:0x014b, B:61:0x0161, B:62:0x0171, B:63:0x017d, B:65:0x0183, B:83:0x0141, B:89:0x00c7, B:95:0x0191), top: B:13:0x0024, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void N(@NonNull i iVar) {
        s0.d dVar;
        Location c11;
        Iterator it;
        if (this.f32886B != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        boolean v11 = v();
        M.a aVar = this.f32905U;
        if (v11 && aVar.c()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        InterfaceC5997h interfaceC5997h = this.f32904T;
        if (interfaceC5997h == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f32904T = null;
            long T11 = interfaceC5997h.T();
            ArrayList arrayList = new ArrayList();
            while (!aVar.c()) {
                InterfaceC5997h interfaceC5997h2 = (InterfaceC5997h) aVar.a();
                if (interfaceC5997h2.T() >= T11) {
                    arrayList.add(interfaceC5997h2);
                }
            }
            long size = interfaceC5997h.size();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                size += ((InterfaceC5997h) it2.next()).size();
            }
            long j11 = this.f32901Q;
            int i11 = 2;
            if (j11 != 0 && size > j11) {
                C.S.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f32901Q)));
                B(iVar, 2, null);
                interfaceC5997h.close();
                return;
            }
            try {
                AbstractC4847s abstractC4847s = (AbstractC4847s) t(this.f32887C);
                int i12 = 0;
                if (abstractC4847s.b() == -1) {
                    Y.f fVar = this.f32934t;
                    int i13 = f32880h0.b() != 1 ? 0 : 1;
                    if (fVar != null) {
                        int a11 = fVar.a();
                        if (a11 != 1) {
                            if (a11 != 2) {
                                if (a11 == 9) {
                                    i11 = 1;
                                }
                            }
                        }
                        MediaMuxer w11 = iVar.w(i11, new E(this));
                        dVar = this.f32933s;
                        if (dVar != null) {
                            J(dVar);
                            w11.setOrientationHint(dVar.b());
                        }
                        c11 = iVar.m().c();
                        if (c11 != null) {
                            try {
                                double latitude = c11.getLatitude();
                                double longitude = c11.getLongitude();
                                if (androidx.camera.video.internal.compat.quirk.a.b(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
                                    if (latitude < 0.0d) {
                                        latitude = ((latitude * 10000.0d) - 1.0d) / 10000.0d;
                                    }
                                    if (longitude < 0.0d) {
                                        longitude = ((longitude * 10000.0d) - 1.0d) / 10000.0d;
                                    }
                                }
                                Pair create = Pair.create(Double.valueOf(latitude), Double.valueOf(longitude));
                                w11.setLocation((float) ((Double) create.first).doubleValue(), (float) ((Double) create.second).doubleValue());
                            } catch (IllegalArgumentException e11) {
                                w11.release();
                                B(iVar, 5, e11);
                                interfaceC5997h.close();
                                return;
                            }
                        }
                        this.f32937w = Integer.valueOf(w11.addTrack((MediaFormat) this.f32890F.f3099a));
                        if (v()) {
                            this.f32936v = Integer.valueOf(w11.addTrack((MediaFormat) this.f32892H.f3099a));
                        }
                        w11.start();
                        this.f32886B = w11;
                        Y(interfaceC5997h, iVar);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            X((InterfaceC5997h) it.next(), iVar);
                        }
                        interfaceC5997h.close();
                    }
                    i11 = i13;
                    MediaMuxer w112 = iVar.w(i11, new E(this));
                    dVar = this.f32933s;
                    if (dVar != null) {
                    }
                    c11 = iVar.m().c();
                    if (c11 != null) {
                    }
                    this.f32937w = Integer.valueOf(w112.addTrack((MediaFormat) this.f32890F.f3099a));
                    if (v()) {
                    }
                    w112.start();
                    this.f32886B = w112;
                    Y(interfaceC5997h, iVar);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    interfaceC5997h.close();
                }
                if (abstractC4847s.b() == 1) {
                    i12 = 1;
                }
                i11 = i12;
                MediaMuxer w1122 = iVar.w(i11, new E(this));
                dVar = this.f32933s;
                if (dVar != null) {
                }
                c11 = iVar.m().c();
                if (c11 != null) {
                }
                this.f32937w = Integer.valueOf(w1122.addTrack((MediaFormat) this.f32890F.f3099a));
                if (v()) {
                }
                w1122.start();
                this.f32886B = w1122;
                Y(interfaceC5997h, iVar);
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                interfaceC5997h.close();
            } catch (IOException e12) {
                B(iVar, 5, e12);
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f2  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final W P(@NonNull C4851w c4851w) {
        C4840k c4840k;
        int i11;
        long j11;
        C4840k c4840k2;
        x2.i.e(c4851w, "The given PendingRecording cannot be null.");
        synchronized (this.f32922h) {
            try {
                long j12 = this.f32929o + 1;
                this.f32929o = j12;
                c4840k = null;
                i11 = 0;
                switch (this.f32924j.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        k kVar = this.f32924j;
                        k kVar2 = k.IDLING;
                        if (kVar == kVar2) {
                            x2.i.f("Expected recorder to be idle but a recording is either pending or in progress.", this.f32927m == null && this.f32928n == null);
                        }
                        try {
                            j11 = j12;
                            try {
                                C4840k c4840k3 = new C4840k(c4851w.e(), c4851w.d(), c4851w.c(), c4851w.g(), c4851w.h(), j11);
                                c4840k3.r(c4851w.b());
                                this.f32928n = c4840k3;
                                k kVar3 = this.f32924j;
                                if (kVar3 == kVar2) {
                                    L(k.PENDING_RECORDING);
                                    this.f32919e.execute(new Runnable() { // from class: W.B
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            K.this.T();
                                        }
                                    });
                                } else if (kVar3 == k.ERROR) {
                                    L(k.PENDING_RECORDING);
                                    this.f32919e.execute(new H.a(this, 3));
                                } else {
                                    L(k.PENDING_RECORDING);
                                }
                                e = null;
                            } catch (IOException e11) {
                                e = e11;
                                i11 = 5;
                                if (c4840k == null) {
                                }
                            }
                        } catch (IOException e12) {
                            e = e12;
                            j11 = j12;
                        }
                        break;
                    case 1:
                    case 2:
                        c4840k2 = this.f32928n;
                        c4840k2.getClass();
                        c4840k = c4840k2;
                        e = null;
                        j11 = j12;
                        break;
                    case 4:
                    case 5:
                        c4840k2 = this.f32927m;
                        c4840k = c4840k2;
                        e = null;
                        j11 = j12;
                        break;
                    default:
                        j11 = j12;
                        e = null;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c4840k == null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i11 == 0) {
            return new W(c4851w.f(), j11, c4851w.e(), false);
        }
        C.S.c("Recorder", "Recording was started when the Recorder had encountered error " + e);
        r(new C4840k(c4851w.e(), c4851w.d(), c4851w.c(), c4851w.g(), c4851w.h(), j11), i11);
        return new W(c4851w.f(), j11, c4851w.e(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void R(@NonNull W w11, int i11, RuntimeException runtimeException) {
        Throwable th2;
        final int i12;
        final RuntimeException runtimeException2;
        synchronized (this.f32922h) {
            try {
                try {
                    if (!x(w11, this.f32928n)) {
                        try {
                            if (!x(w11, this.f32927m)) {
                                C.S.a("Recorder", "stop() called on a recording that is no longer active: " + w11.c());
                                return;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    C4840k c4840k = null;
                    switch (this.f32924j.ordinal()) {
                        case 0:
                        case 3:
                            throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                        case 1:
                        case 2:
                            i12 = i11;
                            runtimeException2 = runtimeException;
                            x2.i.f(null, x(w11, this.f32928n));
                            C4840k c4840k2 = this.f32928n;
                            this.f32928n = null;
                            H();
                            c4840k = c4840k2;
                            if (c4840k != null) {
                                if (i12 == 10) {
                                    C.S.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                new RuntimeException("Recording was stopped before any data could be produced.", runtimeException2);
                                r(c4840k, 8);
                                return;
                            }
                            return;
                        case 4:
                        case 5:
                            L(k.STOPPING);
                            final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                            final C4840k c4840k3 = this.f32927m;
                            i12 = i11;
                            runtimeException2 = runtimeException;
                            this.f32919e.execute(new Runnable() { // from class: W.F
                                @Override // java.lang.Runnable
                                public final void run() {
                                    K.this.S(c4840k3, micros, i12, runtimeException2);
                                }
                            });
                            if (c4840k != null) {
                            }
                            break;
                        case 6:
                        case 7:
                            x2.i.f(null, x(w11, this.f32927m));
                        default:
                            i12 = i11;
                            runtimeException2 = runtimeException;
                            if (c4840k != null) {
                            }
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    final void S(@NonNull i iVar, long j11, int i11, Exception exc) {
        if (this.f32930p != iVar || this.f32931q) {
            return;
        }
        this.f32931q = true;
        this.f32903S = i11;
        if (v()) {
            while (true) {
                M.a aVar = this.f32905U;
                if (aVar.c()) {
                    break;
                } else {
                    aVar.a();
                }
            }
            this.f32891G.stop(j11);
        }
        InterfaceC5997h interfaceC5997h = this.f32904T;
        if (interfaceC5997h != null) {
            interfaceC5997h.close();
            this.f32904T = null;
        }
        if (this.f32908X != s0.a.ACTIVE_NON_STREAMING) {
            QI.b bVar = new QI.b(this.f32889E, 1);
            Executor executor = this.f32919e;
            this.f32909Y = H.c.e().schedule(new AB.a(2, executor, bVar), 1000L, TimeUnit.MILLISECONDS);
        } else {
            InterfaceC5999j interfaceC5999j = this.f32889E;
            if (interfaceC5999j instanceof d0.J) {
                ((d0.J) interfaceC5999j).B();
            }
        }
        this.f32889E.stop(j11);
    }

    final void T() {
        boolean z11;
        i iVar;
        int i11;
        C4840k c4840k;
        synchronized (this.f32922h) {
            try {
                int ordinal = this.f32924j.ordinal();
                boolean z12 = true;
                z11 = false;
                iVar = null;
                if (ordinal == 1) {
                    z12 = false;
                } else if (ordinal != 2) {
                    i11 = 0;
                    c4840k = null;
                }
                if (this.f32927m == null && !this.f32910Z) {
                    if (this.f32908X == s0.a.INACTIVE) {
                        C4840k c4840k2 = this.f32928n;
                        this.f32928n = null;
                        H();
                        boolean z13 = z12;
                        c4840k = c4840k2;
                        i11 = 4;
                        z11 = z13;
                    } else if (this.f32889E != null) {
                        iVar = y(this.f32924j);
                        i11 = 0;
                        z11 = z12;
                        c4840k = null;
                    }
                }
                i11 = 0;
                z11 = z12;
                c4840k = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iVar != null) {
            Q(iVar, z11);
        } else if (c4840k != null) {
            r(c4840k, i11);
        }
    }

    final void V() {
        i iVar = this.f32930p;
        if (iVar != null) {
            iVar.x(new t0.e(iVar.m(), s()));
        }
    }

    final void X(@NonNull InterfaceC5997h interfaceC5997h, @NonNull i iVar) {
        long size = interfaceC5997h.size() + this.f32895K;
        long j11 = this.f32901Q;
        if (j11 != 0 && size > j11) {
            C.S.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f32901Q)));
            B(iVar, 2, null);
            return;
        }
        long T11 = interfaceC5997h.T();
        long j12 = this.f32898N;
        if (j12 == Long.MAX_VALUE) {
            this.f32898N = T11;
            C.S.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(T11), Y.d.a(this.f32898N)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(T11 - Math.min(this.f32897M, j12));
            x2.i.f("There should be a previous data for adjusting the duration.", this.f32900P != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(T11 - this.f32900P) + nanos;
            long j13 = this.f32902R;
            if (j13 != 0 && nanos2 > j13) {
                C.S.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f32902R)));
                B(iVar, 9, null);
                return;
            }
        }
        this.f32886B.writeSampleData(this.f32936v.intValue(), interfaceC5997h.u(), interfaceC5997h.H());
        this.f32895K = size;
        this.f32900P = T11;
    }

    final void Y(@NonNull InterfaceC5997h interfaceC5997h, @NonNull i iVar) {
        if (this.f32937w == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = interfaceC5997h.size() + this.f32895K;
        long j11 = this.f32901Q;
        long j12 = 0;
        if (j11 != 0 && size > j11) {
            C.S.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f32901Q)));
            B(iVar, 2, null);
            return;
        }
        long T11 = interfaceC5997h.T();
        long j13 = this.f32897M;
        if (j13 == Long.MAX_VALUE) {
            this.f32897M = T11;
            C.S.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(T11), Y.d.a(this.f32897M)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            j12 = timeUnit.toNanos(T11 - Math.min(j13, this.f32898N));
            x2.i.f("There should be a previous data for adjusting the duration.", this.f32899O != Long.MAX_VALUE);
            long nanos = timeUnit.toNanos(T11 - this.f32899O) + j12;
            long j14 = this.f32902R;
            if (j14 != 0 && nanos > j14) {
                C.S.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos), Long.valueOf(this.f32902R)));
                B(iVar, 9, null);
                return;
            }
        }
        this.f32886B.writeSampleData(this.f32937w.intValue(), interfaceC5997h.u(), interfaceC5997h.H());
        this.f32895K = size;
        this.f32896L = j12;
        this.f32899O = T11;
        V();
    }

    @Override // W.s0
    public final void a(@NonNull C.s0 s0Var) {
        f(s0Var, Y0.UPTIME);
    }

    @Override // W.s0
    @NonNull
    public final InterfaceC5129y0<AbstractC4847s> b() {
        return this.f32887C;
    }

    @Override // W.s0
    @NonNull
    public final Z c(@NonNull InterfaceC2694n interfaceC2694n) {
        return new V((androidx.camera.core.impl.H) interfaceC2694n);
    }

    @Override // W.s0
    @NonNull
    public final InterfaceC5129y0<Y> d() {
        return this.f32911a;
    }

    @Override // W.s0
    public final void e(@NonNull s0.a aVar) {
        this.f32919e.execute(new GI.d(3, this, aVar));
    }

    @Override // W.s0
    public final void f(@NonNull C.s0 s0Var, @NonNull Y0 y02) {
        synchronized (this.f32922h) {
            try {
                C.S.a("Recorder", "Surface is requested in state: " + this.f32924j + ", Current surface: " + this.f32926l);
                if (this.f32924j == k.ERROR) {
                    L(k.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f32919e.execute(new D(this, s0Var, y02, 0));
    }

    @Override // W.s0
    @NonNull
    public final InterfaceC5129y0<Boolean> g() {
        return this.f32913b;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013c A[Catch: all -> 0x0106, TryCatch #1 {all -> 0x0106, blocks: (B:27:0x00d7, B:29:0x00db, B:30:0x00ea, B:35:0x0177, B:55:0x00f5, B:57:0x00f9, B:59:0x00ff, B:62:0x010a, B:65:0x0115, B:66:0x011f, B:67:0x0132, B:69:0x0136, B:71:0x013c, B:72:0x014a, B:74:0x014e, B:76:0x0154, B:79:0x015c, B:81:0x0164, B:83:0x0168, B:86:0x01a0, B:87:0x01a7), top: B:26:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a A[Catch: all -> 0x0106, TryCatch #1 {all -> 0x0106, blocks: (B:27:0x00d7, B:29:0x00db, B:30:0x00ea, B:35:0x0177, B:55:0x00f5, B:57:0x00f9, B:59:0x00ff, B:62:0x010a, B:65:0x0115, B:66:0x011f, B:67:0x0132, B:69:0x0136, B:71:0x013c, B:72:0x014a, B:74:0x014e, B:76:0x0154, B:79:0x015c, B:81:0x0164, B:83:0x0168, B:86:0x01a0, B:87:0x01a7), top: B:26:0x00d7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void q(int i11) {
        t0.a aVar;
        boolean z11;
        C4840k c4840k;
        int i12;
        int i13;
        if (this.f32930p == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.f32886B;
        int i14 = 1;
        i iVar = null;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f32886B.release();
            } catch (IllegalStateException e11) {
                C.S.c("Recorder", "MediaMuxer failed to stop or release with error: " + e11.getMessage());
                if (i11 == 0) {
                    i11 = 1;
                }
            }
            this.f32886B = null;
        } else if (i11 == 0) {
            i11 = 8;
        }
        this.f32930p.c(this.f32894J);
        AbstractC4849u m11 = this.f32930p.m();
        X s11 = s();
        Uri uri = this.f32894J;
        x2.i.e(uri, "OutputUri cannot be null.");
        new C4837h(uri);
        i iVar2 = this.f32930p;
        if (i11 == 0) {
            aVar = new t0.a(m11, s11, 0);
        } else {
            x2.i.a("An error type is required.", i11 != 0);
            aVar = new t0.a(m11, s11, i11);
        }
        iVar2.x(aVar);
        i iVar3 = this.f32930p;
        this.f32930p = null;
        this.f32931q = false;
        this.f32936v = null;
        this.f32937w = null;
        this.f32935u.clear();
        this.f32894J = Uri.EMPTY;
        this.f32895K = 0L;
        this.f32896L = 0L;
        this.f32897M = Long.MAX_VALUE;
        this.f32898N = Long.MAX_VALUE;
        this.f32899O = Long.MAX_VALUE;
        this.f32900P = Long.MAX_VALUE;
        this.f32903S = 1;
        this.f32906V = null;
        this.f32916c0 = 0.0d;
        while (true) {
            M.a aVar2 = this.f32905U;
            if (aVar2.c()) {
                break;
            } else {
                aVar2.a();
            }
        }
        J(null);
        int ordinal = this.f32893I.ordinal();
        if (ordinal == 1) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        if (ordinal == 2 || ordinal == 3) {
            I(g.IDLING);
            this.f32888D.n();
        } else if (ordinal == 4 || ordinal == 5) {
            I(g.INITIALIZING);
        }
        synchronized (this.f32922h) {
            try {
                C4840k c4840k2 = this.f32927m;
                if (c4840k2 != iVar3) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                c4840k2.p().f();
                this.f32927m = null;
                switch (this.f32924j.ordinal()) {
                    case 1:
                        z11 = false;
                        if (this.f32908X != s0.a.INACTIVE) {
                            C4840k c4840k3 = this.f32928n;
                            this.f32928n = null;
                            L(k.CONFIGURING);
                            i13 = 4;
                            i14 = 0;
                            c4840k = c4840k3;
                            i12 = 0;
                        } else if (this.f32923i) {
                            this.f32885A = null;
                            C.s0 s0Var = this.f32938x;
                            if (s0Var == null || s0Var.j()) {
                                i14 = 0;
                            }
                            W(k.CONFIGURING);
                            c4840k = null;
                            i12 = 0;
                            i13 = i12;
                        } else if (this.f32889E != null) {
                            c4840k = null;
                            i14 = 0;
                            i13 = 0;
                            iVar = y(this.f32924j);
                            i12 = 0;
                        } else {
                            c4840k = null;
                            i12 = 0;
                            i14 = i12;
                            i13 = i14;
                        }
                        break;
                    case 2:
                        z11 = true;
                        if (this.f32908X != s0.a.INACTIVE) {
                        }
                        break;
                    case 3:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.f32924j);
                    case 4:
                    case 5:
                    case 6:
                        if (this.f32923i) {
                            this.f32885A = null;
                            C.s0 s0Var2 = this.f32938x;
                            if (s0Var2 == null || s0Var2.j()) {
                                i14 = 0;
                            }
                            L(k.CONFIGURING);
                            c4840k = null;
                            z11 = false;
                            i12 = 0;
                            i13 = i12;
                            break;
                        } else {
                            L(k.IDLING);
                            c4840k = null;
                            z11 = false;
                            i12 = 0;
                            i14 = i12;
                            i13 = i14;
                        }
                        break;
                    case 7:
                        i12 = 1;
                        c4840k = null;
                        z11 = false;
                        i14 = 0;
                        i13 = i14;
                        break;
                    default:
                        c4840k = null;
                        z11 = false;
                        i12 = 0;
                        i14 = i12;
                        i13 = i14;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i14 != 0) {
            p(this.f32938x, this.f32939y, false);
            return;
        }
        if (i12 != 0) {
            F();
            return;
        }
        if (iVar != null) {
            if (this.f32923i) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            Q(iVar, z11);
        } else if (c4840k != null) {
            r(c4840k, i13);
        }
    }

    @NonNull
    final X s() {
        int i11;
        long j11 = this.f32896L;
        long j12 = this.f32895K;
        g gVar = this.f32893I;
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            i11 = 2;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    i11 = 4;
                    if (ordinal == 4) {
                        i11 = 3;
                    } else if (ordinal != 5) {
                        throw new AssertionError("Invalid internal audio state: " + gVar);
                    }
                } else {
                    i iVar = this.f32930p;
                    if (iVar != null && iVar.s()) {
                        i11 = 5;
                    } else if (!this.f32907W) {
                        i11 = 0;
                    }
                }
                Throwable th2 = this.f32906V;
                double d11 = this.f32916c0;
                int i12 = AbstractC4831b.f33002b;
                return X.d(j11, j12, new C4833d(i11, d11, th2));
            }
        }
        i11 = 1;
        Throwable th22 = this.f32906V;
        double d112 = this.f32916c0;
        int i122 = AbstractC4831b.f33002b;
        return X.d(j11, j12, new C4833d(i11, d112, th22));
    }

    final boolean v() {
        return this.f32893I == g.ENABLED;
    }

    final boolean w() {
        i iVar = this.f32930p;
        return iVar != null && iVar.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:5:0x000e, B:8:0x007b, B:23:0x0013, B:24:0x001f, B:27:0x0024, B:28:0x002b, B:30:0x002f, B:32:0x003c, B:33:0x004f, B:35:0x0053, B:39:0x005a, B:41:0x0060, B:42:0x0069, B:44:0x0073), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void z() {
        i iVar;
        boolean z11;
        boolean z12;
        C4840k c4840k;
        int i11;
        synchronized (this.f32922h) {
            try {
                iVar = null;
                z11 = false;
                switch (this.f32924j.ordinal()) {
                    case 0:
                        L(k.IDLING);
                        c4840k = null;
                        z12 = false;
                        i11 = 0;
                        break;
                    case 1:
                        z12 = false;
                        if (this.f32927m == null) {
                            c4840k = null;
                        } else if (this.f32908X == s0.a.INACTIVE) {
                            c4840k = this.f32928n;
                            this.f32928n = null;
                            H();
                            i11 = 4;
                            break;
                        } else {
                            iVar = y(this.f32924j);
                            c4840k = null;
                        }
                        i11 = 0;
                    case 2:
                        z12 = true;
                        if (this.f32927m == null) {
                        }
                        i11 = 0;
                        break;
                    case 3:
                    case 7:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.f32924j);
                    case 4:
                        z12 = false;
                        x2.i.f("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", w());
                        c4840k = null;
                        i11 = 0;
                        z11 = true;
                        break;
                    case 5:
                        z12 = true;
                        x2.i.f("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", w());
                        c4840k = null;
                        i11 = 0;
                        z11 = true;
                        break;
                    case 6:
                        if (!this.f32923i) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        c4840k = null;
                        z12 = false;
                        i11 = 0;
                        break;
                    case 8:
                        C.S.c("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                        c4840k = null;
                        z12 = false;
                        i11 = 0;
                        break;
                    default:
                        c4840k = null;
                        z12 = false;
                        i11 = 0;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            U(this.f32930p, true);
            this.f32889E.start();
            if (z12) {
                this.f32889E.pause();
                return;
            }
            return;
        }
        if (iVar != null) {
            Q(iVar, z12);
        } else if (c4840k != null) {
            r(c4840k, i11);
        }
    }
}
