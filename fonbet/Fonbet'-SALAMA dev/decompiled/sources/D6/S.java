package D6;

/* loaded from: classes2.dex */
public final class S extends U {

    /* renamed from: c, reason: collision with root package name */
    public final C0130m f1802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f1803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(W w7, long j, C0130m c0130m) {
        super(j);
        this.f1803d = w7;
        this.f1802c = c0130m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1802c.B(this.f1803d);
    }

    @Override // D6.U
    public final String toString() {
        return super.toString() + this.f1802c;
    }
}
