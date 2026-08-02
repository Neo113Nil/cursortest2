package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8339a;

    /* renamed from: b, reason: collision with root package name */
    public int f8340b;

    /* renamed from: c, reason: collision with root package name */
    public int f8341c;

    /* renamed from: d, reason: collision with root package name */
    public int f8342d;

    /* renamed from: e, reason: collision with root package name */
    public int f8343e;

    /* renamed from: f, reason: collision with root package name */
    public int f8344f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8345g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8346h;

    public final void a(int i7, int i8) {
        this.f8341c = i7;
        this.f8342d = i8;
        this.f8346h = true;
        if (this.f8345g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f8339a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f8340b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f8339a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f8340b = i8;
        }
    }
}
