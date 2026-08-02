package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.ui.common.compose.CommonButtonMatchBetKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.BetGroupsSortingUtils;
import org.betup.utils.OddHelper;

/* compiled from: BetGroupCard.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetGroupCardKt$BetGroupCard$1$3 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $betColumnSize;
    final /* synthetic */ List<MatchVarietyBetOptionModel> $bets;
    final /* synthetic */ Function1<Long, Double> $getDisplayCoefficientForBet;
    final /* synthetic */ String $groupName;
    final /* synthetic */ boolean $isInBattle;
    final /* synthetic */ boolean $isLocked;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onBetClick;
    final /* synthetic */ Set<Long> $selectedBetIds;
    final /* synthetic */ Integer $sportId;
    final /* synthetic */ Set<Long> $validatingBetIds;

    /* JADX WARN: Multi-variable type inference failed */
    BetGroupCardKt$BetGroupCard$1$3(List<MatchVarietyBetOptionModel> list, boolean z, String str, int i, Set<Long> set, Set<Long> set2, OddType oddType, boolean z2, Function2<? super Integer, ? super Integer, Unit> function2, Integer num, Function1<? super Long, Double> function1) {
        this.$bets = list;
        this.$isInBattle = z;
        this.$groupName = str;
        this.$betColumnSize = i;
        this.$selectedBetIds = set;
        this.$validatingBetIds = set2;
        this.$oddType = oddType;
        this.$isLocked = z2;
        this.$onBetClick = function2;
        this.$sportId = num;
        this.$getDisplayCoefficientForBet = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final double invoke$displayCoefficient(Function1<? super Long, Double> function1, MatchVarietyBetOptionModel matchVarietyBetOptionModel) {
        Double invoke;
        return (function1 == null || (invoke = function1.invoke(Long.valueOf(matchVarietyBetOptionModel.getGrabbedBetId()))) == null) ? matchVarietyBetOptionModel.getGrabbedCoefficient() : invoke.doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$6$lambda$5$lambda$3$lambda$2(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$24$lambda$23$lambda$21$lambda$20(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0392, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        TextLayoutResult m7212measurewNUYSr0;
        boolean z;
        Iterable<List> iterable;
        int i2;
        List<MatchVarietyBetOptionModel> list;
        Modifier weight$default;
        int i3;
        boolean z2;
        String str;
        String str2;
        String str3;
        int i4;
        boolean z3;
        String str4;
        String str5;
        OddType oddType;
        String str6;
        int i5;
        boolean z4;
        String str7;
        String str8;
        OddType oddType2;
        int i6;
        int i7;
        String str9;
        Set<Long> set;
        String str10;
        String str11;
        String str12;
        String str13;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        int i8 = (i & 6) == 0 ? i | (composer2.changed(BoxWithConstraints) ? 4 : 2) : i;
        if ((i8 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1043727155, i8, -1, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCard.<anonymous>.<anonymous> (BetGroupCard.kt:177)");
        }
        TextMeasurer rememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, composer2, 0, 1);
        float f = 24;
        float f2 = 8;
        float m7774constructorimpl = Dp.m7774constructorimpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() - Dp.m7774constructorimpl(f)) - Dp.m7774constructorimpl(f2)) / 2);
        composer2.startReplaceGroup(-2000540693);
        List<MatchVarietyBetOptionModel> list2 = this.$bets;
        int i9 = 6;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                m7212measurewNUYSr0 = rememberTextMeasurer.m7212measurewNUYSr0(((MatchVarietyBetOptionModel) it.next()).getBetName(), (r24 & 2) != 0 ? TextStyle.INSTANCE.getDefault() : new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, i9), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), (r24 & 4) != 0 ? TextOverflow.INSTANCE.m7709getClipgIe3tQ8() : 0, (r24 & 8) != 0, (r24 & 16) != 0 ? Integer.MAX_VALUE : 1, (r24 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (r24 & 64) != 0 ? rememberTextMeasurer.defaultLayoutDirection : null, (r24 & 128) != 0 ? rememberTextMeasurer.defaultDensity : null, (r24 & 256) != 0 ? rememberTextMeasurer.defaultFontFamilyResolver : null, (r24 & 512) != 0 ? false : false);
                float size = (int) (m7212measurewNUYSr0.getSize() >> 32);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = composer2.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (size > ((Density) consume).mo1167toPx0680j_4(Dp.m7774constructorimpl(m7774constructorimpl - Dp.m7774constructorimpl(f)))) {
                    z = true;
                    break;
                }
                i9 = 6;
            }
        }
        z = false;
        composer.endReplaceGroup();
        boolean z5 = this.$isInBattle || z || StringsKt.contains((CharSequence) this.$groupName, (CharSequence) "each half", true);
        String str14 = "C72@3468L9:Box.kt#2w3rfo";
        String str15 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
        String str16 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
        String str17 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
        if (this.$bets.size() == 3) {
            composer2.startReplaceGroup(-1885881873);
            if (this.$isInBattle) {
                composer2.startReplaceGroup(-1886038392);
                float f3 = 12;
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f3), 0.0f, Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3), 2, null);
                List<MatchVarietyBetOptionModel> list3 = this.$bets;
                Set<Long> set2 = this.$selectedBetIds;
                Set<Long> set3 = this.$validatingBetIds;
                OddType oddType3 = this.$oddType;
                boolean z6 = this.$isLocked;
                Function2<Integer, Integer, Unit> function2 = this.$onBetClick;
                boolean z7 = this.$isInBattle;
                Integer num = this.$sportId;
                Function1<Long, Double> function1 = this.$getDisplayCoefficientForBet;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Function2<Integer, Integer, Unit> function22 = function2;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default);
                boolean z8 = z6;
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function1<Long, Double> function12 = function1;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (z5) {
                    composer2.startReplaceGroup(-1140789045);
                    Iterator it2 = list3.iterator();
                    final int i10 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final MatchVarietyBetOptionModel matchVarietyBetOptionModel = (MatchVarietyBetOptionModel) next;
                        boolean contains = set2.contains(Long.valueOf(matchVarietyBetOptionModel.getGrabbedBetId()));
                        boolean contains2 = set3.contains(Long.valueOf(matchVarietyBetOptionModel.getGrabbedBetId()));
                        Iterator it3 = it2;
                        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 1, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str15);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str17);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str16);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str14);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        String betName = matchVarietyBetOptionModel.getBetName();
                        boolean z9 = !contains2;
                        Function1<Long, Double> function13 = function12;
                        String str18 = str17;
                        String format = OddHelper.format(oddType3 == null ? OddType.DECIMAL : oddType3, invoke$displayCoefficient(function13, matchVarietyBetOptionModel));
                        String str19 = format == null ? "" : format;
                        boolean z10 = z8 || !matchVarietyBetOptionModel.isAvailable();
                        composer2.startReplaceGroup(-1746271574);
                        final Function2<Integer, Integer, Unit> function23 = function22;
                        boolean changed = composer2.changed(function23) | composer2.changed(matchVarietyBetOptionModel) | composer2.changed(i10);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed) {
                            set = set3;
                        } else {
                            set = set3;
                        }
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$BetGroupCard$1$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$13$lambda$6$lambda$5$lambda$3$lambda$2;
                                invoke$lambda$13$lambda$6$lambda$5$lambda$3$lambda$2 = BetGroupCardKt$BetGroupCard$1$3.invoke$lambda$13$lambda$6$lambda$5$lambda$3$lambda$2(Function2.this, matchVarietyBetOptionModel, i10);
                                return invoke$lambda$13$lambda$6$lambda$5$lambda$3$lambda$2;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                        Function0 function0 = (Function0) rememberedValue;
                        String str20 = str14;
                        composer.endReplaceGroup();
                        Set<Long> set4 = set;
                        Set<Long> set5 = set2;
                        String str21 = str15;
                        OddType oddType4 = oddType3;
                        String str22 = str16;
                        boolean z11 = z8;
                        boolean z12 = z7;
                        Integer num2 = num;
                        CommonButtonMatchBetKt.CommonButtonMatchBet(fillMaxWidth$default, contains, betName, true, true, str19, z9, function0, null, false, z7, num2, false, z10, false, false, false, null, composer, 27654, 0, 250624);
                        composer2 = composer;
                        composer2.startReplaceGroup(2081072750);
                        if (contains2) {
                            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), 0.0f, Dp.m7774constructorimpl(10), 1, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str21);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str18);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            str11 = str22;
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str11);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
                            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            str13 = str20;
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str13);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            str12 = str18;
                            str10 = str21;
                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 6, 28);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                        } else {
                            str10 = str21;
                            str11 = str22;
                            str12 = str18;
                            str13 = str20;
                        }
                        composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        str14 = str13;
                        str17 = str12;
                        str16 = str11;
                        z8 = z11;
                        oddType3 = oddType4;
                        z7 = z12;
                        num = num2;
                        i10 = i11;
                        set2 = set5;
                        set3 = set4;
                        function22 = function23;
                        function12 = function13;
                        str15 = str10;
                        it2 = it3;
                    }
                    composer.endReplaceGroup();
                } else {
                    Set<Long> set6 = set3;
                    String str23 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    Set<Long> set7 = set2;
                    String str24 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                    String str25 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    Function2<Integer, Integer, Unit> function24 = function22;
                    Function1<Long, Double> function14 = function12;
                    Object obj = null;
                    int i12 = 1;
                    composer2.startReplaceGroup(-1138054597);
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 6);
                    int i13 = -1323940314;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str23);
                    ?? r6 = 0;
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str25);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer);
                    Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(310029187);
                    final int i14 = 0;
                    for (Object obj2 : list3) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final MatchVarietyBetOptionModel matchVarietyBetOptionModel2 = (MatchVarietyBetOptionModel) obj2;
                        boolean contains3 = set7.contains(Long.valueOf(matchVarietyBetOptionModel2.getGrabbedBetId()));
                        Set<Long> set8 = set6;
                        boolean contains4 = set8.contains(Long.valueOf(matchVarietyBetOptionModel2.getGrabbedBetId()));
                        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), i12, obj), 1.0f, false, 2, null);
                        String str26 = str24;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str26);
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r6);
                        ComposerKt.sourceInformationMarkerStart(composer2, i13, str23);
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, r6);
                        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, weight$default2);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str25);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer2.createNode(constructor5);
                        } else {
                            composer.useNode();
                        }
                        Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer);
                        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i12, obj);
                        String betName2 = matchVarietyBetOptionModel2.getBetName();
                        boolean z13 = !contains4;
                        if (oddType3 == null) {
                            oddType2 = OddType.DECIMAL;
                            str8 = str23;
                        } else {
                            str8 = str23;
                            oddType2 = oddType3;
                        }
                        Function1<Long, Double> function15 = function14;
                        String format2 = OddHelper.format(oddType2, invoke$displayCoefficient(function15, matchVarietyBetOptionModel2));
                        String str27 = format2 == null ? "" : format2;
                        if (z8 || !matchVarietyBetOptionModel2.isAvailable()) {
                            i6 = i12;
                            i7 = -1746271574;
                        } else {
                            i7 = -1746271574;
                            i6 = 0;
                        }
                        composer2.startReplaceGroup(i7);
                        final Function2<Integer, Integer, Unit> function25 = function24;
                        boolean changed2 = composer2.changed(function25) | composer2.changed(matchVarietyBetOptionModel2) | composer2.changed(i14);
                        Object rememberedValue2 = composer.rememberedValue();
                        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$BetGroupCard$1$3$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7;
                                    invoke$lambda$13$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7 = BetGroupCardKt$BetGroupCard$1$3.invoke$lambda$13$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7(Function2.this, matchVarietyBetOptionModel2, i14);
                                    return invoke$lambda$13$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        composer.endReplaceGroup();
                        Set<Long> set9 = set7;
                        String str28 = str25;
                        String str29 = str8;
                        CommonButtonMatchBetKt.CommonButtonMatchBet(fillMaxWidth$default3, contains3, betName2, true, true, str27, z13, (Function0) rememberedValue2, null, false, z7, num, false, i6, false, false, false, null, composer, 27654, 0, 250624);
                        composer2 = composer;
                        composer2.startReplaceGroup(1347642995);
                        if (contains4) {
                            obj = null;
                            i12 = 1;
                            Modifier m1518paddingVpY3zN4$default3 = PaddingKt.m1518paddingVpY3zN4$default(BackgroundKt.m1024backgroundbw27NRU(boxScopeInstance3.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), 0.0f, Dp.m7774constructorimpl(10), 1, null);
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str26);
                            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str29);
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default3);
                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                            str25 = str28;
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str25);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor6);
                            } else {
                                composer.useNode();
                            }
                            Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer);
                            Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                            str23 = str29;
                            str9 = str26;
                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 6, 28);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                        } else {
                            str9 = str26;
                            str25 = str28;
                            str23 = str29;
                            obj = null;
                            i12 = 1;
                        }
                        composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        i14 = i15;
                        function14 = function15;
                        function24 = function25;
                        set6 = set8;
                        set7 = set9;
                        str24 = str9;
                        r6 = 0;
                        i13 = -1323940314;
                    }
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                String str30 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                String str31 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                String str32 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                composer2.startReplaceGroup(-1879871252);
                if (z5) {
                    composer2.startReplaceGroup(-1879926432);
                    float f4 = 12;
                    Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f4), 0.0f, Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(f4), 2, null);
                    List<MatchVarietyBetOptionModel> list4 = this.$bets;
                    Set<Long> set10 = this.$selectedBetIds;
                    Set<Long> set11 = this.$validatingBetIds;
                    OddType oddType5 = this.$oddType;
                    boolean z14 = this.$isLocked;
                    final Function2<Integer, Integer, Unit> function26 = this.$onBetClick;
                    boolean z15 = this.$isInBattle;
                    Integer num3 = this.$sportId;
                    boolean z16 = z15;
                    Function1<Long, Double> function16 = this.$getDisplayCoefficientForBet;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str30);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                    Integer num4 = num3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str32);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer.useNode();
                    }
                    Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer);
                    Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-2093095954);
                    final int i16 = 0;
                    for (Object obj3 : list4) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final MatchVarietyBetOptionModel matchVarietyBetOptionModel3 = (MatchVarietyBetOptionModel) obj3;
                        boolean contains5 = set10.contains(Long.valueOf(matchVarietyBetOptionModel3.getGrabbedBetId()));
                        boolean contains6 = set11.contains(Long.valueOf(matchVarietyBetOptionModel3.getGrabbedBetId()));
                        Set<Long> set12 = set11;
                        Set<Long> set13 = set10;
                        Modifier m1518paddingVpY3zN4$default4 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 1, null);
                        String str33 = str31;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str33);
                        MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str30);
                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default4);
                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                        String str34 = str30;
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str32);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer2.createNode(constructor8);
                        } else {
                            composer.useNode();
                        }
                        Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer);
                        Updater.m4617setimpl(m4610constructorimpl8, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                        }
                        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        String betName3 = matchVarietyBetOptionModel3.getBetName();
                        boolean z17 = !contains6;
                        if (oddType5 == null) {
                            str6 = str33;
                            oddType = OddType.DECIMAL;
                        } else {
                            oddType = oddType5;
                            str6 = str33;
                        }
                        String format3 = OddHelper.format(oddType, invoke$displayCoefficient(function16, matchVarietyBetOptionModel3));
                        String str35 = format3 == null ? "" : format3;
                        if (z14 || !matchVarietyBetOptionModel3.isAvailable()) {
                            i5 = -1746271574;
                            z4 = true;
                        } else {
                            i5 = -1746271574;
                            z4 = false;
                        }
                        composer2.startReplaceGroup(i5);
                        boolean changed3 = composer2.changed(function26) | composer2.changed(matchVarietyBetOptionModel3) | composer2.changed(i16);
                        Object rememberedValue3 = composer.rememberedValue();
                        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$BetGroupCard$1$3$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14;
                                    invoke$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14 = BetGroupCardKt$BetGroupCard$1$3.invoke$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14(Function2.this, matchVarietyBetOptionModel3, i16);
                                    return invoke$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        Integer num5 = num4;
                        composer.endReplaceGroup();
                        Function1<Long, Double> function17 = function16;
                        boolean z18 = z16;
                        Function2<Integer, Integer, Unit> function27 = function26;
                        boolean z19 = z14;
                        OddType oddType6 = oddType5;
                        String str36 = str32;
                        String str37 = str6;
                        CommonButtonMatchBetKt.CommonButtonMatchBet(fillMaxWidth$default4, contains5, betName3, true, true, str35, z17, (Function0) rememberedValue3, null, false, z18, num5, false, z4, false, false, false, null, composer, 27654, 0, 250624);
                        composer2 = composer;
                        composer2.startReplaceGroup(364523347);
                        if (contains6) {
                            Modifier m1518paddingVpY3zN4$default5 = PaddingKt.m1518paddingVpY3zN4$default(BackgroundKt.m1024backgroundbw27NRU(boxScopeInstance5.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), 0.0f, Dp.m7774constructorimpl(10), 1, null);
                            Alignment center3 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str37);
                            MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str34);
                            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default5);
                            Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                            str32 = str36;
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str32);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor9);
                            } else {
                                composer.useNode();
                            }
                            Composer m4610constructorimpl9 = Updater.m4610constructorimpl(composer);
                            Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                            }
                            Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                            str30 = str34;
                            str7 = str37;
                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 6, 28);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                        } else {
                            str32 = str36;
                            str30 = str34;
                            str7 = str37;
                        }
                        composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        i16 = i17;
                        set10 = set13;
                        num4 = num5;
                        z16 = z18;
                        function16 = function17;
                        function26 = function27;
                        z14 = z19;
                        oddType5 = oddType6;
                        set11 = set12;
                        str31 = str7;
                    }
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                } else {
                    String str38 = str31;
                    composer2.startReplaceGroup(-1877011874);
                    float f5 = 12;
                    Modifier m1520paddingqDBjuR0$default3 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f5), 0.0f, Dp.m7774constructorimpl(f5), Dp.m7774constructorimpl(f5), 2, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                    List<MatchVarietyBetOptionModel> list5 = this.$bets;
                    Set<Long> set14 = this.$selectedBetIds;
                    Set<Long> set15 = this.$validatingBetIds;
                    OddType oddType7 = this.$oddType;
                    boolean z20 = this.$isLocked;
                    final Function2<Integer, Integer, Unit> function28 = this.$onBetClick;
                    boolean z21 = this.$isInBattle;
                    Integer num6 = this.$sportId;
                    Function1<Long, Double> function18 = this.$getDisplayCoefficientForBet;
                    boolean z22 = z21;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str30);
                    int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default3);
                    Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                    Integer num7 = num6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str32);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer2.createNode(constructor10);
                    } else {
                        composer.useNode();
                    }
                    Composer m4610constructorimpl10 = Updater.m4610constructorimpl(composer);
                    Updater.m4617setimpl(m4610constructorimpl10, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl10.getInserting() || !Intrinsics.areEqual(m4610constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                        m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                        m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                    }
                    Updater.m4617setimpl(m4610constructorimpl10, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(878842796);
                    final int i18 = 0;
                    for (Object obj4 : list5) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final MatchVarietyBetOptionModel matchVarietyBetOptionModel4 = (MatchVarietyBetOptionModel) obj4;
                        boolean contains7 = set14.contains(Long.valueOf(matchVarietyBetOptionModel4.getGrabbedBetId()));
                        boolean contains8 = set15.contains(Long.valueOf(matchVarietyBetOptionModel4.getGrabbedBetId()));
                        Set<Long> set16 = set14;
                        Set<Long> set17 = set15;
                        Modifier weight$default3 = RowScope.weight$default(rowScopeInstance2, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 1, null), 1.0f, false, 2, null);
                        String str39 = str38;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str39);
                        MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str30);
                        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(composer2, weight$default3);
                        Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
                        String str40 = str30;
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str32);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer2.createNode(constructor11);
                        } else {
                            composer.useNode();
                        }
                        Composer m4610constructorimpl11 = Updater.m4610constructorimpl(composer);
                        Updater.m4617setimpl(m4610constructorimpl11, maybeCachedBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl11, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl11.getInserting() || !Intrinsics.areEqual(m4610constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                            m4610constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                            m4610constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                        }
                        Updater.m4617setimpl(m4610constructorimpl11, materializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        String betName4 = matchVarietyBetOptionModel4.getBetName();
                        boolean z23 = !contains8;
                        String format4 = OddHelper.format(oddType7 == null ? OddType.DECIMAL : oddType7, invoke$displayCoefficient(function18, matchVarietyBetOptionModel4));
                        String str41 = format4 == null ? "" : format4;
                        if (z20 || !matchVarietyBetOptionModel4.isAvailable()) {
                            i4 = -1746271574;
                            z3 = true;
                        } else {
                            i4 = -1746271574;
                            z3 = false;
                        }
                        composer2.startReplaceGroup(i4);
                        boolean changed4 = composer2.changed(function28) | composer2.changed(matchVarietyBetOptionModel4) | composer2.changed(i18);
                        Object rememberedValue4 = composer.rememberedValue();
                        if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$BetGroupCard$1$3$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$25$lambda$24$lambda$23$lambda$21$lambda$20;
                                    invoke$lambda$25$lambda$24$lambda$23$lambda$21$lambda$20 = BetGroupCardKt$BetGroupCard$1$3.invoke$lambda$25$lambda$24$lambda$23$lambda$21$lambda$20(Function2.this, matchVarietyBetOptionModel4, i18);
                                    return invoke$lambda$25$lambda$24$lambda$23$lambda$21$lambda$20;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        boolean z24 = z22;
                        composer.endReplaceGroup();
                        Function2<Integer, Integer, Unit> function29 = function28;
                        boolean z25 = z20;
                        OddType oddType8 = oddType7;
                        String str42 = str32;
                        Function1<Long, Double> function19 = function18;
                        Integer num8 = num7;
                        CommonButtonMatchBetKt.CommonButtonMatchBet(fillMaxWidth$default5, contains7, betName4, true, true, str41, z23, (Function0) rememberedValue4, null, false, z24, num8, false, z3, false, false, false, null, composer, 27654, 0, 250624);
                        composer2 = composer;
                        composer2.startReplaceGroup(-1854818372);
                        if (contains8) {
                            Modifier m1518paddingVpY3zN4$default6 = PaddingKt.m1518paddingVpY3zN4$default(BackgroundKt.m1024backgroundbw27NRU(boxScopeInstance7.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), 0.0f, Dp.m7774constructorimpl(10), 1, null);
                            Alignment center4 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str39);
                            MeasurePolicy maybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str40);
                            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier12 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default6);
                            Function0<ComposeUiNode> constructor12 = ComposeUiNode.INSTANCE.getConstructor();
                            str32 = str42;
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str32);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor12);
                            } else {
                                composer.useNode();
                            }
                            Composer m4610constructorimpl12 = Updater.m4610constructorimpl(composer);
                            Updater.m4617setimpl(m4610constructorimpl12, maybeCachedBoxMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl12, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl12.getInserting() || !Intrinsics.areEqual(m4610constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                                m4610constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                                m4610constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                            }
                            Updater.m4617setimpl(m4610constructorimpl12, materializeModifier12, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                            str4 = str40;
                            str5 = str39;
                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 6, 28);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                        } else {
                            str32 = str42;
                            str4 = str40;
                            str5 = str39;
                        }
                        composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        str30 = str4;
                        set14 = set16;
                        num7 = num8;
                        z22 = z24;
                        function28 = function29;
                        i18 = i19;
                        z20 = z25;
                        oddType7 = oddType8;
                        set15 = set17;
                        function18 = function19;
                        str38 = str5;
                    }
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            String str43 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            String str44 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
            String str45 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            composer2.startReplaceGroup(-1873888004);
            int coerceAtLeast = z5 ? 1 : RangesKt.coerceAtLeast(this.$betColumnSize, 2);
            if (coerceAtLeast > 1) {
                iterable = BetGroupsSortingUtils.INSTANCE.toColumnMajorRows(this.$bets, coerceAtLeast);
            } else {
                List<MatchVarietyBetOptionModel> list6 = this.$bets;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList.add(CollectionsKt.listOf((MatchVarietyBetOptionModel) it4.next()));
                }
                iterable = arrayList;
            }
            float f6 = 12;
            Modifier m1520paddingqDBjuR0$default4 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f6), 0.0f, Dp.m7774constructorimpl(f6), Dp.m7774constructorimpl(f6), 2, null);
            List<MatchVarietyBetOptionModel> list7 = this.$bets;
            Set<Long> set18 = this.$selectedBetIds;
            Set<Long> set19 = this.$validatingBetIds;
            OddType oddType9 = this.$oddType;
            boolean z26 = this.$isLocked;
            Function2<Integer, Integer, Unit> function210 = this.$onBetClick;
            boolean z27 = this.$isInBattle;
            Integer num9 = this.$sportId;
            Function1<Long, Double> function110 = this.$getDisplayCoefficientForBet;
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Function2<Integer, Integer, Unit> function211 = function210;
            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str43);
            int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier13 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default4);
            boolean z28 = z26;
            Function0<ComposeUiNode> constructor13 = ComposeUiNode.INSTANCE.getConstructor();
            Function1<Long, Double> function111 = function110;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str45);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor13);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl13 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl13, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl13, currentCompositionLocalMap13, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash13 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl13.getInserting() || !Intrinsics.areEqual(m4610constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                m4610constructorimpl13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
                m4610constructorimpl13.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
            }
            Updater.m4617setimpl(m4610constructorimpl13, materializeModifier13, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-584895763);
            for (List list8 : iterable) {
                Modifier fillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                char c = 6;
                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str43);
                int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier14 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default6);
                Function0<ComposeUiNode> constructor14 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str45);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor14);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl14 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl14, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl14, currentCompositionLocalMap14, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash14 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl14.getInserting() || !Intrinsics.areEqual(m4610constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                    m4610constructorimpl14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
                    m4610constructorimpl14.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
                }
                Updater.m4617setimpl(m4610constructorimpl14, materializeModifier14, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-8857478);
                int i20 = 0;
                for (Object obj5 : list8) {
                    int i21 = i20 + 1;
                    if (i20 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final MatchVarietyBetOptionModel matchVarietyBetOptionModel5 = (MatchVarietyBetOptionModel) obj5;
                    final int indexOf = list7.indexOf(matchVarietyBetOptionModel5);
                    boolean contains9 = set18.contains(Long.valueOf(matchVarietyBetOptionModel5.getGrabbedBetId()));
                    boolean contains10 = set19.contains(Long.valueOf(matchVarietyBetOptionModel5.getGrabbedBetId()));
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (coerceAtLeast == 1) {
                        list = list7;
                        weight$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    } else {
                        list = list7;
                        weight$default = RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null);
                    }
                    Modifier m1518paddingVpY3zN4$default7 = PaddingKt.m1518paddingVpY3zN4$default(companion.then(weight$default), 0.0f, Dp.m7774constructorimpl(4), 1, null);
                    String str46 = str44;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str46);
                    MeasurePolicy maybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str43);
                    int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap15 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier15 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default7);
                    Function0<ComposeUiNode> constructor15 = ComposeUiNode.INSTANCE.getConstructor();
                    Set<Long> set20 = set18;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str45);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer2.createNode(constructor15);
                    } else {
                        composer.useNode();
                    }
                    Composer m4610constructorimpl15 = Updater.m4610constructorimpl(composer);
                    Updater.m4617setimpl(m4610constructorimpl15, maybeCachedBoxMeasurePolicy9, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl15, currentCompositionLocalMap15, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl15.getInserting() || !Intrinsics.areEqual(m4610constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                        m4610constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                        m4610constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                    }
                    Updater.m4617setimpl(m4610constructorimpl15, materializeModifier15, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default7 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String betName5 = matchVarietyBetOptionModel5.getBetName();
                    Function1<Long, Double> function112 = function111;
                    Set<Long> set21 = set19;
                    String format5 = OddHelper.format(oddType9 == null ? OddType.DECIMAL : oddType9, invoke$displayCoefficient(function112, matchVarietyBetOptionModel5));
                    String str47 = format5 == null ? "" : format5;
                    boolean z29 = !contains10;
                    if (z28 || !matchVarietyBetOptionModel5.isAvailable()) {
                        i3 = -1746271574;
                        z2 = true;
                    } else {
                        i3 = -1746271574;
                        z2 = false;
                    }
                    composer2.startReplaceGroup(i3);
                    final Function2<Integer, Integer, Unit> function212 = function211;
                    boolean changed5 = composer2.changed(function212) | composer2.changed(matchVarietyBetOptionModel5) | composer2.changed(indexOf);
                    Object rememberedValue5 = composer.rememberedValue();
                    if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$BetGroupCard$1$3$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$34$lambda$33$lambda$32$lambda$31$lambda$30$lambda$28$lambda$27;
                                invoke$lambda$34$lambda$33$lambda$32$lambda$31$lambda$30$lambda$28$lambda$27 = BetGroupCardKt$BetGroupCard$1$3.invoke$lambda$34$lambda$33$lambda$32$lambda$31$lambda$30$lambda$28$lambda$27(Function2.this, matchVarietyBetOptionModel5, indexOf);
                                return invoke$lambda$34$lambda$33$lambda$32$lambda$31$lambda$30$lambda$28$lambda$27;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer.endReplaceGroup();
                    boolean z30 = z28;
                    OddType oddType10 = oddType9;
                    String str48 = str45;
                    boolean z31 = z27;
                    Integer num10 = num9;
                    int i22 = coerceAtLeast;
                    String str49 = str43;
                    CommonButtonMatchBetKt.CommonButtonMatchBet(fillMaxWidth$default7, contains9, betName5, true, true, str47, z29, (Function0) rememberedValue5, null, false, z31, num10, false, z2, false, false, false, null, composer, 27654, 0, 250624);
                    composer.startReplaceGroup(1500994078);
                    if (contains10) {
                        Modifier m1518paddingVpY3zN4$default8 = PaddingKt.m1518paddingVpY3zN4$default(BackgroundKt.m1024backgroundbw27NRU(boxScopeInstance9.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), 0.0f, Dp.m7774constructorimpl(10), 1, null);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer, 733328855, str46);
                        MeasurePolicy maybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(center5, false);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str49);
                        int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier16 = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default8);
                        Function0<ComposeUiNode> constructor16 = ComposeUiNode.INSTANCE.getConstructor();
                        str = str48;
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor16);
                        } else {
                            composer.useNode();
                        }
                        Composer m4610constructorimpl16 = Updater.m4610constructorimpl(composer);
                        Updater.m4617setimpl(m4610constructorimpl16, maybeCachedBoxMeasurePolicy10, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl16, currentCompositionLocalMap16, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash16 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl16.getInserting() || !Intrinsics.areEqual(m4610constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
                            m4610constructorimpl16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
                            m4610constructorimpl16.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
                        }
                        Updater.m4617setimpl(m4610constructorimpl16, materializeModifier16, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                        str3 = str49;
                        str2 = str46;
                        ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 6, 28);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                    } else {
                        str = str48;
                        str2 = str46;
                        str3 = str49;
                    }
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer2 = composer;
                    str45 = str;
                    str44 = str2;
                    str43 = str3;
                    i20 = i21;
                    list7 = list;
                    function211 = function212;
                    z28 = z30;
                    oddType9 = oddType10;
                    set19 = set21;
                    set18 = set20;
                    c = 6;
                    z27 = z31;
                    num9 = num10;
                    function111 = function112;
                    coerceAtLeast = i22;
                }
                List<MatchVarietyBetOptionModel> list9 = list7;
                OddType oddType11 = oddType9;
                int i23 = coerceAtLeast;
                Set<Long> set22 = set19;
                Set<Long> set23 = set18;
                String str50 = str43;
                String str51 = str45;
                Composer composer3 = composer2;
                boolean z32 = z27;
                Integer num11 = num9;
                Function2<Integer, Integer, Unit> function213 = function211;
                Function1<Long, Double> function113 = function111;
                boolean z33 = z28;
                String str52 = str44;
                composer.endReplaceGroup();
                composer3.startReplaceGroup(-8769300);
                if (list8.size() == 1) {
                    i2 = i23;
                    if (i2 > 1) {
                        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                    }
                } else {
                    i2 = i23;
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                coerceAtLeast = i2;
                composer2 = composer3;
                str45 = str51;
                str44 = str52;
                str43 = str50;
                list7 = list9;
                function211 = function213;
                z28 = z33;
                oddType9 = oddType11;
                set19 = set22;
                set18 = set23;
                z27 = z32;
                num9 = num11;
                function111 = function113;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$34$lambda$33$lambda$32$lambda$31$lambda$30$lambda$28$lambda$27(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
