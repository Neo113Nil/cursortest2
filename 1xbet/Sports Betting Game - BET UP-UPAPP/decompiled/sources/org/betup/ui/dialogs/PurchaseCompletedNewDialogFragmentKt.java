package org.betup.ui.dialogs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: PurchaseCompletedNewDialogFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\f\u001a!\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\f\u001a9\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006&²\u0006\f\u0010'\u001a\u0004\u0018\u00010(X\u008a\u0084\u0002"}, d2 = {"purchaseCompletedPaddingTop", "Landroidx/compose/ui/unit/Dp;", "F", "PurchaseCompletedContent", "", "model", "Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;", "onDismiss", "Lkotlin/Function0;", "onContinueClick", "(Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PurchaseCompletedBody", "(Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;Landroidx/compose/runtime/Composer;I)V", "PurchaseCompletedHeroImage", UnifiedMediationParams.KEY_ICON_URL, "", "availableWidth", "PurchaseCompletedHeroImage-ziNgDLE", "(Ljava/lang/String;FLandroidx/compose/runtime/Composer;I)V", "PurchaseDailyPackageDetails", "amountFontSize", "Landroidx/compose/ui/unit/TextUnit;", "iconSize", "PurchaseDailyPackageDetails-pezOeNo", "(Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;JFLandroidx/compose/runtime/Composer;I)V", "PurchaseInstantDetails", "receivedLabel", "PurchaseInstantDetails-h0ugEGk", "(Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;JFLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "PurchaseEffectDetails", "PurchaseCoinAmountRow", "label", "amount", "", "prefixPlus", "", "PurchaseCoinAmountRow-xjFF-98", "(Ljava/lang/String;JJFZLandroidx/compose/runtime/Composer;I)V", "app_release", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchaseCompletedNewDialogFragmentKt {
    private static final float purchaseCompletedPaddingTop = Dp.m7774constructorimpl(100);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseCoinAmountRow_xjFF_98$lambda$14(String str, long j, long j2, float f, boolean z, int i, Composer composer, int i2) {
        m13086PurchaseCoinAmountRowxjFF98(str, j, j2, f, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseCompletedBody$lambda$4(PurchaseCompletedUiModel purchaseCompletedUiModel, int i, Composer composer, int i2) {
        PurchaseCompletedBody(purchaseCompletedUiModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseCompletedContent$lambda$3(PurchaseCompletedUiModel purchaseCompletedUiModel, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        PurchaseCompletedContent(purchaseCompletedUiModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseCompletedHeroImage_ziNgDLE$lambda$5(String str, float f, int i, Composer composer, int i2) {
        m13087PurchaseCompletedHeroImageziNgDLE(str, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseDailyPackageDetails_pezOeNo$lambda$7(PurchaseCompletedUiModel purchaseCompletedUiModel, long j, float f, int i, Composer composer, int i2) {
        m13088PurchaseDailyPackageDetailspezOeNo(purchaseCompletedUiModel, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseEffectDetails$lambda$11(PurchaseCompletedUiModel purchaseCompletedUiModel, int i, Composer composer, int i2) {
        PurchaseEffectDetails(purchaseCompletedUiModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseInstantDetails_h0ugEGk$lambda$9(PurchaseCompletedUiModel purchaseCompletedUiModel, long j, float f, String str, int i, int i2, Composer composer, int i3) {
        m13089PurchaseInstantDetailsh0ugEGk(purchaseCompletedUiModel, j, f, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PurchaseCompletedContent(final PurchaseCompletedUiModel model, final Function0<Unit> onDismiss, final Function0<Unit> onContinueClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Composer startRestartGroup = composer.startRestartGroup(-1212939783);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(model) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(onContinueClick) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1212939783, i3, -1, "org.betup.ui.dialogs.PurchaseCompletedContent (PurchaseCompletedNewDialogFragment.kt:134)");
            }
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m8308boximpl(LottieCompositionSpec.RawRes.m8309constructorimpl(R.raw.success_celebration)), null, null, null, null, null, startRestartGroup, 6, 62);
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            LottieAnimationKt.LottieAnimation(PurchaseCompletedContent$lambda$0(rememberLottieComposition), BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter()), false, false, null, 0.0f, 3, false, false, false, null, false, false, null, null, null, false, null, null, startRestartGroup, 1572864, 0, 524220);
            float f = 32;
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, 2, null), 0.0f, purchaseCompletedPaddingTop, 0.0f, Dp.m7774constructorimpl(63), 5, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, (i3 & 112) | 24576, 108);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(100)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$PurchaseCompletedNewDialogFragmentKt.INSTANCE.m13021getLambda$1198485427$app_release(), ComposableLambdaKt.rememberComposableLambda(-713848596, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$PurchaseCompletedContent$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-713848596, i4, -1, "org.betup.ui.dialogs.PurchaseCompletedContent.<anonymous>.<anonymous>.<anonymous> (PurchaseCompletedNewDialogFragment.kt:191)");
                    }
                    PurchaseCompletedNewDialogFragmentKt.PurchaseCompletedBody(PurchaseCompletedUiModel.this, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-229211765, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$PurchaseCompletedContent$1$1$2

                /* compiled from: PurchaseCompletedNewDialogFragment.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[PurchaseCompletedKind.values().length];
                        try {
                            iArr[PurchaseCompletedKind.DAILY_CLAIM.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    String stringResource;
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-229211765, i4, -1, "org.betup.ui.dialogs.PurchaseCompletedContent.<anonymous>.<anonymous>.<anonymous> (PurchaseCompletedNewDialogFragment.kt:174)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 0.0f, Dp.m7774constructorimpl(20), 5, null), 0.0f, 1, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    PurchaseCompletedUiModel purchaseCompletedUiModel = PurchaseCompletedUiModel.this;
                    Function0<Unit> function0 = onContinueClick;
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
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
                    Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (WhenMappings.$EnumSwitchMapping$0[purchaseCompletedUiModel.getKind().ordinal()] == 1) {
                        composer3.startReplaceGroup(-426591964);
                        stringResource = StringResources_androidKt.stringResource(R.string.got_it, composer3, 6);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-426589653);
                        stringResource = StringResources_androidKt.stringResource(R.string.start_betting, composer3, 6);
                        composer3.endReplaceGroup();
                    }
                    CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, stringResource, false, false, false, function0, false, true, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 100663296, 0, 0, 2096827);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), false, true, null, false, composer2, 224694, 192);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(65)), composer2, 6);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PurchaseCompletedContent$lambda$3;
                    PurchaseCompletedContent$lambda$3 = PurchaseCompletedNewDialogFragmentKt.PurchaseCompletedContent$lambda$3(PurchaseCompletedUiModel.this, onDismiss, onContinueClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PurchaseCompletedContent$lambda$3;
                }
            });
        }
    }

    private static final LottieComposition PurchaseCompletedContent$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PurchaseCompletedBody(final PurchaseCompletedUiModel purchaseCompletedUiModel, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1237663886);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(purchaseCompletedUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1237663886, i2, -1, "org.betup.ui.dialogs.PurchaseCompletedBody (PurchaseCompletedNewDialogFragment.kt:202)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(-1122911928, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$PurchaseCompletedBody$1

                /* compiled from: PurchaseCompletedNewDialogFragment.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[PurchaseCompletedKind.values().length];
                        try {
                            iArr[PurchaseCompletedKind.DAILY_CLAIM.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[PurchaseCompletedKind.DAILY_PACKAGE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[PurchaseCompletedKind.HYBRID.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[PurchaseCompletedKind.EFFECT.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[PurchaseCompletedKind.INSTANT.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x02f2  */
                /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i3) {
                    int i4;
                    String stringResource;
                    String str;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1122911928, i4, -1, "org.betup.ui.dialogs.PurchaseCompletedBody.<anonymous> (PurchaseCompletedNewDialogFragment.kt:209)");
                    }
                    float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
                    float f = 0.08f * mo1423getMaxWidthD9Ej5fM;
                    float m7788unboximpl = ((Dp) RangesKt.coerceIn(Dp.m7772boximpl(Dp.m7774constructorimpl(f)), Dp.m7772boximpl(Dp.m7774constructorimpl(20)), Dp.m7772boximpl(Dp.m7774constructorimpl(32)))).m7788unboximpl();
                    long sp = TextUnitKt.getSp(RangesKt.coerceIn(f, 18.0f, 32.0f));
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(10));
                    PurchaseCompletedUiModel purchaseCompletedUiModel2 = PurchaseCompletedUiModel.this;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl = Updater.m4610constructorimpl(composer2);
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
                    if (WhenMappings.$EnumSwitchMapping$0[purchaseCompletedUiModel2.getKind().ordinal()] == 1) {
                        composer2.startReplaceGroup(887516151);
                        stringResource = StringResources_androidKt.stringResource(R.string.shop_daily_claim_congratulations, composer2, 6);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(887518899);
                        stringResource = StringResources_androidKt.stringResource(R.string.congratulations_for_purchase, composer2, 6);
                        composer2.endReplaceGroup();
                    }
                    TextKt.m3621Text4IGK_g(stringResource, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 130512);
                    composer2.startReplaceGroup(887530402);
                    if (StringsKt.isBlank(purchaseCompletedUiModel2.getItemTitle())) {
                        str = null;
                    } else {
                        str = null;
                        TextKt.m3621Text4IGK_g(purchaseCompletedUiModel2.getItemTitle(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 3120, 120272);
                    }
                    composer2.endReplaceGroup();
                    PurchaseCompletedNewDialogFragmentKt.m13087PurchaseCompletedHeroImageziNgDLE(purchaseCompletedUiModel2.getItemIconUrl(), mo1423getMaxWidthD9Ej5fM, composer2, 0);
                    int i5 = WhenMappings.$EnumSwitchMapping$0[purchaseCompletedUiModel2.getKind().ordinal()];
                    if (i5 != 1) {
                        if (i5 == 2 || i5 == 3) {
                            composer2.startReplaceGroup(887555134);
                            PurchaseCompletedNewDialogFragmentKt.m13088PurchaseDailyPackageDetailspezOeNo(purchaseCompletedUiModel2, sp, m7788unboximpl, composer2, 0);
                            composer2.endReplaceGroup();
                        } else if (i5 == 4) {
                            composer2.startReplaceGroup(887560386);
                            PurchaseCompletedNewDialogFragmentKt.PurchaseEffectDetails(purchaseCompletedUiModel2, composer2, 0);
                            composer2.endReplaceGroup();
                        } else if (i5 != 5) {
                            composer2.startReplaceGroup(887551512);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            return;
                        }
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    composer2.startReplaceGroup(887565727);
                    composer2.startReplaceGroup(887571567);
                    String stringResource2 = purchaseCompletedUiModel2.getKind() == PurchaseCompletedKind.DAILY_CLAIM ? StringResources_androidKt.stringResource(R.string.shop_daily_claim_received, composer2, 6) : str;
                    composer2.endReplaceGroup();
                    PurchaseCompletedNewDialogFragmentKt.m13089PurchaseInstantDetailsh0ugEGk(purchaseCompletedUiModel2, sp, m7788unboximpl, stringResource2, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PurchaseCompletedBody$lambda$4;
                    PurchaseCompletedBody$lambda$4 = PurchaseCompletedNewDialogFragmentKt.PurchaseCompletedBody$lambda$4(PurchaseCompletedUiModel.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PurchaseCompletedBody$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PurchaseCompletedHeroImage-ziNgDLE, reason: not valid java name */
    public static final void m13087PurchaseCompletedHeroImageziNgDLE(final String str, final float f, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-670181789);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-670181789, i2, -1, "org.betup.ui.dialogs.PurchaseCompletedHeroImage (PurchaseCompletedNewDialogFragment.kt:280)");
            }
            Modifier m1551heightInVpY3zN4$default = SizeKt.m1551heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(0.55f * f), 1, null);
            String str2 = str;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                startRestartGroup.startReplaceGroup(1917554288);
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str, null, SizeKt.m1550heightInVpY3zN4(m1551heightInVpY3zN4$default, Dp.m7774constructorimpl(72), Dp.m7774constructorimpl(Opcodes.F2L)), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, FilterQuality.INSTANCE.m5267getHighfv9h1I(), false, startRestartGroup, (i2 & 14) | 1572912, 0, 1464);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(1917828762);
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(Integer.valueOf(R.drawable.purchase_completed_img), null, m1551heightInVpY3zN4$default, null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, FilterQuality.INSTANCE.m5267getHighfv9h1I(), false, composer2, 1572918, 0, 1464);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PurchaseCompletedHeroImage_ziNgDLE$lambda$5;
                    PurchaseCompletedHeroImage_ziNgDLE$lambda$5 = PurchaseCompletedNewDialogFragmentKt.PurchaseCompletedHeroImage_ziNgDLE$lambda$5(str, f, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PurchaseCompletedHeroImage_ziNgDLE$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PurchaseDailyPackageDetails-pezOeNo, reason: not valid java name */
    public static final void m13088PurchaseDailyPackageDetailspezOeNo(final PurchaseCompletedUiModel purchaseCompletedUiModel, final long j, final float f, Composer composer, final int i) {
        int i2;
        int i3;
        String stringResource;
        Composer startRestartGroup = composer.startRestartGroup(-690713217);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(purchaseCompletedUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-690713217, i2, -1, "org.betup.ui.dialogs.PurchaseDailyPackageDetails (PurchaseCompletedNewDialogFragment.kt:308)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
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
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.shop_purchase_package_active, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3120, 0, 130544);
            startRestartGroup.startReplaceGroup(1435722979);
            if (purchaseCompletedUiModel.getInstantAmount() > 0) {
                int i4 = i2 << 3;
                m13086PurchaseCoinAmountRowxjFF98(StringResources_androidKt.stringResource(R.string.shop_purchase_received_now, startRestartGroup, 6), purchaseCompletedUiModel.getInstantAmount(), j, f, true, startRestartGroup, (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24576 | (i4 & 7168));
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1435734503);
            if (purchaseCompletedUiModel.getDailyCoins() > 0) {
                Integer packageDays = purchaseCompletedUiModel.getPackageDays();
                if (packageDays == null) {
                    startRestartGroup.startReplaceGroup(1435737726);
                    stringResource = StringResources_androidKt.stringResource(R.string.shop_purchase_daily_unlimited, new Object[]{FormatHelper.getShopBetcoinsFormated(purchaseCompletedUiModel.getDailyCoins())}, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1435743958);
                    stringResource = StringResources_androidKt.stringResource(R.string.shop_purchase_daily_per_day, new Object[]{FormatHelper.getShopBetcoinsFormated(purchaseCompletedUiModel.getDailyCoins()), packageDays}, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                }
                String str = stringResource;
                long j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                long sp = TextUnitKt.getSp(14);
                FontWeight semiBold = FontWeight.INSTANCE.getSemiBold();
                int m7658getCentere0LSkKk = TextAlign.INSTANCE.m7658getCentere0LSkKk();
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                TextAlign m7651boximpl = TextAlign.m7651boximpl(m7658getCentere0LSkKk);
                i3 = 1;
                TextKt.m3621Text4IGK_g(str, fillMaxWidth$default2, j2, sp, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, m7651boximpl, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 130512);
            } else {
                i3 = 1;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1435761746);
            if (purchaseCompletedUiModel.getTotalPackageValue() > 0 && (purchaseCompletedUiModel.getKind() == PurchaseCompletedKind.DAILY_PACKAGE || purchaseCompletedUiModel.getBonusAmount() > 0)) {
                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.shop_purchase_total_value, new Object[]{FormatHelper.getShopBetcoinsFormated(purchaseCompletedUiModel.getTotalPackageValue())}, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3120, 0, 130544);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1435780338);
            if (purchaseCompletedUiModel.getBonusAmount() > 0) {
                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.shop_purchase_bonus_extra, new Object[]{FormatHelper.getShopBetcoinsFormated(purchaseCompletedUiModel.getBonusAmount())}, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 130512);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PurchaseDailyPackageDetails_pezOeNo$lambda$7;
                    PurchaseDailyPackageDetails_pezOeNo$lambda$7 = PurchaseCompletedNewDialogFragmentKt.PurchaseDailyPackageDetails_pezOeNo$lambda$7(PurchaseCompletedUiModel.this, j, f, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PurchaseDailyPackageDetails_pezOeNo$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004e  */
    /* renamed from: PurchaseInstantDetails-h0ugEGk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13089PurchaseInstantDetailsh0ugEGk(final PurchaseCompletedUiModel purchaseCompletedUiModel, final long j, final float f, String str, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        String str2;
        long instantAmount;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1259625016);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(purchaseCompletedUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(f) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    String str3 = i4 != 0 ? null : str2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1259625016, i3, -1, "org.betup.ui.dialogs.PurchaseInstantDetails (PurchaseCompletedNewDialogFragment.kt:391)");
                    }
                    instantAmount = purchaseCompletedUiModel.getInstantAmount() + purchaseCompletedUiModel.getBonusAmount();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
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
                    if (instantAmount <= 0) {
                        instantAmount = purchaseCompletedUiModel.getInstantAmount();
                    }
                    int i5 = ((i3 >> 9) & 14) | 24576;
                    int i6 = i3 << 3;
                    m13086PurchaseCoinAmountRowxjFF98(str3, instantAmount, j, f, true, startRestartGroup, i5 | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168));
                    startRestartGroup.startReplaceGroup(1335109162);
                    if (purchaseCompletedUiModel.getBonusAmount() > 0 && purchaseCompletedUiModel.getInstantAmount() > 0) {
                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.shop_purchase_bonus_extra, new Object[]{FormatHelper.getShopBetcoinsFormated(purchaseCompletedUiModel.getBonusAmount())}, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3120, 0, 130544);
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
                    str2 = str3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final String str4 = str2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PurchaseInstantDetails_h0ugEGk$lambda$9;
                            PurchaseInstantDetails_h0ugEGk$lambda$9 = PurchaseCompletedNewDialogFragmentKt.PurchaseInstantDetails_h0ugEGk$lambda$9(PurchaseCompletedUiModel.this, j, f, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return PurchaseInstantDetails_h0ugEGk$lambda$9;
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if ((i3 & 1171) == 1170) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            instantAmount = purchaseCompletedUiModel.getInstantAmount() + purchaseCompletedUiModel.getBonusAmount();
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, centerHorizontally2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
            if (instantAmount <= 0) {
            }
            int i52 = ((i3 >> 9) & 14) | 24576;
            int i62 = i3 << 3;
            m13086PurchaseCoinAmountRowxjFF98(str3, instantAmount, j, f, true, startRestartGroup, i52 | (i62 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i62 & 7168));
            startRestartGroup.startReplaceGroup(1335109162);
            if (purchaseCompletedUiModel.getBonusAmount() > 0) {
                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.shop_purchase_bonus_extra, new Object[]{FormatHelper.getShopBetcoinsFormated(purchaseCompletedUiModel.getBonusAmount())}, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3120, 0, 130544);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            str2 = str3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        instantAmount = purchaseCompletedUiModel.getInstantAmount() + purchaseCompletedUiModel.getBonusAmount();
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422, centerHorizontally22, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
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
        if (instantAmount <= 0) {
        }
        int i522 = ((i3 >> 9) & 14) | 24576;
        int i622 = i3 << 3;
        m13086PurchaseCoinAmountRowxjFF98(str3, instantAmount, j, f, true, startRestartGroup, i522 | (i622 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i622 & 7168));
        startRestartGroup.startReplaceGroup(1335109162);
        if (purchaseCompletedUiModel.getBonusAmount() > 0) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        str2 = str3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PurchaseEffectDetails(final PurchaseCompletedUiModel purchaseCompletedUiModel, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1564212054);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(purchaseCompletedUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1564212054, i2, -1, "org.betup.ui.dialogs.PurchaseEffectDetails (PurchaseCompletedNewDialogFragment.kt:421)");
            }
            String effectDescription = purchaseCompletedUiModel.getEffectDescription();
            if (effectDescription == null) {
                effectDescription = "";
            }
            String str = effectDescription;
            if (StringsKt.isBlank(str)) {
                str = purchaseCompletedUiModel.getItemTitle();
            }
            composer2 = startRestartGroup;
            TextKt.m3621Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PurchaseEffectDetails$lambda$11;
                    PurchaseEffectDetails$lambda$11 = PurchaseCompletedNewDialogFragmentKt.PurchaseEffectDetails$lambda$11(PurchaseCompletedUiModel.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PurchaseEffectDetails$lambda$11;
                }
            });
        }
    }

    /* renamed from: PurchaseCoinAmountRow-xjFF-98, reason: not valid java name */
    private static final void m13086PurchaseCoinAmountRowxjFF98(final String str, final long j, final long j2, final float f, final boolean z, Composer composer, final int i) {
        int i2;
        float f2;
        String str2;
        int i3;
        Composer composer2;
        String str3;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(-1927940193);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i4 = i2;
        if ((i4 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1927940193, i4, -1, "org.betup.ui.dialogs.PurchaseCoinAmountRow (PurchaseCompletedNewDialogFragment.kt:438)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            float f3 = 4;
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f3));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
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
            startRestartGroup.startReplaceGroup(-2084178204);
            String str4 = str;
            if (str4 == null || StringsKt.isBlank(str4)) {
                f2 = f3;
                str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                i3 = i4;
                composer2 = startRestartGroup;
                str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            } else {
                f2 = f3;
                i3 = i4;
                composer2 = startRestartGroup;
                str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                TextKt.m3621Text4IGK_g(str, (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i4 & 14) | 3072, 0, 130546);
            }
            composer2.endReplaceGroup();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Composer composer4 = composer2;
            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str2);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str3);
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor2);
            } else {
                composer4.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(j);
            if (z) {
                shopBetcoinsFormated = "+" + shopBetcoinsFormated;
            }
            Intrinsics.checkNotNull(shopBetcoinsFormated);
            composer3 = composer4;
            TextKt.m3621Text4IGK_g(shopBetcoinsFormated, SizeKt.m1570widthInVpY3zN4$default(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 0.0f, Dp.m7774constructorimpl(280), 1, null), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), j2, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ((i3 << 3) & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 120272);
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer3, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
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
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PurchaseCoinAmountRow_xjFF_98$lambda$14;
                    PurchaseCoinAmountRow_xjFF_98$lambda$14 = PurchaseCompletedNewDialogFragmentKt.PurchaseCoinAmountRow_xjFF_98$lambda$14(str, j, j2, f, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PurchaseCoinAmountRow_xjFF_98$lambda$14;
                }
            });
        }
    }
}
