package defpackage;

import android.os.Bundle;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogicKt;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.oyjLVtGms9eZwJ0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavControllerImpl;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class OMQMj05FgBf7 implements Function1 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ OMQMj05FgBf7(Ref.BooleanRef booleanRef, NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle) {
        this.oyjLVtGms9eZwJ0 = 5;
        this.Uo5pffGf8LUU = booleanRef;
        this.b41X89IqSbKt = navControllerImpl;
        this.gmXBnHsR2YSm = navDestination;
        this.i7xAcZoXXiIt = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.i7xAcZoXXiIt;
        Object obj3 = this.gmXBnHsR2YSm;
        Object obj4 = this.b41X89IqSbKt;
        Object obj5 = this.Uo5pffGf8LUU;
        switch (i) {
            case 0:
                Animatable animatable = (Animatable) obj4;
                AnimationState animationState = (AnimationState) obj3;
                Function1 function1 = (Function1) obj2;
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj5;
                AnimationScope animationScope = (AnimationScope) obj;
                SuspendAnimationKt.UEutaskTsxaI(animationScope, animatable.ra306ClFT3HT);
                SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) animationScope.b41X89IqSbKt;
                Object yzPsTade5rL7D3 = Animatable.yzPsTade5rL7D3(animatable, snapshotMutableStateImpl.getOyjLVtGms9eZwJ0());
                if (Intrinsics.yzPsTade5rL7D3(yzPsTade5rL7D3, snapshotMutableStateImpl.getOyjLVtGms9eZwJ0())) {
                    if (function1 != null) {
                        function1.uypNJrpDByoB(animatable);
                        break;
                    }
                } else {
                    ((SnapshotMutableStateImpl) animatable.ra306ClFT3HT.b41X89IqSbKt).setValue(yzPsTade5rL7D3);
                    ((SnapshotMutableStateImpl) animationState.b41X89IqSbKt).setValue(yzPsTade5rL7D3);
                    if (function1 != null) {
                        function1.uypNJrpDByoB(animatable);
                    }
                    animationScope.yzPsTade5rL7D3();
                    booleanRef.oyjLVtGms9eZwJ0 = true;
                    break;
                }
                break;
            case 1:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj4;
                TextInputService textInputService = (TextInputService) obj3;
                TextFieldValue textFieldValue = (TextFieldValue) obj2;
                ImeOptions imeOptions = (ImeOptions) obj5;
                if (legacyTextFieldState.hRNgd2zGCE5kj()) {
                    EditProcessor editProcessor = legacyTextFieldState.oyjLVtGms9eZwJ0;
                    p0 p0Var = legacyTextFieldState.pu0JZhzR2Or6;
                    p0 p0Var2 = legacyTextFieldState.OcGJUxcOVecQiKb;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    yRx9jbDCTnXb3 yrx9jbdctnxb3 = new yRx9jbDCTnXb3(editProcessor, p0Var, objectRef, 18);
                    PlatformTextInputService platformTextInputService = textInputService.yzPsTade5rL7D3;
                    platformTextInputService.i7xAcZoXXiIt(textFieldValue, imeOptions, yrx9jbdctnxb3, p0Var2);
                    TextInputSession textInputSession = new TextInputSession(textInputService, platformTextInputService);
                    textInputService.hRNgd2zGCE5kj.set(textInputSession);
                    objectRef.oyjLVtGms9eZwJ0 = textInputSession;
                    legacyTextFieldState.b41X89IqSbKt = textInputSession;
                }
                break;
            case 2:
                InfiniteTransition infiniteTransition = (InfiniteTransition) obj3;
                Ref.FloatRef floatRef = (Ref.FloatRef) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                long longValue = ((Long) obj).longValue();
                State state = (State) ((MutableState) obj4).getOyjLVtGms9eZwJ0();
                long longValue2 = state != null ? ((Number) state.getOyjLVtGms9eZwJ0()).longValue() : longValue;
                long j = infiniteTransition.ra306ClFT3HT;
                MutableVector mutableVector = infiniteTransition.yzPsTade5rL7D3;
                if (j == Long.MIN_VALUE || floatRef.oyjLVtGms9eZwJ0 != SuspendAnimationKt.FsuUJlzzWhYnMlD(coroutineScope.getB41X89IqSbKt())) {
                    infiniteTransition.ra306ClFT3HT = longValue;
                    Object[] objArr = mutableVector.oyjLVtGms9eZwJ0;
                    int i2 = mutableVector.gmXBnHsR2YSm;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((InfiniteTransition.TransitionAnimationState) objArr[i3]).MRfxZSx8l5UG62U = true;
                    }
                    floatRef.oyjLVtGms9eZwJ0 = SuspendAnimationKt.FsuUJlzzWhYnMlD(coroutineScope.getB41X89IqSbKt());
                }
                float f = floatRef.oyjLVtGms9eZwJ0;
                if (f == 0.0f) {
                    Object[] objArr2 = mutableVector.oyjLVtGms9eZwJ0;
                    int i4 = mutableVector.gmXBnHsR2YSm;
                    for (int i5 = 0; i5 < i4; i5++) {
                        InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) objArr2[i5];
                        ((SnapshotMutableStateImpl) transitionAnimationState.i7xAcZoXXiIt).setValue(transitionAnimationState.FsuUJlzzWhYnMlD.ra306ClFT3HT);
                        transitionAnimationState.MRfxZSx8l5UG62U = true;
                    }
                    break;
                } else {
                    long j2 = (long) ((longValue2 - infiniteTransition.ra306ClFT3HT) / f);
                    Object[] objArr3 = mutableVector.oyjLVtGms9eZwJ0;
                    int i6 = mutableVector.gmXBnHsR2YSm;
                    boolean z = true;
                    for (int i7 = 0; i7 < i6; i7++) {
                        InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) objArr3[i7];
                        if (!transitionAnimationState2.UEutaskTsxaI) {
                            ((SnapshotMutableStateImpl) InfiniteTransition.this.hRNgd2zGCE5kj).setValue(Boolean.FALSE);
                            if (transitionAnimationState2.MRfxZSx8l5UG62U) {
                                transitionAnimationState2.MRfxZSx8l5UG62U = false;
                                transitionAnimationState2.kSPEzfraxudm4i = j2;
                            }
                            long j3 = j2 - transitionAnimationState2.kSPEzfraxudm4i;
                            ((SnapshotMutableStateImpl) transitionAnimationState2.i7xAcZoXXiIt).setValue(transitionAnimationState2.FsuUJlzzWhYnMlD.hRNgd2zGCE5kj(j3));
                            transitionAnimationState2.UEutaskTsxaI = transitionAnimationState2.FsuUJlzzWhYnMlD.i7xAcZoXXiIt(j3);
                        }
                        if (!transitionAnimationState2.UEutaskTsxaI) {
                            z = false;
                        }
                    }
                    ((SnapshotMutableStateImpl) infiniteTransition.oyjLVtGms9eZwJ0).setValue(Boolean.valueOf(!z));
                    break;
                }
            case 3:
                final LazyLayoutPrefetchState lazyLayoutPrefetchState = (LazyLayoutPrefetchState) obj4;
                lazyLayoutPrefetchState.oyjLVtGms9eZwJ0 = new PrefetchHandleProvider((LazyLayoutItemContentFactory) obj3, (SubcomposeLayoutState) obj2, (PrefetchScheduler) obj5);
                break;
            case 4:
                Ref.FloatRef floatRef2 = (Ref.FloatRef) obj4;
                MouseWheelScrollingLogic mouseWheelScrollingLogic = (MouseWheelScrollingLogic) obj3;
                NestedScrollScope nestedScrollScope = (NestedScrollScope) obj2;
                oyjLVtGms9eZwJ0 oyjlvtgms9ezwj0 = (oyjLVtGms9eZwJ0) obj5;
                AnimationScope animationScope2 = (AnimationScope) obj;
                float floatValue = ((Number) ((SnapshotMutableStateImpl) animationScope2.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue() - floatRef2.oyjLVtGms9eZwJ0;
                if (!MouseWheelScrollingLogicKt.yzPsTade5rL7D3(floatValue)) {
                    if (!MouseWheelScrollingLogicKt.yzPsTade5rL7D3(floatValue - mouseWheelScrollingLogic.b41X89IqSbKt(nestedScrollScope, floatValue))) {
                        animationScope2.yzPsTade5rL7D3();
                        break;
                    } else {
                        floatRef2.oyjLVtGms9eZwJ0 += floatValue;
                    }
                }
                if (((Boolean) oyjlvtgms9ezwj0.uypNJrpDByoB(Float.valueOf(floatRef2.oyjLVtGms9eZwJ0))).booleanValue()) {
                    animationScope2.yzPsTade5rL7D3();
                    break;
                }
                break;
            default:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                ((Ref.BooleanRef) obj5).oyjLVtGms9eZwJ0 = true;
                ((NavControllerImpl) obj4).yzPsTade5rL7D3((NavDestination) obj3, (Bundle) obj2, navBackStackEntry, EmptyList.oyjLVtGms9eZwJ0);
                break;
        }
        return unit;
    }

    public /* synthetic */ OMQMj05FgBf7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
        this.i7xAcZoXXiIt = obj3;
        this.Uo5pffGf8LUU = obj4;
    }
}
