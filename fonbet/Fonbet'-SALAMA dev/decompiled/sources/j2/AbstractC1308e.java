package j2;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import v2.AbstractC1664a;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1308e implements InterfaceC1310g, D1.d {

    /* renamed from: A, reason: collision with root package name */
    public C1311h f14592A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f14593B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f14594C;

    /* renamed from: a, reason: collision with root package name */
    public final D1.j f14595a;

    /* renamed from: f, reason: collision with root package name */
    public final C1307d[] f14600f;

    /* renamed from: y, reason: collision with root package name */
    public int f14602y;

    /* renamed from: z, reason: collision with root package name */
    public D1.h f14603z;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14596b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f14597c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f14598d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final D1.h[] f14599e = new C1313j[2];

    /* renamed from: x, reason: collision with root package name */
    public int f14601x = 2;

    public AbstractC1308e() {
        C1307d[] c1307dArr = new C1307d[2];
        int i7 = 0;
        while (true) {
            if (i7 >= this.f14601x) {
                break;
            }
            this.f14599e[i7] = new C1313j(1);
            i7++;
        }
        this.f14600f = c1307dArr;
        this.f14602y = 2;
        for (int i8 = 0; i8 < this.f14602y; i8++) {
            this.f14600f[i8] = new C1307d(this, 1);
        }
        D1.j jVar = new D1.j(this);
        this.f14595a = jVar;
        jVar.start();
        int i9 = this.f14601x;
        D1.h[] hVarArr = this.f14599e;
        AbstractC1664a.h(i9 == hVarArr.length);
        for (D1.h hVar : hVarArr) {
            hVar.z(1024);
        }
    }

    @Override // D1.d
    public final C1307d b() {
        synchronized (this.f14596b) {
            try {
                C1311h c1311h = this.f14592A;
                if (c1311h != null) {
                    throw c1311h;
                }
                if (this.f14598d.isEmpty()) {
                    return null;
                }
                return (C1307d) this.f14598d.removeFirst();
            } finally {
            }
        }
    }

    @Override // D1.d
    public final Object c() {
        D1.h hVar;
        synchronized (this.f14596b) {
            try {
                C1311h c1311h = this.f14592A;
                if (c1311h != null) {
                    throw c1311h;
                }
                AbstractC1664a.h(this.f14603z == null);
                int i7 = this.f14601x;
                if (i7 == 0) {
                    hVar = null;
                } else {
                    D1.h[] hVarArr = this.f14599e;
                    int i8 = i7 - 1;
                    this.f14601x = i8;
                    hVar = hVarArr[i8];
                }
                this.f14603z = hVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // D1.d
    public final void d(C1313j c1313j) {
        synchronized (this.f14596b) {
            try {
                C1311h c1311h = this.f14592A;
                if (c1311h != null) {
                    throw c1311h;
                }
                AbstractC1664a.f(c1313j == this.f14603z);
                this.f14597c.addLast(c1313j);
                if (!this.f14597c.isEmpty() && this.f14602y > 0) {
                    this.f14596b.notify();
                }
                this.f14603z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract InterfaceC1309f e(byte[] bArr, int i7, boolean z4);

    public final C1311h f(D1.h hVar, C1307d c1307d, boolean z4) {
        C1313j c1313j = (C1313j) hVar;
        try {
            ByteBuffer byteBuffer = c1313j.f1697d;
            byteBuffer.getClass();
            c1307d.y(c1313j.f1699f, e(byteBuffer.array(), byteBuffer.limit(), z4), c1313j.f14605z);
            c1307d.f1675b &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            return null;
        } catch (C1311h e7) {
            return e7;
        }
    }

    @Override // D1.d
    public final void flush() {
        synchronized (this.f14596b) {
            try {
                this.f14593B = true;
                D1.h hVar = this.f14603z;
                if (hVar != null) {
                    hVar.t();
                    int i7 = this.f14601x;
                    this.f14601x = i7 + 1;
                    this.f14599e[i7] = hVar;
                    this.f14603z = null;
                }
                while (!this.f14597c.isEmpty()) {
                    D1.h hVar2 = (D1.h) this.f14597c.removeFirst();
                    hVar2.t();
                    int i8 = this.f14601x;
                    this.f14601x = i8 + 1;
                    this.f14599e[i8] = hVar2;
                }
                while (!this.f14598d.isEmpty()) {
                    ((C1307d) this.f14598d.removeFirst()).t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        C1311h c1311h;
        C1311h c1311h2;
        synchronized (this.f14596b) {
            while (!this.f14594C) {
                try {
                    if (!this.f14597c.isEmpty() && this.f14602y > 0) {
                        break;
                    }
                    this.f14596b.wait();
                } finally {
                }
            }
            if (this.f14594C) {
                return false;
            }
            D1.h hVar = (D1.h) this.f14597c.removeFirst();
            C1307d[] c1307dArr = this.f14600f;
            int i7 = this.f14602y - 1;
            this.f14602y = i7;
            C1307d c1307d = c1307dArr[i7];
            boolean z4 = this.f14593B;
            this.f14593B = false;
            if (hVar.f(4)) {
                c1307d.b(4);
            } else {
                if (hVar.f(Integer.MIN_VALUE)) {
                    c1307d.b(Integer.MIN_VALUE);
                }
                if (hVar.f(134217728)) {
                    c1307d.b(134217728);
                }
                try {
                    c1311h2 = f(hVar, c1307d, z4);
                } catch (OutOfMemoryError e7) {
                    c1311h = new C1311h("Unexpected decode error", e7);
                    c1311h2 = c1311h;
                    if (c1311h2 != null) {
                    }
                    synchronized (this.f14596b) {
                    }
                } catch (RuntimeException e8) {
                    c1311h = new C1311h("Unexpected decode error", e8);
                    c1311h2 = c1311h;
                    if (c1311h2 != null) {
                    }
                    synchronized (this.f14596b) {
                    }
                }
                if (c1311h2 != null) {
                    synchronized (this.f14596b) {
                        this.f14592A = c1311h2;
                    }
                    return false;
                }
            }
            synchronized (this.f14596b) {
                try {
                    if (this.f14593B) {
                        c1307d.t();
                    } else if (c1307d.f(Integer.MIN_VALUE)) {
                        c1307d.t();
                    } else {
                        this.f14598d.addLast(c1307d);
                    }
                    hVar.t();
                    int i8 = this.f14601x;
                    this.f14601x = i8 + 1;
                    this.f14599e[i8] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // D1.d
    public final void release() {
        synchronized (this.f14596b) {
            this.f14594C = true;
            this.f14596b.notify();
        }
        try {
            this.f14595a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // j2.InterfaceC1310g
    public final void a(long j) {
    }
}
