package Bf0;

import kotlin.time.b;
import qf0.d;
import ve.EnumC10311b;
import vf0.C10315a;

/* loaded from: classes7.dex */
public final class e extends d.b {

    /* renamed from: c, reason: collision with root package name */
    private final long f3718c;

    /* renamed from: d, reason: collision with root package name */
    private final long f3719d;

    e(C10315a c10315a) {
        b.Companion companion = kotlin.time.b.INSTANCE;
        int d11 = c10315a.d();
        EnumC10311b enumC10311b = EnumC10311b.SECONDS;
        this.f3718c = kotlin.time.c.g(d11, enumC10311b);
        this.f3719d = kotlin.time.c.g(c10315a.d(), enumC10311b);
    }

    @Override // qf0.d.b
    public final long a() {
        return this.f3718c;
    }

    @Override // qf0.d.b
    public final long b() {
        return this.f3719d;
    }
}
