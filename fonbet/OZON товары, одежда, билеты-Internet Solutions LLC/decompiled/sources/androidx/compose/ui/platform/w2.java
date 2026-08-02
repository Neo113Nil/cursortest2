package androidx.compose.ui.platform;

import S0.C3988v;
import a1.C4912a;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class w2 extends AbstractC7737t implements Function1<AndroidComposeView.b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x2 f41040b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f41041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w2(x2 x2Var, C4912a c4912a) {
        super(1);
        this.f41040b = x2Var;
        this.f41041c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AndroidComposeView.b bVar) {
        boolean z11;
        AbstractC5434v abstractC5434v;
        AndroidComposeView.b bVar2 = bVar;
        x2 x2Var = this.f41040b;
        z11 = x2Var.f41048c;
        if (!z11) {
            AbstractC5434v lifecycle = bVar2.a().getLifecycle();
            C4912a c4912a = this.f41041c;
            x2Var.f41050e = c4912a;
            abstractC5434v = x2Var.f41049d;
            if (abstractC5434v == null) {
                x2Var.f41049d = lifecycle;
                lifecycle.a(x2Var);
            } else if (lifecycle.b().a(AbstractC5434v.b.CREATED)) {
                ((C3988v) x2Var.w()).k(new C4912a(true, -2000640158, new v2(x2Var, c4912a)));
            }
        }
        return Unit.f71690a;
    }
}
