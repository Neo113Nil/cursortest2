package D90;

import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.C4005g;
import Sc.s;
import Sc.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingViewModel$evaluateJavascript$1", f = "FintechNativeBridgeTestingViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6204d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j f6205e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f6206f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f6207g;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6208a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f6210c;

        a(String str, String str2, j jVar) {
            this.f6208a = str;
            this.f6209b = str2;
            this.f6210c = jVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            v vVar = (v) obj;
            String str = (String) vVar.a();
            String str2 = (String) vVar.b();
            String str3 = (String) vVar.d();
            if (!Intrinsics.d(this.f6208a, str2) || !Intrinsics.d(this.f6209b, str3)) {
                return Unit.f71690a;
            }
            Object emit = this.f6210c.h0().emit(str, dVar);
            return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, String str, String str2, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f6205e = jVar;
        this.f6206f = str;
        this.f6207g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f6205e, this.f6206f, this.f6207g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0<v<String, String, String>> h11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6204d;
        if (i11 == 0) {
            s.b(obj);
            j jVar = this.f6205e;
            U80.a e02 = j.e0(jVar);
            if (e02 == null || (h11 = e02.h()) == null) {
                return Unit.f71690a;
            }
            a aVar2 = new a(this.f6206f, this.f6207g, jVar);
            this.f6204d = 1;
            if (h11.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
