package b0;

import k6.AbstractC1356c;

/* renamed from: b0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775x extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public O f10113a;

    /* renamed from: b, reason: collision with root package name */
    public M6.d f10114b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10116d;

    /* renamed from: e, reason: collision with root package name */
    public int f10117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0775x(O o7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f10116d = o7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10115c = obj;
        this.f10117e |= Integer.MIN_VALUE;
        return O.d(this.f10116d, this);
    }
}
