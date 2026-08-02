package org.betup.ui.fragment.matches.details.compose.tabs.statistics.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import com.google.logging.type.LogSeverity;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.matches.history.MatchHistoryType;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryCategoryUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryMatchUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryTeamUiItem;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HistoryCategoryItem.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052%\b\u0002\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"HistoryCategoryItem", "", "item", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", "modifier", "Landroidx/compose/ui/Modifier;", "onMatchClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "matchId", "(Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewHistoryCategoryItem", "(Landroidx/compose/runtime/Composer;I)V", "PreviewHistoryCategoryItemRecentGames", "PreviewHistoryCategoryItemEmpty", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HistoryCategoryItemKt {

    /* compiled from: HistoryCategoryItem.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchHistoryType.values().length];
            try {
                iArr[MatchHistoryType.PREVIOUS_MEETINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchHistoryType.RECENT_GAMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryCategoryItem$lambda$2(MatchHistoryCategoryUiItem matchHistoryCategoryUiItem, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        HistoryCategoryItem(matchHistoryCategoryUiItem, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewHistoryCategoryItem$lambda$3(int i, Composer composer, int i2) {
        PreviewHistoryCategoryItem(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewHistoryCategoryItemEmpty$lambda$5(int i, Composer composer, int i2) {
        PreviewHistoryCategoryItemEmpty(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewHistoryCategoryItemRecentGames$lambda$4(int i, Composer composer, int i2) {
        PreviewHistoryCategoryItemRecentGames(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryCategoryItem(final MatchHistoryCategoryUiItem item, Modifier modifier, Function1<? super Long, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super Long, Unit> function12;
        int i5;
        String stringResource;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier3;
        final Function1<? super Long, Unit> function13;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-1029184314);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    Function1<? super Long, Unit> function14 = i4 != 0 ? null : function12;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1029184314, i3, -1, "org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryItem (HistoryCategoryItem.kt:35)");
                    }
                    MatchHistoryType type = item.getType();
                    i5 = type != null ? WhenMappings.$EnumSwitchMapping$0[type.ordinal()] : -1;
                    if (i5 == 1) {
                        startRestartGroup.startReplaceGroup(-1203638160);
                        stringResource = StringResources_androidKt.stringResource(R.string.previous_meetings, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    } else if (i5 == 2) {
                        startRestartGroup.startReplaceGroup(1342033066);
                        String categoryTitle = item.getCategoryTitle();
                        if (Intrinsics.areEqual(categoryTitle, "last_matches")) {
                            startRestartGroup.startReplaceGroup(-1203630325);
                            stringResource = StringResources_androidKt.stringResource(R.string.last_matches, startRestartGroup, 6);
                            startRestartGroup.endReplaceGroup();
                        } else if (Intrinsics.areEqual(categoryTitle, "next_matches")) {
                            startRestartGroup.startReplaceGroup(1342245664);
                            stringResource = StringResources_androidKt.stringResource(R.string.next_matches, startRestartGroup, 6);
                            String categoryTitleAdditional = item.getCategoryTitleAdditional();
                            if (categoryTitleAdditional != null && categoryTitleAdditional.length() != 0) {
                                stringResource = stringResource + item.getCategoryTitleAdditional();
                            }
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1342583936);
                            stringResource = StringResources_androidKt.stringResource(R.string.recent_games, startRestartGroup, 6);
                            String categoryTitleAdditional2 = item.getCategoryTitleAdditional();
                            if (categoryTitleAdditional2 != null && categoryTitleAdditional2.length() != 0) {
                                stringResource = stringResource + item.getCategoryTitleAdditional();
                            }
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1203605549);
                        startRestartGroup.endReplaceGroup();
                        stringResource = item.getCategoryTitle();
                    }
                    float f = 4;
                    Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(modifier4, ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU);
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
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 6);
                    HistoryCategoryTitleKt.HistoryCategoryTitle(stringResource, null, startRestartGroup, 0, 2);
                    if (item.getMatches().isEmpty()) {
                        startRestartGroup.startReplaceGroup(845819199);
                        modifier3 = modifier4;
                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_matches_available, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(845543516);
                        Iterator<T> it = item.getMatches().iterator();
                        while (it.hasNext()) {
                            HistoryMatchItemKt.HistoryMatchItem((MatchHistoryMatchUiItem) it.next(), PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), function14, startRestartGroup, (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 48, 0);
                        }
                        startRestartGroup.endReplaceGroup();
                        modifier3 = modifier4;
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    function13 = function14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function13 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryItemKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit HistoryCategoryItem$lambda$2;
                            HistoryCategoryItem$lambda$2 = HistoryCategoryItemKt.HistoryCategoryItem$lambda$2(MatchHistoryCategoryUiItem.this, modifier5, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return HistoryCategoryItem$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i3 & Opcodes.I2S) == 146) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MatchHistoryType type2 = item.getType();
            if (type2 != null) {
            }
            if (i5 == 1) {
            }
            float f2 = 4;
            Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(modifier4, ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2)));
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 6);
            HistoryCategoryTitleKt.HistoryCategoryTitle(stringResource, null, startRestartGroup, 0, 2);
            if (item.getMatches().isEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
            function13 = function14;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        MatchHistoryType type22 = item.getType();
        if (type22 != null) {
        }
        if (i5 == 1) {
        }
        float f22 = 4;
        Modifier m1024backgroundbw27NRU22 = BackgroundKt.m1024backgroundbw27NRU(modifier4, ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22)));
        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
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
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 6);
        HistoryCategoryTitleKt.HistoryCategoryTitle(stringResource, null, startRestartGroup, 0, 2);
        if (item.getMatches().isEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        function13 = function14;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PreviewHistoryCategoryItem(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-546777192);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-546777192, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.PreviewHistoryCategoryItem (HistoryCategoryItem.kt:106)");
            }
            HistoryCategoryItem(new MatchHistoryCategoryUiItem(MatchHistoryType.PREVIOUS_MEETINGS, "", null, CollectionsKt.listOf((Object[]) new MatchHistoryMatchUiItem[]{new MatchHistoryMatchUiItem(new MatchHistoryTeamUiItem(1L, "https://example.com/team1.png", "Stade Brestois 29"), new MatchHistoryTeamUiItem(2L, "https://example.com/team2.png", "Paris Saint-Germain"), "2024-05-22T19:30:00Z", 0, 0, 123L), new MatchHistoryMatchUiItem(new MatchHistoryTeamUiItem(1L, "https://example.com/team1.png", "Stade Brestois 29"), new MatchHistoryTeamUiItem(2L, "https://example.com/team2.png", "Paris Saint-Germain"), "2024-01-12T20:00:00Z", 1, 0, 124L)})), PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), null, startRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewHistoryCategoryItem$lambda$3;
                    PreviewHistoryCategoryItem$lambda$3 = HistoryCategoryItemKt.PreviewHistoryCategoryItem$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewHistoryCategoryItem$lambda$3;
                }
            });
        }
    }

    public static final void PreviewHistoryCategoryItemRecentGames(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1088532024);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088532024, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.PreviewHistoryCategoryItemRecentGames (HistoryCategoryItem.kt:158)");
            }
            HistoryCategoryItem(new MatchHistoryCategoryUiItem(MatchHistoryType.RECENT_GAMES, "", " (Barcelona)", CollectionsKt.listOf(new MatchHistoryMatchUiItem(new MatchHistoryTeamUiItem(1L, "https://example.com/team1.png", "Barcelona"), new MatchHistoryTeamUiItem(2L, "https://example.com/team2.png", "Real Madrid"), "2024-05-22T19:30:00Z", 2, 1, 123L))), PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), null, startRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewHistoryCategoryItemRecentGames$lambda$4;
                    PreviewHistoryCategoryItemRecentGames$lambda$4 = HistoryCategoryItemKt.PreviewHistoryCategoryItemRecentGames$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewHistoryCategoryItemRecentGames$lambda$4;
                }
            });
        }
    }

    public static final void PreviewHistoryCategoryItemEmpty(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1661071105);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1661071105, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.PreviewHistoryCategoryItemEmpty (HistoryCategoryItem.kt:194)");
            }
            HistoryCategoryItem(new MatchHistoryCategoryUiItem(MatchHistoryType.RECENT_GAMES, "", " (Team Name)", CollectionsKt.emptyList()), PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), null, startRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewHistoryCategoryItemEmpty$lambda$5;
                    PreviewHistoryCategoryItemEmpty$lambda$5 = HistoryCategoryItemKt.PreviewHistoryCategoryItemEmpty$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewHistoryCategoryItemEmpty$lambda$5;
                }
            });
        }
    }
}
