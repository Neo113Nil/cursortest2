package G4;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class k extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public l f1076a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1077b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1078c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f1079d;

    /* renamed from: e, reason: collision with root package name */
    public int f1080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1079d = lVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1078c = obj;
        this.f1080e |= Integer.MIN_VALUE;
        return this.f1079d.b(null, this);
    }
}
