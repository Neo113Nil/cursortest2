package org.betup.ui.dialogs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.SwitchDefaults;
import androidx.compose.material.SwitchKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import com.explorestack.protobuf.openrtb.LossReason;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.common.compose.slider.CustomBorderSliderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;
import org.betup.utils.UiExtensionsKt;

/* compiled from: OneClickBetSettingsDialogFragment.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\u001a±\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0003¢\u0006\u0002\u0010\u0017\u001a[\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0013H\u0003¢\u0006\u0002\u0010\u001b\u001aE\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0003¢\u0006\u0002\u0010\"\u001a=\u0010#\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00132\b\b\u0002\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u008e\u0002"}, d2 = {"SNACK_DETAIL_MS", "", "OneClickBetSettingsContent", "", "unlocked", "", "unlocking", "unlockCost", "headerTitleOverride", "", "presetStake1", "presetStake2", "enabled", "amount", "maxSlider", "minStake", "onUnlock", "Lkotlin/Function0;", "onEnabledChange", "Lkotlin/Function1;", "onAmountChange", "onDismiss", "onSave", "(ZZJLjava/lang/String;JJZJJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OneClickStakeSliderWithPresets", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;JJJJJZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "OneClickPresetButton", "text", "isSelected", "isNumericLabel", "isButtonEnabled", "onClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OneClickSheetStyleAmountField", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "app_release", "textState", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneClickBetSettingsDialogFragmentKt {
    private static final long SNACK_DETAIL_MS = 5500;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneClickBetSettingsContent$lambda$2(boolean z, boolean z2, long j, String str, long j2, long j3, boolean z3, long j4, long j5, long j6, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, int i, int i2, Composer composer, int i3) {
        OneClickBetSettingsContent(z, z2, j, str, j2, j3, z3, j4, j5, j6, function0, function1, function12, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneClickPresetButton$lambda$12(Modifier modifier, String str, boolean z, boolean z2, boolean z3, Function0 function0, int i, int i2, Composer composer, int i3) {
        OneClickPresetButton(modifier, str, z, z2, z3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneClickSheetStyleAmountField$lambda$21(Modifier modifier, long j, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        OneClickSheetStyleAmountField(modifier, j, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneClickStakeSliderWithPresets$lambda$10(Modifier modifier, long j, long j2, long j3, long j4, long j5, boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        OneClickStakeSliderWithPresets(modifier, j, j2, j3, j4, j5, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OneClickBetSettingsContent(final boolean z, final boolean z2, final long j, final String str, final long j2, final long j3, final boolean z3, final long j4, final long j5, final long j6, final Function0<Unit> function0, final Function1<? super Boolean, Unit> function1, final Function1<? super Long, Unit> function12, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(163503827);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i & 24576) == 0) {
            i5 |= startRestartGroup.changed(j2) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= startRestartGroup.changed(j3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= startRestartGroup.changed(j4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= startRestartGroup.changed(j5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= startRestartGroup.changed(j6) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i6 = i5;
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((306783379 & i6) != 306783378 || (i4 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(163503827, i6, i4, "org.betup.ui.dialogs.OneClickBetSettingsContent (OneClickBetSettingsDialogFragment.kt:376)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
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
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(32));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), function02, null, null, false, false, false, startRestartGroup, ((i4 >> 6) & 112) | 24576, 108);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(28)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TicketDarkKt.TicketDark(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(1098276863, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$OneClickBetSettingsContent$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1098276863, i7, -1, "org.betup.ui.dialogs.OneClickBetSettingsContent.<anonymous>.<anonymous>.<anonymous> (OneClickBetSettingsDialogFragment.kt:398)");
                    }
                    String str2 = str;
                    composer3.startReplaceGroup(-1117887198);
                    if (str2 == null) {
                        str2 = StringResources_androidKt.stringResource(R.string.one_click_bet_title, composer3, 6);
                    }
                    composer3.endReplaceGroup();
                    QuickBetHeaderKt.QuickBetHeader(null, str2, null, null, false, false, false, false, composer3, 0, 253);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(639641344, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$OneClickBetSettingsContent$1$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    boolean z4;
                    long j7;
                    Function1<Long, Unit> function13;
                    String str2;
                    boolean z5;
                    long j8;
                    long j9;
                    String str3;
                    long j10;
                    Composer composer4 = composer3;
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(639641344, i7, -1, "org.betup.ui.dialogs.OneClickBetSettingsContent.<anonymous>.<anonymous>.<anonymous> (OneClickBetSettingsDialogFragment.kt:420)");
                    }
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(26), Dp.m7774constructorimpl(22));
                    boolean z6 = z;
                    long j11 = j;
                    long j12 = j4;
                    long j13 = j6;
                    long j14 = j5;
                    long j15 = j2;
                    long j16 = j3;
                    Function1<Long, Unit> function14 = function12;
                    boolean z7 = z3;
                    Function1<Boolean, Unit> function15 = function1;
                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN42);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer4.startReplaceGroup(-234572466);
                    int i8 = 6;
                    if (z6) {
                        z4 = z7;
                        j7 = j13;
                        function13 = function14;
                        str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        z5 = z6;
                        j8 = j15;
                        j9 = j16;
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        j10 = j14;
                    } else {
                        z4 = z7;
                        j7 = j13;
                        function13 = function14;
                        z5 = z6;
                        str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        j8 = j15;
                        j9 = j16;
                        j10 = j14;
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.one_click_bet_unlock_message, new Object[]{Long.valueOf(j11)}, composer4, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        composer4 = composer3;
                        i8 = 6;
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), composer4, 6);
                    }
                    composer3.endReplaceGroup();
                    Composer composer5 = composer4;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.one_click_bet_subtitle, composer4, i8), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i8), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14)), composer5, 6);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                    String str4 = str3;
                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str4);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    String str5 = str2;
                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str5);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer5.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    TextKt.m2642Text4IGK_g(UiExtensionsKt.capitalizeFirstCharOnly(StringResources_androidKt.stringResource(R.string.one_click_bet_enable, composer5, 6)), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), z5 ? 1.0f : 0.45f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, 65532);
                    if (!z5) {
                        z4 = false;
                    }
                    SwitchKt.Switch(z4, function15, null, z5, null, SwitchDefaults.INSTANCE.m2593colorsSQMK_m0(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.0f, Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), composer3, 0, SwitchDefaults.$stable, 36), composer3, 0, 20);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer5, 6);
                    OneClickBetSettingsDialogFragmentKt.OneClickStakeSliderWithPresets(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(2), 0.0f, 2, null), RangesKt.coerceIn(j12, j7, j10), j7, j10, j8, j9, z5, function13, composer3, 6, 0);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), composer5, 6);
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composer5, 54);
                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str4);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str5);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer5.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(UiExtensionsKt.capitalizeFirstCharOnly(StringResources_androidKt.stringResource(R.string.amount, composer5, 6)), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), z5 ? 1.0f : 0.45f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    OneClickBetSettingsDialogFragmentKt.OneClickSheetStyleAmountField(SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(128), 1, null), j12, function13, z5, composer3, 6, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(181005825, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$OneClickBetSettingsContent$1$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    String stringResource;
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(181005825, i7, -1, "org.betup.ui.dialogs.OneClickBetSettingsContent.<anonymous>.<anonymous>.<anonymous> (OneClickBetSettingsDialogFragment.kt:404)");
                    }
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(20), Dp.m7774constructorimpl(16));
                    if (z) {
                        composer3.startReplaceGroup(-2134145090);
                        stringResource = StringResources_androidKt.stringResource(R.string.one_click_bet_save, composer3, 6);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-2134040744);
                        stringResource = StringResources_androidKt.stringResource(R.string.one_click_bet_unlock_cta, composer3, 6);
                        composer3.endReplaceGroup();
                    }
                    String str2 = stringResource;
                    Function0<Unit> function04 = z ? function03 : function0;
                    boolean z4 = z2;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(m1517paddingVpY3zN42, false, str2, false, false, !z4, function04, false, false, false, z4, false, null, null, false, false, null, null, null, null, null, composer3, 805306374, 0, 0, 2095514);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), false, true, null, false, composer2, 200118, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OneClickBetSettingsContent$lambda$2;
                    OneClickBetSettingsContent$lambda$2 = OneClickBetSettingsDialogFragmentKt.OneClickBetSettingsContent$lambda$2(z, z2, j, str, j2, j3, z3, j4, j5, j6, function0, function1, function12, function02, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OneClickBetSettingsContent$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneClickStakeSliderWithPresets(Modifier modifier, final long j, final long j2, final long j3, final long j4, final long j5, final boolean z, final Function1<? super Long, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        long min;
        long coerceIn;
        int currentCompositeKeyHash;
        Modifier modifier3;
        Composer m4610constructorimpl;
        int i5;
        boolean changed;
        Object rememberedValue;
        final long j6;
        Modifier modifier4;
        int i6;
        Composer composer2;
        long j7;
        int i7;
        int i8;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Modifier modifier5;
        boolean z2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1402353116);
        int i9 = i2 & 1;
        if (i9 != 0) {
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
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(j3) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(j4) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changed(j5) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changed(z) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
            }
            i4 = i3;
            if ((4793491 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                Modifier modifier6 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1402353116, i4, -1, "org.betup.ui.dialogs.OneClickStakeSliderWithPresets (OneClickBetSettingsDialogFragment.kt:537)");
                }
                min = Math.min(j2, j3);
                long max = Math.max(j2, j3);
                final long coerceAtLeast = RangesKt.coerceAtLeast(max - min, 0L);
                long coerceIn2 = RangesKt.coerceIn(j, min, max);
                coerceIn = RangesKt.coerceIn(j4, min, max);
                long coerceIn3 = RangesKt.coerceIn(j5, min, max);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier6);
                modifier3 = modifier6;
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
                int i10 = (int) (coerceIn2 - min);
                int i11 = (int) coerceAtLeast;
                int i12 = (int) min;
                int coerceAtLeast2 = RangesKt.coerceAtLeast(100, 1);
                startRestartGroup.startReplaceGroup(-1224400529);
                i5 = i4 & 29360128;
                changed = startRestartGroup.changed(coerceAtLeast) | (i5 != 8388608) | startRestartGroup.changed(min);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    j6 = min;
                    modifier4 = modifier3;
                    final int i13 = 100;
                    i6 = i4;
                    composer2 = startRestartGroup;
                    j7 = coerceIn;
                    i7 = i5;
                    i8 = -1323940314;
                    Function1 function12 = new Function1() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3;
                            OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3 = OneClickBetSettingsDialogFragmentKt.OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3(i13, coerceAtLeast, function1, j6, ((Integer) obj).intValue());
                            return OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3;
                        }
                    };
                    composer2.updateRememberedValue(function12);
                    rememberedValue = function12;
                } else {
                    j7 = coerceIn;
                    j6 = min;
                    composer2 = startRestartGroup;
                    i7 = i5;
                    modifier4 = modifier3;
                    i6 = i4;
                    i8 = -1323940314;
                }
                composer2.endReplaceGroup();
                CustomBorderSliderKt.CustomBorderSlider(null, i10, i11, i12, coerceAtLeast2, z, (Function1) rememberedValue, composer2, (i6 >> 3) & 458752, 1);
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(14), 0.0f, 0.0f, 13, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, i8, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                List<Pair> listOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Long.valueOf(j6), StringResources_androidKt.stringResource(R.string.one_click_bet_quick_min, composer2, 6)), TuplesKt.to(Long.valueOf(j7), FormatHelper.getShopBetcoinsFormated(j7)), TuplesKt.to(Long.valueOf(coerceIn3), FormatHelper.getShopBetcoinsFormated(coerceIn3)), TuplesKt.to(Long.valueOf(max), StringResources_androidKt.stringResource(R.string.one_click_bet_quick_max, composer2, 6))});
                composer2.startReplaceGroup(-265075675);
                for (Pair pair : listOf) {
                    final long longValue = ((Number) pair.component1()).longValue();
                    String str = (String) pair.component2();
                    boolean z3 = j == longValue;
                    String str2 = str;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= str2.length()) {
                            z2 = false;
                            break;
                        } else {
                            if (Character.isDigit(str2.charAt(i14))) {
                                z2 = true;
                                break;
                            }
                            i14++;
                        }
                    }
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, z2 ? 1.2f : 0.8f, false, 2, null);
                    composer2.startReplaceGroup(-1633490746);
                    int i15 = i7;
                    boolean changed2 = (i15 == 8388608) | composer2.changed(longValue);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit OneClickStakeSliderWithPresets$lambda$9$lambda$8$lambda$7$lambda$6;
                                OneClickStakeSliderWithPresets$lambda$9$lambda$8$lambda$7$lambda$6 = OneClickBetSettingsDialogFragmentKt.OneClickStakeSliderWithPresets$lambda$9$lambda$8$lambda$7$lambda$6(Function1.this, longValue);
                                return OneClickStakeSliderWithPresets$lambda$9$lambda$8$lambda$7$lambda$6;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    OneClickPresetButton(weight$default, str, z3, z2, z, (Function0) rememberedValue2, composer2, (i6 >> 6) & 57344, 0);
                    i7 = i15;
                }
                composer2.endReplaceGroup();
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
                modifier5 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit OneClickStakeSliderWithPresets$lambda$10;
                        OneClickStakeSliderWithPresets$lambda$10 = OneClickBetSettingsDialogFragmentKt.OneClickStakeSliderWithPresets$lambda$10(Modifier.this, j, j2, j3, j4, j5, z, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return OneClickStakeSliderWithPresets$lambda$10;
                    }
                });
                return;
            }
            return;
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i4 = i3;
        if ((4793491 & i4) == 4793490) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        min = Math.min(j2, j3);
        long max2 = Math.max(j2, j3);
        final long coerceAtLeast3 = RangesKt.coerceAtLeast(max2 - min, 0L);
        long coerceIn22 = RangesKt.coerceIn(j, min, max2);
        coerceIn = RangesKt.coerceIn(j4, min, max2);
        long coerceIn32 = RangesKt.coerceIn(j5, min, max2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier6);
        modifier3 = modifier6;
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
        int i102 = (int) (coerceIn22 - min);
        int i112 = (int) coerceAtLeast3;
        int i122 = (int) min;
        int coerceAtLeast22 = RangesKt.coerceAtLeast(100, 1);
        startRestartGroup.startReplaceGroup(-1224400529);
        i5 = i4 & 29360128;
        changed = startRestartGroup.changed(coerceAtLeast3) | (i5 != 8388608) | startRestartGroup.changed(min);
        rememberedValue = startRestartGroup.rememberedValue();
        if (changed) {
        }
        j6 = min;
        modifier4 = modifier3;
        final int i132 = 100;
        i6 = i4;
        composer2 = startRestartGroup;
        j7 = coerceIn;
        i7 = i5;
        i8 = -1323940314;
        Function1 function122 = new Function1() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3;
                OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3 = OneClickBetSettingsDialogFragmentKt.OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3(i132, coerceAtLeast3, function1, j6, ((Integer) obj).intValue());
                return OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3;
            }
        };
        composer2.updateRememberedValue(function122);
        rememberedValue = function122;
        composer2.endReplaceGroup();
        CustomBorderSliderKt.CustomBorderSlider(null, i102, i112, i122, coerceAtLeast22, z, (Function1) rememberedValue, composer2, (i6 >> 3) & 458752, 1);
        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(14), 0.0f, 0.0f, 13, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
        ComposerKt.sourceInformationMarkerStart(composer2, i8, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        List<Pair> listOf2 = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Long.valueOf(j6), StringResources_androidKt.stringResource(R.string.one_click_bet_quick_min, composer2, 6)), TuplesKt.to(Long.valueOf(j7), FormatHelper.getShopBetcoinsFormated(j7)), TuplesKt.to(Long.valueOf(coerceIn32), FormatHelper.getShopBetcoinsFormated(coerceIn32)), TuplesKt.to(Long.valueOf(max2), StringResources_androidKt.stringResource(R.string.one_click_bet_quick_max, composer2, 6))});
        composer2.startReplaceGroup(-265075675);
        while (r1.hasNext()) {
        }
        composer2.endReplaceGroup();
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
        modifier5 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneClickStakeSliderWithPresets$lambda$9$lambda$4$lambda$3(int i, long j, Function1 function1, long j2, int i2) {
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 1);
        function1.invoke(Long.valueOf(RangesKt.coerceIn((i2 / coerceAtLeast) * coerceAtLeast, 0, (int) j) + j2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneClickStakeSliderWithPresets$lambda$9$lambda$8$lambda$7$lambda$6(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    private static final void OneClickPresetButton(Modifier modifier, final String str, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier.Companion companion;
        Brush brush;
        long j;
        Composer startRestartGroup = composer.startRestartGroup(-71281458);
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
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        int i5 = i3;
        if ((74899 & i5) != 74898 || !startRestartGroup.getSkipping()) {
            companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-71281458, i5, -1, "org.betup.ui.dialogs.OneClickPresetButton (OneClickBetSettingsDialogFragment.kt:595)");
            }
            if (!z3) {
                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
            } else if (z) {
                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
            } else {
                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGray.INSTANCE.getBrush();
            }
            Brush brush2 = brush;
            if (!z) {
                j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
            } else if (z3) {
                j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
            } else {
                j = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
            }
            long j2 = j;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BackgroundKt.background$default(companion, brush2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)), 0.0f, 4, null), z3, null, null, function0, 6, null), Dp.m7774constructorimpl(z2 ? 4 : 8), Dp.m7774constructorimpl(6));
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
            TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j2, TextUnitKt.getSp(8), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i5 >> 3) & 14, 3120, 54782);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OneClickPresetButton$lambda$12;
                    OneClickPresetButton$lambda$12 = OneClickBetSettingsDialogFragmentKt.OneClickPresetButton$lambda$12(Modifier.this, str, z, z2, z3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OneClickPresetButton$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneClickSheetStyleAmountField(Modifier modifier, final long j, final Function1<? super Long, Unit> function1, boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Object rememberedValue;
        boolean z3;
        OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1 rememberedValue2;
        boolean z4;
        Object rememberedValue3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1015273665);
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
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z5 = i5 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1015273665, i3, -1, "org.betup.ui.dialogs.OneClickSheetStyleAmountField (OneClickBetSettingsDialogFragment.kt:639)");
                }
                float f = 8;
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(BorderKt.m1036borderxT4_qwU(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(companion, Dp.m7774constructorimpl(30)), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(5), 0.0f, Dp.m7774constructorimpl(3), 0.0f, 10, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
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
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = i3;
                final boolean z6 = z5;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(13)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                float f2 = 4;
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                    String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(j);
                    Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated, "getShopBetcoinsFormated(...)");
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(shopBetcoinsFormated, TextRangeKt.TextRange(FormatHelper.getShopBetcoinsFormated(j).length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                Long valueOf = Long.valueOf(j);
                startRestartGroup.startReplaceGroup(-1633490746);
                z3 = (i6 & 112) != 32;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1(j, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, (i6 >> 3) & 14);
                TextFieldValue OneClickSheetStyleAmountField$lambda$20$lambda$14 = OneClickSheetStyleAmountField$lambda$20$lambda$14(mutableState);
                boolean z7 = !z6;
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m7474getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
                SolidColor solidColor = new SolidColor(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), null);
                TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), Dp.m7774constructorimpl(2), 0.0f, Dp.m7774constructorimpl(f2), 0.0f, 10, null);
                startRestartGroup.startReplaceGroup(-1746271574);
                z4 = ((i6 & 7168) != 2048) | ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z4 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18;
                            OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18 = OneClickBetSettingsDialogFragmentKt.OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18(z6, function1, mutableState, (TextFieldValue) obj);
                            return OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                BasicTextFieldKt.BasicTextField(OneClickSheetStyleAmountField$lambda$20$lambda$14, (Function1<? super TextFieldValue, Unit>) rememberedValue3, m1520paddingqDBjuR0$default2, false, z7, textStyle, keyboardOptions, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, startRestartGroup, 102236160, 0, 48776);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z6;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                final boolean z8 = z2;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit OneClickSheetStyleAmountField$lambda$21;
                        OneClickSheetStyleAmountField$lambda$21 = OneClickBetSettingsDialogFragmentKt.OneClickSheetStyleAmountField$lambda$21(Modifier.this, j, function1, z8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return OneClickSheetStyleAmountField$lambda$21;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f3 = 8;
        Modifier m1520paddingqDBjuR0$default3 = PaddingKt.m1520paddingqDBjuR0$default(BorderKt.m1036borderxT4_qwU(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(companion, Dp.m7774constructorimpl(30)), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), Dp.m7774constructorimpl(5), 0.0f, Dp.m7774constructorimpl(3), 0.0f, 10, null);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default3);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        int i62 = i3;
        final boolean z62 = z5;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(13)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
        float f22 = 4;
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        Long valueOf2 = Long.valueOf(j);
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((i62 & 112) != 32) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue2 = new OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1(j, mutableState2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, (i62 >> 3) & 14);
        TextFieldValue OneClickSheetStyleAmountField$lambda$20$lambda$142 = OneClickSheetStyleAmountField$lambda$20$lambda$14(mutableState2);
        boolean z72 = !z62;
        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m7474getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
        SolidColor solidColor2 = new SolidColor(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), null);
        TextStyle textStyle2 = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
        Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), Dp.m7774constructorimpl(2), 0.0f, Dp.m7774constructorimpl(f22), 0.0f, 10, null);
        startRestartGroup.startReplaceGroup(-1746271574);
        z4 = ((i62 & 7168) != 2048) | ((i62 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18;
                OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18 = OneClickBetSettingsDialogFragmentKt.OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18(z62, function1, mutableState2, (TextFieldValue) obj);
                return OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        BasicTextFieldKt.BasicTextField(OneClickSheetStyleAmountField$lambda$20$lambda$142, (Function1<? super TextFieldValue, Unit>) rememberedValue3, m1520paddingqDBjuR0$default22, false, z72, textStyle2, keyboardOptions2, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, startRestartGroup, 102236160, 0, 48776);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z62;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue OneClickSheetStyleAmountField$lambda$20$lambda$14(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneClickSheetStyleAmountField$lambda$20$lambda$19$lambda$18(boolean z, Function1 function1, MutableState mutableState, TextFieldValue tfv) {
        Intrinsics.checkNotNullParameter(tfv, "tfv");
        if (!z) {
            return Unit.INSTANCE;
        }
        String text = tfv.getText();
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char charAt = text.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Long longOrNull = StringsKt.toLongOrNull(sb.toString());
        long longValue = longOrNull != null ? longOrNull.longValue() : 0L;
        String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(longValue);
        Intrinsics.checkNotNull(shopBetcoinsFormated);
        mutableState.setValue(new TextFieldValue(shopBetcoinsFormated, TextRangeKt.TextRange(shopBetcoinsFormated.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        function1.invoke(Long.valueOf(longValue));
        return Unit.INSTANCE;
    }
}
