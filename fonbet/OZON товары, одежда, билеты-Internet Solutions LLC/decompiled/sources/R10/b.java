package R10;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComposerListBehavior f24238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(ComposerListBehavior composerListBehavior) {
        super(0);
        this.f24238b = composerListBehavior;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ComposerListBehavior composerListBehavior = this.f24238b;
        if (composerListBehavior != null) {
            composerListBehavior.v(true);
        }
        return Unit.f71690a;
    }
}
