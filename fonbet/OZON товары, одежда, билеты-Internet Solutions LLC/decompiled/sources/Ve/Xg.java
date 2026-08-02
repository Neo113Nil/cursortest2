package Ve;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Xg extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4699va f30394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xg(C4699va c4699va) {
        super(1);
        this.f30394b = c4699va;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View it = (View) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ((C4318i4) this.f30394b.u()).f0(C4645te.f32100a);
        return Unit.f71690a;
    }
}
