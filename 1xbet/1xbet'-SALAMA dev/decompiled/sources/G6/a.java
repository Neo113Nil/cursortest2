package G6;

import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H6.n f3066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1052y0 f3068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1052y0 c1052y0, p065i6.d dVar) {
        super(dVar);
        this.f3068c = c1052y0;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3067b = obj;
        this.f3069d |= Integer.MIN_VALUE;
        return this.f3068c.r(null, this);
    }
}
