package defpackage;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class fKfRGTKlrcIcfy implements Function1 {
    public final /* synthetic */ Function0 b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ fKfRGTKlrcIcfy(int i, Function0 function0) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Function0 function0 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AppBarKt.yzPsTade5rL7D3;
                ((GraphicsLayerScope) obj).yzPsTade5rL7D3(((Number) function0.hRNgd2zGCE5kj()).floatValue());
                return unit;
            case 1:
                float f = DragGestureDetectorKt.yzPsTade5rL7D3;
                function0.hRNgd2zGCE5kj();
                return unit;
            case 2:
                int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                function0.hRNgd2zGCE5kj();
                return unit;
            case 3:
                function0.hRNgd2zGCE5kj();
                return unit;
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                CubicBezierEasing cubicBezierEasing = ProgressIndicatorKt.yzPsTade5rL7D3;
                Object hRNgd2zGCE5kj = function0.hRNgd2zGCE5kj();
                if (Float.isNaN(((Number) hRNgd2zGCE5kj).floatValue())) {
                    hRNgd2zGCE5kj = null;
                }
                Float f2 = (Float) hRNgd2zGCE5kj;
                ProgressBarRangeInfo progressBarRangeInfo = new ProgressBarRangeInfo(f2 != null ? f2.floatValue() : 0.0f, RangesKt.b41X89IqSbKt(0.0f, 1.0f));
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ra306ClFT3HT;
                KProperty kProperty = SemanticsPropertiesKt.yzPsTade5rL7D3[1];
                semanticsPropertyReceiver.hRNgd2zGCE5kj(semanticsPropertyKey, progressBarRangeInfo);
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) function0.hRNgd2zGCE5kj()).floatValue());
            default:
                return (Offset) function0.hRNgd2zGCE5kj();
        }
    }
}
