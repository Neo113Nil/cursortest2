package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/NoIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "drawIndication", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class NoIndicationInstance implements androidx.compose.foundation.IndicationInstance {
    public static final androidx.compose.foundation.NoIndicationInstance INSTANCE = new androidx.compose.foundation.NoIndicationInstance();

    private NoIndicationInstance() {
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public final void drawIndication(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
    }
}
