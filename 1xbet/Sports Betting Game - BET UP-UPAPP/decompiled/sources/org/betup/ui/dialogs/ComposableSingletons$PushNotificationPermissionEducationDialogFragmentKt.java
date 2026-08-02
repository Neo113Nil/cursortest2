package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: PushNotificationPermissionEducationDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$PushNotificationPermissionEducationDialogFragmentKt {
    public static final ComposableSingletons$PushNotificationPermissionEducationDialogFragmentKt INSTANCE = new ComposableSingletons$PushNotificationPermissionEducationDialogFragmentKt();
    private static Function2<Composer, Integer, Unit> lambda$1102557938 = ComposableLambdaKt.composableLambdaInstance(1102557938, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$PushNotificationPermissionEducationDialogFragmentKt$lambda$1102557938$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1102557938, i, -1, "org.betup.ui.dialogs.ComposableSingletons$PushNotificationPermissionEducationDialogFragmentKt.lambda$1102557938.<anonymous> (PushNotificationPermissionEducationDialogFragment.kt:96)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.push_permission_title, composer, 6), null, null, false, false, false, false, composer, 0, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$351008785 = ComposableLambdaKt.composableLambdaInstance(351008785, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$PushNotificationPermissionEducationDialogFragmentKt$lambda$351008785$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(351008785, i, -1, "org.betup.ui.dialogs.ComposableSingletons$PushNotificationPermissionEducationDialogFragmentKt.lambda$351008785.<anonymous> (PushNotificationPermissionEducationDialogFragment.kt:101)");
            }
            float f = 20;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
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
            int i2 = 0;
            int i3 = 0;
            long j3 = 0;
            TextIndent textIndent = null;
            PlatformTextStyle platformTextStyle = null;
            LineHeightStyle lineHeightStyle = null;
            int i4 = 0;
            int i5 = 0;
            TextMotion textMotion = null;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.push_permission_subtitle, composer, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getMedium(), fontStyle, fontSynthesis, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), str, j, baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, drawStyle, i2, i3, j3, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion, 16777176, defaultConstructorMarker), composer, 48, 0, 65532);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer, 6);
            int i6 = 16777180;
            FontWeight fontWeight = null;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.push_permission_item_live_updates, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(15), fontWeight, fontStyle, fontSynthesis, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), str, j, baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, drawStyle, i2, i3, j3, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion, i6, defaultConstructorMarker), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            float f2 = 10;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer, 6);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.push_permission_item_bet_results, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(15), fontWeight, fontStyle, fontSynthesis, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), str, j, baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, drawStyle, i2, i3, j3, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion, i6, defaultConstructorMarker), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer, 6);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.push_permission_item_personalized, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(15), fontWeight, fontStyle, fontSynthesis, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), str, j, baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, drawStyle, i2, i3, j3, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion, i6, defaultConstructorMarker), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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

    public final Function2<Composer, Integer, Unit> getLambda$1102557938$app_release() {
        return lambda$1102557938;
    }

    public final Function2<Composer, Integer, Unit> getLambda$351008785$app_release() {
        return lambda$351008785;
    }
}
