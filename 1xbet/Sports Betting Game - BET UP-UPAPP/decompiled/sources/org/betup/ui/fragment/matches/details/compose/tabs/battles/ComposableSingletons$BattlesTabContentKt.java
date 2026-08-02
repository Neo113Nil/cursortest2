package org.betup.ui.fragment.matches.details.compose.tabs.battles;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: BattlesTabContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$BattlesTabContentKt {
    public static final ComposableSingletons$BattlesTabContentKt INSTANCE = new ComposableSingletons$BattlesTabContentKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$369941278 = ComposableLambdaKt.composableLambdaInstance(369941278, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.ComposableSingletons$BattlesTabContentKt$lambda$369941278$1
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
                ComposerKt.traceEventStart(369941278, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.ComposableSingletons$BattlesTabContentKt.lambda$369941278.<anonymous> (BattlesTabContent.kt:77)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(12));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = 16744408;
            DefaultConstructorMarker defaultConstructorMarker = null;
            FontStyle fontStyle = null;
            FontSynthesis fontSynthesis = null;
            String str = null;
            long j = 0;
            BaselineShift baselineShift = null;
            TextGeometricTransform textGeometricTransform = null;
            LocaleList localeList = null;
            long j2 = 0;
            TextDecoration textDecoration = null;
            Shadow shadow = null;
            DrawStyle drawStyle = null;
            int i3 = 0;
            long j3 = 0;
            TextIndent textIndent = null;
            PlatformTextStyle platformTextStyle = null;
            LineHeightStyle lineHeightStyle = null;
            int i4 = 0;
            int i5 = 0;
            TextMotion textMotion = null;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.user, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(500), fontStyle, fontSynthesis, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), str, j, baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, drawStyle, TextAlign.INSTANCE.m7658getCentere0LSkKk(), i3, j3, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion, i2, defaultConstructorMarker), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.bet, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(500), fontStyle, fontSynthesis, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), str, j, baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, drawStyle, TextAlign.INSTANCE.m7658getCentere0LSkKk(), i3, j3, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion, i2, defaultConstructorMarker), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.buy_in, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(500), fontStyle, fontSynthesis, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), str, j, baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, drawStyle, TextAlign.INSTANCE.m7658getCentere0LSkKk(), i3, j3, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion, i2, defaultConstructorMarker), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(60)), composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1971514097 = ComposableLambdaKt.composableLambdaInstance(1971514097, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.ComposableSingletons$BattlesTabContentKt$lambda$1971514097$1
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
                ComposerKt.traceEventStart(1971514097, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.ComposableSingletons$BattlesTabContentKt.lambda$1971514097.<anonymous> (BattlesTabContent.kt:177)");
            }
            LoadingViewKt.LoadingView(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(48)), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1971514097$app_release() {
        return lambda$1971514097;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$369941278$app_release() {
        return lambda$369941278;
    }
}
