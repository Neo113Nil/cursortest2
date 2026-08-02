package I90;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment$initViewElements$$inlined$observe$1", f = "FintechThemeFragment.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12029d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f12030e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ FintechThemeFragment f12031f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f12032g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ FinToolbarView f12033h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment$initViewElements$$inlined$observe$1$1", f = "FintechThemeFragment.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: I90.a$a, reason: collision with other inner class name */
    public static final class C0234a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12034d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f12035e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FinToolbarView f12036f;

        /* renamed from: I90.a$a$a, reason: collision with other inner class name */
        public static final class C0235a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FinToolbarView f12037a;

            public C0235a(FinToolbarView finToolbarView) {
                this.f12037a = finToolbarView;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                FinToolbarState finToolbarState = (FinToolbarState) t2;
                if (finToolbarState != null) {
                    this.f12037a.bindState(finToolbarState);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0234a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FinToolbarView finToolbarView) {
            super(2, dVar);
            this.f12035e = interfaceC2395h;
            this.f12036f = finToolbarView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C0234a(this.f12035e, dVar, this.f12036f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0234a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12034d;
            if (i11 == 0) {
                s.b(obj);
                C0235a c0235a = new C0235a(this.f12036f);
                this.f12034d = 1;
                if (this.f12035e.collect(c0235a, this) == aVar) {
                    return aVar;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FintechThemeFragment fintechThemeFragment, InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FinToolbarView finToolbarView) {
        super(2, dVar);
        this.f12031f = fintechThemeFragment;
        this.f12032g = interfaceC2395h;
        this.f12033h = finToolbarView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        a aVar = new a(this.f12031f, this.f12032g, dVar, this.f12033h);
        aVar.f12030e = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12029d;
        if (i11 == 0) {
            s.b(obj);
            if (N.f((M) this.f12030e)) {
                J viewLifecycleOwner = this.f12031f.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                C0234a c0234a = new C0234a(this.f12032g, null, this.f12033h);
                this.f12029d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, c0234a, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Unit.f71690a;
    }
}
