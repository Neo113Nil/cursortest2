package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.border.BorderLogic;
import androidx.compose.foundation.border.BorderLogicKt;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.material3.internal.hRNgd2zGCE5kj;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import androidx.navigation.compose.DialogNavigator;
import com.door.brass.knob.ui.challenge.ChallengeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class yRx9jbDCTnXb3 implements Function1 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ yRx9jbDCTnXb3(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, Job job, NestedScrollScope nestedScrollScope) {
        this.oyjLVtGms9eZwJ0 = 8;
        this.b41X89IqSbKt = contentInViewNode;
        this.gmXBnHsR2YSm = job;
        this.i7xAcZoXXiIt = nestedScrollScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0373  */
    /* JADX WARN: Type inference failed for: r3v52, types: [androidx.lifecycle.LifecycleObserver, h3] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uypNJrpDByoB(Object obj) {
        long floatToRawIntBits;
        TextLayoutResult textLayoutResult;
        TextLayoutResult textLayoutResult2;
        Canvas canvas;
        Canvas canvas2;
        boolean z;
        TextDecoration textDecoration;
        Shadow shadow;
        Canvas canvas3;
        Brush b41X89IqSbKt;
        Canvas canvas4;
        Canvas canvas5;
        int i = this.oyjLVtGms9eZwJ0;
        DrawStyle drawStyle = Fill.yzPsTade5rL7D3;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.i7xAcZoXXiIt;
        Object obj3 = this.gmXBnHsR2YSm;
        Object obj4 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) obj4;
                final Function0 function0 = (Function0) obj2;
                final GiTAvmtrM6Bh8SJ giTAvmtrM6Bh8SJ = new GiTAvmtrM6Bh8SJ(0, (Function1) obj3);
                lifecycleOwner.getOyjLVtGms9eZwJ0().yzPsTade5rL7D3(giTAvmtrM6Bh8SJ);
                return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$lambda$12$lambda$11$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        Function0.this.hRNgd2zGCE5kj();
                        lifecycleOwner.getOyjLVtGms9eZwJ0().ra306ClFT3HT(giTAvmtrM6Bh8SJ);
                    }
                };
            case 1:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj4;
                TopAppBarState topAppBarState = (TopAppBarState) obj3;
                AnimationScope animationScope = (AnimationScope) obj;
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AppBarKt.yzPsTade5rL7D3;
                float floatValue = ((Number) ((SnapshotMutableStateImpl) animationScope.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue() - floatRef.oyjLVtGms9eZwJ0;
                float hRNgd2zGCE5kj = topAppBarState.hRNgd2zGCE5kj();
                ((SnapshotMutableFloatStateImpl) topAppBarState.ra306ClFT3HT).UEutaskTsxaI(RangesKt.hRNgd2zGCE5kj(hRNgd2zGCE5kj + floatValue, topAppBarState.yzPsTade5rL7D3, 0.0f));
                float abs = Math.abs(hRNgd2zGCE5kj - topAppBarState.hRNgd2zGCE5kj());
                floatRef.oyjLVtGms9eZwJ0 = ((Number) ((SnapshotMutableStateImpl) animationScope.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue();
                ((Ref.FloatRef) obj2).oyjLVtGms9eZwJ0 = ((Number) animationScope.hRNgd2zGCE5kj()).floatValue();
                if (Math.abs(floatValue - abs) > 0.5f) {
                    animationScope.yzPsTade5rL7D3();
                }
                return unit;
            case 2:
                Placeable placeable = (Placeable) obj4;
                MeasureScope measureScope = (MeasureScope) obj3;
                Placeable placeable2 = (Placeable) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                r13 = placeable.oyjLVtGms9eZwJ0 <= measureScope.uMAEPvJoKWq8X(BadgeTokens.yzPsTade5rL7D3) ? 0 : 1;
                float f = r13 != 0 ? 12.0f : 6.0f;
                float f2 = r13 != 0 ? 14.0f : 6.0f;
                Placeable.PlacementScope.NIabVTHf6LMJyXq(placementScope, placeable2, 0, 0);
                Placeable.PlacementScope.NIabVTHf6LMJyXq(placementScope, placeable, Math.min(placeable2.oyjLVtGms9eZwJ0 - measureScope.uMAEPvJoKWq8X(f), ((int) placementScope.gmXBnHsR2YSm(BadgeKt.hRNgd2zGCE5kj, Float.POSITIVE_INFINITY)) - placeable.oyjLVtGms9eZwJ0), Math.max(measureScope.uMAEPvJoKWq8X(f2) + (-placeable.b41X89IqSbKt), (int) placementScope.gmXBnHsR2YSm(BadgeKt.yzPsTade5rL7D3, Float.NEGATIVE_INFINITY)));
                return unit;
            case 3:
                Function1 function1 = (Function1) obj3;
                MutableState mutableState = (MutableState) obj2;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                TextFieldDecorator textFieldDecorator = BasicTextFieldKt.yzPsTade5rL7D3;
                ((MutableState) obj4).setValue(textFieldValue);
                boolean yzPsTade5rL7D3 = Intrinsics.yzPsTade5rL7D3((String) mutableState.getOyjLVtGms9eZwJ0(), textFieldValue.yzPsTade5rL7D3.b41X89IqSbKt);
                AnnotatedString annotatedString = textFieldValue.yzPsTade5rL7D3;
                mutableState.setValue(annotatedString.b41X89IqSbKt);
                if (!yzPsTade5rL7D3) {
                    function1.uypNJrpDByoB(annotatedString.b41X89IqSbKt);
                }
                return unit;
            case 4:
                hRNgd2zGCE5kj hrngd2zgce5kj = new hRNgd2zGCE5kj(r13, (CoroutineScope) obj3, (TooltipState) obj2);
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(SemanticsActions.ra306ClFT3HT, new AccessibilityAction((String) obj4, hrngd2zgce5kj));
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                RoundRect roundRect = (RoundRect) obj3;
                Brush brush = (Brush) obj2;
                DrawScope drawScope = (DrawScope) obj;
                h hVar = ((BorderLogic) obj4).hRNgd2zGCE5kj;
                hVar.getClass();
                float floatValue2 = Float.valueOf(hVar.b41X89IqSbKt).floatValue();
                float f3 = floatValue2 < 0.0f ? 0.0f : floatValue2;
                float f4 = f3 / 2.0f;
                float f5 = 2.0f * f3;
                float min = Math.min(Math.abs(roundRect.hRNgd2zGCE5kj()), Math.abs(roundRect.yzPsTade5rL7D3()));
                float f6 = roundRect.yzPsTade5rL7D3;
                float f7 = roundRect.hRNgd2zGCE5kj;
                boolean z2 = f5 > min;
                long j = roundRect.b41X89IqSbKt;
                Stroke stroke = new Stroke(f3, 0.0f, 0, 0, null, 30);
                if (z2) {
                    DrawScope.D(drawScope, brush, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(roundRect.hRNgd2zGCE5kj()) << 32) | (Float.floatToRawIntBits(roundRect.yzPsTade5rL7D3()) & 4294967295L), j, 0.0f, null, null, 0, 240);
                } else if (Float.intBitsToFloat((int) (j >> 32)) < f4) {
                    float f8 = f6 + f3;
                    float f9 = f7 + f3;
                    float f10 = roundRect.ra306ClFT3HT - f3;
                    float f11 = roundRect.oyjLVtGms9eZwJ0 - f3;
                    CanvasDrawScope$drawContext$1 b41X89IqSbKt2 = drawScope.getB41X89IqSbKt();
                    long oyjLVtGms9eZwJ0 = b41X89IqSbKt2.oyjLVtGms9eZwJ0();
                    b41X89IqSbKt2.yzPsTade5rL7D3().yRx9jbDCTnXb3();
                    try {
                        b41X89IqSbKt2.yzPsTade5rL7D3.hRNgd2zGCE5kj(f8, f9, f10, f11, 0);
                        DrawScope.D(drawScope, brush, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(roundRect.hRNgd2zGCE5kj()) << 32) | (Float.floatToRawIntBits(roundRect.yzPsTade5rL7D3()) & 4294967295L), j, 0.0f, null, null, 0, 240);
                    } finally {
                    }
                } else {
                    DrawScope.D(drawScope, brush, (Float.floatToRawIntBits(f7 + f4) & 4294967295L) | (Float.floatToRawIntBits(f6 + f4) << 32), (Float.floatToRawIntBits(roundRect.hRNgd2zGCE5kj() - f3) << 32) | (Float.floatToRawIntBits(roundRect.yzPsTade5rL7D3() - f3) & 4294967295L), BorderLogicKt.yzPsTade5rL7D3(f4, j), 0.0f, stroke, null, 0, 208);
                }
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                Rect rect = (Rect) obj3;
                Brush brush2 = (Brush) obj2;
                DrawScope drawScope2 = (DrawScope) obj;
                h hVar2 = ((BorderLogic) obj4).hRNgd2zGCE5kj;
                hVar2.getClass();
                float floatValue3 = Float.valueOf(hVar2.b41X89IqSbKt).floatValue();
                float f12 = floatValue3 < 0.0f ? 0.0f : floatValue3;
                float f13 = f12 * 2.0f;
                float f14 = rect.ra306ClFT3HT;
                float f15 = rect.hRNgd2zGCE5kj;
                float f16 = rect.oyjLVtGms9eZwJ0;
                boolean z3 = f13 > Math.min(Math.abs(f14 - rect.yzPsTade5rL7D3), Math.abs(f16 - f15));
                if (z3) {
                    floatToRawIntBits = rect.b41X89IqSbKt();
                } else {
                    float f17 = f12 / 2.0f;
                    floatToRawIntBits = (Float.floatToRawIntBits(f17 + f15) & 4294967295L) | (Float.floatToRawIntBits(r7 + f17) << 32);
                }
                DrawScope.LKH4PK2NjbMM(drawScope2, brush2, floatToRawIntBits, z3 ? rect.oyjLVtGms9eZwJ0() : (Float.floatToRawIntBits((f16 - f15) - f12) & 4294967295L) | (Float.floatToRawIntBits((rect.ra306ClFT3HT - r7) - f12) << 32), 0.0f, z3 ? drawStyle : new Stroke(f12, 0.0f, 0, 0, null, 30), null, 0, 104);
                return unit;
            case 7:
                final List list = (List) obj4;
                final ChallengeViewModel challengeViewModel = (ChallengeViewModel) obj3;
                final MutableState mutableState2 = (MutableState) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                lazyListScope.yzPsTade5rL7D3(list.size(), null, new Function1<Integer, Object>() { // from class: com.door.brass.knob.ui.challenge.ChallengeScreenKt$ChallengeScreen$lambda$2$0$0$1$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj5) {
                        list.get(((Number) obj5).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(802480018, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.door.brass.knob.ui.challenge.ChallengeScreenKt$ChallengeScreen$lambda$2$0$0$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object o2t7oodqU1bUMaS(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i2;
                        Object obj9 = (LazyItemScope) obj5;
                        int intValue = ((Number) obj6).intValue();
                        Composer composer = (Composer) obj7;
                        int intValue2 = ((Number) obj8).intValue();
                        if ((intValue2 & 6) == 0) {
                            i2 = (composer.zgejW39NNp2D(obj9) ? 4 : 2) | intValue2;
                        } else {
                            i2 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i2 |= composer.kSPEzfraxudm4i(intValue) ? 32 : 16;
                        }
                        if (composer.ZvpnNpCMEWSR3(i2 & 1, (i2 & 147) != 146)) {
                            final String str = (String) list.get(intValue);
                            composer.mFNFvFv0Eiyk(453564377);
                            final MutableState mutableState3 = mutableState2;
                            boolean yzPsTade5rL7D32 = Intrinsics.yzPsTade5rL7D3(((ChallengeUiState) mutableState3.getOyjLVtGms9eZwJ0()).oyjLVtGms9eZwJ0, str);
                            final ChallengeViewModel challengeViewModel2 = challengeViewModel;
                            boolean NIabVTHf6LMJyXq = composer.NIabVTHf6LMJyXq(challengeViewModel2) | composer.zgejW39NNp2D(mutableState3) | composer.zgejW39NNp2D(str);
                            Object UEutaskTsxaI = composer.UEutaskTsxaI();
                            if (NIabVTHf6LMJyXq || UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                                UEutaskTsxaI = new Function0<Unit>() { // from class: com.door.brass.knob.ui.challenge.ChallengeScreenKt$ChallengeScreen$1$1$1$2$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object hRNgd2zGCE5kj() {
                                        Object value;
                                        ChallengeUiState challengeUiState;
                                        ChallengeUiState yzPsTade5rL7D33;
                                        String str2 = ((ChallengeUiState) mutableState3.getOyjLVtGms9eZwJ0()).oyjLVtGms9eZwJ0;
                                        String str3 = str;
                                        if (Intrinsics.yzPsTade5rL7D3(str2, str3)) {
                                            str3 = null;
                                        }
                                        String str4 = str3;
                                        MutableStateFlow mutableStateFlow = ChallengeViewModel.this.ra306ClFT3HT;
                                        do {
                                            value = mutableStateFlow.getValue();
                                            challengeUiState = (ChallengeUiState) value;
                                            yzPsTade5rL7D33 = ChallengeUiState.yzPsTade5rL7D3(challengeUiState, null, null, null, str4, null, false, 247);
                                        } while (!mutableStateFlow.i7xAcZoXXiIt(value, ChallengeUiState.yzPsTade5rL7D3(yzPsTade5rL7D33, null, ChallengeViewModel.gmXBnHsR2YSm(yzPsTade5rL7D33, challengeUiState.yzPsTade5rL7D3), null, null, null, false, 253)));
                                        return Unit.yzPsTade5rL7D3;
                                    }
                                };
                                composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                            }
                            ChipKt.gmXBnHsR2YSm(yzPsTade5rL7D32, (Function0) UEutaskTsxaI, ComposableLambdaKt.hRNgd2zGCE5kj(-796283968, new Function2<Composer, Integer, Unit>() { // from class: com.door.brass.knob.ui.challenge.ChallengeScreenKt$ChallengeScreen$1$1$1$2$1$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object kSPEzfraxudm4i(Object obj10, Object obj11) {
                                    Composer composer2 = (Composer) obj10;
                                    int intValue3 = ((Number) obj11).intValue();
                                    if (composer2.ZvpnNpCMEWSR3(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        TextKt.hRNgd2zGCE5kj(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer2, 0, 0, 262142);
                                    } else {
                                        composer2.gmXBnHsR2YSm();
                                    }
                                    return Unit.yzPsTade5rL7D3;
                                }
                            }, composer), null, false, null, null, null, null, composer, 384);
                            composer.o4ticBN7g1K8jE();
                        } else {
                            composer.gmXBnHsR2YSm();
                        }
                        return Unit.yzPsTade5rL7D3;
                    }
                }, true));
                return unit;
            case 8:
                ContentInViewNode contentInViewNode = (ContentInViewNode) obj4;
                Job job = (Job) obj3;
                NestedScrollScope nestedScrollScope = (NestedScrollScope) obj2;
                float floatValue4 = ((Float) obj).floatValue();
                float f18 = contentInViewNode.exVmIuryuB8HeQ ? 1.0f : -1.0f;
                ScrollingLogic scrollingLogic = contentInViewNode.FTJ2XS7ULgY8;
                float FsuUJlzzWhYnMlD = scrollingLogic.FsuUJlzzWhYnMlD(scrollingLogic.i7xAcZoXXiIt(nestedScrollScope.hRNgd2zGCE5kj(scrollingLogic.i7xAcZoXXiIt(scrollingLogic.UEutaskTsxaI(f18 * floatValue4))))) * f18;
                if (Math.abs(FsuUJlzzWhYnMlD) < Math.abs(floatValue4)) {
                    job.yzPsTade5rL7D3(ExceptionsKt.yzPsTade5rL7D3("Scroll animation cancelled because scroll was not consumed (" + FsuUJlzzWhYnMlD + " < " + floatValue4 + ')', null));
                }
                return unit;
            case 9:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj4;
                TextFieldValue textFieldValue2 = (TextFieldValue) obj3;
                OffsetMapping offsetMapping = (OffsetMapping) obj2;
                DrawScope drawScope3 = (DrawScope) obj;
                TextLayoutResultProxy oyjLVtGms9eZwJ02 = legacyTextFieldState.oyjLVtGms9eZwJ0();
                if (oyjLVtGms9eZwJ02 != null) {
                    Canvas yzPsTade5rL7D32 = drawScope3.getB41X89IqSbKt().yzPsTade5rL7D3();
                    long j2 = ((TextRange) ((SnapshotMutableStateImpl) legacyTextFieldState.BD2CRjLJ8EtOqGQ).getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3;
                    long j3 = ((TextRange) ((SnapshotMutableStateImpl) legacyTextFieldState.jJwKDtysO3vm5E).getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3;
                    TextLayoutResult textLayoutResult3 = oyjLVtGms9eZwJ02.yzPsTade5rL7D3;
                    AndroidPaint androidPaint = legacyTextFieldState.ZvpnNpCMEWSR3;
                    long j4 = legacyTextFieldState.uY26rxeEAFnDq;
                    try {
                        try {
                            if (TextRange.oyjLVtGms9eZwJ0(j2)) {
                                textLayoutResult = textLayoutResult3;
                                if (TextRange.oyjLVtGms9eZwJ0(j3)) {
                                    textLayoutResult2 = textLayoutResult;
                                    if (!TextRange.oyjLVtGms9eZwJ0(textFieldValue2.hRNgd2zGCE5kj)) {
                                        androidPaint.uY26rxeEAFnDq(j4);
                                        AndroidPaint androidPaint2 = androidPaint;
                                        TextFieldDelegate.Companion.yzPsTade5rL7D3(yzPsTade5rL7D32, textFieldValue2.hRNgd2zGCE5kj, offsetMapping, textLayoutResult2, androidPaint2);
                                        canvas5 = androidPaint2;
                                    }
                                } else {
                                    long ra306ClFT3HT = textLayoutResult.yzPsTade5rL7D3.hRNgd2zGCE5kj.ra306ClFT3HT();
                                    Color color = ra306ClFT3HT != 16 ? new Color(ra306ClFT3HT) : null;
                                    long j5 = color != null ? color.yzPsTade5rL7D3 : Color.hRNgd2zGCE5kj;
                                    androidPaint.uY26rxeEAFnDq(Color.hRNgd2zGCE5kj(Color.oyjLVtGms9eZwJ0(j5) * 0.2f, j5));
                                    AndroidPaint androidPaint3 = androidPaint;
                                    TextFieldDelegate.Companion.yzPsTade5rL7D3(yzPsTade5rL7D32, j3, offsetMapping, textLayoutResult, androidPaint3);
                                    canvas = yzPsTade5rL7D32;
                                    canvas2 = androidPaint3;
                                    MultiParagraph multiParagraph = textLayoutResult.hRNgd2zGCE5kj;
                                    boolean b41X89IqSbKt3 = textLayoutResult.b41X89IqSbKt();
                                    TextLayoutInput textLayoutInput = textLayoutResult.yzPsTade5rL7D3;
                                    z = (b41X89IqSbKt3 || textLayoutInput.gmXBnHsR2YSm == 3) ? false : true;
                                    if (z) {
                                        long j6 = textLayoutResult.ra306ClFT3HT;
                                        Rect yzPsTade5rL7D33 = RectKt.yzPsTade5rL7D3(0L, (Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L));
                                        canvas.yRx9jbDCTnXb3();
                                        canvas.MRfxZSx8l5UG62U(yzPsTade5rL7D33);
                                    }
                                    SpanStyle spanStyle = textLayoutInput.hRNgd2zGCE5kj.yzPsTade5rL7D3;
                                    textDecoration = spanStyle.background;
                                    TextForegroundStyle textForegroundStyle = spanStyle.yzPsTade5rL7D3;
                                    if (textDecoration == null) {
                                        textDecoration = TextDecoration.hRNgd2zGCE5kj;
                                    }
                                    TextDecoration textDecoration2 = textDecoration;
                                    shadow = spanStyle.shadow;
                                    if (shadow == null) {
                                        shadow = Shadow.oyjLVtGms9eZwJ0;
                                    }
                                    Shadow shadow2 = shadow;
                                    DrawStyle drawStyle2 = spanStyle.drawStyle;
                                    DrawStyle drawStyle3 = drawStyle2 != null ? drawStyle : drawStyle2;
                                    b41X89IqSbKt = textForegroundStyle.b41X89IqSbKt();
                                    TextForegroundStyle.Unspecified unspecified = TextForegroundStyle.Unspecified.yzPsTade5rL7D3;
                                    if (b41X89IqSbKt == null) {
                                        Canvas canvas6 = canvas;
                                        MultiParagraph.UEutaskTsxaI(multiParagraph, canvas6, b41X89IqSbKt, textForegroundStyle != unspecified ? textForegroundStyle.getHRNgd2zGCE5kj() : 1.0f, shadow2, textDecoration2, drawStyle3);
                                        canvas4 = canvas6;
                                        canvas2 = canvas6;
                                    } else {
                                        canvas3 = canvas;
                                        try {
                                            Canvas canvas7 = canvas3;
                                            MultiParagraph.FsuUJlzzWhYnMlD(multiParagraph, canvas7, textForegroundStyle != unspecified ? textForegroundStyle.getYzPsTade5rL7D3() : Color.hRNgd2zGCE5kj, shadow2, textDecoration2, drawStyle3);
                                            canvas4 = canvas7;
                                            canvas2 = canvas7;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (z) {
                                                canvas3.uypNJrpDByoB();
                                            }
                                            throw th;
                                        }
                                    }
                                    if (z) {
                                        canvas4.uypNJrpDByoB();
                                    }
                                }
                            } else {
                                androidPaint.uY26rxeEAFnDq(j4);
                                textLayoutResult2 = textLayoutResult3;
                                AndroidPaint androidPaint4 = androidPaint;
                                TextFieldDelegate.Companion.yzPsTade5rL7D3(yzPsTade5rL7D32, j2, offsetMapping, textLayoutResult2, androidPaint4);
                                canvas5 = androidPaint4;
                            }
                            if (b41X89IqSbKt == null) {
                            }
                            if (z) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            canvas3 = canvas2;
                        }
                        b41X89IqSbKt = textForegroundStyle.b41X89IqSbKt();
                        TextForegroundStyle.Unspecified unspecified2 = TextForegroundStyle.Unspecified.yzPsTade5rL7D3;
                    } catch (Throwable th3) {
                        th = th3;
                        canvas3 = canvas;
                    }
                    canvas = yzPsTade5rL7D32;
                    textLayoutResult = textLayoutResult2;
                    canvas2 = canvas5;
                    MultiParagraph multiParagraph2 = textLayoutResult.hRNgd2zGCE5kj;
                    boolean b41X89IqSbKt32 = textLayoutResult.b41X89IqSbKt();
                    TextLayoutInput textLayoutInput2 = textLayoutResult.yzPsTade5rL7D3;
                    if (b41X89IqSbKt32) {
                    }
                    if (z) {
                    }
                    SpanStyle spanStyle2 = textLayoutInput2.hRNgd2zGCE5kj.yzPsTade5rL7D3;
                    textDecoration = spanStyle2.background;
                    TextForegroundStyle textForegroundStyle2 = spanStyle2.yzPsTade5rL7D3;
                    if (textDecoration == null) {
                    }
                    TextDecoration textDecoration22 = textDecoration;
                    shadow = spanStyle2.shadow;
                    if (shadow == null) {
                    }
                    Shadow shadow22 = shadow;
                    DrawStyle drawStyle22 = spanStyle2.drawStyle;
                    if (drawStyle22 != null) {
                    }
                }
                return unit;
            case 10:
                Ref.FloatRef floatRef2 = (Ref.FloatRef) obj4;
                AnimationScope animationScope2 = (AnimationScope) obj;
                float floatValue5 = ((Number) ((SnapshotMutableStateImpl) animationScope2.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue() - floatRef2.oyjLVtGms9eZwJ0;
                float b41X89IqSbKt4 = ((ScrollScope) obj3).b41X89IqSbKt(floatValue5);
                floatRef2.oyjLVtGms9eZwJ0 = ((Number) ((SnapshotMutableStateImpl) animationScope2.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue();
                ((Ref.FloatRef) obj2).oyjLVtGms9eZwJ0 = ((Number) animationScope2.hRNgd2zGCE5kj()).floatValue();
                if (Math.abs(floatValue5 - b41X89IqSbKt4) > 0.5f) {
                    animationScope2.yzPsTade5rL7D3();
                }
                return unit;
            case 11:
                final SnapshotStateList snapshotStateList = (SnapshotStateList) obj4;
                final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                final DialogNavigator dialogNavigator = (DialogNavigator) obj2;
                snapshotStateList.add(navBackStackEntry);
                return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$invoke$lambda$2$lambda$1$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        NavigatorState hRNgd2zGCE5kj2 = DialogNavigator.this.hRNgd2zGCE5kj();
                        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                        hRNgd2zGCE5kj2.hRNgd2zGCE5kj(navBackStackEntry2);
                        snapshotStateList.remove(navBackStackEntry2);
                    }
                };
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) obj4;
                final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) obj2;
                final Function1 function12 = (Function1) obj3;
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final ?? r3 = new LifecycleEventObserver() { // from class: h3
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void yRx9jbDCTnXb3(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                        int i2 = LifecycleEffectKt.WhenMappings.yzPsTade5rL7D3[event.ordinal()];
                        Ref.ObjectRef objectRef2 = objectRef;
                        if (i2 == 1) {
                            objectRef2.oyjLVtGms9eZwJ0 = function12.uypNJrpDByoB(LifecycleStartStopEffectScope.this);
                        } else {
                            if (i2 != 2) {
                                return;
                            }
                            LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef2.oyjLVtGms9eZwJ0;
                            if (lifecycleStopOrDisposeEffectResult != null) {
                                lifecycleStopOrDisposeEffectResult.yzPsTade5rL7D3();
                            }
                            objectRef2.oyjLVtGms9eZwJ0 = null;
                        }
                    }
                };
                lifecycleOwner2.getOyjLVtGms9eZwJ0().yzPsTade5rL7D3(r3);
                return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$lambda$0$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        LifecycleOwner.this.getOyjLVtGms9eZwJ0().ra306ClFT3HT(r3);
                        LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef.oyjLVtGms9eZwJ0;
                        if (lifecycleStopOrDisposeEffectResult != null) {
                            lifecycleStopOrDisposeEffectResult.yzPsTade5rL7D3();
                        }
                    }
                };
            case 13:
                final LifecycleOwner lifecycleOwner3 = (LifecycleOwner) obj4;
                final z zVar = new z(r13, (Lifecycle.Event) obj3, (MutableState) obj2);
                lifecycleOwner3.getOyjLVtGms9eZwJ0().yzPsTade5rL7D3(zVar);
                return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        LifecycleOwner.this.getOyjLVtGms9eZwJ0().ra306ClFT3HT(zVar);
                    }
                };
            case 14:
                PaddingValues paddingValues = (PaddingValues) obj4;
                Alignment.Horizontal horizontal = (Alignment.Horizontal) obj3;
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                long j7 = ((Size) ((MutablePropertyReference0) ((Function0) obj2)).get()).yzPsTade5rL7D3;
                float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                if (intBitsToFloat > 0.0f) {
                    float rw91HsWWsh17Nm = contentDrawScope.rw91HsWWsh17Nm(4.0f);
                    float yzPsTade5rL7D34 = horizontal.yzPsTade5rL7D3(MathKt.hRNgd2zGCE5kj(intBitsToFloat), MathKt.hRNgd2zGCE5kj((Float.intBitsToFloat((int) (contentDrawScope.b41X89IqSbKt() >> 32)) - r12) - contentDrawScope.rw91HsWWsh17Nm(paddingValues.oyjLVtGms9eZwJ0(contentDrawScope.getLayoutDirection()))), contentDrawScope.getLayoutDirection()) + contentDrawScope.rw91HsWWsh17Nm(paddingValues.hRNgd2zGCE5kj(contentDrawScope.getLayoutDirection()));
                    float f19 = intBitsToFloat / 2.0f;
                    float f20 = yzPsTade5rL7D34 + f19;
                    float f21 = (f20 - f19) - rw91HsWWsh17Nm;
                    float f22 = f21 < 0.0f ? 0.0f : f21;
                    float f23 = f20 + f19 + rw91HsWWsh17Nm;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.b41X89IqSbKt() >> 32));
                    float f24 = f23 > intBitsToFloat2 ? intBitsToFloat2 : f23;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    float f25 = (-intBitsToFloat3) / 2.0f;
                    float f26 = intBitsToFloat3 / 2.0f;
                    CanvasDrawScope$drawContext$1 b41X89IqSbKt5 = contentDrawScope.getB41X89IqSbKt();
                    long oyjLVtGms9eZwJ03 = b41X89IqSbKt5.oyjLVtGms9eZwJ0();
                    b41X89IqSbKt5.yzPsTade5rL7D3().yRx9jbDCTnXb3();
                    try {
                        b41X89IqSbKt5.yzPsTade5rL7D3.hRNgd2zGCE5kj(f22, f25, f24, f26, 0);
                        contentDrawScope.N();
                    } finally {
                    }
                } else {
                    contentDrawScope.N();
                }
                return unit;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj2;
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (((MouseSelectionObserver) obj4).oyjLVtGms9eZwJ0(pointerInputChange.ra306ClFT3HT, (SelectionAdjustment) obj3)) {
                    pointerInputChange.yzPsTade5rL7D3();
                    booleanRef.oyjLVtGms9eZwJ0 = true;
                }
                return unit;
            case 16:
                SliderState sliderState = (SliderState) obj4;
                DrawScope drawScope4 = (DrawScope) obj;
                SliderDefaults sliderDefaults = SliderDefaults.yzPsTade5rL7D3;
                if (Dp.hRNgd2zGCE5kj(Float.NaN, Float.NaN)) {
                    sliderState.getClass();
                    Orientation orientation = Orientation.oyjLVtGms9eZwJ0;
                    Float.intBitsToFloat((int) (drawScope4.b41X89IqSbKt() & 4294967295L));
                } else {
                    drawScope4.rw91HsWWsh17Nm(Float.NaN);
                }
                sliderState.getClass();
                throw null;
            case 17:
                RangeSliderState rangeSliderState = (RangeSliderState) obj4;
                DrawScope drawScope5 = (DrawScope) obj;
                SliderDefaults sliderDefaults2 = SliderDefaults.yzPsTade5rL7D3;
                if (Dp.hRNgd2zGCE5kj(Float.NaN, Float.NaN)) {
                    Float.intBitsToFloat((int) (drawScope5.b41X89IqSbKt() & 4294967295L));
                } else {
                    drawScope5.rw91HsWWsh17Nm(Float.NaN);
                }
                rangeSliderState.getClass();
                throw null;
            case 18:
                Function1 function13 = (Function1) obj3;
                TextInputSession textInputSession = (TextInputSession) ((Ref.ObjectRef) obj2).oyjLVtGms9eZwJ0;
                TextFieldValue yzPsTade5rL7D35 = ((EditProcessor) obj4).yzPsTade5rL7D3((List) obj);
                if (textInputSession != null && Intrinsics.yzPsTade5rL7D3((TextInputSession) textInputSession.yzPsTade5rL7D3.hRNgd2zGCE5kj.get(), textInputSession)) {
                    textInputSession.hRNgd2zGCE5kj.oyjLVtGms9eZwJ0(null, yzPsTade5rL7D35);
                }
                function13.uypNJrpDByoB(yzPsTade5rL7D35);
                return unit;
            case 19:
                MutableState mutableState3 = (MutableState) obj2;
                Size size = (Size) obj;
                float floatValue6 = ((Number) ((State) obj3).getOyjLVtGms9eZwJ0()).floatValue();
                float intBitsToFloat4 = Float.intBitsToFloat((int) (size.yzPsTade5rL7D3 >> 32)) * floatValue6;
                float intBitsToFloat5 = Float.intBitsToFloat((int) (size.yzPsTade5rL7D3 & 4294967295L)) * floatValue6;
                if (Float.intBitsToFloat((int) (((Size) mutableState3.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3 >> 32)) != intBitsToFloat4 || Float.intBitsToFloat((int) (((Size) mutableState3.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3 & 4294967295L)) != intBitsToFloat5) {
                    mutableState3.setValue(new Size((Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L)));
                }
                return unit;
            case 20:
                throw null;
            default:
                ((VoAHKqpbZzH9eE) obj4).hRNgd2zGCE5kj();
                return unit;
        }
    }

    public /* synthetic */ yRx9jbDCTnXb3(RangeSliderState rangeSliderState, long j, long j2, long j3, long j4, float f, float f2, Function2 function2, Function3 function3) {
        this.oyjLVtGms9eZwJ0 = 17;
        this.b41X89IqSbKt = rangeSliderState;
        this.gmXBnHsR2YSm = function2;
        this.i7xAcZoXXiIt = function3;
    }

    public /* synthetic */ yRx9jbDCTnXb3(SliderState sliderState, long j, long j2, long j3, long j4, float f, float f2, Function2 function2, Function3 function3, boolean z) {
        this.oyjLVtGms9eZwJ0 = 16;
        this.b41X89IqSbKt = sliderState;
        this.gmXBnHsR2YSm = function2;
        this.i7xAcZoXXiIt = function3;
    }

    public /* synthetic */ yRx9jbDCTnXb3(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Function1 function1) {
        this.oyjLVtGms9eZwJ0 = 12;
        this.b41X89IqSbKt = lifecycleOwner;
        this.i7xAcZoXXiIt = lifecycleStartStopEffectScope;
        this.gmXBnHsR2YSm = function1;
    }

    public /* synthetic */ yRx9jbDCTnXb3(Object obj, Object obj2, Object obj3, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
        this.i7xAcZoXXiIt = obj3;
    }

    public /* synthetic */ yRx9jbDCTnXb3(Function0 function0, PaddingValues paddingValues, Alignment.Horizontal horizontal) {
        this.oyjLVtGms9eZwJ0 = 14;
        this.i7xAcZoXXiIt = function0;
        this.b41X89IqSbKt = paddingValues;
        this.gmXBnHsR2YSm = horizontal;
    }

    public /* synthetic */ yRx9jbDCTnXb3(Function1 function1, MutableState mutableState, MutableState mutableState2) {
        this.oyjLVtGms9eZwJ0 = 3;
        this.gmXBnHsR2YSm = function1;
        this.b41X89IqSbKt = mutableState;
        this.i7xAcZoXXiIt = mutableState2;
    }

    public /* synthetic */ yRx9jbDCTnXb3(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, DefaultFlingBehavior defaultFlingBehavior) {
        this.oyjLVtGms9eZwJ0 = 10;
        this.b41X89IqSbKt = floatRef;
        this.gmXBnHsR2YSm = scrollScope;
        this.i7xAcZoXXiIt = floatRef2;
    }
}
