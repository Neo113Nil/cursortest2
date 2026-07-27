package Y4;

import T4.B;
import T4.s;
import j5.q;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class j extends B {

    /* renamed from: b, reason: collision with root package name */
    public final String f3721b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3722c;

    /* renamed from: d, reason: collision with root package name */
    public final q f3723d;

    public j(String str, long j2, q qVar) {
        this.f3721b = str;
        this.f3722c = j2;
        this.f3723d = qVar;
    }

    @Override // T4.B
    public final long b() {
        return this.f3722c;
    }

    @Override // T4.B
    public final s c() {
        String str = this.f3721b;
        if (str == null) {
            return null;
        }
        B4.j jVar = s.f2931b;
        return AbstractC1341c.z(str);
    }

    @Override // T4.B
    public final j5.h g() {
        return this.f3723d;
    }
}
