package androidx.lifecycle;

import A0.RunnableC0049o;
import android.os.Handler;

/* loaded from: classes.dex */
public final class F implements InterfaceC0491u {

    /* renamed from: s, reason: collision with root package name */
    public static final F f7003s = new F();

    /* renamed from: k, reason: collision with root package name */
    public int f7004k;

    /* renamed from: l, reason: collision with root package name */
    public int f7005l;

    /* renamed from: o, reason: collision with root package name */
    public Handler f7008o;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7006m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7007n = true;

    /* renamed from: p, reason: collision with root package name */
    public final C0493w f7009p = new C0493w(this, true);

    /* renamed from: q, reason: collision with root package name */
    public final RunnableC0049o f7010q = new RunnableC0049o(8, this);

    /* renamed from: r, reason: collision with root package name */
    public final W f7011r = new W(this);

    public final void c() {
        int i = this.f7005l + 1;
        this.f7005l = i;
        if (i == 1) {
            if (this.f7006m) {
                this.f7009p.p(EnumC0486o.ON_RESUME);
                this.f7006m = false;
            } else {
                Handler handler = this.f7008o;
                kotlin.jvm.internal.l.c(handler);
                handler.removeCallbacks(this.f7010q);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0491u
    public final L g() {
        return this.f7009p;
    }
}
