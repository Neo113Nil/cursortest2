package a1;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f6443l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f6444m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W0.k f6445n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f6446o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f6447p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlin.jvm.internal.v vVar, w wVar, W0.k kVar, long j5, long j6) {
        super(0);
        this.f6443l = vVar;
        this.f6444m = wVar;
        this.f6445n = kVar;
        this.f6446o = j5;
        this.f6447p = j6;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        w wVar = this.f6444m;
        z positionProvider = wVar.getPositionProvider();
        W0.m parentLayoutDirection = wVar.getParentLayoutDirection();
        this.f6443l.f17623k = positionProvider.a(this.f6445n, this.f6446o, parentLayoutDirection, this.f6447p);
        return W3.o.f6046a;
    }
}
