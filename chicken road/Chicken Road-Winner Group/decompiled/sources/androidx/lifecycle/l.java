package androidx.lifecycle;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public f f2309a;

    /* renamed from: b, reason: collision with root package name */
    public j f2310b;

    public final void a(k kVar, e eVar) {
        f a3 = eVar.a();
        f state1 = this.f2309a;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (a3.compareTo(state1) < 0) {
            state1 = a3;
        }
        this.f2309a = state1;
        this.f2310b.a(kVar, eVar);
        this.f2309a = a3;
    }
}
