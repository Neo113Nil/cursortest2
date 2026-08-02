package N;

/* loaded from: classes8.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f18261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18263c;

    public /* synthetic */ t(y yVar, int i11, int i12) {
        this.f18261a = yVar;
        this.f18262b = i11;
        this.f18263c = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y.b(this.f18261a, this.f18262b, this.f18263c);
    }
}
