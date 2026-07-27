package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public abstract class w9 implements Runnable, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f4582a;

    /* renamed from: b, reason: collision with root package name */
    public final g9 f4583b;

    /* renamed from: c, reason: collision with root package name */
    public final n9 f4584c;

    public w9(d9 d9Var, g9 g9Var, n9 n9Var) {
        this.f4582a = d9Var;
        this.f4583b = g9Var;
        this.f4584c = n9Var;
    }

    public abstract int a();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((w9) obj).f4583b.f3757c - this.f4583b.f3757c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int a3 = a();
            n9 n9Var = this.f4584c;
            if (n9Var != null) {
                n9Var.a(this.f4582a, a3);
            }
        } catch (OutOfMemoryError unused) {
            if (this.f4584c != null) {
                this.f4584c.a(this.f4582a, 0);
            }
        } catch (Throwable th) {
            try {
                if (this.f4582a.f3571a != e9.f) {
                    d9.a(th);
                }
            } finally {
                n9 n9Var2 = this.f4584c;
                if (n9Var2 != null) {
                    n9Var2.a(this.f4582a, 0);
                }
            }
        }
    }
}
