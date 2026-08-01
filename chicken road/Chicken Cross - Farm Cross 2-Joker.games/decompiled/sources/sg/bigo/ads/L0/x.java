package sg.bigo.ads.L0;

/* loaded from: classes3.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12419a;
    public final /* synthetic */ int b;
    public final /* synthetic */ y c;

    public x(y yVar, int i, int i2) {
        this.c = yVar;
        this.f12419a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a2 = this.c.b;
        if (a2 != null) {
            a2.a(this.f12419a, this.b);
        }
    }
}
