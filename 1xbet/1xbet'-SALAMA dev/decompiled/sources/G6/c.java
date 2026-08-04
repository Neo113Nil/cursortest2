package G6;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends H6.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X0.k f3074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X0.k f3075e;

    public c(X0.k kVar, p065i6.i iVar, int i7, int i8) {
        super(iVar, i7, i8);
        this.f3074d = kVar;
        this.f3075e = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // H6.f
    public final Object a(F6.p pVar, p065i6.d dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i7 = bVar.f3073d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f3073d = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (p077k6.c) dVar);
            }
        } else {
            bVar = new b(this, (p077k6.c) dVar);
        }
        Object obj = bVar.f3071b;
        j6.a aVar = j6.a.f14648a;
        int i8 = bVar.f3073d;
        p044f6.i iVar = p044f6.i.f13014a;
        if (i8 == 0) {
            p003a.a.p0(obj);
            bVar.f3070a = pVar;
            bVar.f3073d = 1;
            Object objInvoke = this.f3074d.invoke(pVar, bVar);
            if (objInvoke != aVar) {
                objInvoke = iVar;
            }
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = bVar.f3070a;
            p003a.a.p0(obj);
        }
        if (((F6.o) pVar).f2831d.r()) {
            return iVar;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // H6.f
    public final H6.f b(p065i6.i iVar, int i7, int i8) {
        return new c(this.f3075e, iVar, i7, i8);
    }

    @Override // H6.f
    public final String toString() {
        return "block[" + this.f3074d + "] -> " + super.toString();
    }
}
