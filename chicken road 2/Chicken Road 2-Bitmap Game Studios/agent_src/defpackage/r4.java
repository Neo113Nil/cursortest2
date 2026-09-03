package defpackage;

import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements Function1 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ boolean gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ r4(Function0 function0, boolean z) {
        this.oyjLVtGms9eZwJ0 = 2;
        this.gmXBnHsR2YSm = z;
        this.b41X89IqSbKt = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.b41X89IqSbKt;
        boolean z = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) obj2;
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                NavigationDrawerKt.hRNgd2zGCE5kj(graphicsLayerScope, drawerPredictiveBackState);
                NavigationDrawerKt.ra306ClFT3HT(graphicsLayerScope, drawerPredictiveBackState);
                graphicsLayerScope.exVmIuryuB8HeQ(1.0f);
                graphicsLayerScope.pJp52Z5NdMAiw(TransformOriginKt.yzPsTade5rL7D3(z ? 0.0f : 1.0f, 0.0f));
                break;
            case 1:
                DrawerPredictiveBackState drawerPredictiveBackState2 = (DrawerPredictiveBackState) obj2;
                GraphicsLayerScope graphicsLayerScope2 = (GraphicsLayerScope) obj;
                NavigationDrawerKt.hRNgd2zGCE5kj(graphicsLayerScope2, drawerPredictiveBackState2);
                graphicsLayerScope2.exVmIuryuB8HeQ(1.0f);
                NavigationDrawerKt.ra306ClFT3HT(graphicsLayerScope2, drawerPredictiveBackState2);
                graphicsLayerScope2.Yey4RyhSyBRHub(1.0f);
                graphicsLayerScope2.pJp52Z5NdMAiw(TransformOriginKt.yzPsTade5rL7D3(z ? 1.0f : 0.0f, 0.5f));
                break;
            default:
                Function0 function0 = (Function0) obj2;
                GraphicsLayerScope graphicsLayerScope3 = (GraphicsLayerScope) obj;
                float f = NavigationBarKt.yzPsTade5rL7D3;
                graphicsLayerScope3.yzPsTade5rL7D3(z ? 1.0f : ((Number) function0.hRNgd2zGCE5kj()).floatValue());
                break;
        }
        return unit;
    }

    public /* synthetic */ r4(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = drawerPredictiveBackState;
        this.gmXBnHsR2YSm = z;
    }
}
