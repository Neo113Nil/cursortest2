package R70;

import S70.a;
import Sc.s;
import androidx.lifecycle.x0;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import q50.C8989a;
import x40.C10656a;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class b extends C8989a {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final O70.a f24777n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private S70.a f24778o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f24779p;

    @e(c = "ru.ozon.fintech.features.pinpad.presentation.sheethow.PinPadSheetHowViewModel$onCreate$1", f = "PinPadSheetHowViewModel.kt", l = {41}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        b f24780d;

        /* renamed from: e, reason: collision with root package name */
        int f24781e;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24781e;
            if (i11 == 0) {
                s.b(obj);
                b bVar2 = b.this;
                O70.a aVar2 = bVar2.f24777n;
                S70.a aVar3 = bVar2.f24778o;
                this.f24780d = bVar2;
                this.f24781e = 1;
                Object a11 = aVar2.a(aVar3, this);
                if (a11 == aVar) {
                    return aVar;
                }
                bVar = bVar2;
                obj = a11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = this.f24780d;
                s.b(obj);
            }
            bVar.j0(h.E0(b.s0(bVar, (String) obj, bVar.f24778o)), null, new Integer(2), bVar.getUuid(), null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull O70.a repository, @NotNull InterfaceC6083a exchanger, @NotNull C10656a cbottomMapper2, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        super(cbottomMapper2, fintechAnalyticInteractor, exchanger);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f24777n = repository;
        this.f24778o = S70.a.SHEET_1;
    }

    public static final String s0(b bVar, String str, S70.a aVar) {
        String str2;
        List<a.EnumC0515a> b11 = aVar.b();
        if (b11 == null) {
            b11 = K.f71697a;
        }
        if (b11.isEmpty()) {
            return str;
        }
        for (a.EnumC0515a enumC0515a : b11) {
            Map<String, String> map = bVar.f24779p;
            if (map != null && (str2 = map.get(enumC0515a.name())) != null) {
                str = h.X(str, enumC0515a.toString(), str2, false);
            }
        }
        return str;
    }

    @Override // q50.C8989a, G40.a
    public final void g0() {
        super.g0();
        C10727i.c(x0.a(this), null, null, new a(null), 3);
    }

    public final void w0(@NotNull S70.a pinPadCbottomType, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(pinPadCbottomType, "pinPadCbottomType");
        this.f24778o = pinPadCbottomType;
        this.f24779p = map;
    }
}
