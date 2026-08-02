package Ri0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Am.C2438a;
import Sc.s;
import androidx.lifecycle.w0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mj0.InterfaceC8344a;
import org.jetbrains.annotations.NotNull;
import sj0.InterfaceC9701a;
import wi0.C10564a;

/* loaded from: classes3.dex */
public final class b extends w0 {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f25124e = {C2438a.c(b.class, "handleIntentThrottle", "getHandleIntentThrottle()Lru/ozon/tracker/debug/menu/shared/utils/ThrottleJob;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<ij0.e> f25125a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<Ti0.a> f25126b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<Ti0.a> f25127c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Dj0.d f25128d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.presentation.screen.main.MainDebugMenuViewModel$handleIntent$1", f = "MainDebugMenuViewModel.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f25129d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Si0.a f25130e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f25131f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Si0.a aVar, b bVar, kotlin.coroutines.d dVar) {
            super(1, dVar);
            this.f25130e = aVar;
            this.f25131f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f25130e, this.f25131f, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f25129d;
            if (i11 == 0) {
                s.b(obj);
                if (this.f25130e != null) {
                    this.f25129d = 1;
                    if (b.d0(this.f25131f, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public b(@NotNull InterfaceC9701a<Hi0.a> coreMainMenuBuilder, @NotNull Ib.a<ij0.e> resetConfigsLazy) {
        Intrinsics.checkNotNullParameter(coreMainMenuBuilder, "coreMainMenuBuilder");
        Intrinsics.checkNotNullParameter(resetConfigsLazy, "resetConfigsLazy");
        this.f25125a = resetConfigsLazy;
        x0<Ti0.a> a11 = O0.a(new Ti0.a(coreMainMenuBuilder.build()));
        this.f25126b = a11;
        this.f25127c = C2399j.b(a11);
        this.f25128d = new Dj0.d();
    }

    public static final Object d0(b bVar, kotlin.coroutines.d dVar) {
        ij0.e eVar = bVar.f25125a.get();
        Intrinsics.checkNotNullExpressionValue(eVar, "get(...)");
        Object a11 = C10564a.a(eVar, (kotlin.coroutines.jvm.internal.j) dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public final void e0(@NotNull InterfaceC8344a intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ((Dj0.b) this.f25128d.getValue(this, f25124e[0])).a(new a((Si0.a) intent, this, null));
    }

    @NotNull
    public final M0<Ti0.a> getUiState() {
        return this.f25127c;
    }
}
