package Yi0;

import androidx.activity.ActivityC5043j;
import androidx.activity.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import mf0.InterfaceC8142d;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f35128b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ActivityC5043j f35129c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f35130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(d dVar, ActivityC5043j activityC5043j, InterfaceC8142d interfaceC8142d) {
        super(0);
        this.f35128b = dVar;
        this.f35129c = activityC5043j;
        this.f35130d = interfaceC8142d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function2<J, InterfaceC8142d, Unit> c11 = this.f35128b.c();
        ActivityC5043j activityC5043j = this.f35129c;
        c11.invoke(activityC5043j != null ? activityC5043j.getOnBackPressedDispatcher() : null, this.f35130d);
        return Unit.f71690a;
    }
}
