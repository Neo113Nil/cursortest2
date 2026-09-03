package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements Function1 {
    public final /* synthetic */ GraphicsLayer b41X89IqSbKt;
    public final /* synthetic */ LazyLayoutItemAnimation gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ c3(GraphicsLayer graphicsLayer, LazyLayoutItemAnimation lazyLayoutItemAnimation, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = graphicsLayer;
        this.gmXBnHsR2YSm = lazyLayoutItemAnimation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        LazyLayoutItemAnimation lazyLayoutItemAnimation = this.gmXBnHsR2YSm;
        GraphicsLayer graphicsLayer = this.b41X89IqSbKt;
        Animatable animatable = (Animatable) obj;
        switch (i) {
            case 0:
                graphicsLayer.gmXBnHsR2YSm(((Number) animatable.oyjLVtGms9eZwJ0()).floatValue());
                lazyLayoutItemAnimation.ra306ClFT3HT.hRNgd2zGCE5kj();
                break;
            default:
                graphicsLayer.gmXBnHsR2YSm(((Number) animatable.oyjLVtGms9eZwJ0()).floatValue());
                lazyLayoutItemAnimation.ra306ClFT3HT.hRNgd2zGCE5kj();
                break;
        }
        return unit;
    }
}
