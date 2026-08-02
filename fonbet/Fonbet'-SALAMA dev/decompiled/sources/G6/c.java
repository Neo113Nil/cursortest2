package G6;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class c extends H6.f {

    /* renamed from: d, reason: collision with root package name */
    public final X0.k f3074d;

    /* renamed from: e, reason: collision with root package name */
    public final X0.k f3075e;

    public c(X0.k kVar, InterfaceC1292i interfaceC1292i, int i7, int i8) {
        super(interfaceC1292i, i7, i8);
        this.f3074d = kVar;
        this.f3075e = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // H6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(F6.p pVar, InterfaceC1287d interfaceC1287d) {
        b bVar;
        int i7;
        if (interfaceC1287d instanceof b) {
            bVar = (b) interfaceC1287d;
            int i8 = bVar.f3073d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f3073d = i8 - Integer.MIN_VALUE;
                Object obj = bVar.f3071b;
                j6.a aVar = j6.a.f14642a;
                i7 = bVar.f3073d;
                C1116i c1116i = C1116i.f13008a;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    bVar.f3070a = pVar;
                    bVar.f3073d = 1;
                    Object invoke = this.f3074d.invoke(pVar, bVar);
                    if (invoke != aVar) {
                        invoke = c1116i;
                    }
                    if (invoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = bVar.f3070a;
                    AbstractC0603a.p0(obj);
                }
                if (((F6.o) pVar).f2831d.r()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return c1116i;
            }
        }
        bVar = new b(this, (AbstractC1356c) interfaceC1287d);
        Object obj2 = bVar.f3071b;
        j6.a aVar2 = j6.a.f14642a;
        i7 = bVar.f3073d;
        C1116i c1116i2 = C1116i.f13008a;
        if (i7 != 0) {
        }
        if (((F6.o) pVar).f2831d.r()) {
        }
    }

    @Override // H6.f
    public final H6.f b(InterfaceC1292i interfaceC1292i, int i7, int i8) {
        return new c(this.f3075e, interfaceC1292i, i7, i8);
    }

    @Override // H6.f
    public final String toString() {
        return "block[" + this.f3074d + "] -> " + super.toString();
    }
}
