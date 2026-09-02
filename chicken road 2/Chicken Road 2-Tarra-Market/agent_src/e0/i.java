package e0;

import androidx.lifecycle.j;
import androidx.lifecycle.l;
import com.google.android.gms.tasks.Task;
import d.C0051f;
import i1.h;
import java.util.ArrayDeque;
import s.C0827a;
import s.InterfaceC0830d;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f965a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f966b;

    /* renamed from: c, reason: collision with root package name */
    public Object f967c;

    public i() {
        this.f966b = new Object();
    }

    public void a(double d2, double d3) {
        boolean z2 = this.f965a;
        double[] dArr = (double[]) this.f966b;
        double d4 = 1.0d;
        if (!z2) {
            d4 = 1.0d / (((dArr[7] * d3) + (dArr[3] * d2)) + dArr[15]);
        }
        double d5 = ((dArr[4] * d3) + (dArr[0] * d2) + dArr[12]) * d4;
        double d6 = ((dArr[5] * d3) + (dArr[1] * d2) + dArr[13]) * d4;
        double[] dArr2 = (double[]) this.f967c;
        if (d5 < dArr2[0]) {
            dArr2[0] = d5;
        } else if (d5 > dArr2[1]) {
            dArr2[1] = d5;
        }
        if (d6 < dArr2[2]) {
            dArr2[2] = d6;
        } else if (d6 > dArr2[3]) {
            dArr2[3] = d6;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.j, java.lang.Object] */
    public void b() {
        ?? r02 = this.f966b;
        l b2 = r02.b();
        if (b2.f581c != androidx.lifecycle.e.f571b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        b2.a(new C0827a(0, r02));
        final i1.h hVar = (i1.h) this.f967c;
        hVar.getClass();
        if (hVar.f1338a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        b2.a(new androidx.lifecycle.i() { // from class: s.b
            @Override // androidx.lifecycle.i
            public final void a(j jVar, androidx.lifecycle.d dVar) {
                h this$0 = h.this;
                kotlin.jvm.internal.j.e(this$0, "this$0");
            }
        });
        hVar.f1338a = true;
        this.f965a = true;
    }

    public void c(h hVar) {
        synchronized (this.f966b) {
            try {
                if (((ArrayDeque) this.f967c) == null) {
                    this.f967c = new ArrayDeque();
                }
                ((ArrayDeque) this.f967c).add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Task task) {
        h hVar;
        synchronized (this.f966b) {
            if (((ArrayDeque) this.f967c) != null && !this.f965a) {
                this.f965a = true;
                while (true) {
                    synchronized (this.f966b) {
                        try {
                            hVar = (h) ((ArrayDeque) this.f967c).poll();
                            if (hVar == null) {
                                this.f965a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    hVar.a(task);
                }
            }
        }
    }

    public i(InterfaceC0830d interfaceC0830d) {
        this.f966b = interfaceC0830d;
        i1.h hVar = new i1.h();
        hVar.f1340c = new C0051f();
        this.f967c = hVar;
    }

    public i(boolean z2, double[] dArr, double[] dArr2) {
        this.f965a = z2;
        this.f966b = dArr;
        this.f967c = dArr2;
    }
}
