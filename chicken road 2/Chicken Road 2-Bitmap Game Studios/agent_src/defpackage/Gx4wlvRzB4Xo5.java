package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class Gx4wlvRzB4Xo5 implements Function1 {
    public final /* synthetic */ float b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ Gx4wlvRzB4Xo5(UpdatableAnimationState updatableAnimationState, float f, Function1 function1) {
        this.oyjLVtGms9eZwJ0 = 4;
        this.gmXBnHsR2YSm = updatableAnimationState;
        this.b41X89IqSbKt = f;
        this.i7xAcZoXXiIt = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r0 > r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
    
        if (r0 < r4) goto L29;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uypNJrpDByoB(Object obj) {
        float floatValue;
        int i = this.oyjLVtGms9eZwJ0;
        float f = 0.0f;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.i7xAcZoXXiIt;
        float f2 = this.b41X89IqSbKt;
        Object obj3 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                ImageBitmap imageBitmap = (ImageBitmap) obj3;
                BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj2;
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                float f3 = AndroidCursorHandle_androidKt.yzPsTade5rL7D3;
                contentDrawScope.N();
                CanvasDrawScope$drawContext$1 b41X89IqSbKt = contentDrawScope.getB41X89IqSbKt();
                long oyjLVtGms9eZwJ0 = b41X89IqSbKt.oyjLVtGms9eZwJ0();
                b41X89IqSbKt.yzPsTade5rL7D3().yRx9jbDCTnXb3();
                try {
                    CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = b41X89IqSbKt.yzPsTade5rL7D3;
                    canvasDrawScopeKt$asDrawTransform$1.gmXBnHsR2YSm(f2, 0.0f);
                    canvasDrawScopeKt$asDrawTransform$1.oyjLVtGms9eZwJ0(45.0f, 0L);
                    DrawScope.Tq1wTdNjhzJEqe(contentDrawScope, imageBitmap, 0L, 0.0f, blendModeColorFilter, 0, 46);
                    return unit;
                } finally {
                    OcGJUxcOVecQiKb.pu0JZhzR2Or6(b41X89IqSbKt, oyjLVtGms9eZwJ0);
                }
            case 1:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj3;
                LazyLayoutScrollScope lazyLayoutScrollScope = (LazyLayoutScrollScope) obj2;
                AnimationScope animationScope = (AnimationScope) obj;
                if (f2 <= 0.0f) {
                    if (f2 < 0.0f) {
                        floatValue = ((Number) ((SnapshotMutableStateImpl) animationScope.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue();
                        break;
                    }
                } else {
                    floatValue = ((Number) ((SnapshotMutableStateImpl) animationScope.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue();
                    break;
                }
                float f4 = f - floatRef.oyjLVtGms9eZwJ0;
                if (f4 != lazyLayoutScrollScope.b41X89IqSbKt(f4) || f != ((Number) ((SnapshotMutableStateImpl) animationScope.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue()) {
                    animationScope.yzPsTade5rL7D3();
                }
                floatRef.oyjLVtGms9eZwJ0 += f4;
                return unit;
            case 2:
                IntSize intSize = (IntSize) obj3;
                SheetState sheetState = (SheetState) obj2;
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
                int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                draggableAnchorsConfig.yzPsTade5rL7D3(SheetValue.oyjLVtGms9eZwJ0, f2);
                float f5 = f2 / 2.0f;
                if (((int) (intSize.yzPsTade5rL7D3 & 4294967295L)) > f5 && !sheetState.yzPsTade5rL7D3) {
                    draggableAnchorsConfig.yzPsTade5rL7D3(SheetValue.gmXBnHsR2YSm, f5);
                }
                int i3 = (int) (intSize.yzPsTade5rL7D3 & 4294967295L);
                if (i3 != 0) {
                    draggableAnchorsConfig.yzPsTade5rL7D3(SheetValue.b41X89IqSbKt, Math.max(0.0f, f2 - i3));
                }
                return unit;
            case 3:
                ((Placeable.PlacementScope) obj).UEutaskTsxaI((Placeable) obj3, ((MeasureScope) obj2).uMAEPvJoKWq8X(f2), 0, 0.0f);
                return unit;
            default:
                UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) obj3;
                Function1 function1 = (Function1) obj2;
                long longValue = ((Long) obj).longValue();
                if (updatableAnimationState.hRNgd2zGCE5kj == Long.MIN_VALUE) {
                    updatableAnimationState.hRNgd2zGCE5kj = longValue;
                }
                float f6 = updatableAnimationState.b41X89IqSbKt;
                AnimationVector1D animationVector1D = new AnimationVector1D(f6);
                AnimationVector1D animationVector1D2 = UpdatableAnimationState.gmXBnHsR2YSm;
                long hRNgd2zGCE5kj = f2 == 0.0f ? updatableAnimationState.yzPsTade5rL7D3.hRNgd2zGCE5kj(new AnimationVector1D(f6), animationVector1D2, updatableAnimationState.ra306ClFT3HT) : MathKt.ra306ClFT3HT((longValue - updatableAnimationState.hRNgd2zGCE5kj) / f2);
                float f7 = ((AnimationVector1D) updatableAnimationState.yzPsTade5rL7D3.gmXBnHsR2YSm(hRNgd2zGCE5kj, animationVector1D, animationVector1D2, updatableAnimationState.ra306ClFT3HT)).yzPsTade5rL7D3;
                updatableAnimationState.ra306ClFT3HT = (AnimationVector1D) updatableAnimationState.yzPsTade5rL7D3.b41X89IqSbKt(hRNgd2zGCE5kj, animationVector1D, animationVector1D2, updatableAnimationState.ra306ClFT3HT);
                updatableAnimationState.hRNgd2zGCE5kj = longValue;
                float f8 = updatableAnimationState.b41X89IqSbKt - f7;
                updatableAnimationState.b41X89IqSbKt = f7;
                function1.uypNJrpDByoB(Float.valueOf(f8));
                return unit;
        }
    }

    public /* synthetic */ Gx4wlvRzB4Xo5(float f, Object obj, Object obj2, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = f;
        this.gmXBnHsR2YSm = obj;
        this.i7xAcZoXXiIt = obj2;
    }

    public /* synthetic */ Gx4wlvRzB4Xo5(Placeable placeable, MeasureScope measureScope, float f) {
        this.oyjLVtGms9eZwJ0 = 3;
        this.gmXBnHsR2YSm = placeable;
        this.i7xAcZoXXiIt = measureScope;
        this.b41X89IqSbKt = f;
    }
}
