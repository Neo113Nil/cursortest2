package androidx.compose.ui.tooling;

import S0.InterfaceC3967k;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41134b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41135c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object[] f41136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(String str, String str2, Object[] objArr) {
        super(2);
        this.f41134b = str;
        this.f41135c = str2;
        this.f41136d = objArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Object[] objArr = this.f41136d;
            W1.a.c(this.f41134b, this.f41135c, interfaceC3967k2, Arrays.copyOf(objArr, objArr.length));
        }
        return Unit.f71690a;
    }
}
