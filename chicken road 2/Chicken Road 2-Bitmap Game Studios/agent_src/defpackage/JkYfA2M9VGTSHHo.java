package defpackage;

import androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class JkYfA2M9VGTSHHo implements Function1 {
    public final /* synthetic */ CacheDrawScopeDragShadowCallback b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ JkYfA2M9VGTSHHo(CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = cacheDrawScopeDragShadowCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                GraphicsLayer graphicsLayer = cacheDrawScopeDragShadowCallback.yzPsTade5rL7D3;
                graphicsLayer.getClass();
                GraphicsLayerKt.yzPsTade5rL7D3((ContentDrawScope) obj, graphicsLayer);
                return unit;
            default:
                DrawScope drawScope = (DrawScope) obj;
                GraphicsLayer graphicsLayer2 = cacheDrawScopeDragShadowCallback.yzPsTade5rL7D3;
                if (graphicsLayer2 != null) {
                    GraphicsLayerKt.yzPsTade5rL7D3(drawScope, graphicsLayer2);
                    return unit;
                }
                yzPsTade5rL7D3.yRx9jbDCTnXb3("No cached drag shadow. Check if the drag source node was rendered first");
                return null;
        }
    }
}
