package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/IndicationModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/foundation/IndicationInstance;", "p0", "<init>", "(Landroidx/compose/foundation/IndicationInstance;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/IndicationInstance;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class IndicationModifier implements androidx.compose.ui.draw.DrawModifier {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.IndicationInstance getHighResolutionOutputSizeshNQ4ISI;

    public IndicationModifier(androidx.compose.foundation.IndicationInstance indicationInstance) {
        this.getHighResolutionOutputSizeshNQ4ISI = indicationInstance;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        this.getHighResolutionOutputSizeshNQ4ISI.drawIndication(contentDrawScope);
    }
}
