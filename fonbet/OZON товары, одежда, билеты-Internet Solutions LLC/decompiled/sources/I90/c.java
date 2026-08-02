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
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment$initViewElements$$inlined$observe$3", f = "FintechThemeFragment.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12047d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f12048e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ FintechThemeFragment f12049f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f12050g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ FintechThemeFragment f12051h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment$initViewElements$$inlined$observe$3$1", f = "FintechThemeFragment.kt", l = {34}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12052d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f12053e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FintechThemeFragment f12054f;

        /* renamed from: I90.c$a$a, reason: collision with other inner class name */
        public static final class C0237a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FintechThemeFragment f12055a;

            public C0237a(FintechThemeFragment fintechThemeFragment) {
                this.f12055a = fintechThemeFragment;
            }

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
            
                r0 = r3.f96992b;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                v90.d dVar2;
                v90.d dVar3;
                ToggleAtomWrapperState toggleAtomWrapperState = (ToggleAtomWrapperState) t2;
                FintechThemeFragment fintechThemeFragment = this.f12055a;
                if (toggleAtomWrapperState != null && dVar3 != null) {
                    dVar3.f102603c.bindState(toggleAtomWrapperState);
                }
                dVar2 = fintechThemeFragment.f96992b;
                if (dVar2 != null) {
                    dVar2.f102604d.setVisibility(toggleAtomWrapperState != null ? 0 : 8);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechThemeFragment fintechThemeFragment) {
            super(2, dVar);
            this.f12053e = interfaceC2395h;
            this.f12054f = fintechThemeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f12053e, dVar, this.f12054f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12052d;
            if (i11 == 0) {
                s.b(obj);
                C0237a c0237a = new C0237a(this.f12054f);
                this.f12052d = 1;
                if (this.f12053e.collect(c0237a, this) == aVar) {
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
    public c(FintechThemeFragment fintechThemeFragment, InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechThemeFragment fintechThemeFragment2) {
        super(2, dVar);
        this.f12049f = fintechThemeFragment;
        this.f12050g = interfaceC2395h;
        this.f12051h = fintechThemeFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        c cVar = new c(this.f12049f, this.f12050g, dVar, this.f12051h);
        cVar.f12048e = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12047d;
        if (i11 == 0) {
            s.b(obj);
            if (N.f((M) this.f12048e)) {
                J viewLifecycleOwner = this.f12049f.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f12050g, null, this.f12051h);
                this.f12047d = 1;
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
