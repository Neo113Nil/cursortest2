package Ya0;

import S0.InterfaceC3967k;
import androidx.activity.J;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import mf0.InterfaceC8142d;
import ru.ozon.uni.ozi.components.navBar.addons.OziNavBarTopKt;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f34885b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J f34886c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f34887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, J j11, InterfaceC8142d interfaceC8142d) {
        super(2);
        this.f34885b = cVar;
        this.f34886c = j11;
        this.f34887d = interfaceC8142d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = e.f40358c0;
            c cVar = this.f34885b;
            e oziResourceIdTestTag = OziTestTagsKt.oziResourceIdTestTag(aVar, cVar.d(), interfaceC3967k2, 6);
            String e11 = cVar.e();
            interfaceC3967k2.o(-1481033227);
            boolean n11 = interfaceC3967k2.n(cVar);
            J j11 = this.f34886c;
            boolean F11 = n11 | interfaceC3967k2.F(j11);
            InterfaceC8142d interfaceC8142d = this.f34887d;
            boolean F12 = F11 | interfaceC3967k2.F(interfaceC8142d);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(cVar, j11, interfaceC8142d);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            OziNavBarTopKt.m3118OziNavBarTopyKJFJhA((Function0) C11, e11, null, null, oziResourceIdTestTag, false, null, 0, 0, null, 0.0f, interfaceC3967k2, 0, 0, 2028);
        }
        return Unit.f71690a;
    }
}
