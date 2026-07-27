package D4;

/* loaded from: classes.dex */
public final class J extends L {

    /* renamed from: c, reason: collision with root package name */
    public final C0007g f466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n6, long j2, C0007g c0007g) {
        super(j2);
        this.f467d = n6;
        this.f466c = c0007g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f466c.B(this.f467d);
    }

    @Override // D4.L
    public final String toString() {
        return super.toString() + this.f466c;
    }
}
