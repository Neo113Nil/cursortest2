package G6;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R4.c f3099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p010b0.r f3100b;

    public m(R4.c cVar, p010b0.r rVar) {
        this.f3099a = cVar;
        this.f3100b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // G6.g
    public final Object r(h hVar, p065i6.d dVar) throws Throwable {
        l lVar;
        m mVar;
        z zVar;
        p010b0.r rVar;
        H6.n nVar;
        Throwable th;
        H6.n nVar2;
        p010b0.r rVar2;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i7 = lVar.f3095b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.f3095b = i7 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, dVar);
            }
        } else {
            lVar = new l(this, dVar);
        }
        Object obj = lVar.f3094a;
        j6.a aVar = j6.a.f14648a;
        int i8 = lVar.f3095b;
        if (i8 == 0) {
            p003a.a.p0(obj);
            try {
                R4.c cVar = this.f3099a;
                lVar.f3097d = this;
                lVar.f3098e = hVar;
                lVar.f3095b = 1;
                if (cVar.r(hVar, lVar) == aVar) {
                    return aVar;
                }
                mVar = this;
                nVar = new H6.n(hVar, lVar.getContext());
                rVar2 = mVar.f3100b;
                lVar.f3097d = nVar;
                lVar.f3098e = null;
                lVar.f3095b = 3;
                if (rVar2.invoke(nVar, null, lVar) == aVar) {
                    return aVar;
                }
                nVar2 = nVar;
                nVar2.releaseIntercepted();
                return p044f6.i.f13014a;
            } catch (Throwable th2) {
                th = th2;
                mVar = this;
                zVar = new z(th);
                rVar = mVar.f3100b;
                lVar.f3097d = th;
                lVar.f3098e = null;
                lVar.f3095b = 2;
                if (x.a(zVar, rVar, th, lVar) == aVar) {
                    return aVar;
                }
                throw th;
            }
        }
        if (i8 != 1) {
            if (i8 == 2) {
                Throwable th3 = (Throwable) lVar.f3097d;
                p003a.a.p0(obj);
                throw th3;
            }
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar2 = (H6.n) lVar.f3097d;
            try {
                p003a.a.p0(obj);
                nVar2.releaseIntercepted();
                return p044f6.i.f13014a;
            } catch (Throwable th4) {
                th = th4;
                nVar2.releaseIntercepted();
                throw th;
            }
        }
        hVar = lVar.f3098e;
        mVar = (m) lVar.f3097d;
        try {
            p003a.a.p0(obj);
            nVar = new H6.n(hVar, lVar.getContext());
            try {
                rVar2 = mVar.f3100b;
                lVar.f3097d = nVar;
                lVar.f3098e = null;
                lVar.f3095b = 3;
                if (rVar2.invoke(nVar, null, lVar) == aVar) {
                    return aVar;
                }
                nVar2 = nVar;
                nVar2.releaseIntercepted();
                return p044f6.i.f13014a;
            } catch (Throwable th5) {
                th = th5;
                nVar2 = nVar;
                nVar2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            zVar = new z(th);
            rVar = mVar.f3100b;
            lVar.f3097d = th;
            lVar.f3098e = null;
            lVar.f3095b = 2;
            if (x.a(zVar, rVar, th, lVar) == aVar) {
                return aVar;
            }
            throw th;
        }
    }
}
