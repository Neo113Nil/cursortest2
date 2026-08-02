package Ve;

import Ae.C2399j;
import Ae.C2405m;
import Ae.InterfaceC2397i;
import fd.InterfaceC6511n;
import kotlin.Unit;
import spay.sdk.domain.model.OrderScreenOutcome;

/* renamed from: Ve.wa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4727wa extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32351d;

    /* renamed from: e, reason: collision with root package name */
    public int f32352e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ InterfaceC2397i f32353f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f32354g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4727wa(int i11, int i12, kotlin.coroutines.d dVar) {
        super(i11, dVar);
        this.f32351d = i12;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC2397i interfaceC2397i = (InterfaceC2397i) obj;
        switch (this.f32351d) {
            case 0:
                C4727wa c4727wa = new C4727wa(3, 0, (kotlin.coroutines.d) obj3);
                c4727wa.f32353f = interfaceC2397i;
                c4727wa.f32354g = obj2;
                return c4727wa.invokeSuspend(Unit.f71690a);
            default:
                C4727wa c4727wa2 = new C4727wa(3, 1, (kotlin.coroutines.d) obj3);
                c4727wa2.f32353f = interfaceC2397i;
                c4727wa2.f32354g = (Throwable) obj2;
                return c4727wa2.invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32351d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f32352e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    InterfaceC2397i interfaceC2397i = this.f32353f;
                    C2405m c2405m = new C2405m(new OrderScreenOutcome((AbstractC4245fi) this.f32354g, null, null));
                    this.f32352e = 1;
                    if (C2399j.r(interfaceC2397i, c2405m, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f32352e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    InterfaceC2397i interfaceC2397i2 = this.f32353f;
                    Throwable th2 = (Throwable) this.f32354g;
                    Lm0.a.f17149a.e("DataStore::getDataFlow catch error " + th2, new Object[0]);
                    this.f32353f = null;
                    this.f32352e = 1;
                    if (interfaceC2397i2.emit(null, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4727wa() {
        super(3, null);
        this.f32351d = 1;
    }
}
