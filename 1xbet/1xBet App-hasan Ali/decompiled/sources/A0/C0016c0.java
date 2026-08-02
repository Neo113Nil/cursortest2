package A0;

import P.InterfaceC0289e0;

/* renamed from: A0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016c0 implements P.J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f477b;

    public /* synthetic */ C0016c0(int i, Object obj) {
        this.f476a = i;
        this.f477b = obj;
    }

    @Override // P.J
    public final void a() {
        switch (this.f476a) {
            case 0:
                ((M0) this.f477b).f330l.invoke();
                break;
            case 1:
                ((B.p) this.f477b).f696d = null;
                break;
            case 2:
                ((B.A) this.f477b).f608c = null;
                break;
            case 3:
                B.w wVar = (B.w) this.f477b;
                int h3 = wVar.f721d.h();
                for (int i = 0; i < h3; i++) {
                    wVar.b();
                }
                break;
            case 4:
                ((I.O) this.f477b).k();
                break;
            case 5:
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) this.f477b;
                interfaceC0289e0.setValue((String) interfaceC0289e0.getValue());
                break;
            case 6:
                a1.u uVar = (a1.u) this.f477b;
                uVar.dismiss();
                a1.s sVar = uVar.f6441r;
                K1 k12 = sVar.f465m;
                if (k12 != null) {
                    k12.a();
                }
                sVar.f465m = null;
                sVar.requestLayout();
                break;
            default:
                a1.w wVar2 = (a1.w) this.f477b;
                K1 k13 = wVar2.f465m;
                if (k13 != null) {
                    k13.a();
                }
                wVar2.f465m = null;
                wVar2.requestLayout();
                androidx.lifecycle.L.l(wVar2, null);
                wVar2.f6462x.removeViewImmediate(wVar2);
                break;
        }
    }
}
