package b00;

import S0.InterfaceC3967k;
import Sc.InterfaceC3999a;
import a00.C4911f;
import androidx.lifecycle.J;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Ll20/a;", "viewItem", "Lkotlin/Function0;", "", "content", "a", "(Ll20/a;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "Lkotlin/Function1;", "Lb00/d;", "init", "b", "(Lkotlin/jvm/functions/Function1;)Lb00/d;", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {
    public static final void a(@NotNull C7854a viewItem, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC3967k.o(148931277);
        J f7 = ((C4911f) interfaceC3967k.m(f.d())).f();
        if (f7 instanceof b) {
            interfaceC3967k.o(1611477005);
            InterfaceC6512o<C7854a, Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> a11 = d.f45587a.a();
            if (a11 != null) {
                interfaceC3967k.o(1611569602);
                a11.invoke(viewItem, content, interfaceC3967k, Integer.valueOf(i11 & 126));
                interfaceC3967k.k();
            } else {
                interfaceC3967k.o(1611625774);
                ((b) f7).ComposeWidgetWrapper(viewItem, content, interfaceC3967k, i11 & 126);
                interfaceC3967k.k();
            }
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(1611705723);
            content.invoke(interfaceC3967k, Integer.valueOf((i11 >> 3) & 14));
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
    }

    @InterfaceC3999a
    @NotNull
    public static final d b(@NotNull Function1<? super d, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        d dVar = d.f45587a;
        init.invoke(dVar);
        return dVar;
    }
}
