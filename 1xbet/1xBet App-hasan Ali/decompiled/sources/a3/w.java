package a3;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6630k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f6631l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f6632m;

    public /* synthetic */ w(x xVar, String str, int i) {
        this.f6630k = i;
        this.f6631l = xVar;
        this.f6632m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6630k) {
            case 0:
                ((C0457a) this.f6631l.f6635c).f6518b.evaluateJavascript(this.f6632m, null);
                break;
            default:
                ((C0457a) this.f6631l.f6635c).f6518b.evaluateJavascript(this.f6632m, null);
                break;
        }
    }
}
