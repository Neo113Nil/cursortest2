package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.k6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4377k6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4092a9 f31420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4377k6(C4092a9 c4092a9, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31420d = c4092a9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4377k6(this.f31420d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4377k6(this.f31420d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Bi event = new Bi(EnumC4547q2.TOUCH_DECLINED_BY_USER, Ur.BNPL_VIEW, Pe.TOUCH, null, null, null, null, 120);
        C4092a9 c4092a9 = this.f31420d;
        c4092a9.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        c4092a9.f30497a.b(event);
        EnumC4290h5 tag = EnumC4290h5.BNPL;
        C4248fl c4248fl = c4092a9.f30647e;
        c4248fl.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) c4248fl.f31050d.get(tag);
        if (interfaceC4678ui != null) {
            interfaceC4678ui.a(new Ja(false));
        }
        ((C4238fb) c4092a9.f30646d).b(new Oc(Vf.f30201a, true));
        return Unit.f71690a;
    }
}
