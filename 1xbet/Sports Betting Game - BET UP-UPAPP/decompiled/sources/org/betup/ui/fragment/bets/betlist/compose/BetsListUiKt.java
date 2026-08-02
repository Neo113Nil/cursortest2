package org.betup.ui.fragment.bets.betlist.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BetsListUi.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001aQ\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001aC\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001c¨\u0006#"}, d2 = {"BetsListUi", "", "betLists", "", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "onBetClick", "Lkotlin/Function1;", "onBetStateSelected", "Lorg/betup/model/remote/entity/bets/BetState;", "onRefresh", "Lkotlin/Function0;", "selectedState", "isRefreshing", "", "modifier", "Landroidx/compose/ui/Modifier;", "loadMore", "isLoadMore", "hasMore", "betStatus", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "isInProfile", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lorg/betup/model/remote/entity/bets/BetState;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZZLorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;ZLandroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;III)V", "BetsListContent", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListState;ZZZLandroidx/compose/runtime/Composer;II)V", "BetsListLoadMoreIndicator", "(Landroidx/compose/runtime/Composer;I)V", "BetsListFilter", "onSelect", "itemSize", "", "(Lorg/betup/model/remote/entity/bets/BetState;Lkotlin/jvm/functions/Function1;ILorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "PreviewBetsListUi", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetsListUiKt {

    /* compiled from: BetsListUi.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BetState.values().length];
            try {
                iArr[BetState.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetState.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BetState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BetState.RETURNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BetState.SOLD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BetState.CANCELED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetsListContent$lambda$8(List list, Function1 function1, LazyListState lazyListState, boolean z, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        BetsListContent(list, function1, lazyListState, z, z2, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetsListFilter$lambda$11(BetState betState, Function1 function1, int i, NewUserBetStatisticsModel newUserBetStatisticsModel, Modifier modifier, int i2, Composer composer, int i3) {
        BetsListFilter(betState, function1, i, newUserBetStatisticsModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetsListLoadMoreIndicator$lambda$10(int i, Composer composer, int i2) {
        BetsListLoadMoreIndicator(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetsListUi$lambda$3(List list, Function1 function1, Function1 function12, Function0 function0, BetState betState, boolean z, Modifier modifier, Function0 function02, boolean z2, boolean z3, NewUserBetStatisticsModel newUserBetStatisticsModel, boolean z4, LazyListState lazyListState, int i, int i2, int i3, Composer composer, int i4) {
        BetsListUi(list, function1, function12, function0, betState, z, modifier, function02, z2, z3, newUserBetStatisticsModel, z4, lazyListState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetsListUi$lambda$20(int i, Composer composer, int i2) {
        PreviewBetsListUi(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0178, code lost:
    
        if (r7.changed(r38) == false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetsListUi(final List<? extends BetsListModel> betLists, final Function1<? super BetsListModel, Unit> onBetClick, final Function1<? super BetState, Unit> onBetStateSelected, final Function0<Unit> onRefresh, final BetState selectedState, final boolean z, Modifier modifier, Function0<Unit> function0, final boolean z2, final boolean z3, final NewUserBetStatisticsModel newUserBetStatisticsModel, boolean z4, LazyListState lazyListState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        Function0<Unit> function02;
        Modifier modifier3;
        boolean z5;
        LazyListState lazyListState2;
        Function0<Unit> function03;
        float m7774constructorimpl;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final Function0<Unit> function04;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(betLists, "betLists");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Intrinsics.checkNotNullParameter(onBetStateSelected, "onBetStateSelected");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        Composer startRestartGroup = composer.startRestartGroup(1223765499);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(betLists) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onBetClick) ? 32 : 16;
        }
        int i8 = 256;
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
            i4 |= startRestartGroup.changed(selectedState.ordinal()) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else if ((805306368 & i) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    if ((i3 & 1024) == 0) {
                        i6 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i6 = i2 | (startRestartGroup.changed(newUserBetStatisticsModel) ? 4 : 2);
                    } else {
                        i6 = i2;
                    }
                    i7 = i3 & 2048;
                    if (i7 == 0) {
                        i6 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i6 |= startRestartGroup.changed(z4) ? 32 : 16;
                    }
                    if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        if ((i3 & 4096) != 0) {
                        }
                        i8 = 128;
                        i6 |= i8;
                    }
                    int i9 = i6;
                    if ((i4 & 302589075) == 302589074 || (i9 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 128) == 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                modifier2 = companion;
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function02 = (Function0) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                modifier2 = companion;
                                function02 = function0;
                            }
                            boolean z6 = i7 == 0 ? false : z4;
                            if ((i3 & 4096) == 0) {
                                i9 &= -897;
                                z5 = z6;
                                function03 = function02;
                                lazyListState2 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                                modifier3 = modifier2;
                            } else {
                                modifier3 = modifier2;
                                z5 = z6;
                                lazyListState2 = lazyListState;
                                function03 = function02;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4096) != 0) {
                                i9 &= -897;
                            }
                            modifier3 = modifier;
                            function03 = function0;
                            z5 = z4;
                            lazyListState2 = lazyListState;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1223765499, i4, i9, "org.betup.ui.fragment.bets.betlist.compose.BetsListUi (BetsListUi.kt:49)");
                        }
                        int i10 = i4;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        if (!z5) {
                            m7774constructorimpl = Dp.m7774constructorimpl(0);
                        } else {
                            m7774constructorimpl = Dp.m7774constructorimpl(12);
                        }
                        Modifier modifier5 = modifier3;
                        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(fillMaxSize$default, m7774constructorimpl, 0.0f, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        final LazyListState lazyListState3 = lazyListState2;
                        final boolean z7 = z5;
                        composer2 = startRestartGroup;
                        SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(491598420, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$BetsListUi$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11) {
                                if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(491598420, i11, -1, "org.betup.ui.fragment.bets.betlist.compose.BetsListUi.<anonymous>.<anonymous> (BetsListUi.kt:66)");
                                }
                                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                List<BetsListModel> list = betLists;
                                Function1<BetsListModel, Unit> function1 = onBetClick;
                                LazyListState lazyListState4 = lazyListState3;
                                boolean z8 = z2;
                                boolean z9 = z3;
                                boolean z10 = z7;
                                BetState betState = selectedState;
                                Function1<BetState, Unit> function12 = onBetStateSelected;
                                NewUserBetStatisticsModel newUserBetStatisticsModel2 = newUserBetStatisticsModel;
                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default2);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                BetsListUiKt.BetsListContent(list, function1, lazyListState4, z8, z9, z10, composer3, 0, 0);
                                composer3.startReplaceGroup(-21847316);
                                if (!z10) {
                                    BetsListUiKt.BetsListFilter(betState, function12, list.size(), newUserBetStatisticsModel2, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, ((i10 >> 12) & 112) | 24582 | ((i10 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function03;
                        modifier4 = modifier5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function04 = function0;
                        z5 = z4;
                        lazyListState2 = lazyListState;
                        composer2 = startRestartGroup;
                        modifier4 = modifier;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final boolean z8 = z5;
                        final LazyListState lazyListState4 = lazyListState2;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BetsListUi$lambda$3;
                                BetsListUi$lambda$3 = BetsListUiKt.BetsListUi$lambda$3(betLists, onBetClick, onBetStateSelected, onRefresh, selectedState, z, modifier4, function04, z2, z3, newUserBetStatisticsModel, z8, lazyListState4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return BetsListUi$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i3 & 1024) == 0) {
                }
                i7 = i3 & 2048;
                if (i7 == 0) {
                }
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                int i92 = i6;
                if ((i4 & 302589075) == 302589074) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if (i7 == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i4;
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                if (!z5) {
                }
                Modifier modifier52 = modifier3;
                Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(fillMaxSize$default2, m7774constructorimpl, 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                final LazyListState lazyListState32 = lazyListState2;
                final boolean z72 = z5;
                composer2 = startRestartGroup;
                SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(491598420, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$BetsListUi$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i11) {
                        if ((i11 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(491598420, i11, -1, "org.betup.ui.fragment.bets.betlist.compose.BetsListUi.<anonymous>.<anonymous> (BetsListUi.kt:66)");
                        }
                        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        List<BetsListModel> list = betLists;
                        Function1<BetsListModel, Unit> function1 = onBetClick;
                        LazyListState lazyListState42 = lazyListState32;
                        boolean z82 = z2;
                        boolean z9 = z3;
                        boolean z10 = z72;
                        BetState betState = selectedState;
                        Function1<BetState, Unit> function12 = onBetStateSelected;
                        NewUserBetStatisticsModel newUserBetStatisticsModel2 = newUserBetStatisticsModel;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default22);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor22);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BetsListUiKt.BetsListContent(list, function1, lazyListState42, z82, z9, z10, composer3, 0, 0);
                        composer3.startReplaceGroup(-21847316);
                        if (!z10) {
                            BetsListUiKt.BetsListFilter(betState, function12, list.size(), newUserBetStatisticsModel2, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, ((i102 >> 12) & 112) | 24582 | ((i102 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                function04 = function03;
                modifier4 = modifier52;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            i7 = i3 & 2048;
            if (i7 == 0) {
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            int i922 = i6;
            if ((i4 & 302589075) == 302589074) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if (i7 == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1022 = i4;
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            if (!z5) {
            }
            Modifier modifier522 = modifier3;
            Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(fillMaxSize$default22, m7774constructorimpl, 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            final LazyListState lazyListState322 = lazyListState2;
            final boolean z722 = z5;
            composer2 = startRestartGroup;
            SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(491598420, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$BetsListUi$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i11) {
                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(491598420, i11, -1, "org.betup.ui.fragment.bets.betlist.compose.BetsListUi.<anonymous>.<anonymous> (BetsListUi.kt:66)");
                    }
                    Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    List<BetsListModel> list = betLists;
                    Function1<BetsListModel, Unit> function1 = onBetClick;
                    LazyListState lazyListState42 = lazyListState322;
                    boolean z82 = z2;
                    boolean z9 = z3;
                    boolean z10 = z722;
                    BetState betState = selectedState;
                    Function1<BetState, Unit> function12 = onBetStateSelected;
                    NewUserBetStatisticsModel newUserBetStatisticsModel2 = newUserBetStatisticsModel;
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default222);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor222);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BetsListUiKt.BetsListContent(list, function1, lazyListState42, z82, z9, z10, composer3, 0, 0);
                    composer3.startReplaceGroup(-21847316);
                    if (!z10) {
                        BetsListUiKt.BetsListFilter(betState, function12, list.size(), newUserBetStatisticsModel2, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, ((i1022 >> 12) & 112) | 24582 | ((i1022 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            function04 = function03;
            modifier4 = modifier522;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        i7 = i3 & 2048;
        if (i7 == 0) {
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        int i9222 = i6;
        if ((i4 & 302589075) == 302589074) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if (i7 == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i10222 = i4;
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        if (!z5) {
        }
        Modifier modifier5222 = modifier3;
        Modifier m1518paddingVpY3zN4$default222 = PaddingKt.m1518paddingVpY3zN4$default(fillMaxSize$default222, m7774constructorimpl, 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        final LazyListState lazyListState3222 = lazyListState2;
        final boolean z7222 = z5;
        composer2 = startRestartGroup;
        SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(491598420, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$BetsListUi$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i11) {
                if ((i11 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(491598420, i11, -1, "org.betup.ui.fragment.bets.betlist.compose.BetsListUi.<anonymous>.<anonymous> (BetsListUi.kt:66)");
                }
                Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                List<BetsListModel> list = betLists;
                Function1<BetsListModel, Unit> function1 = onBetClick;
                LazyListState lazyListState42 = lazyListState3222;
                boolean z82 = z2;
                boolean z9 = z3;
                boolean z10 = z7222;
                BetState betState = selectedState;
                Function1<BetState, Unit> function12 = onBetStateSelected;
                NewUserBetStatisticsModel newUserBetStatisticsModel2 = newUserBetStatisticsModel;
                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default2222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2222);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BetsListUiKt.BetsListContent(list, function1, lazyListState42, z82, z9, z10, composer3, 0, 0);
                composer3.startReplaceGroup(-21847316);
                if (!z10) {
                    BetsListUiKt.BetsListFilter(betState, function12, list.size(), newUserBetStatisticsModel2, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), composer3, 0);
                }
                composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), composer2, ((i10222 >> 12) & 112) | 24582 | ((i10222 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function04 = function03;
        modifier4 = modifier5222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetsListContent(final List<? extends BetsListModel> list, final Function1<? super BetsListModel, Unit> function1, final LazyListState lazyListState, final boolean z, final boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        boolean changedInstance;
        Object rememberedValue;
        final boolean z5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1639062392);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            z4 = z3;
            i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
            if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                boolean z6 = i4 == 0 ? false : z4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1639062392, i3, -1, "org.betup.ui.fragment.bets.betlist.compose.BetsListContent (BetsListUi.kt:98)");
                }
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(!z6 ? 4 : 64), 0.0f, 0.0f, 13, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance = startRestartGroup.changedInstance(list) | ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | ((57344 & i3) == 16384);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BetsListContent$lambda$7$lambda$6;
                            BetsListContent$lambda$7$lambda$6 = BetsListUiKt.BetsListContent$lambda$7$lambda$6(list, z, z2, function1, (LazyListScope) obj);
                            return BetsListContent$lambda$7$lambda$6;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default, lazyListState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, startRestartGroup, ((i3 >> 3) & 112) | 24576, 492);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z6;
            } else {
                startRestartGroup.skipToGroupEnd();
                z5 = z4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BetsListContent$lambda$8;
                        BetsListContent$lambda$8 = BetsListUiKt.BetsListContent$lambda$8(list, function1, lazyListState, z, z2, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return BetsListContent$lambda$8;
                    }
                });
                return;
            }
            return;
        }
        z4 = z3;
        if ((74899 & i3) == 74898) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(!z6 ? 4 : 64), 0.0f, 0.0f, 13, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance = startRestartGroup.changedInstance(list) | ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | ((57344 & i3) == 16384);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BetsListContent$lambda$7$lambda$6;
                BetsListContent$lambda$7$lambda$6 = BetsListUiKt.BetsListContent$lambda$7$lambda$6(list, z, z2, function1, (LazyListScope) obj);
                return BetsListContent$lambda$7$lambda$6;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default2, lazyListState, null, false, m1397spacedBy0680j_42, null, null, false, null, (Function1) rememberedValue, startRestartGroup, ((i3 >> 3) & 112) | 24576, 492);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BetsListLoadMoreIndicator(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(351507077);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(351507077, i, -1, "org.betup.ui.fragment.bets.betlist.compose.BetsListLoadMoreIndicator (BetsListUi.kt:137)");
            }
            Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(48));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1549height3ABfNKs);
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
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 6, 28);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BetsListLoadMoreIndicator$lambda$10;
                    BetsListLoadMoreIndicator$lambda$10 = BetsListUiKt.BetsListLoadMoreIndicator$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BetsListLoadMoreIndicator$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BetsListFilter(final BetState betState, final Function1<? super BetState, Unit> function1, final int i, final NewUserBetStatisticsModel newUserBetStatisticsModel, final Modifier modifier, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(487907914);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(betState.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(newUserBetStatisticsModel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(487907914, i3, -1, "org.betup.ui.fragment.bets.betlist.compose.BetsListFilter (BetsListUi.kt:158)");
            }
            FilterBetsElementKt.FilterBetsElement(PaddingKt.m1520paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(12), 7, null), StateFlowKt.MutableStateFlow(betState), i, function1, StateFlowKt.MutableStateFlow(newUserBetStatisticsModel), startRestartGroup, (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i3 << 6) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BetsListFilter$lambda$11;
                    BetsListFilter$lambda$11 = BetsListUiKt.BetsListFilter$lambda$11(BetState.this, function1, i, newUserBetStatisticsModel, modifier, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BetsListFilter$lambda$11;
                }
            });
        }
    }

    public static final void PreviewBetsListUi(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1816147405);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1816147405, i, -1, "org.betup.ui.fragment.bets.betlist.compose.PreviewBetsListUi (BetsListUi.kt:171)");
            }
            List emptyList = CollectionsKt.emptyList();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewBetsListUi$lambda$13$lambda$12;
                        PreviewBetsListUi$lambda$13$lambda$12 = BetsListUiKt.PreviewBetsListUi$lambda$13$lambda$12((BetsListModel) obj);
                        return PreviewBetsListUi$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewBetsListUi$lambda$15$lambda$14;
                        PreviewBetsListUi$lambda$15$lambda$14 = BetsListUiKt.PreviewBetsListUi$lambda$15$lambda$14((BetState) obj);
                        return PreviewBetsListUi$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            BetState betState = BetState.ALL;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Function0 function02 = (Function0) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            BetsListUi(emptyList, function1, function12, function0, betState, false, null, function02, false, true, null, false, null, startRestartGroup, 918777270, 54, 4160);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBetsListUi$lambda$20;
                    PreviewBetsListUi$lambda$20 = BetsListUiKt.PreviewBetsListUi$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBetsListUi$lambda$20;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetsListUi$lambda$13$lambda$12(BetsListModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetsListUi$lambda$15$lambda$14(BetState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetsListContent$lambda$7$lambda$6(final List list, boolean z, boolean z2, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$BetsListContent$lambda$7$lambda$6$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$BetsListContent$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                String str;
                String capitalizeFirstCharOnly;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final BetsListModel betsListModel = (BetsListModel) list.get(i);
                composer.startReplaceGroup(78125279);
                BetState state = betsListModel.getState();
                switch (state != null ? BetsListUiKt.WhenMappings.$EnumSwitchMapping$0[state.ordinal()] : -1) {
                    case 1:
                        str = "+" + betsListModel.getMoneyReturned();
                        break;
                    case 2:
                        str = "-" + betsListModel.getMoneyPlaced();
                        break;
                    case 3:
                        str = String.valueOf(betsListModel.getMoneyPlaced());
                        break;
                    case 4:
                    case 5:
                    case 6:
                        str = "+" + betsListModel.getMoneyReturned();
                        break;
                    default:
                        str = "";
                        break;
                }
                String str2 = str;
                String createdAt = betsListModel.getCreatedAt();
                Intrinsics.checkNotNullExpressionValue(createdAt, "getCreatedAt(...)");
                BetState state2 = betsListModel.getState();
                Intrinsics.checkNotNullExpressionValue(state2, "getState(...)");
                if (betsListModel.getPlacedBets().size() == 1) {
                    composer.startReplaceGroup(78692671);
                    capitalizeFirstCharOnly = StringResources_androidKt.stringResource(R.string.single_bet, composer, 6);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(78773798);
                    capitalizeFirstCharOnly = UiExtensionsKt.capitalizeFirstCharOnly(StringResources_androidKt.stringResource(R.string.multi_bet, composer, 6));
                    composer.endReplaceGroup();
                }
                String str3 = capitalizeFirstCharOnly;
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(function1) | composer.changedInstance(betsListModel);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.bets.betlist.compose.BetsListUiKt$BetsListContent$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(betsListModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                BetListCompactItemKt.BetListCompactItem(createdAt, state2, str2, str3, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (z && z2) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BetsListUiKt.INSTANCE.getLambda$1632215208$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }
}
