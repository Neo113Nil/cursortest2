package Ve;

import Lm0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Ve.nc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4470nc extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4245fi f31653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4470nc(AbstractC4245fi abstractC4245fi) {
        super(0);
        this.f31653b = abstractC4245fi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a.b bVar = Lm0.a.f17149a;
        bVar.b("setState");
        bVar.d("setOnlyOutcomeState: " + this.f31653b, new Object[0]);
        return Unit.f71690a;
    }
}
