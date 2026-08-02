package androidx.appcompat.widget;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
final class V {

    /* renamed from: a, reason: collision with root package name */
    private int f37829a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f37830b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f37831c = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: d, reason: collision with root package name */
    private int f37832d = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: e, reason: collision with root package name */
    private int f37833e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f37834f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37835g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37836h = false;

    V() {
    }

    public final int a() {
        return this.f37835g ? this.f37829a : this.f37830b;
    }

    public final int b() {
        return this.f37829a;
    }

    public final int c() {
        return this.f37830b;
    }

    public final int d() {
        return this.f37835g ? this.f37830b : this.f37829a;
    }

    public final void e(int i11, int i12) {
        this.f37836h = false;
        if (i11 != Integer.MIN_VALUE) {
            this.f37833e = i11;
            this.f37829a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f37834f = i12;
            this.f37830b = i12;
        }
    }

    public final void f(boolean z11) {
        if (z11 == this.f37835g) {
            return;
        }
        this.f37835g = z11;
        if (!this.f37836h) {
            this.f37829a = this.f37833e;
            this.f37830b = this.f37834f;
            return;
        }
        if (z11) {
            int i11 = this.f37832d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f37833e;
            }
            this.f37829a = i11;
            int i12 = this.f37831c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f37834f;
            }
            this.f37830b = i12;
            return;
        }
        int i13 = this.f37831c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f37833e;
        }
        this.f37829a = i13;
        int i14 = this.f37832d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = this.f37834f;
        }
        this.f37830b = i14;
    }

    public final void g(int i11, int i12) {
        this.f37831c = i11;
        this.f37832d = i12;
        this.f37836h = true;
        if (this.f37835g) {
            if (i12 != Integer.MIN_VALUE) {
                this.f37829a = i12;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f37830b = i11;
                return;
            }
            return;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f37829a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f37830b = i12;
        }
    }
}
