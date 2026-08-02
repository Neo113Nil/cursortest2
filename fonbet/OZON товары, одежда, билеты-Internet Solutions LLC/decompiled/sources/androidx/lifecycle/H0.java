package androidx.lifecycle;

/* loaded from: classes8.dex */
public final class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f43207a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G0 f43208b;

    public H0(AbstractC5434v abstractC5434v, G0 g02) {
        this.f43207a = abstractC5434v;
        this.f43208b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f43207a.a(this.f43208b);
    }
}
