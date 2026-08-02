package androidx.media3.exoplayer;

import androidx.media3.exoplayer.L;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5446h implements L {

    /* renamed from: a, reason: collision with root package name */
    private final J3.e f43845a;

    /* renamed from: b, reason: collision with root package name */
    private final long f43846b;

    /* renamed from: c, reason: collision with root package name */
    private final long f43847c;

    /* renamed from: d, reason: collision with root package name */
    private final long f43848d;

    /* renamed from: e, reason: collision with root package name */
    private final long f43849e;

    /* renamed from: f, reason: collision with root package name */
    private final int f43850f;

    /* renamed from: g, reason: collision with root package name */
    private final long f43851g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f43852h;

    /* renamed from: i, reason: collision with root package name */
    private final HashMap<u3.P, b> f43853i;

    /* renamed from: j, reason: collision with root package name */
    private long f43854j;

    /* renamed from: androidx.media3.exoplayer.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private J3.e f43855a;

        /* renamed from: b, reason: collision with root package name */
        private int f43856b = 50000;

        /* renamed from: c, reason: collision with root package name */
        private int f43857c = 50000;

        /* renamed from: d, reason: collision with root package name */
        private int f43858d = 1000;

        /* renamed from: e, reason: collision with root package name */
        private int f43859e = 2000;

        /* renamed from: f, reason: collision with root package name */
        private int f43860f = 0;

        /* renamed from: g, reason: collision with root package name */
        private boolean f43861g = false;

        /* renamed from: h, reason: collision with root package name */
        private boolean f43862h;

        public final C5446h a() {
            G10.a.h(!this.f43862h);
            this.f43862h = true;
            if (this.f43855a == null) {
                this.f43855a = new J3.e();
            }
            return new C5446h(this.f43855a, this.f43856b, this.f43857c, this.f43858d, this.f43859e, this.f43860f, this.f43861g);
        }

        public final void b(int i11) {
            G10.a.h(!this.f43862h);
            C5446h.l(i11, 0, "backBufferDurationMs", "0");
            this.f43860f = i11;
            this.f43861g = true;
        }

        public final void c(int i11, int i12, int i13, int i14) {
            G10.a.h(!this.f43862h);
            C5446h.l(i13, 0, "bufferForPlaybackMs", "0");
            C5446h.l(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
            C5446h.l(i11, i13, "minBufferMs", "bufferForPlaybackMs");
            C5446h.l(i11, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            C5446h.l(i12, i11, "maxBufferMs", "minBufferMs");
            this.f43856b = i11;
            this.f43857c = i12;
            this.f43858d = i13;
            this.f43859e = i14;
        }
    }

    /* renamed from: androidx.media3.exoplayer.h$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f43863a;

        /* renamed from: b, reason: collision with root package name */
        public int f43864b;

        private b() {
        }

        /* synthetic */ b(int i11) {
            this();
        }
    }

    protected C5446h(J3.e eVar, int i11, int i12, int i13, int i14, int i15, boolean z11) {
        l(i13, 0, "bufferForPlaybackMs", "0");
        l(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(i11, i13, "minBufferMs", "bufferForPlaybackMs");
        l(i11, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(i12, i11, "maxBufferMs", "minBufferMs");
        l(i15, 0, "backBufferDurationMs", "0");
        this.f43845a = eVar;
        this.f43846b = m3.N.Q(i11);
        this.f43847c = m3.N.Q(i12);
        this.f43848d = m3.N.Q(i13);
        this.f43849e = m3.N.Q(i14);
        this.f43850f = -1;
        this.f43851g = m3.N.Q(i15);
        this.f43852h = z11;
        this.f43853i = new HashMap<>();
        this.f43854j = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(int i11, int i12, String str, String str2) {
        G10.a.b(str + " cannot be less than " + str2, i11 >= i12);
    }

    @Override // androidx.media3.exoplayer.L
    public final boolean a() {
        return this.f43852h;
    }

    @Override // androidx.media3.exoplayer.L
    public final void b(u3.P p11) {
        long id2 = Thread.currentThread().getId();
        long j11 = this.f43854j;
        int i11 = 0;
        G10.a.g("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j11 == -1 || j11 == id2);
        this.f43854j = id2;
        HashMap<u3.P, b> hashMap = this.f43853i;
        if (!hashMap.containsKey(p11)) {
            hashMap.put(p11, new b(i11));
        }
        b bVar = hashMap.get(p11);
        bVar.getClass();
        int i12 = this.f43850f;
        if (i12 == -1) {
            i12 = 13107200;
        }
        bVar.f43864b = i12;
        bVar.f43863a = false;
    }

    @Override // androidx.media3.exoplayer.L
    public final boolean c(L.a aVar) {
        b bVar = this.f43853i.get(aVar.f43652a);
        bVar.getClass();
        boolean z11 = this.f43845a.c() >= m();
        float f7 = aVar.f43654c;
        long j11 = this.f43847c;
        long j12 = this.f43846b;
        if (f7 > 1.0f) {
            j12 = Math.min(m3.N.B(f7, j12), j11);
        }
        long max = Math.max(j12, 500000L);
        long j13 = aVar.f43653b;
        if (j13 < max) {
            bVar.f43863a = !z11;
            if (z11 && j13 < 500000) {
                m3.s.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j13 >= j11 || z11) {
            bVar.f43863a = false;
        }
        return bVar.f43863a;
    }

    @Override // androidx.media3.exoplayer.L
    public final boolean d() {
        Iterator<b> it = this.f43853i.values().iterator();
        while (it.hasNext()) {
            if (it.next().f43863a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.L
    public final void e(u3.P p11) {
        HashMap<u3.P, b> hashMap = this.f43853i;
        if (hashMap.remove(p11) != null) {
            boolean isEmpty = hashMap.isEmpty();
            J3.e eVar = this.f43845a;
            if (isEmpty) {
                eVar.f();
            } else {
                eVar.g(m());
            }
        }
    }

    @Override // androidx.media3.exoplayer.L
    public final void f(u3.P p11) {
        HashMap<u3.P, b> hashMap = this.f43853i;
        if (hashMap.remove(p11) != null) {
            boolean isEmpty = hashMap.isEmpty();
            J3.e eVar = this.f43845a;
            if (isEmpty) {
                eVar.f();
            } else {
                eVar.g(m());
            }
        }
        if (hashMap.isEmpty()) {
            this.f43854j = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.L
    public final boolean g(L.a aVar) {
        long D11 = m3.N.D(aVar.f43654c, aVar.f43653b);
        long j11 = aVar.f43655d ? this.f43849e : this.f43848d;
        long j12 = aVar.f43656e;
        if (j12 != -9223372036854775807L) {
            j11 = Math.min(j12 / 2, j11);
        }
        return j11 <= 0 || D11 >= j11 || this.f43845a.c() >= m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.L
    public final void h(L.a aVar, I3.y[] yVarArr) {
        HashMap<u3.P, b> hashMap = this.f43853i;
        b bVar = hashMap.get(aVar.f43652a);
        bVar.getClass();
        int i11 = this.f43850f;
        if (i11 == -1) {
            int length = yVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = 13107200;
                if (i12 < length) {
                    I3.y yVar = yVarArr[i12];
                    if (yVar != null) {
                        switch (yVar.g().f68964c) {
                            case -2:
                                i14 = 0;
                                i13 += i14;
                                break;
                            case -1:
                            case 1:
                                i13 += i14;
                                break;
                            case 0:
                                i14 = 144310272;
                                i13 += i14;
                                break;
                            case 2:
                                i14 = 131072000;
                                i13 += i14;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i14 = 131072;
                                i13 += i14;
                                break;
                            case 4:
                                i14 = 26214400;
                                i13 += i14;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i12++;
                } else {
                    i11 = Math.max(13107200, i13);
                }
            }
        }
        bVar.f43864b = i11;
        boolean isEmpty = hashMap.isEmpty();
        J3.e eVar = this.f43845a;
        if (isEmpty) {
            eVar.f();
        } else {
            eVar.g(m());
        }
    }

    @Override // androidx.media3.exoplayer.L
    public final long i() {
        return this.f43851g;
    }

    @Override // androidx.media3.exoplayer.L
    public final J3.e j() {
        return this.f43845a;
    }

    final int m() {
        Iterator<b> it = this.f43853i.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().f43864b;
        }
        return i11;
    }
}
