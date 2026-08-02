package androidx.camera.core;

import C.L;
import C.S;
import C.T;
import C.d0;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.f;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.InterfaceC5104l0;
import androidx.camera.core.impl.InterfaceC5130z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class s implements InterfaceC5104l0, f.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38438a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC5111p f38439b;

    /* renamed from: c, reason: collision with root package name */
    private int f38440c;

    /* renamed from: d, reason: collision with root package name */
    private AW.c f38441d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38442e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5104l0 f38443f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC5104l0.a f38444g;

    /* renamed from: h, reason: collision with root package name */
    private Executor f38445h;

    /* renamed from: i, reason: collision with root package name */
    private final LongSparseArray<L> f38446i;

    /* renamed from: j, reason: collision with root package name */
    private final LongSparseArray<p> f38447j;

    /* renamed from: k, reason: collision with root package name */
    private int f38448k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f38449l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f38450m;

    final class a extends AbstractC5111p {
        a() {
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void b(int i11, @NonNull InterfaceC5130z interfaceC5130z) {
            s.this.p(interfaceC5130z);
        }
    }

    public s(int i11, int i12, int i13, int i14) {
        d dVar = new d(ImageReader.newInstance(i11, i12, i13, i14));
        this.f38438a = new Object();
        this.f38439b = new a();
        this.f38440c = 0;
        this.f38441d = new AW.c(this);
        this.f38442e = false;
        this.f38446i = new LongSparseArray<>();
        this.f38447j = new LongSparseArray<>();
        this.f38450m = new ArrayList();
        this.f38443f = dVar;
        this.f38448k = 0;
        this.f38449l = new ArrayList(c());
    }

    public static /* synthetic */ void i(s sVar, InterfaceC5104l0 interfaceC5104l0) {
        synchronized (sVar.f38438a) {
            sVar.f38440c++;
        }
        sVar.m(interfaceC5104l0);
    }

    private void j(f fVar) {
        synchronized (this.f38438a) {
            try {
                int indexOf = this.f38449l.indexOf(fVar);
                if (indexOf >= 0) {
                    this.f38449l.remove(indexOf);
                    int i11 = this.f38448k;
                    if (indexOf <= i11) {
                        this.f38448k = i11 - 1;
                    }
                }
                this.f38450m.remove(fVar);
                if (this.f38440c > 0) {
                    m(this.f38443f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k(d0 d0Var) {
        InterfaceC5104l0.a aVar;
        Executor executor;
        synchronized (this.f38438a) {
            try {
                if (this.f38449l.size() < c()) {
                    d0Var.c(this);
                    this.f38449l.add(d0Var);
                    aVar = this.f38444g;
                    executor = this.f38445h;
                } else {
                    S.a("TAG", "Maximum image number reached.");
                    d0Var.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new T(0, this, aVar));
            } else {
                aVar.a(this);
            }
        }
    }

    private void n() {
        synchronized (this.f38438a) {
            try {
                for (int size = this.f38446i.size() - 1; size >= 0; size--) {
                    L valueAt = this.f38446i.valueAt(size);
                    long timestamp = valueAt.getTimestamp();
                    p pVar = this.f38447j.get(timestamp);
                    if (pVar != null) {
                        this.f38447j.remove(timestamp);
                        this.f38446i.removeAt(size);
                        k(new d0(pVar, null, valueAt));
                    }
                }
                o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o() {
        synchronized (this.f38438a) {
            try {
                if (this.f38447j.size() != 0 && this.f38446i.size() != 0) {
                    long keyAt = this.f38447j.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f38446i.keyAt(0);
                    x2.i.b(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f38447j.size() - 1; size >= 0; size--) {
                            if (this.f38447j.keyAt(size) < keyAt2) {
                                this.f38447j.valueAt(size).close();
                                this.f38447j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f38446i.size() - 1; size2 >= 0; size2--) {
                            if (this.f38446i.keyAt(size2) < keyAt) {
                                this.f38446i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final Surface a() {
        Surface a11;
        synchronized (this.f38438a) {
            a11 = this.f38443f.a();
        }
        return a11;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int b() {
        int b11;
        synchronized (this.f38438a) {
            b11 = this.f38443f.b();
        }
        return b11;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int c() {
        int c11;
        synchronized (this.f38438a) {
            c11 = this.f38443f.c();
        }
        return c11;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void close() {
        synchronized (this.f38438a) {
            try {
                if (this.f38442e) {
                    return;
                }
                Iterator it = new ArrayList(this.f38449l).iterator();
                while (it.hasNext()) {
                    ((p) it.next()).close();
                }
                this.f38449l.clear();
                ((d) this.f38443f).close();
                this.f38442e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final p d() {
        synchronized (this.f38438a) {
            try {
                if (this.f38449l.isEmpty()) {
                    return null;
                }
                if (this.f38448k >= this.f38449l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f38449l;
                int i11 = this.f38448k;
                this.f38448k = i11 + 1;
                p pVar = (p) arrayList.get(i11);
                this.f38450m.add(pVar);
                return pVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final p e() {
        synchronized (this.f38438a) {
            try {
                if (this.f38449l.isEmpty()) {
                    return null;
                }
                if (this.f38448k >= this.f38449l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.f38449l.size() - 1; i11++) {
                    if (!this.f38450m.contains(this.f38449l.get(i11))) {
                        arrayList.add((p) this.f38449l.get(i11));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).close();
                }
                int size = this.f38449l.size();
                ArrayList arrayList2 = this.f38449l;
                this.f38448k = size;
                p pVar = (p) arrayList2.get(size - 1);
                this.f38450m.add(pVar);
                return pVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void f() {
        synchronized (this.f38438a) {
            this.f38443f.f();
            this.f38444g = null;
            this.f38445h = null;
            this.f38440c = 0;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void g(@NonNull InterfaceC5104l0.a aVar, @NonNull Executor executor) {
        synchronized (this.f38438a) {
            aVar.getClass();
            this.f38444g = aVar;
            executor.getClass();
            this.f38445h = executor;
            ((d) this.f38443f).g(this.f38441d, executor);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int getHeight() {
        int height;
        synchronized (this.f38438a) {
            height = this.f38443f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int getWidth() {
        int width;
        synchronized (this.f38438a) {
            width = this.f38443f.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.f.a
    public final void h(@NonNull f fVar) {
        synchronized (this.f38438a) {
            j(fVar);
        }
    }

    @NonNull
    public final AbstractC5111p l() {
        return this.f38439b;
    }

    final void m(InterfaceC5104l0 interfaceC5104l0) {
        p pVar;
        synchronized (this.f38438a) {
            try {
                if (this.f38442e) {
                    return;
                }
                int size = this.f38447j.size() + this.f38449l.size();
                if (size >= interfaceC5104l0.c()) {
                    S.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        pVar = interfaceC5104l0.d();
                        if (pVar != null) {
                            this.f38440c--;
                            size++;
                            this.f38447j.put(pVar.x0().getTimestamp(), pVar);
                            n();
                        }
                    } catch (IllegalStateException e11) {
                        S.b("MetadataImageReader", "Failed to acquire next image.", e11);
                        pVar = null;
                    }
                    if (pVar == null || this.f38440c <= 0) {
                        break;
                    }
                } while (size < interfaceC5104l0.c());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void p(InterfaceC5130z interfaceC5130z) {
        synchronized (this.f38438a) {
            try {
                if (this.f38442e) {
                    return;
                }
                this.f38446i.put(interfaceC5130z.getTimestamp(), new J.c(interfaceC5130z));
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
