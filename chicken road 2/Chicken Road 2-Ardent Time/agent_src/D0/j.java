package D0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f208a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f209b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f210c;

    public j() {
        this.f208a = new java.lang.Object();
    }

    public void a(double d2, double d3) {
        boolean z2 = this.f209b;
        double[] dArr = (double[]) this.f208a;
        double d4 = 1.0d;
        if (!z2) {
            d4 = 1.0d / (((dArr[7] * d3) + (dArr[3] * d2)) + dArr[15]);
        }
        double d5 = ((dArr[4] * d3) + (dArr[0] * d2) + dArr[12]) * d4;
        double d6 = ((dArr[5] * d3) + (dArr[1] * d2) + dArr[13]) * d4;
        double[] dArr2 = (double[]) this.f210c;
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
        ?? r02 = this.f208a;
        androidx.lifecycle.l b2 = r02.b();
        if (b2.f2390c != androidx.lifecycle.e.f2380b) {
            throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        b2.a(new Q.a(0, r02));
        final I1.h hVar = (I1.h) this.f210c;
        hVar.getClass();
        if (hVar.f723a) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.");
        }
        b2.a(new androidx.lifecycle.i() { // from class: Q.b
            @Override // androidx.lifecycle.i
            public final void a(androidx.lifecycle.j jVar, androidx.lifecycle.d dVar) {
                I1.h this$0 = I1.h.this;
                kotlin.jvm.internal.i.e(this$0, "this$0");
            }
        });
        hVar.f723a = true;
        this.f209b = true;
    }

    public void c(D0.i iVar) {
        synchronized (this.f208a) {
            try {
                if (((java.util.ArrayDeque) this.f210c) == null) {
                    this.f210c = new java.util.ArrayDeque();
                }
                ((java.util.ArrayDeque) this.f210c).add(iVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void d(com.google.android.gms.tasks.Task task) {
        D0.i iVar;
        synchronized (this.f208a) {
            if (((java.util.ArrayDeque) this.f210c) != null && !this.f209b) {
                this.f209b = true;
                while (true) {
                    synchronized (this.f208a) {
                        try {
                            iVar = (D0.i) ((java.util.ArrayDeque) this.f210c).poll();
                            if (iVar == null) {
                                this.f209b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    iVar.a(task);
                }
            }
        }
    }

    public j(Q.d dVar) {
        this.f208a = dVar;
        this.f210c = new I1.h(1);
    }

    public j(boolean z2, double[] dArr, double[] dArr2) {
        this.f209b = z2;
        this.f208a = dArr;
        this.f210c = dArr2;
    }
}
