package androidx.compose.ui;

import S0.InterfaceC3967k;
import Sc.InterfaceC3999a;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5242e1;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    static final class a extends AbstractC7737t implements Function1<e.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40325b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(e.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    static final class b extends AbstractC7737t implements Function2<e, e.b, e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3967k f40326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3967k interfaceC3967k) {
            super(2);
            this.f40326b = interfaceC3967k;
        }

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(e eVar, e.b bVar) {
            e eVar2 = eVar;
            e.b bVar2 = bVar;
            if (bVar2 instanceof androidx.compose.ui.b) {
                InterfaceC6511n<e, InterfaceC3967k, Integer, e> a11 = ((androidx.compose.ui.b) bVar2).a();
                Intrinsics.g(a11, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                U.g(3, a11);
                e.a aVar = e.f40358c0;
                e.a aVar2 = e.a.f40359a;
                InterfaceC3967k interfaceC3967k = this.f40326b;
                bVar2 = c.e(interfaceC3967k, a11.invoke(aVar2, interfaceC3967k, 0));
            }
            return eVar2.l0(bVar2);
        }
    }

    @NotNull
    public static final e b(@NotNull e eVar, @NotNull Function1<? super C5242e1, Unit> function1, @NotNull InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, ? extends e> interfaceC6511n) {
        return eVar.l0(new androidx.compose.ui.b(interfaceC6511n, function1));
    }

    @InterfaceC3999a
    public static final e d(InterfaceC3967k interfaceC3967k, e eVar) {
        e.a aVar = e.f40358c0;
        return eVar == e.a.f40359a ? eVar : f(interfaceC3967k, new CompositionLocalMapInjectionElement(interfaceC3967k.d()).l0(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(InterfaceC3967k interfaceC3967k, e eVar) {
        if (eVar.w(a.f40325b)) {
            return eVar;
        }
        interfaceC3967k.B(1219399079);
        e.a aVar = e.f40358c0;
        e eVar2 = (e) eVar.t(e.a.f40359a, new b(interfaceC3967k));
        interfaceC3967k.K();
        return eVar2;
    }

    @NotNull
    public static final e f(@NotNull InterfaceC3967k interfaceC3967k, @NotNull e eVar) {
        interfaceC3967k.o(439770924);
        e e11 = e(interfaceC3967k, eVar);
        interfaceC3967k.k();
        return e11;
    }
}
