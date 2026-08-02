package H0;

import m4.InterfaceC2105h;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2108l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f2109m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i) {
        super(1);
        this.f2108l = i;
        this.f2109m = str;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        W3.o oVar = W3.o.f6046a;
        String str = this.f2109m;
        switch (this.f2108l) {
            case 0:
                InterfaceC2105h[] interfaceC2105hArr = u.f2183a;
                ((j) obj).f(s.f2157a, AbstractC2346c.A(str));
                break;
            default:
                j jVar = (j) obj;
                InterfaceC2105h[] interfaceC2105hArr2 = u.f2183a;
                jVar.f(s.f2157a, AbstractC2346c.A(str));
                u.b(jVar, 5);
                break;
        }
        return oVar;
    }
}
