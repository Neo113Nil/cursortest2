package b0;

import k6.AbstractC1356c;

/* renamed from: b0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777z extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public O f10120a;

    /* renamed from: b, reason: collision with root package name */
    public int f10121b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10123d;

    /* renamed from: e, reason: collision with root package name */
    public int f10124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777z(O o7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f10123d = o7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10122c = obj;
        this.f10124e |= Integer.MIN_VALUE;
        return this.f10123d.h(this);
    }
}
