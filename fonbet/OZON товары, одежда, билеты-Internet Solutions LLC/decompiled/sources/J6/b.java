package J6;

import L6.b;
import L6.d;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes8.dex */
public abstract class b<R extends L6.d, W extends L6.b> {

    /* renamed from: s, reason: collision with root package name */
    private static final Rect f14128s = new Rect();

    /* renamed from: a, reason: collision with root package name */
    private final M6.c f14129a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f14130b;

    /* renamed from: c, reason: collision with root package name */
    protected ArrayList f14131c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    protected int f14132d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f14133e;

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f14134f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f14135g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f14136h;

    /* renamed from: i, reason: collision with root package name */
    protected int f14137i;

    /* renamed from: j, reason: collision with root package name */
    private final HashSet f14138j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f14139k;

    /* renamed from: l, reason: collision with root package name */
    protected WeakHashMap f14140l;

    /* renamed from: m, reason: collision with root package name */
    protected ByteBuffer f14141m;

    /* renamed from: n, reason: collision with root package name */
    protected volatile Rect f14142n;

    /* renamed from: o, reason: collision with root package name */
    private W f14143o;

    /* renamed from: p, reason: collision with root package name */
    private R f14144p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14145q;

    /* renamed from: r, reason: collision with root package name */
    private volatile i f14146r;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H6.b f14147a;

        a(H6.b bVar) {
            this.f14147a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            H6.b bVar = this.f14147a;
            if (((b) bVar).f14135g.get()) {
                return;
            }
            if (!bVar.p()) {
                bVar.K();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ((b) bVar).f14130b.postDelayed(this, Math.max(0L, bVar.J() - (System.currentTimeMillis() - currentTimeMillis)));
            Iterator it = ((b) bVar).f14134f.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(bVar.f14141m);
            }
        }
    }

    /* renamed from: J6.b$b, reason: collision with other inner class name */
    final class RunnableC0266b implements Runnable {
        RunnableC0266b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (bVar.f14134f.size() == 0) {
                bVar.K();
            }
        }
    }

    final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread f14149a;

        c(Thread thread) {
            this.f14149a = thread;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    if (b.this.f14142n == null) {
                        if (b.this.f14144p == null) {
                            b bVar = b.this;
                            bVar.f14144p = bVar.t(bVar.f14129a.a());
                        } else {
                            b.this.f14144p.reset();
                        }
                        b bVar2 = b.this;
                        bVar2.w(bVar2.B(bVar2.f14144p));
                    }
                    LockSupport.unpark(this.f14149a);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    b.this.f14142n = b.f14128s;
                    LockSupport.unpark(this.f14149a);
                }
            } catch (Throwable th2) {
                LockSupport.unpark(this.f14149a);
                throw th2;
            }
        }
    }

    final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.x();
        }
    }

    final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.y();
        }
    }

    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f14133e = 0;
            bVar.f14132d = -1;
            bVar.f14145q = false;
        }
    }

    final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14154a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14155b;

        g(int i11, boolean z11) {
            this.f14154a = i11;
            this.f14155b = z11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.y();
            try {
                bVar.f14137i = this.f14154a;
                bVar.w(bVar.B(bVar.t(bVar.f14129a.a())));
                if (this.f14155b) {
                    bVar.x();
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }

    public interface h {
        void a(ByteBuffer byteBuffer);

        void b();

        void onStart();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class i {
        private static final /* synthetic */ i[] $VALUES;
        public static final i FINISHING;
        public static final i IDLE;
        public static final i INITIALIZING;
        public static final i RUNNING;

        static {
            i iVar = new i("IDLE", 0);
            IDLE = iVar;
            i iVar2 = new i("RUNNING", 1);
            RUNNING = iVar2;
            i iVar3 = new i("INITIALIZING", 2);
            INITIALIZING = iVar3;
            i iVar4 = new i("FINISHING", 3);
            FINISHING = iVar4;
            $VALUES = new i[]{iVar, iVar2, iVar3, iVar4};
        }

        private i() {
            throw null;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) $VALUES.clone();
        }
    }

    public b(M6.c cVar, F6.a aVar) {
        HashSet hashSet = new HashSet();
        this.f14134f = hashSet;
        this.f14135g = new AtomicBoolean(true);
        this.f14136h = new a((H6.b) this);
        this.f14137i = 1;
        this.f14138j = new HashSet();
        this.f14139k = new Object();
        this.f14140l = new WeakHashMap();
        this.f14143o = v();
        this.f14144p = null;
        this.f14145q = false;
        this.f14146r = i.IDLE;
        this.f14129a = cVar;
        hashSet.add(aVar);
        this.f14130b = new Handler(K6.a.b().c(K6.a.b().a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long J() {
        J6.a<R, W> aVar;
        int i11 = this.f14132d + 1;
        this.f14132d = i11;
        if (i11 >= this.f14131c.size()) {
            this.f14132d = 0;
            this.f14133e++;
        }
        int i12 = this.f14132d;
        if (i12 >= 0) {
            ArrayList arrayList = this.f14131c;
            if (i12 < arrayList.size()) {
                aVar = (J6.a) arrayList.get(i12);
                if (aVar != null) {
                    return 0L;
                }
                F(aVar);
                return aVar.f14125f;
            }
        }
        aVar = null;
        if (aVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        if (!z() || this.f14131c.size() == 0) {
            return false;
        }
        if (s() <= 0 || this.f14133e < s() - 1 || (this.f14133e == s() - 1 && this.f14132d < this.f14131c.size() - 1)) {
            return true;
        }
        this.f14145q = true;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Rect rect) {
        this.f14142n = rect;
        int height = rect.height() * rect.width();
        int i11 = this.f14137i;
        this.f14141m = ByteBuffer.allocate(((height / (i11 * i11)) + 1) * 4);
        if (this.f14143o == null) {
            this.f14143o = v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f14135g.compareAndSet(true, false);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f14131c.size() == 0) {
                try {
                    R r11 = this.f14144p;
                    if (r11 == null) {
                        this.f14144p = t(this.f14129a.a());
                    } else {
                        r11.reset();
                    }
                    w(B(this.f14144p));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            Log.i("b", " Set state to RUNNING,cost " + (System.currentTimeMillis() - currentTimeMillis));
            this.f14146r = i.RUNNING;
            if (s() != 0 && this.f14145q) {
                Log.i("b", " No need to started");
                return;
            }
            this.f14132d = -1;
            ((a) this.f14136h).run();
            Iterator it = this.f14134f.iterator();
            while (it.hasNext()) {
                ((h) it.next()).onStart();
            }
        } catch (Throwable th3) {
            Log.i("b", " Set state to RUNNING,cost " + (System.currentTimeMillis() - currentTimeMillis));
            this.f14146r = i.RUNNING;
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.f14130b.removeCallbacks(this.f14136h);
        this.f14131c.clear();
        synchronized (this.f14139k) {
            try {
                Iterator it = this.f14138j.iterator();
                while (it.hasNext()) {
                    Bitmap bitmap = (Bitmap) it.next();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f14138j.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f14141m != null) {
            this.f14141m = null;
        }
        this.f14140l.clear();
        try {
            R r11 = this.f14144p;
            if (r11 != null) {
                r11.close();
                this.f14144p = null;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        D();
        this.f14146r = i.IDLE;
        Iterator it2 = this.f14134f.iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).b();
        }
    }

    protected final Bitmap A(int i11, int i12) {
        synchronized (this.f14139k) {
            try {
                Iterator it = this.f14138j.iterator();
                Bitmap bitmap = null;
                while (it.hasNext()) {
                    int i13 = i11 * i12 * 4;
                    Bitmap bitmap2 = (Bitmap) it.next();
                    if (bitmap2 != null && bitmap2.getAllocationByteCount() >= i13) {
                        it.remove();
                        if (bitmap2.getWidth() == i11) {
                            if (bitmap2.getHeight() != i12) {
                            }
                            bitmap2.eraseColor(0);
                            return bitmap2;
                        }
                        if (i11 > 0 && i12 > 0) {
                            bitmap2.reconfigure(i11, i12, Bitmap.Config.ARGB_8888);
                        }
                        bitmap2.eraseColor(0);
                        return bitmap2;
                    }
                    bitmap = bitmap2;
                }
                if (i11 <= 0 || i12 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } catch (OutOfMemoryError e12) {
                    e12.printStackTrace();
                }
                return bitmap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract Rect B(R r11) throws IOException;

    protected final void C(Bitmap bitmap) {
        synchronized (this.f14139k) {
            if (bitmap != null) {
                try {
                    this.f14138j.add(bitmap);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected abstract void D();

    public final void E(F6.a aVar) {
        this.f14130b.post(new J6.d(this, aVar));
    }

    protected abstract void F(J6.a<R, W> aVar);

    public final void G() {
        this.f14130b.post(new f());
    }

    public final int H(int i11, int i12) {
        int i13 = 1;
        if (i11 != 0 && i12 != 0) {
            int min = Math.min(q().width() / i11, q().height() / i12);
            while (true) {
                int i14 = i13 * 2;
                if (i14 > min) {
                    break;
                }
                i13 = i14;
            }
        }
        if (i13 != this.f14137i) {
            boolean z11 = z();
            Handler handler = this.f14130b;
            handler.removeCallbacks(this.f14136h);
            handler.post(new g(i13, z11));
        }
        return i13;
    }

    public final void I() {
        if (this.f14142n == f14128s) {
            return;
        }
        if (this.f14146r != i.RUNNING) {
            i iVar = this.f14146r;
            i iVar2 = i.INITIALIZING;
            if (iVar != iVar2) {
                if (this.f14146r == i.FINISHING) {
                    Log.e("b", " Processing,wait for finish at " + this.f14146r);
                }
                this.f14146r = iVar2;
                if (Looper.myLooper() == this.f14130b.getLooper()) {
                    x();
                    return;
                } else {
                    this.f14130b.post(new d());
                    return;
                }
            }
        }
        Log.i("b", " Already started");
    }

    public final void K() {
        if (this.f14142n == f14128s) {
            return;
        }
        i iVar = this.f14146r;
        i iVar2 = i.FINISHING;
        if (iVar == iVar2 || this.f14146r == i.IDLE) {
            Log.i("b", "No need to stop");
            return;
        }
        if (this.f14146r == i.INITIALIZING) {
            Log.e("b", "Processing,wait for finish at " + this.f14146r);
        }
        this.f14146r = iVar2;
        if (Looper.myLooper() == this.f14130b.getLooper()) {
            y();
        } else {
            this.f14130b.post(new e());
        }
    }

    public final void L() {
        this.f14130b.post(new RunnableC0266b());
    }

    public final void o(F6.a aVar) {
        this.f14130b.post(new J6.c(this, aVar));
    }

    public final Rect q() {
        if (this.f14142n == null) {
            if (this.f14146r == i.FINISHING) {
                Log.e("b", "In finishing,do not interrupt");
            }
            Thread currentThread = Thread.currentThread();
            this.f14130b.post(new c(currentThread));
            LockSupport.park(currentThread);
        }
        return this.f14142n == null ? f14128s : this.f14142n;
    }

    public final Bitmap r() throws IOException {
        if (this.f14146r != i.IDLE) {
            Log.e("b", ",stop first");
            return null;
        }
        this.f14146r = i.RUNNING;
        this.f14135g.compareAndSet(true, false);
        if (this.f14131c.size() == 0) {
            R r11 = this.f14144p;
            if (r11 == null) {
                this.f14144p = new I6.a(this.f14129a.a());
            } else {
                r11.reset();
            }
            w(B(this.f14144p));
        }
        this.f14132d = -1;
        while (this.f14132d < 0 && p()) {
            J();
        }
        this.f14141m.rewind();
        Bitmap createBitmap = Bitmap.createBitmap(q().width() / this.f14137i, q().height() / this.f14137i, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(this.f14141m);
        y();
        return createBitmap;
    }

    protected abstract int s();

    protected abstract I6.a t(L6.d dVar);

    public final int u() {
        return this.f14137i;
    }

    protected abstract I6.b v();

    public final boolean z() {
        return this.f14146r == i.RUNNING || this.f14146r == i.INITIALIZING;
    }
}
