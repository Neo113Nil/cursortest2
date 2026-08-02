package B90;

import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3143b;

    public /* synthetic */ d0(Object obj, int i11) {
        this.f3142a = i11;
        this.f3143b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3142a) {
            case 0:
                v0.t0((v0) this.f3143b);
                break;
            case 1:
                Y6.o.b((Y6.o) this.f3143b);
                break;
            case 2:
                d0.J.k((d0.J) this.f3143b);
                break;
            default:
                FintechWebViewFragmentBase.t((FintechWebViewFragmentBase) this.f3143b);
                break;
        }
    }
}
