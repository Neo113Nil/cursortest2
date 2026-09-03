package defpackage;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.pager.PagerMeasureResult;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements Function0 {
    public final /* synthetic */ PagerState b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ b5(PagerState pagerState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int Uo5pffGf8LUU;
        int i7xAcZoXXiIt;
        int i = this.oyjLVtGms9eZwJ0;
        PagerState pagerState = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                return Integer.valueOf(pagerState.MRfxZSx8l5UG62U.hRNgd2zGCE5kj() ? ((SnapshotMutableIntStateImpl) pagerState.MCcLy95b8Awzmw).hRNgd2zGCE5kj() : pagerState.Uo5pffGf8LUU());
            case 1:
                MutableState mutableState = pagerState.uypNJrpDByoB;
                ScrollableState scrollableState = pagerState.MRfxZSx8l5UG62U;
                MutableIntState mutableIntState = pagerState.o2t7oodqU1bUMaS;
                if (scrollableState.hRNgd2zGCE5kj()) {
                    SnapshotMutableIntStateImpl snapshotMutableIntStateImpl = (SnapshotMutableIntStateImpl) mutableIntState;
                    if (snapshotMutableIntStateImpl.hRNgd2zGCE5kj() != -1) {
                        Uo5pffGf8LUU = snapshotMutableIntStateImpl.hRNgd2zGCE5kj();
                    } else {
                        float abs = Math.abs(pagerState.FsuUJlzzWhYnMlD());
                        PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1 = pagerState.yRx9jbDCTnXb3;
                        PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$12 = PagerStateKt.yzPsTade5rL7D3;
                        pagerStateKt$UnitDensity$1.getClass();
                        ((PagerMeasureResult) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).getClass();
                        float min = Math.min(56.0f, 0.0f);
                        ((PagerMeasureResult) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).getClass();
                        if (abs >= Math.abs(min / 0.0f)) {
                            boolean booleanValue = ((Boolean) ((SnapshotMutableStateImpl) pagerState.o4ticBN7g1K8jE).getOyjLVtGms9eZwJ0()).booleanValue();
                            int i2 = pagerState.b41X89IqSbKt;
                            Uo5pffGf8LUU = booleanValue ? i2 + 1 : i2;
                        } else {
                            Uo5pffGf8LUU = pagerState.Uo5pffGf8LUU();
                        }
                    }
                } else {
                    Uo5pffGf8LUU = pagerState.Uo5pffGf8LUU();
                }
                i7xAcZoXXiIt = pagerState.i7xAcZoXXiIt(Uo5pffGf8LUU);
                break;
            default:
                i7xAcZoXXiIt = pagerState.MRfxZSx8l5UG62U();
                break;
        }
        return Integer.valueOf(i7xAcZoXXiIt);
    }
}
