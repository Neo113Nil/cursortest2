package l;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public int f9745a;

    /* renamed from: b, reason: collision with root package name */
    public int f9746b;

    /* renamed from: c, reason: collision with root package name */
    public int f9747c;

    /* renamed from: d, reason: collision with root package name */
    public int f9748d;

    /* renamed from: e, reason: collision with root package name */
    public int f9749e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9750g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9751h;

    public final void a(int i3, int i4) {
        this.f9747c = i3;
        this.f9748d = i4;
        this.f9751h = true;
        if (this.f9750g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f9745a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f9746b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f9745a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f9746b = i4;
        }
    }
}
