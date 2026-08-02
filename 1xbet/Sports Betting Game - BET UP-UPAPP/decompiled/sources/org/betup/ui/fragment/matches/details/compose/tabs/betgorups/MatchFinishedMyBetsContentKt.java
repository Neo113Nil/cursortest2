package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.bets.BetGroupModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.details.MatchPlacedBetInfoModel;
import org.betup.model.remote.entity.matches.details.MatchPlacedBetModel;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattlesNoDataViewKt;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryItemKt;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryCategoryUiItem;
import org.betup.ui.fragment.user.compose.components.BattleStatsItemKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.DateHelper;
import org.betup.utils.OddHelper;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: MatchFinishedMyBetsContent.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¨\u0006\u001f"}, d2 = {"MatchFinishedMyBetsContent", "", "bets", "", "Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetInfoModel;", "isLoading", "", "oddType", "Lorg/betup/model/local/entity/OddType;", "onBetClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "betlistId", "upcomingCategories", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", "onUpcomingMatchClick", "matchId", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;ZLorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MatchMyBetItem", "bet", "onClick", "Lkotlin/Function0;", "(Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetInfoModel;Lorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "placedBetStrokeColor", "Landroidx/compose/ui/graphics/Color;", "state", "Lorg/betup/model/remote/entity/bets/BetState;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchFinishedMyBetsContentKt {

    /* compiled from: MatchFinishedMyBetsContent.kt */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchFinishedMyBetsContent$lambda$9(List list, boolean z, OddType oddType, Function1 function1, List list2, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchFinishedMyBetsContent(list, z, oddType, function1, list2, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchMyBetItem$lambda$17(MatchPlacedBetInfoModel matchPlacedBetInfoModel, OddType oddType, Function0 function0, int i, Composer composer, int i2) {
        MatchMyBetItem(matchPlacedBetInfoModel, oddType, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchFinishedMyBetsContent(final List<MatchPlacedBetInfoModel> bets, final boolean z, final OddType oddType, final Function1<? super Long, Unit> onBetClick, List<MatchHistoryCategoryUiItem> list, Function1<? super Long, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        List<MatchHistoryCategoryUiItem> list2;
        int i4;
        Function1<? super Long, Unit> function12;
        int i5;
        Modifier modifier2;
        Modifier modifier3;
        List<MatchHistoryCategoryUiItem> list3;
        Composer composer2;
        Composer composer3;
        final List<MatchHistoryCategoryUiItem> list4;
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Composer startRestartGroup = composer.startRestartGroup(1067519270);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bets) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onBetClick) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            list2 = list;
            i3 |= startRestartGroup.changedInstance(list2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
            }
            if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                List<MatchHistoryCategoryUiItem> emptyList = i6 == 0 ? CollectionsKt.emptyList() : list2;
                Function1<? super Long, Unit> function13 = i4 == 0 ? null : function12;
                Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1067519270, i3, -1, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContent (MatchFinishedMyBetsContent.kt:57)");
                }
                if (!z && bets.isEmpty()) {
                    startRestartGroup.startReplaceGroup(-1765848859);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 6, 28);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                } else if (!bets.isEmpty()) {
                    startRestartGroup.startReplaceGroup(-1765485973);
                    BattlesNoDataViewKt.BattlesNoDataView(StringResources_androidKt.stringResource(R.string.match_finished_no_my_bets, startRestartGroup, 6), null, startRestartGroup, 48, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1765232362);
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
                    float f = 12;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.match_finished_my_bets_title, startRestartGroup, 6), PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                    startRestartGroup.startReplaceGroup(-1224400529);
                    boolean changedInstance = startRestartGroup.changedInstance(bets) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(emptyList) | ((i3 & 458752) == 131072);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final List<MatchHistoryCategoryUiItem> list5 = emptyList;
                        modifier3 = companion;
                        list3 = emptyList;
                        composer2 = startRestartGroup;
                        final Function1<? super Long, Unit> function14 = function13;
                        Function1 function15 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6;
                                MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6 = MatchFinishedMyBetsContentKt.MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6(bets, list5, oddType, onBetClick, function14, (LazyListScope) obj);
                                return MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6;
                            }
                        };
                        composer2.updateRememberedValue(function15);
                        rememberedValue = function15;
                    } else {
                        modifier3 = companion;
                        list3 = emptyList;
                        composer2 = startRestartGroup;
                    }
                    Function1 function16 = (Function1) rememberedValue;
                    composer2.endReplaceGroup();
                    composer3 = composer2;
                    LazyDslKt.LazyColumn(m1518paddingVpY3zN4$default, null, null, false, m1397spacedBy0680j_4, null, null, false, null, function16, composer3, 24582, 494);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list4 = list3;
                    function12 = function13;
                }
                modifier3 = companion;
                list3 = emptyList;
                composer3 = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                list4 = list3;
                function12 = function13;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer3 = startRestartGroup;
                list4 = list2;
                modifier3 = modifier2;
            }
            ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
                final Function1<? super Long, Unit> function17 = function12;
                final Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MatchFinishedMyBetsContent$lambda$9;
                        MatchFinishedMyBetsContent$lambda$9 = MatchFinishedMyBetsContentKt.MatchFinishedMyBetsContent$lambda$9(bets, z, oddType, onBetClick, list4, function17, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return MatchFinishedMyBetsContent$lambda$9;
                    }
                });
                return;
            }
            return;
        }
        list2 = list;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!z) {
        }
        if (!bets.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6(final List list, final List list2, final OddType oddType, final Function1 function1, final Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function13 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$1;
                MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$1 = MatchFinishedMyBetsContentKt.MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$1((MatchPlacedBetInfoModel) obj);
                return MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$1;
            }
        };
        final MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$1 matchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MatchPlacedBetInfoModel matchPlacedBetInfoModel) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((MatchPlacedBetInfoModel) obj);
            }
        };
        LazyColumn.items(list.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$4
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
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final MatchPlacedBetInfoModel matchPlacedBetInfoModel = (MatchPlacedBetInfoModel) list.get(i);
                composer.startReplaceGroup(1693921945);
                OddType oddType2 = oddType;
                if (oddType2 == null) {
                    oddType2 = OddType.DECIMAL;
                }
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(function1) | composer.changedInstance(matchPlacedBetInfoModel);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function14 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$2$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function14.invoke(Long.valueOf(matchPlacedBetInfoModel.getBetlistId()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                MatchFinishedMyBetsContentKt.MatchMyBetItem(matchPlacedBetInfoModel, oddType2, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!list2.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$MatchFinishedMyBetsContentKt.INSTANCE.m14018getLambda$1317151393$app_release(), 3, null);
            final Function1 function14 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$4;
                    MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$4 = MatchFinishedMyBetsContentKt.MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$4((MatchHistoryCategoryUiItem) obj);
                    return MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$4;
                }
            };
            final MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$5 matchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$5 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(MatchHistoryCategoryUiItem matchHistoryCategoryUiItem) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((MatchHistoryCategoryUiItem) obj);
                }
            };
            LazyColumn.items(list2.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function1.this.invoke(list2.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function1.this.invoke(list2.get(i));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$$inlined$items$default$8
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
                    ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
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
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    MatchHistoryCategoryUiItem matchHistoryCategoryUiItem = (MatchHistoryCategoryUiItem) list2.get(i);
                    composer.startReplaceGroup(730651171);
                    HistoryCategoryItemKt.HistoryCategoryItem(matchHistoryCategoryUiItem, null, function12, composer, 0, 2);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$MatchFinishedMyBetsContentKt.INSTANCE.m14019getLambda$1451987686$app_release(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$1(MatchPlacedBetInfoModel bet) {
        Intrinsics.checkNotNullParameter(bet, "bet");
        long betlistId = bet.getBetlistId();
        MatchPlacedBetModel placedBet = bet.getPlacedBet();
        return betlistId + "_" + (placedBet != null ? Long.valueOf(placedBet.getId()) : null) + "_" + bet.getCreatedAt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object MatchFinishedMyBetsContent$lambda$8$lambda$7$lambda$6$lambda$4(MatchHistoryCategoryUiItem category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return category.getCategoryTitle() + "_" + category.getCategoryTitleAdditional();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchMyBetItem(final MatchPlacedBetInfoModel matchPlacedBetInfoModel, final OddType oddType, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        String str;
        String str2;
        Color placedBetStrokeColor;
        String stringResource;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        String str3;
        String str4;
        String str5;
        String str6;
        float f;
        int i3;
        Composer composer2;
        int i4;
        Composer composer3;
        Composer composer4;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        String str7;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        BetGroupModel betTypeGroup;
        Composer startRestartGroup = composer.startRestartGroup(-884593298);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(matchPlacedBetInfoModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(oddType.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-884593298, i2, -1, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchMyBetItem (MatchFinishedMyBetsContent.kt:137)");
            }
            MatchPlacedBetModel placedBet = matchPlacedBetInfoModel.getPlacedBet();
            BetState fromInt = BetState.fromInt(placedBet != null ? placedBet.getState() : 0);
            BetState fromInt2 = BetState.fromInt(matchPlacedBetInfoModel.getBetlistState());
            boolean z = matchPlacedBetInfoModel.getBetlistPlacedBetsCount() > 1;
            String betName = placedBet != null ? placedBet.getBetName() : null;
            String str8 = betName == null ? "" : betName;
            String betsGameType = placedBet != null ? placedBet.getBetsGameType() : null;
            if (betsGameType == null) {
                betsGameType = "";
            }
            String obj = StringsKt.trim((CharSequence) betsGameType).toString();
            String name = (placedBet == null || (betTypeGroup = placedBet.getBetTypeGroup()) == null) ? null : betTypeGroup.getName();
            if (name == null) {
                name = "";
            }
            String obj2 = StringsKt.trim((CharSequence) name).toString();
            String str9 = obj;
            if (!StringsKt.isBlank(str9) && !StringsKt.isBlank(obj2)) {
                obj = obj + ". " + obj2;
            } else if (StringsKt.isBlank(str9)) {
                str = obj2;
                double placedCoefficient = placedBet == null ? placedBet.getPlacedCoefficient() : 0.0d;
                String createdAt = matchPlacedBetInfoModel.getCreatedAt();
                str2 = createdAt != null ? "" : createdAt;
                float f2 = 4;
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2));
                Intrinsics.checkNotNull(fromInt);
                placedBetStrokeColor = placedBetStrokeColor(fromInt);
                if (!z) {
                    startRestartGroup.startReplaceGroup(1001345192);
                    stringResource = UiExtensionsKt.capitalizeFirstCharOnly(StringResources_androidKt.stringResource(R.string.multi_bet, startRestartGroup, 6));
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1001425761);
                    stringResource = StringResources_androidKt.stringResource(R.string.single_bet, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                }
                String str10 = stringResource;
                double d = placedCoefficient;
                RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(ClickAnimationModifierKt.subtleClickAnimation(Modifier.INSTANCE, function0, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ((i2 >> 3) & 112) | 196614, 0, 1006), 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor(), roundedCornerShape);
                if (placedBetStrokeColor == null) {
                    companion = BorderKt.m1036borderxT4_qwU(Modifier.INSTANCE, Dp.m7774constructorimpl(1), placedBetStrokeColor.m5178unboximpl(), roundedCornerShape);
                } else {
                    companion = Modifier.INSTANCE;
                }
                float f3 = 12;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU.then(companion), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f3));
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
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                if (!StringsKt.isBlank(str2)) {
                    str3 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                    str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    str5 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    str6 = "C101@5232L9:Row.kt#2w3rfo";
                    f = f3;
                    i3 = 12;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-132073133);
                    i4 = 6;
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(1)), composer2, 6);
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-132988470);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                    Composer m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl6, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    str3 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                    str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    f = f3;
                    i3 = 12;
                    str5 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    str6 = "C101@5232L9:Row.kt#2w3rfo";
                    TextKt.m2642Text4IGK_g(BattleStatsItemKt.getFormattedDateDDMMYYYY(str2) + " | ", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    String time = DateHelper.getTime(str2);
                    Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
                    TextKt.m2642Text4IGK_g(time, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    i4 = 6;
                }
                long sp = TextUnitKt.getSp(i3);
                FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(composer2, i4);
                FontWeight semiBold = FontWeight.INSTANCE.getSemiBold();
                Intrinsics.checkNotNull(fromInt2);
                Composer composer5 = composer2;
                TextKt.m2642Text4IGK_g(str10, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(UiExtensionsKt.getTextColor(fromInt2), sp, semiBold, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.startReplaceGroup(2089511149);
                if (StringsKt.isBlank(str)) {
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), composer5, 6);
                    TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
                    composer3 = composer5;
                    TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer3, 0, 3120, 55294);
                } else {
                    composer3 = composer5;
                }
                composer3.endReplaceGroup();
                composer4 = composer3;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer4, 6);
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str3);
                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer4, 48);
                String str11 = str4;
                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str11);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                String str12 = str5;
                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str12);
                if (!(composer4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (!composer4.getInserting()) {
                    composer4.createNode(constructor4);
                } else {
                    composer4.useNode();
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(composer4);
                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash4);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                String str13 = str6;
                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, str13);
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                composer4.startReplaceGroup(-1999345454);
                str7 = str8;
                if (StringsKt.isBlank(str7)) {
                    str7 = StringResources_androidKt.stringResource(R.string.drawer_my_bets, composer4, 6);
                }
                composer4.endReplaceGroup();
                TextKt.m2642Text4IGK_g(str7, RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 3120, 55292);
                float f4 = 8;
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer4, 6);
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(Modifier.INSTANCE, UiExtensionsKt.getTextColor(fromInt), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(6));
                ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str11);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN42);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str12);
                if (!(composer4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (!composer4.getInserting()) {
                    composer4.createNode(constructor5);
                } else {
                    composer4.useNode();
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(composer4);
                Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash5);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String format = OddHelper.format(oddType, d);
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                TextKt.m2642Text4IGK_g(format, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i3), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer4, 6);
                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str3);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer4, 48);
                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str11);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer4, companion3);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str12);
                if (!(composer4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (!composer4.getInserting()) {
                    composer4.createNode(constructor6);
                } else {
                    composer4.useNode();
                }
                m4610constructorimpl5 = Updater.m4610constructorimpl(composer4);
                Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash6);
                }
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, str13);
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(String.valueOf(matchPlacedBetInfoModel.getMoneyPlaced()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i3), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7663getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                startRestartGroup = composer4;
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_coin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
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
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            str = obj;
            if (placedBet == null) {
            }
            String createdAt2 = matchPlacedBetInfoModel.getCreatedAt();
            if (createdAt2 != null) {
            }
            float f22 = 4;
            RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22));
            Intrinsics.checkNotNull(fromInt);
            placedBetStrokeColor = placedBetStrokeColor(fromInt);
            if (!z) {
            }
            String str102 = stringResource;
            double d2 = placedCoefficient;
            RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
            Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(ClickAnimationModifierKt.subtleClickAnimation(Modifier.INSTANCE, function0, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ((i2 >> 3) & 112) | 196614, 0, 1006), 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor(), roundedCornerShape2);
            if (placedBetStrokeColor == null) {
            }
            float f32 = 12;
            Modifier m1517paddingVpY3zN43 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU2.then(companion), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f32));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN43);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash7);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically4, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
            if (!StringsKt.isBlank(str2)) {
            }
            long sp2 = TextUnitKt.getSp(i3);
            FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(composer2, i4);
            FontWeight semiBold2 = FontWeight.INSTANCE.getSemiBold();
            Intrinsics.checkNotNull(fromInt2);
            Composer composer52 = composer2;
            TextKt.m2642Text4IGK_g(str102, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(UiExtensionsKt.getTextColor(fromInt2), sp2, semiBold2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer52, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(composer52);
            composer52.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer52);
            ComposerKt.sourceInformationMarkerEnd(composer52);
            ComposerKt.sourceInformationMarkerEnd(composer52);
            composer52.startReplaceGroup(2089511149);
            if (StringsKt.isBlank(str)) {
            }
            composer3.endReplaceGroup();
            composer4 = composer3;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), composer4, 6);
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str3);
            MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, composer4, 48);
            String str112 = str4;
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str112);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap42 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
            String str122 = str5;
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str122);
            if (!(composer4.getApplier() instanceof Applier)) {
            }
            composer4.startReusableNode();
            if (!composer4.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(composer4);
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash42);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
            String str132 = str6;
            ComposerKt.sourceInformationMarkerStart(composer4, -407735110, str132);
            RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
            composer4.startReplaceGroup(-1999345454);
            str7 = str8;
            if (StringsKt.isBlank(str7)) {
            }
            composer4.endReplaceGroup();
            TextKt.m2642Text4IGK_g(str7, RowScope.weight$default(rowScopeInstance32, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 3120, 55292);
            float f42 = 8;
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), composer4, 6);
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(Modifier.INSTANCE, UiExtensionsKt.getTextColor(fromInt), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str112);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap52 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN422);
            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str122);
            if (!(composer4.getApplier() instanceof Applier)) {
            }
            composer4.startReusableNode();
            if (!composer4.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(composer4);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash52);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            String format2 = OddHelper.format(oddType, d2);
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            TextKt.m2642Text4IGK_g(format2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i3), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), composer4, 6);
            Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str3);
            Modifier.Companion companion32 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy42 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, composer4, 48);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str112);
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap62 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(composer4, companion32);
            Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str122);
            if (!(composer4.getApplier() instanceof Applier)) {
            }
            composer4.startReusableNode();
            if (!composer4.getInserting()) {
            }
            m4610constructorimpl5 = Updater.m4610constructorimpl(composer4);
            Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl5.getInserting()) {
            }
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash62);
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer4, -407735110, str132);
            RowScopeInstance rowScopeInstance42 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(String.valueOf(matchPlacedBetInfoModel.getMoneyPlaced()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i3), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7663getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            startRestartGroup = composer4;
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_coin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
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
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchFinishedMyBetsContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit MatchMyBetItem$lambda$17;
                    MatchMyBetItem$lambda$17 = MatchFinishedMyBetsContentKt.MatchMyBetItem$lambda$17(MatchPlacedBetInfoModel.this, oddType, function0, i, (Composer) obj3, ((Integer) obj4).intValue());
                    return MatchMyBetItem$lambda$17;
                }
            });
        }
    }

    private static final Color placedBetStrokeColor(BetState betState) {
        int i = WhenMappings.$EnumSwitchMapping$0[betState.ordinal()];
        if (i == 1) {
            return Color.m5158boximpl(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor());
        }
        if (i == 2) {
            return Color.m5158boximpl(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor());
        }
        if (i != 3) {
            return null;
        }
        return Color.m5158boximpl(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor());
    }
}
