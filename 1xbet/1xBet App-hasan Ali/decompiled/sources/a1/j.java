package a1;

import A0.D;
import android.os.Handler;
import android.os.Looper;
import i4.InterfaceC2015a;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f6408m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(w wVar, int i) {
        super(1);
        this.f6407l = i;
        this.f6408m = wVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f6407l) {
            case 0:
                InterfaceC2637x l5 = ((InterfaceC2637x) obj).l();
                kotlin.jvm.internal.l.c(l5);
                this.f6408m.l(l5);
                break;
            case 1:
                W0.l lVar = new W0.l(((W0.l) obj).f6015a);
                w wVar = this.f6408m;
                wVar.m9setPopupContentSizefhxjrPA(lVar);
                wVar.m();
                break;
            default:
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) obj;
                w wVar2 = this.f6408m;
                Handler handler = wVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC2015a.invoke();
                } else {
                    Handler handler2 = wVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new D(interfaceC2015a, 1));
                    }
                }
                break;
        }
        return W3.o.f6046a;
    }
}
