package c;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0523b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7317k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0531j f7318l;

    public /* synthetic */ RunnableC0523b(AbstractActivityC0531j abstractActivityC0531j, int i) {
        this.f7317k = i;
        this.f7318l = abstractActivityC0531j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7317k) {
            case 0:
                AbstractActivityC0531j.h(this.f7318l);
                break;
            default:
                this.f7318l.invalidateOptionsMenu();
                break;
        }
    }
}
