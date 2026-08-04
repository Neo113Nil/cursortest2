package I0;

import G6.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f3487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, p065i6.d dVar) {
        super(dVar);
        this.f3487c = rVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3485a = obj;
        this.f3486b |= Integer.MIN_VALUE;
        return this.f3487c.c(null, this);
    }
}
