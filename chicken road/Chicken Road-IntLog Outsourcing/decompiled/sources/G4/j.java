package G4;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class j extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1070a;

    /* renamed from: b, reason: collision with root package name */
    public int f1071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.c f1072c;

    /* renamed from: d, reason: collision with root package name */
    public B0.c f1073d;

    /* renamed from: e, reason: collision with root package name */
    public e f1074e;

    /* renamed from: f, reason: collision with root package name */
    public H4.v f1075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(B0.c cVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1072c = cVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1070a = obj;
        this.f1071b |= Integer.MIN_VALUE;
        return this.f1072c.i(null, this);
    }
}
