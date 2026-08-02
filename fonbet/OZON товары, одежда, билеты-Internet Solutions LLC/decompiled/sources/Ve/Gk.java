package Ve;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Gk extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J4 f29085b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gk(J4 j42) {
        super(1);
        this.f29085b = j42;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View it = (View) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ((N9) this.f29085b.u()).e0(C4101ai.f30677a);
        return Unit.f71690a;
    }
}
