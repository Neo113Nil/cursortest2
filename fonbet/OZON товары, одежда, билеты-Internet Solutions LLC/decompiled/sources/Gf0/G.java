package Gf0;

import kotlin.time.b;
import qf0.d;
import ve.EnumC10311b;

/* loaded from: classes3.dex */
public final class G extends d.b {

    /* renamed from: c, reason: collision with root package name */
    private final long f10132c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10133d;

    G(D d11) {
        b.Companion companion = kotlin.time.b.INSTANCE;
        long j11 = d11.j();
        EnumC10311b enumC10311b = EnumC10311b.MILLISECONDS;
        this.f10132c = kotlin.time.c.h(j11, enumC10311b);
        this.f10133d = kotlin.time.c.h(d11.i(), enumC10311b);
    }

    @Override // qf0.d.b
    public final long a() {
        return this.f10133d;
    }

    @Override // qf0.d.b
    public final long b() {
        return this.f10132c;
    }
}
