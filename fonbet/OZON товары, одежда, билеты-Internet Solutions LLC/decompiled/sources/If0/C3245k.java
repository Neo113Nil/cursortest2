package If0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3245k extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3245k(Function1<? super I, Unit> function1) {
        super(0);
        this.f12445b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f12445b.invoke(C3238d.f12433a);
        return Unit.f71690a;
    }
}
