package sg.bigo.ads.L0;

/* loaded from: classes3.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12418a;
    public final /* synthetic */ y b;

    public w(y yVar, int i) {
        this.b = yVar;
        this.f12418a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.b;
        int i = yVar.c;
        int i2 = this.f12418a;
        if (i == i2) {
            return;
        }
        yVar.c = i2;
        A a2 = yVar.b;
        if (a2 != null) {
            a2.a(i2);
        }
    }
}
