package defpackage;

import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class q4 implements Function1 {
    public final /* synthetic */ FloatProducer b41X89IqSbKt;
    public final /* synthetic */ float gmXBnHsR2YSm;
    public final /* synthetic */ boolean i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ q4(FloatProducer floatProducer, float f, boolean z, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = floatProducer;
        this.gmXBnHsR2YSm = f;
        this.i7xAcZoXXiIt = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        boolean z = this.i7xAcZoXXiIt;
        float f = this.gmXBnHsR2YSm;
        FloatProducer floatProducer = this.b41X89IqSbKt;
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        switch (i) {
            case 0:
                int i2 = NavigationDrawerKt.yzPsTade5rL7D3;
                float hRNgd2zGCE5kj = floatProducer.hRNgd2zGCE5kj();
                graphicsLayerScope.exVmIuryuB8HeQ(hRNgd2zGCE5kj > 0.0f ? 1.0f / ((hRNgd2zGCE5kj / f) + 1.0f) : 1.0f);
                graphicsLayerScope.pJp52Z5NdMAiw(TransformOriginKt.yzPsTade5rL7D3(z ? 0.0f : 1.0f, 0.0f));
                break;
            default:
                int i3 = NavigationDrawerKt.yzPsTade5rL7D3;
                float hRNgd2zGCE5kj2 = floatProducer.hRNgd2zGCE5kj();
                graphicsLayerScope.exVmIuryuB8HeQ(hRNgd2zGCE5kj2 > 0.0f ? (hRNgd2zGCE5kj2 / f) + 1.0f : 1.0f);
                graphicsLayerScope.pJp52Z5NdMAiw(TransformOriginKt.yzPsTade5rL7D3(z ? 0.0f : 1.0f, 0.5f));
                break;
        }
        return unit;
    }
}
