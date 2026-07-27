package s0;

import D4.InterfaceC0022w;
import androidx.work.CoroutineWorker;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417e extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public l f11770a;

    /* renamed from: b, reason: collision with root package name */
    public int f11771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f11773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417e(l lVar, CoroutineWorker coroutineWorker, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f11772c = lVar;
        this.f11773d = coroutineWorker;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new C1417e(this.f11772c, this.f11773d, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1417e) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f11771b;
        if (i2 == 0) {
            e5.g.y(obj);
            l lVar2 = this.f11772c;
            this.f11770a = lVar2;
            this.f11771b = 1;
            Object foregroundInfo = this.f11773d.getForegroundInfo(this);
            if (foregroundInfo == enumC1260a) {
                return enumC1260a;
            }
            lVar = lVar2;
            obj = foregroundInfo;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.f11770a;
            e5.g.y(obj);
        }
        lVar.f11785a.k(obj);
        return f4.v.f5689a;
    }
}
