package org.betup.ui.fragment.competitions.details.compose.components;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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
import io.bidmachine.media3.extractor.ts.PsExtractor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.competitions.CompetitionBetGroupInfoModel;
import org.betup.model.remote.entity.competitions.CompetitionBetGroupModel;
import org.betup.model.remote.entity.competitions.CompetitionBetItemModel;
import org.betup.model.remote.entity.competitions.CompetitionBetVarietyModel;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchWithBetsModel;
import org.betup.model.remote.entity.competitions.CompetitionSubMatchModel;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.model.remote.entity.teams.NewTeam;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.PagerStateNoSaveKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: CompetitionDetailsPagerView.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aê\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\f2K\u0010\r\u001aG\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0018\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"CompetitionDetailsPagerView", "", "competition", "Lorg/betup/model/remote/entity/competitions/CompetitionDetailsWithParticipantModel;", "currentMatchIndex", "", "selectedBetsPerMatch", "", "", "expandedStates", "", "onMatchIndexChanged", "Lkotlin/Function1;", "onBetClick", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "varietyId", "groupId", "betIndex", "onExpandToggle", "onRandomClick", "Lkotlin/Function0;", "onPlaceBetClick", "isPlaceBetEnabled", "oddType", "Lorg/betup/model/local/entity/OddType;", "(Lorg/betup/model/remote/entity/competitions/CompetitionDetailsWithParticipantModel;ILjava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLorg/betup/model/local/entity/OddType;Landroidx/compose/runtime/Composer;III)V", "CompetitionDetailsPagerViewPreview", "(Landroidx/compose/runtime/Composer;I)V", "MatchSelectionOverlay", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompetitionDetailsPagerViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsPagerView$lambda$10(CompetitionDetailsWithParticipantModel competitionDetailsWithParticipantModel, int i, Map map, Map map2, Function1 function1, Function3 function3, Function1 function12, Function0 function0, Function0 function02, boolean z, OddType oddType, int i2, int i3, int i4, Composer composer, int i5) {
        CompetitionDetailsPagerView(competitionDetailsWithParticipantModel, i, map, map2, function1, function3, function12, function0, function02, z, oddType, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsPagerViewPreview$lambda$21(int i, Composer composer, int i2) {
        CompetitionDetailsPagerViewPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchSelectionOverlay$lambda$28(Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchSelectionOverlay(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0189, code lost:
    
        r35 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompetitionDetailsPagerView(final CompetitionDetailsWithParticipantModel competition, final int i, final Map<Long, Long> selectedBetsPerMatch, final Map<Long, Boolean> expandedStates, final Function1<? super Integer, Unit> onMatchIndexChanged, final Function3<? super Long, ? super Long, ? super Integer, Unit> onBetClick, final Function1<? super Long, Unit> onExpandToggle, final Function0<Unit> onRandomClick, final Function0<Unit> onPlaceBetClick, final boolean z, OddType oddType, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        OddType oddType2;
        boolean changedInstance;
        Object rememberedValue;
        final PagerState rememberPagerStateWithoutSavedState;
        Object rememberedValue2;
        boolean z2;
        CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$1$1 rememberedValue3;
        boolean changed;
        CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$2$1 rememberedValue4;
        CompetitionMatchWithBetsModel competitionMatchWithBetsModel;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(competition, "competition");
        Intrinsics.checkNotNullParameter(selectedBetsPerMatch, "selectedBetsPerMatch");
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(onMatchIndexChanged, "onMatchIndexChanged");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Intrinsics.checkNotNullParameter(onExpandToggle, "onExpandToggle");
        Intrinsics.checkNotNullParameter(onRandomClick, "onRandomClick");
        Intrinsics.checkNotNullParameter(onPlaceBetClick, "onPlaceBetClick");
        Composer startRestartGroup = composer.startRestartGroup(1331649740);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(competition) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changedInstance(selectedBetsPerMatch) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(expandedStates) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changedInstance(onMatchIndexChanged) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((196608 & i2) == 0) {
                i6 = startRestartGroup.changedInstance(onBetClick) ? 131072 : 65536;
            }
            if ((i4 & 64) != 0) {
                i12 = (1572864 & i2) == 0 ? startRestartGroup.changedInstance(onExpandToggle) ? 1048576 : 524288 : 1572864;
                if ((i4 & 128) == 0) {
                    i11 = (12582912 & i2) == 0 ? startRestartGroup.changedInstance(onRandomClick) ? 8388608 : 4194304 : 12582912;
                    if ((i4 & 256) != 0) {
                        i10 = (100663296 & i2) == 0 ? startRestartGroup.changedInstance(onPlaceBetClick) ? 67108864 : 33554432 : 100663296;
                        if ((i4 & 512) != 0) {
                            i5 |= 805306368;
                        } else if ((805306368 & i2) == 0) {
                            i5 |= startRestartGroup.changed(z) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i7 = i4 & 1024;
                            if (i7 == 0) {
                                i9 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i9 = i3 | (startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 4 : 2);
                            } else {
                                i8 = i3;
                                if ((i5 & 306783379) != 306783378 && (i8 & 3) == 2 && startRestartGroup.getSkipping()) {
                                    startRestartGroup.skipToGroupEnd();
                                    oddType2 = oddType;
                                    composer2 = startRestartGroup;
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final OddType oddType3 = oddType2;
                                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit CompetitionDetailsPagerView$lambda$10;
                                                CompetitionDetailsPagerView$lambda$10 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$10(CompetitionDetailsWithParticipantModel.this, i, selectedBetsPerMatch, expandedStates, onMatchIndexChanged, onBetClick, onExpandToggle, onRandomClick, onPlaceBetClick, z, oddType3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                return CompetitionDetailsPagerView$lambda$10;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                oddType2 = oddType;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1331649740, i5, i8, "org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerView (CompetitionDetailsPagerView.kt:60)");
                                }
                                startRestartGroup.startReplaceGroup(5004770);
                                changedInstance = startRestartGroup.changedInstance(competition);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int CompetitionDetailsPagerView$lambda$1$lambda$0;
                                            CompetitionDetailsPagerView$lambda$1$lambda$0 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$1$lambda$0(CompetitionDetailsWithParticipantModel.this);
                                            return Integer.valueOf(CompetitionDetailsPagerView$lambda$1$lambda$0);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                int i13 = (i5 >> 3) & 14;
                                int i14 = i5;
                                rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i13, 2);
                                LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Integer valueOf = Integer.valueOf(i);
                                startRestartGroup.startReplaceGroup(-1633490746);
                                boolean changed2 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                                int i15 = i14 & 112;
                                z2 = changed2 | (i15 == 32);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$1$1(rememberPagerStateWithoutSavedState, i, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i13);
                                Integer valueOf2 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                                startRestartGroup.startReplaceGroup(-1746271574);
                                int i16 = i14 & 57344;
                                changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i15 == 32) | (i16 == 16384);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$2$1(rememberPagerStateWithoutSavedState, i, onMatchIndexChanged, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                                competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) CollectionsKt.getOrNull(competition.getMatches(), rememberPagerStateWithoutSavedState.getCurrentPage());
                                if (competitionMatchWithBetsModel != null) {
                                    selectedBetsPerMatch.containsKey(Long.valueOf(competitionMatchWithBetsModel.getMatchInfo().getId()));
                                }
                                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                float f = 8;
                                Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null), 0.0f, 1, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor3);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                float f2 = 16;
                                CompetitionHeaderKt.CompetitionHeader(competition, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f)), startRestartGroup, (i14 & 14) | 48, 0);
                                composer2 = startRestartGroup;
                                PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, PaddingKt.m1517paddingVpY3zN4(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(2)), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(261600831, true, new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1(competition, selectedBetsPerMatch, expandedStates, onBetClick, onExpandToggle, oddType2), composer2, 54), composer2, 0, 24576, 16380);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.startReplaceGroup(-1391874448);
                                if (competition.getMatches().size() > 1) {
                                    List<CompetitionMatchWithBetsModel> matches = competition.getMatches();
                                    int currentPage = rememberPagerStateWithoutSavedState.getCurrentPage();
                                    composer2.startReplaceGroup(-1746271574);
                                    boolean changed3 = (i16 == 16384) | composer2.changed(rememberPagerStateWithoutSavedState) | composer2.changedInstance(coroutineScope);
                                    Object rememberedValue5 = composer2.rememberedValue();
                                    if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit CompetitionDetailsPagerView$lambda$9$lambda$8$lambda$7$lambda$6;
                                                CompetitionDetailsPagerView$lambda$9$lambda$8$lambda$7$lambda$6 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$9$lambda$8$lambda$7$lambda$6(PagerState.this, coroutineScope, onMatchIndexChanged, ((Integer) obj).intValue());
                                                return CompetitionDetailsPagerView$lambda$9$lambda$8$lambda$7$lambda$6;
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue5);
                                    }
                                    composer2.endReplaceGroup();
                                    MatchNavigationDotsKt.MatchNavigationDots(matches, currentPage, selectedBetsPerMatch, rememberLazyListStateWithoutSavedState, (Function1) rememberedValue5, composer2, i14 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                                }
                                composer2.endReplaceGroup();
                                ActionButtonsCompetitionsKt.ActionButtonsCompetitions(onRandomClick, onPlaceBetClick, z, composer2, (i14 >> 21) & 1022, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i8 = i9;
                            if ((i5 & 306783379) != 306783378) {
                                startRestartGroup.skipToGroupEnd();
                                oddType2 = oddType;
                                composer2 = startRestartGroup;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            oddType2 = oddType;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            changedInstance = startRestartGroup.changedInstance(competition);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int CompetitionDetailsPagerView$lambda$1$lambda$0;
                                    CompetitionDetailsPagerView$lambda$1$lambda$0 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$1$lambda$0(CompetitionDetailsWithParticipantModel.this);
                                    return Integer.valueOf(CompetitionDetailsPagerView$lambda$1$lambda$0);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            int i132 = (i5 >> 3) & 14;
                            int i142 = i5;
                            rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i132, 2);
                            LazyListState rememberLazyListStateWithoutSavedState2 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Integer valueOf3 = Integer.valueOf(i);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            boolean changed22 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                            int i152 = i142 & 112;
                            z2 = changed22 | (i152 == 32);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z2) {
                            }
                            rememberedValue3 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$1$1(rememberPagerStateWithoutSavedState, i, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i132);
                            Integer valueOf22 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                            startRestartGroup.startReplaceGroup(-1746271574);
                            int i162 = i142 & 57344;
                            changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i152 == 32) | (i162 == 16384);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue4 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$2$1(rememberPagerStateWithoutSavedState, i, onMatchIndexChanged, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                            competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) CollectionsKt.getOrNull(competition.getMatches(), rememberPagerStateWithoutSavedState.getCurrentPage());
                            if (competitionMatchWithBetsModel != null) {
                            }
                            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            float f3 = 8;
                            Modifier m1038borderziNgDLE2 = BorderKt.m1038borderziNgDLE(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)), 0.0f, 4, null), 0.0f, 1, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE2);
                            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting()) {
                            }
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            float f22 = 16;
                            CompetitionHeaderKt.CompetitionHeader(competition, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f3)), startRestartGroup, (i142 & 14) | 48, 0);
                            composer2 = startRestartGroup;
                            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, PaddingKt.m1517paddingVpY3zN4(ColumnScope.weight$default(columnScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(2)), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(261600831, true, new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1(competition, selectedBetsPerMatch, expandedStates, onBetClick, onExpandToggle, oddType2), composer2, 54), composer2, 0, 24576, 16380);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.startReplaceGroup(-1391874448);
                            if (competition.getMatches().size() > 1) {
                            }
                            composer2.endReplaceGroup();
                            ActionButtonsCompetitionsKt.ActionButtonsCompetitions(onRandomClick, onPlaceBetClick, z, composer2, (i142 >> 21) & 1022, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i7 = i4 & 1024;
                        if (i7 == 0) {
                        }
                        i8 = i9;
                        if ((i5 & 306783379) != 306783378) {
                        }
                        oddType2 = oddType;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(5004770);
                        changedInstance = startRestartGroup.changedInstance(competition);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int CompetitionDetailsPagerView$lambda$1$lambda$0;
                                CompetitionDetailsPagerView$lambda$1$lambda$0 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$1$lambda$0(CompetitionDetailsWithParticipantModel.this);
                                return Integer.valueOf(CompetitionDetailsPagerView$lambda$1$lambda$0);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        int i1322 = (i5 >> 3) & 14;
                        int i1422 = i5;
                        rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i1322, 2);
                        LazyListState rememberLazyListStateWithoutSavedState22 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        final CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Integer valueOf32 = Integer.valueOf(i);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        boolean changed222 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                        int i1522 = i1422 & 112;
                        z2 = changed222 | (i1522 == 32);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z2) {
                        }
                        rememberedValue3 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$1$1(rememberPagerStateWithoutSavedState, i, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i1322);
                        Integer valueOf222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                        startRestartGroup.startReplaceGroup(-1746271574);
                        int i1622 = i1422 & 57344;
                        changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i1522 == 32) | (i1622 == 16384);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue4 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$2$1(rememberPagerStateWithoutSavedState, i, onMatchIndexChanged, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                        competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) CollectionsKt.getOrNull(competition.getMatches(), rememberPagerStateWithoutSavedState.getCurrentPage());
                        if (competitionMatchWithBetsModel != null) {
                        }
                        Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22);
                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        float f32 = 8;
                        Modifier m1038borderziNgDLE22 = BorderKt.m1038borderziNgDLE(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32)), 0.0f, 4, null), 0.0f, 1, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32)));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE22);
                        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting()) {
                        }
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                        float f222 = 16;
                        CompetitionHeaderKt.CompetitionHeader(competition, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(f32)), startRestartGroup, (i1422 & 14) | 48, 0);
                        composer2 = startRestartGroup;
                        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, PaddingKt.m1517paddingVpY3zN4(ColumnScope.weight$default(columnScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(2)), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(261600831, true, new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1(competition, selectedBetsPerMatch, expandedStates, onBetClick, onExpandToggle, oddType2), composer2, 54), composer2, 0, 24576, 16380);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.startReplaceGroup(-1391874448);
                        if (competition.getMatches().size() > 1) {
                        }
                        composer2.endReplaceGroup();
                        ActionButtonsCompetitionsKt.ActionButtonsCompetitions(onRandomClick, onPlaceBetClick, z, composer2, (i1422 >> 21) & 1022, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i5 |= i10;
                    if ((i4 & 512) != 0) {
                    }
                    i7 = i4 & 1024;
                    if (i7 == 0) {
                    }
                    i8 = i9;
                    if ((i5 & 306783379) != 306783378) {
                    }
                    oddType2 = oddType;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(competition);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int CompetitionDetailsPagerView$lambda$1$lambda$0;
                            CompetitionDetailsPagerView$lambda$1$lambda$0 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$1$lambda$0(CompetitionDetailsWithParticipantModel.this);
                            return Integer.valueOf(CompetitionDetailsPagerView$lambda$1$lambda$0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    int i13222 = (i5 >> 3) & 14;
                    int i14222 = i5;
                    rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i13222, 2);
                    LazyListState rememberLazyListStateWithoutSavedState222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    final CoroutineScope coroutineScope222 = (CoroutineScope) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Integer valueOf322 = Integer.valueOf(i);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    boolean changed2222 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                    int i15222 = i14222 & 112;
                    z2 = changed2222 | (i15222 == 32);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    rememberedValue3 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$1$1(rememberPagerStateWithoutSavedState, i, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf322, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i13222);
                    Integer valueOf2222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                    startRestartGroup.startReplaceGroup(-1746271574);
                    int i16222 = i14222 & 57344;
                    changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i15222 == 32) | (i16222 == 16384);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue4 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$2$1(rememberPagerStateWithoutSavedState, i, onMatchIndexChanged, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                    competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) CollectionsKt.getOrNull(competition.getMatches(), rememberPagerStateWithoutSavedState.getCurrentPage());
                    if (competitionMatchWithBetsModel != null) {
                    }
                    Modifier m1518paddingVpY3zN4$default222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default222);
                    Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    float f322 = 8;
                    Modifier m1038borderziNgDLE222 = BorderKt.m1038borderziNgDLE(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322)), 0.0f, 4, null), 0.0f, 1, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322)));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE222);
                    Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting()) {
                    }
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                    float f2222 = 16;
                    CompetitionHeaderKt.CompetitionHeader(competition, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222), Dp.m7774constructorimpl(f322)), startRestartGroup, (i14222 & 14) | 48, 0);
                    composer2 = startRestartGroup;
                    PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, PaddingKt.m1517paddingVpY3zN4(ColumnScope.weight$default(columnScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7774constructorimpl(f2222), Dp.m7774constructorimpl(2)), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(261600831, true, new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1(competition, selectedBetsPerMatch, expandedStates, onBetClick, onExpandToggle, oddType2), composer2, 54), composer2, 0, 24576, 16380);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.startReplaceGroup(-1391874448);
                    if (competition.getMatches().size() > 1) {
                    }
                    composer2.endReplaceGroup();
                    ActionButtonsCompetitionsKt.ActionButtonsCompetitions(onRandomClick, onPlaceBetClick, z, composer2, (i14222 >> 21) & 1022, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i5 |= i11;
                if ((i4 & 256) != 0) {
                }
                i5 |= i10;
                if ((i4 & 512) != 0) {
                }
                i7 = i4 & 1024;
                if (i7 == 0) {
                }
                i8 = i9;
                if ((i5 & 306783379) != 306783378) {
                }
                oddType2 = oddType;
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance = startRestartGroup.changedInstance(competition);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int CompetitionDetailsPagerView$lambda$1$lambda$0;
                        CompetitionDetailsPagerView$lambda$1$lambda$0 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$1$lambda$0(CompetitionDetailsWithParticipantModel.this);
                        return Integer.valueOf(CompetitionDetailsPagerView$lambda$1$lambda$0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                int i132222 = (i5 >> 3) & 14;
                int i142222 = i5;
                rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i132222, 2);
                LazyListState rememberLazyListStateWithoutSavedState2222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final CoroutineScope coroutineScope2222 = (CoroutineScope) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Integer valueOf3222 = Integer.valueOf(i);
                startRestartGroup.startReplaceGroup(-1633490746);
                boolean changed22222 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                int i152222 = i142222 & 112;
                z2 = changed22222 | (i152222 == 32);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue3 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$1$1(rememberPagerStateWithoutSavedState, i, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf3222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i132222);
                Integer valueOf22222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                startRestartGroup.startReplaceGroup(-1746271574);
                int i162222 = i142222 & 57344;
                changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i152222 == 32) | (i162222 == 16384);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue4 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$2$1(rememberPagerStateWithoutSavedState, i, onMatchIndexChanged, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) CollectionsKt.getOrNull(competition.getMatches(), rememberPagerStateWithoutSavedState.getCurrentPage());
                if (competitionMatchWithBetsModel != null) {
                }
                Modifier m1518paddingVpY3zN4$default2222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2222);
                Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222);
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                float f3222 = 8;
                Modifier m1038borderziNgDLE2222 = BorderKt.m1038borderziNgDLE(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222)), 0.0f, 4, null), 0.0f, 1, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222)));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE2222);
                Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                float f22222 = 16;
                CompetitionHeaderKt.CompetitionHeader(competition, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222), Dp.m7774constructorimpl(f3222)), startRestartGroup, (i142222 & 14) | 48, 0);
                composer2 = startRestartGroup;
                PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, PaddingKt.m1517paddingVpY3zN4(ColumnScope.weight$default(columnScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7774constructorimpl(f22222), Dp.m7774constructorimpl(2)), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(261600831, true, new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1(competition, selectedBetsPerMatch, expandedStates, onBetClick, onExpandToggle, oddType2), composer2, 54), composer2, 0, 24576, 16380);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(-1391874448);
                if (competition.getMatches().size() > 1) {
                }
                composer2.endReplaceGroup();
                ActionButtonsCompetitionsKt.ActionButtonsCompetitions(onRandomClick, onPlaceBetClick, z, composer2, (i142222 >> 21) & 1022, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 |= i12;
            if ((i4 & 128) == 0) {
            }
            i5 |= i11;
            if ((i4 & 256) != 0) {
            }
            i5 |= i10;
            if ((i4 & 512) != 0) {
            }
            i7 = i4 & 1024;
            if (i7 == 0) {
            }
            i8 = i9;
            if ((i5 & 306783379) != 306783378) {
            }
            oddType2 = oddType;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(competition);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int CompetitionDetailsPagerView$lambda$1$lambda$0;
                    CompetitionDetailsPagerView$lambda$1$lambda$0 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$1$lambda$0(CompetitionDetailsWithParticipantModel.this);
                    return Integer.valueOf(CompetitionDetailsPagerView$lambda$1$lambda$0);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            int i1322222 = (i5 >> 3) & 14;
            int i1422222 = i5;
            rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i1322222, 2);
            LazyListState rememberLazyListStateWithoutSavedState22222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final CoroutineScope coroutineScope22222 = (CoroutineScope) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Integer valueOf32222 = Integer.valueOf(i);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changed222222 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
            int i1522222 = i1422222 & 112;
            z2 = changed222222 | (i1522222 == 32);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue3 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$1$1(rememberPagerStateWithoutSavedState, i, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf32222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i1322222);
            Integer valueOf222222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
            startRestartGroup.startReplaceGroup(-1746271574);
            int i1622222 = i1422222 & 57344;
            changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i1522222 == 32) | (i1622222 == 16384);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$2$1(rememberPagerStateWithoutSavedState, i, onMatchIndexChanged, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
            competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) CollectionsKt.getOrNull(competition.getMatches(), rememberPagerStateWithoutSavedState.getCurrentPage());
            if (competitionMatchWithBetsModel != null) {
            }
            Modifier m1518paddingVpY3zN4$default22222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22222);
            Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy32222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222);
            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            float f32222 = 8;
            Modifier m1038borderziNgDLE22222 = BorderKt.m1038borderziNgDLE(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32222)), 0.0f, 4, null), 0.0f, 1, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32222)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE22222);
            Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
            float f222222 = 16;
            CompetitionHeaderKt.CompetitionHeader(competition, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222), Dp.m7774constructorimpl(f32222)), startRestartGroup, (i1422222 & 14) | 48, 0);
            composer2 = startRestartGroup;
            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, PaddingKt.m1517paddingVpY3zN4(ColumnScope.weight$default(columnScopeInstance22222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7774constructorimpl(f222222), Dp.m7774constructorimpl(2)), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(261600831, true, new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1(competition, selectedBetsPerMatch, expandedStates, onBetClick, onExpandToggle, oddType2), composer2, 54), composer2, 0, 24576, 16380);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.startReplaceGroup(-1391874448);
            if (competition.getMatches().size() > 1) {
            }
            composer2.endReplaceGroup();
            ActionButtonsCompetitionsKt.ActionButtonsCompetitions(onRandomClick, onPlaceBetClick, z, composer2, (i1422222 >> 21) & 1022, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 |= i6;
        if ((i4 & 64) != 0) {
        }
        i5 |= i12;
        if ((i4 & 128) == 0) {
        }
        i5 |= i11;
        if ((i4 & 256) != 0) {
        }
        i5 |= i10;
        if ((i4 & 512) != 0) {
        }
        i7 = i4 & 1024;
        if (i7 == 0) {
        }
        i8 = i9;
        if ((i5 & 306783379) != 306783378) {
        }
        oddType2 = oddType;
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(competition);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int CompetitionDetailsPagerView$lambda$1$lambda$0;
                CompetitionDetailsPagerView$lambda$1$lambda$0 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView$lambda$1$lambda$0(CompetitionDetailsWithParticipantModel.this);
                return Integer.valueOf(CompetitionDetailsPagerView$lambda$1$lambda$0);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i13222222 = (i5 >> 3) & 14;
        int i14222222 = i5;
        rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i13222222, 2);
        LazyListState rememberLazyListStateWithoutSavedState222222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final CoroutineScope coroutineScope222222 = (CoroutineScope) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Integer valueOf322222 = Integer.valueOf(i);
        startRestartGroup.startReplaceGroup(-1633490746);
        boolean changed2222222 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
        int i15222222 = i14222222 & 112;
        z2 = changed2222222 | (i15222222 == 32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue3 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$1$1(rememberPagerStateWithoutSavedState, i, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf322222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i13222222);
        Integer valueOf2222222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
        startRestartGroup.startReplaceGroup(-1746271574);
        int i16222222 = i14222222 & 57344;
        changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i15222222 == 32) | (i16222222 == 16384);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$2$1(rememberPagerStateWithoutSavedState, i, onMatchIndexChanged, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
        competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) CollectionsKt.getOrNull(competition.getMatches(), rememberPagerStateWithoutSavedState.getCurrentPage());
        if (competitionMatchWithBetsModel != null) {
        }
        Modifier m1518paddingVpY3zN4$default222222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default222222);
        Function0<ComposeUiNode> constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy322222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222);
        Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        float f322222 = 8;
        Modifier m1038borderziNgDLE222222 = BorderKt.m1038borderziNgDLE(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322222)), 0.0f, 4, null), 0.0f, 1, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322222)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE222222);
        Function0<ComposeUiNode> constructor3222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
        float f2222222 = 16;
        CompetitionHeaderKt.CompetitionHeader(competition, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222222), Dp.m7774constructorimpl(f322222)), startRestartGroup, (i14222222 & 14) | 48, 0);
        composer2 = startRestartGroup;
        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, PaddingKt.m1517paddingVpY3zN4(ColumnScope.weight$default(columnScopeInstance222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7774constructorimpl(f2222222), Dp.m7774constructorimpl(2)), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(261600831, true, new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1(competition, selectedBetsPerMatch, expandedStates, onBetClick, onExpandToggle, oddType2), composer2, 54), composer2, 0, 24576, 16380);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.startReplaceGroup(-1391874448);
        if (competition.getMatches().size() > 1) {
        }
        composer2.endReplaceGroup();
        ActionButtonsCompetitionsKt.ActionButtonsCompetitions(onRandomClick, onPlaceBetClick, z, composer2, (i14222222 >> 21) & 1022, 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CompetitionDetailsPagerView$lambda$1$lambda$0(CompetitionDetailsWithParticipantModel competitionDetailsWithParticipantModel) {
        return competitionDetailsWithParticipantModel.getMatches().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsPagerView$lambda$9$lambda$8$lambda$7$lambda$6(PagerState pagerState, CoroutineScope coroutineScope, Function1 function1, int i) {
        Log.d("CompetitionDetailsPagerView", "Dot clicked: " + i);
        if (i != pagerState.getCurrentPage()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$2$1$1(pagerState, i, null), 3, null);
            function1.invoke(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    public static final void CompetitionDetailsPagerViewPreview(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-118306398);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-118306398, i, -1, "org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewPreview (CompetitionDetailsPagerView.kt:189)");
            }
            CompetitionDetailsWithParticipantModel competitionDetailsWithParticipantModel = new CompetitionDetailsWithParticipantModel(21001L, "Test Competition", null, 7000L, 0L, 1000000L, false, CollectionsKt.listOf(new CompetitionMatchWithBetsModel(new CompetitionMatchInfoModel(18838599L, new NewLeague(104138, "", "MLS+"), new NewTeam(789968, "", "Memphis +"), new NewTeam(789960, "", "Chivas +"), null, 0, 0, "2025-09-19T06:00:00.000+00:00", 0, null, null, null, null, 8048, null), null, CollectionsKt.listOf(new CompetitionSubMatchModel(new CompetitionBetVarietyModel(1L, 0, 0, "Match Result", 6, null), CollectionsKt.listOf(new CompetitionBetGroupModel(new CompetitionBetGroupInfoModel(101, 0, "Match Result", true, 3, 0, 0, 98, null), CollectionsKt.listOf((Object[]) new CompetitionBetItemModel[]{new CompetitionBetItemModel(1001L, 2.5d, 1, true, "Home Win"), new CompetitionBetItemModel(1002L, 3.2d, 2, true, "Draw"), new CompetitionBetItemModel(1003L, 2.8d, 3, true, "Away Win")}))))), 2, null)), "2025-09-19T05:30:00.000+00:00", "2025-09-20T00:27:21.000+00:00", CollectionsKt.emptyList(), null, 0L, 6212, null);
            Map emptyMap = MapsKt.emptyMap();
            Map emptyMap2 = MapsKt.emptyMap();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CompetitionDetailsPagerViewPreview$lambda$12$lambda$11;
                        CompetitionDetailsPagerViewPreview$lambda$12$lambda$11 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerViewPreview$lambda$12$lambda$11(((Integer) obj).intValue());
                        return CompetitionDetailsPagerViewPreview$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function3() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit CompetitionDetailsPagerViewPreview$lambda$14$lambda$13;
                        CompetitionDetailsPagerViewPreview$lambda$14$lambda$13 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerViewPreview$lambda$14$lambda$13(((Long) obj).longValue(), ((Long) obj2).longValue(), ((Integer) obj3).intValue());
                        return CompetitionDetailsPagerViewPreview$lambda$14$lambda$13;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function3 function3 = (Function3) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CompetitionDetailsPagerViewPreview$lambda$16$lambda$15;
                        CompetitionDetailsPagerViewPreview$lambda$16$lambda$15 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerViewPreview$lambda$16$lambda$15(((Long) obj).longValue());
                        return CompetitionDetailsPagerViewPreview$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function1 function12 = (Function1) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Function0 function0 = (Function0) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            CompetitionDetailsPagerView(competitionDetailsWithParticipantModel, 0, emptyMap, emptyMap2, function1, function3, function12, function0, (Function0) rememberedValue5, false, null, startRestartGroup, 920350128, 0, 1024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionDetailsPagerViewPreview$lambda$21;
                    CompetitionDetailsPagerViewPreview$lambda$21 = CompetitionDetailsPagerViewKt.CompetitionDetailsPagerViewPreview$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionDetailsPagerViewPreview$lambda$21;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsPagerViewPreview$lambda$12$lambda$11(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsPagerViewPreview$lambda$14$lambda$13(long j, long j2, int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsPagerViewPreview$lambda$16$lambda$15(long j) {
        return Unit.INSTANCE;
    }

    private static final void MatchSelectionOverlay(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-525726475);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-525726475, i3, -1, "org.betup.ui.fragment.competitions.details.compose.components.MatchSelectionOverlay (CompetitionDetailsPagerView.kt:286)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MatchSelectionOverlay$lambda$23$lambda$22;
                        MatchSelectionOverlay$lambda$23$lambda$22 = CompetitionDetailsPagerViewKt.MatchSelectionOverlay$lambda$23$lambda$22((DrawScope) obj);
                        return MatchSelectionOverlay$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier drawBehind = DrawModifierKt.drawBehind(fillMaxSize$default, (Function1) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind);
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
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), null, false, 3, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
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
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = 16;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(PsExtractor.VIDEO_STREAM_MASK), 1, null), ColorKt.Color(4279704614L), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(5))), Dp.m7774constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifier4 = modifier3;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_select_match_title, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.INSTANCE.m5205getWhite0d7_KjU(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_select_match_subtitle, startRestartGroup, 6), PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.INSTANCE.m5205getWhite0d7_KjU(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.helper_left_finger, composer2, 6), (String) null, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(150)), 0.0f, Dp.m7774constructorimpl(f), 0.0f, 0.0f, 13, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchSelectionOverlay$lambda$28;
                    MatchSelectionOverlay$lambda$28 = CompetitionDetailsPagerViewKt.MatchSelectionOverlay$lambda$28(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchSelectionOverlay$lambda$28;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchSelectionOverlay$lambda$23$lambda$22(DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.67f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }
}
