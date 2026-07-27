package G4;

import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class c extends H4.f {

    /* renamed from: d, reason: collision with root package name */
    public final m0.j f1052d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.j f1053e;

    public c(m0.j jVar, InterfaceC1223i interfaceC1223i, int i2, int i3) {
        super(interfaceC1223i, i2, i3);
        this.f1052d = jVar;
        this.f1053e = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // H4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(F4.q qVar, InterfaceC1218d interfaceC1218d) {
        b bVar;
        int i2;
        if (interfaceC1218d instanceof b) {
            bVar = (b) interfaceC1218d;
            int i3 = bVar.f1051d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f1051d = i3 - Integer.MIN_VALUE;
                Object obj = bVar.f1049b;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = bVar.f1051d;
                f4.v vVar = f4.v.f5689a;
                if (i2 != 0) {
                    e5.g.y(obj);
                    bVar.f1048a = qVar;
                    bVar.f1051d = 1;
                    Object invoke = this.f1052d.invoke(qVar, bVar);
                    if (invoke != enumC1260a) {
                        invoke = vVar;
                    }
                    if (invoke == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = bVar.f1048a;
                    e5.g.y(obj);
                }
                if (((F4.p) qVar).f739d.t()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return vVar;
            }
        }
        bVar = new b(this, (AbstractC1295c) interfaceC1218d);
        Object obj2 = bVar.f1049b;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = bVar.f1051d;
        f4.v vVar2 = f4.v.f5689a;
        if (i2 != 0) {
        }
        if (((F4.p) qVar).f739d.t()) {
        }
    }

    @Override // H4.f
    public final H4.f c(InterfaceC1223i interfaceC1223i, int i2, int i3) {
        return new c(this.f1053e, interfaceC1223i, i2, i3);
    }

    @Override // H4.f
    public final String toString() {
        return "block[" + this.f1052d + "] -> " + super.toString();
    }
}
