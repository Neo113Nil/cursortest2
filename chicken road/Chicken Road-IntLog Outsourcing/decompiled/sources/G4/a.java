package G4;

import h2.C0482c;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class a extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public H4.v f1044a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0482c f1046c;

    /* renamed from: d, reason: collision with root package name */
    public int f1047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0482c c0482c, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1046c = c0482c;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1045b = obj;
        this.f1047d |= Integer.MIN_VALUE;
        return this.f1046c.i(null, this);
    }
}
