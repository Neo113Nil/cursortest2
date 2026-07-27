package l;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public int f10805a;

    /* renamed from: b, reason: collision with root package name */
    public int f10806b;

    /* renamed from: c, reason: collision with root package name */
    public int f10807c;

    /* renamed from: d, reason: collision with root package name */
    public int f10808d;

    /* renamed from: e, reason: collision with root package name */
    public int f10809e;

    /* renamed from: f, reason: collision with root package name */
    public int f10810f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10811g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10812h;

    public final void a(int i2, int i3) {
        this.f10807c = i2;
        this.f10808d = i3;
        this.f10812h = true;
        if (this.f10811g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f10805a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f10806b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f10805a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f10806b = i3;
        }
    }
}
