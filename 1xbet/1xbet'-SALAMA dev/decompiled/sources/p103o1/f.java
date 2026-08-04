package p103o1;

import I3.b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15565b;

    public f(k kVar, b bVar) {
        this.f15564a = kVar;
        this.f15565b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15564a.f15573a != this) {
            return;
        }
        if (i.f15571f.g(this.f15564a, this, i.e(this.f15565b))) {
            i.b(this.f15564a);
        }
    }
}
