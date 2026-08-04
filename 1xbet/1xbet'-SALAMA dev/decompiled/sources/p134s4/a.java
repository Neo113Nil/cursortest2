package p134s4;

import p098n4.C0934g;
import v4.c;
import v4.l;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16155c;

    public a(l lVar, boolean z4, boolean z7) {
        this.f16153a = lVar;
        this.f16154b = z4;
        this.f16155c = z7;
    }

    public final boolean a(c cVar) {
        return (this.f16154b && !this.f16155c) || this.f16153a.f17192a.i(cVar);
    }

    public final boolean b(C0934g c0934g) {
        if (c0934g.isEmpty()) {
            return this.f16154b && !this.f16155c;
        }
        return a(c0934g.B());
    }
}
