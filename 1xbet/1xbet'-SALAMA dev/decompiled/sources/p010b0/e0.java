package p010b0;

import M6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f10030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f10032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, c cVar) {
        super(cVar);
        this.f10032d = h0Var;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10031c = obj;
        this.f10033e |= Integer.MIN_VALUE;
        return this.f10032d.b(null, this);
    }
}
