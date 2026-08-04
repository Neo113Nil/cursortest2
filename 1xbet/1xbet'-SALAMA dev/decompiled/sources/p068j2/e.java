package p068j2;

import D1.d;
import D1.h;
import D1.j;
import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements g, d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public h f14598A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14599B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14600C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14601a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d[] f14606f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14608y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f14609z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14602b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f14603c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f14604d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h[] f14605e = new j[2];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14607x = 2;

    public e() {
        d[] dVarArr = new d[2];
        int i7 = 0;
        while (true) {
            if (i7 >= this.f14607x) {
                break;
            }
            this.f14605e[i7] = new j(1);
            i7++;
        }
        this.f14606f = dVarArr;
        this.f14608y = 2;
        for (int i8 = 0; i8 < this.f14608y; i8++) {
            this.f14606f[i8] = new d(this, 1);
        }
        j jVar = new j(this);
        this.f14601a = jVar;
        jVar.start();
        int i9 = this.f14607x;
        h[] hVarArr = this.f14605e;
        a.h(i9 == hVarArr.length);
        for (h hVar : hVarArr) {
            hVar.z(1024);
        }
    }

    @Override // D1.d
    public final d b() {
        synchronized (this.f14602b) {
            try {
                h hVar = this.f14598A;
                if (hVar != null) {
                    throw hVar;
                }
                if (this.f14604d.isEmpty()) {
                    return null;
                }
                return (d) this.f14604d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.d
    public final Object c() {
        h hVar;
        synchronized (this.f14602b) {
            try {
                h hVar2 = this.f14598A;
                if (hVar2 != null) {
                    throw hVar2;
                }
                a.h(this.f14609z == null);
                int i7 = this.f14607x;
                if (i7 == 0) {
                    hVar = null;
                } else {
                    h[] hVarArr = this.f14605e;
                    int i8 = i7 - 1;
                    this.f14607x = i8;
                    hVar = hVarArr[i8];
                }
                this.f14609z = hVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // D1.d
    public final void d(j jVar) {
        synchronized (this.f14602b) {
            try {
                h hVar = this.f14598A;
                if (hVar != null) {
                    throw hVar;
                }
                a.f(jVar == this.f14609z);
                this.f14603c.addLast(jVar);
                if (!this.f14603c.isEmpty() && this.f14608y > 0) {
                    this.f14602b.notify();
                }
                this.f14609z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract f e(byte[] bArr, int i7, boolean z4);

    public final h f(h hVar, d dVar, boolean z4) {
        j jVar = (j) hVar;
        try {
            ByteBuffer byteBuffer = jVar.f1697d;
            byteBuffer.getClass();
            dVar.y(jVar.f1699f, e(byteBuffer.array(), byteBuffer.limit(), z4), jVar.f14611z);
            dVar.f1675b &= f.API_PRIORITY_OTHER;
            return null;
        } catch (h e7) {
            return e7;
        }
    }

    @Override // D1.d
    public final void flush() {
        synchronized (this.f14602b) {
            try {
                this.f14599B = true;
                h hVar = this.f14609z;
                if (hVar != null) {
                    hVar.t();
                    int i7 = this.f14607x;
                    this.f14607x = i7 + 1;
                    this.f14605e[i7] = hVar;
                    this.f14609z = null;
                }
                while (!this.f14603c.isEmpty()) {
                    h hVar2 = (h) this.f14603c.removeFirst();
                    hVar2.t();
                    int i8 = this.f14607x;
                    this.f14607x = i8 + 1;
                    this.f14605e[i8] = hVar2;
                }
                while (!this.f14604d.isEmpty()) {
                    ((d) this.f14604d.removeFirst()).t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        h hVar;
        h hVarF;
        synchronized (this.f14602b) {
            while (!this.f14600C) {
                try {
                    if (!this.f14603c.isEmpty() && this.f14608y > 0) {
                        break;
                    }
                    this.f14602b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f14600C) {
                return false;
            }
            h hVar2 = (h) this.f14603c.removeFirst();
            d[] dVarArr = this.f14606f;
            int i7 = this.f14608y - 1;
            this.f14608y = i7;
            d dVar = dVarArr[i7];
            boolean z4 = this.f14599B;
            this.f14599B = false;
            if (hVar2.f(4)) {
                dVar.b(4);
            } else {
                if (hVar2.f(Integer.MIN_VALUE)) {
                    dVar.b(Integer.MIN_VALUE);
                }
                if (hVar2.f(134217728)) {
                    dVar.b(134217728);
                }
                try {
                    hVarF = f(hVar2, dVar, z4);
                } catch (OutOfMemoryError e7) {
                    hVar = new h("Unexpected decode error", e7);
                    hVarF = hVar;
                } catch (RuntimeException e8) {
                    hVar = new h("Unexpected decode error", e8);
                    hVarF = hVar;
                }
                if (hVarF != null) {
                    synchronized (this.f14602b) {
                        this.f14598A = hVarF;
                    }
                    return false;
                }
            }
            synchronized (this.f14602b) {
                try {
                    if (this.f14599B || dVar.f(Integer.MIN_VALUE)) {
                        dVar.t();
                    } else {
                        this.f14604d.addLast(dVar);
                    }
                    hVar2.t();
                    int i8 = this.f14607x;
                    this.f14607x = i8 + 1;
                    this.f14605e[i8] = hVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // D1.d
    public final void release() {
        synchronized (this.f14602b) {
            this.f14600C = true;
            this.f14602b.notify();
        }
        try {
            this.f14601a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // p068j2.g
    public final void a(long j) {
    }
}
