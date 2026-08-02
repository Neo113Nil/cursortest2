package org.betup.ui.fragment.bets.quiz.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.model.remote.entity.quiz.QuizShortParticipationModel;
import org.betup.model.remote.entity.quiz.QuizStateCountModel;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;

/* compiled from: QuizResultsScreen.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¿\u0001\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0095\u0001\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0003¢\u0006\u0002\u0010 ¨\u0006!²\u0006\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u008a\u0084\u0002"}, d2 = {"QuizResultsScreen", "", "participationsFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lorg/betup/model/remote/entity/quiz/QuizShortParticipationModel;", "onParticipationClick", "Lkotlin/Function1;", "onFilterSelected", "", "onRefresh", "Lkotlin/Function0;", "selectedStateFlow", "isRefreshingFlow", "", "isLoadMoreFlow", "hasMoreFlow", "loadMore", "stateCountsFlow", "Lorg/betup/model/remote/entity/quiz/QuizStateCountModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "QuizResultsUi", "participations", "selectedState", "isRefreshing", "isLoadMore", "hasMore", "stateCounts", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;ZZZLjava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;III)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizResultsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuizResultsScreen$lambda$7(StateFlow stateFlow, Function1 function1, Function1 function12, Function0 function0, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, StateFlow stateFlow5, Function0 function02, StateFlow stateFlow6, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        QuizResultsScreen(stateFlow, function1, function12, function0, stateFlow2, stateFlow3, stateFlow4, stateFlow5, function02, stateFlow6, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuizResultsUi$lambda$9(List list, Function1 function1, Function1 function12, Function0 function0, Integer num, boolean z, boolean z2, boolean z3, List list2, Modifier modifier, LazyListState lazyListState, int i, int i2, int i3, Composer composer, int i4) {
        QuizResultsUi(list, function1, function12, function0, num, z, z2, z3, list2, modifier, lazyListState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void QuizResultsScreen(final StateFlow<? extends List<QuizShortParticipationModel>> participationsFlow, final Function1<? super QuizShortParticipationModel, Unit> onParticipationClick, final Function1<? super Integer, Unit> onFilterSelected, final Function0<Unit> onRefresh, final StateFlow<Integer> selectedStateFlow, final StateFlow<Boolean> isRefreshingFlow, final StateFlow<Boolean> isLoadMoreFlow, final StateFlow<Boolean> hasMoreFlow, final Function0<Unit> loadMore, final StateFlow<? extends List<QuizStateCountModel>> stateCountsFlow, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        LazyListState lazyListState;
        Composer composer2;
        int i6;
        State state;
        int i7;
        Composer composer3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(participationsFlow, "participationsFlow");
        Intrinsics.checkNotNullParameter(onParticipationClick, "onParticipationClick");
        Intrinsics.checkNotNullParameter(onFilterSelected, "onFilterSelected");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(selectedStateFlow, "selectedStateFlow");
        Intrinsics.checkNotNullParameter(isRefreshingFlow, "isRefreshingFlow");
        Intrinsics.checkNotNullParameter(isLoadMoreFlow, "isLoadMoreFlow");
        Intrinsics.checkNotNullParameter(hasMoreFlow, "hasMoreFlow");
        Intrinsics.checkNotNullParameter(loadMore, "loadMore");
        Intrinsics.checkNotNullParameter(stateCountsFlow, "stateCountsFlow");
        Composer startRestartGroup = composer.startRestartGroup(815043522);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(participationsFlow) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onParticipationClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onFilterSelected) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onRefresh) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(selectedStateFlow) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(isRefreshingFlow) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(isLoadMoreFlow) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(hasMoreFlow) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(loadMore) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(stateCountsFlow) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i8 = i3 & 1024;
        if (i8 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i4 & 306783379) != 306783378 || (i5 & 3) != 2 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i8 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(815043522, i4, i5, "org.betup.ui.fragment.bets.quiz.compose.QuizResultsScreen (QuizResultsScreen.kt:54)");
            }
            State collectAsState = SnapshotStateKt.collectAsState(participationsFlow, null, startRestartGroup, i4 & 14, 1);
            State collectAsState2 = SnapshotStateKt.collectAsState(isRefreshingFlow, null, startRestartGroup, (i4 >> 15) & 14, 1);
            State collectAsState3 = SnapshotStateKt.collectAsState(isLoadMoreFlow, null, startRestartGroup, (i4 >> 18) & 14, 1);
            State collectAsState4 = SnapshotStateKt.collectAsState(hasMoreFlow, null, startRestartGroup, (i4 >> 21) & 14, 1);
            State collectAsState5 = SnapshotStateKt.collectAsState(selectedStateFlow, null, startRestartGroup, (i4 >> 12) & 14, 1);
            State collectAsState6 = SnapshotStateKt.collectAsState(stateCountsFlow, null, startRestartGroup, (i4 >> 27) & 14, 1);
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            Object[] objArr = {rememberLazyListStateWithoutSavedState, Boolean.valueOf(QuizResultsScreen$lambda$3(collectAsState4)), Boolean.valueOf(QuizResultsScreen$lambda$2(collectAsState3)), Integer.valueOf(QuizResultsScreen$lambda$0(collectAsState).size())};
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changed = ((234881024 & i4) == 67108864) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(collectAsState4);
            QuizResultsScreenKt$QuizResultsScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                lazyListState = rememberLazyListStateWithoutSavedState;
                composer2 = startRestartGroup;
                i6 = i4;
                state = collectAsState3;
                i7 = 0;
                rememberedValue = new QuizResultsScreenKt$QuizResultsScreen$1$1(rememberLazyListStateWithoutSavedState, loadMore, collectAsState, collectAsState3, collectAsState4, null);
                composer2.updateRememberedValue(rememberedValue);
            } else {
                i6 = i4;
                lazyListState = rememberLazyListStateWithoutSavedState;
                composer2 = startRestartGroup;
                state = collectAsState3;
                i7 = 0;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer2, i7);
            int i9 = ((i5 << 27) & 1879048192) | (i6 & 8176);
            composer3 = composer2;
            QuizResultsUi(QuizResultsScreen$lambda$0(collectAsState), onParticipationClick, onFilterSelected, onRefresh, QuizResultsScreen$lambda$4(collectAsState5), QuizResultsScreen$lambda$1(collectAsState2), QuizResultsScreen$lambda$2(state), QuizResultsScreen$lambda$3(collectAsState4), QuizResultsScreen$lambda$5(collectAsState6), modifier3, lazyListState, composer2, i9, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.quiz.compose.QuizResultsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuizResultsScreen$lambda$7;
                    QuizResultsScreen$lambda$7 = QuizResultsScreenKt.QuizResultsScreen$lambda$7(StateFlow.this, onParticipationClick, onFilterSelected, onRefresh, selectedStateFlow, isRefreshingFlow, isLoadMoreFlow, hasMoreFlow, loadMore, stateCountsFlow, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return QuizResultsScreen$lambda$7;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void QuizResultsUi(final List<QuizShortParticipationModel> list, final Function1<? super QuizShortParticipationModel, Unit> function1, final Function1<? super Integer, Unit> function12, final Function0<Unit> function0, final Integer num, final boolean z, final boolean z2, final boolean z3, final List<QuizStateCountModel> list2, Modifier modifier, final LazyListState lazyListState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2084028470);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(num) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(list2) ? 67108864 : 33554432;
                i5 = i3 & 512;
                if (i5 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(modifier) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                }
                if ((i3 & 1024) != 0) {
                    i6 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i6 = i2 | (startRestartGroup.changed(lazyListState) ? 4 : 2);
                } else {
                    i6 = i2;
                }
                if ((i4 & 306783379) == 306783378 || (i6 & 3) != 2 || !startRestartGroup.getSkipping()) {
                    Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2084028470, i4, i6, "org.betup.ui.fragment.bets.quiz.compose.QuizResultsUi (QuizResultsScreen.kt:114)");
                    }
                    PullToRefreshState rememberPullToRefreshState = PullToRefreshKt.rememberPullToRefreshState(startRestartGroup, 0);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    Modifier modifier4 = modifier3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    PullToRefreshKt.PullToRefreshBox(z, function0, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), rememberPullToRefreshState, null, null, ComposableLambdaKt.rememberComposableLambda(-1828019946, true, new QuizResultsScreenKt$QuizResultsUi$1$1(lazyListState, list, function1, z2, z3, num, list2, function12), startRestartGroup, 54), startRestartGroup, ((i4 >> 15) & 14) | 1573248 | ((i4 >> 6) & 112), 48);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.quiz.compose.QuizResultsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit QuizResultsUi$lambda$9;
                            QuizResultsUi$lambda$9 = QuizResultsScreenKt.QuizResultsUi$lambda$9(list, function1, function12, function0, num, z, z2, z3, list2, modifier2, lazyListState, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return QuizResultsUi$lambda$9;
                        }
                    });
                    return;
                }
                return;
            }
            i5 = i3 & 512;
            if (i5 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            PullToRefreshState rememberPullToRefreshState2 = PullToRefreshKt.rememberPullToRefreshState(startRestartGroup, 0);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            Modifier modifier42 = modifier3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            PullToRefreshKt.PullToRefreshBox(z, function0, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), rememberPullToRefreshState2, null, null, ComposableLambdaKt.rememberComposableLambda(-1828019946, true, new QuizResultsScreenKt$QuizResultsUi$1$1(lazyListState, list, function1, z2, z3, num, list2, function12), startRestartGroup, 54), startRestartGroup, ((i4 >> 15) & 14) | 1573248 | ((i4 >> 6) & 112), 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        PullToRefreshState rememberPullToRefreshState22 = PullToRefreshKt.rememberPullToRefreshState(startRestartGroup, 0);
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        Modifier modifier422 = modifier3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        PullToRefreshKt.PullToRefreshBox(z, function0, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), rememberPullToRefreshState22, null, null, ComposableLambdaKt.rememberComposableLambda(-1828019946, true, new QuizResultsScreenKt$QuizResultsUi$1$1(lazyListState, list, function1, z2, z3, num, list2, function12), startRestartGroup, 54), startRestartGroup, ((i4 >> 15) & 14) | 1573248 | ((i4 >> 6) & 112), 48);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier422;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<QuizShortParticipationModel> QuizResultsScreen$lambda$0(State<? extends List<QuizShortParticipationModel>> state) {
        return state.getValue();
    }

    private static final boolean QuizResultsScreen$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean QuizResultsScreen$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean QuizResultsScreen$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final Integer QuizResultsScreen$lambda$4(State<Integer> state) {
        return state.getValue();
    }

    private static final List<QuizStateCountModel> QuizResultsScreen$lambda$5(State<? extends List<QuizStateCountModel>> state) {
        return state.getValue();
    }
}
