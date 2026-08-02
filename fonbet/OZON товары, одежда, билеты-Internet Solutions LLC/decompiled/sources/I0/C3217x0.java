package I0;

import I0.A0;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", l = {739}, m = "invokeSuspend")
/* renamed from: I0.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3217x0 extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f11655d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f11656e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<C7459e, Unit> f11657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3217x0(Function1<? super C7459e, Unit> function1, kotlin.coroutines.d<? super C3217x0> dVar) {
        super(2, dVar);
        this.f11657f = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3217x0 c3217x0 = new C3217x0(this.f11657f, dVar);
        c3217x0.f11656e = obj;
        return c3217x0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3217x0) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f11655d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC10628c interfaceC10628c = (InterfaceC10628c) this.f11656e;
            this.f11655d = 1;
            obj = C9115P.h(interfaceC10628c, EnumC10640o.Main, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        x1.x xVar = (x1.x) obj;
        if (xVar != null) {
            ((A0.a) this.f11657f).invoke(C7459e.a(xVar.f()));
        }
        return Unit.f71690a;
    }
}
