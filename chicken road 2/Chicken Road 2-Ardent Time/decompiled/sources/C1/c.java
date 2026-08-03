package C1;

/* loaded from: classes.dex */
public final class c extends D1.f {

    /* renamed from: d, reason: collision with root package name */
    public final Z.i f119d;

    /* renamed from: e, reason: collision with root package name */
    public final Z.i f120e;

    public c(Z.i iVar, k1.i iVar2, int i2, int i3) {
        super(iVar2, i2, i3);
        this.f119d = iVar;
        this.f120e = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // D1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(B1.r rVar, k1.d dVar) {
        C1.b bVar;
        int i2;
        if (dVar instanceof C1.b) {
            bVar = (C1.b) dVar;
            int i3 = bVar.f118g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f118g = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.f116e;
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                i2 = bVar.f118g;
                h1.C0177i c0177i = h1.C0177i.f3302a;
                if (i2 != 0) {
                    a.AbstractC0059a.A(obj);
                    bVar.f115d = rVar;
                    bVar.f118g = 1;
                    java.lang.Object invoke = this.f119d.invoke(rVar, bVar);
                    if (invoke != enumC0927a) {
                        invoke = c0177i;
                    }
                    if (invoke == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = bVar.f115d;
                    a.AbstractC0059a.A(obj);
                }
                if (((B1.q) rVar).f55d.s()) {
                    throw new java.lang.IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return c0177i;
            }
        }
        bVar = new C1.b(this, (m1.AbstractC0931b) dVar);
        java.lang.Object obj2 = bVar.f116e;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = bVar.f118g;
        h1.C0177i c0177i2 = h1.C0177i.f3302a;
        if (i2 != 0) {
        }
        if (((B1.q) rVar).f55d.s()) {
        }
    }

    @Override // D1.f
    public final D1.f b(k1.i iVar, int i2, int i3) {
        return new C1.c(this.f120e, iVar, i2, i3);
    }

    @Override // D1.f
    public final java.lang.String toString() {
        return "block[" + this.f119d + "] -> " + super.toString();
    }
}
