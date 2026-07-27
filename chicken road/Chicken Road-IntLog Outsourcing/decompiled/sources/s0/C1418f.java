package s0;

import D4.InterfaceC0022w;
import androidx.work.CoroutineWorker;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418f extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f11774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f11775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418f(CoroutineWorker coroutineWorker, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f11775b = coroutineWorker;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new C1418f(this.f11775b, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1418f) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f11774a;
        CoroutineWorker coroutineWorker = this.f11775b;
        try {
            if (i2 == 0) {
                e5.g.y(obj);
                this.f11774a = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e5.g.y(obj);
            }
            coroutineWorker.getFuture$work_runtime_ktx_release().k((q) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture$work_runtime_ktx_release().l(th);
        }
        return f4.v.f5689a;
    }
}
