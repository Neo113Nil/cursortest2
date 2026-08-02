package org.betup.ui.common.compose.slider;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: CustomBorderSlider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CustomBorderSliderKt$CustomBorderSlider$1$2$dragModifier$1$1 implements PointerInputEventHandler {
    final /* synthetic */ Function1<Integer, Unit> $onValueChange;
    final /* synthetic */ int $span;
    final /* synthetic */ int $step;
    final /* synthetic */ float $widthPx;

    /* JADX WARN: Multi-variable type inference failed */
    CustomBorderSliderKt$CustomBorderSlider$1$2$dragModifier$1$1(float f, int i, int i2, Function1<? super Integer, Unit> function1) {
        this.$widthPx = f;
        this.$span = i;
        this.$step = i2;
        this.$onValueChange = function1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final float f = this.$widthPx;
        final int i = this.$span;
        final int i2 = this.$step;
        final Function1<Integer, Unit> function1 = this.$onValueChange;
        Object detectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, null, null, new Function2() { // from class: org.betup.ui.common.compose.slider.CustomBorderSliderKt$CustomBorderSlider$1$2$dragModifier$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = CustomBorderSliderKt$CustomBorderSlider$1$2$dragModifier$1$1.invoke$lambda$0(f, i, i2, function1, (PointerInputChange) obj, (Offset) obj2);
                return invoke$lambda$0;
            }
        }, continuation, 7, null);
        return detectDragGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(float f, int i, int i2, Function1 function1, PointerInputChange change, Offset offset) {
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        function1.invoke(Integer.valueOf(RangesKt.coerceIn((((i == 0 ? 0 : (int) ((RangesKt.coerceIn(Float.intBitsToFloat((int) (change.getPosition() >> 32)), 0.0f, f) / f) * i)) + (i2 / 2)) / i2) * i2, 0, i)));
        return Unit.INSTANCE;
    }
}
