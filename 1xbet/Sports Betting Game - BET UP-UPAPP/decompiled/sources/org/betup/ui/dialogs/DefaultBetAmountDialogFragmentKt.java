package org.betup.ui.dialogs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.text.input.TextFieldValue;
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
import com.explorestack.protobuf.openrtb.LossReason;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;

/* compiled from: DefaultBetAmountDialogFragment.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\u001a\u0099\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0003¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0003¢\u0006\u0002\u0010\u0019\u001aE\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\rH\u0003¢\u0006\u0002\u0010\u001f\u001a)\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\rH\u0003¢\u0006\u0002\u0010\"\u001a5\u0010#\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u008e\u0002"}, d2 = {"MIN_DEFAULT_BET_AMOUNT", "", "DefaultBetAmountDialogContent", "", "isMinimumSelected", "", "customAmount", "customAmountInput", "", "onMinimumSelected", "Lkotlin/Function0;", "onCustomSelected", "onCustomAmountChanged", "Lkotlin/Function1;", "onCustomAmountInputChanged", "onPresetClick", "onDismiss", "onSave", "(ZJLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DefaultAmountOption", "modifier", "Landroidx/compose/ui/Modifier;", "label", "selected", "onClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DefaultAmountField", "amount", "amountInput", "onAmountChange", "onAmountInputChange", "(JLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DefaultAmountPresetRow", "selectedAmount", "(JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DefaultAmountPresetButton", "text", "isSelected", "app_release", "textState", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultBetAmountDialogFragmentKt {
    private static final long MIN_DEFAULT_BET_AMOUNT = 100;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultAmountField$lambda$12(long j, String str, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        DefaultAmountField(j, str, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultAmountOption$lambda$3(Modifier modifier, String str, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        DefaultAmountOption(modifier, str, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultAmountPresetButton$lambda$18(Modifier modifier, String str, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        DefaultAmountPresetButton(modifier, str, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultAmountPresetRow$lambda$16(long j, Function1 function1, int i, Composer composer, int i2) {
        DefaultAmountPresetRow(j, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultBetAmountDialogContent$lambda$1(boolean z, long j, String str, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function0 function03, Function0 function04, int i, Composer composer, int i2) {
        DefaultBetAmountDialogContent(z, j, str, function0, function02, function1, function12, function13, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultBetAmountDialogContent(final boolean z, final long j, final String str, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super Long, Unit> function1, final Function1<? super String, Unit> function12, final Function1<? super Long, Unit> function13, final Function0<Unit> function03, final Function0<Unit> function04, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(608320270);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(608320270, i2, -1, "org.betup.ui.dialogs.DefaultBetAmountDialogContent (DefaultBetAmountDialogFragment.kt:148)");
            }
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(18), Dp.m7774constructorimpl(28));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), function03, null, null, false, false, false, startRestartGroup, ((i2 >> 21) & 112) | 24576, 108);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TicketDarkKt.TicketDark(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableSingletons$DefaultBetAmountDialogFragmentKt.INSTANCE.getLambda$669260712$app_release(), ComposableLambdaKt.rememberComposableLambda(1153897543, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.DefaultBetAmountDialogFragmentKt$DefaultBetAmountDialogContent$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1153897543, i3, -1, "org.betup.ui.dialogs.DefaultBetAmountDialogContent.<anonymous>.<anonymous> (DefaultBetAmountDialogFragment.kt:171)");
                    }
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(14));
                    boolean z2 = z;
                    long j2 = j;
                    String str2 = str;
                    Function1<Long, Unit> function14 = function1;
                    Function1<String, Unit> function15 = function12;
                    Function1<Long, Unit> function16 = function13;
                    Function0<Unit> function05 = function0;
                    Function0<Unit> function06 = function02;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN42);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.default_bet_amount_description, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    float f = 12;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer3, 6);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    float f2 = 8;
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer3, 6);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    DefaultBetAmountDialogFragmentKt.DefaultAmountOption(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), StringResources_androidKt.stringResource(R.string.default_bet_amount_minimum_option, composer3, 6), z2, function05, composer3, 0, 0);
                    DefaultBetAmountDialogFragmentKt.DefaultAmountOption(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), StringResources_androidKt.stringResource(R.string.default_bet_amount_custom_option, composer3, 6), !z2, function06, composer3, 0, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer3, 6);
                    composer3.startReplaceGroup(602712781);
                    if (!z2) {
                        DefaultBetAmountDialogFragmentKt.DefaultAmountField(j2, str2, function14, function15, composer3, 0);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), composer3, 6);
                        DefaultBetAmountDialogFragmentKt.DefaultAmountPresetRow(j2, function16, composer3, 0);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer3, 6);
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.default_bet_amount_minimum_hint, new Object[]{100L}, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1638534374, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.DefaultBetAmountDialogFragmentKt$DefaultBetAmountDialogContent$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1638534374, i3, -1, "org.betup.ui.dialogs.DefaultBetAmountDialogContent.<anonymous>.<anonymous> (DefaultBetAmountDialogFragment.kt:238)");
                    }
                    CommonButtonKt.m12915CommonButtonUPEs2M4(PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(20), Dp.m7774constructorimpl(16)), false, StringResources_androidKt.stringResource(R.string.save_changes, composer3, 6), false, false, false, function04, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 805306374, 0, 0, 2096570);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), false, true, null, false, composer2, 200118, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.DefaultBetAmountDialogFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DefaultBetAmountDialogContent$lambda$1;
                    DefaultBetAmountDialogContent$lambda$1 = DefaultBetAmountDialogFragmentKt.DefaultBetAmountDialogContent$lambda$1(z, j, str, function0, function02, function1, function12, function13, function03, function04, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DefaultBetAmountDialogContent$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DefaultAmountOption(Modifier modifier, final String str, final boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier.Companion companion;
        Brush brush;
        long j;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        long j2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-548750641);
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
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-548750641, i3, -1, "org.betup.ui.dialogs.DefaultAmountOption (DefaultBetAmountDialogFragment.kt:258)");
                }
                if (!z) {
                    brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
                } else {
                    brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGray.INSTANCE.getBrush();
                }
                Brush brush2 = brush;
                float f = 10;
                Modifier background$default = BackgroundKt.background$default(companion, brush2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null);
                float m7774constructorimpl = Dp.m7774constructorimpl(1);
                if (!z) {
                    j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                } else {
                    j = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
                }
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BorderKt.m1036borderxT4_qwU(background$default, m7774constructorimpl, j, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), false, null, null, function0, 7, null), Dp.m7774constructorimpl(8), Dp.m7774constructorimpl(f));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                long sp = TextUnitKt.getSp(12);
                FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                FontWeight medium = FontWeight.INSTANCE.getMedium();
                if (!z) {
                    j2 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                } else {
                    j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                }
                TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j2, sp, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i3 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.DefaultBetAmountDialogFragmentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DefaultAmountOption$lambda$3;
                        DefaultAmountOption$lambda$3 = DefaultBetAmountDialogFragmentKt.DefaultAmountOption$lambda$3(Modifier.this, str, z, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return DefaultAmountOption$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!z) {
        }
        Brush brush22 = brush;
        float f2 = 10;
        Modifier background$default2 = BackgroundKt.background$default(companion, brush22, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2)), 0.0f, 4, null);
        float m7774constructorimpl2 = Dp.m7774constructorimpl(1);
        if (!z) {
        }
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BorderKt.m1036borderxT4_qwU(background$default2, m7774constructorimpl2, j, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2))), false, null, null, function0, 7, null), Dp.m7774constructorimpl(8), Dp.m7774constructorimpl(f2));
        Alignment center2 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
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
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        long sp2 = TextUnitKt.getSp(12);
        FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        FontWeight medium2 = FontWeight.INSTANCE.getMedium();
        if (!z) {
        }
        TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j2, sp2, medium2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i3 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v8 ??, still in use, count: 1, list:
          (r6v8 ?? I:java.lang.Object) from 0x0305: INVOKE (r15v5 ?? I:androidx.compose.runtime.Composer), (r6v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:590)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAmountField(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v8 ??, still in use, count: 1, list:
          (r6v8 ?? I:java.lang.Object) from 0x0305: INVOKE (r15v5 ?? I:androidx.compose.runtime.Composer), (r6v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:590)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r61v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue DefaultAmountField$lambda$11$lambda$5(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultAmountField$lambda$11$lambda$10$lambda$9(Function1 function1, long j, Function1 function12, MutableState mutableState, TextFieldValue input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String text = input.getText();
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char charAt = text.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() != 0) {
            Long longOrNull = StringsKt.toLongOrNull(sb2);
            if (longOrNull != null) {
                j = longOrNull.longValue();
            }
            String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(j);
            Intrinsics.checkNotNull(shopBetcoinsFormated);
            mutableState.setValue(new TextFieldValue(shopBetcoinsFormated, TextRangeKt.TextRange(shopBetcoinsFormated.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            function1.invoke(shopBetcoinsFormated);
            function12.invoke(Long.valueOf(j));
            return Unit.INSTANCE;
        }
        mutableState.setValue(new TextFieldValue("", TextRange.INSTANCE.m7242getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null));
        function1.invoke("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAmountPresetRow(final long j, final Function1<? super Long, Unit> function1, Composer composer, final int i) {
        int i2;
        String shopBetcoinsFormated;
        Composer startRestartGroup = composer.startRestartGroup(1292797492);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292797492, i3, -1, "org.betup.ui.dialogs.DefaultAmountPresetRow (DefaultBetAmountDialogFragment.kt:377)");
            }
            long j2 = MIN_DEFAULT_BET_AMOUNT;
            List listOf = CollectionsKt.listOf((Object[]) new Long[]{Long.valueOf(MIN_DEFAULT_BET_AMOUNT), 500L, 1000L, 5000L});
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            int i4 = 6;
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            startRestartGroup.startReplaceGroup(-1677814910);
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                final long longValue = ((Number) it.next()).longValue();
                startRestartGroup.startReplaceGroup(-1677813608);
                if (longValue == j2) {
                    shopBetcoinsFormated = StringResources_androidKt.stringResource(R.string.one_click_bet_quick_min, startRestartGroup, i4);
                } else {
                    shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(longValue);
                }
                startRestartGroup.endReplaceGroup();
                Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                Intrinsics.checkNotNull(shopBetcoinsFormated);
                boolean z = j == longValue;
                startRestartGroup.startReplaceGroup(-1633490746);
                boolean changed = ((i3 & 112) == 32) | startRestartGroup.changed(longValue);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.DefaultBetAmountDialogFragmentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit DefaultAmountPresetRow$lambda$15$lambda$14$lambda$13;
                            DefaultAmountPresetRow$lambda$15$lambda$14$lambda$13 = DefaultBetAmountDialogFragmentKt.DefaultAmountPresetRow$lambda$15$lambda$14$lambda$13(Function1.this, longValue);
                            return DefaultAmountPresetRow$lambda$15$lambda$14$lambda$13;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                DefaultAmountPresetButton(weight$default, shopBetcoinsFormated, z, (Function0) rememberedValue, startRestartGroup, 0, 0);
                i4 = 6;
                j2 = MIN_DEFAULT_BET_AMOUNT;
            }
            startRestartGroup.endReplaceGroup();
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.DefaultBetAmountDialogFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DefaultAmountPresetRow$lambda$16;
                    DefaultAmountPresetRow$lambda$16 = DefaultBetAmountDialogFragmentKt.DefaultAmountPresetRow$lambda$16(j, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DefaultAmountPresetRow$lambda$16;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultAmountPresetRow$lambda$15$lambda$14$lambda$13(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    private static final void DefaultAmountPresetButton(Modifier modifier, final String str, final boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier.Companion companion;
        Brush brush;
        long j;
        Composer startRestartGroup = composer.startRestartGroup(-259251949);
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
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-259251949, i3, -1, "org.betup.ui.dialogs.DefaultAmountPresetButton (DefaultBetAmountDialogFragment.kt:410)");
            }
            if (z) {
                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
            } else {
                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGray.INSTANCE.getBrush();
            }
            Brush brush2 = brush;
            if (z) {
                j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
            } else {
                j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
            }
            long j2 = j;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BackgroundKt.background$default(companion, brush2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)), 0.0f, 4, null), false, null, null, function0, 7, null), Dp.m7774constructorimpl(4), Dp.m7774constructorimpl(6));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            TextKt.m2642Text4IGK_g(str, SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(28), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j2, TextUnitKt.getSp(9), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, ((i3 >> 3) & 14) | 48, 3072, 56828);
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
            companion = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = companion;
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.DefaultBetAmountDialogFragmentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DefaultAmountPresetButton$lambda$18;
                    DefaultAmountPresetButton$lambda$18 = DefaultBetAmountDialogFragmentKt.DefaultAmountPresetButton$lambda$18(Modifier.this, str, z, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DefaultAmountPresetButton$lambda$18;
                }
            });
        }
    }
}
