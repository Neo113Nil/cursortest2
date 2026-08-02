package b0;

import java.io.Serializable;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class D extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public Object f9916a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9917b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f9918c;

    /* renamed from: d, reason: collision with root package name */
    public t6.p f9919d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9920e;

    /* renamed from: f, reason: collision with root package name */
    public int f9921f;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f9922x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ O f9923y;

    /* renamed from: z, reason: collision with root package name */
    public int f9924z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(O o7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f9923y = o7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f9922x = obj;
        this.f9924z |= Integer.MIN_VALUE;
        return O.f(this.f9923y, false, this);
    }
}
