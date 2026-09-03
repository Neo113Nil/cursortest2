package defpackage;

import android.view.View;
import androidx.collection.LruCache;
import androidx.collection.MutableScatterSet;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.animation.core.yzPsTade5rL7D3;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceRequestCache;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.NavHostKt$NavHost$lambda$48$lambda$47$$inlined$onDispose$1;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import androidx.sqlite.SQLiteConnection;
import com.door.brass.knob.data.db.dao.TipDao_Impl;
import com.door.brass.knob.data.db.entity.TipEntity;
import com.door.brass.knob.ui.tips.TipsUiState;
import com.door.brass.knob.ui.tips.TipsViewModel;
import defpackage.j7;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class u3 implements Function1 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ u3(Function0 function0, Function0 function02) {
        this.oyjLVtGms9eZwJ0 = 13;
        this.gmXBnHsR2YSm = function0;
        this.b41X89IqSbKt = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        Lifecycle oyjLVtGms9eZwJ0;
        NavDestination ra306ClFT3HT;
        int i = 2;
        char c = 1;
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                String str = (String) this.b41X89IqSbKt;
                Function0 function0 = (Function0) this.gmXBnHsR2YSm;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                SemanticsPropertiesKt.NIabVTHf6LMJyXq(semanticsPropertyReceiver, 1.0f);
                SemanticsPropertiesKt.gmXBnHsR2YSm(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.ra306ClFT3HT(semanticsPropertyReceiver, new h2(c == true ? 1 : 0, function0));
                return Unit.yzPsTade5rL7D3;
            case 1:
                SheetState sheetState = (SheetState) this.b41X89IqSbKt;
                Animatable animatable = (Animatable) this.gmXBnHsR2YSm;
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                int i3 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                float oyjLVtGms9eZwJ02 = ((SnapshotMutableFloatStateImpl) sheetState.oyjLVtGms9eZwJ0.UEutaskTsxaI).oyjLVtGms9eZwJ0();
                float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getExVmIuryuB8HeQ() & 4294967295L));
                if (!Float.isNaN(oyjLVtGms9eZwJ02) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
                    float floatValue = ((Number) animatable.oyjLVtGms9eZwJ0()).floatValue();
                    graphicsLayerScope.exVmIuryuB8HeQ(ModalBottomSheetKt.oyjLVtGms9eZwJ0(graphicsLayerScope, floatValue));
                    graphicsLayerScope.Yey4RyhSyBRHub(ModalBottomSheetKt.b41X89IqSbKt(graphicsLayerScope, floatValue));
                    graphicsLayerScope.pJp52Z5NdMAiw(TransformOriginKt.yzPsTade5rL7D3(0.5f, (oyjLVtGms9eZwJ02 + intBitsToFloat) / intBitsToFloat));
                }
                return Unit.yzPsTade5rL7D3;
            case 2:
                NavDestination navDestination = (NavDestination) this.b41X89IqSbKt;
                NavControllerImpl navControllerImpl = ((NavController) this.gmXBnHsR2YSm).hRNgd2zGCE5kj;
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                navOptionsBuilder.getClass();
                NavOptions.Builder builder = navOptionsBuilder.yzPsTade5rL7D3;
                builder.i7xAcZoXXiIt = 0;
                builder.Uo5pffGf8LUU = 0;
                if (navDestination instanceof NavGraph) {
                    int i4 = NavDestination.Uo5pffGf8LUU;
                    Iterator yzPsTade5rL7D3 = NavDestination.Companion.hRNgd2zGCE5kj(navDestination).getYzPsTade5rL7D3();
                    while (true) {
                        if (yzPsTade5rL7D3.hasNext()) {
                            NavDestination navDestination2 = (NavDestination) yzPsTade5rL7D3.next();
                            NavDestination i7xAcZoXXiIt = navControllerImpl.i7xAcZoXXiIt();
                            if (Intrinsics.yzPsTade5rL7D3(navDestination2, i7xAcZoXXiIt != null ? i7xAcZoXXiIt.gmXBnHsR2YSm : null)) {
                            }
                        } else {
                            int i5 = NavGraph.UEutaskTsxaI;
                            NavGraph navGraph = navControllerImpl.ra306ClFT3HT;
                            if (navGraph == null) {
                                yzPsTade5rL7D3.kSPEzfraxudm4i("You must call setGraph() before calling getGraph()");
                                return null;
                            }
                            navOptionsBuilder.oyjLVtGms9eZwJ0 = ((NavDestination) SequencesKt.b41X89IqSbKt(SequencesKt.hRNgd2zGCE5kj(navGraph, new l3(21)))).b41X89IqSbKt.oyjLVtGms9eZwJ0;
                            PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
                            popUpToBuilder.hRNgd2zGCE5kj = true;
                            navOptionsBuilder.gmXBnHsR2YSm = popUpToBuilder.yzPsTade5rL7D3;
                            navOptionsBuilder.i7xAcZoXXiIt = true;
                        }
                    }
                }
                return Unit.yzPsTade5rL7D3;
            case 3:
                final State state = (State) this.b41X89IqSbKt;
                final ComposeNavigator composeNavigator = (ComposeNavigator) this.gmXBnHsR2YSm;
                return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$69$lambda$68$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        Iterator it = ((List) State.this.getOyjLVtGms9eZwJ0()).iterator();
                        while (it.hasNext()) {
                            composeNavigator.hRNgd2zGCE5kj().hRNgd2zGCE5kj((NavBackStackEntry) it.next());
                        }
                    }
                };
            case 4:
                NavHostController navHostController = (NavHostController) this.b41X89IqSbKt;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.gmXBnHsR2YSm;
                navHostController.getClass();
                lifecycleOwner.getClass();
                NavControllerImpl navControllerImpl2 = navHostController.hRNgd2zGCE5kj;
                GiTAvmtrM6Bh8SJ giTAvmtrM6Bh8SJ = navControllerImpl2.FTJ2XS7ULgY8;
                if (!lifecycleOwner.equals(navControllerImpl2.NIabVTHf6LMJyXq)) {
                    LifecycleOwner lifecycleOwner2 = navControllerImpl2.NIabVTHf6LMJyXq;
                    if (lifecycleOwner2 != null && (oyjLVtGms9eZwJ0 = lifecycleOwner2.getOyjLVtGms9eZwJ0()) != null) {
                        oyjLVtGms9eZwJ0.ra306ClFT3HT(giTAvmtrM6Bh8SJ);
                    }
                    navControllerImpl2.NIabVTHf6LMJyXq = lifecycleOwner;
                    lifecycleOwner.getOyjLVtGms9eZwJ0().yzPsTade5rL7D3(giTAvmtrM6Bh8SJ);
                }
                return new NavHostKt$NavHost$lambda$48$lambda$47$$inlined$onDispose$1();
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                Navigator navigator = (Navigator) this.b41X89IqSbKt;
                NavOptions navOptions = (NavOptions) this.gmXBnHsR2YSm;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry.MRfxZSx8l5UG62U;
                NavDestination navDestination3 = navBackStackEntry.b41X89IqSbKt;
                if (navDestination3 == null) {
                    navDestination3 = null;
                }
                if (navDestination3 == null || (ra306ClFT3HT = navigator.ra306ClFT3HT(navDestination3, navBackStackEntryImpl.yzPsTade5rL7D3(), navOptions)) == null) {
                    return null;
                }
                return ra306ClFT3HT.equals(navDestination3) ? navBackStackEntry : navigator.hRNgd2zGCE5kj().yzPsTade5rL7D3(ra306ClFT3HT, ra306ClFT3HT.hRNgd2zGCE5kj(navBackStackEntryImpl.yzPsTade5rL7D3()));
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ControlledComposition controlledComposition = (ControlledComposition) this.b41X89IqSbKt;
                MutableScatterSet mutableScatterSet = (MutableScatterSet) this.gmXBnHsR2YSm;
                MutableStateFlow mutableStateFlow = Recomposer.BD2CRjLJ8EtOqGQ;
                controlledComposition.UEutaskTsxaI(obj);
                if (mutableScatterSet != null) {
                    mutableScatterSet.oyjLVtGms9eZwJ0(obj);
                }
                return Unit.yzPsTade5rL7D3;
            case 7:
                Recomposer recomposer = (Recomposer) this.b41X89IqSbKt;
                Throwable th = (Throwable) this.gmXBnHsR2YSm;
                Throwable th2 = (Throwable) obj;
                synchronized (recomposer.ra306ClFT3HT) {
                    if (th != null) {
                        if (th2 != null) {
                            try {
                                r4 = th2 instanceof CancellationException ? null : th2;
                                if (r4 != null) {
                                    ExceptionsKt.yzPsTade5rL7D3(th, r4);
                                }
                            } finally {
                            }
                        }
                        r4 = th;
                    }
                    recomposer.b41X89IqSbKt = r4;
                    recomposer.pu0JZhzR2Or6.setValue(Recomposer.State.oyjLVtGms9eZwJ0);
                }
                return Unit.yzPsTade5rL7D3;
            case 8:
                ((SnapshotMutableStateImpl) ((MutableWindowInsets) this.b41X89IqSbKt).yzPsTade5rL7D3).setValue(WindowInsetsKt.ra306ClFT3HT((WindowInsets) this.gmXBnHsR2YSm, (WindowInsets) obj));
                return Unit.yzPsTade5rL7D3;
            case 9:
                NestedScrollScope nestedScrollScope = (NestedScrollScope) this.b41X89IqSbKt;
                ScrollingLogic scrollingLogic = (ScrollingLogic) this.gmXBnHsR2YSm;
                DragEvent.DragDelta dragDelta = (DragEvent.DragDelta) obj;
                float f = dragDelta.hRNgd2zGCE5kj ? -1.0f : 1.0f;
                long j = dragDelta.yzPsTade5rL7D3;
                nestedScrollScope.yzPsTade5rL7D3(1, Offset.i7xAcZoXXiIt(f, scrollingLogic.oyjLVtGms9eZwJ0 == Orientation.b41X89IqSbKt ? Offset.yzPsTade5rL7D3(j, 0.0f, 1) : Offset.yzPsTade5rL7D3(j, 0.0f, 2)));
                return Unit.yzPsTade5rL7D3;
            case 10:
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                return cacheDrawScope.oyjLVtGms9eZwJ0(new u3(11, ((Shape) this.b41X89IqSbKt).yzPsTade5rL7D3(cacheDrawScope.oyjLVtGms9eZwJ0.b41X89IqSbKt(), cacheDrawScope.oyjLVtGms9eZwJ0.getLayoutDirection(), cacheDrawScope), (ColorProducer) this.gmXBnHsR2YSm));
            case 11:
                OutlineKt.hRNgd2zGCE5kj((DrawScope) obj, (Outline) this.b41X89IqSbKt, ((ColorProducer) this.gmXBnHsR2YSm).yzPsTade5rL7D3());
                return Unit.yzPsTade5rL7D3;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                final MutableState mutableState = (MutableState) this.b41X89IqSbKt;
                final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) this.gmXBnHsR2YSm;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$lambda$0$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        MutableState mutableState2 = MutableState.this;
                        PressInteraction.Press press = (PressInteraction.Press) mutableState2.getOyjLVtGms9eZwJ0();
                        if (press != null) {
                            PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                            if (mutableInteractionSource2 != null) {
                                mutableInteractionSource2.hRNgd2zGCE5kj(cancel);
                            }
                            mutableState2.setValue(null);
                        }
                    }
                };
            case 13:
                Function0 function02 = (Function0) this.gmXBnHsR2YSm;
                Function0 function03 = (Function0) this.b41X89IqSbKt;
                TextContextMenuSession textContextMenuSession = (TextContextMenuSession) obj;
                function02.hRNgd2zGCE5kj();
                if (function03 != null ? ((Boolean) function03.hRNgd2zGCE5kj()).booleanValue() : true) {
                    textContextMenuSession.close();
                }
                return Unit.yzPsTade5rL7D3;
            case 14:
                TipDao_Impl tipDao_Impl = (TipDao_Impl) this.b41X89IqSbKt;
                TipEntity tipEntity = (TipEntity) this.gmXBnHsR2YSm;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                tipDao_Impl.ra306ClFT3HT.ra306ClFT3HT(sQLiteConnection, tipEntity);
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                TipDao_Impl tipDao_Impl2 = (TipDao_Impl) this.b41X89IqSbKt;
                List list = (List) this.gmXBnHsR2YSm;
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                tipDao_Impl2.hRNgd2zGCE5kj.ra306ClFT3HT(sQLiteConnection2, list);
                return Unit.yzPsTade5rL7D3;
            case 16:
                MutableState mutableState2 = (MutableState) this.b41X89IqSbKt;
                final TipsViewModel tipsViewModel = (TipsViewModel) this.gmXBnHsR2YSm;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                final List list2 = ((TipsUiState) mutableState2.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3;
                final j7 j7Var = new j7(14);
                lazyListScope.yzPsTade5rL7D3(list2.size(), new Function1<Integer, Object>() { // from class: com.door.brass.knob.ui.tips.TipsScreenKt$TipsScreen$lambda$2$0$2$0$$inlined$items$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj2) {
                        return j7.this.uypNJrpDByoB(list2.get(((Number) obj2).intValue()));
                    }
                }, new Function1<Integer, Object>() { // from class: com.door.brass.knob.ui.tips.TipsScreenKt$TipsScreen$lambda$2$0$2$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj2) {
                        list2.get(((Number) obj2).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(802480018, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.door.brass.knob.ui.tips.TipsScreenKt$TipsScreen$lambda$2$0$2$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object o2t7oodqU1bUMaS(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int intValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int intValue2 = ((Number) obj5).intValue();
                        if ((intValue2 & 6) == 0) {
                            i6 = (composer.zgejW39NNp2D(lazyItemScope) ? 4 : 2) | intValue2;
                        } else {
                            i6 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i6 |= composer.kSPEzfraxudm4i(intValue) ? 32 : 16;
                        }
                        if (composer.ZvpnNpCMEWSR3(i6 & 1, (i6 & 147) != 146)) {
                            final TipEntity tipEntity2 = (TipEntity) list2.get(intValue);
                            composer.mFNFvFv0Eiyk(1522938250);
                            final TipsViewModel tipsViewModel2 = tipsViewModel;
                            boolean NIabVTHf6LMJyXq = composer.NIabVTHf6LMJyXq(tipsViewModel2) | composer.zgejW39NNp2D(tipEntity2);
                            Object UEutaskTsxaI = composer.UEutaskTsxaI();
                            if (NIabVTHf6LMJyXq || UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                                UEutaskTsxaI = new Function0<Unit>() { // from class: com.door.brass.knob.ui.tips.TipsScreenKt$TipsScreen$1$1$3$1$2$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object hRNgd2zGCE5kj() {
                                        Object value;
                                        long j2 = tipEntity2.yzPsTade5rL7D3;
                                        MutableStateFlow mutableStateFlow2 = TipsViewModel.this.ra306ClFT3HT;
                                        do {
                                            value = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.i7xAcZoXXiIt(value, TipsUiState.yzPsTade5rL7D3((TipsUiState) value, null, null, Long.valueOf(j2), 27)));
                                        return Unit.yzPsTade5rL7D3;
                                    }
                                };
                                composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                            }
                            TipsScreenKt.yzPsTade5rL7D3(tipEntity2, (Function0) UEutaskTsxaI, composer, 0);
                            composer.o4ticBN7g1K8jE();
                        } else {
                            composer.gmXBnHsR2YSm();
                        }
                        return Unit.yzPsTade5rL7D3;
                    }
                }, true));
                return Unit.yzPsTade5rL7D3;
            case 17:
                final TransitionState transitionState = (TransitionState) this.b41X89IqSbKt;
                ((SeekableTransitionState) transitionState).o2t7oodqU1bUMaS(new SnapshotStateObserver(new yzPsTade5rL7D3(i, Thread.currentThread(), (CoroutineScope) this.gmXBnHsR2YSm)));
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        ((SeekableTransitionState) TransitionState.this).o2t7oodqU1bUMaS(null);
                    }
                };
            case 18:
                final Transition transition = (Transition) this.b41X89IqSbKt;
                final Transition transition2 = (Transition) this.gmXBnHsR2YSm;
                transition.UEutaskTsxaI.add(transition2);
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        Transition.this.UEutaskTsxaI.remove(transition2);
                    }
                };
            case 19:
                final Transition transition3 = (Transition) this.b41X89IqSbKt;
                final Transition.DeferredAnimation deferredAnimation = (Transition.DeferredAnimation) this.gmXBnHsR2YSm;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        Transition transition4 = Transition.this;
                        transition4.getClass();
                        Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData = (Transition.DeferredAnimation.DeferredAnimationData) ((SnapshotMutableStateImpl) deferredAnimation.hRNgd2zGCE5kj).getOyjLVtGms9eZwJ0();
                        if (deferredAnimationData != null) {
                            transition4.FsuUJlzzWhYnMlD.remove(deferredAnimationData.oyjLVtGms9eZwJ0);
                        }
                    }
                };
            case 20:
                final Transition transition4 = (Transition) this.b41X89IqSbKt;
                final Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) this.gmXBnHsR2YSm;
                transition4.FsuUJlzzWhYnMlD.add(transitionAnimationState);
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        Transition.this.FsuUJlzzWhYnMlD.remove(transitionAnimationState);
                    }
                };
            case 21:
                TypefaceRequestCache typefaceRequestCache = (TypefaceRequestCache) this.b41X89IqSbKt;
                TypefaceRequest typefaceRequest = (TypefaceRequest) this.gmXBnHsR2YSm;
                TypefaceResult typefaceResult = (TypefaceResult) obj;
                synchronized (typefaceRequestCache.yzPsTade5rL7D3) {
                    try {
                        boolean b41X89IqSbKt = typefaceResult.getB41X89IqSbKt();
                        LruCache lruCache = typefaceRequestCache.hRNgd2zGCE5kj;
                        if (b41X89IqSbKt) {
                        }
                    } finally {
                    }
                }
                return Unit.yzPsTade5rL7D3;
            case 22:
                UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) this.b41X89IqSbKt;
                Function1 function1 = (Function1) this.gmXBnHsR2YSm;
                ((Long) obj).getClass();
                float f2 = updatableAnimationState.b41X89IqSbKt;
                updatableAnimationState.b41X89IqSbKt = 0.0f;
                function1.uypNJrpDByoB(Float.valueOf(f2));
                return Unit.yzPsTade5rL7D3;
            default:
                final WindowInsetsHolder windowInsetsHolder = (WindowInsetsHolder) this.b41X89IqSbKt;
                final View view = (View) this.gmXBnHsR2YSm;
                windowInsetsHolder.yzPsTade5rL7D3(view);
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$lambda$0$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        WindowInsetsHolder windowInsetsHolder2 = WindowInsetsHolder.this;
                        int i6 = windowInsetsHolder2.OcGJUxcOVecQiKb - 1;
                        windowInsetsHolder2.OcGJUxcOVecQiKb = i6;
                        if (i6 == 0) {
                            View view2 = view;
                            ViewCompat.i7xAcZoXXiIt(view2, null);
                            ViewCompat.Uo5pffGf8LUU(view2, null);
                            view2.removeOnAttachStateChangeListener(windowInsetsHolder2.XrorSzThrtvJ4A);
                        }
                    }
                };
        }
    }

    public /* synthetic */ u3(int i, Object obj, Object obj2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
    }
}
