package N2;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* renamed from: N2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121l extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2099a;

    /* renamed from: b, reason: collision with root package name */
    public int f2100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0121l(m mVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f2101c = mVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f2099a = obj;
        this.f2100b |= Integer.MIN_VALUE;
        return this.f2101c.b(null, this);
    }
}
