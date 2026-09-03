package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class EeuoANNhU37PjiW implements Function1 {
    public final /* synthetic */ SheetState b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ EeuoANNhU37PjiW(SheetState sheetState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = sheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        SheetState sheetState = this.b41X89IqSbKt;
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        switch (i) {
            case 0:
                float oyjLVtGms9eZwJ0 = ((SnapshotMutableFloatStateImpl) sheetState.oyjLVtGms9eZwJ0.UEutaskTsxaI).oyjLVtGms9eZwJ0();
                float hRNgd2zGCE5kj = sheetState.oyjLVtGms9eZwJ0.b41X89IqSbKt().hRNgd2zGCE5kj();
                float f = oyjLVtGms9eZwJ0 < hRNgd2zGCE5kj ? hRNgd2zGCE5kj - oyjLVtGms9eZwJ0 : 0.0f;
                graphicsLayerScope.Yey4RyhSyBRHub(f > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (graphicsLayerScope.getExVmIuryuB8HeQ() & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & graphicsLayerScope.getExVmIuryuB8HeQ()))) : 1.0f);
                graphicsLayerScope.pJp52Z5NdMAiw(TransformOriginKt.yzPsTade5rL7D3(0.5f, 0.0f));
                break;
            default:
                float oyjLVtGms9eZwJ02 = ((SnapshotMutableFloatStateImpl) sheetState.oyjLVtGms9eZwJ0.UEutaskTsxaI).oyjLVtGms9eZwJ0();
                float hRNgd2zGCE5kj2 = sheetState.oyjLVtGms9eZwJ0.b41X89IqSbKt().hRNgd2zGCE5kj();
                float f2 = oyjLVtGms9eZwJ02 < hRNgd2zGCE5kj2 ? hRNgd2zGCE5kj2 - oyjLVtGms9eZwJ02 : 0.0f;
                graphicsLayerScope.Yey4RyhSyBRHub(f2 > 0.0f ? (Float.intBitsToFloat((int) (graphicsLayerScope.getExVmIuryuB8HeQ() & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & graphicsLayerScope.getExVmIuryuB8HeQ())) : 1.0f);
                graphicsLayerScope.pJp52Z5NdMAiw(TransformOriginKt.yzPsTade5rL7D3(0.5f, 0.0f));
                break;
        }
        return unit;
    }
}
