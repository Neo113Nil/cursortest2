package G6;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;

/* loaded from: classes2.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R4.c f3099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.r f3100b;

    public m(R4.c cVar, b0.r rVar) {
        this.f3099a = cVar;
        this.f3100b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // G6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(h hVar, InterfaceC1287d interfaceC1287d) {
        l lVar;
        j6.a aVar;
        int i7;
        m mVar;
        z zVar;
        b0.r rVar;
        H6.n nVar;
        Throwable th;
        H6.n nVar2;
        b0.r rVar2;
        try {
            if (interfaceC1287d instanceof l) {
                lVar = (l) interfaceC1287d;
                int i8 = lVar.f3095b;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    lVar.f3095b = i8 - Integer.MIN_VALUE;
                    Object obj = lVar.f3094a;
                    aVar = j6.a.f14642a;
                    i7 = lVar.f3095b;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        try {
                            R4.c cVar = this.f3099a;
                            lVar.f3097d = this;
                            lVar.f3098e = hVar;
                            lVar.f3095b = 1;
                            if (cVar.r(hVar, lVar) == aVar) {
                                return aVar;
                            }
                            mVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            mVar = this;
                            zVar = new z(th);
                            rVar = mVar.f3100b;
                            lVar.f3097d = th;
                            lVar.f3098e = null;
                            lVar.f3095b = 2;
                            if (x.a(zVar, rVar, th, lVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                Throwable th3 = (Throwable) lVar.f3097d;
                                AbstractC0603a.p0(obj);
                                throw th3;
                            }
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar2 = (H6.n) lVar.f3097d;
                            try {
                                AbstractC0603a.p0(obj);
                                nVar2.releaseIntercepted();
                                return C1116i.f13008a;
                            } catch (Throwable th4) {
                                th = th4;
                                nVar2.releaseIntercepted();
                                throw th;
                            }
                        }
                        hVar = lVar.f3098e;
                        mVar = (m) lVar.f3097d;
                        try {
                            AbstractC0603a.p0(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            zVar = new z(th);
                            rVar = mVar.f3100b;
                            lVar.f3097d = th;
                            lVar.f3098e = null;
                            lVar.f3095b = 2;
                            if (x.a(zVar, rVar, th, lVar) != aVar) {
                            }
                        }
                    }
                    nVar = new H6.n(hVar, lVar.getContext());
                    rVar2 = mVar.f3100b;
                    lVar.f3097d = nVar;
                    lVar.f3098e = null;
                    lVar.f3095b = 3;
                    if (rVar2.invoke(nVar, null, lVar) != aVar) {
                        return aVar;
                    }
                    nVar2 = nVar;
                    nVar2.releaseIntercepted();
                    return C1116i.f13008a;
                }
            }
            rVar2 = mVar.f3100b;
            lVar.f3097d = nVar;
            lVar.f3098e = null;
            lVar.f3095b = 3;
            if (rVar2.invoke(nVar, null, lVar) != aVar) {
            }
        } catch (Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.releaseIntercepted();
            throw th;
        }
        lVar = new l(this, interfaceC1287d);
        Object obj2 = lVar.f3094a;
        aVar = j6.a.f14642a;
        i7 = lVar.f3095b;
        if (i7 != 0) {
        }
        nVar = new H6.n(hVar, lVar.getContext());
    }
}
