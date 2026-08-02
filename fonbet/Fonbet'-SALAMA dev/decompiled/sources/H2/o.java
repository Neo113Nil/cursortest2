package H2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f3280a;

    /* renamed from: b, reason: collision with root package name */
    public int f3281b;

    /* renamed from: c, reason: collision with root package name */
    public int f3282c;

    /* renamed from: d, reason: collision with root package name */
    public int f3283d;

    public o(int i7, int i8, int i9, int i10) {
        this.f3280a = i7;
        this.f3281b = i8;
        this.f3282c = i9;
        this.f3283d = i10;
    }

    public boolean a(int i7) {
        if (i7 == 1) {
            if (this.f3280a - this.f3281b <= 1) {
                return false;
            }
        } else if (this.f3282c - this.f3283d <= 1) {
            return false;
        }
        return true;
    }
}
