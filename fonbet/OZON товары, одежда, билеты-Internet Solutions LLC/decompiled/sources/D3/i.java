package D3;

import C.h0;
import D3.i;
import D3.p;
import F3.AbstractC2996a;
import F3.C3010o;
import F3.InterfaceC3017w;
import F3.InterfaceC3018x;
import F3.P;
import F3.d0;
import I3.AbstractC3228c;
import I3.B;
import I3.F;
import I3.n;
import I3.y;
import J3.d;
import N3.C3662m;
import N3.H;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.M;
import androidx.media3.exoplayer.k0;
import j3.AbstractC7252H;
import j3.C7275q;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.N;
import p3.InterfaceC8846f;
import p3.z;
import ru.ozon.app.android.video.manager.ExoManagerWithCacheImpl$downloadVideo$1;
import t3.C9739e;
import t3.C9740f;
import t3.InterfaceC9733E;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: p, reason: collision with root package name */
    public static final n.d f5633p;

    /* renamed from: a, reason: collision with root package name */
    private final C7275q.f f5634a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3018x f5635b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5636c;

    /* renamed from: d, reason: collision with root package name */
    private final I3.n f5637d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9733E f5638e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseIntArray f5639f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f5640g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5641h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5642i;

    /* renamed from: j, reason: collision with root package name */
    private ExoManagerWithCacheImpl$downloadVideo$1 f5643j;

    /* renamed from: k, reason: collision with root package name */
    private f f5644k;

    /* renamed from: l, reason: collision with root package name */
    private d0[] f5645l;

    /* renamed from: m, reason: collision with root package name */
    private B.a[] f5646m;

    /* renamed from: n, reason: collision with root package name */
    private List<y>[][] f5647n;

    /* renamed from: o, reason: collision with root package name */
    private List<y>[][] f5648o;

    public interface a {
        void onPrepareError(i iVar, IOException iOException);

        void onPrepared(i iVar, boolean z11);
    }

    private static final class b extends AbstractC3228c {

        private static final class a implements y.b {
            @Override // I3.y.b
            public final y[] a(y.a[] aVarArr, J3.d dVar) {
                y[] yVarArr = new y[aVarArr.length];
                for (int i11 = 0; i11 < aVarArr.length; i11++) {
                    y.a aVar = aVarArr[i11];
                    yVarArr[i11] = aVar == null ? null : new b(aVar.f11970a, aVar.f11971b);
                }
                return yVarArr;
            }
        }

        @Override // I3.y
        public final int getSelectedIndex() {
            return 0;
        }

        @Override // I3.y
        public final void n(long j11, long j12, long j13, List<? extends G3.d> list, G3.e[] eVarArr) {
        }

        @Override // I3.y
        public final Object p() {
            return null;
        }

        @Override // I3.y
        public final int r() {
            return 0;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC8846f.a f5649a;

        /* renamed from: b, reason: collision with root package name */
        private C9740f f5650b;

        /* renamed from: c, reason: collision with root package name */
        private n.d f5651c = i.f5633p;

        public final i a(C7275q c7275q) {
            InterfaceC3018x createMediaSource;
            C7275q.f fVar = c7275q.f69184b;
            fVar.getClass();
            boolean z11 = true;
            boolean z12 = N.J(fVar.f69240a, fVar.f69241b) == 4;
            if (!z12 && this.f5649a == null) {
                z11 = false;
            }
            G10.a.c(z11);
            if (z12 && this.f5649a == null) {
                createMediaSource = null;
            } else {
                InterfaceC8846f.a aVar = this.f5649a;
                C7275q.f fVar2 = c7275q.f69184b;
                fVar2.getClass();
                createMediaSource = (N.J(fVar2.f69240a, fVar2.f69241b) == 4 ? new P.b(aVar, new C3662m()) : new C3010o(aVar, N3.u.f18648a)).createMediaSource(c7275q);
            }
            n.d dVar = this.f5651c;
            C9740f c9740f = this.f5650b;
            return new i(c7275q, createMediaSource, dVar, c9740f != null ? new C9739e.a(c9740f).a() : new g(new k0[0]));
        }

        public final void b(InterfaceC8846f.a aVar) {
            this.f5649a = aVar;
        }

        public final void c(C9740f c9740f) {
            this.f5650b = c9740f;
        }

        public final void d(n.d dVar) {
            this.f5651c = dVar;
        }
    }

    private static final class d implements J3.d {
        @Override // J3.d
        public final long a() {
            return 0L;
        }

        @Override // J3.d
        public final void b(Handler handler, d.a aVar) {
        }

        @Override // J3.d
        public final z c() {
            return null;
        }

        @Override // J3.d
        public final void d(d.a aVar) {
        }
    }

    public static class e extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements InterfaceC3018x.c, P.c, InterfaceC3017w.a, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3018x f5652a;

        /* renamed from: b, reason: collision with root package name */
        private final i f5653b;

        /* renamed from: c, reason: collision with root package name */
        private final J3.e f5654c = new J3.e();

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList<InterfaceC3017w> f5655d = new ArrayList<>();

        /* renamed from: e, reason: collision with root package name */
        private final Handler f5656e = N.q(new Handler.Callback() { // from class: D3.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return i.f.d(i.f.this, message);
            }
        });

        /* renamed from: f, reason: collision with root package name */
        private final HandlerThread f5657f;

        /* renamed from: g, reason: collision with root package name */
        private final Handler f5658g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC7252H f5659h;

        /* renamed from: i, reason: collision with root package name */
        public H f5660i;

        /* renamed from: j, reason: collision with root package name */
        public InterfaceC3017w[] f5661j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f5662k;

        public f(InterfaceC3018x interfaceC3018x, i iVar) {
            this.f5652a = interfaceC3018x;
            this.f5653b = iVar;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f5657f = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f5658g = handler;
            handler.sendEmptyMessage(1);
        }

        public static boolean d(f fVar, Message message) {
            if (fVar.f5662k) {
                return false;
            }
            int i11 = message.what;
            i iVar = fVar.f5653b;
            if (i11 == 1) {
                try {
                    i.c(iVar);
                    return true;
                } catch (C5449k e11) {
                    fVar.f5656e.obtainMessage(2, new IOException(e11)).sendToTarget();
                    return true;
                }
            }
            if (i11 != 2) {
                return false;
            }
            fVar.f();
            Object obj = message.obj;
            int i12 = N.f74289a;
            i.d(iVar, (IOException) obj);
            return true;
        }

        @Override // F3.P.c
        public final void a(H h11) {
            this.f5660i = h11;
        }

        @Override // F3.InterfaceC3018x.c
        public final void b(AbstractC2996a abstractC2996a, AbstractC7252H abstractC7252H) {
            InterfaceC3017w[] interfaceC3017wArr;
            if (this.f5659h != null) {
                return;
            }
            if (abstractC7252H.getWindow(0, new AbstractC7252H.c()).a()) {
                this.f5656e.obtainMessage(2, new e()).sendToTarget();
                return;
            }
            this.f5659h = abstractC7252H;
            this.f5661j = new InterfaceC3017w[abstractC7252H.getPeriodCount()];
            int i11 = 0;
            while (true) {
                interfaceC3017wArr = this.f5661j;
                if (i11 >= interfaceC3017wArr.length) {
                    break;
                }
                InterfaceC3017w createPeriod = this.f5652a.createPeriod(new InterfaceC3018x.b(abstractC7252H.getUidOfPeriod(i11)), this.f5654c, 0L);
                this.f5661j[i11] = createPeriod;
                this.f5655d.add(createPeriod);
                i11++;
            }
            for (InterfaceC3017w interfaceC3017w : interfaceC3017wArr) {
                interfaceC3017w.prepare(this, 0L);
            }
        }

        @Override // F3.V.a
        public final void c(InterfaceC3017w interfaceC3017w) {
            InterfaceC3017w interfaceC3017w2 = interfaceC3017w;
            if (this.f5655d.contains(interfaceC3017w2)) {
                this.f5658g.obtainMessage(3, interfaceC3017w2).sendToTarget();
            }
        }

        @Override // F3.InterfaceC3017w.a
        public final void e(InterfaceC3017w interfaceC3017w) {
            ArrayList<InterfaceC3017w> arrayList = this.f5655d;
            arrayList.remove(interfaceC3017w);
            if (arrayList.isEmpty()) {
                this.f5658g.removeMessages(2);
                this.f5656e.sendEmptyMessage(1);
            }
        }

        public final void f() {
            if (this.f5662k) {
                return;
            }
            this.f5662k = true;
            this.f5658g.sendEmptyMessage(4);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            Handler handler = this.f5658g;
            InterfaceC3018x interfaceC3018x = this.f5652a;
            if (i11 == 1) {
                if (interfaceC3018x instanceof P) {
                    ((P) interfaceC3018x).d(this);
                }
                interfaceC3018x.prepareSource(this, null, u3.P.f99799d);
                handler.sendEmptyMessage(2);
                return true;
            }
            ArrayList<InterfaceC3017w> arrayList = this.f5655d;
            int i12 = 0;
            if (i11 == 2) {
                try {
                    if (this.f5661j == null) {
                        interfaceC3018x.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i12 < arrayList.size()) {
                            arrayList.get(i12).maybeThrowPrepareError();
                            i12++;
                        }
                    }
                    handler.sendEmptyMessageDelayed(2, 100L);
                    return true;
                } catch (IOException e11) {
                    this.f5656e.obtainMessage(2, e11).sendToTarget();
                }
            } else {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return false;
                    }
                    InterfaceC3017w[] interfaceC3017wArr = this.f5661j;
                    if (interfaceC3017wArr != null) {
                        int length = interfaceC3017wArr.length;
                        while (i12 < length) {
                            interfaceC3018x.releasePeriod(interfaceC3017wArr[i12]);
                            i12++;
                        }
                    }
                    if (interfaceC3018x instanceof P) {
                        ((P) interfaceC3018x).c();
                    }
                    interfaceC3018x.releaseSource(this);
                    handler.removeCallbacksAndMessages(null);
                    this.f5657f.quit();
                    return true;
                }
                InterfaceC3017w interfaceC3017w = (InterfaceC3017w) message.obj;
                if (arrayList.contains(interfaceC3017w)) {
                    M.a aVar = new M.a();
                    aVar.f(0L);
                    interfaceC3017w.continueLoading(aVar.d());
                    return true;
                }
            }
            return true;
        }
    }

    private static final class g implements InterfaceC9733E {

        /* renamed from: a, reason: collision with root package name */
        private final k0[] f5663a;

        g(k0[] k0VarArr) {
            this.f5663a = k0VarArr;
        }

        @Override // t3.InterfaceC9733E
        public final k0[] a() {
            return this.f5663a;
        }

        @Override // t3.InterfaceC9733E
        public final void release() {
        }

        @Override // t3.InterfaceC9733E
        public final int size() {
            return this.f5663a.length;
        }
    }

    static {
        n.d.a d11 = n.d.f11899X.d();
        d11.K();
        d11.k0();
        f5633p = d11.F();
    }

    public i(C7275q c7275q, InterfaceC3018x interfaceC3018x, n.d dVar, InterfaceC9733E interfaceC9733E) {
        C7275q.f fVar = c7275q.f69184b;
        fVar.getClass();
        this.f5634a = fVar;
        this.f5635b = interfaceC3018x;
        this.f5636c = interfaceC3018x == null ? 0 : interfaceC3018x instanceof P ? 1 : 2;
        I3.n nVar = new I3.n(dVar, new b.a());
        this.f5637d = nVar;
        this.f5638e = interfaceC9733E;
        this.f5639f = new SparseIntArray();
        nVar.d(new h(), new d());
        this.f5640g = N.q(null);
        new AbstractC7252H.c();
    }

    public static void a(i iVar, IOException iOException) {
        ExoManagerWithCacheImpl$downloadVideo$1 exoManagerWithCacheImpl$downloadVideo$1 = iVar.f5643j;
        exoManagerWithCacheImpl$downloadVideo$1.getClass();
        exoManagerWithCacheImpl$downloadVideo$1.onPrepareError(iVar, iOException);
    }

    public static void b(i iVar, boolean z11) {
        ExoManagerWithCacheImpl$downloadVideo$1 exoManagerWithCacheImpl$downloadVideo$1 = iVar.f5643j;
        exoManagerWithCacheImpl$downloadVideo$1.getClass();
        exoManagerWithCacheImpl$downloadVideo$1.onPrepared(iVar, z11);
    }

    static void c(final i iVar) throws C5449k {
        iVar.f5644k.getClass();
        iVar.f5644k.f5661j.getClass();
        iVar.f5644k.f5659h.getClass();
        final boolean z11 = true;
        int i11 = iVar.f5636c;
        if (i11 == 2) {
            int length = iVar.f5644k.f5661j.length;
            InterfaceC9733E interfaceC9733E = iVar.f5638e;
            int size = interfaceC9733E.size();
            iVar.f5647n = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            iVar.f5648o = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            for (int i12 = 0; i12 < length; i12++) {
                for (int i13 = 0; i13 < size; i13++) {
                    iVar.f5647n[i12][i13] = new ArrayList();
                    iVar.f5648o[i12][i13] = Collections.unmodifiableList(iVar.f5647n[i12][i13]);
                }
            }
            iVar.f5645l = new d0[length];
            iVar.f5646m = new B.a[length];
            for (int i14 = 0; i14 < length; i14++) {
                iVar.f5645l[i14] = iVar.f5644k.f5661j[i14].getTrackGroups();
                k0[] a11 = interfaceC9733E.a();
                d0 d0Var = iVar.f5645l[i14];
                InterfaceC3018x.b bVar = new InterfaceC3018x.b(iVar.f5644k.f5659h.getUidOfPeriod(i14));
                AbstractC7252H abstractC7252H = iVar.f5644k.f5659h;
                I3.n nVar = iVar.f5637d;
                F i15 = nVar.i(a11, d0Var, bVar, abstractC7252H);
                for (int i16 = 0; i16 < i15.f11822a; i16++) {
                    y yVar = i15.f11824c[i16];
                    if (yVar != null) {
                        List<y> list = iVar.f5647n[i14][i16];
                        int i17 = 0;
                        while (true) {
                            if (i17 >= list.size()) {
                                list.add(yVar);
                                break;
                            }
                            y yVar2 = list.get(i17);
                            if (yVar2.g().equals(yVar.g())) {
                                SparseIntArray sparseIntArray = iVar.f5639f;
                                sparseIntArray.clear();
                                for (int i18 = 0; i18 < yVar2.length(); i18++) {
                                    sparseIntArray.put(yVar2.c(i18), 0);
                                }
                                for (int i19 = 0; i19 < yVar.length(); i19++) {
                                    sparseIntArray.put(yVar.c(i19), 0);
                                }
                                int[] iArr = new int[sparseIntArray.size()];
                                for (int i21 = 0; i21 < sparseIntArray.size(); i21++) {
                                    iArr[i21] = sparseIntArray.keyAt(i21);
                                }
                                list.set(i17, new b(yVar2.g(), iArr));
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                nVar.g(i15.f11826e);
                B.a[] aVarArr = iVar.f5646m;
                B.a l11 = nVar.l();
                l11.getClass();
                aVarArr[i14] = l11;
            }
            iVar.f5641h = true;
            iVar.f5642i = true;
        } else {
            G10.a.h(i11 == 1);
            iVar.f5644k.f5660i.getClass();
            iVar.f5641h = true;
            z11 = false;
        }
        Handler handler = iVar.f5640g;
        handler.getClass();
        handler.post(new Runnable() { // from class: D3.e
            @Override // java.lang.Runnable
            public final void run() {
                i.b(i.this, z11);
            }
        });
    }

    static void d(i iVar, IOException iOException) {
        Handler handler = iVar.f5640g;
        handler.getClass();
        handler.post(new D3.f(0, iVar, iOException));
    }

    public final p e(byte[] bArr) {
        C7275q.f fVar = this.f5634a;
        p.b bVar = new p.b(fVar.f69240a, fVar.f69240a.toString());
        bVar.e(fVar.f69241b);
        C7275q.d dVar = fVar.f69242c;
        bVar.d(dVar != null ? dVar.c() : null);
        bVar.b(fVar.f69244e);
        bVar.c(bArr);
        int i11 = this.f5636c;
        if (i11 == 2) {
            G10.a.h(i11 == 2);
            G10.a.h(this.f5641h);
            G10.a.h(this.f5642i);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = this.f5647n.length;
            for (int i12 = 0; i12 < length; i12++) {
                arrayList2.clear();
                int length2 = this.f5647n[i12].length;
                for (int i13 = 0; i13 < length2; i13++) {
                    arrayList2.addAll(this.f5647n[i12][i13]);
                }
                arrayList.addAll(this.f5644k.f5661j[i12].d(arrayList2));
            }
            bVar.f(arrayList);
        }
        return bVar.a();
    }

    public final void f(ExoManagerWithCacheImpl$downloadVideo$1 exoManagerWithCacheImpl$downloadVideo$1) {
        G10.a.h(this.f5643j == null);
        this.f5643j = exoManagerWithCacheImpl$downloadVideo$1;
        if (this.f5636c == 0) {
            this.f5640g.post(new h0(1, this, exoManagerWithCacheImpl$downloadVideo$1));
            return;
        }
        InterfaceC3018x interfaceC3018x = this.f5635b;
        interfaceC3018x.getClass();
        this.f5644k = new f(interfaceC3018x, this);
    }

    public final void g() {
        f fVar = this.f5644k;
        if (fVar != null) {
            fVar.f();
        }
        this.f5637d.h();
        this.f5638e.release();
    }
}
