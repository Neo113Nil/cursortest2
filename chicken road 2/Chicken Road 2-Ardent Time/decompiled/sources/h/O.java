package h;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public int f3102a;

    /* renamed from: b, reason: collision with root package name */
    public int f3103b;

    /* renamed from: c, reason: collision with root package name */
    public int f3104c;

    /* renamed from: d, reason: collision with root package name */
    public int f3105d;

    /* renamed from: e, reason: collision with root package name */
    public int f3106e;

    /* renamed from: f, reason: collision with root package name */
    public int f3107f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3108g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3109h;

    public final void a(int i2, int i3) {
        this.f3104c = i2;
        this.f3105d = i3;
        this.f3109h = true;
        if (this.f3108g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f3102a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f3103b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3102a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3103b = i3;
        }
    }
}
