package G0;

import G4.l;
import W3.o;
import a3.AbstractC0467k;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1988b;

/* loaded from: classes.dex */
public final class e extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1793k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ float f1794l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f1795m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a4.c cVar) {
        super(2, cVar);
        this.f1795m = fVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        e eVar = new e(this.f1795m, cVar);
        eVar.f1794l = ((Number) obj).floatValue();
        return eVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(Float.valueOf(((Number) obj).floatValue()), (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1793k;
        if (i == 0) {
            l.N(obj);
            float f = this.f1794l;
            f fVar = this.f1795m;
            Object g5 = fVar.f1796a.f2114d.f2103k.g(H0.i.f2083e);
            if (g5 == null) {
                g5 = null;
            }
            i4.e eVar = (i4.e) g5;
            if (eVar == null) {
                throw AbstractC0467k.u("Required value was null.");
            }
            C1988b c1988b = new C1988b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.f1793k = 1;
            obj = eVar.invoke(c1988b, this);
            if (obj == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((C1988b) obj).f17191a & 4294967295L)));
    }
}
