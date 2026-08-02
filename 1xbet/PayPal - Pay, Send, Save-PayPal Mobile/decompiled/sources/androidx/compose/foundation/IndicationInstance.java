package androidx.compose.foundation;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "IndicationInstance has been deprecated along with the rememberUpdatedInstance that returns it. Indication implementations should instead use Modifier.Node APIs, and should be returned from IndicationNodeFactory#create. For a migration guide and background information, please visit developer.android.com")
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/IndicationInstance;", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "drawIndication", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IndicationInstance {
    void drawIndication(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope);
}
