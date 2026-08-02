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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.domain.quest.DailyQuest;
import org.betup.domain.quest.DailyQuestTask;
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.home.compose.DailyQuestsCardKt;
import org.betup.ui.fragment.home.compose.HomeCountdownTextKt;
import org.betup.ui.fragment.home.compose.HomeTourBoundsKt;
import org.betup.ui.fragment.home.controller.HomeDailyQuestUiState;
import org.betup.ui.views.ComposeUtils;

/* compiled from: HomeDailyQuestsSection.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"HomeDailyQuestsSection", "", "state", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", "onClaim", "Lkotlin/Function1;", "", "onTaskClick", "Lorg/betup/domain/quest/DailyQuestTask;", "dailyBonusData", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;", "onSectionBoundsReported", "Landroid/graphics/Rect;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeDailyQuestsSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeDailyQuestsSection$lambda$2(HomeDailyQuestUiState homeDailyQuestUiState, Function1 function1, Function1 function12, DailyBonusData dailyBonusData, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeDailyQuestsSection(homeDailyQuestUiState, function1, function12, dailyBonusData, function13, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeDailyQuestsSection(final HomeDailyQuestUiState state, final Function1<? super String, Unit> onClaim, final Function1<? super DailyQuestTask, Unit> onTaskClick, DailyBonusData dailyBonusData, Function1<? super Rect, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        DailyBonusData dailyBonusData2;
        int i4;
        final Function1<? super Rect, Unit> function12;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z;
        Long l;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int i7;
        ComposableLambda rememberComposableLambda;
        Composer composer2;
        final Modifier modifier3;
        final DailyBonusData dailyBonusData3;
        DailyQuest quest;
        DailyQuest quest2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClaim, "onClaim");
        Intrinsics.checkNotNullParameter(onTaskClick, "onTaskClick");
        Composer startRestartGroup = composer.startRestartGroup(-1119853890);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClaim) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onTaskClick) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            dailyBonusData2 = dailyBonusData;
            i3 |= startRestartGroup.changedInstance(dailyBonusData2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                    i6 = i3;
                    if ((74899 & i6) == 74898 || !startRestartGroup.getSkipping()) {
                        DailyBonusData dailyBonusData4 = i8 == 0 ? null : dailyBonusData2;
                        Function1<? super Rect, Unit> function13 = i4 == 0 ? null : function12;
                        if (i5 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1119853890, i6, -1, "org.betup.ui.fragment.home.compose.sections.HomeDailyQuestsSection (HomeDailyQuestsSection.kt:30)");
                        }
                        HomeDailyQuestUiState.Active active = !(state instanceof HomeDailyQuestUiState.Active) ? (HomeDailyQuestUiState.Active) state : null;
                        z = active == null && (quest2 = active.getQuest()) != null && quest2.isVisible() && active.getQuest().getExpiresAtEpochMs() > 0;
                        long rememberTickingNowMs = HomeCountdownTextKt.rememberTickingNowMs(z, 0L, startRestartGroup, 0, 2);
                        if (z) {
                            l = null;
                        } else {
                            Intrinsics.checkNotNull(active);
                            l = Long.valueOf(RangesKt.coerceAtLeast(active.getQuest().getExpiresAtEpochMs() - rememberTickingNowMs, 0L));
                        }
                        final int i9 = (active == null && (quest = active.getQuest()) != null && quest.getRewardClaimed()) ? R.string.home_daily_quests_new_quest_in : R.string.home_daily_quests_resets_in_label;
                        final TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                        Modifier reportHomeTourBounds = HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), function13, startRestartGroup, (i6 >> 9) & 112);
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, reportHomeTourBounds);
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
                        String stringResource = StringResources_androidKt.stringResource(R.string.home_daily_quests_title, startRestartGroup, 6);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_task);
                        startRestartGroup.startReplaceGroup(-461814165);
                        if (l != null) {
                            i7 = 1;
                            rememberComposableLambda = null;
                        } else {
                            final long longValue = l.longValue();
                            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeDailyQuestsSectionKt$HomeDailyQuestsSection$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i10) {
                                    if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(668644665, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeDailyQuestsSection.<anonymous>.<anonymous>.<anonymous> (HomeDailyQuestsSection.kt:61)");
                                    }
                                    HomeCountdownTextKt.HomeCountdownStackedText(i9, longValue, textStyle, null, composer3, 0, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            };
                            i7 = 1;
                            rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(668644665, true, function2, startRestartGroup, 54);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier modifier4 = modifier2;
                        Function1<? super Rect, Unit> function14 = function13;
                        HomeSectionTitleKt.HomeSectionTitle(stringResource, null, valueOf, null, null, null, rememberComposableLambda, Alignment.INSTANCE.getTop(), startRestartGroup, 12583296, 58);
                        composer2 = startRestartGroup;
                        DailyQuestsCardKt.DailyQuestsCard(state, onClaim, onTaskClick, dailyBonusData4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i7, null), startRestartGroup, (i6 & 14) | 24576 | (i6 & 112) | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168), 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        dailyBonusData3 = dailyBonusData4;
                        function12 = function14;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        dailyBonusData3 = dailyBonusData2;
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeDailyQuestsSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomeDailyQuestsSection$lambda$2;
                                HomeDailyQuestsSection$lambda$2 = HomeDailyQuestsSectionKt.HomeDailyQuestsSection$lambda$2(HomeDailyQuestUiState.this, onClaim, onTaskClick, dailyBonusData3, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return HomeDailyQuestsSection$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                i6 = i3;
                if ((74899 & i6) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!(state instanceof HomeDailyQuestUiState.Active)) {
                }
                if (active == null) {
                }
                long rememberTickingNowMs2 = HomeCountdownTextKt.rememberTickingNowMs(z, 0L, startRestartGroup, 0, 2);
                if (z) {
                }
                if (active == null) {
                }
                final TextStyle textStyle2 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                Modifier reportHomeTourBounds2 = HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), function13, startRestartGroup, (i6 >> 9) & 112);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, reportHomeTourBounds2);
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
                String stringResource2 = StringResources_androidKt.stringResource(R.string.home_daily_quests_title, startRestartGroup, 6);
                Integer valueOf2 = Integer.valueOf(R.drawable.ic_task);
                startRestartGroup.startReplaceGroup(-461814165);
                if (l != null) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier modifier42 = modifier2;
                Function1<? super Rect, Unit> function142 = function13;
                HomeSectionTitleKt.HomeSectionTitle(stringResource2, null, valueOf2, null, null, null, rememberComposableLambda, Alignment.INSTANCE.getTop(), startRestartGroup, 12583296, 58);
                composer2 = startRestartGroup;
                DailyQuestsCardKt.DailyQuestsCard(state, onClaim, onTaskClick, dailyBonusData4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i7, null), startRestartGroup, (i6 & 14) | 24576 | (i6 & 112) | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168), 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                dailyBonusData3 = dailyBonusData4;
                function12 = function142;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i3;
            if ((74899 & i6) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(state instanceof HomeDailyQuestUiState.Active)) {
            }
            if (active == null) {
            }
            long rememberTickingNowMs22 = HomeCountdownTextKt.rememberTickingNowMs(z, 0L, startRestartGroup, 0, 2);
            if (z) {
            }
            if (active == null) {
            }
            final TextStyle textStyle22 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
            Modifier reportHomeTourBounds22 = HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), function13, startRestartGroup, (i6 >> 9) & 112);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, reportHomeTourBounds22);
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
            String stringResource22 = StringResources_androidKt.stringResource(R.string.home_daily_quests_title, startRestartGroup, 6);
            Integer valueOf22 = Integer.valueOf(R.drawable.ic_task);
            startRestartGroup.startReplaceGroup(-461814165);
            if (l != null) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier modifier422 = modifier2;
            Function1<? super Rect, Unit> function1422 = function13;
            HomeSectionTitleKt.HomeSectionTitle(stringResource22, null, valueOf22, null, null, null, rememberComposableLambda, Alignment.INSTANCE.getTop(), startRestartGroup, 12583296, 58);
            composer2 = startRestartGroup;
            DailyQuestsCardKt.DailyQuestsCard(state, onClaim, onTaskClick, dailyBonusData4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i7, null), startRestartGroup, (i6 & 14) | 24576 | (i6 & 112) | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168), 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            dailyBonusData3 = dailyBonusData4;
            function12 = function1422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        dailyBonusData2 = dailyBonusData;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3;
        if ((74899 & i6) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!(state instanceof HomeDailyQuestUiState.Active)) {
        }
        if (active == null) {
        }
        long rememberTickingNowMs222 = HomeCountdownTextKt.rememberTickingNowMs(z, 0L, startRestartGroup, 0, 2);
        if (z) {
        }
        if (active == null) {
        }
        final TextStyle textStyle222 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
        Modifier reportHomeTourBounds222 = HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), function13, startRestartGroup, (i6 >> 9) & 112);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, reportHomeTourBounds222);
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
        String stringResource222 = StringResources_androidKt.stringResource(R.string.home_daily_quests_title, startRestartGroup, 6);
        Integer valueOf222 = Integer.valueOf(R.drawable.ic_task);
        startRestartGroup.startReplaceGroup(-461814165);
        if (l != null) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier modifier4222 = modifier2;
        Function1<? super Rect, Unit> function14222 = function13;
        HomeSectionTitleKt.HomeSectionTitle(stringResource222, null, valueOf222, null, null, null, rememberComposableLambda, Alignment.INSTANCE.getTop(), startRestartGroup, 12583296, 58);
        composer2 = startRestartGroup;
        DailyQuestsCardKt.DailyQuestsCard(state, onClaim, onTaskClick, dailyBonusData4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i7, null), startRestartGroup, (i6 & 14) | 24576 | (i6 & 112) | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168), 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        dailyBonusData3 = dailyBonusData4;
        function12 = function14222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
