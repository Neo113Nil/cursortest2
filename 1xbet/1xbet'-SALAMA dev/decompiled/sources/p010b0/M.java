package p010b0;

import p077k6.c;
import t6.o;

/* JADX INFO: loaded from: classes.dex */
public final class M extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f9953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o7, c cVar) {
        super(cVar);
        this.f9955c = o7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f9954b = obj;
        this.f9956d |= Integer.MIN_VALUE;
        return this.f9955c.j(null, false, this);
    }
}
