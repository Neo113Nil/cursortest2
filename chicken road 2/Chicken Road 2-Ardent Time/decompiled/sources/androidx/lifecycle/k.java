package androidx.lifecycle;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.e f2386a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.i f2387b;

    public final void a(androidx.lifecycle.j jVar, androidx.lifecycle.d dVar) {
        androidx.lifecycle.e a2 = dVar.a();
        androidx.lifecycle.e state1 = this.f2386a;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (a2.compareTo(state1) < 0) {
            state1 = a2;
        }
        this.f2386a = state1;
        this.f2387b.a(jVar, dVar);
        this.f2386a = a2;
    }
}
