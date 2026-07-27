package V;

import H2.n;
import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.google.android.gms.tasks.Task;
import i1.InterfaceC0339i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import n.C1140f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1606a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1607b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1608c;

    public f() {
        this.f1606a = new Object();
    }

    public void a(double d3, double d4) {
        boolean z3 = this.f1607b;
        double[] dArr = (double[]) this.f1606a;
        double d5 = 1.0d;
        if (!z3) {
            d5 = 1.0d / (((dArr[7] * d4) + (dArr[3] * d3)) + dArr[15]);
        }
        double d6 = ((dArr[4] * d4) + (dArr[0] * d3) + dArr[12]) * d5;
        double d7 = ((dArr[5] * d4) + (dArr[1] * d3) + dArr[13]) * d5;
        double[] dArr2 = (double[]) this.f1608c;
        if (d6 < dArr2[0]) {
            dArr2[0] = d6;
        } else if (d6 > dArr2[1]) {
            dArr2[1] = d6;
        }
        if (d7 < dArr2[2]) {
            dArr2[2] = d7;
        } else if (d7 > dArr2[3]) {
            dArr2[3] = d7;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.k, java.lang.Object] */
    public void b() {
        ?? r02 = this.f1606a;
        m e3 = r02.e();
        if (e3.f2313c != androidx.lifecycle.f.f2304b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e3.a(new a(0, r02));
        final e eVar = (e) this.f1608c;
        eVar.getClass();
        if (eVar.f1602a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e3.a(new j() { // from class: V.b
            @Override // androidx.lifecycle.j
            public final void a(k kVar, androidx.lifecycle.e eVar2) {
                e this$0 = e.this;
                kotlin.jvm.internal.j.e(this$0, "this$0");
            }
        });
        eVar.f1602a = true;
        this.f1607b = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.k, java.lang.Object] */
    public void c(Bundle bundle) {
        if (!this.f1607b) {
            b();
        }
        m e3 = this.f1606a.e();
        if (e3.f2313c.compareTo(androidx.lifecycle.f.f2306d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e3.f2313c).toString());
        }
        e eVar = (e) this.f1608c;
        if (!eVar.f1602a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f1603b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f1605d = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f1603b = true;
    }

    public void d(InterfaceC0339i interfaceC0339i) {
        synchronized (this.f1606a) {
            try {
                if (((ArrayDeque) this.f1608c) == null) {
                    this.f1608c = new ArrayDeque();
                }
                ((ArrayDeque) this.f1608c).add(interfaceC0339i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Task task) {
        InterfaceC0339i interfaceC0339i;
        synchronized (this.f1606a) {
            if (((ArrayDeque) this.f1608c) != null && !this.f1607b) {
                this.f1607b = true;
                while (true) {
                    synchronized (this.f1606a) {
                        try {
                            interfaceC0339i = (InterfaceC0339i) ((ArrayDeque) this.f1608c).poll();
                            if (interfaceC0339i == null) {
                                this.f1607b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC0339i.a(task);
                }
            }
        }
    }

    public f(g gVar) {
        this.f1606a = gVar;
        e eVar = new e();
        eVar.f1604c = new C1140f();
        this.f1608c = eVar;
    }

    public f(c.j jVar, n nVar) {
        this.f1606a = new Object();
        this.f1608c = new ArrayList();
    }

    public f(boolean z3, double[] dArr, double[] dArr2) {
        this.f1607b = z3;
        this.f1606a = dArr;
        this.f1608c = dArr2;
    }
}
