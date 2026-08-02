package R10;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;

/* loaded from: classes7.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComposerListBehavior f24239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ComposerListBehavior composerListBehavior) {
        super(0);
        this.f24239b = composerListBehavior;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ComposerListBehavior composerListBehavior = this.f24239b;
        if (composerListBehavior != null) {
            composerListBehavior.v(true);
        }
        return Unit.f71690a;
    }
}
