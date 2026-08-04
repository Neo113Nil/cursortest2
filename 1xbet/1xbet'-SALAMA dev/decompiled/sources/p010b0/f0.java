package p010b0;

import M6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f10038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f10041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, c cVar) {
        super(cVar);
        this.f10041d = h0Var;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10040c = obj;
        this.f10042e |= Integer.MIN_VALUE;
        return this.f10041d.c(null, this);
    }
}
