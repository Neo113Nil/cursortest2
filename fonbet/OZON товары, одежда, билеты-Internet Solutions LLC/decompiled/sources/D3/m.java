package D3;

import D3.a;
import D3.q;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import m3.N;
import o3.InterfaceC8635b;
import q3.c;
import ru.ozon.app.android.video.manager.ExoManagerWithCacheImpl$downloadVideo$1$onPrepared$1;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final E3.a f5667h = new E3.a(1);

    /* renamed from: a, reason: collision with root package name */
    private final b f5668a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet<c> f5669b;

    /* renamed from: c, reason: collision with root package name */
    private int f5670c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5671d;

    /* renamed from: e, reason: collision with root package name */
    private int f5672e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5673f;

    /* renamed from: g, reason: collision with root package name */
    private List<D3.c> f5674g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final D3.c f5675a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5676b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f5677c;

        /* renamed from: d, reason: collision with root package name */
        public final Exception f5678d;

        public a(D3.c cVar, boolean z11, ArrayList arrayList, Exception exc) {
            this.f5675a = cVar;
            this.f5676b = z11;
            this.f5677c = arrayList;
            this.f5678d = exc;
        }
    }

    private static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final HandlerThread f5679a;

        /* renamed from: b, reason: collision with root package name */
        private final D3.a f5680b;

        /* renamed from: c, reason: collision with root package name */
        private final D3.b f5681c;

        /* renamed from: d, reason: collision with root package name */
        private final Handler f5682d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList<D3.c> f5683e;

        /* renamed from: f, reason: collision with root package name */
        private final HashMap<String, d> f5684f;

        /* renamed from: g, reason: collision with root package name */
        private int f5685g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f5686h;

        /* renamed from: i, reason: collision with root package name */
        private int f5687i;

        /* renamed from: j, reason: collision with root package name */
        private int f5688j;

        /* renamed from: k, reason: collision with root package name */
        private int f5689k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f5690l;

        public b(HandlerThread handlerThread, D3.a aVar, D3.b bVar, Handler handler) {
            super(handlerThread.getLooper());
            this.f5679a = handlerThread;
            this.f5680b = aVar;
            this.f5681c = bVar;
            this.f5682d = handler;
            this.f5687i = 3;
            this.f5688j = 5;
            this.f5686h = true;
            this.f5683e = new ArrayList<>();
            this.f5684f = new HashMap<>();
        }

        private static D3.c a(D3.c cVar, int i11, int i12) {
            return new D3.c(cVar.f5620a, i11, cVar.f5622c, System.currentTimeMillis(), cVar.f5624e, i12, 0, cVar.f5627h);
        }

        private D3.c b(String str, boolean z11) {
            int c11 = c(str);
            if (c11 != -1) {
                return this.f5683e.get(c11);
            }
            if (!z11) {
                return null;
            }
            try {
                return this.f5680b.e(str);
            } catch (IOException e11) {
                m3.s.d("DownloadManager", "Failed to load download: " + str, e11);
                return null;
            }
        }

        private int c(String str) {
            int i11 = 0;
            while (true) {
                ArrayList<D3.c> arrayList = this.f5683e;
                if (i11 >= arrayList.size()) {
                    return -1;
                }
                if (arrayList.get(i11).f5620a.f5702a.equals(str)) {
                    return i11;
                }
                i11++;
            }
        }

        private void d(D3.c cVar) {
            int i11 = cVar.f5621b;
            G10.a.h((i11 == 3 || i11 == 4) ? false : true);
            int c11 = c(cVar.f5620a.f5702a);
            ArrayList<D3.c> arrayList = this.f5683e;
            if (c11 == -1) {
                arrayList.add(cVar);
                Collections.sort(arrayList, new n());
            } else {
                boolean z11 = cVar.f5622c != arrayList.get(c11).f5622c;
                arrayList.set(c11, cVar);
                if (z11) {
                    Collections.sort(arrayList, new n());
                }
            }
            try {
                this.f5680b.k(cVar);
            } catch (IOException e11) {
                m3.s.d("DownloadManager", "Failed to update index.", e11);
            }
            this.f5682d.obtainMessage(3, new a(cVar, false, new ArrayList(arrayList), null)).sendToTarget();
        }

        private D3.c e(D3.c cVar, int i11, int i12) {
            G10.a.h((i11 == 3 || i11 == 4) ? false : true);
            D3.c a11 = a(cVar, i11, i12);
            d(a11);
            return a11;
        }

        private void f(D3.c cVar, int i11) {
            if (i11 == 0) {
                if (cVar.f5621b == 1) {
                    e(cVar, 0, 0);
                }
            } else if (i11 != cVar.f5625f) {
                int i12 = cVar.f5621b;
                if (i12 == 0 || i12 == 2) {
                    i12 = 1;
                }
                d(new D3.c(cVar.f5620a, i12, cVar.f5622c, System.currentTimeMillis(), cVar.f5624e, i11, 0, cVar.f5627h));
            }
        }

        private void g() {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList<D3.c> arrayList = this.f5683e;
                if (i11 >= arrayList.size()) {
                    return;
                }
                D3.c cVar = arrayList.get(i11);
                HashMap<String, d> hashMap = this.f5684f;
                d dVar = hashMap.get(cVar.f5620a.f5702a);
                D3.b bVar = this.f5681c;
                int i13 = cVar.f5621b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            dVar.getClass();
                            G10.a.h(!dVar.f5694d);
                            if (this.f5686h || this.f5685g != 0 || i12 >= this.f5687i) {
                                e(cVar, 0, 0);
                                dVar.f(false);
                            }
                        } else {
                            if (i13 != 5 && i13 != 7) {
                                throw new IllegalStateException();
                            }
                            if (dVar != null) {
                                if (!dVar.f5694d) {
                                    dVar.f(false);
                                }
                            } else if (!this.f5690l) {
                                p pVar = cVar.f5620a;
                                d dVar2 = new d(cVar.f5620a, bVar.a(pVar), cVar.f5627h, true, this.f5688j, this);
                                hashMap.put(pVar.f5702a, dVar2);
                                this.f5690l = true;
                                dVar2.start();
                            }
                        }
                    } else if (dVar != null) {
                        G10.a.h(!dVar.f5694d);
                        dVar.f(false);
                    }
                } else if (dVar != null) {
                    G10.a.h(!dVar.f5694d);
                    dVar.f(false);
                } else if (this.f5686h || this.f5685g != 0 || this.f5689k >= this.f5687i) {
                    dVar = null;
                } else {
                    D3.c e11 = e(cVar, 2, 0);
                    p pVar2 = e11.f5620a;
                    d dVar3 = new d(e11.f5620a, bVar.a(pVar2), e11.f5627h, false, this.f5688j, this);
                    hashMap.put(pVar2.f5702a, dVar3);
                    int i14 = this.f5689k;
                    this.f5689k = i14 + 1;
                    if (i14 == 0) {
                        sendEmptyMessageDelayed(12, 5000L);
                    }
                    dVar3.start();
                    dVar = dVar3;
                }
                if (dVar != null && !dVar.f5694d) {
                    i12++;
                }
                i11++;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            D3.d h11;
            D3.d dVar = null;
            int i11 = 0;
            r10 = 0;
            int i12 = 0;
            int i13 = 0;
            switch (message.what) {
                case 1:
                    int i14 = message.arg1;
                    D3.a aVar = this.f5680b;
                    ArrayList<D3.c> arrayList = this.f5683e;
                    this.f5685g = i14;
                    try {
                        try {
                            aVar.n();
                            dVar = aVar.h(0, 1, 2, 5, 7);
                        } catch (IOException e11) {
                            m3.s.d("DownloadManager", "Failed to load index.", e11);
                            arrayList.clear();
                        }
                        while (true) {
                            a.C0129a c0129a = (a.C0129a) dVar;
                            if (!c0129a.moveToPosition(c0129a.getPosition() + 1)) {
                                this.f5682d.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                                g();
                                i12 = 1;
                                this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                                return;
                            }
                            arrayList.add(((a.C0129a) dVar).V());
                        }
                    } finally {
                        N.g(dVar);
                    }
                case 2:
                    this.f5686h = message.arg1 != 0;
                    g();
                    i12 = 1;
                    this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                    return;
                case 3:
                    this.f5685g = message.arg1;
                    g();
                    i12 = 1;
                    this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                    return;
                case 4:
                    String str = (String) message.obj;
                    int i15 = message.arg1;
                    D3.a aVar2 = this.f5680b;
                    if (str == null) {
                        while (true) {
                            ArrayList<D3.c> arrayList2 = this.f5683e;
                            if (i13 < arrayList2.size()) {
                                f(arrayList2.get(i13), i15);
                                i13++;
                            } else {
                                try {
                                    aVar2.p(i15);
                                } catch (IOException e12) {
                                    m3.s.d("DownloadManager", "Failed to set manual stop reason", e12);
                                }
                            }
                        }
                    } else {
                        D3.c b11 = b(str, false);
                        if (b11 != null) {
                            f(b11, i15);
                        } else {
                            try {
                                aVar2.q(i15, str);
                            } catch (IOException e13) {
                                m3.s.d("DownloadManager", "Failed to set manual stop reason: ".concat(str), e13);
                            }
                        }
                    }
                    g();
                    i12 = 1;
                    this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                    return;
                case 5:
                    this.f5687i = message.arg1;
                    g();
                    i12 = 1;
                    this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                    return;
                case 6:
                    this.f5688j = message.arg1;
                    i12 = 1;
                    this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                    return;
                case 7:
                    p pVar = (p) message.obj;
                    int i16 = message.arg1;
                    D3.c b12 = b(pVar.f5702a, true);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (b12 != null) {
                        int i17 = b12.f5621b;
                        d(new D3.c(b12.f5620a.a(pVar), (i17 == 5 || i17 == 7) ? 7 : i16 != 0 ? 1 : 0, (i17 == 5 || i17 == 3 || i17 == 4) ? currentTimeMillis : b12.f5622c, currentTimeMillis, i16));
                    } else {
                        d(new D3.c(pVar, i16 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, i16));
                    }
                    g();
                    i12 = 1;
                    this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                    return;
                case 8:
                    String str2 = (String) message.obj;
                    D3.c b13 = b(str2, true);
                    if (b13 == null) {
                        m3.s.c("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        e(b13, 5, 0);
                        g();
                    }
                    i12 = 1;
                    this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                    return;
                case 9:
                    D3.a aVar3 = this.f5680b;
                    ArrayList arrayList3 = new ArrayList();
                    try {
                        h11 = aVar3.h(3, 4);
                    } catch (IOException unused) {
                        m3.s.c("DownloadManager", "Failed to load downloads.");
                    }
                    while (true) {
                        try {
                            a.C0129a c0129a2 = (a.C0129a) h11;
                            if (c0129a2.moveToPosition(c0129a2.getPosition() + 1)) {
                                arrayList3.add(((a.C0129a) h11).V());
                            } else {
                                ((a.C0129a) h11).close();
                                int i18 = 0;
                                while (true) {
                                    ArrayList<D3.c> arrayList4 = this.f5683e;
                                    if (i18 >= arrayList4.size()) {
                                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                            arrayList4.add(a((D3.c) arrayList3.get(i19), 5, 0));
                                        }
                                        Collections.sort(arrayList4, new n());
                                        try {
                                            aVar3.o();
                                        } catch (IOException e14) {
                                            m3.s.d("DownloadManager", "Failed to update index.", e14);
                                        }
                                        ArrayList arrayList5 = new ArrayList(arrayList4);
                                        for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                                            this.f5682d.obtainMessage(3, new a(arrayList4.get(i21), false, arrayList5, null)).sendToTarget();
                                        }
                                        g();
                                        i12 = 1;
                                        this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                                        return;
                                    }
                                    arrayList4.set(i18, a(arrayList4.get(i18), 5, 0));
                                    i18++;
                                }
                            }
                        } finally {
                        }
                    }
                case 10:
                    d dVar2 = (d) message.obj;
                    String str3 = dVar2.f5691a.f5702a;
                    this.f5684f.remove(str3);
                    boolean z11 = dVar2.f5694d;
                    if (z11) {
                        this.f5690l = false;
                    } else {
                        int i22 = this.f5689k - 1;
                        this.f5689k = i22;
                        if (i22 == 0) {
                            removeMessages(12);
                        }
                    }
                    if (dVar2.f5697g) {
                        g();
                    } else {
                        Exception exc = dVar2.f5698h;
                        if (exc != null) {
                            m3.s.d("DownloadManager", "Task failed: " + dVar2.f5691a + ", " + z11, exc);
                        }
                        D3.c b14 = b(str3, false);
                        b14.getClass();
                        Handler handler = this.f5682d;
                        D3.a aVar4 = this.f5680b;
                        ArrayList<D3.c> arrayList6 = this.f5683e;
                        int i23 = b14.f5621b;
                        if (i23 == 2) {
                            G10.a.h(!z11);
                            D3.c cVar = new D3.c(b14.f5620a, exc == null ? 3 : 4, b14.f5622c, System.currentTimeMillis(), b14.f5624e, b14.f5625f, exc == null ? 0 : 1, b14.f5627h);
                            arrayList6.remove(c(cVar.f5620a.f5702a));
                            try {
                                aVar4.k(cVar);
                            } catch (IOException e15) {
                                m3.s.d("DownloadManager", "Failed to update index.", e15);
                            }
                            handler.obtainMessage(3, new a(cVar, false, new ArrayList(arrayList6), exc)).sendToTarget();
                        } else {
                            if (i23 != 5 && i23 != 7) {
                                throw new IllegalStateException();
                            }
                            G10.a.h(z11);
                            if (i23 == 7) {
                                int i24 = b14.f5625f;
                                e(b14, i24 == 0 ? 0 : 1, i24);
                                g();
                            } else {
                                p pVar2 = b14.f5620a;
                                arrayList6.remove(c(pVar2.f5702a));
                                try {
                                    aVar4.m(pVar2.f5702a);
                                } catch (IOException unused2) {
                                    m3.s.c("DownloadManager", "Failed to remove from database");
                                }
                                handler.obtainMessage(3, new a(b14, true, new ArrayList(arrayList6), null)).sendToTarget();
                            }
                        }
                        g();
                    }
                    this.f5682d.obtainMessage(2, i12, this.f5684f.size()).sendToTarget();
                    return;
                case 11:
                    d dVar3 = (d) message.obj;
                    int i25 = message.arg1;
                    int i26 = message.arg2;
                    int i27 = N.f74289a;
                    long j11 = ((i25 & 4294967295L) << 32) | (4294967295L & i26);
                    D3.c b15 = b(dVar3.f5691a.f5702a, false);
                    b15.getClass();
                    if (j11 == b15.f5624e || j11 == -1) {
                        return;
                    }
                    d(new D3.c(b15.f5620a, b15.f5621b, b15.f5622c, System.currentTimeMillis(), j11, b15.f5625f, b15.f5626g, b15.f5627h));
                    return;
                case 12:
                    while (true) {
                        ArrayList<D3.c> arrayList7 = this.f5683e;
                        if (i11 >= arrayList7.size()) {
                            sendEmptyMessageDelayed(12, 5000L);
                            return;
                        }
                        D3.c cVar2 = arrayList7.get(i11);
                        if (cVar2.f5621b == 2) {
                            try {
                                this.f5680b.k(cVar2);
                            } catch (IOException e16) {
                                m3.s.d("DownloadManager", "Failed to update index.", e16);
                            }
                        }
                        i11++;
                    }
                case 13:
                    Iterator<d> it = this.f5684f.values().iterator();
                    while (it.hasNext()) {
                        it.next().f(true);
                    }
                    try {
                        this.f5680b.n();
                    } catch (IOException e17) {
                        m3.s.d("DownloadManager", "Failed to update index.", e17);
                    }
                    this.f5683e.clear();
                    this.f5679a.quit();
                    synchronized (this) {
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public interface c {
        default void onDownloadChanged(m mVar, D3.c cVar, Exception exc) {
        }

        default void onDownloadRemoved(m mVar, D3.c cVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends Thread implements q.a {

        /* renamed from: a, reason: collision with root package name */
        private final p f5691a;

        /* renamed from: b, reason: collision with root package name */
        private final q f5692b;

        /* renamed from: c, reason: collision with root package name */
        private final o f5693c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f5694d;

        /* renamed from: e, reason: collision with root package name */
        private final int f5695e;

        /* renamed from: f, reason: collision with root package name */
        private volatile b f5696f;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f5697g;

        /* renamed from: h, reason: collision with root package name */
        private Exception f5698h;

        /* renamed from: i, reason: collision with root package name */
        private long f5699i = -1;

        d(p pVar, q qVar, o oVar, boolean z11, int i11, b bVar) {
            this.f5691a = pVar;
            this.f5692b = qVar;
            this.f5693c = oVar;
            this.f5694d = z11;
            this.f5695e = i11;
            this.f5696f = bVar;
        }

        @Override // D3.q.a
        public final void a(long j11, long j12, float f7) {
            this.f5693c.f5700a = j12;
            this.f5693c.f5701b = f7;
            if (j11 != this.f5699i) {
                this.f5699i = j11;
                b bVar = this.f5696f;
                if (bVar != null) {
                    bVar.obtainMessage(11, (int) (j11 >> 32), (int) j11, this).sendToTarget();
                }
            }
        }

        public final void f(boolean z11) {
            if (z11) {
                this.f5696f = null;
            }
            if (this.f5697g) {
                return;
            }
            this.f5697g = true;
            this.f5692b.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f5694d) {
                    this.f5692b.remove();
                } else {
                    long j11 = -1;
                    int i11 = 0;
                    while (!this.f5697g) {
                        try {
                            this.f5692b.a(this);
                            break;
                        } catch (IOException e11) {
                            if (!this.f5697g) {
                                long j12 = this.f5693c.f5700a;
                                if (j12 != j11) {
                                    i11 = 0;
                                    j11 = j12;
                                }
                                int i12 = i11 + 1;
                                if (i12 > this.f5695e) {
                                    throw e11;
                                }
                                Thread.sleep(Math.min(i11 * 1000, 5000));
                                i11 = i12;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e12) {
                this.f5698h = e12;
            }
            b bVar = this.f5696f;
            if (bVar != null) {
                bVar.obtainMessage(10, this).sendToTarget();
            }
        }
    }

    public m(Context context, InterfaceC8635b interfaceC8635b, q3.q qVar, p3.p pVar, ExecutorService executorService) {
        D3.a aVar = new D3.a(interfaceC8635b);
        c.a aVar2 = new c.a();
        aVar2.f(qVar);
        aVar2.h(pVar);
        D3.b bVar = new D3.b(aVar2, executorService);
        context.getApplicationContext();
        this.f5671d = true;
        this.f5674g = Collections.EMPTY_LIST;
        this.f5669b = new CopyOnWriteArraySet<>();
        Handler q11 = N.q(new Handler.Callback() { // from class: D3.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                m.b(m.this, message);
                return true;
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar2 = new b(handlerThread, aVar, bVar, q11);
        this.f5668a = bVar2;
        int e11 = new E3.b(context, new l(this)).e();
        this.f5672e = e11;
        this.f5670c = 1;
        bVar2.obtainMessage(1, e11, 0).sendToTarget();
    }

    public static void a(m mVar, E3.b bVar, int i11) {
        mVar.getClass();
        bVar.getClass();
        if (mVar.f5672e != i11) {
            mVar.f5672e = i11;
            mVar.f5670c++;
            mVar.f5668a.obtainMessage(3, i11, 0).sendToTarget();
        }
        boolean g10 = mVar.g();
        Iterator<c> it = mVar.f5669b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (g10) {
            mVar.e();
        }
    }

    public static void b(m mVar, Message message) {
        mVar.getClass();
        int i11 = message.what;
        CopyOnWriteArraySet<c> copyOnWriteArraySet = mVar.f5669b;
        if (i11 == 1) {
            mVar.f5674g = Collections.unmodifiableList((List) message.obj);
            boolean g10 = mVar.g();
            Iterator<c> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (g10) {
                mVar.e();
                return;
            }
            return;
        }
        if (i11 == 2) {
            int i12 = message.arg1;
            int i13 = message.arg2;
            int i14 = mVar.f5670c - i12;
            mVar.f5670c = i14;
            if (i13 == 0 && i14 == 0) {
                Iterator<c> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
                return;
            }
            return;
        }
        if (i11 != 3) {
            throw new IllegalStateException();
        }
        a aVar = (a) message.obj;
        mVar.f5674g = Collections.unmodifiableList(aVar.f5677c);
        boolean g11 = mVar.g();
        boolean z11 = aVar.f5676b;
        D3.c cVar = aVar.f5675a;
        if (z11) {
            Iterator<c> it3 = copyOnWriteArraySet.iterator();
            while (it3.hasNext()) {
                it3.next().onDownloadRemoved(mVar, cVar);
            }
        } else {
            Iterator<c> it4 = copyOnWriteArraySet.iterator();
            while (it4.hasNext()) {
                it4.next().onDownloadChanged(mVar, cVar, aVar.f5678d);
            }
        }
        if (g11) {
            mVar.e();
        }
    }

    private void e() {
        Iterator<c> it = this.f5669b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    private boolean g() {
        boolean z11;
        if (!this.f5671d && this.f5672e != 0) {
            for (int i11 = 0; i11 < this.f5674g.size(); i11++) {
                if (this.f5674g.get(i11).f5621b == 0) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = this.f5673f != z11;
        this.f5673f = z11;
        return z12;
    }

    public final void c(p pVar) {
        this.f5670c++;
        this.f5668a.obtainMessage(7, 0, 0, pVar).sendToTarget();
    }

    public final void d(c cVar) {
        this.f5669b.add(cVar);
    }

    public final void f(ExoManagerWithCacheImpl$downloadVideo$1$onPrepared$1 exoManagerWithCacheImpl$downloadVideo$1$onPrepared$1) {
        this.f5669b.remove(exoManagerWithCacheImpl$downloadVideo$1$onPrepared$1);
    }
}
