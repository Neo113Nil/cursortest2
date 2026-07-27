package G4;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class n extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public N2.m f1089a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1090b;

    /* renamed from: c, reason: collision with root package name */
    public int f1091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N2.m f1092d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(N2.m mVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1092d = mVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1090b = obj;
        this.f1091c |= Integer.MIN_VALUE;
        return this.f1092d.b(null, this);
    }
}
