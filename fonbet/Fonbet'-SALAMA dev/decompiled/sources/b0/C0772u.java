package b0;

import k6.AbstractC1356c;

/* renamed from: b0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772u extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public O f10100a;

    /* renamed from: b, reason: collision with root package name */
    public M6.d f10101b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10103d;

    /* renamed from: e, reason: collision with root package name */
    public int f10104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0772u(O o7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f10103d = o7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10102c = obj;
        this.f10104e |= Integer.MIN_VALUE;
        return O.b(this.f10103d, this);
    }
}
