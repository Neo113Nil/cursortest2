package org.betup.ui.fragment.balance.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.remote.entity.user.balance.BalanceDataModel;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BalanceHistoryScreen.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001aY\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"BalanceHistoryScreen", "", "balanceHistory", "", "Lorg/betup/model/remote/entity/user/balance/BalanceDataModel;", "gameNamesByCode", "", "", "isLoading", "", "isLoadingMore", "hasMore", "errorMessage", "onBackClick", "Lkotlin/Function0;", "onRefresh", "loadMore", "modifier", "Landroidx/compose/ui/Modifier;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/util/List;Ljava/util/Map;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;III)V", "BalanceHistoryContent", "(Ljava/util/List;Ljava/util/Map;ZZZLjava/lang/String;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "BalanceHistoryLoadMoreIndicator", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BalanceHistoryScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceHistoryContent$lambda$7(List list, Map map, boolean z, boolean z2, boolean z3, String str, LazyListState lazyListState, int i, Composer composer, int i2) {
        BalanceHistoryContent(list, map, z, z2, z3, str, lazyListState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceHistoryLoadMoreIndicator$lambda$9(int i, Composer composer, int i2) {
        BalanceHistoryLoadMoreIndicator(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceHistoryScreen$lambda$3(List list, Map map, boolean z, boolean z2, boolean z3, String str, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, LazyListState lazyListState, int i, int i2, int i3, Composer composer, int i4) {
        BalanceHistoryScreen(list, map, z, z2, z3, str, function0, function02, function03, modifier, lazyListState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceHistoryScreen(final List<? extends BalanceDataModel> balanceHistory, final Map<String, String> gameNamesByCode, final boolean z, final boolean z2, final boolean z3, final String str, final Function0<Unit> onBackClick, final Function0<Unit> onRefresh, final Function0<Unit> loadMore, Modifier modifier, LazyListState lazyListState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        Modifier modifier3;
        LazyListState rememberLazyListStateWithoutSavedState;
        int i7;
        boolean z4;
        boolean changedInstance;
        BalanceHistoryScreenKt$BalanceHistoryScreen$1$1 rememberedValue;
        int i8;
        LazyListState lazyListState2;
        Modifier modifier4;
        Object[] objArr;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Modifier modifier5;
        Composer composer2;
        final LazyListState lazyListState3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(balanceHistory, "balanceHistory");
        Intrinsics.checkNotNullParameter(gameNamesByCode, "gameNamesByCode");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(loadMore, "loadMore");
        Composer startRestartGroup = composer.startRestartGroup(1846909073);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(balanceHistory) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(gameNamesByCode) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(str) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(onBackClick) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(onRefresh) ? 8388608 : 4194304;
                }
                if ((i3 & 256) == 0) {
                    i10 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(loadMore) ? 67108864 : 33554432 : 100663296;
                    i5 = i3 & 512;
                    if (i5 == 0) {
                        i4 |= 805306368;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changed(modifier2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                    }
                    if ((i2 & 6) != 0) {
                        if ((i3 & 1024) == 0 && startRestartGroup.changed(lazyListState)) {
                            i9 = 4;
                            i6 = i2 | i9;
                        }
                        i9 = 2;
                        i6 = i2 | i9;
                    } else {
                        i6 = i2;
                    }
                    if ((i4 & 306783379) == 306783378 || (i6 & 3) != 2 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i5 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 1024) != 0) {
                                modifier3 = modifier2;
                                rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                                i7 = i6 & (-15);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1846909073, i4, i7, "org.betup.ui.fragment.balance.compose.BalanceHistoryScreen (BalanceHistoryScreen.kt:49)");
                                }
                                boolean z5 = !z && balanceHistory.isEmpty();
                                Modifier modifier6 = modifier3;
                                Object[] objArr2 = {rememberLazyListStateWithoutSavedState, Boolean.valueOf(z3), Boolean.valueOf(z2), Integer.valueOf(balanceHistory.size())};
                                startRestartGroup.startReplaceGroup(-1224400529);
                                if ((((i7 & 14) ^ 6) > 4 || !startRestartGroup.changed(rememberLazyListStateWithoutSavedState)) && (i7 & 6) != 4) {
                                    z4 = false;
                                    changedInstance = z4 | startRestartGroup.changedInstance(balanceHistory) | ((i4 & 7168) != 2048) | ((57344 & i4) != 16384) | ((234881024 & i4) != 67108864);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        i8 = i4;
                                        lazyListState2 = rememberLazyListStateWithoutSavedState;
                                        modifier4 = modifier6;
                                        objArr = objArr2;
                                        rememberedValue = new BalanceHistoryScreenKt$BalanceHistoryScreen$1$1(rememberLazyListStateWithoutSavedState, balanceHistory, z2, z3, loadMore, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        modifier4 = modifier6;
                                        i8 = i4;
                                        lazyListState2 = rememberLazyListStateWithoutSavedState;
                                        objArr = objArr2;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, startRestartGroup, 54);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor2);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    int i11 = i8 >> 15;
                                    modifier5 = modifier4;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, (i11 & 112) | 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    composer2 = startRestartGroup;
                                    final LazyListState lazyListState4 = lazyListState2;
                                    SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z5, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1812086744, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$2$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i12) {
                                            if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1812086744, i12, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryScreen.<anonymous>.<anonymous> (BalanceHistoryScreen.kt:93)");
                                            }
                                            BalanceHistoryScreenKt.BalanceHistoryContent(balanceHistory, gameNamesByCode, z, z2, z3, str, lazyListState4, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, (i11 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24582, 8);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    lazyListState3 = lazyListState2;
                                }
                                z4 = true;
                                changedInstance = z4 | startRestartGroup.changedInstance(balanceHistory) | ((i4 & 7168) != 2048) | ((57344 & i4) != 16384) | ((234881024 & i4) != 67108864);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (changedInstance) {
                                }
                                i8 = i4;
                                lazyListState2 = rememberLazyListStateWithoutSavedState;
                                modifier4 = modifier6;
                                objArr = objArr2;
                                rememberedValue = new BalanceHistoryScreenKt$BalanceHistoryScreen$1$1(rememberLazyListStateWithoutSavedState, balanceHistory, z2, z3, loadMore, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
                                Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, startRestartGroup, 54);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting()) {
                                }
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                int i112 = i8 >> 15;
                                modifier5 = modifier4;
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, (i112 & 112) | 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                composer2 = startRestartGroup;
                                final LazyListState lazyListState42 = lazyListState2;
                                SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z5, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1812086744, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1812086744, i12, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryScreen.<anonymous>.<anonymous> (BalanceHistoryScreen.kt:93)");
                                        }
                                        BalanceHistoryScreenKt.BalanceHistoryContent(balanceHistory, gameNamesByCode, z, z2, z3, str, lazyListState42, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, (i112 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24582, 8);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                lazyListState3 = lazyListState2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 1024) != 0) {
                                i6 &= -15;
                            }
                        }
                        modifier3 = modifier2;
                        i7 = i6;
                        rememberLazyListStateWithoutSavedState = lazyListState;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (z) {
                        }
                        Modifier modifier62 = modifier3;
                        Object[] objArr22 = {rememberLazyListStateWithoutSavedState, Boolean.valueOf(z3), Boolean.valueOf(z2), Integer.valueOf(balanceHistory.size())};
                        startRestartGroup.startReplaceGroup(-1224400529);
                        if (((i7 & 14) ^ 6) > 4) {
                        }
                        z4 = false;
                        changedInstance = z4 | startRestartGroup.changedInstance(balanceHistory) | ((i4 & 7168) != 2048) | ((57344 & i4) != 16384) | ((234881024 & i4) != 67108864);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (changedInstance) {
                        }
                        i8 = i4;
                        lazyListState2 = rememberLazyListStateWithoutSavedState;
                        modifier4 = modifier62;
                        objArr = objArr22;
                        rememberedValue = new BalanceHistoryScreenKt$BalanceHistoryScreen$1$1(rememberLazyListStateWithoutSavedState, balanceHistory, z2, z3, loadMore, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                        Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
                        Arrangement.Horizontal start22 = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(start22, centerVertically22, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                        int i1122 = i8 >> 15;
                        modifier5 = modifier4;
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, (i1122 & 112) | 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        composer2 = startRestartGroup;
                        final LazyListState lazyListState422 = lazyListState2;
                        SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z5, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1812086744, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1812086744, i12, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryScreen.<anonymous>.<anonymous> (BalanceHistoryScreen.kt:93)");
                                }
                                BalanceHistoryScreenKt.BalanceHistoryContent(balanceHistory, gameNamesByCode, z, z2, z3, str, lazyListState422, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, (i1122 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24582, 8);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        lazyListState3 = lazyListState2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        composer2 = startRestartGroup;
                        lazyListState3 = lazyListState;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier7 = modifier5;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BalanceHistoryScreen$lambda$3;
                                BalanceHistoryScreen$lambda$3 = BalanceHistoryScreenKt.BalanceHistoryScreen$lambda$3(balanceHistory, gameNamesByCode, z, z2, z3, str, onBackClick, onRefresh, loadMore, modifier7, lazyListState3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return BalanceHistoryScreen$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= i10;
                i5 = i3 & 512;
                if (i5 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                modifier3 = modifier2;
                i7 = i6;
                rememberLazyListStateWithoutSavedState = lazyListState;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z) {
                }
                Modifier modifier622 = modifier3;
                Object[] objArr222 = {rememberLazyListStateWithoutSavedState, Boolean.valueOf(z3), Boolean.valueOf(z2), Integer.valueOf(balanceHistory.size())};
                startRestartGroup.startReplaceGroup(-1224400529);
                if (((i7 & 14) ^ 6) > 4) {
                }
                z4 = false;
                changedInstance = z4 | startRestartGroup.changedInstance(balanceHistory) | ((i4 & 7168) != 2048) | ((57344 & i4) != 16384) | ((234881024 & i4) != 67108864);
                rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                i8 = i4;
                lazyListState2 = rememberLazyListStateWithoutSavedState;
                modifier4 = modifier622;
                objArr = objArr222;
                rememberedValue = new BalanceHistoryScreenKt$BalanceHistoryScreen$1$1(rememberLazyListStateWithoutSavedState, balanceHistory, z2, z3, loadMore, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
                Arrangement.Horizontal start222 = Arrangement.INSTANCE.getStart();
                Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(start222, centerVertically222, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                int i11222 = i8 >> 15;
                modifier5 = modifier4;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, (i11222 & 112) | 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                composer2 = startRestartGroup;
                final LazyListState lazyListState4222 = lazyListState2;
                SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z5, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1812086744, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i12) {
                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1812086744, i12, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryScreen.<anonymous>.<anonymous> (BalanceHistoryScreen.kt:93)");
                        }
                        BalanceHistoryScreenKt.BalanceHistoryContent(balanceHistory, gameNamesByCode, z, z2, z3, str, lazyListState4222, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, (i11222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24582, 8);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                lazyListState3 = lazyListState2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            i4 |= i10;
            i5 = i3 & 512;
            if (i5 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            modifier3 = modifier2;
            i7 = i6;
            rememberLazyListStateWithoutSavedState = lazyListState;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z) {
            }
            Modifier modifier6222 = modifier3;
            Object[] objArr2222 = {rememberLazyListStateWithoutSavedState, Boolean.valueOf(z3), Boolean.valueOf(z2), Integer.valueOf(balanceHistory.size())};
            startRestartGroup.startReplaceGroup(-1224400529);
            if (((i7 & 14) ^ 6) > 4) {
            }
            z4 = false;
            changedInstance = z4 | startRestartGroup.changedInstance(balanceHistory) | ((i4 & 7168) != 2048) | ((57344 & i4) != 16384) | ((234881024 & i4) != 67108864);
            rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            i8 = i4;
            lazyListState2 = rememberLazyListStateWithoutSavedState;
            modifier4 = modifier6222;
            objArr = objArr2222;
            rememberedValue = new BalanceHistoryScreenKt$BalanceHistoryScreen$1$1(rememberLazyListStateWithoutSavedState, balanceHistory, z2, z3, loadMore, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
            Modifier m1517paddingVpY3zN42222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
            Arrangement.Horizontal start2222 = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(start2222, centerVertically2222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
            int i112222 = i8 >> 15;
            modifier5 = modifier4;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, (i112222 & 112) | 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            final LazyListState lazyListState42222 = lazyListState2;
            SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z5, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1812086744, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i12) {
                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1812086744, i12, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryScreen.<anonymous>.<anonymous> (BalanceHistoryScreen.kt:93)");
                    }
                    BalanceHistoryScreenKt.BalanceHistoryContent(balanceHistory, gameNamesByCode, z, z2, z3, str, lazyListState42222, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, (i112222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24582, 8);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            lazyListState3 = lazyListState2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i4 |= i10;
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        modifier3 = modifier2;
        i7 = i6;
        rememberLazyListStateWithoutSavedState = lazyListState;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (z) {
        }
        Modifier modifier62222 = modifier3;
        Object[] objArr22222 = {rememberLazyListStateWithoutSavedState, Boolean.valueOf(z3), Boolean.valueOf(z2), Integer.valueOf(balanceHistory.size())};
        startRestartGroup.startReplaceGroup(-1224400529);
        if (((i7 & 14) ^ 6) > 4) {
        }
        z4 = false;
        changedInstance = z4 | startRestartGroup.changedInstance(balanceHistory) | ((i4 & 7168) != 2048) | ((57344 & i4) != 16384) | ((234881024 & i4) != 67108864);
        rememberedValue = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        i8 = i4;
        lazyListState2 = rememberLazyListStateWithoutSavedState;
        modifier4 = modifier62222;
        objArr = objArr22222;
        rememberedValue = new BalanceHistoryScreenKt$BalanceHistoryScreen$1$1(rememberLazyListStateWithoutSavedState, balanceHistory, z2, z3, loadMore, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
        Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
        Modifier m1517paddingVpY3zN422222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
        Arrangement.Horizontal start22222 = Arrangement.INSTANCE.getStart();
        Alignment.Vertical centerVertically22222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(start22222, centerVertically22222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
        int i1122222 = i8 >> 15;
        modifier5 = modifier4;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, (i1122222 & 112) | 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        composer2 = startRestartGroup;
        final LazyListState lazyListState422222 = lazyListState2;
        SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z5, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1812086744, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryScreen$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i12) {
                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1812086744, i12, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryScreen.<anonymous>.<anonymous> (BalanceHistoryScreen.kt:93)");
                }
                BalanceHistoryScreenKt.BalanceHistoryContent(balanceHistory, gameNamesByCode, z, z2, z3, str, lazyListState422222, composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), composer2, (i1122222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24582, 8);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        lazyListState3 = lazyListState2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BalanceHistoryContent(final List<? extends BalanceDataModel> list, final Map<String, String> map, final boolean z, final boolean z2, final boolean z3, final String str, final LazyListState lazyListState, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-791158275);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(map) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= startRestartGroup.changed(lazyListState) ? 1048576 : 524288;
        }
        if ((i2 & 599187) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-791158275, i2, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryContent (BalanceHistoryScreen.kt:115)");
            }
            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changedInstance = ((i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(list) | ((458752 & i2) == 131072) | startRestartGroup.changedInstance(map) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = i2;
                Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BalanceHistoryContent$lambda$6$lambda$5;
                        BalanceHistoryContent$lambda$6$lambda$5 = BalanceHistoryScreenKt.BalanceHistoryContent$lambda$6$lambda$5(z, list, str, z2, z3, map, (LazyListScope) obj);
                        return BalanceHistoryContent$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue = function1;
            } else {
                i3 = i2;
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            LazyDslKt.LazyColumn(m1518paddingVpY3zN4$default, lazyListState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer2, ((i3 >> 15) & 112) | 24582, 492);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BalanceHistoryContent$lambda$7;
                    BalanceHistoryContent$lambda$7 = BalanceHistoryScreenKt.BalanceHistoryContent$lambda$7(list, map, z, z2, z3, str, lazyListState, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BalanceHistoryContent$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceHistoryContent$lambda$6$lambda$5(boolean z, final List list, final String str, boolean z2, boolean z3, final Map map, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (z && list.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BalanceHistoryScreenKt.INSTANCE.m13431getLambda$253681875$app_release(), 3, null);
        } else if (str != null && list.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-432297962, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryContent$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-432297962, i, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryContent.<anonymous>.<anonymous>.<anonymous> (BalanceHistoryScreen.kt:139)");
                    }
                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(32));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    String str2 = str;
                    ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 0, 0, 65022);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else if (list.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BalanceHistoryScreenKt.INSTANCE.getLambda$161190709$app_release(), 3, null);
        } else {
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryContent$lambda$6$lambda$5$$inlined$itemsIndexed$default$2
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
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$BalanceHistoryContent$lambda$6$lambda$5$$inlined$itemsIndexed$default$3
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
                    BalanceDataModel balanceDataModel = (BalanceDataModel) list.get(i);
                    composer.startReplaceGroup(-1310781268);
                    BalanceHistoryItemKt.BalanceHistoryItem(balanceDataModel, map, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            if (z2 && z3) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BalanceHistoryScreenKt.INSTANCE.getLambda$614574033$app_release(), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BalanceHistoryLoadMoreIndicator(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(262504190);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(262504190, i, -1, "org.betup.ui.fragment.balance.compose.BalanceHistoryLoadMoreIndicator (BalanceHistoryScreen.kt:196)");
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BalanceHistoryLoadMoreIndicator$lambda$9;
                    BalanceHistoryLoadMoreIndicator$lambda$9 = BalanceHistoryScreenKt.BalanceHistoryLoadMoreIndicator$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BalanceHistoryLoadMoreIndicator$lambda$9;
                }
            });
        }
    }
}
