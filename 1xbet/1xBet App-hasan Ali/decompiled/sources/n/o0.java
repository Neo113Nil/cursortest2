package n;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f18299a;

    /* renamed from: b, reason: collision with root package name */
    public int f18300b;

    /* renamed from: c, reason: collision with root package name */
    public int f18301c;

    /* renamed from: d, reason: collision with root package name */
    public int f18302d;

    /* renamed from: e, reason: collision with root package name */
    public int f18303e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18304g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18305h;

    public final void a(int i, int i5) {
        this.f18301c = i;
        this.f18302d = i5;
        this.f18305h = true;
        if (this.f18304g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f18299a = i5;
            }
            if (i != Integer.MIN_VALUE) {
                this.f18300b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f18299a = i;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f18300b = i5;
        }
    }
}
