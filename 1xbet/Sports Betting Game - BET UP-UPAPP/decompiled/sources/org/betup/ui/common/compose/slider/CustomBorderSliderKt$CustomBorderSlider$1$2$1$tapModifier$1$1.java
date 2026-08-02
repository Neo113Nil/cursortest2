package org.betup.ui.common.compose.slider;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: CustomBorderSlider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CustomBorderSliderKt$CustomBorderSlider$1$2$1$tapModifier$1$1 implements PointerInputEventHandler {
    final /* synthetic */ Function1<Integer, Unit> $onValueChange;
    final /* synthetic */ int $span;
    final /* synthetic */ int $step;

    /* JADX WARN: Multi-variable type inference failed */
    CustomBorderSliderKt$CustomBorderSlider$1$2$1$tapModifier$1$1(int i, int i2, Function1<? super Integer, Unit> function1) {
        this.$span = i;
        this.$step = i2;
        this.$onValueChange = function1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final int i = this.$span;
        final int i2 = this.$step;
        final Function1<Integer, Unit> function1 = this.$onValueChange;
        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: org.betup.ui.common.compose.slider.CustomBorderSliderKt$CustomBorderSlider$1$2$1$tapModifier$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = CustomBorderSliderKt$CustomBorderSlider$1$2$1$tapModifier$1$1.invoke$lambda$0(i, pointerInputScope, i2, function1, (Offset) obj);
                return invoke$lambda$0;
            }
        }, continuation, 7, null);
        return detectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(int i, PointerInputScope pointerInputScope, int i2, Function1 function1, Offset offset) {
        function1.invoke(Integer.valueOf(RangesKt.coerceIn((((i == 0 ? 0 : (int) ((Float.intBitsToFloat((int) (offset.m4937unboximpl() >> 32)) / ((int) (pointerInputScope.getBoundsSize() >> 32))) * i)) + (i2 / 2)) / i2) * i2, 0, i)));
        return Unit.INSTANCE;
    }
}
