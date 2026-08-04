package G6;

import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f3103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V0 f3104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f3105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H6.n f3106f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(V0 v6, p065i6.d dVar) {
        super(dVar);
        this.f3103c = v6;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3101a = obj;
        this.f3102b |= Integer.MIN_VALUE;
        return this.f3103c.r(null, this);
    }
}
