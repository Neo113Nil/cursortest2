package p4;

/* loaded from: classes.dex */
public final class G extends H {

    /* renamed from: m, reason: collision with root package name */
    public final C2268h f18745m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f18746n;

    public G(J j5, long j6, C2268h c2268h) {
        this.f18746n = j5;
        this.f18747k = j6;
        this.f18748l = -1;
        this.f18745m = c2268h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18745m.B(this.f18746n);
    }

    @Override // p4.H
    public final String toString() {
        return super.toString() + this.f18745m;
    }
}
