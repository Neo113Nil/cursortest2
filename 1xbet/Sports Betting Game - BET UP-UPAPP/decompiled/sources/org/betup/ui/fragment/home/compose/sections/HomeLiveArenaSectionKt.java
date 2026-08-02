package org.betup.ui.fragment.home.compose.sections;

import android.graphics.Rect;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.ui.fragment.home.compose.HomeLiveMatchesUiState;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;
import org.betup.ui.fragment.home.compose.HomeTourBoundsKt;
import org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt;
import org.betup.ui.fragment.home.compose.matches.HomeMatchesSectionLoadingRowKt;

/* compiled from: HomeLiveArenaSection.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÝ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00072\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"HomeLiveArenaSection", "", "state", "Lorg/betup/ui/fragment/home/compose/HomeLiveMatchesUiState;", "onViewAllClick", "Lkotlin/Function0;", "onSectionBoundsReported", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "onViewAllBoundsReported", "onMatchClick", "", "onLoadMore", "oddType", "Lorg/betup/model/local/entity/OddType;", "isBetSelected", "", "isBetValidating", "isBetLocked", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", "onBetClick", "Lkotlin/Function2;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/home/compose/HomeLiveMatchesUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeLiveArenaSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeLiveArenaSection$lambda$2(HomeLiveMatchesUiState homeLiveMatchesUiState, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function0 function02, OddType oddType, Function1 function14, Function1 function15, Function1 function16, Function2 function2, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        HomeLiveArenaSection(homeLiveMatchesUiState, function0, function1, function12, function13, function02, oddType, function14, function15, function16, function2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeLiveArenaSection(final HomeLiveMatchesUiState state, final Function0<Unit> onViewAllClick, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, final Function1<? super Long, Unit> onMatchClick, final Function0<Unit> onLoadMore, final OddType oddType, final Function1<? super Long, Boolean> isBetSelected, final Function1<? super Long, Boolean> isBetValidating, final Function1<? super HomeMatchOddUi, Boolean> isBetLocked, final Function2<? super Long, ? super HomeMatchOddUi, Unit> onBetClick, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Function1<? super Rect, Unit> function13;
        Composer composer2;
        final Modifier modifier2;
        final Function1<? super Rect, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onViewAllClick, "onViewAllClick");
        Intrinsics.checkNotNullParameter(onMatchClick, "onMatchClick");
        Intrinsics.checkNotNullParameter(onLoadMore, "onLoadMore");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(isBetSelected, "isBetSelected");
        Intrinsics.checkNotNullParameter(isBetValidating, "isBetValidating");
        Intrinsics.checkNotNullParameter(isBetLocked, "isBetLocked");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Composer startRestartGroup = composer.startRestartGroup(-1937037774);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(state) : startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onViewAllClick) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(onMatchClick) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changedInstance(onLoadMore) ? 131072 : 65536;
                }
                if ((i3 & 64) == 0) {
                    i11 = (1572864 & i) == 0 ? startRestartGroup.changed(oddType.ordinal()) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 128) != 0) {
                        i10 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(isBetSelected) ? 8388608 : 4194304 : 12582912;
                        if ((i3 & 256) == 0) {
                            i9 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(isBetValidating) ? 67108864 : 33554432 : 100663296;
                            if ((i3 & 512) != 0) {
                                i8 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(isBetLocked) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                                if ((i3 & 1024) != 0) {
                                    i6 = i2 | 6;
                                } else if ((i2 & 6) == 0) {
                                    i6 = i2 | (startRestartGroup.changedInstance(onBetClick) ? 4 : 2);
                                } else {
                                    i6 = i2;
                                }
                                i7 = i3 & 2048;
                                if (i7 != 0) {
                                    i6 |= 48;
                                } else if ((i2 & 48) == 0) {
                                    i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
                                }
                                if ((i4 & 306783379) == 306783378 || (i6 & 19) != 18 || !startRestartGroup.getSkipping()) {
                                    Function1<? super Rect, Unit> function15 = i12 != 0 ? null : function1;
                                    Function1<? super Rect, Unit> function16 = i5 != 0 ? null : function12;
                                    Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1937037774, i4, i6, "org.betup.ui.fragment.home.compose.sections.HomeLiveArenaSection (HomeLiveArenaSection.kt:32)");
                                    }
                                    if (Intrinsics.areEqual(state, HomeLiveMatchesUiState.Loading.INSTANCE)) {
                                        startRestartGroup.startReplaceGroup(888849383);
                                        Modifier reportHomeTourBounds = HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), function15, startRestartGroup, (i4 >> 3) & 112);
                                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                                        Function1<? super Rect, Unit> function17 = function15;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, reportHomeTourBounds);
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
                                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        function13 = function17;
                                        HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_live_arena, startRestartGroup, 6), null, Integer.valueOf(R.drawable.arena_img), onViewAllClick, function16, null, null, null, startRestartGroup, ((i4 << 6) & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i4 << 3) & 57344), 226);
                                        HomeMatchesSectionLoadingRowKt.HomeMatchesSectionLoadingRow(null, 0, startRestartGroup, 0, 3);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                        composer2 = startRestartGroup;
                                    } else {
                                        function13 = function15;
                                        if (state instanceof HomeLiveMatchesUiState.Visible) {
                                            startRestartGroup.startReplaceGroup(889522300);
                                            int i13 = i4 >> 3;
                                            Modifier reportHomeTourBounds2 = HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), function13, startRestartGroup, i13 & 112);
                                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, reportHomeTourBounds2);
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                                startRestartGroup.createNode(constructor2);
                                            } else {
                                                startRestartGroup.useNode();
                                            }
                                            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            int i14 = i6;
                                            int i15 = i4;
                                            function13 = function13;
                                            HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_live_arena, startRestartGroup, 6), null, Integer.valueOf(R.drawable.arena_img), onViewAllClick, function16, null, null, null, startRestartGroup, ((i4 << 6) & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i4 << 3) & 57344), 226);
                                            HomeLiveMatchesUiState.Visible visible = (HomeLiveMatchesUiState.Visible) state;
                                            HomeMatchesHorizontalRowKt.HomeMatchesHorizontalRow(visible.getMatches(), visible.isLoadingMore(), visible.getHasMore(), onLoadMore, onMatchClick, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, null, null, startRestartGroup, ((i15 >> 6) & 7168) | (i15 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | ((i14 << 27) & 1879048192), 0, 3072);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceGroup();
                                            composer2 = startRestartGroup;
                                        } else {
                                            if (!Intrinsics.areEqual(state, HomeLiveMatchesUiState.Hidden.INSTANCE)) {
                                                startRestartGroup.startReplaceGroup(-1772443318);
                                                startRestartGroup.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer2 = startRestartGroup;
                                            composer2.startReplaceGroup(-1772385354);
                                            composer2.endReplaceGroup();
                                        }
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = companion;
                                    function14 = function16;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    function13 = function1;
                                    function14 = function12;
                                    modifier2 = modifier;
                                    composer2 = startRestartGroup;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final Function1<? super Rect, Unit> function18 = function13;
                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeLiveArenaSectionKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit HomeLiveArenaSection$lambda$2;
                                            HomeLiveArenaSection$lambda$2 = HomeLiveArenaSectionKt.HomeLiveArenaSection$lambda$2(HomeLiveMatchesUiState.this, onViewAllClick, function18, function14, onMatchClick, onLoadMore, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return HomeLiveArenaSection$lambda$2;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= i8;
                            if ((i3 & 1024) != 0) {
                            }
                            i7 = i3 & 2048;
                            if (i7 != 0) {
                            }
                            if ((i4 & 306783379) == 306783378) {
                            }
                            if (i12 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (Intrinsics.areEqual(state, HomeLiveMatchesUiState.Loading.INSTANCE)) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = companion;
                            function14 = function16;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i4 |= i9;
                        if ((i3 & 512) != 0) {
                        }
                        i4 |= i8;
                        if ((i3 & 1024) != 0) {
                        }
                        i7 = i3 & 2048;
                        if (i7 != 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        if (i12 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (Intrinsics.areEqual(state, HomeLiveMatchesUiState.Loading.INSTANCE)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        function14 = function16;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i4 |= i10;
                    if ((i3 & 256) == 0) {
                    }
                    i4 |= i9;
                    if ((i3 & 512) != 0) {
                    }
                    i4 |= i8;
                    if ((i3 & 1024) != 0) {
                    }
                    i7 = i3 & 2048;
                    if (i7 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    if (i12 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (Intrinsics.areEqual(state, HomeLiveMatchesUiState.Loading.INSTANCE)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    function14 = function16;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i11;
                if ((i3 & 128) != 0) {
                }
                i4 |= i10;
                if ((i3 & 256) == 0) {
                }
                i4 |= i9;
                if ((i3 & 512) != 0) {
                }
                i4 |= i8;
                if ((i3 & 1024) != 0) {
                }
                i7 = i3 & 2048;
                if (i7 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                if (i12 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (Intrinsics.areEqual(state, HomeLiveMatchesUiState.Loading.INSTANCE)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                function14 = function16;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            i4 |= i11;
            if ((i3 & 128) != 0) {
            }
            i4 |= i10;
            if ((i3 & 256) == 0) {
            }
            i4 |= i9;
            if ((i3 & 512) != 0) {
            }
            i4 |= i8;
            if ((i3 & 1024) != 0) {
            }
            i7 = i3 & 2048;
            if (i7 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            if (i12 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (Intrinsics.areEqual(state, HomeLiveMatchesUiState.Loading.INSTANCE)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            function14 = function16;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i4 |= i11;
        if ((i3 & 128) != 0) {
        }
        i4 |= i10;
        if ((i3 & 256) == 0) {
        }
        i4 |= i9;
        if ((i3 & 512) != 0) {
        }
        i4 |= i8;
        if ((i3 & 1024) != 0) {
        }
        i7 = i3 & 2048;
        if (i7 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        if (i12 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (Intrinsics.areEqual(state, HomeLiveMatchesUiState.Loading.INSTANCE)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        function14 = function16;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
