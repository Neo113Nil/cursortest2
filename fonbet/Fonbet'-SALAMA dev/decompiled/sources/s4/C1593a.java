package s4;

import n4.C1473g;
import v4.l;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1593a {

    /* renamed from: a, reason: collision with root package name */
    public final l f16147a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16148b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16149c;

    public C1593a(l lVar, boolean z4, boolean z7) {
        this.f16147a = lVar;
        this.f16148b = z4;
        this.f16149c = z7;
    }

    public final boolean a(v4.c cVar) {
        return (this.f16148b && !this.f16149c) || this.f16147a.f17186a.i(cVar);
    }

    public final boolean b(C1473g c1473g) {
        return c1473g.isEmpty() ? this.f16148b && !this.f16149c : a(c1473g.B());
    }
}
