package G6;

import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f3114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f3115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(V0 v6, p065i6.d dVar) {
        super(dVar);
        this.f3114c = v6;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3112a = obj;
        this.f3113b |= Integer.MIN_VALUE;
        return this.f3114c.r(null, this);
    }
}
