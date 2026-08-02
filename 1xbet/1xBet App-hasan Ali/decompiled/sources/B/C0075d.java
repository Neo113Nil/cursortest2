package B;

import a3.AbstractC0467k;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import r0.AbstractC2346c;

/* renamed from: B.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075d implements b0.n {

    /* renamed from: k, reason: collision with root package name */
    public boolean f670k;

    /* renamed from: l, reason: collision with root package name */
    public a4.j f671l;

    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(AbstractC0542c abstractC0542c) {
        C0074c c0074c;
        int i;
        a4.j jVar;
        if (abstractC0542c instanceof C0074c) {
            c0074c = (C0074c) abstractC0542c;
            int i5 = c0074c.f669n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0074c.f669n = i5 - Integer.MIN_VALUE;
                Object obj = c0074c.f667l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c0074c.f669n;
                W3.o oVar = W3.o.f6046a;
                if (i != 0) {
                    G4.l.N(obj);
                    if (!this.f670k) {
                        a4.j jVar2 = this.f671l;
                        c0074c.f666k = jVar2;
                        c0074c.f669n = 1;
                        a4.j jVar3 = new a4.j(AbstractC2346c.v(c0074c), EnumC0510a.f7290l);
                        this.f671l = jVar3;
                        if (jVar3.b() == enumC0510a) {
                            return enumC0510a;
                        }
                        jVar = jVar2;
                    }
                    return oVar;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = c0074c.f666k;
                G4.l.N(obj);
                if (jVar != null) {
                    jVar.resumeWith(oVar);
                }
                return oVar;
            }
        }
        c0074c = new C0074c(this, abstractC0542c);
        Object obj2 = c0074c.f667l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c0074c.f669n;
        W3.o oVar2 = W3.o.f6046a;
        if (i != 0) {
        }
        if (jVar != null) {
        }
        return oVar2;
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }
}
