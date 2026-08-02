package a1;

import A0.Y0;
import P.AbstractC0329z;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class i extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f6404k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6405l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f6406m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w wVar, a4.c cVar) {
        super(2, cVar);
        this.f6406m = wVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        i iVar = new i(this.f6406m, cVar);
        iVar.f6405l = obj;
        return iVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2280u interfaceC2280u;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f6404k;
        if (i == 0) {
            G4.l.N(obj);
            interfaceC2280u = (InterfaceC2280u) this.f6405l;
            if (AbstractC2282w.o(interfaceC2280u)) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2280u = (InterfaceC2280u) this.f6405l;
            G4.l.N(obj);
            w wVar = this.f6406m;
            int[] iArr = wVar.K;
            int i5 = iArr[0];
            int i6 = iArr[1];
            wVar.f6460v.getLocationOnScreen(iArr);
            if (i5 == iArr[0] || i6 != iArr[1]) {
                wVar.k();
            }
            if (AbstractC2282w.o(interfaceC2280u)) {
                c cVar = c.f6382n;
                this.f6405l = interfaceC2280u;
                this.f6404k = 1;
                if (getContext().l(Y0.f424k) != null) {
                    throw new ClassCastException();
                }
                if (AbstractC0329z.q(getContext()).n(cVar, this) == enumC0510a) {
                    return enumC0510a;
                }
                w wVar2 = this.f6406m;
                int[] iArr2 = wVar2.K;
                int i52 = iArr2[0];
                int i62 = iArr2[1];
                wVar2.f6460v.getLocationOnScreen(iArr2);
                if (i52 == iArr2[0]) {
                }
                wVar2.k();
                if (AbstractC2282w.o(interfaceC2280u)) {
                    return W3.o.f6046a;
                }
            }
        }
    }
}
