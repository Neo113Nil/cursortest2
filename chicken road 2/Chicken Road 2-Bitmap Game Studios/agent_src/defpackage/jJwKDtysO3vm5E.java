package defpackage;

import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class jJwKDtysO3vm5E implements Function0 {
    public final /* synthetic */ AnchoredDraggableState b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ jJwKDtysO3vm5E(AnchoredDraggableState anchoredDraggableState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = anchoredDraggableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        float f = 0.0f;
        AnchoredDraggableState anchoredDraggableState = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Object oyjLVtGms9eZwJ0 = ((SnapshotMutableStateImpl) anchoredDraggableState.uypNJrpDByoB).getOyjLVtGms9eZwJ0();
                if (oyjLVtGms9eZwJ0 != null) {
                    return oyjLVtGms9eZwJ0;
                }
                float oyjLVtGms9eZwJ02 = ((SnapshotMutableFloatStateImpl) anchoredDraggableState.UEutaskTsxaI).oyjLVtGms9eZwJ0();
                boolean isNaN = Float.isNaN(oyjLVtGms9eZwJ02);
                MutableState mutableState = anchoredDraggableState.i7xAcZoXXiIt;
                return !isNaN ? anchoredDraggableState.ra306ClFT3HT(oyjLVtGms9eZwJ02, 0.0f, ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()) : ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0();
            case 1:
                Object oyjLVtGms9eZwJ03 = ((SnapshotMutableStateImpl) anchoredDraggableState.uypNJrpDByoB).getOyjLVtGms9eZwJ0();
                if (oyjLVtGms9eZwJ03 != null) {
                    return oyjLVtGms9eZwJ03;
                }
                float oyjLVtGms9eZwJ04 = ((SnapshotMutableFloatStateImpl) anchoredDraggableState.UEutaskTsxaI).oyjLVtGms9eZwJ0();
                boolean isNaN2 = Float.isNaN(oyjLVtGms9eZwJ04);
                MutableState mutableState2 = anchoredDraggableState.i7xAcZoXXiIt;
                if (isNaN2) {
                    return ((SnapshotMutableStateImpl) mutableState2).getOyjLVtGms9eZwJ0();
                }
                Object oyjLVtGms9eZwJ05 = ((SnapshotMutableStateImpl) mutableState2).getOyjLVtGms9eZwJ0();
                DraggableAnchors b41X89IqSbKt = anchoredDraggableState.b41X89IqSbKt();
                float yzPsTade5rL7D3 = b41X89IqSbKt.yzPsTade5rL7D3(oyjLVtGms9eZwJ05);
                if (yzPsTade5rL7D3 != oyjLVtGms9eZwJ04 && !Float.isNaN(yzPsTade5rL7D3)) {
                    if (yzPsTade5rL7D3 < oyjLVtGms9eZwJ04) {
                        Object ra306ClFT3HT = b41X89IqSbKt.ra306ClFT3HT(oyjLVtGms9eZwJ04, true);
                        if (ra306ClFT3HT != null) {
                            return ra306ClFT3HT;
                        }
                    } else {
                        Object ra306ClFT3HT2 = b41X89IqSbKt.ra306ClFT3HT(oyjLVtGms9eZwJ04, false);
                        if (ra306ClFT3HT2 != null) {
                            return ra306ClFT3HT2;
                        }
                    }
                }
                return oyjLVtGms9eZwJ05;
            case 2:
                float yzPsTade5rL7D32 = anchoredDraggableState.b41X89IqSbKt().yzPsTade5rL7D3(((SnapshotMutableStateImpl) anchoredDraggableState.i7xAcZoXXiIt).getOyjLVtGms9eZwJ0());
                float yzPsTade5rL7D33 = anchoredDraggableState.b41X89IqSbKt().yzPsTade5rL7D3(anchoredDraggableState.FsuUJlzzWhYnMlD.getOyjLVtGms9eZwJ0()) - yzPsTade5rL7D32;
                float abs = Math.abs(yzPsTade5rL7D33);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float i7xAcZoXXiIt = (anchoredDraggableState.i7xAcZoXXiIt() - yzPsTade5rL7D32) / yzPsTade5rL7D33;
                    if (i7xAcZoXXiIt >= 1.0E-6f) {
                        if (i7xAcZoXXiIt <= 0.999999f) {
                            f = i7xAcZoXXiIt;
                        }
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 3:
                return anchoredDraggableState.b41X89IqSbKt();
            default:
                return new Pair(anchoredDraggableState.b41X89IqSbKt(), anchoredDraggableState.Uo5pffGf8LUU.getOyjLVtGms9eZwJ0());
        }
    }
}
