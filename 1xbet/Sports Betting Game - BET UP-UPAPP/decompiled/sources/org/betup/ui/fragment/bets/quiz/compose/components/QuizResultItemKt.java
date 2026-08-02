package org.betup.ui.fragment.bets.quiz.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
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
import io.bidmachine.media3.extractor.WavUtil;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.betup.R;
import org.betup.model.remote.entity.quiz.QuizShortParticipationModel;
import org.betup.ui.common.compose.slider.ValueWithIconKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;

/* compiled from: QuizResultItem.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"QuizResultItem", "", "participation", "Lorg/betup/model/remote/entity/quiz/QuizShortParticipationModel;", "onClick", "Lkotlin/Function0;", "(Lorg/betup/model/remote/entity/quiz/QuizShortParticipationModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getTrophyDrawable", "", "tierName", "", "getQuizStateInfo", "Lorg/betup/ui/fragment/bets/quiz/compose/components/QuizStateDisplayInfo;", "state", "(ILandroidx/compose/runtime/Composer;I)Lorg/betup/ui/fragment/bets/quiz/compose/components/QuizStateDisplayInfo;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizResultItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuizResultItem$lambda$5(QuizShortParticipationModel quizShortParticipationModel, Function0 function0, int i, Composer composer, int i2) {
        QuizResultItem(quizShortParticipationModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void QuizResultItem(final QuizShortParticipationModel participation, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        String str;
        Composer composer2;
        Intrinsics.checkNotNullParameter(participation, "participation");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-57883048);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(participation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-57883048, i2, -1, "org.betup.ui.fragment.bets.quiz.compose.components.QuizResultItem (QuizResultItem.kt:44)");
            }
            int state = participation.getState();
            QuizStateDisplayInfo quizStateInfo = getQuizStateInfo(state, startRestartGroup, 0);
            int trophyDrawable = getTrophyDrawable(participation.getTier().getName());
            String createdAt = participation.getCreatedAt();
            String formattedDateWithYear = UiExtensionsKt.getFormattedDateWithYear(createdAt);
            String formattedTime = UiExtensionsKt.getFormattedTime(createdAt);
            String str2 = participation.getQuiz().getMatch().getHomeTeam().getName() + " - " + participation.getQuiz().getMatch().getAwayTeam().getName();
            if (state != 4) {
                str = state != 8 ? String.valueOf(participation.getMoneyPlaced()) : "-" + participation.getMoneyPlaced();
            } else {
                str = "+" + participation.getMoneyReturned();
            }
            String str3 = str;
            float f = 4;
            float f2 = 12;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(ClickableKt.m1059clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, onClick, 7, null), 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f2));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(trophyDrawable, startRestartGroup, 0), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(formattedTime + " | ", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            TextKt.m2642Text4IGK_g(formattedDateWithYear, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.quiz_odds_label, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(participation.getTotalCoefficient())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m2642Text4IGK_g(format, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, end, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor5);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(quizStateInfo.getStatusText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(quizStateInfo.m13518getStatusColor0d7_KjU(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2 = startRestartGroup;
            ValueWithIconKt.m12978ValueWithIconiJQMabo(str3, quizStateInfo.m13517getMoneyColor0d7_KjU(), composer2, 0, 0);
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
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.quiz.compose.components.QuizResultItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuizResultItem$lambda$5;
                    QuizResultItem$lambda$5 = QuizResultItemKt.QuizResultItem$lambda$5(QuizShortParticipationModel.this, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return QuizResultItem$lambda$5;
                }
            });
        }
    }

    private static final int getTrophyDrawable(String str) {
        String str2;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1380612710:
                return lowerCase.equals("bronze") ? R.drawable.bronze_cup_ranking : R.drawable.cup_new_gold;
            case -1240337143:
                str2 = "golden";
                break;
            case -902311155:
                return !lowerCase.equals("silver") ? R.drawable.cup_new_gold : R.drawable.silver_cup_ranking;
            case 3178592:
                str2 = "gold";
                break;
            default:
                return R.drawable.cup_new_gold;
        }
        lowerCase.equals(str2);
        return R.drawable.cup_new_gold;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuizStateDisplayInfo getQuizStateInfo(int i, Composer composer, int i2) {
        QuizStateDisplayInfo quizStateDisplayInfo;
        composer.startReplaceGroup(797538949);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(797538949, i2, -1, "org.betup.ui.fragment.bets.quiz.compose.components.getQuizStateInfo (QuizResultItem.kt:199)");
        }
        if (i != 1) {
            if (i == 2) {
                composer.startReplaceGroup(1930770899);
                String upperCase = StringResources_androidKt.stringResource(R.string.in_progress, composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                quizStateDisplayInfo = new QuizStateDisplayInfo(upperCase, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), null);
                composer.endReplaceGroup();
            } else if (i == 4) {
                composer.startReplaceGroup(1930755245);
                String upperCase2 = StringResources_androidKt.stringResource(R.string.won, composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                quizStateDisplayInfo = new QuizStateDisplayInfo(upperCase2, ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null);
                composer.endReplaceGroup();
            } else if (i == 8) {
                composer.startReplaceGroup(1930763114);
                String upperCase3 = StringResources_androidKt.stringResource(R.string.lost, composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                quizStateDisplayInfo = new QuizStateDisplayInfo(upperCase3, ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), null);
                composer.endReplaceGroup();
            } else if (i != 32) {
                composer.startReplaceGroup(1930787143);
                composer.endReplaceGroup();
                quizStateDisplayInfo = new QuizStateDisplayInfo("", ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return quizStateDisplayInfo;
        }
        composer.startReplaceGroup(1930779089);
        String upperCase4 = StringResources_androidKt.stringResource(R.string.cancelled, composer, 6).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
        quizStateDisplayInfo = new QuizStateDisplayInfo(upperCase4, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        return quizStateDisplayInfo;
    }
}
