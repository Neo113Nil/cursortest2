package v1;

import java.nio.ByteBuffer;
import w1.C2542a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f20357a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final s f20358b;

    /* renamed from: c, reason: collision with root package name */
    public s f20359c;

    /* renamed from: d, reason: collision with root package name */
    public s f20360d;

    /* renamed from: e, reason: collision with root package name */
    public int f20361e;
    public int f;

    public p(s sVar) {
        this.f20358b = sVar;
        this.f20359c = sVar;
    }

    public final void a() {
        this.f20357a = 1;
        this.f20359c = this.f20358b;
        this.f = 0;
    }

    public final boolean b() {
        C2542a b3 = this.f20359c.f20375b.b();
        int a5 = b3.a(6);
        return !(a5 == 0 || ((ByteBuffer) b3.f6158n).get(a5 + b3.f6155k) == 0) || this.f20361e == 65039;
    }
}
