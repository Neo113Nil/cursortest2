package androidx.lifecycle;

/* loaded from: classes8.dex */
public final class E0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f43197a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G0 f43198b;

    public E0(AbstractC5434v abstractC5434v, G0 g02) {
        this.f43197a = abstractC5434v;
        this.f43198b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f43197a.e(this.f43198b);
    }
}
