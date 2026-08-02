package Ve;

import Ae.InterfaceC2397i;
import fd.InterfaceC6511n;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Rp extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public int f29874d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ InterfaceC2397i f29875e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Throwable f29876f;

    public Rp() {
        super(3, null);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Rp rp = new Rp(3, (kotlin.coroutines.d) obj3);
        rp.f29875e = (InterfaceC2397i) obj;
        rp.f29876f = (Throwable) obj2;
        return rp.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29874d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i = this.f29875e;
            Throwable th2 = this.f29876f;
            Lm0.a.f17149a.e("EncryptedDataStore::getDataFlow catch error " + th2, new Object[0]);
            this.f29875e = null;
            this.f29874d = 1;
            if (interfaceC2397i.emit(null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
