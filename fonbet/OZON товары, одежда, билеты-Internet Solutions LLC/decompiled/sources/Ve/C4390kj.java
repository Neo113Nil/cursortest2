package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Ve.kj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4390kj extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4744x f31447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4390kj(C4744x c4744x) {
        super(1);
        this.f31447b = c4744x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f31447b.f32405J = ((Number) obj).longValue();
        return Unit.f71690a;
    }
}
