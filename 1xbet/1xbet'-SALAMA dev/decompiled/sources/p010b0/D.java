package p010b0;

import java.io.Serializable;
import p077k6.c;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class D extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f9918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f9919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9921f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f9922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ O f9923y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9924z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(O o7, c cVar) {
        super(cVar);
        this.f9923y = o7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f9922x = obj;
        this.f9924z |= Integer.MIN_VALUE;
        return O.f(this.f9923y, false, this);
    }
}
