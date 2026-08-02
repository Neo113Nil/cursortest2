package org.betup.ui.fragment.competitions.details.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.competitions.CompetitionBetGroupInfoModel;
import org.betup.model.remote.entity.competitions.CompetitionBetGroupModel;
import org.betup.model.remote.entity.competitions.CompetitionBetItemModel;
import org.betup.model.remote.entity.competitions.CompetitionBetVarietyModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchWithBetsModel;
import org.betup.model.remote.entity.competitions.CompetitionSubMatchModel;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.model.remote.entity.teams.NewTeam;
import org.betup.ui.common.compose.MatchLeagueItemKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsControllerKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.BetGroupsSortingUtils;
import org.betup.utils.MatchDisplayState;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: CompetitionMatchPage.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aÿ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00072K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172:\b\u0002\u0010\u0018\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001c\u001aQ\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052:\b\u0002\u0010\u0018\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010 ¨\u0006\""}, d2 = {"CompetitionMatchPage", "", "modifier", "Landroidx/compose/ui/Modifier;", "match", "Lorg/betup/model/remote/entity/competitions/CompetitionMatchWithBetsModel;", "selectedBetsPerMatch", "", "", "expandedStates", "", "onBetClick", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "varietyId", "groupId", "", "betIndex", "onExpandToggle", "Lkotlin/Function1;", "stateKey", "oddType", "Lorg/betup/model/local/entity/OddType;", "onOpenLeagueMatches", "Lkotlin/Function2;", "leagueId", "isLive", "(Landroidx/compose/ui/Modifier;Lorg/betup/model/remote/entity/competitions/CompetitionMatchWithBetsModel;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "CompetitionMatchHeader", "(Lorg/betup/model/remote/entity/competitions/CompetitionMatchWithBetsModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "CompetitionMatchPagePreview", "(Landroidx/compose/runtime/Composer;I)V", "CompetitionMatchHeaderPreview", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompetitionMatchPageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionMatchHeader$lambda$17(CompetitionMatchWithBetsModel competitionMatchWithBetsModel, Function2 function2, int i, int i2, Composer composer, int i3) {
        CompetitionMatchHeader(competitionMatchWithBetsModel, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionMatchHeaderPreview$lambda$24(int i, Composer composer, int i2) {
        CompetitionMatchHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionMatchPage$lambda$10(Modifier modifier, CompetitionMatchWithBetsModel competitionMatchWithBetsModel, Map map, Map map2, Function3 function3, Function1 function1, OddType oddType, Function2 function2, int i, int i2, Composer composer, int i3) {
        CompetitionMatchPage(modifier, competitionMatchWithBetsModel, map, map2, function3, function1, oddType, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionMatchPagePreview$lambda$22(int i, Composer composer, int i2) {
        CompetitionMatchPagePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CompetitionMatchPage(Modifier modifier, final CompetitionMatchWithBetsModel match, final Map<Long, Long> selectedBetsPerMatch, final Map<Long, Boolean> expandedStates, final Function3<? super Long, ? super Long, ? super Integer, Unit> onBetClick, final Function1<? super Long, Unit> onExpandToggle, OddType oddType, Function2<? super Integer, ? super Boolean, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function2<? super Integer, ? super Boolean, Unit> function22;
        Modifier modifier3;
        Composer composer2;
        final OddType oddType2;
        final Function2<? super Integer, ? super Boolean, Unit> function23;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(selectedBetsPerMatch, "selectedBetsPerMatch");
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Intrinsics.checkNotNullParameter(onExpandToggle, "onExpandToggle");
        Composer startRestartGroup = composer.startRestartGroup(128137039);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(match) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(selectedBetsPerMatch) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(expandedStates) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onBetClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(onExpandToggle) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 4793491) != 4793490 || !startRestartGroup.getSkipping()) {
            Modifier modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            OddType oddType3 = i5 != 0 ? null : oddType;
            Function2<? super Integer, ? super Boolean, Unit> function24 = i6 != 0 ? null : function22;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(128137039, i3, -1, "org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPage (CompetitionMatchPage.kt:50)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changedInstance = startRestartGroup.changedInstance(match) | ((29360128 & i3) == 8388608) | startRestartGroup.changedInstance(expandedStates) | startRestartGroup.changedInstance(selectedBetsPerMatch) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final Function2<? super Integer, ? super Boolean, Unit> function25 = function24;
                final OddType oddType4 = oddType3;
                modifier3 = modifier5;
                Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CompetitionMatchPage$lambda$9$lambda$8;
                        CompetitionMatchPage$lambda$9$lambda$8 = CompetitionMatchPageKt.CompetitionMatchPage$lambda$9$lambda$8(CompetitionMatchWithBetsModel.this, function25, expandedStates, selectedBetsPerMatch, oddType4, onExpandToggle, onBetClick, (LazyListScope) obj);
                        return CompetitionMatchPage$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue = function1;
            } else {
                modifier3 = modifier5;
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            LazyDslKt.LazyColumn(fillMaxSize$default, null, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer2, 24576, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            oddType2 = oddType3;
            function23 = function24;
            modifier4 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            oddType2 = oddType;
            function23 = function22;
            modifier4 = modifier2;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionMatchPage$lambda$10;
                    CompetitionMatchPage$lambda$10 = CompetitionMatchPageKt.CompetitionMatchPage$lambda$10(Modifier.this, match, selectedBetsPerMatch, expandedStates, onBetClick, onExpandToggle, oddType2, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionMatchPage$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionMatchPage$lambda$9$lambda$8(final CompetitionMatchWithBetsModel competitionMatchWithBetsModel, final Function2 function2, final Map map, final Map map2, final OddType oddType, final Function1 function1, final Function3 function3, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1012225562, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$CompetitionMatchPage$1$1$1
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
                    ComposerKt.traceEventStart(1012225562, i, -1, "org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPage.<anonymous>.<anonymous>.<anonymous> (CompetitionMatchPage.kt:58)");
                }
                CompetitionMatchPageKt.CompetitionMatchHeader(CompetitionMatchWithBetsModel.this, function2, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (!competitionMatchWithBetsModel.getSubMatches().isEmpty()) {
            List<CompetitionSubMatchModel> subMatches = competitionMatchWithBetsModel.getSubMatches();
            ArrayList arrayList = new ArrayList();
            for (CompetitionSubMatchModel competitionSubMatchModel : subMatches) {
                List<CompetitionBetGroupModel> groups = competitionSubMatchModel.getGroups();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(groups, 10));
                Iterator<T> it = groups.iterator();
                while (it.hasNext()) {
                    arrayList2.add(TuplesKt.to(Long.valueOf(competitionSubMatchModel.getVariety().getId()), (CompetitionBetGroupModel) it.next()));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            final List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$CompetitionMatchPage$lambda$9$lambda$8$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int id = ((CompetitionBetGroupModel) ((Pair) t).component2()).getGroup().getId();
                    int i = 999;
                    Integer valueOf = Integer.valueOf(id != 1 ? id != 2 ? id != 3 ? id != 4 ? 999 : 4 : 3 : 2 : 1);
                    int id2 = ((CompetitionBetGroupModel) ((Pair) t2).component2()).getGroup().getId();
                    if (id2 == 1) {
                        i = 1;
                    } else if (id2 == 2) {
                        i = 2;
                    } else if (id2 == 3) {
                        i = 3;
                    } else if (id2 == 4) {
                        i = 4;
                    }
                    return ComparisonsKt.compareValues(valueOf, Integer.valueOf(i));
                }
            });
            final Function2 function22 = new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Object CompetitionMatchPage$lambda$9$lambda$8$lambda$3;
                    CompetitionMatchPage$lambda$9$lambda$8$lambda$3 = CompetitionMatchPageKt.CompetitionMatchPage$lambda$9$lambda$8$lambda$3(CompetitionMatchWithBetsModel.this, ((Integer) obj).intValue(), (Pair) obj2);
                    return CompetitionMatchPage$lambda$9$lambda$8$lambda$3;
                }
            };
            LazyColumn.items(sortedWith.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$CompetitionMatchPage$lambda$9$lambda$8$$inlined$itemsIndexed$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function2.this.invoke(Integer.valueOf(i), sortedWith.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$CompetitionMatchPage$lambda$9$lambda$8$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    sortedWith.get(i);
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$CompetitionMatchPage$lambda$9$lambda$8$$inlined$itemsIndexed$default$3
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
                    ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                    int i3 = (i2 & 6) == 0 ? i2 | (composer.changed(lazyItemScope) ? 4 : 2) : i2;
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
                    Pair pair = (Pair) sortedWith.get(i);
                    composer.startReplaceGroup(-1001232664);
                    final long longValue = ((Number) pair.component1()).longValue();
                    CompetitionBetGroupModel competitionBetGroupModel = (CompetitionBetGroupModel) pair.component2();
                    final long id = competitionBetGroupModel.getGroup().getId();
                    final long competitionBetGroupStateKey = CompetitionDetailsControllerKt.competitionBetGroupStateKey(longValue, competitionBetGroupModel.getGroup().getId());
                    Boolean bool = (Boolean) map.get(Long.valueOf(competitionBetGroupStateKey));
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    List<CompetitionBetItemModel> bets = competitionBetGroupModel.getBets();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets, 10));
                    for (CompetitionBetItemModel competitionBetItemModel : bets) {
                        arrayList3.add(new MatchVarietyBetOptionModel(competitionBetItemModel.getGrabbedBetId(), competitionBetItemModel.getGrabbedCoefficient(), competitionBetItemModel.getBetTypeId(), competitionBetItemModel.isAvailable(), competitionBetItemModel.getBetName()));
                    }
                    List<MatchVarietyBetOptionModel> sortBetsInGroup = BetGroupsSortingUtils.INSTANCE.sortBetsInGroup(competitionBetGroupModel.getGroup().getName(), arrayList3);
                    String name = competitionBetGroupModel.getGroup().getName();
                    Set ofNotNull = SetsKt.setOfNotNull(map2.get(Long.valueOf(competitionMatchWithBetsModel.getMatchInfo().getId())));
                    boolean z = !competitionBetGroupModel.getGroup().getUserAvailable();
                    int displayColumns = competitionBetGroupModel.getGroup().getDisplayColumns();
                    OddType oddType2 = oddType;
                    composer.startReplaceGroup(-1633490746);
                    boolean changed = composer.changed(function1) | composer.changed(competitionBetGroupStateKey);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$CompetitionMatchPage$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(Long.valueOf(competitionBetGroupStateKey));
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1746271574);
                    boolean changed2 = composer.changed(function3) | composer.changed(longValue) | composer.changed(id);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Function3 function32 = function3;
                        rememberedValue2 = (Function2) new Function2<Integer, Integer, Unit>() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$CompetitionMatchPage$1$1$3$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                                invoke(num.intValue(), num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i4, int i5) {
                                function32.invoke(Long.valueOf(longValue), Long.valueOf(id), Integer.valueOf(i5));
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceGroup();
                    BetGroupCardCompetitionKt.BetGroupCardCompetition(null, name, sortBetsInGroup, oddType2, booleanValue, ofNotNull, function0, (Function2) rememberedValue2, z, displayColumns, true, true, composer, 0, 54, 1);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CompetitionMatchPageKt.INSTANCE.getLambda$1616061430$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object CompetitionMatchPage$lambda$9$lambda$8$lambda$3(CompetitionMatchWithBetsModel competitionMatchWithBetsModel, int i, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        long longValue = ((Number) pair.component1()).longValue();
        CompetitionBetGroupModel competitionBetGroupModel = (CompetitionBetGroupModel) pair.component2();
        return competitionMatchWithBetsModel.getMatchInfo().getId() + "_" + longValue + "_" + competitionBetGroupModel.getGroup().getId() + "_" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r7 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (r9 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r10.intValue() > 0) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompetitionMatchHeader(final CompetitionMatchWithBetsModel competitionMatchWithBetsModel, Function2<? super Integer, ? super Boolean, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final Function2<? super Integer, ? super Boolean, Unit> function22;
        NewLeague league;
        String photoUrl;
        NewLeague league2;
        String name;
        NewLeague league3;
        final Integer num;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean isMatchStarted;
        Function2<? super Integer, ? super Boolean, Unit> function23;
        int i4;
        float f;
        String formattedDateWithoutYear;
        String formattedTime;
        Composer composer2;
        String photoUrl2;
        String photoUrl3;
        String name2;
        String name3;
        Function0 function0;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1577074687);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(competitionMatchWithBetsModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                final Function2<? super Integer, ? super Boolean, Unit> function24 = i5 == 0 ? null : function22;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1577074687, i3, -1, "org.betup.ui.fragment.competitions.details.compose.CompetitionMatchHeader (CompetitionMatchPage.kt:154)");
                }
                CompetitionMatchInfoModel matchInfo = competitionMatchWithBetsModel.getMatchInfo();
                league = matchInfo.getLeague();
                if (league != null && (photoUrl = league.getPhotoUrl()) != null) {
                    if (StringsKt.isBlank(photoUrl)) {
                        photoUrl = null;
                    }
                }
                NewSport sport = matchInfo.getSport();
                photoUrl = sport == null ? sport.getPhotoUrl() : null;
                if (photoUrl == null) {
                    photoUrl = "";
                }
                league2 = matchInfo.getLeague();
                if (league2 != null && (name = league2.getName()) != null) {
                    if (StringsKt.isBlank(name)) {
                        name = null;
                    }
                }
                NewSport sport2 = matchInfo.getSport();
                name = sport2 == null ? sport2.getName() : null;
                if (name == null) {
                    name = "";
                }
                league3 = matchInfo.getLeague();
                if (league3 != null) {
                    num = Integer.valueOf(league3.getId());
                }
                num = null;
                NewSport sport3 = matchInfo.getSport();
                Integer valueOf = sport3 == null ? Integer.valueOf(sport3.getId()) : null;
                final boolean isLive = MatchDisplayState.isLive(matchInfo.getMatchState(), matchInfo.getDate(), valueOf);
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(8), Dp.m7774constructorimpl(4));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                isMatchStarted = MatchDisplayState.isMatchStarted(matchInfo.getMatchState(), matchInfo.getDate(), valueOf);
                startRestartGroup.startReplaceGroup(-524191050);
                if (StringsKt.isBlank(name)) {
                    f = 0.0f;
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(2), 7, null);
                    startRestartGroup.startReplaceGroup(-524180131);
                    if (num == null || function24 == null) {
                        function0 = null;
                    } else {
                        startRestartGroup.startReplaceGroup(-1746271574);
                        boolean changed = startRestartGroup.changed(num) | ((i3 & 112) == 32) | startRestartGroup.changed(isLive);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit CompetitionMatchHeader$lambda$16$lambda$15$lambda$14;
                                    CompetitionMatchHeader$lambda$16$lambda$15$lambda$14 = CompetitionMatchPageKt.CompetitionMatchHeader$lambda$16$lambda$15$lambda$14(Function2.this, num, isLive);
                                    return CompetitionMatchHeader$lambda$16$lambda$15$lambda$14;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        function0 = (Function0) rememberedValue;
                    }
                    startRestartGroup.endReplaceGroup();
                    i4 = 1;
                    function23 = function24;
                    MatchLeagueItemKt.MatchLeagueItem(m1520paddingqDBjuR0$default, photoUrl, name, true, false, true, function0, startRestartGroup, 199686, 16);
                } else {
                    function23 = function24;
                    i4 = 1;
                    f = 0.0f;
                }
                startRestartGroup.endReplaceGroup();
                NewTeam homeTeam = competitionMatchWithBetsModel.getMatchInfo().getHomeTeam();
                String str = (homeTeam != null || (name3 = homeTeam.getName()) == null) ? "" : name3;
                NewTeam awayTeam = competitionMatchWithBetsModel.getMatchInfo().getAwayTeam();
                String str2 = (awayTeam != null || (name2 = awayTeam.getName()) == null) ? "" : name2;
                NewTeam homeTeam2 = competitionMatchWithBetsModel.getMatchInfo().getHomeTeam();
                String str3 = (homeTeam2 != null || (photoUrl3 = homeTeam2.getPhotoUrl()) == null) ? "" : photoUrl3;
                NewTeam awayTeam2 = competitionMatchWithBetsModel.getMatchInfo().getAwayTeam();
                String str4 = (awayTeam2 != null || (photoUrl2 = awayTeam2.getPhotoUrl()) == null) ? "" : photoUrl2;
                String valueOf2 = !isMatchStarted ? String.valueOf(competitionMatchWithBetsModel.getMatchInfo().getScoreHome()) : null;
                String valueOf3 = !isMatchStarted ? String.valueOf(competitionMatchWithBetsModel.getMatchInfo().getScoreAway()) : null;
                if (!isMatchStarted) {
                    formattedDateWithoutYear = UiExtensionsKt.normalizeMatchTime(competitionMatchWithBetsModel.getMatchInfo().getCurrentTime());
                } else {
                    formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(competitionMatchWithBetsModel.getMatchInfo().getDate());
                }
                String str5 = formattedDateWithoutYear;
                if (!isMatchStarted) {
                    formattedTime = UiExtensionsKt.normalizeMatchTime(competitionMatchWithBetsModel.getMatchInfo().getCurrentPeriod());
                } else {
                    formattedTime = UiExtensionsKt.getFormattedTime(competitionMatchWithBetsModel.getMatchInfo().getDate());
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i4, null);
                composer2 = startRestartGroup;
                TeamsRowKt.m13615TeamsRowUiefj4(fillMaxWidth$default, str, str2, str3, str4, valueOf2, valueOf3, null, str5, formattedTime, null, false, isMatchStarted, false, true, false, false, 0, null, null, 0.0f, 0.0f, false, composer2, 6, 24576, 0, 8367232);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function23;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CompetitionMatchHeader$lambda$17;
                        CompetitionMatchHeader$lambda$17 = CompetitionMatchPageKt.CompetitionMatchHeader$lambda$17(CompetitionMatchWithBetsModel.this, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CompetitionMatchHeader$lambda$17;
                    }
                });
                return;
            }
            return;
        }
        function22 = function2;
        if ((i3 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        CompetitionMatchInfoModel matchInfo2 = competitionMatchWithBetsModel.getMatchInfo();
        league = matchInfo2.getLeague();
        if (league != null) {
            if (StringsKt.isBlank(photoUrl)) {
            }
        }
        NewSport sport4 = matchInfo2.getSport();
        if (sport4 == null) {
        }
        if (photoUrl == null) {
        }
        league2 = matchInfo2.getLeague();
        if (league2 != null) {
            if (StringsKt.isBlank(name)) {
            }
        }
        NewSport sport22 = matchInfo2.getSport();
        if (sport22 == null) {
        }
        if (name == null) {
        }
        league3 = matchInfo2.getLeague();
        if (league3 != null) {
        }
        num = null;
        NewSport sport32 = matchInfo2.getSport();
        if (sport32 == null) {
        }
        final boolean isLive2 = MatchDisplayState.isLive(matchInfo2.getMatchState(), matchInfo2.getDate(), valueOf);
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(8), Dp.m7774constructorimpl(4));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
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
        isMatchStarted = MatchDisplayState.isMatchStarted(matchInfo2.getMatchState(), matchInfo2.getDate(), valueOf);
        startRestartGroup.startReplaceGroup(-524191050);
        if (StringsKt.isBlank(name)) {
        }
        startRestartGroup.endReplaceGroup();
        NewTeam homeTeam3 = competitionMatchWithBetsModel.getMatchInfo().getHomeTeam();
        if (homeTeam3 != null) {
        }
        NewTeam awayTeam3 = competitionMatchWithBetsModel.getMatchInfo().getAwayTeam();
        if (awayTeam3 != null) {
        }
        NewTeam homeTeam22 = competitionMatchWithBetsModel.getMatchInfo().getHomeTeam();
        if (homeTeam22 != null) {
        }
        NewTeam awayTeam22 = competitionMatchWithBetsModel.getMatchInfo().getAwayTeam();
        if (awayTeam22 != null) {
        }
        if (!isMatchStarted) {
        }
        if (!isMatchStarted) {
        }
        if (!isMatchStarted) {
        }
        String str52 = formattedDateWithoutYear;
        if (!isMatchStarted) {
        }
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i4, null);
        composer2 = startRestartGroup;
        TeamsRowKt.m13615TeamsRowUiefj4(fillMaxWidth$default2, str, str2, str3, str4, valueOf2, valueOf3, null, str52, formattedTime, null, false, isMatchStarted, false, true, false, false, 0, null, null, 0.0f, 0.0f, false, composer2, 6, 24576, 0, 8367232);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function22 = function23;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionMatchHeader$lambda$16$lambda$15$lambda$14(Function2 function2, Integer num, boolean z) {
        function2.invoke(num, Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final void CompetitionMatchPagePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(529104542);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(529104542, i, -1, "org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPagePreview (CompetitionMatchPage.kt:216)");
            }
            CompetitionMatchWithBetsModel competitionMatchWithBetsModel = new CompetitionMatchWithBetsModel(new CompetitionMatchInfoModel(18838599L, new NewLeague(104138, "", "MLS+"), new NewTeam(789968, "", "Memphis +"), new NewTeam(789960, "", "Chivas +"), new NewSport(22, "", "Football", null, null, false, 56, null), 0, 0, "2025-09-19T06:00:00.000+00:00", 1, null, null, null, null, 7776, null), null, CollectionsKt.listOf(new CompetitionSubMatchModel(new CompetitionBetVarietyModel(1L, 0, 0, "Match Result", 6, null), CollectionsKt.listOf(new CompetitionBetGroupModel(new CompetitionBetGroupInfoModel(101, 0, "Match Result", true, 3, 0, 0, 98, null), CollectionsKt.listOf((Object[]) new CompetitionBetItemModel[]{new CompetitionBetItemModel(1001L, 2.5d, 1, true, "Home Win"), new CompetitionBetItemModel(1002L, 3.2d, 2, true, "Draw"), new CompetitionBetItemModel(1003L, 2.8d, 3, true, "Away Win")}))))), 2, null);
            Map emptyMap = MapsKt.emptyMap();
            Map emptyMap2 = MapsKt.emptyMap();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function3() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit CompetitionMatchPagePreview$lambda$19$lambda$18;
                        CompetitionMatchPagePreview$lambda$19$lambda$18 = CompetitionMatchPageKt.CompetitionMatchPagePreview$lambda$19$lambda$18(((Long) obj).longValue(), ((Long) obj2).longValue(), ((Integer) obj3).intValue());
                        return CompetitionMatchPagePreview$lambda$19$lambda$18;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function3 function3 = (Function3) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CompetitionMatchPagePreview$lambda$21$lambda$20;
                        CompetitionMatchPagePreview$lambda$21$lambda$20 = CompetitionMatchPageKt.CompetitionMatchPagePreview$lambda$21$lambda$20(((Long) obj).longValue());
                        return CompetitionMatchPagePreview$lambda$21$lambda$20;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            CompetitionMatchPage(null, competitionMatchWithBetsModel, emptyMap, emptyMap2, function3, (Function1) rememberedValue2, null, null, startRestartGroup, 224640, Opcodes.INSTANCEOF);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionMatchPagePreview$lambda$22;
                    CompetitionMatchPagePreview$lambda$22 = CompetitionMatchPageKt.CompetitionMatchPagePreview$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionMatchPagePreview$lambda$22;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionMatchPagePreview$lambda$19$lambda$18(long j, long j2, int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionMatchPagePreview$lambda$21$lambda$20(long j) {
        return Unit.INSTANCE;
    }

    public static final void CompetitionMatchHeaderPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1185514656);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185514656, i, -1, "org.betup.ui.fragment.competitions.details.compose.CompetitionMatchHeaderPreview (CompetitionMatchPage.kt:297)");
            }
            NewTeam newTeam = new NewTeam(789960, "", "Chivas +");
            CompetitionMatchWithBetsModel competitionMatchWithBetsModel = new CompetitionMatchWithBetsModel(new CompetitionMatchInfoModel(18838599L, new NewLeague(104138, "", "MLS+"), new NewTeam(789968, "", "Memphis +"), newTeam, new NewSport(22, "", "Football", null, null, false, 56, null), 0, 0, "2025-09-19T06:00:00.000+00:00", 1, null, null, null, null, 7776, null), null, CollectionsKt.emptyList(), 2, null);
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            CompetitionMatchHeader(competitionMatchWithBetsModel, null, startRestartGroup, 0, 2);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionMatchHeaderPreview$lambda$24;
                    CompetitionMatchHeaderPreview$lambda$24 = CompetitionMatchPageKt.CompetitionMatchHeaderPreview$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionMatchHeaderPreview$lambda$24;
                }
            });
        }
    }
}
