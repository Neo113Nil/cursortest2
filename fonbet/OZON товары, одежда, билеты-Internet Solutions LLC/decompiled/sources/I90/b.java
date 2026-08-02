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
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment$initViewElements$$inlined$observe$2", f = "FintechThemeFragment.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12038d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f12039e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ FintechThemeFragment f12040f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f12041g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ FintechThemeFragment f12042h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment$initViewElements$$inlined$observe$2$1", f = "FintechThemeFragment.kt", l = {34}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12043d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f12044e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FintechThemeFragment f12045f;

        /* renamed from: I90.b$a$a, reason: collision with other inner class name */
        public static final class C0236a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FintechThemeFragment f12046a;

            public C0236a(FintechThemeFragment fintechThemeFragment) {
                this.f12046a = fintechThemeFragment;
            }

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
            
                r2 = r0.f12046a.f96992b;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                v90.d dVar2;
                K90.a aVar = (K90.a) t2;
                if (aVar != null && dVar2 != null) {
                    dVar2.f102602b.b(aVar);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechThemeFragment fintechThemeFragment) {
            super(2, dVar);
            this.f12044e = interfaceC2395h;
            this.f12045f = fintechThemeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f12044e, dVar, this.f12045f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12043d;
            if (i11 == 0) {
                s.b(obj);
                C0236a c0236a = new C0236a(this.f12045f);
                this.f12043d = 1;
                if (this.f12044e.collect(c0236a, this) == aVar) {
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
    public b(FintechThemeFragment fintechThemeFragment, InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechThemeFragment fintechThemeFragment2) {
        super(2, dVar);
        this.f12040f = fintechThemeFragment;
        this.f12041g = interfaceC2395h;
        this.f12042h = fintechThemeFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        b bVar = new b(this.f12040f, this.f12041g, dVar, this.f12042h);
        bVar.f12039e = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12038d;
        if (i11 == 0) {
            s.b(obj);
            if (N.f((M) this.f12039e)) {
                J viewLifecycleOwner = this.f12040f.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f12041g, null, this.f12042h);
                this.f12038d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
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
