package z2;

import d2.C0279i;
import g0.C0310i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class c extends A2.f {

    /* renamed from: d, reason: collision with root package name */
    public final C0310i f10706d;

    /* renamed from: e, reason: collision with root package name */
    public final C0310i f10707e;

    public c(C0310i c0310i, g2.h hVar, int i3, int i4) {
        super(hVar, i3, i4);
        this.f10706d = c0310i;
        this.f10707e = c0310i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // A2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y2.o oVar, InterfaceC0319c interfaceC0319c) {
        b bVar;
        int i3;
        if (interfaceC0319c instanceof b) {
            bVar = (b) interfaceC0319c;
            int i4 = bVar.f10705g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.f10705g = i4 - Integer.MIN_VALUE;
                Object obj = bVar.f10704e;
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                i3 = bVar.f10705g;
                C0279i c0279i = C0279i.f4852a;
                if (i3 != 0) {
                    X0.a.L(obj);
                    bVar.f10703d = oVar;
                    bVar.f10705g = 1;
                    Object invoke = this.f10706d.invoke(oVar, bVar);
                    if (invoke != enumC0326a) {
                        invoke = c0279i;
                    }
                    if (invoke == enumC0326a) {
                        return enumC0326a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = bVar.f10703d;
                    X0.a.L(obj);
                }
                if (((y2.n) oVar).f10628d.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return c0279i;
            }
        }
        bVar = new b(this, (AbstractC0343b) interfaceC0319c);
        Object obj2 = bVar.f10704e;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = bVar.f10705g;
        C0279i c0279i2 = C0279i.f4852a;
        if (i3 != 0) {
        }
        if (((y2.n) oVar).f10628d.s()) {
        }
    }

    @Override // A2.f
    public final A2.f b(g2.h hVar, int i3, int i4) {
        return new c(this.f10707e, hVar, i3, i4);
    }

    @Override // A2.f
    public final String toString() {
        return "block[" + this.f10706d + "] -> " + super.toString();
    }
}
