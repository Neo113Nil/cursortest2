package Bf0;

import rf0.AbstractC9267a;
import vf0.C10315a;

/* loaded from: classes7.dex */
public final class d extends AbstractC9267a {

    /* renamed from: c, reason: collision with root package name */
    private final qf0.b f3715c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3716d;

    /* renamed from: e, reason: collision with root package name */
    private final qf0.c f3717e;

    d(C10315a c10315a, int i11) {
        this.f3715c = c10315a.k() ? qf0.b.Cellular : qf0.b.Any;
        this.f3716d = i11;
        this.f3717e = c10315a.e();
    }

    @Override // rf0.AbstractC9267a
    public final qf0.b a() {
        return this.f3715c;
    }

    @Override // rf0.AbstractC9267a
    public final qf0.c b() {
        return this.f3717e;
    }

    @Override // rf0.AbstractC9267a
    public final int c() {
        return this.f3716d;
    }
}
