package o0;

import k0.C2023c;
import k0.InterfaceC2025e;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18589l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f18590m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i) {
        super(1);
        this.f18589l = i;
        this.f18590m = xVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f18589l) {
            case 0:
                x xVar = this.f18590m;
                xVar.f18593d = true;
                xVar.f.invoke();
                return W3.o.f6046a;
            default:
                InterfaceC2025e interfaceC2025e = (InterfaceC2025e) obj;
                x xVar2 = this.f18590m;
                C2198b c2198b = xVar2.f18591b;
                float f = xVar2.f18598k;
                float f5 = xVar2.f18599l;
                v3.e B5 = interfaceC2025e.B();
                long A3 = B5.A();
                B5.v().k();
                try {
                    ((C2023c) B5.f20432l).z(f, f5, 0L);
                    c2198b.a(interfaceC2025e);
                    B5.v().j();
                    B5.P(A3);
                    return W3.o.f6046a;
                } catch (Throwable th) {
                    B5.v().j();
                    B5.P(A3);
                    throw th;
                }
        }
    }
}
