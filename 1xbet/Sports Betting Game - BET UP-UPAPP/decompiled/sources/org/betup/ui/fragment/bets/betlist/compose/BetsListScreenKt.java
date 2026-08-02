package org.betup.ui.fragment.bets.betlist.compose;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
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
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;

/* compiled from: BetsListScreen.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aÃ\u0001\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\u0010\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\tX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, d2 = {"BetsListScreen", "", "betListsFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "onBetClick", "Lkotlin/Function1;", "onBetStateSelected", "Lorg/betup/model/remote/entity/bets/BetState;", "onRefresh", "Lkotlin/Function0;", "selectedStateFlow", "isRefreshingFlow", "", "modifier", "Landroidx/compose/ui/Modifier;", "loadMore", "isLoadMoreFlow", "hasMoreFlow", "betStatus", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "isInProfile", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;ZLandroidx/compose/runtime/Composer;III)V", "PreviewBetListCompactItem", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "betLists", "isRefreshing", "isLoadMore", "hasMore", "selectedState", "betStatusValue"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetsListScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetsListScreen$lambda$9(StateFlow stateFlow, Function1 function1, Function1 function12, Function0 function0, StateFlow stateFlow2, StateFlow stateFlow3, Modifier modifier, Function0 function02, StateFlow stateFlow4, StateFlow stateFlow5, StateFlow stateFlow6, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        BetsListScreen(stateFlow, function1, function12, function0, stateFlow2, stateFlow3, modifier, function02, stateFlow4, stateFlow5, stateFlow6, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetListCompactItem$lambda$10(int i, Composer composer, int i2) {
        PreviewBetListCompactItem(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetsListScreen(final StateFlow<? extends List<? extends BetsListModel>> betListsFlow, final Function1<? super BetsListModel, Unit> onBetClick, final Function1<? super BetState, Unit> onBetStateSelected, final Function0<Unit> onRefresh, final StateFlow<? extends BetState> selectedStateFlow, final StateFlow<Boolean> isRefreshingFlow, Modifier modifier, Function0<Unit> function0, final StateFlow<Boolean> isLoadMoreFlow, final StateFlow<Boolean> hasMoreFlow, final StateFlow<NewUserBetStatisticsModel> betStatus, boolean z, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Function0<Unit> function02;
        boolean changed;
        BetsListScreenKt$BetsListScreen$2$1 rememberedValue;
        Composer composer2;
        final Modifier modifier2;
        final Function0<Unit> function03;
        final boolean z2;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(betListsFlow, "betListsFlow");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Intrinsics.checkNotNullParameter(onBetStateSelected, "onBetStateSelected");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(selectedStateFlow, "selectedStateFlow");
        Intrinsics.checkNotNullParameter(isRefreshingFlow, "isRefreshingFlow");
        Intrinsics.checkNotNullParameter(isLoadMoreFlow, "isLoadMoreFlow");
        Intrinsics.checkNotNullParameter(hasMoreFlow, "hasMoreFlow");
        Intrinsics.checkNotNullParameter(betStatus, "betStatus");
        Composer startRestartGroup = composer.startRestartGroup(-800734136);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(betListsFlow) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onBetClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onBetStateSelected) ? 256 : 128;
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
        int i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        int i10 = i3 & 128;
        if (i10 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(isLoadMoreFlow) ? 67108864 : 33554432;
        }
        if ((i3 & 512) == 0) {
            i8 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(hasMoreFlow) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
            i5 = i4;
            if ((i3 & 1024) == 0) {
                i6 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i6 = i2 | (startRestartGroup.changedInstance(betStatus) ? 4 : 2);
            } else {
                i6 = i2;
            }
            i7 = i3 & 2048;
            if (i7 == 0) {
                i6 |= 48;
            } else if ((i2 & 48) == 0) {
                i6 |= startRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i5 & 306783379) == 306783378 || (i6 & 19) != 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier;
                if (i10 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    function02 = (Function0) rememberedValue2;
                } else {
                    function02 = function0;
                }
                boolean z3 = i7 == 0 ? false : z;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-800734136, i5, i6, "org.betup.ui.fragment.bets.betlist.compose.BetsListScreen (BetsListScreen.kt:54)");
                }
                State collectAsState = SnapshotStateKt.collectAsState(betListsFlow, null, startRestartGroup, i5 & 14, 1);
                State collectAsState2 = SnapshotStateKt.collectAsState(isRefreshingFlow, null, startRestartGroup, (i5 >> 15) & 14, 1);
                State collectAsState3 = SnapshotStateKt.collectAsState(isLoadMoreFlow, null, startRestartGroup, (i5 >> 24) & 14, 1);
                State collectAsState4 = SnapshotStateKt.collectAsState(hasMoreFlow, null, startRestartGroup, (i5 >> 27) & 14, 1);
                LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                State collectAsState5 = SnapshotStateKt.collectAsState(selectedStateFlow, null, startRestartGroup, (i5 >> 12) & 14, 1);
                State collectAsState6 = SnapshotStateKt.collectAsState(betStatus, null, startRestartGroup, i6 & 14, 1);
                Object[] objArr = {rememberLazyListStateWithoutSavedState, Boolean.valueOf(BetsListScreen$lambda$5(collectAsState4)), Boolean.valueOf(BetsListScreen$lambda$4(collectAsState3)), Integer.valueOf(BetsListScreen$lambda$2(collectAsState).size())};
                startRestartGroup.startReplaceGroup(-1224400529);
                int i11 = i6;
                changed = ((29360128 & i5) != 8388608) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState4) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new BetsListScreenKt$BetsListScreen$2$1(collectAsState, collectAsState4, collectAsState3, rememberLazyListStateWithoutSavedState, function02, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                composer2 = startRestartGroup;
                BetsListUiKt.BetsListUi(BetsListScreen$lambda$2(collectAsState), onBetClick, onBetStateSelected, onRefresh, BetsListScreen$lambda$6(collectAsState5), BetsListScreen$lambda$3(collectAsState2), modifier3, function02, BetsListScreen$lambda$4(collectAsState3), BetsListScreen$lambda$5(collectAsState4), BetsListScreen$lambda$7(collectAsState6), z3, rememberLazyListStateWithoutSavedState, composer2, i5 & 33038320, i11 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                function03 = function02;
                z2 = z3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                function03 = function0;
                z2 = z;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BetsListScreen$lambda$9;
                        BetsListScreen$lambda$9 = BetsListScreenKt.BetsListScreen$lambda$9(StateFlow.this, onBetClick, onBetStateSelected, onRefresh, selectedStateFlow, isRefreshingFlow, modifier2, function03, isLoadMoreFlow, hasMoreFlow, betStatus, z2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return BetsListScreen$lambda$9;
                    }
                });
                return;
            }
            return;
        }
        i4 |= i8;
        i5 = i4;
        if ((i3 & 1024) == 0) {
        }
        i7 = i3 & 2048;
        if (i7 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State collectAsState7 = SnapshotStateKt.collectAsState(betListsFlow, null, startRestartGroup, i5 & 14, 1);
        State collectAsState22 = SnapshotStateKt.collectAsState(isRefreshingFlow, null, startRestartGroup, (i5 >> 15) & 14, 1);
        State collectAsState32 = SnapshotStateKt.collectAsState(isLoadMoreFlow, null, startRestartGroup, (i5 >> 24) & 14, 1);
        State collectAsState42 = SnapshotStateKt.collectAsState(hasMoreFlow, null, startRestartGroup, (i5 >> 27) & 14, 1);
        LazyListState rememberLazyListStateWithoutSavedState2 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
        State collectAsState52 = SnapshotStateKt.collectAsState(selectedStateFlow, null, startRestartGroup, (i5 >> 12) & 14, 1);
        State collectAsState62 = SnapshotStateKt.collectAsState(betStatus, null, startRestartGroup, i6 & 14, 1);
        Object[] objArr2 = {rememberLazyListStateWithoutSavedState2, Boolean.valueOf(BetsListScreen$lambda$5(collectAsState42)), Boolean.valueOf(BetsListScreen$lambda$4(collectAsState32)), Integer.valueOf(BetsListScreen$lambda$2(collectAsState7).size())};
        startRestartGroup.startReplaceGroup(-1224400529);
        int i112 = i6;
        changed = ((29360128 & i5) != 8388608) | startRestartGroup.changed(collectAsState7) | startRestartGroup.changed(collectAsState42) | startRestartGroup.changed(collectAsState32) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new BetsListScreenKt$BetsListScreen$2$1(collectAsState7, collectAsState42, collectAsState32, rememberLazyListStateWithoutSavedState2, function02, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
        composer2 = startRestartGroup;
        BetsListUiKt.BetsListUi(BetsListScreen$lambda$2(collectAsState7), onBetClick, onBetStateSelected, onRefresh, BetsListScreen$lambda$6(collectAsState52), BetsListScreen$lambda$3(collectAsState22), modifier3, function02, BetsListScreen$lambda$4(collectAsState32), BetsListScreen$lambda$5(collectAsState42), BetsListScreen$lambda$7(collectAsState62), z3, rememberLazyListStateWithoutSavedState2, composer2, i5 & 33038320, i112 & 112, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        function03 = function02;
        z2 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PreviewBetListCompactItem(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1111799176);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1111799176, i, -1, "org.betup.ui.fragment.bets.betlist.compose.PreviewBetListCompactItem (BetsListScreen.kt:122)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBetListCompactItem$lambda$10;
                    PreviewBetListCompactItem$lambda$10 = BetsListScreenKt.PreviewBetListCompactItem$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBetListCompactItem$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<BetsListModel> BetsListScreen$lambda$2(State<? extends List<? extends BetsListModel>> state) {
        return (List) state.getValue();
    }

    private static final boolean BetsListScreen$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BetsListScreen$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BetsListScreen$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final BetState BetsListScreen$lambda$6(State<? extends BetState> state) {
        return state.getValue();
    }

    private static final NewUserBetStatisticsModel BetsListScreen$lambda$7(State<NewUserBetStatisticsModel> state) {
        return state.getValue();
    }
}
