package G4;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class h extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1063a;

    /* renamed from: b, reason: collision with root package name */
    public int f1064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f1065c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1066d;

    /* renamed from: e, reason: collision with root package name */
    public e f1067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1065c = iVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1063a = obj;
        this.f1064b |= Integer.MIN_VALUE;
        return this.f1065c.i(null, this);
    }
}
