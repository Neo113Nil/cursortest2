package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetDimens;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetDimensKt;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetScreenPreviews;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: StakeInputField.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"StakeInputField", "", "amount", "", "onAmountChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(JLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewStakeInputField", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StakeInputFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewStakeInputField$lambda$13(int i, Composer composer, int i2) {
        PreviewStakeInputField(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StakeInputField$lambda$12(long j, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StakeInputField(j, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StakeInputField(final long j, final Function1<? super Long, Unit> onAmountChange, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier3;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Object rememberedValue;
        Object rememberedValue2;
        boolean z;
        Object rememberedValue3;
        boolean changed;
        DefaultConstructorMarker defaultConstructorMarker;
        Object obj;
        boolean changed2;
        Object rememberedValue4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onAmountChange, "onAmountChange");
        Composer startRestartGroup = composer.startRestartGroup(604038841);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onAmountChange) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if ((i4 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(604038841, i4, -1, "org.betup.ui.fragment.bets.sheet.compose.items.StakeInputField (StakeInputField.kt:48)");
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                modifier3 = modifier4;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.quick_bet_stake, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), QuickBetDimens.INSTANCE.m13581getStakeLabelFontSizeXSAIIZE(), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13582getStakeLabelSpacingD9Ej5fM()), startRestartGroup, 6);
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1036borderxT4_qwU(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(QuickBetDimens.INSTANCE.m13577getStakeFieldCornerRadiusD9Ej5fM())), Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(QuickBetDimens.INSTANCE.m13577getStakeFieldCornerRadiusD9Ej5fM())), QuickBetDimens.INSTANCE.m13578getStakeFieldHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13579getStakeFieldVerticalPaddingD9Ej5fM());
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13574getStakeCoinSizeD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13575getStakeCoinSpacingD9Ej5fM()), startRestartGroup, 6);
                Object[] objArr = new Object[0];
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.StakeInputFieldKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            String StakeInputField$lambda$11$lambda$10$lambda$1$lambda$0;
                            StakeInputField$lambda$11$lambda$10$lambda$1$lambda$0 = StakeInputFieldKt.StakeInputField$lambda$11$lambda$10$lambda$1$lambda$0((SaverScope) obj2, (TextFieldValue) obj3);
                            return StakeInputField$lambda$11$lambda$10$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Function2 function2 = (Function2) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.StakeInputFieldKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            TextFieldValue StakeInputField$lambda$11$lambda$10$lambda$3$lambda$2;
                            StakeInputField$lambda$11$lambda$10$lambda$3$lambda$2 = StakeInputFieldKt.StakeInputField$lambda$11$lambda$10$lambda$3$lambda$2((String) obj2);
                            return StakeInputField$lambda$11$lambda$10$lambda$3$lambda$2;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                Saver Saver = SaverKt.Saver(function2, (Function1) rememberedValue2);
                startRestartGroup.startReplaceGroup(5004770);
                int i6 = i4 & 14;
                z = i6 != 4;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.StakeInputFieldKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4;
                            StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4 = StakeInputFieldKt.StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4(j);
                            return StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, Saver, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 4);
                Long valueOf = Long.valueOf(j);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed = startRestartGroup.changed(rememberSaveable) | (i6 != 4);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    defaultConstructorMarker = null;
                    obj = (Function2) new StakeInputFieldKt$StakeInputField$1$1$1$1(j, rememberSaveable, null);
                    startRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue5;
                    defaultConstructorMarker = null;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, i6);
                TextFieldValue textFieldValue = (TextFieldValue) rememberSaveable.getValue();
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m7474getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
                SolidColor solidColor = new SolidColor(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), defaultConstructorMarker);
                TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), QuickBetDimens.INSTANCE.m13580getStakeInputFontSizeXSAIIZE(), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed2 = startRestartGroup.changed(rememberSaveable) | ((i4 & 112) != 32);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.StakeInputFieldKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8;
                            StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8 = StakeInputFieldKt.StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8(MutableState.this, onAmountChange, (TextFieldValue) obj2);
                            return StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) rememberedValue4, fillMaxWidth$default2, false, false, textStyle, keyboardOptions, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, startRestartGroup, 102236544, 0, 48792);
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
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.StakeInputFieldKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit StakeInputField$lambda$12;
                        StakeInputField$lambda$12 = StakeInputFieldKt.StakeInputField$lambda$12(j, onAmountChange, modifier5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return StakeInputField$lambda$12;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & Opcodes.I2S) == 146) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        modifier3 = modifier4;
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.quick_bet_stake, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), QuickBetDimens.INSTANCE.m13581getStakeLabelFontSizeXSAIIZE(), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13582getStakeLabelSpacingD9Ej5fM()), startRestartGroup, 6);
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1036borderxT4_qwU(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(QuickBetDimens.INSTANCE.m13577getStakeFieldCornerRadiusD9Ej5fM())), Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(QuickBetDimens.INSTANCE.m13577getStakeFieldCornerRadiusD9Ej5fM())), QuickBetDimens.INSTANCE.m13578getStakeFieldHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13579getStakeFieldVerticalPaddingD9Ej5fM());
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13574getStakeCoinSizeD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13575getStakeCoinSpacingD9Ej5fM()), startRestartGroup, 6);
        Object[] objArr2 = new Object[0];
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        Function2 function22 = (Function2) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Saver Saver2 = SaverKt.Saver(function22, (Function1) rememberedValue2);
        startRestartGroup.startReplaceGroup(5004770);
        int i62 = i4 & 14;
        if (i62 != 4) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.StakeInputFieldKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4;
                StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4 = StakeInputFieldKt.StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4(j);
                return StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        final MutableState rememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, Saver2, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 4);
        Long valueOf2 = Long.valueOf(j);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(rememberSaveable2) | (i62 != 4);
        Object rememberedValue52 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        defaultConstructorMarker = null;
        obj = (Function2) new StakeInputFieldKt$StakeInputField$1$1$1$1(j, rememberSaveable2, null);
        startRestartGroup.updateRememberedValue(obj);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, i62);
        TextFieldValue textFieldValue2 = (TextFieldValue) rememberSaveable2.getValue();
        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m7474getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
        SolidColor solidColor2 = new SolidColor(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), defaultConstructorMarker);
        TextStyle textStyle2 = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), QuickBetDimens.INSTANCE.m13580getStakeInputFontSizeXSAIIZE(), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed2 = startRestartGroup.changed(rememberSaveable2) | ((i4 & 112) != 32);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.StakeInputFieldKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8;
                StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8 = StakeInputFieldKt.StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8(MutableState.this, onAmountChange, (TextFieldValue) obj2);
                return StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        BasicTextFieldKt.BasicTextField(textFieldValue2, (Function1<? super TextFieldValue, Unit>) rememberedValue4, fillMaxWidth$default22, false, false, textStyle2, keyboardOptions2, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, startRestartGroup, 102236544, 0, 48792);
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String StakeInputField$lambda$11$lambda$10$lambda$1$lambda$0(SaverScope Saver, TextFieldValue it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue StakeInputField$lambda$11$lambda$10$lambda$3$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextFieldValue(it, TextRangeKt.TextRange(it.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState StakeInputField$lambda$11$lambda$10$lambda$5$lambda$4(long j) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(String.valueOf(j), TextRangeKt.TextRange(String.valueOf(j).length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StakeInputField$lambda$11$lambda$10$lambda$9$lambda$8(MutableState mutableState, Function1 function1, TextFieldValue tfv) {
        Intrinsics.checkNotNullParameter(tfv, "tfv");
        String text = tfv.getText();
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char charAt = text.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        mutableState.setValue(new TextFieldValue(sb2, TextRangeKt.TextRange(sb2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        Long longOrNull = StringsKt.toLongOrNull(sb2);
        function1.invoke(Long.valueOf(longOrNull != null ? longOrNull.longValue() : 0L));
        return Unit.INSTANCE;
    }

    @QuickBetScreenPreviews
    private static final void PreviewStakeInputField(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-307293885);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-307293885, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.PreviewStakeInputField (StakeInputField.kt:134)");
            }
            QuickBetDimensKt.QuickBetProportionalScale(ComposableSingletons$StakeInputFieldKt.INSTANCE.m13602getLambda$1613183207$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.StakeInputFieldKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewStakeInputField$lambda$13;
                    PreviewStakeInputField$lambda$13 = StakeInputFieldKt.PreviewStakeInputField$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewStakeInputField$lambda$13;
                }
            });
        }
    }
}
