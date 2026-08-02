package org.betup.ui.fragment.matches.details.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchTopBaseItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$LiveTimerDisplay$3$1", f = "MatchTopBaseItem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchTopBaseItemKt$LiveTimerDisplay$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ TextMeasurer $textMeasurer;
    final /* synthetic */ MutableState<Dp> $textWidthDp$delegate;
    final /* synthetic */ MutableState<String> $timerText$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchTopBaseItemKt$LiveTimerDisplay$3$1(TextMeasurer textMeasurer, Density density, MutableState<String> mutableState, MutableState<Dp> mutableState2, Continuation<? super MatchTopBaseItemKt$LiveTimerDisplay$3$1> continuation) {
        super(2, continuation);
        this.$textMeasurer = textMeasurer;
        this.$density = density;
        this.$timerText$delegate = mutableState;
        this.$textWidthDp$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchTopBaseItemKt$LiveTimerDisplay$3$1(this.$textMeasurer, this.$density, this.$timerText$delegate, this.$textWidthDp$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchTopBaseItemKt$LiveTimerDisplay$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String LiveTimerDisplay$lambda$14;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TextMeasurer textMeasurer = this.$textMeasurer;
        LiveTimerDisplay$lambda$14 = MatchTopBaseItemKt.LiveTimerDisplay$lambda$14(this.$timerText$delegate);
        MatchTopBaseItemKt.LiveTimerDisplay$lambda$21(this.$textWidthDp$delegate, this.$density.mo1164toDpu2uoSUM((int) (TextMeasurer.m7211measurexDpz5zY$default(textMeasurer, new AnnotatedString(LiveTimerDisplay$lambda$14, null, 2, null), new TextStyle(0L, TextUnitKt.getSp(32), new FontWeight(900), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> 32)));
        return Unit.INSTANCE;
    }
}
