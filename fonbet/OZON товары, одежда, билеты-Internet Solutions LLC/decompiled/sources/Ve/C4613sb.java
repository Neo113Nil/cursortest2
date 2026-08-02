package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;
import xe.InterfaceC10756x;

/* renamed from: Ve.sb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4613sb extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f32034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4183dd f32035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Hd f32036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f32037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4613sb(C4183dd c4183dd, Hd hd2, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f32035e = c4183dd;
        this.f32036f = hd2;
        this.f32037g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4613sb(this.f32035e, this.f32036f, this.f32037g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4613sb) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32034d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4183dd c4183dd = this.f32035e;
            C4248fl c4248fl = c4183dd.f30873d;
            EnumC4290h5 tag = EnumC4290h5.BNPL;
            c4248fl.getClass();
            Intrinsics.checkNotNullParameter(tag, "tag");
            InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) c4248fl.f31050d.get(tag);
            if (interfaceC4678ui != null) {
                interfaceC4678ui.a(new Ja(false));
            }
            this.f32034d = 1;
            InterfaceC10756x b11 = xe.X0.b();
            xe.I i12 = this.f32037g;
            Object f7 = C10727i.f(i12.plus(b11), new Ac(c4183dd, this.f32036f, i12, null), this);
            if (f7 != obj2) {
                f7 = Unit.f71690a;
            }
            if (f7 == obj2) {
                return obj2;
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
